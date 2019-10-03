package network.walrus.common;

import network.walrus.common.text.PersonalizedComponent;

public interface CommandSender extends Localized, Named {

    /**
     * Sends a translatable component to this command source using its {@link #getLocale() locale}.
     *
     * @param translatable the translatable component
     */
    default void sendMessage(PersonalizedComponent translatable) {
        this.sendMessage(translatable.render(this));
    }

    /**
     * Sends the component to the sender
     *
     * <p>If this sender does not support sending full components then
     * the component will be sent as legacy text.</p>
     *
     * @param component the component to send
     */
    void sendMessage(net.md_5.bungee.api.chat.BaseComponent component);
}
