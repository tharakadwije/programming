package TestDome;

import java.util.*;

public class FriendNetwork{
    private Collection<FriendNetwork> friends;
    private String email;

    public FriendNetwork(String email) {
        this.email = email;
        this.friends = new ArrayList<FriendNetwork>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<FriendNetwork> getFriends() {
        return friends;
    }

    public void addFriendship(FriendNetwork friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    public boolean canBeConnected(FriendNetwork friend) {
        Queue<FriendNetwork> friendsQueue = new LinkedList();
        Set<FriendNetwork> duplicateCheck = new HashSet<>();
        friendsQueue.add(this);
        duplicateCheck.add(this);

        while (!friendsQueue.isEmpty()) {
            FriendNetwork friend1 = friendsQueue.poll();
            if (friend1.getFriends().contains(friend)) {
                return true;
            } else {
                friend1.getFriends().stream().forEach(e -> {
                    if (!duplicateCheck.contains(e)) {
                        friendsQueue.add(e);
                        duplicateCheck.add(e);
                    }
                });
            }
        }
        return false;
    }

    public static void main(String[] args) {
        FriendNetwork a = new FriendNetwork("A");
        FriendNetwork b = new FriendNetwork("B");
        FriendNetwork c = new FriendNetwork("C");

        a.addFriendship(b);
        b.addFriendship(c);

        System.out.println(a.canBeConnected(c));
    }
}