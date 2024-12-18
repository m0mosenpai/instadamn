package X;

/* renamed from: X.5oi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127045oi {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public final int A04;
    public final int A05;
    public final InterfaceC122825hI A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C127045oi) {
                C127045oi c127045oi = (C127045oi) obj;
                if (!C14360o3.A0K(this.A06, c127045oi.A06) || this.A05 != c127045oi.A05 || this.A04 != c127045oi.A04 || this.A03 != c127045oi.A03 || this.A02 != c127045oi.A02 || Float.compare(this.A01, c127045oi.A01) != 0 || Float.compare(this.A00, c127045oi.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((this.A06.hashCode() * 31) + this.A05) * 31) + this.A04) * 31) + this.A03) * 31) + this.A02) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ParagraphInfo(paragraph=");
        sb.append(this.A06);
        sb.append(", startIndex=");
        sb.append(this.A05);
        sb.append(", endIndex=");
        sb.append(this.A04);
        sb.append(", startLineIndex=");
        sb.append(this.A03);
        sb.append(", endLineIndex=");
        sb.append(this.A02);
        sb.append(", top=");
        sb.append(this.A01);
        sb.append(", bottom=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final long A00(long j, boolean z) {
        if (z) {
            long j2 = C5C2.A01;
            if (j == j2) {
                return j2;
            }
        }
        int i = this.A05;
        return C60Z.A00(((int) (j >> 32)) + i, ((int) (j & 4294967295L)) + i);
    }

    public C127045oi(InterfaceC122825hI interfaceC122825hI, float f, float f2, int i, int i2, int i3, int i4) {
        this.A06 = interfaceC122825hI;
        this.A05 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A01 = f;
        this.A00 = f2;
    }
}
