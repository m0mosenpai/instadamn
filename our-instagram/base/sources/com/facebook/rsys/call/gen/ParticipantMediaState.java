package com.facebook.rsys.call.gen;

import X.AbstractC166987dD;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class ParticipantMediaState {
    public static C2N9 CONVERTER = C55648OnZ.A00(11);
    public static long sMcfTypeId;
    public final ArrayList audioStreams;
    public final ArrayList videoStreams;

    public static native ParticipantMediaState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParticipantMediaState)) {
            return false;
        }
        ParticipantMediaState participantMediaState = (ParticipantMediaState) obj;
        return this.videoStreams.equals(participantMediaState.videoStreams) && this.audioStreams.equals(participantMediaState.audioStreams);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.audioStreams, JQ0.A01(this.videoStreams.hashCode()));
    }

    public ParticipantMediaState(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.videoStreams = arrayList;
        this.audioStreams = arrayList2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ParticipantMediaState{videoStreams=");
        A1C.append(this.videoStreams);
        A1C.append(",audioStreams=");
        return JQ0.A0l(this.audioStreams, A1C);
    }
}
