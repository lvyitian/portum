package com.felixklauke.portum.server;

import de.d3adspace.theresa.core.Theresa;
import de.d3adspace.theresa.core.TheresaFactory;
import com.felixklauke.portum.server.config.PortumServerConfig;
import com.felixklauke.portum.server.module.PortumServerModule;
import java.util.Objects;

public class PortumServerFactory {

  public static PortumServer createServer(PortumServerConfig serverConfig) {

    Objects.requireNonNull(serverConfig, "Config cannot be null");

    Theresa theresa = TheresaFactory.create(new PortumServerModule(serverConfig));
    return theresa.getInstance(PortumServer.class);
  }
}