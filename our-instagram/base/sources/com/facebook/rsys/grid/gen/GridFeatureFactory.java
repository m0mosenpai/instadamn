package com.facebook.rsys.grid.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: classes12.dex */
public abstract class GridFeatureFactory {

    /* loaded from: classes12.dex */
    public final class CProxy extends GridFeatureFactory {
        public static native FeatureHolder create(GridProxy gridProxy, GridOrderingParameters gridOrderingParameters);

        public static native GridFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
