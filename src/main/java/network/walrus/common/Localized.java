package network.walrus.common;

import java.util.Locale;

/**
 * An object which is locale aware.
 */
public interface Localized {

  /**
   * @return the locale of this object
   */
  Locale getLocale();
}
