package com.facebook.traffic.nts;

/* loaded from: classes.dex */
public interface CongestionManagerConfigInterface {
    String getCongestionSignalHeader();

    double getCongestionSignalThreshold();

    int getCongestionStateExpirySeconds();

    boolean getEnableCongestionLogging();

    boolean getEnableCongestionObservability();

    boolean getEnableCongestionSignalInjection();
}
