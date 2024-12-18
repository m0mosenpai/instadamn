package com.facebook.rsys.moderator.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: classes9.dex */
public abstract class ModeratorFeatureFactory {

    /* loaded from: classes9.dex */
    public final class CProxy extends ModeratorFeatureFactory {
        public static native FeatureHolder create(ModeratorProxy moderatorProxy);

        public static native ModeratorFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
