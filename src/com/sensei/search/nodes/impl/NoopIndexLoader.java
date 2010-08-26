package com.sensei.search.nodes.impl;

import org.apache.log4j.Logger;

import proj.zoie.api.Zoie;

import com.browseengine.bobo.api.BoboIndexReader;
import com.sensei.search.nodes.SenseiIndexLoader;

public class NoopIndexLoader<V> implements SenseiIndexLoader
{
  private static final Logger logger = Logger.getLogger(NoopIndexLoader.class);
  
  protected Zoie<BoboIndexReader,V> _zoie;
  
  public NoopIndexLoader(Zoie<BoboIndexReader,V> zoie)
  {
    _zoie = zoie;
  }
  
  public void start()
  {
    logger.info("starting NoopIndexLoader...");
  }

  public void shutdown()
  {
    logger.info("shutting down NoopIndexLoader...");
  }
}
