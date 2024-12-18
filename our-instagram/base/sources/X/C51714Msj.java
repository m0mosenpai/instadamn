package X;

/* renamed from: X.Msj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51714Msj extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final EnumC53159NfE A07;

    public C51714Msj() {
        this(null, 0, 0, 0, 0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51714Msj) {
                C51714Msj c51714Msj = (C51714Msj) obj;
                if (this.A06 != c51714Msj.A06 || this.A02 != c51714Msj.A02 || this.A03 != c51714Msj.A03 || this.A05 != c51714Msj.A05 || this.A04 != c51714Msj.A04 || this.A00 != c51714Msj.A00 || this.A01 != c51714Msj.A01 || this.A07 != c51714Msj.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((this.A06 * 31) + this.A02) * 31) + this.A03) * 31) + this.A05) * 31) + this.A04) * 31) + this.A00) * 31) + this.A01) * 31) + AbstractC167017dG.A0M(this.A07);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FloatingViewState(width=");
        MSX.A1O(A1C, this.A06);
        A1C.append(this.A02);
        A1C.append(", leftMargin=");
        A1C.append(this.A03);
        A1C.append(", topMargin=");
        A1C.append(this.A05);
        A1C.append(", rightMargin=");
        A1C.append(this.A04);
        A1C.append(", bottomMargin=");
        A1C.append(this.A00);
        A1C.append(", cornerRadius=");
        A1C.append(this.A01);
        A1C.append(", corner=");
        return AbstractC167017dG.A0o(this.A07, A1C);
    }

    public C51714Msj(EnumC53159NfE enumC53159NfE, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A06 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A05 = i4;
        this.A04 = i5;
        this.A00 = i6;
        this.A01 = i7;
        this.A07 = enumC53159NfE;
    }
}
