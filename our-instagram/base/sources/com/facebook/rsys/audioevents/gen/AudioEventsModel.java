package com.facebook.rsys.audioevents.gen;

import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class AudioEventsModel {
    public static C2N9 CONVERTER = C55648OnZ.A00(7);
    public static long sMcfTypeId;
    public final boolean hasAudioPlayed;
    public final int latestAudioEvent;

    public static native AudioEventsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioEventsModel)) {
            return false;
        }
        AudioEventsModel audioEventsModel = (AudioEventsModel) obj;
        return this.latestAudioEvent == audioEventsModel.latestAudioEvent && this.hasAudioPlayed == audioEventsModel.hasAudioPlayed;
    }

    public int hashCode() {
        return JQ0.A01(this.latestAudioEvent) + (this.hasAudioPlayed ? 1 : 0);
    }

    public AudioEventsModel(int i, boolean z) {
        this.latestAudioEvent = i;
        this.hasAudioPlayed = z;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AudioEventsModel{latestAudioEvent=");
        A1C.append(this.latestAudioEvent);
        A1C.append(",hasAudioPlayed=");
        return AbstractC50523MSb.A0X(A1C, this.hasAudioPlayed);
    }
}
