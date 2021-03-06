package com.vladmihalcea.flexypool.strategy;

/**
 * <code>UniquenameNamingStrategy</code> implements the {@link MetricNamingStrategy}
 * Unique metrics for each unique pool name. Metrics prefixed
 *
 * @author Atle Tokle
 * @since 2.2.2
 */
public class UniqueNamingStrategy implements MetricNamingStrategy {

    public static final UniqueNamingStrategy INSTANCE = new UniqueNamingStrategy();

    private static final String METRIC_PREFIX = "flexypool_";

    @Override
    public String getMetricName(String name) {
        return METRIC_PREFIX + name;
    }

    @Override
    public boolean useUniquePoolName() {
        return true;
    }
}
