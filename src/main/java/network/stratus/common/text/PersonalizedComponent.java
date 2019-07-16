package network.stratus.common.text;

import java.util.Locale;
import net.md_5.bungee.api.chat.BaseComponent;
import network.stratus.common.CommandSender;

/**
 * A component which can be rendered for a specific {@link CommandSender}.
 */
public interface PersonalizedComponent {

	/**
	 * Translate this component into a {@link BaseComponent} in the specified {@link Locale}.
	 *
	 * @param sender the person to render this component for
	 * @return the translated component
	 */
	BaseComponent render(CommandSender sender);
}