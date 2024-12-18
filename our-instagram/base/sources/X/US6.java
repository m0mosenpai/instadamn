package X;

/* loaded from: classes11.dex */
public final class US6 extends C0T6 implements XLW {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public UQL A06;
    public C66630UPs A07;
    public C66629UPr A08;
    public VEH A09;
    public Long A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public final String A0V;

    public US6(VEH veh, String str) {
        this.A0O = str;
        this.A09 = veh;
        this.A08 = null;
        this.A07 = null;
        this.A06 = null;
        this.A04 = 0;
        this.A0I = "";
        this.A0B = "";
        this.A0J = "";
        this.A0N = "";
        this.A0M = null;
        this.A0K = "";
        this.A0R = false;
        this.A0P = false;
        this.A0Q = false;
        this.A0U = false;
        this.A0L = null;
        this.A0C = null;
        this.A0A = null;
        this.A0E = null;
        this.A0G = null;
        this.A0F = null;
        this.A0D = null;
        this.A0S = false;
        this.A0T = false;
        this.A0H = null;
        this.A05 = 0;
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A0V = "ig_media_sticker";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof US6) {
                US6 us6 = (US6) obj;
                if (!C14360o3.A0K(this.A0O, us6.A0O) || this.A09 != us6.A09 || !C14360o3.A0K(this.A08, us6.A08) || !C14360o3.A0K(this.A07, us6.A07) || !C14360o3.A0K(this.A06, us6.A06) || this.A04 != us6.A04 || !C14360o3.A0K(this.A0I, us6.A0I) || !C14360o3.A0K(this.A0B, us6.A0B) || !C14360o3.A0K(this.A0J, us6.A0J) || !C14360o3.A0K(this.A0N, us6.A0N) || !C14360o3.A0K(this.A0M, us6.A0M) || !C14360o3.A0K(this.A0K, us6.A0K) || this.A0R != us6.A0R || this.A0P != us6.A0P || this.A0Q != us6.A0Q || this.A0U != us6.A0U || !C14360o3.A0K(this.A0L, us6.A0L) || !C14360o3.A0K(this.A0C, us6.A0C) || !C14360o3.A0K(this.A0A, us6.A0A) || !C14360o3.A0K(this.A0E, us6.A0E) || !C14360o3.A0K(this.A0G, us6.A0G) || !C14360o3.A0K(this.A0F, us6.A0F) || !C14360o3.A0K(this.A0D, us6.A0D) || this.A0S != us6.A0S || this.A0T != us6.A0T || !C14360o3.A0K(this.A0H, us6.A0H) || this.A05 != us6.A05 || this.A00 != us6.A00 || this.A01 != us6.A01 || this.A02 != us6.A02 || this.A03 != us6.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XLW
    public final C66630UPs AzN() {
        return this.A07;
    }

    @Override // X.XLW
    public final C66629UPr AzV() {
        return this.A08;
    }

    @Override // X.XLW
    public final int Bss() {
        return this.A04;
    }

    @Override // X.XLW
    public final VEH C0n() {
        return this.A09;
    }

    @Override // X.XLW
    public final UQL C8W() {
        return this.A06;
    }

    @Override // X.XLW
    public final String CEI() {
        return this.A0O;
    }

    @Override // X.XBS
    public final String getTypeName() {
        return this.A0V;
    }

    public final int hashCode() {
        int i = 0;
        int A0D = AbstractC167007dF.A0D(this.A0T, AbstractC167007dF.A0D(this.A0S, (((((((((((((AbstractC167007dF.A0D(this.A0U, AbstractC167007dF.A0D(this.A0Q, AbstractC167007dF.A0D(this.A0P, AbstractC167007dF.A0D(this.A0R, AbstractC166997dE.A0K(this.A0K, (AbstractC166997dE.A0K(this.A0N, AbstractC166997dE.A0K(this.A0J, AbstractC166997dE.A0K(this.A0B, AbstractC166997dE.A0K(this.A0I, (((((((AbstractC166997dE.A0J(this.A09, this.A0O.hashCode() * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + this.A04) * 31)))) + AbstractC167017dG.A0O(this.A0M)) * 31))))) + AbstractC167017dG.A0O(this.A0L)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A0G)) * 31) + AbstractC167017dG.A0O(this.A0F)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31));
        String str = this.A0H;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((((((A0D + i) * 31) + this.A05) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03;
    }

    @Override // X.XLW
    public final void ETS(C66630UPs c66630UPs) {
        this.A07 = c66630UPs;
    }

    @Override // X.XLW
    public final void ETU(C66629UPr c66629UPr) {
        this.A08 = c66629UPr;
    }

    @Override // X.XLW
    public final void EdX(int i) {
        this.A04 = i;
    }

    @Override // X.XLW
    public final void Efq(UQL uql) {
        this.A06 = uql;
    }

    public US6() {
        this(VEH.A1d, AbstractC167017dG.A0j());
    }
}
