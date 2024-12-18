package X;

/* renamed from: X.Bfk */
/* loaded from: classes5.dex */
public final class C26057Bfk extends C0T6 {
    public final InterfaceC30798DgZ A00;
    public final C26009Bex A01;
    public final C5Hc A02;
    public final C5Hc A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C26057Bfk(InterfaceC30798DgZ interfaceC30798DgZ, C26009Bex c26009Bex, C5Hc c5Hc, C5Hc c5Hc2, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(c5Hc2, 7);
        this.A04 = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A07 = z4;
        this.A01 = c26009Bex;
        this.A03 = c5Hc;
        this.A02 = c5Hc2;
        this.A00 = interfaceC30798DgZ;
    }

    public static /* synthetic */ C26057Bfk A00(InterfaceC30798DgZ interfaceC30798DgZ, C26057Bfk c26057Bfk, C26009Bex c26009Bex, C5Hc c5Hc, int i, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        InterfaceC30798DgZ interfaceC30798DgZ2 = interfaceC30798DgZ;
        C5Hc c5Hc2 = c5Hc;
        C26009Bex c26009Bex2 = c26009Bex;
        boolean z5 = z2;
        boolean z6 = z;
        C5Hc c5Hc3 = null;
        if ((i & 1) != 0) {
            z6 = c26057Bfk.A04;
        }
        if ((i & 2) != 0) {
            z3 = c26057Bfk.A05;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z4 = c26057Bfk.A06;
        } else {
            z4 = false;
        }
        if ((i & 8) != 0) {
            z5 = c26057Bfk.A07;
        }
        if ((i & 16) != 0) {
            c26009Bex2 = c26057Bfk.A01;
        }
        if ((i & 32) != 0) {
            c5Hc3 = c26057Bfk.A03;
        }
        if ((i & 64) != 0) {
            c5Hc2 = c26057Bfk.A02;
        }
        if ((i & 128) != 0) {
            interfaceC30798DgZ2 = c26057Bfk.A00;
        }
        C14360o3.A0B(c5Hc3, 5);
        AbstractC167017dG.A1U(c5Hc2, interfaceC30798DgZ2);
        return new C26057Bfk(interfaceC30798DgZ2, c26009Bex2, c5Hc3, c5Hc2, z6, z3, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26057Bfk) {
                C26057Bfk c26057Bfk = (C26057Bfk) obj;
                if (this.A04 != c26057Bfk.A04 || this.A05 != c26057Bfk.A05 || this.A06 != c26057Bfk.A06 || this.A07 != c26057Bfk.A07 || !C14360o3.A0K(this.A01, c26057Bfk.A01) || !C14360o3.A0K(this.A03, c26057Bfk.A03) || !C14360o3.A0K(this.A02, c26057Bfk.A02) || !C14360o3.A0K(this.A00, c26057Bfk.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, (AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, AbstractC25225BEi.A08(this.A04)))) + AbstractC167017dG.A0M(this.A01)) * 31)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26057Bfk() {
        /*
            r9 = this;
            r2 = 0
            r5 = 1
            r6 = 0
            X.5HZ r3 = X.C5HZ.A01
            X.CsM r1 = X.C29095CsM.A00
            r0 = r9
            r4 = r3
            r7 = r6
            r8 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26057Bfk.<init>():void");
    }
}
