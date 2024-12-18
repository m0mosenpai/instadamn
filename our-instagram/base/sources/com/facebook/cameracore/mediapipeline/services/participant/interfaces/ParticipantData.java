package com.facebook.cameracore.mediapipeline.services.participant.interfaces;

/* loaded from: classes8.dex */
public class ParticipantData {
    public final boolean mIsActiveInCall;
    public final boolean mIsActiveInSameEffect;
    public final String mParticipantId;
    public final int mloadStatus;

    public boolean getIsActiveInCall() {
        return this.mIsActiveInCall;
    }

    public boolean getIsActiveInSameEffect() {
        return this.mIsActiveInSameEffect;
    }

    public int getLoadStatus() {
        return this.mloadStatus;
    }

    public String getParticipantId() {
        return this.mParticipantId;
    }

    public ParticipantData(String str, boolean z, boolean z2, int i) {
        this.mParticipantId = str;
        this.mIsActiveInCall = z;
        this.mIsActiveInSameEffect = z2;
        this.mloadStatus = i;
    }
}
