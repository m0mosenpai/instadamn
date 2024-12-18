package X;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.7um, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C177527um implements InterfaceC177537un {
    public C177547uo A00;
    public C177567uq A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C177527um c177527um = (C177527um) obj;
            if (!this.A00.equals(c177527um.A00) || !this.A01.equals(c177527um.A01)) {
                return false;
            }
        }
        return true;
    }

    public final HashMap A00() {
        C177567uq c177567uq = this.A01;
        HashMap hashMap = new HashMap();
        hashMap.put("AudioEncoderConfig.bitRate", String.valueOf(c177567uq.A01));
        hashMap.put("AudioEncoderConfig.sampleRate", String.valueOf(c177567uq.A08));
        hashMap.put("AudioEncoderConfig.channelCount", String.valueOf(c177567uq.A03));
        hashMap.put("AudioEncoderConfig.bufferSize", String.valueOf(c177567uq.A02));
        hashMap.put("AudioEncoderConfig.pcmEncoding", String.valueOf(c177567uq.A07));
        hashMap.put("AudioEncoderConfig.dequeueInputBufferTimeoutMs", String.valueOf(c177567uq.A04));
        hashMap.put("AudioEncoderConfig.endOfStreamDequeueOutputBufferTimeoutUs", String.valueOf(c177567uq.A05));
        hashMap.put("AudioEncoderConfig.maxTryAgainLaterRetries", String.valueOf(c177567uq.A06));
        hashMap.put("AudioEncoderConfig.aacProfile", String.valueOf(c177567uq.A00));
        hashMap.put("AudioEncoderConfig.audioMimeType", String.valueOf("audio/mp4a-latm"));
        HashMap A00 = this.A00.A00();
        HashMap hashMap2 = new HashMap(hashMap.size() + A00.size());
        hashMap2.putAll(A00);
        hashMap2.putAll(hashMap);
        return hashMap2;
    }

    @Override // X.InterfaceC177537un
    public final EnumC176237sg CBK() {
        if (this instanceof C212499bI) {
            return EnumC176237sg.SUPERNOVA_AUDIO;
        }
        return EnumC176237sg.AUDIO;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public C177527um(InterfaceC178337w7 interfaceC178337w7, AGu aGu, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        Integer num6;
        int intValue;
        Integer num7;
        int i = 44100;
        int i2 = 16;
        EnumC177557up enumC177557up = C177547uo.A06;
        if (aGu != null && (num7 = aGu.A05) != null) {
            i = num7.intValue();
        } else if (num != null) {
            i = num.intValue();
        }
        int intValue2 = num2 != null ? num2.intValue() : 2;
        if (num3 != null && (intValue = num3.intValue()) != 1) {
            if (intValue == 2) {
                i2 = 12;
            } else {
                throw new RuntimeException("Channel count not supported");
            }
        }
        int intValue3 = num5 != null ? num5.intValue() : 4096;
        if (aGu != null) {
            Integer num8 = aGu.A06;
            r3 = num8 != null ? num8.intValue() : 64000;
            Boolean bool = aGu.A02;
            if (bool != null) {
                enumC177557up = bool.booleanValue() ? EnumC177557up.REAL_TIME_BASED_BUFFER_COUNTED : EnumC177557up.ZERO_BASED_BUFFER_COUNTED;
            }
        }
        C177547uo c177547uo = new C177547uo(enumC177557up, r3, i2, intValue2, intValue3, i);
        this.A00 = c177547uo;
        int i3 = 10000;
        int i4 = 200;
        int i5 = 1;
        int i6 = c177547uo.A00;
        int i7 = c177547uo.A03;
        int i8 = c177547uo.A04;
        int i9 = c177547uo.A02;
        int bitCount = Integer.bitCount(c177547uo.A01);
        if (aGu != null && (num6 = aGu.A04) != null) {
            i5 = num6.intValue();
        }
        if (interfaceC178337w7 != null) {
            i3 = (int) interfaceC178337w7.B5H(4);
            i4 = (int) interfaceC178337w7.B5H(5);
        }
        this.A01 = new C177567uq(i5, i6, i7, bitCount, num4 != null ? num4.intValue() : -1, i3, i4, i9, i8);
    }
}
