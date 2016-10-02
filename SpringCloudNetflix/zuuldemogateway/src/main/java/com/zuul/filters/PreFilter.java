package com.zuul.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * A pre filter for Zuul. pre filters are executed before the request is routed.
 */
public class PreFilter extends ZuulFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(PreFilter.class);

    /**
     * Returns a String that stands for the type
     * of the filter--- in this case, pre, or it could be route for a routing filter.
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * gives the order in which this filter will be executed, relative to other filters.
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * contains the logic that
     * determines when to execute this filter (this particular filter will always be executed).
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * contains the functionality of the filter.
     * Zuul filters store request and state information in (and share it by means of) the
     * RequestContext. We’re using that to get at the HttpServletRequest, and then we log the
     * HTTP method and URL of the request before it is sent on its way.
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        LOGGER.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

        return null;
    }
}
