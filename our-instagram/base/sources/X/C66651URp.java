package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.URp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66651URp extends C0T6 implements XLW {
    public int A00;
    public int A01;
    public UQL A02;
    public C66630UPs A03;
    public C66629UPr A04;
    public VEH A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66651URp) {
                C66651URp c66651URp = (C66651URp) obj;
                if (!C14360o3.A0K(this.A06, c66651URp.A06) || this.A05 != c66651URp.A05 || !C14360o3.A0K(this.A04, c66651URp.A04) || !C14360o3.A0K(this.A03, c66651URp.A03) || !C14360o3.A0K(this.A02, c66651URp.A02) || this.A01 != c66651URp.A01 || this.A00 != c66651URp.A00 || this.A07 != c66651URp.A07 || this.A08 != c66651URp.A08) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XLW
    public final C66630UPs AzN() {
        return this.A03;
    }

    @Override // X.XLW
    public final C66629UPr AzV() {
        return this.A04;
    }

    @Override // X.XLW
    public final int Bss() {
        return this.A01;
    }

    @Override // X.XLW
    public final VEH C0n() {
        return this.A05;
    }

    @Override // X.XLW
    public final UQL C8W() {
        return this.A02;
    }

    @Override // X.XLW
    public final String CEI() {
        return this.A06;
    }

    @Override // X.XBS
    public final String getTypeName() {
        return this.A09;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((AbstractC166997dE.A0J(this.A05, this.A06.hashCode() * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31;
        UQL uql = this.A02;
        if (uql != null) {
            i = uql.hashCode();
        }
        int A0D = AbstractC167007dF.A0D(this.A07, (((((A0J + i) * 31) + this.A01) * 31) + this.A00) * 31);
        int i2 = 1237;
        if (this.A08) {
            i2 = 1231;
        }
        return A0D + i2;
    }

    public /* synthetic */ C66651URp(UQL uql, C66630UPs c66630UPs, C66629UPr c66629UPr, VEH veh, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, int i3, boolean z, boolean z2) {
        String A0j = AbstractC167017dG.A0j();
        VEH veh2 = VEH.A1d;
        this.A06 = A0j;
        this.A05 = veh2;
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A01 = 0;
        this.A00 = 0;
        this.A07 = false;
        this.A08 = false;
        this.A09 = "media_internal_sticker";
    }

    @Override // X.XLW
    public final void ETS(C66630UPs c66630UPs) {
        this.A03 = c66630UPs;
    }

    @Override // X.XLW
    public final void ETU(C66629UPr c66629UPr) {
        this.A04 = c66629UPr;
    }

    @Override // X.XLW
    public final void EdX(int i) {
        this.A01 = i;
    }

    @Override // X.XLW
    public final void Efq(UQL uql) {
        this.A02 = uql;
    }

    public C66651URp() {
        String A0j = AbstractC167017dG.A0j();
        VEH veh = VEH.A1d;
        this.A06 = A0j;
        this.A05 = veh;
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A01 = 0;
        this.A00 = 0;
        this.A07 = false;
        this.A08 = false;
        this.A09 = "media_internal_sticker";
    }
}
