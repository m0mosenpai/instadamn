package com.instagram.traffic.nts.tigonprovider;

import X.C09270dc;
import X.C0K8;
import X.C14250np;
import X.C14360o3;
import X.C1BQ;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.traffic.nts.TrafficNetworkTelemetryServicesManager;
import com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer;
import com.facebook.traffic.nts.providers.httpinterceptor.HttpRequestInterceptorProviderImpl;
import com.instagram.common.session.UserSession;
import com.instagram.service.tigon.IGTigonService;
import java.util.Map;

/* loaded from: classes.dex */
public final class IGTrafficNTSTigonProvider {
    public static final C1BQ Companion = new Object();
    public static IGTrafficNTSTigonProvider sharedProvider;
    public HttpRequestInterceptorProviderImpl httpRequestInterceptorProvider;
    public final HybridData mHybridData;
    public boolean providerSetupDone;
    public final UserSession userSession;

    public IGTrafficNTSTigonProvider(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.userSession = userSession;
        C09270dc.A03("igtntstigonprovider");
        this.mHybridData = initHybrid();
        if (!this.providerSetupDone) {
            setupTNTSTigonProvider(userSession);
        }
    }

    private final native void addTigonObservers(IGTigonService iGTigonService, AndroidAsyncExecutorFactory androidAsyncExecutorFactory);

    private final native Map getTrafficNTSInterceptorRequestHeaders();

    private final native HybridData initHybrid();

    private final native void setTrafficNTSManager(TrafficNetworkTelemetryServicesManager trafficNetworkTelemetryServicesManager);

    public final synchronized void setupTNTSTigonProvider(UserSession userSession) {
        HttpRequestInterceptorProviderImpl httpRequestInterceptorProviderImpl;
        C14360o3.A0B(userSession, 0);
        if (!this.providerSetupDone) {
            TrafficNetworkTelemetryServicesManager manager = TrafficNetworkTelemetryServicesManager.Companion.getManager();
            if (manager == null) {
                C0K8.A0C("IGTrafficNTSTigonProvider", "In setupTNTSTigonProvider, TNTS manager is not setup yet");
            } else {
                setTrafficNTSManager(manager);
                IGTigonService tigonService = IGTigonService.getTigonService(userSession);
                C14360o3.A07(tigonService);
                AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
                addTigonObservers(tigonService, new AndroidAsyncExecutorFactory(C14250np.A00().A00));
                TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer = manager.providers;
                if (trafficNTSProvidersAppLayer != null) {
                    httpRequestInterceptorProviderImpl = trafficNTSProvidersAppLayer.getHttpRequestInterceptorProvider();
                } else {
                    httpRequestInterceptorProviderImpl = null;
                }
                this.httpRequestInterceptorProvider = httpRequestInterceptorProviderImpl;
                this.providerSetupDone = true;
            }
        }
    }

    public static final synchronized IGTrafficNTSTigonProvider getInstance() {
        IGTrafficNTSTigonProvider A00;
        synchronized (IGTrafficNTSTigonProvider.class) {
            A00 = Companion.A00();
        }
        return A00;
    }

    public static final synchronized IGTrafficNTSTigonProvider initialize(UserSession userSession) {
        IGTrafficNTSTigonProvider A01;
        synchronized (IGTrafficNTSTigonProvider.class) {
            A01 = Companion.A01(userSession);
        }
        return A01;
    }

    public final HttpRequestInterceptorProviderImpl getHttpRequestInterceptorProvider() {
        return this.httpRequestInterceptorProvider;
    }

    public final UserSession getUserSession() {
        return this.userSession;
    }

    public final Map getInterceptorRequestHeaders() {
        return getTrafficNTSInterceptorRequestHeaders();
    }
}
