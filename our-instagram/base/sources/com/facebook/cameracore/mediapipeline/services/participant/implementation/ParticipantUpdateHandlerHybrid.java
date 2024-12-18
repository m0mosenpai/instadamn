package com.facebook.cameracore.mediapipeline.services.participant.implementation;

import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: classes9.dex */
public final class ParticipantUpdateHandlerHybrid {
    public final HybridData mHybridData;

    public final native void onParticipantDataUpdateNative(List list);

    public ParticipantUpdateHandlerHybrid(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
