package com.facebook.traffic.nts.tasos.bwemanager;

/* loaded from: classes5.dex */
public interface BWEManagerV2Config {
    long getABRMaxBweConfidenceValue();

    long getABRMinBweConfidenceValue();

    double getBadNetworkQualityHighConfScaleFactor();

    double getBadNetworkQualityLowConfScaleFactor();

    double getBadNetworkQualityMediumConfScaleFactor();

    long getBadNetworkQualityScaleFactorThresholdBps();

    boolean getEnableSSBweDetailedLogging();

    boolean getEnableSSBweHttpStores();

    boolean getEnableSSBwePrefetchObservedScaling();

    boolean getEnableSSBweTtfbAdjustmentForVod();

    boolean getEnableSsBweScalingRationalGambler();

    TasosBweSnapshotConfig getFBFeedBweSnapshotConfig();

    long getSSBweAdjustmentValueBpsFNFStitchTuning();

    long getSSBweAdjustmentValueBpsLive();

    long getSSBweAdjustmentValueBpsVod();

    String getSSBweConfidenceValueKey();

    long getSSBweConfidenceValueThreshold();

    String getSSBweDebugHeaderPrefix();

    long getSSBweDefaultConfidenceForFNFStitchTuning();

    String getSSBweHeaderKeyLive();

    String getSSBweHeaderKeyScaleFactor();

    String getSSBweHeaderKeyVod();

    String getSSBweHeadersToRecord();

    double getSSBweHighConfidenceScaleFactorFNFStitchTuning();

    double getSSBweHighConfidenceScaleFactorLive();

    double getSSBweHighConfidenceScaleFactorVod();

    long getSSBweHighConfidenceThresholdPercent();

    String getSSBweHighConfidenceValueKey();

    double getSSBweLowConfidenceScaleFactorFNFStitchTuning();

    double getSSBweLowConfidenceScaleFactorLive();

    double getSSBweLowConfidenceScaleFactorVod();

    long getSSBweLowConfidenceThresholdPercent();

    String getSSBweLowConfidenceValueKey();

    double getSSBweMaxScaleFactorLive();

    double getSSBweMaxScaleFactorVod();

    String getSSBweMeanValueKey();

    double getSSBweMediumConfidenceScaleFactorFNFStitchTuning();

    double getSSBweMediumConfidenceScaleFactorLive();

    double getSSBweMediumConfidenceScaleFactorVod();

    long getSSBweMediumConfidenceThresholdPercent();

    String getSSBweMediumConfidenceValueKey();

    double getSSBweMinScaleFactorLive();

    double getSSBweMinScaleFactorVod();

    long getSSBwePrefetchActiveHistoryWindowMs();

    double getSSBwePrefetchObservedHighConfidenceScaleFactorLive();

    double getSSBwePrefetchObservedHighConfidenceScaleFactorVod();

    double getSSBwePrefetchObservedLowConfidenceScaleFactorLive();

    double getSSBwePrefetchObservedLowConfidenceScaleFactorVod();

    double getSSBwePrefetchObservedMediumConfidenceScaleFactorLive();

    double getSSBwePrefetchObservedMediumConfidenceScaleFactorVod();

    String getSSBweTtfbValueKey();

    boolean getSSbweStaleWindowDetectionEnabled();

    long getSSbweStaleWindowDetectionTime();

    boolean getSSbweStateLoadFromCacheStore();

    boolean getSSbweStateSaveToCacheStore();

    long getSSbweVsClientStaleDetectionTime();

    double getTimeSinceSessionStartHighConfScaleFactor();

    double getTimeSinceSessionStartLowConfScaleFactor();

    double getTimeSinceSessionStartMediumConfScaleFactor();

    long getTimeSinceSessionStartScaleFactorThreshSecs();

    boolean getUseSSBweForFNFStitchTuning();

    boolean getUseSSBweForLive();

    boolean getUseSSBweForVod();
}
