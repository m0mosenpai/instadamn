package com.facebook.traffic.nts;

import X.C14360o3;
import com.facebook.jni.HybridData;
import com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class TrafficNetworkTelemetryServicesManager {
    public static final Companion Companion = new Object();
    public static final Object mutex = new Object();
    public static TrafficNetworkTelemetryServicesManager sharedManager;
    public HybridData mHybridData;
    public final TrafficNTSProvidersAppLayer providers;

    public /* synthetic */ TrafficNetworkTelemetryServicesManager(TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface, TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer, DefaultConstructorMarker defaultConstructorMarker) {
        this(trafficNTSManagerConfigInterface, trafficNTSProvidersAppLayer);
    }

    public static final native HybridData initHybrid(TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface, TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer);

    /* loaded from: classes.dex */
    public final class Companion {
        public final synchronized TrafficNetworkTelemetryServicesManager getManager() {
            TrafficNetworkTelemetryServicesManager trafficNetworkTelemetryServicesManager;
            synchronized (TrafficNetworkTelemetryServicesManager.mutex) {
                trafficNetworkTelemetryServicesManager = TrafficNetworkTelemetryServicesManager.sharedManager;
            }
            return trafficNetworkTelemetryServicesManager;
        }

        public final synchronized void initialize(TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface, TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer) {
            C14360o3.A0B(trafficNTSManagerConfigInterface, 0);
            synchronized (TrafficNetworkTelemetryServicesManager.mutex) {
                if (TrafficNetworkTelemetryServicesManager.sharedManager == null) {
                    TrafficNetworkTelemetryServicesManager.sharedManager = new TrafficNetworkTelemetryServicesManager(trafficNTSManagerConfigInterface, trafficNTSProvidersAppLayer);
                }
            }
        }

        private final HybridData initHybrid(TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface, TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer) {
            return TrafficNetworkTelemetryServicesManager.initHybrid(trafficNTSManagerConfigInterface, trafficNTSProvidersAppLayer);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final synchronized TrafficNetworkTelemetryServicesManager getManager() {
        TrafficNetworkTelemetryServicesManager manager;
        synchronized (TrafficNetworkTelemetryServicesManager.class) {
            manager = Companion.getManager();
        }
        return manager;
    }

    public static final synchronized void initialize(TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface, TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer) {
        synchronized (TrafficNetworkTelemetryServicesManager.class) {
            Companion.initialize(trafficNTSManagerConfigInterface, trafficNTSProvidersAppLayer);
        }
    }

    public final TrafficNTSProvidersAppLayer getProviders() {
        return this.providers;
    }

    public TrafficNetworkTelemetryServicesManager(TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface, TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer) {
        this.providers = trafficNTSProvidersAppLayer;
        TrafficNTSModule.loadLibrary();
        this.mHybridData = initHybrid(trafficNTSManagerConfigInterface, trafficNTSProvidersAppLayer);
    }
}
