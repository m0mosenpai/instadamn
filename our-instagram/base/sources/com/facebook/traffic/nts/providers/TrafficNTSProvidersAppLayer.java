package com.facebook.traffic.nts.providers;

import com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerImpl;
import com.facebook.traffic.nts.providers.fgbg.AppFgBgStateProviderImpl;
import com.facebook.traffic.nts.providers.httpinterceptor.HttpRequestInterceptorProviderImpl;
import com.facebook.traffic.nts.providers.reachability.ReachabilityV2ProviderImpl;
import com.facebook.traffic.nts.providers.startup.StartupSignalsProviderImpl;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: classes3.dex */
public interface TrafficNTSProvidersAppLayer {
    AppFgBgStateProviderImpl getAppFgBgStateProvider();

    BackgroundV2TaskSchedulerImpl getBackgroundTaskScheduler();

    boolean getEnableMobileProber();

    HttpRequestInterceptorProviderImpl getHttpRequestInterceptorProvider();

    ReachabilityV2ProviderImpl getReachabilityV2Provider();

    StartupSignalsProviderImpl getStartupSignalsProvider();

    XAnalyticsHolder getXAnalyticsHolder();
}
