package com.facebook.rsys.call.gen;

import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public abstract class CallModelUtils {

    /* loaded from: classes9.dex */
    public final class CProxy extends CallModelUtils {
        public static native CallModelUtils createFromMcfType(McfReference mcfReference);

        public static native boolean doesAnyParticipantHaveVideo(CallModel callModel);

        public static native long nativeGetMcfTypeId();
    }
}
