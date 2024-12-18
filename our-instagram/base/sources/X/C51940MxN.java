package X;

/* renamed from: X.MxN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51940MxN extends C0T6 implements InterfaceC57877Plh {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C51940MxN(C51759Mti c51759Mti, C18920wW c18920wW, int i) {
        this.A00 = i;
        C14360o3.A0B(c18920wW, 2);
        this.A02 = c51759Mti;
        this.A01 = c18920wW;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C51940MxN) {
            C51940MxN c51940MxN = (C51940MxN) obj;
            if (c51940MxN.A00 != i || !C14360o3.A0K(this.A02, c51940MxN.A02) || !C14360o3.A0K(this.A01, c51940MxN.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A02));
    }
}
