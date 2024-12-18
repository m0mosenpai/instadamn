package com.instagram.debug.network;

import X.AbstractC12990ll;

/* loaded from: classes5.dex */
public final class DebugNetworkShapingConfigurationFactory {
    public static final DebugNetworkShapingConfigurationFactory INSTANCE = new Object();

    public static final NetworkShapingConfiguration createNetworkShapingCallbackConfiguration() {
        return new DebugNetworkShapingConfigurationFactory$createNetworkShapingCallbackConfiguration$1();
    }

    public static final NetworkShapingConfiguration createNetworkShapingServiceLayerConfiguration(AbstractC12990ll abstractC12990ll) {
        return new DebugNetworkShapingConfigurationFactory$createNetworkShapingServiceLayerConfiguration$1(abstractC12990ll);
    }

    public static final NetworkShapingConfiguration createStaticConfiguration(long j, int i, int i2) {
        return new DebugNetworkShapingConfigurationFactory$createStaticConfiguration$1(j, i, i2);
    }
}
