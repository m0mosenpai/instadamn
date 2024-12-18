package com.facebook.traffic.nts;

/* loaded from: classes.dex */
public interface TrafficNTSManagerConfigInterface {
    boolean getEnableAmp();

    boolean getEnableAppFgBgStateProvider();

    boolean getEnableAppLifeCycleObserver();

    boolean getEnableIpAssoc();

    boolean getEnableNetSeer();

    boolean getEnableNetSeerV2();

    boolean getEnableReachabilityProvider();

    boolean getEnableTasos();

    boolean getEnableUserPrefsProvider();

    TrafficNTSIPAssocConfigInterface getIpAssocConfig();

    TrafficNTSNetSeerV1ConfigInterface getNetSeerV1Config();

    TrafficNTSTasosConfigInterface getTasosConfig();
}
