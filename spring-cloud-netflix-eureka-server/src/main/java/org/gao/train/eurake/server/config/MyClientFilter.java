package org.gao.train.eurake.server.config;

import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.filter.ClientFilter;
import com.sun.jersey.core.header.InBoundHeaders;

import javax.ws.rs.core.Response;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/5 20:59
 */
public class MyClientFilter extends ClientFilter {
    @Override
    public ClientResponse handle(ClientRequest cr) throws ClientHandlerException {
        System.out.println(cr);
        InBoundHeaders inBoundHeader = new InBoundHeaders();

        return null;
    }
}
