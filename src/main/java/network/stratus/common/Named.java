package network.stratus.common;

/**
 * Something which has a name and display name which can be different for specific viewers.
 */
public interface Named {
    /**
     * Return this sender's name as viewed by the given sender.
     */
    String getName(CommandSender viewer);

    /**
     * Set a fake name for this player when viewed by the given player.
     * If the name is null then the fake name is cleared.
     */
    void setFakeName(CommandSender viewer, String name);

    /**
     * Return this player's fake name for the given viewer,
     * or null if no fake name is set for that viewer
     */
    String getFakeName(CommandSender viewer);

    /**
     * Test if this player has a fake name set for the given viewer
     */
    boolean hasFakeName(CommandSender viewer);

    /**
     * Clear this player's fake names for all viewers
     */
    void clearFakeNames();

    /**
     * Set a fake display name for this player when viewed by the given player.
     * If the name is null then the fake name is cleared.
     */
    void setFakeDisplayName(CommandSender viewer, String name);

    /**
     * Return this player's fake display name for the given viewer,
     * or null if no fake name is set for that viewer
     */
    String getFakeDisplayName(CommandSender viewer);

    /**
     * Test if this player has a fake display name set for the given viewer
     */
    boolean hasFakeDisplayName(CommandSender viewer);

    /**
     * Clear this player's fake display names for all viewers
     */
    void clearFakeDisplayNames();

    /**
     * Return this player's list name as viewed by the given player, fake or not
     */
    String getPlayerListName(CommandSender viewer);

    /**
     * Return this player's display name as viewed by the given player, fake or not
     */
    String getDisplayName(CommandSender viewer);
}
