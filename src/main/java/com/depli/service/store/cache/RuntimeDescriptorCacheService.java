package com.depli.service.store.cache;

import com.depli.store.cache.descriptor.RuntimeDescriptor;
import org.infinispan.Cache;

/**
 * Runtime descriptor cache service
 * <p>
 * Service to retrieve and clear the cache which contains Runtime descriptors.
 *
 * @author lpsandaruwan
 * @since 9/16/17
 */

public interface RuntimeDescriptorCacheService {

    /**
     * Returns infinispan cache which uses to store and retrieve Runtime descriptors mapped by the Long values,
     * node IDs related to remote JMX connections which are generated by hibernate.
     *
     * @return runtime descriptor cache
     */
    public Cache<Long, RuntimeDescriptor> getCache();

    /**
     * Clears the cache which contains the map of Long values, node IDs related to
     * remote JMX connections which are generated by hibernate and Runtime
     * descriptors.
     */
    public void clearCache();
}