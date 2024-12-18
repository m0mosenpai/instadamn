package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: classes9.dex */
public abstract class MediaSyncFeatureFactory {

    /* loaded from: classes9.dex */
    public final class CProxy extends MediaSyncFeatureFactory {
        public static native FeatureHolder create(MediaSyncProxy mediaSyncProxy, McfReference mcfReference, boolean z, int i);

        public static native MediaSyncFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
