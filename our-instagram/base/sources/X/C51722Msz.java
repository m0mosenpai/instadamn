package X;

/* renamed from: X.Msz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51722Msz extends C0T6 {
    public final int A00 = 0;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public C51722Msz(String str, String str2, boolean z, boolean z2) {
        AbstractC167007dF.A1D(str, 1, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A03 = z2;
    }

    public static final C51722Msz A00(String str, String str2, boolean z) {
        AbstractC167017dG.A1N(str, str2);
        return new C51722Msz(str, str2, z, true);
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C51722Msz) {
                    C51722Msz c51722Msz = (C51722Msz) obj;
                    if (c51722Msz.A00 == 1 && C14360o3.A0K(this.A01, c51722Msz.A01) && C14360o3.A0K(this.A02, c51722Msz.A02) && this.A04 == c51722Msz.A04) {
                        z = this.A03;
                        z2 = c51722Msz.A03;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C51722Msz)) {
                return false;
            }
            C51722Msz c51722Msz2 = (C51722Msz) obj;
            if (c51722Msz2.A00 != 0 || !C14360o3.A0K(this.A02, c51722Msz2.A02) || this.A03 != c51722Msz2.A03 || !C14360o3.A0K(this.A01, c51722Msz2.A01)) {
                return false;
            }
            z = this.A04;
            z2 = c51722Msz2.A04;
        } else {
            return true;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K;
        boolean z;
        if (this.A00 != 0) {
            A0K = AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01)));
            z = this.A03;
        } else {
            A0K = AbstractC166997dE.A0K(this.A01, AbstractC167007dF.A0D(this.A03, AbstractC166987dD.A0J(this.A02)));
            z = this.A04;
        }
        return AbstractC166987dD.A0K(z, A0K);
    }

    public C51722Msz(String str, String str2, int i, boolean z, boolean z2) {
        AbstractC167017dG.A1Q(str, str2);
        this.A02 = str;
        this.A03 = z;
        this.A01 = str2;
        this.A04 = z2;
    }
}
