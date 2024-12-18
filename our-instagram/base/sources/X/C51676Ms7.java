package X;

import java.util.List;

/* renamed from: X.Ms7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51676Ms7 extends C0T6 {
    public int A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Boolean A06;
    public final Integer A07;
    public final String A08;
    public final List A09;

    public C51676Ms7(Boolean bool, Integer num, String str, List list, float f, int i, int i2, int i3, int i4, int i5) {
        C14360o3.A0B(str, 5);
        this.A09 = list;
        this.A02 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A08 = str;
        this.A05 = i4;
        this.A06 = bool;
        this.A00 = i5;
        this.A07 = num;
        this.A01 = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51676Ms7) {
                C51676Ms7 c51676Ms7 = (C51676Ms7) obj;
                if (!C14360o3.A0K(this.A09, c51676Ms7.A09) || this.A02 != c51676Ms7.A02 || this.A04 != c51676Ms7.A04 || this.A03 != c51676Ms7.A03 || !C14360o3.A0K(this.A08, c51676Ms7.A08) || this.A05 != c51676Ms7.A05 || !C14360o3.A0K(this.A06, c51676Ms7.A06) || this.A00 != c51676Ms7.A00 || !C14360o3.A0K(this.A07, c51676Ms7.A07) || Float.compare(this.A01, c51676Ms7.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AbstractC166997dE.A0K(this.A08, ((((((AbstractC167017dG.A0M(this.A09) * 31) + this.A02) * 31) + this.A04) * 31) + this.A03) * 31) + this.A05) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + this.A00) * 31) + AbstractC166997dE.A0I(this.A07)) * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AudioTrackMetadata(floatAmplitudes=");
        A1C.append(this.A09);
        A1C.append(", fullVideoDurationMs=");
        A1C.append(this.A02);
        A1C.append(", snippetStartTimeMs=");
        A1C.append(this.A04);
        A1C.append(", snippetDurationMs=");
        A1C.append(this.A03);
        A1C.append(", audioTrackOverlayID=");
        A1C.append(this.A08);
        A1C.append(", totalTrackDuration=");
        A1C.append(this.A05);
        A1C.append(", isRecordingVoiceoverSegment=");
        A1C.append(this.A06);
        A1C.append(", titleViewExtraFrontPadding=");
        A1C.append(this.A00);
        A1C.append(", audioFilterNameResId=");
        A1C.append(this.A07);
        A1C.append(", speed=");
        A1C.append(this.A01);
        return AbstractC167017dG.A0p(A1C);
    }
}
