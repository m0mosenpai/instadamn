package com.facebook.rsys.externalcall.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: classes9.dex */
public abstract class ExternalCallFeatureFactory {

    /* loaded from: classes9.dex */
    public final class CProxy extends ExternalCallFeatureFactory {
        public static native FeatureHolder create(ExternalCallProxy externalCallProxy);

        public static native ExternalCallFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
