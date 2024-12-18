package X;

/* renamed from: X.5W4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5W4 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final C118115Vv A05;
    public final C122225gI A06;
    public final C122235gJ A07;

    public final C5W4 A00(C5W4 c5w4) {
        if (c5w4 == null) {
            return this;
        }
        int i = c5w4.A02;
        int i2 = c5w4.A03;
        long j = c5w4.A04;
        C122225gI c122225gI = c5w4.A06;
        return C5WX.A00(this, c5w4.A05, c122225gI, c5w4.A07, i, i2, c5w4.A01, c5w4.A00, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5W4) {
                C5W4 c5w4 = (C5W4) obj;
                if (this.A02 == c5w4.A02 && this.A03 == c5w4.A03) {
                    long j = this.A04;
                    long j2 = c5w4.A04;
                    C118145Vy[] c118145VyArr = C118135Vx.A02;
                    if (j != j2 || !C14360o3.A0K(this.A06, c5w4.A06) || !C14360o3.A0K(this.A05, c5w4.A05) || this.A01 != c5w4.A01 || this.A00 != c5w4.A00 || !C14360o3.A0K(this.A07, c5w4.A07)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = ((this.A02 * 31) + this.A03) * 31;
        long j = this.A04;
        C118145Vy[] c118145VyArr = C118135Vx.A02;
        int i4 = (i3 + ((int) (j ^ (j >>> 32)))) * 31;
        C122225gI c122225gI = this.A06;
        int i5 = 0;
        if (c122225gI != null) {
            i = c122225gI.hashCode();
        } else {
            i = 0;
        }
        int i6 = (i4 + i) * 31;
        C118115Vv c118115Vv = this.A05;
        if (c118115Vv != null) {
            i2 = c118115Vv.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (((((i6 + i2) * 31 * 31) + this.A01) * 31) + this.A00) * 31;
        C122235gJ c122235gJ = this.A07;
        if (c122235gJ != null) {
            i5 = c122235gJ.hashCode();
        }
        return i7 + i5;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ParagraphStyle(textAlign=");
        sb.append((Object) C28253Ccy.A00(this.A02));
        sb.append(", textDirection=");
        sb.append((Object) C28254Ccz.A00(this.A03));
        sb.append(", lineHeight=");
        sb.append((Object) C118135Vx.A02(this.A04));
        sb.append(", textIndent=");
        sb.append(this.A06);
        sb.append(", platformStyle=");
        sb.append(this.A05);
        sb.append(", lineHeightStyle=");
        sb.append((Object) null);
        sb.append(", lineBreak=");
        sb.append((Object) AbstractC27484CBf.A00(this.A01));
        sb.append(", hyphens=");
        int i = this.A00;
        if (i == 1) {
            str = "Hyphens.None";
        } else if (i == 2) {
            str = "Hyphens.Auto";
        } else if (i == Integer.MIN_VALUE) {
            str = "Hyphens.Unspecified";
        } else {
            str = "Invalid";
        }
        sb.append((Object) str);
        sb.append(", textMotion=");
        sb.append(this.A07);
        sb.append(')');
        return sb.toString();
    }

    public C5W4(C118115Vv c118115Vv, C122225gI c122225gI, C122235gJ c122235gJ, int i, int i2, int i3, int i4, long j) {
        this.A02 = i;
        this.A03 = i2;
        this.A04 = j;
        this.A06 = c122225gI;
        this.A05 = c118115Vv;
        this.A01 = i3;
        this.A00 = i4;
        this.A07 = c122235gJ;
        if (j != C118135Vx.A01) {
            float A00 = C118135Vx.A00(j);
            if (A00 < 0.0f) {
                throw new IllegalStateException(AnonymousClass001.A0F("lineHeight can't be negative (", ')', A00));
            }
        }
    }
}
