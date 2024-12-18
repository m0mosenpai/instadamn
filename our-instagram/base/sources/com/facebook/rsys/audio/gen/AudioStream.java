package com.facebook.rsys.audio.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class AudioStream {
    public static C2N9 CONVERTER = C55648OnZ.A00(5);
    public static long sMcfTypeId;
    public final int channelState;
    public final boolean hasVoiceActivity;
    public final Float playbackVolumeDesiredDeprecated;
    public final AudioSource source;
    public final String streamId;
    public final McfReference streamSource;
    public final int streamState;
    public final int streamStateDesired;
    public final int type;

    public static native AudioStream createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AudioStream)) {
                return false;
            }
            AudioStream audioStream = (AudioStream) obj;
            AudioSource audioSource = this.source;
            AudioSource audioSource2 = audioStream.source;
            if (audioSource == null) {
                if (audioSource2 != null) {
                    return false;
                }
            } else if (!audioSource.equals(audioSource2)) {
                return false;
            }
            McfReference mcfReference = this.streamSource;
            McfReference mcfReference2 = audioStream.streamSource;
            if (mcfReference == null) {
                if (mcfReference2 != null) {
                    return false;
                }
            } else if (!mcfReference.equals(mcfReference2)) {
                return false;
            }
            if (this.type != audioStream.type || this.hasVoiceActivity != audioStream.hasVoiceActivity) {
                return false;
            }
            String str = this.streamId;
            String str2 = audioStream.streamId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.streamState != audioStream.streamState || this.streamStateDesired != audioStream.streamStateDesired || this.channelState != audioStream.channelState) {
                return false;
            }
            Float f = this.playbackVolumeDesiredDeprecated;
            Float f2 = audioStream.playbackVolumeDesiredDeprecated;
            if (f != null) {
                if (!f.equals(f2)) {
                    return false;
                }
            } else if (f2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((JQ0.A01(AbstractC167017dG.A0M(this.source)) + AbstractC167017dG.A0M(this.streamSource)) * 31) + this.type) * 31) + (this.hasVoiceActivity ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.streamId)) * 31) + this.streamState) * 31) + this.streamStateDesired) * 31) + this.channelState) * 31) + AbstractC166997dE.A0I(this.playbackVolumeDesiredDeprecated);
    }

    public AudioStream(AudioSource audioSource, McfReference mcfReference, int i, boolean z, String str, int i2, int i3, int i4, Float f) {
        this.source = audioSource;
        this.streamSource = mcfReference;
        this.type = i;
        this.hasVoiceActivity = z;
        this.streamId = str;
        this.streamState = i2;
        this.streamStateDesired = i3;
        this.channelState = i4;
        this.playbackVolumeDesiredDeprecated = f;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AudioStream{source=");
        A1C.append(this.source);
        A1C.append(",streamSource=");
        A1C.append(this.streamSource);
        A1C.append(",type=");
        A1C.append(this.type);
        A1C.append(",hasVoiceActivity=");
        A1C.append(this.hasVoiceActivity);
        A1C.append(",streamId=");
        A1C.append(this.streamId);
        A1C.append(",streamState=");
        A1C.append(this.streamState);
        A1C.append(",streamStateDesired=");
        A1C.append(this.streamStateDesired);
        A1C.append(",channelState=");
        A1C.append(this.channelState);
        A1C.append(",playbackVolumeDesiredDeprecated=");
        return JQ0.A0l(this.playbackVolumeDesiredDeprecated, A1C);
    }
}
