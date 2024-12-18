package X;

import android.text.TextPaint;

/* renamed from: X.FRa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34715FRa {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final TextPaint A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C34715FRa) {
                C34715FRa c34715FRa = (C34715FRa) obj;
                if (!C14360o3.A0K(this.A07, c34715FRa.A07) || this.A05 != c34715FRa.A05 || this.A02 != c34715FRa.A02 || this.A03 != c34715FRa.A03 || Float.compare(this.A00, c34715FRa.A00) != 0 || Float.compare(this.A01, c34715FRa.A01) != 0 || this.A08 != c34715FRa.A08 || this.A04 != c34715FRa.A04 || this.A06 != c34715FRa.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D = (AbstractC167007dF.A0D(this.A08, (((((((((AbstractC166987dD.A0G(this.A07) + this.A05) * 31) + this.A02) * 31) + this.A03) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01)) * 31) + this.A04) * 31;
        long j = this.A06;
        return A0D + ((int) (j ^ (j >>> 32)));
    }

    public C34715FRa(TextPaint textPaint, float f, float f2, int i, int i2, int i3, int i4, long j, boolean z) {
        this.A07 = textPaint;
        this.A05 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = f;
        this.A01 = f2;
        this.A08 = z;
        this.A04 = i4;
        this.A06 = j;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TextDisplayParams(textPaint=");
        A1C.append(this.A07);
        A1C.append(", viewWidth=");
        A1C.append(this.A05);
        A1C.append(", compoundPaddingLeft=");
        A1C.append(this.A02);
        A1C.append(", compoundPaddingRight=");
        A1C.append(this.A03);
        A1C.append(", lineSpacingExtra=");
        A1C.append(this.A00);
        A1C.append(", lineSpacingMultiplier=");
        A1C.append(this.A01);
        A1C.append(", includeFontPadding=");
        A1C.append(this.A08);
        A1C.append(AbstractC111324zv.A00(571));
        A1C.append(this.A04);
        A1C.append(", wordIntervalMs=");
        A1C.append(this.A06);
        return AbstractC167017dG.A0p(A1C);
    }
}
