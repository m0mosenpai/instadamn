package X;

/* renamed from: X.Mx2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51920Mx2 extends C0T6 implements InterfaceC30952Dj9 {
    public final C51759Mti A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51920Mx2) {
                C51920Mx2 c51920Mx2 = (C51920Mx2) obj;
                if (!C14360o3.A0K(this.A01, c51920Mx2.A01) || !C14360o3.A0K(this.A00, c51920Mx2.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC30952Dj9
    public final C51759Mti C5s() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public C51920Mx2(C51759Mti c51759Mti, String str) {
        AbstractC167017dG.A1P(str, c51759Mti);
        this.A01 = str;
        this.A00 = c51759Mti;
    }
}
