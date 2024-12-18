package X;

/* renamed from: X.Bft, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26065Bft extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C26065Bft(EnumC166067ba enumC166067ba, Integer num, String str, boolean z, boolean z2) {
        this.A00 = 0;
        this.A03 = str;
        this.A04 = null;
        this.A02 = num;
        this.A01 = enumC166067ba;
        this.A07 = false;
        this.A08 = z;
        this.A05 = z2;
        this.A06 = false;
    }

    public static /* synthetic */ C26065Bft A00(C26065Bft c26065Bft, C6R c6r, Integer num, String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3 = str2;
        Integer num2 = num;
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z2;
        C6R c6r2 = c6r;
        boolean z8 = z;
        String str4 = str;
        if ((i & 1) != 0) {
            str4 = c26065Bft.A03;
        }
        if ((i & 2) != 0) {
            z8 = c26065Bft.A07;
        }
        if ((i & 4) != 0) {
            c6r2 = (C6R) c26065Bft.A01;
        }
        if ((i & 8) != 0) {
            z7 = c26065Bft.A06;
        }
        if ((i & 16) != 0) {
            z6 = c26065Bft.A08;
        }
        if ((i & 32) != 0) {
            z5 = c26065Bft.A05;
        }
        if ((i & 64) != 0) {
            num2 = (Integer) c26065Bft.A02;
        }
        if ((i & 128) != 0) {
            str3 = c26065Bft.A04;
        }
        AbstractC167017dG.A1O(str4, c6r2);
        return new C26065Bft(c6r2, num2, str4, str3, z8, z7, z6, z5);
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C26065Bft) {
                    C26065Bft c26065Bft = (C26065Bft) obj;
                    if (c26065Bft.A00 != 1 || !C14360o3.A0K(this.A03, c26065Bft.A03) || this.A07 != c26065Bft.A07 || this.A01 != c26065Bft.A01 || this.A06 != c26065Bft.A06 || this.A08 != c26065Bft.A08 || this.A05 != c26065Bft.A05 || !C14360o3.A0K(this.A02, c26065Bft.A02) || !C14360o3.A0K(this.A04, c26065Bft.A04)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C26065Bft)) {
                return false;
            }
            C26065Bft c26065Bft2 = (C26065Bft) obj;
            if (c26065Bft2.A00 != 0 || !C14360o3.A0K(this.A03, c26065Bft2.A03) || !C14360o3.A0K(this.A04, c26065Bft2.A04) || this.A02 != c26065Bft2.A02 || this.A01 != c26065Bft2.A01 || this.A07 != c26065Bft2.A07 || this.A08 != c26065Bft2.A08 || this.A05 != c26065Bft2.A05 || this.A06 != c26065Bft2.A06) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        String str = this.A03;
        if (i != 0) {
            return ((AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A07, AbstractC166987dD.A0J(str)))))) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A04);
        }
        int A0J = (AbstractC166987dD.A0J(str) + AbstractC167017dG.A0O(this.A04)) * 31;
        Integer num = (Integer) this.A02;
        return AbstractC166987dD.A0K(this.A06, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0J(this.A01, AbstractC167017dG.A0L(num, AbstractC166107be.A01(num), A0J))))));
    }

    public C26065Bft(C6R c6r, Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = 1;
        this.A03 = str;
        this.A07 = z;
        this.A01 = c6r;
        this.A06 = z2;
        this.A08 = z3;
        this.A05 = z4;
        this.A02 = num;
        this.A04 = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26065Bft() {
        this(C6R.A03, null, "", null, false, false, false, false);
        this.A00 = 1;
    }
}
