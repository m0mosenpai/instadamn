package com.facebook.rsys.mosaicgrid.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: classes9.dex */
public abstract class MosaicGridFeatureFactory {

    /* loaded from: classes9.dex */
    public final class CProxy extends MosaicGridFeatureFactory {
        public static native FeatureHolder create(MosaicGridProxy mosaicGridProxy, MosaicGridParams mosaicGridParams);

        public static native MosaicGridFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
