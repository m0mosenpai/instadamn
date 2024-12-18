package X;

/* renamed from: X.Ms3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51672Ms3 extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Integer A05;
    public final C17u A06;

    public C51672Ms3(Integer num, C17u c17u, int i, int i2, int i3, int i4, int i5) {
        C14360o3.A0B(num, 1);
        this.A05 = num;
        this.A04 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A06 = c17u;
        this.A00 = i4;
        this.A03 = i5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51672Ms3) {
                C51672Ms3 c51672Ms3 = (C51672Ms3) obj;
                if (this.A05 != c51672Ms3.A05 || this.A04 != c51672Ms3.A04 || this.A02 != c51672Ms3.A02 || this.A01 != c51672Ms3.A01 || !C14360o3.A0K(this.A06, c51672Ms3.A06) || this.A00 != c51672Ms3.A00 || this.A03 != c51672Ms3.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A05;
        return ((AbstractC166997dE.A0J(this.A06, ((((((AbstractC25230BEn.A0C(num, AbstractC53763NqF.A00(num)) * 31) + this.A04) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31) + this.A03;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BitrateLadderRung(quality=");
        Integer num = this.A05;
        if (num != null) {
            str = AbstractC53763NqF.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", width=");
        MSX.A1O(A1C, this.A04);
        A1C.append(this.A02);
        A1C.append(", frameRate=");
        A1C.append(this.A01);
        A1C.append(", bitRateRange=");
        A1C.append(this.A06);
        A1C.append(", captureFrameRate=");
        A1C.append(this.A00);
        A1C.append(", iFrameInterval=");
        return AbstractC25236BEt.A0Z(A1C, this.A03);
    }
}
