package X;

/* loaded from: classes4.dex */
public final class AGu {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;

    public AGu(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4) {
        this.A05 = num2;
        this.A01 = bool;
        this.A06 = num3;
        this.A00 = null;
        this.A07 = num4;
        this.A04 = num;
        this.A03 = null;
        this.A02 = null;
    }

    public AGu(A9K a9k) {
        this.A05 = null;
        this.A01 = null;
        this.A06 = a9k.A04;
        this.A00 = a9k.A00;
        this.A07 = null;
        this.A04 = a9k.A03;
        this.A03 = a9k.A02;
        this.A02 = a9k.A01;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AudioVideoConfig{audioSampleRateHz=");
        A1C.append(this.A05);
        A1C.append(", recordWithoutEffects=");
        A1C.append(this.A01);
        A1C.append(", motionFactor=");
        A1C.append((Object) null);
        A1C.append(", maximumDurationUs=");
        A1C.append((Object) null);
        A1C.append(", bitrate=");
        A1C.append(this.A06);
        A1C.append(", deviceOutputType=");
        A1C.append((Object) null);
        A1C.append(", customVideoFrameRate=");
        A1C.append((Object) null);
        A1C.append(", enableOrientation=");
        A1C.append(this.A00);
        A1C.append(", enableNativeVideoRecording=");
        A1C.append((Object) null);
        A1C.append(", videoMimeType=");
        A1C.append((String) null);
        A1C.append(", muxingFormat=");
        Integer num = this.A07;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "WEBM";
                    break;
                case 2:
                    str = "OUTPUT_FORMAT_DEFAULT";
                    break;
                default:
                    str = "MPEG_4";
                    break;
            }
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", aacProfile=");
        A1C.append(this.A04);
        A1C.append(", useSupernovaCustomAudio=");
        A1C.append(this.A03);
        A1C.append(", useRealTimeBasedPresentationTimeCounting=");
        A1C.append(this.A02);
        return AbstractC167027dH.A0R(A1C);
    }
}
