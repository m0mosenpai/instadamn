package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.URl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66647URl extends C0T6 implements XLW {
    public int A00;
    public long A01;
    public UQL A02;
    public C66630UPs A03;
    public C66629UPr A04;
    public VEH A05;
    public String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66647URl) {
                C66647URl c66647URl = (C66647URl) obj;
                if (!C14360o3.A0K(this.A06, c66647URl.A06) || this.A05 != c66647URl.A05 || !C14360o3.A0K(this.A04, c66647URl.A04) || !C14360o3.A0K(this.A03, c66647URl.A03) || !C14360o3.A0K(this.A02, c66647URl.A02) || this.A00 != c66647URl.A00 || this.A01 != c66647URl.A01) {
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
        return this.A00;
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
        return this.A07;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((AbstractC166997dE.A0J(this.A05, this.A06.hashCode() * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31;
        UQL uql = this.A02;
        if (uql != null) {
            i = uql.hashCode();
        }
        return ((((A0J + i) * 31) + this.A00) * 31) + AbstractC25228BEl.A03(this.A01);
    }

    public /* synthetic */ C66647URl(UQL uql, C66630UPs c66630UPs, C66629UPr c66629UPr, VEH veh, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, long j) {
        String A0j = AbstractC167017dG.A0j();
        VEH veh2 = VEH.A1d;
        this.A06 = A0j;
        this.A05 = veh2;
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
        this.A01 = 0L;
        this.A07 = "media_date_time_sticker";
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
        this.A00 = i;
    }

    @Override // X.XLW
    public final void Efq(UQL uql) {
        this.A02 = uql;
    }

    public C66647URl() {
        String A0j = AbstractC167017dG.A0j();
        VEH veh = VEH.A1d;
        this.A06 = A0j;
        this.A05 = veh;
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
        this.A01 = 0L;
        this.A07 = "media_date_time_sticker";
    }
}
