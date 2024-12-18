package com.facebook.distribgw.client;

/* loaded from: classes.dex */
public class DGWPersonalizationConfig {
    public final boolean personalizationEnabled;
    public final DGWPersonalizationProperty publishTimeoutInSeconds;
    public final DGWPersonalizationThreshold streamEstablishmentLatencyInMs;
    public final DGWPersonalizationProperty streamEstablishmentTimeoutInSeconds;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{enabled:");
        sb.append(this.personalizationEnabled);
        sb.append(",streamEstablishmentLatencyInMs:");
        sb.append(this.streamEstablishmentLatencyInMs);
        sb.append(",streamEstablishmentTimeoutInSeconds:");
        sb.append(this.streamEstablishmentTimeoutInSeconds);
        sb.append(",publishTimeoutInSeconds:");
        sb.append(this.publishTimeoutInSeconds);
        sb.append("}");
        return sb.toString();
    }

    public DGWPersonalizationConfig(DGWPersonalizationThreshold dGWPersonalizationThreshold, DGWPersonalizationProperty dGWPersonalizationProperty, DGWPersonalizationProperty dGWPersonalizationProperty2, boolean z) {
        this.streamEstablishmentLatencyInMs = dGWPersonalizationThreshold;
        this.streamEstablishmentTimeoutInSeconds = dGWPersonalizationProperty;
        this.publishTimeoutInSeconds = dGWPersonalizationProperty2;
        this.personalizationEnabled = z;
    }
}
