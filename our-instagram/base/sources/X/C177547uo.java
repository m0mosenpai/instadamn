package X;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.7uo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177547uo {
    public static final EnumC177557up A06 = EnumC177557up.ZERO_BASED_BUFFER_COUNTED;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final EnumC177557up A05;

    public C177547uo(EnumC177557up enumC177557up, int i, int i2, int i3, int i4, int i5) {
        this.A04 = i5;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A00 = i;
        this.A05 = enumC177557up;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C177547uo c177547uo = (C177547uo) obj;
            if (this.A04 != c177547uo.A04 || this.A01 != c177547uo.A01 || this.A02 != c177547uo.A02 || this.A03 != c177547uo.A03 || this.A00 != c177547uo.A00 || this.A05 != c177547uo.A05) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        String str;
        String str2;
        Integer valueOf = Integer.valueOf(this.A04);
        int i = this.A01;
        if (i != 12) {
            if (i != 16) {
                str = AnonymousClass001.A0O("Wrong enum ", i);
            } else {
                str = "CHANNEL_IN_MONO";
            }
        } else {
            str = "CHANNEL_IN_STEREO";
        }
        int i2 = this.A02;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    str2 = AnonymousClass001.A0O("Wrong enum ", i2);
                } else {
                    str2 = "ENCODING_PCM_FLOAT";
                }
            } else {
                str2 = "ENCODING_PCM_8BIT";
            }
        } else {
            str2 = "ENCODING_PCM_16BIT";
        }
        return String.format(null, "AudioRecorderConfig{sampleRateHz=%d, channelType=%s, encoding=%s, readBufferSizeInBytes=%d, bitrate=%d. presentationTimeStrategy=%s}", valueOf, str, str2, Integer.valueOf(this.A03), Integer.valueOf(this.A00), this.A05);
    }

    public final HashMap A00() {
        HashMap hashMap = new HashMap();
        hashMap.put("AudioRecorderConfig.channelType", String.valueOf(this.A01));
        hashMap.put("AudioRecorderConfig.encoding", String.valueOf(this.A02));
        hashMap.put("AudioRecorderConfig.sampleRateHz", String.valueOf(this.A04));
        hashMap.put("AudioRecorderConfig.readBufferSizeInBytes", String.valueOf(this.A03));
        hashMap.put("AudioRecorderConfig.bitRate", String.valueOf(this.A00));
        hashMap.put("AudioRecorderConfig.presentationTimeStrategy", String.valueOf(this.A05));
        return hashMap;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A04), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A00), this.A05});
    }
}
