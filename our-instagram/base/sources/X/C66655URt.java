package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.URt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66655URt extends C0T6 implements XLW {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public UQL A05;
    public C66630UPs A06;
    public C66629UPr A07;
    public VEH A08;
    public String A09;
    public String A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66655URt) {
                C66655URt c66655URt = (C66655URt) obj;
                if (!C14360o3.A0K(this.A0A, c66655URt.A0A) || this.A08 != c66655URt.A08 || !C14360o3.A0K(this.A07, c66655URt.A07) || !C14360o3.A0K(this.A06, c66655URt.A06) || !C14360o3.A0K(this.A05, c66655URt.A05) || this.A04 != c66655URt.A04 || !C14360o3.A0K(this.A09, c66655URt.A09) || this.A01 != c66655URt.A01 || this.A03 != c66655URt.A03 || this.A02 != c66655URt.A02 || this.A00 != c66655URt.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XLW
    public final C66630UPs AzN() {
        return this.A06;
    }

    @Override // X.XLW
    public final C66629UPr AzV() {
        return this.A07;
    }

    @Override // X.XLW
    public final int Bss() {
        return this.A04;
    }

    @Override // X.XLW
    public final VEH C0n() {
        return this.A08;
    }

    @Override // X.XLW
    public final UQL C8W() {
        return this.A05;
    }

    @Override // X.XLW
    public final String CEI() {
        return this.A0A;
    }

    @Override // X.XBS
    public final String getTypeName() {
        return this.A0B;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((AbstractC166997dE.A0J(this.A08, this.A0A.hashCode() * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31;
        UQL uql = this.A05;
        if (uql != null) {
            i = uql.hashCode();
        }
        return ((((((AbstractC166997dE.A0K(this.A09, (((A0J + i) * 31) + this.A04) * 31) + this.A01) * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public /* synthetic */ C66655URt(UQL uql, C66630UPs c66630UPs, C66629UPr c66629UPr, VEH veh, String str, String str2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, int i3, int i4, int i5, int i6) {
        String A0j = AbstractC167017dG.A0j();
        VEH veh2 = VEH.A1d;
        this.A0A = A0j;
        this.A08 = veh2;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = 0;
        this.A09 = "";
        this.A01 = 0;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A0B = "media_bitmap_sticker";
    }

    @Override // X.XLW
    public final void ETS(C66630UPs c66630UPs) {
        this.A06 = c66630UPs;
    }

    @Override // X.XLW
    public final void ETU(C66629UPr c66629UPr) {
        this.A07 = c66629UPr;
    }

    @Override // X.XLW
    public final void EdX(int i) {
        this.A04 = i;
    }

    @Override // X.XLW
    public final void Efq(UQL uql) {
        this.A05 = uql;
    }

    public C66655URt() {
        String A0j = AbstractC167017dG.A0j();
        VEH veh = VEH.A1d;
        this.A0A = A0j;
        this.A08 = veh;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = 0;
        this.A09 = "";
        this.A01 = 0;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A0B = "media_bitmap_sticker";
    }
}
