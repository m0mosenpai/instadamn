package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.URo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66650URo extends C0T6 implements XLW {
    public float A00;
    public int A01;
    public int A02;
    public UQL A03;
    public C66630UPs A04;
    public C66629UPr A05;
    public VEH A06;
    public String A07;
    public String A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66650URo) {
                C66650URo c66650URo = (C66650URo) obj;
                if (!C14360o3.A0K(this.A08, c66650URo.A08) || this.A06 != c66650URo.A06 || !C14360o3.A0K(this.A05, c66650URo.A05) || !C14360o3.A0K(this.A04, c66650URo.A04) || !C14360o3.A0K(this.A03, c66650URo.A03) || this.A02 != c66650URo.A02 || !C14360o3.A0K(this.A07, c66650URo.A07) || Float.compare(this.A00, c66650URo.A00) != 0 || this.A01 != c66650URo.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XLW
    public final C66630UPs AzN() {
        return this.A04;
    }

    @Override // X.XLW
    public final C66629UPr AzV() {
        return this.A05;
    }

    @Override // X.XLW
    public final int Bss() {
        return this.A02;
    }

    @Override // X.XLW
    public final VEH C0n() {
        return this.A06;
    }

    @Override // X.XLW
    public final UQL C8W() {
        return this.A03;
    }

    @Override // X.XLW
    public final String CEI() {
        return this.A08;
    }

    @Override // X.XBS
    public final String getTypeName() {
        return this.A09;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((AbstractC166997dE.A0J(this.A06, this.A08.hashCode() * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31;
        UQL uql = this.A03;
        if (uql != null) {
            i = uql.hashCode();
        }
        return AbstractC166997dE.A00(AbstractC166997dE.A0K(this.A07, (((A0J + i) * 31) + this.A02) * 31), this.A00) + this.A01;
    }

    public /* synthetic */ C66650URo(UQL uql, C66630UPs c66630UPs, C66629UPr c66629UPr, VEH veh, String str, String str2, DefaultConstructorMarker defaultConstructorMarker, float f, int i, int i2, int i3) {
        String A0j = AbstractC167017dG.A0j();
        VEH veh2 = VEH.A1d;
        this.A08 = A0j;
        this.A06 = veh2;
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
        this.A02 = 0;
        this.A07 = "";
        this.A00 = 0.0f;
        this.A01 = 0;
        this.A09 = "media_hashtag_sticker";
    }

    @Override // X.XLW
    public final void ETS(C66630UPs c66630UPs) {
        this.A04 = c66630UPs;
    }

    @Override // X.XLW
    public final void ETU(C66629UPr c66629UPr) {
        this.A05 = c66629UPr;
    }

    @Override // X.XLW
    public final void EdX(int i) {
        this.A02 = i;
    }

    @Override // X.XLW
    public final void Efq(UQL uql) {
        this.A03 = uql;
    }

    public C66650URo() {
        String A0j = AbstractC167017dG.A0j();
        VEH veh = VEH.A1d;
        this.A08 = A0j;
        this.A06 = veh;
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
        this.A02 = 0;
        this.A07 = "";
        this.A00 = 0.0f;
        this.A01 = 0;
        this.A09 = "media_hashtag_sticker";
    }
}
