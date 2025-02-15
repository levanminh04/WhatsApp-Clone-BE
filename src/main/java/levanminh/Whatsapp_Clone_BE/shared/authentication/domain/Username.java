package levanminh.Whatsapp_Clone_BE.shared.authentication.domain;


import levanminh.Whatsapp_Clone_BE.shared.error.domain.Assert;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

public record Username(String username) {
  public Username {
    Assert.field("username", username).notBlank().maxLength(100);
  }

  public String get() {
    return username();
  }

  public static Optional<Username> of(String username) {
    return Optional.ofNullable(username).filter(StringUtils::isNotBlank).map(Username::new);
  }
}
