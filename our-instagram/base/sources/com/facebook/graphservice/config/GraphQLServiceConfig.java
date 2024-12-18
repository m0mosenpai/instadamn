package com.facebook.graphservice.config;

import X.AbstractC72468XeK;
import X.C72551XgL;

/* loaded from: classes12.dex */
public class GraphQLServiceConfig {
    public boolean addFieldNameInLogKey;
    public long assertUnusedSamplingRate;
    public short assertUnusedShardId;
    public String clientRejectPrefetchOptOutQueryNames;
    public boolean concurrentQueryDedupeUseInlineExecutor;
    public int customTimestampSerializerUpdateDiskWriteTimesInterval;
    public boolean enableAssertUnusedAnalyticsLogging;
    public boolean enableAssertUnusedFieldTracking;
    public boolean enableAssertUnusedRootFieldTracking;
    public boolean enableBlackBoxService;
    public boolean enableBugReportIntegration;
    public boolean enableClientRejectPrefetchDuringPeak;
    public boolean enableConcurrentQueryDedupe;
    public boolean enableGlobalFullConsistency;
    public boolean enableIg4aCache;
    public boolean enableLockForTimestampCustomSerializer;
    public boolean enablePublishIncrementalPayloads;
    public boolean enableSessionScopeTesting;
    public boolean enableSkipDeadFields;
    public boolean enableSonarClient;
    public boolean enableUFTResponseShapeLog;
    public boolean enableUsageAnalytics;
    public boolean enableUsedFieldTracking;
    public double freshCacheTtlMultiplier;
    public boolean getCacheWriteTimesFromMemory;
    public boolean ignoreTrackFieldAccessFlag;
    public int inMemoryBufferMaxEntries;
    public String ohaiAllowedQueries;
    public String ohaiProxyUrl;
    public String optimizerConfigJson;
    public long peakFreshCacheTtlAdditionSeconds;
    public double peakFreshCacheTtlMultiplier;
    public boolean responseTreeShapeReportIsUsageTracking;
    public long scheduledPeakEndMinuteOfDayUTC;
    public long scheduledPeakFreshCacheTtlAdditionSeconds;
    public double scheduledPeakFreshCacheTtlMultiplier;
    public long scheduledPeakStartMinuteOfDayUTC;
    public boolean shouldWarmTreeShapeCache;
    public boolean shouldWarmTreeShapeCacheAlwaysTraverse;
    public boolean skipQueryParamSerialization;
    public long uftDelayInMs;
    public long uftSamplingRate;
    public boolean useOriginalUserDefinedFieldOverrides;
    public boolean writePlaceholderForUncachedQueries;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.XgL, java.lang.Object] */
    public static C72551XgL Builder() {
        return new Object();
    }

    public boolean concurrentQueryDedupeUseInlineExecutor() {
        return this.concurrentQueryDedupeUseInlineExecutor;
    }

    public boolean enableClientRejectPrefetchDuringPeak() {
        return this.enableClientRejectPrefetchDuringPeak;
    }

    public boolean enableConcurrentQueryDedupe() {
        return this.enableConcurrentQueryDedupe;
    }

    public boolean enableGlobalFullConsistency() {
        return this.enableGlobalFullConsistency;
    }

    public boolean enableSkipDeadFields() {
        return this.enableSkipDeadFields;
    }

    public boolean enableUsageAnalytics() {
        return this.enableUsageAnalytics;
    }

    public boolean getAddFieldNameInLogKey() {
        return this.addFieldNameInLogKey;
    }

    public long getAssertUnusedSamplingRate() {
        return this.assertUnusedSamplingRate;
    }

    public short getAssertUnusedShardId() {
        return this.assertUnusedShardId;
    }

    public boolean getCacheWriteTimesFromMemory() {
        return this.getCacheWriteTimesFromMemory;
    }

    public String getClientRejectPrefetchOptOutQueryNames() {
        return this.clientRejectPrefetchOptOutQueryNames;
    }

    public int getCustomTimestampSerializerUpdateDiskWriteTimesInterval() {
        return this.customTimestampSerializerUpdateDiskWriteTimesInterval;
    }

    public boolean getEnableAssertUnusedAnalyticsLogging() {
        return this.enableAssertUnusedAnalyticsLogging;
    }

    public boolean getEnableAssertUnusedFieldTracking() {
        return this.enableAssertUnusedFieldTracking;
    }

    public boolean getEnableAssertUnusedRootFieldTracking() {
        return this.enableAssertUnusedRootFieldTracking;
    }

    public boolean getEnableLockForTimestampCustomSerializer() {
        return this.enableLockForTimestampCustomSerializer;
    }

    public boolean getEnableUFTResponseShapeLog() {
        return this.enableUFTResponseShapeLog;
    }

    public boolean getEnableUsedFieldTracking() {
        return this.enableUsedFieldTracking;
    }

    public double getFreshCacheTtlMultiplier() {
        return this.freshCacheTtlMultiplier;
    }

    public boolean getIgnoreTrackFieldAccessFlag() {
        return this.ignoreTrackFieldAccessFlag;
    }

    public int getInMemoryBufferMaxEntries() {
        return this.inMemoryBufferMaxEntries;
    }

    public String getOhaiAllowedQueries() {
        return this.ohaiAllowedQueries;
    }

    public String getOhaiProxyUrl() {
        return this.ohaiProxyUrl;
    }

    public String getOptimizerConfigJson() {
        return this.optimizerConfigJson;
    }

    public long getPeakFreshCacheTtlAdditionSeconds() {
        return this.peakFreshCacheTtlAdditionSeconds;
    }

    public double getPeakFreshCacheTtlMultiplier() {
        return this.peakFreshCacheTtlMultiplier;
    }

    public boolean getResponseTreeShapeReportIsUsageTracking() {
        return this.responseTreeShapeReportIsUsageTracking;
    }

    public long getScheduledPeakEndMinuteOfDayUTC() {
        return this.scheduledPeakEndMinuteOfDayUTC;
    }

    public long getScheduledPeakFreshCacheTtlAdditionSeconds() {
        return this.scheduledPeakFreshCacheTtlAdditionSeconds;
    }

    public double getScheduledPeakFreshCacheTtlMultiplier() {
        return this.scheduledPeakFreshCacheTtlMultiplier;
    }

    public long getScheduledPeakStartMinuteOfDayUTC() {
        return this.scheduledPeakStartMinuteOfDayUTC;
    }

    public long getUftDelayInMs() {
        return this.uftDelayInMs;
    }

    public long getUftSamplingRate() {
        return this.uftSamplingRate;
    }

    public boolean getUseOriginalUserDefinedFieldOverrides() {
        return this.useOriginalUserDefinedFieldOverrides;
    }

    public boolean isEnableBlackBoxService() {
        return this.enableBlackBoxService;
    }

    public boolean isEnableBugReportIntegration() {
        return this.enableBugReportIntegration;
    }

    public boolean isEnablePublishIncrementalPayloads() {
        return this.enablePublishIncrementalPayloads;
    }

    public boolean isEnableSonarClient() {
        return this.enableSonarClient;
    }

    public boolean isIg4aCacheEnabled() {
        return this.enableIg4aCache;
    }

    public boolean shouldWarmTreeShapeCache() {
        return this.shouldWarmTreeShapeCache;
    }

    public boolean shouldWarmTreeShapeCacheAlwaysTraverse() {
        return this.shouldWarmTreeShapeCacheAlwaysTraverse;
    }

    public boolean skipQueryParamSerialization() {
        return this.skipQueryParamSerialization;
    }

    public boolean writePlaceholderForUncachedQueries() {
        return this.writePlaceholderForUncachedQueries;
    }

    public /* synthetic */ GraphQLServiceConfig(AbstractC72468XeK abstractC72468XeK) {
    }

    public GraphQLServiceConfig() {
    }
}
