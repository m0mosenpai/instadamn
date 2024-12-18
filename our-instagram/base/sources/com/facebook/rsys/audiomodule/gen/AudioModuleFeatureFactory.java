package com.facebook.rsys.audiomodule.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: classes9.dex */
public abstract class AudioModuleFeatureFactory {

    /* loaded from: classes9.dex */
    public final class CProxy extends AudioModuleFeatureFactory {
        public static native FeatureHolder create(AudioModule audioModule, boolean z, boolean z2);

        public static native AudioModuleFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
