package X;

/* renamed from: X.VvH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69780VvH {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69780VvH) {
                C69780VvH c69780VvH = (C69780VvH) obj;
                if (this.A05 != c69780VvH.A05 || this.A04 != c69780VvH.A04 || this.A02 != c69780VvH.A02 || this.A03 != c69780VvH.A03 || this.A01 != c69780VvH.A01 || this.A00 != c69780VvH.A00 || this.A07 != c69780VvH.A07 || this.A06 != c69780VvH.A06 || this.A08 != c69780VvH.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((((((((((((this.A05 * 31) + this.A04) * 31) + this.A02) * 31) + this.A03) * 31) + this.A01) * 31) + this.A00) * 31) + this.A07) * 31) + this.A06) * 31;
        int i2 = 1237;
        if (this.A08) {
            i2 = 1231;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OnComputePositionInfo(screenWidth=");
        sb.append(this.A05);
        sb.append(", screenHeight=");
        sb.append(this.A04);
        sb.append(", anchorX=");
        sb.append(this.A02);
        sb.append(", anchorY=");
        sb.append(this.A03);
        sb.append(", anchorWidth=");
        sb.append(this.A01);
        sb.append(", anchorHeight=");
        sb.append(this.A00);
        sb.append(", tooltipIntrinsicWidth=");
        sb.append(this.A07);
        sb.append(", tooltipIntrinsicHeight=");
        sb.append(this.A06);
        sb.append(", isRtl=");
        return AbstractC25236BEt.A0a(sb, this.A08);
    }

    public C69780VvH(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.A05 = i;
        this.A04 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A01 = i5;
        this.A00 = i6;
        this.A07 = i7;
        this.A06 = i8;
        this.A08 = z;
    }
}
