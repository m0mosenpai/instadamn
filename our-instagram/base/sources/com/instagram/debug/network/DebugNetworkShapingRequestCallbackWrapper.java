package com.instagram.debug.network;

import X.C14360o3;
import X.InterfaceC26491Qe;

/* loaded from: classes3.dex */
public final class DebugNetworkShapingRequestCallbackWrapper {
    public final NetworkShapingConfiguration configuration;
    public final String tag;

    public DebugNetworkShapingRequestCallbackWrapper(NetworkShapingConfiguration networkShapingConfiguration, String str) {
        C14360o3.A0B(networkShapingConfiguration, 1);
        C14360o3.A0B(str, 2);
        this.configuration = networkShapingConfiguration;
        this.tag = str;
    }

    public InterfaceC26491Qe maybeWrapCallback(InterfaceC26491Qe interfaceC26491Qe, String str) {
        C14360o3.A0B(interfaceC26491Qe, 0);
        C14360o3.A0B(str, 1);
        if (this.configuration.isNetworkShapingOn()) {
            return new NetworkShapingRequestCallback(interfaceC26491Qe, this.configuration, str, this.tag);
        }
        return interfaceC26491Qe;
    }
}
