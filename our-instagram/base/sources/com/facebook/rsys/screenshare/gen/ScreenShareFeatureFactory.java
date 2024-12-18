package com.facebook.rsys.screenshare.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: classes9.dex */
public abstract class ScreenShareFeatureFactory {

    /* loaded from: classes9.dex */
    public final class CProxy extends ScreenShareFeatureFactory {
        public static native FeatureHolder create(int i, ScreenShareProxy screenShareProxy, ScreenShareAudioProxy screenShareAudioProxy);

        public static native ScreenShareFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
