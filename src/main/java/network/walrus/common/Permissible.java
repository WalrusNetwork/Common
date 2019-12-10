package network.walrus.common;

import java.util.Collection;

/**
 * An object which has a set of permissions.
 */
public interface Permissible {
    /**
     * Checks if this user has the specified permission node.
     *
     * @param permission the node to check
     * @return whether they have this node
     */
    public boolean hasPermission(String permission);

    /**
     * Get all Permissions which this CommandSender has
     *
     * @return a unmodifiable Collection of Strings which represent their
     * permissions
     */
    public Collection<String> getPermissions();
}
