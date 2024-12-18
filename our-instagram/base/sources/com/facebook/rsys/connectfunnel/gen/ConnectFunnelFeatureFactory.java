package com.facebook.rsys.connectfunnel.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: classes9.dex */
public abstract class ConnectFunnelFeatureFactory {

    /* loaded from: classes9.dex */
    public final class CProxy extends ConnectFunnelFeatureFactory {
        public static native FeatureHolder create(ConnectFunnelProxy connectFunnelProxy, boolean z);

        public static native ConnectFunnelFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
