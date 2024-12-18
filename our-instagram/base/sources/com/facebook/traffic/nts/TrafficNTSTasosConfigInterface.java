package com.facebook.traffic.nts;

import com.facebook.traffic.nts.tasos.bwemanager.BWEManagerV2Config;

/* loaded from: classes.dex */
public interface TrafficNTSTasosConfigInterface {
    BWEManagerV2Config getBweManagerV2Config();

    CongestionManagerConfigInterface getCongestionManagerConfig();

    boolean getEnableTasosBweManager();

    boolean getEnableTasosBweManagerV2();

    boolean getEnableTasosCongestionManager();

    boolean getEnableTasosHeaderInjector();
}
