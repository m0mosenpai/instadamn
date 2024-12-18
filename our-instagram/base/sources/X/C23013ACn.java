package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;

/* renamed from: X.ACn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23013ACn {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final MediaEffect A05;
    public final Float A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23013ACn) {
                C23013ACn c23013ACn = (C23013ACn) obj;
                if (!C14360o3.A0K(this.A07, c23013ACn.A07) || this.A03 != c23013ACn.A03 || this.A02 != c23013ACn.A02 || Float.compare(this.A01, c23013ACn.A01) != 0 || this.A04 != c23013ACn.A04 || !C14360o3.A0K(this.A08, c23013ACn.A08) || !C14360o3.A0K(this.A05, c23013ACn.A05) || Float.compare(this.A00, c23013ACn.A00) != 0 || !C14360o3.A0K(this.A06, c23013ACn.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00((((((AbstractC166997dE.A00((((AbstractC166987dD.A0J(this.A07) + this.A03) * 31) + this.A02) * 31, this.A01) + this.A04) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31, this.A00) + AbstractC166997dE.A0I(this.A06);
    }

    public C23013ACn(MediaEffect mediaEffect, Float f, String str, String str2, float f2, float f3, int i, int i2, int i3) {
        this.A07 = str;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = f2;
        this.A04 = i3;
        this.A08 = str2;
        this.A05 = mediaEffect;
        this.A00 = f3;
        this.A06 = f;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AudioOverlay(filePath=");
        A1C.append(this.A07);
        A1C.append(", seekTimeMs=");
        A1C.append(this.A03);
        A1C.append(", durationMs=");
        A1C.append(this.A02);
        A1C.append(", volume=");
        A1C.append(this.A01);
        A1C.append(", videoStartTimeMs=");
        A1C.append(this.A04);
        A1C.append(AbstractC111324zv.A00(1464));
        A1C.append(this.A08);
        A1C.append(", audioFilter=");
        A1C.append(this.A05);
        A1C.append(", timeScale=");
        A1C.append(this.A00);
        A1C.append(", pitch=");
        return AbstractC167017dG.A0o(this.A06, A1C);
    }
}
