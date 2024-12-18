package X;

/* renamed from: X.MxA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51927MxA extends C0T6 implements InterfaceC57867PlX {
    public final int A00;
    public final C51759Mti A01;
    public final C51759Mti A02;
    public final C51759Mti A03;
    public final C51759Mti A04;

    public C51927MxA(C51759Mti c51759Mti, C51759Mti c51759Mti2, C51759Mti c51759Mti3, C51759Mti c51759Mti4, int i) {
        C14360o3.A0B(c51759Mti, 1);
        this.A04 = c51759Mti;
        this.A01 = c51759Mti2;
        this.A00 = i;
        this.A02 = c51759Mti3;
        this.A03 = c51759Mti4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51927MxA) {
                C51927MxA c51927MxA = (C51927MxA) obj;
                if (!C14360o3.A0K(this.A04, c51927MxA.A04) || !C14360o3.A0K(this.A01, c51927MxA.A01) || this.A00 != c51927MxA.A00 || !C14360o3.A0K(this.A02, c51927MxA.A02) || !C14360o3.A0K(this.A03, c51927MxA.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, (((((AbstractC166987dD.A0G(this.A04) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00) * 31) + AbstractC166997dE.A0I(this.A02)) * 31);
    }
}
