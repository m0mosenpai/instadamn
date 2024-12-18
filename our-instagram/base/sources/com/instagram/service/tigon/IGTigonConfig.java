package com.instagram.service.tigon;

import X.AbstractC20100yh;
import X.AbstractC23991Fl;
import X.AbstractC24001Fm;
import X.C20150ym;
import com.facebook.tigon.iface.TigonSamplingPolicy;

/* loaded from: classes.dex */
public final class IGTigonConfig {
    public final boolean appStartedInBackground;
    public final boolean bisectDisablePriorityService;
    public final String[] combinableResponseHeaders;
    public final boolean deprioritizeImage;
    public final boolean disableSameModuleNotUiGraph;
    public final boolean enableE2eTracingForMhrSampledRequests;
    public final boolean enableIgFixFbcdn;
    public final boolean enableIgFixFbcdnLogging;
    public final boolean enableImageOffscreenThreshold;
    public final boolean enableInlineObservers;
    public final boolean enablePluginInterceptors;
    public final boolean enablePluginObservers;
    public final boolean enableShadowMode;
    public final boolean enableTigonRtcQueue;
    public final boolean enableTransformCallback;
    public final int imageOffscreenThreshold;
    public final boolean isH3PriChangesLoggingEnabled;
    public final long maxStreamingCachedBufferSize;
    public final boolean mobileHttpRequestTriggerEnabled;
    public final boolean prioritizeAppStartMedia;
    public final boolean prioritizeVideo;
    public final boolean prioritizeVideoCover;
    public final String proxyHostAndPortForE2ETest;
    public final boolean shouldForceIgAppId;
    public final TigonSamplingPolicy tigonSamplingPolicy;
    public final String triggeredLoggingAllowList;
    public final boolean useDefaultCalculatorPriorities;
    public final boolean useGenericAnalyticsHeaderBuilder;
    public final boolean useNewOrchestration;
    public final boolean useOnBodyExperimental;
    public final String capabilities = "3brTv10=";
    public final String appId = "567067343352427";
    public final String[] forwardableHeaders = AbstractC23991Fl.A00;
    public final int[] redirectErrorCodes = AbstractC24001Fm.A00;
    public final int maxNumRedirectCount = (int) C20150ym.A01(AbstractC20100yh.A00(36610683485034679L));
    public final int serverErrorRetryLimit = (int) C20150ym.A01(AbstractC20100yh.A00(36610683485558974L));
    public final int transientErrorRetryLimit = (int) C20150ym.A01(AbstractC20100yh.A00(36610683485755583L));
    public final int nonTransientErrorRetryLimit = (int) C20150ym.A01(AbstractC20100yh.A00(36610683485231290L));
    public final String retryStatusCodesStr = C20150ym.A03(AbstractC20100yh.A00(36892158462198721L));
    public final int retryDelayMinMs = (int) C20150ym.A01(AbstractC20100yh.A00(36610683485427901L));
    public final int retryDelayMaxMs = (int) C20150ym.A01(AbstractC20100yh.A00(36610683485362364L));
    public final int networkSwitchErrorDelayMs = (int) C20150ym.A01(AbstractC20100yh.A00(36610683485165753L));
    public final boolean useIGLigerRetryPolicy = C20150ym.A07(AbstractC20100yh.A00(36329208509317296L));
    public final int ligerRetryLimit = (int) C20150ym.A01(AbstractC20100yh.A00(36610649125689469L));
    public final boolean disableBackgroundRetry = C20150ym.A07(AbstractC20100yh.A00(36329208506630293L));

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0158, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36329208507744420L)) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IGTigonConfig() {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.service.tigon.IGTigonConfig.<init>():void");
    }
}
