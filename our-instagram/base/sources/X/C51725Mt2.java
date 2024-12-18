package X;

/* renamed from: X.Mt2 */
/* loaded from: classes9.dex */
public final class C51725Mt2 extends C0T6 {
    public final C38687GzS A00;
    public final UQE A01;
    public final C67315Uk0 A02;
    public final EnumC53155NfA A03;
    public final String A04;
    public final C5Hc A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C51725Mt2() {
        this(null, null, null, EnumC53155NfA.A03, "", C5HZ.A01, false, false, false);
    }

    public static /* synthetic */ C51725Mt2 A00(C38687GzS c38687GzS, EnumC53155NfA enumC53155NfA, C51725Mt2 c51725Mt2, String str, C5Hc c5Hc, int i) {
        C67315Uk0 c67315Uk0;
        boolean z;
        boolean z2;
        boolean z3;
        C38687GzS c38687GzS2 = c38687GzS;
        C5Hc c5Hc2 = c5Hc;
        String str2 = str;
        EnumC53155NfA enumC53155NfA2 = enumC53155NfA;
        UQE uqe = null;
        if ((i & 1) != 0) {
            enumC53155NfA2 = c51725Mt2.A03;
        }
        if ((i & 2) != 0) {
            str2 = c51725Mt2.A04;
        }
        if ((i & 4) != 0) {
            c5Hc2 = c51725Mt2.A05;
        }
        if ((i & 8) != 0) {
            c67315Uk0 = c51725Mt2.A02;
        } else {
            c67315Uk0 = null;
        }
        if ((i & 16) != 0) {
            c38687GzS2 = c51725Mt2.A00;
        }
        if ((i & 32) != 0) {
            uqe = c51725Mt2.A01;
        }
        if ((i & 64) != 0) {
            z = c51725Mt2.A07;
        } else {
            z = false;
        }
        if ((i & 128) != 0) {
            z2 = c51725Mt2.A06;
        } else {
            z2 = false;
        }
        if ((i & 256) != 0) {
            z3 = c51725Mt2.A08;
        } else {
            z3 = false;
        }
        AbstractC167027dH.A12(enumC53155NfA2, str2, c5Hc2);
        return new C51725Mt2(c38687GzS2, uqe, c67315Uk0, enumC53155NfA2, str2, c5Hc2, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51725Mt2) {
                C51725Mt2 c51725Mt2 = (C51725Mt2) obj;
                if (this.A03 != c51725Mt2.A03 || !C14360o3.A0K(this.A04, c51725Mt2.A04) || !C14360o3.A0K(this.A05, c51725Mt2.A05) || !C14360o3.A0K(this.A02, c51725Mt2.A02) || !C14360o3.A0K(this.A00, c51725Mt2.A00) || !C14360o3.A0K(this.A01, c51725Mt2.A01) || this.A07 != c51725Mt2.A07 || this.A06 != c51725Mt2.A06 || this.A08 != c51725Mt2.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A08, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A07, (((((AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0G(this.A03))) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31)));
    }

    public C51725Mt2(C38687GzS c38687GzS, UQE uqe, C67315Uk0 c67315Uk0, EnumC53155NfA enumC53155NfA, String str, C5Hc c5Hc, boolean z, boolean z2, boolean z3) {
        this.A03 = enumC53155NfA;
        this.A04 = str;
        this.A05 = c5Hc;
        this.A02 = c67315Uk0;
        this.A00 = c38687GzS;
        this.A01 = uqe;
        this.A07 = z;
        this.A06 = z2;
        this.A08 = z3;
    }
}
