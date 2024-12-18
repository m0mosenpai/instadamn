package com.facebook.traffic.nts.providers.startup;

/* loaded from: classes12.dex */
public interface StartupSignalsProviderAppLayer {
    void notifyStartupCompleted(int i);

    void setUpcallImpl(StartupSignalsProviderAppLayerUpcalls startupSignalsProviderAppLayerUpcalls);
}
