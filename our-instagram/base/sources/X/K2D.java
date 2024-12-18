package X;

/* loaded from: classes8.dex */
public final class K2D extends C0T6 implements MRO {
    public final EnumC92794Ds A00;
    public final C38321qM A01;
    public final EnumC40111tc A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2D) {
                K2D k2d = (K2D) obj;
                if (!C14360o3.A0K(this.A08, k2d.A08) || this.A00 != k2d.A00 || !C14360o3.A0K(this.A03, k2d.A03) || !C14360o3.A0K(this.A06, k2d.A06) || this.A09 != k2d.A09 || !C14360o3.A0K(this.A01, k2d.A01) || !C14360o3.A0K(this.A07, k2d.A07) || this.A02 != k2d.A02 || this.A05 != k2d.A05 || this.A04 != k2d.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.MRO
    public final C2EY AxW() {
        return null;
    }

    @Override // X.MRO
    public final Long B2V() {
        return this.A06;
    }

    @Override // X.MRO
    public final Integer BJ4() {
        return this.A04;
    }

    @Override // X.MRO
    public final C38321qM BQN() {
        return this.A01;
    }

    @Override // X.MRO
    public final Integer BRP() {
        return this.A05;
    }

    @Override // X.MRO
    public final EnumC40111tc BRp() {
        return this.A02;
    }

    @Override // X.MRO
    public final String BZC() {
        return this.A07;
    }

    @Override // X.MRO
    public final String Bkv() {
        return null;
    }

    @Override // X.MRO
    public final EnumC92794Ds CAo() {
        return this.A00;
    }

    @Override // X.MRO
    public final Boolean CWi() {
        return this.A03;
    }

    @Override // X.MRO
    public final boolean CfW() {
        return this.A09;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A05((((((((AbstractC167007dF.A0D(this.A09, ((((((AbstractC167017dG.A0O(this.A08) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC46709KlS.A00(this.A05)) * 31, AbstractC46708KlR.A00(this.A04));
    }

    public K2D(EnumC92794Ds enumC92794Ds, C38321qM c38321qM, EnumC40111tc enumC40111tc, Boolean bool, Integer num, Integer num2, Long l, String str, String str2, boolean z) {
        this.A08 = str;
        this.A00 = enumC92794Ds;
        this.A03 = bool;
        this.A06 = l;
        this.A09 = z;
        this.A01 = c38321qM;
        this.A07 = str2;
        this.A02 = enumC40111tc;
        this.A05 = num;
        this.A04 = num2;
    }
}
