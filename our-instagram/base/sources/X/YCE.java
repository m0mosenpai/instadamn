package X;

import com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer;
import com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerImpl;
import com.facebook.traffic.nts.providers.fgbg.AppFgBgStateProviderImpl;
import com.facebook.traffic.nts.providers.httpinterceptor.HttpRequestInterceptorProviderImpl;
import com.facebook.traffic.nts.providers.reachability.ReachabilityV2ProviderImpl;
import com.facebook.traffic.nts.providers.reachability.ReachabilityV2ProviderImplHolder;
import com.facebook.traffic.nts.providers.startup.StartupSignalsProviderImpl;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.instagram.traffic.nts.iglib.IGReachabilityV2ProviderAppLayerUpcallsImpl;

/* loaded from: classes12.dex */
public final class YCE implements TrafficNTSProvidersAppLayer {
    public final HttpRequestInterceptorProviderImpl A00;
    public final ReachabilityV2ProviderImplHolder A01;

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public final AppFgBgStateProviderImpl getAppFgBgStateProvider() {
        return null;
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public final BackgroundV2TaskSchedulerImpl getBackgroundTaskScheduler() {
        return null;
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public final boolean getEnableMobileProber() {
        return false;
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public final StartupSignalsProviderImpl getStartupSignalsProvider() {
        return null;
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public final XAnalyticsHolder getXAnalyticsHolder() {
        return null;
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public final ReachabilityV2ProviderImpl getReachabilityV2Provider() {
        ReachabilityV2ProviderImplHolder reachabilityV2ProviderImplHolder = this.A01;
        if (reachabilityV2ProviderImplHolder != null) {
            return reachabilityV2ProviderImplHolder.getReachabilityV2ProviderImpl();
        }
        return null;
    }

    public YCE(C1BE c1be) {
        HttpRequestInterceptorProviderImpl httpRequestInterceptorProviderImpl;
        if (c1be.A05) {
            httpRequestInterceptorProviderImpl = new HttpRequestInterceptorProviderImpl();
        } else {
            httpRequestInterceptorProviderImpl = null;
        }
        this.A00 = httpRequestInterceptorProviderImpl;
        ReachabilityV2ProviderImplHolder reachabilityV2ProviderImplHolder = c1be.getEnableReachabilityProvider() ? new ReachabilityV2ProviderImplHolder() : null;
        this.A01 = reachabilityV2ProviderImplHolder;
        if (reachabilityV2ProviderImplHolder != null) {
            reachabilityV2ProviderImplHolder.setUpcallImpl(new IGReachabilityV2ProviderAppLayerUpcallsImpl());
        }
    }

    @Override // com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer
    public final HttpRequestInterceptorProviderImpl getHttpRequestInterceptorProvider() {
        return this.A00;
    }
}
