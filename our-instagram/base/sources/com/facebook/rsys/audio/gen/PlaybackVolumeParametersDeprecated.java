package com.facebook.rsys.audio.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.C2N9;
import X.JQ0;
import X.LSW;
import X.MSV;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes8.dex */
public class PlaybackVolumeParametersDeprecated {
    public static C2N9 CONVERTER = new LSW(0);
    public static long sMcfTypeId;
    public final int streamType;
    public final String userID;
    public final float volume;

    public static native PlaybackVolumeParametersDeprecated createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaybackVolumeParametersDeprecated)) {
            return false;
        }
        PlaybackVolumeParametersDeprecated playbackVolumeParametersDeprecated = (PlaybackVolumeParametersDeprecated) obj;
        return this.userID.equals(playbackVolumeParametersDeprecated.userID) && this.streamType == playbackVolumeParametersDeprecated.streamType && this.volume == playbackVolumeParametersDeprecated.volume;
    }

    public int hashCode() {
        return ((JQ0.A01(this.userID.hashCode()) + this.streamType) * 31) + Float.floatToIntBits(this.volume);
    }

    public PlaybackVolumeParametersDeprecated(String str, int i, float f) {
        str.getClass();
        this.userID = str;
        this.streamType = i;
        this.volume = f;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PlaybackVolumeParametersDeprecated{userID=");
        A1C.append(this.userID);
        A1C.append(MSV.A00(653));
        A1C.append(this.streamType);
        A1C.append(",volume=");
        A1C.append(this.volume);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
