package com.wireandwheel.demonstrations.ws.service;

import com.wireandwheel.demonstrations.ws.model.BitcoinPrice;

import javax.ws.rs.Produces;

public interface RemoteService
{
    @Produces("application/json")
    public BitcoinPrice get();
}
