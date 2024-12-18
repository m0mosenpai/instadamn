package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.URu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66656URu extends C0T6 implements XLW {
    public float A00;
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
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public final String A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66656URu) {
                C66656URu c66656URu = (C66656URu) obj;
                if (!C14360o3.A0K(this.A0B, c66656URu.A0B) || this.A08 != c66656URu.A08 || !C14360o3.A0K(this.A07, c66656URu.A07) || !C14360o3.A0K(this.A06, c66656URu.A06) || !C14360o3.A0K(this.A05, c66656URu.A05) || this.A04 != c66656URu.A04 || !C14360o3.A0K(this.A0A, c66656URu.A0A) || !C14360o3.A0K(this.A09, c66656URu.A09) || this.A03 != c66656URu.A03 || this.A02 != c66656URu.A02 || this.A01 != c66656URu.A01 || Float.compare(this.A00, c66656URu.A00) != 0 || this.A0D != c66656URu.A0D || this.A0C != c66656URu.A0C) {
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
        return this.A0B;
    }

    @Override // X.XBS
    public final String getTypeName() {
        return this.A0E;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((((((((AbstractC166997dE.A0J(this.A08, this.A0B.hashCode() * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + this.A04) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31;
        String str = this.A09;
        if (str != null) {
            i = str.hashCode();
        }
        int A0D = AbstractC167007dF.A0D(this.A0D, AbstractC166997dE.A00((((((((A0J + i) * 31) + this.A03) * 31) + this.A02) * 31) + this.A01) * 31, this.A00));
        int i2 = 1237;
        if (this.A0C) {
            i2 = 1231;
        }
        return A0D + i2;
    }

    public /* synthetic */ C66656URu(UQL uql, C66630UPs c66630UPs, C66629UPr c66629UPr, VEH veh, String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker, float f, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        String A0j = AbstractC167017dG.A0j();
        VEH veh2 = VEH.A1d;
        this.A0B = A0j;
        this.A08 = veh2;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = 0;
        this.A0A = null;
        this.A09 = null;
        this.A03 = 0;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0.0f;
        this.A0D = false;
        this.A0C = false;
        this.A0E = "media_igtv_share_sticker";
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

    public C66656URu() {
        String A0j = AbstractC167017dG.A0j();
        VEH veh = VEH.A1d;
        this.A0B = A0j;
        this.A08 = veh;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = 0;
        this.A0A = null;
        this.A09 = null;
        this.A03 = 0;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0.0f;
        this.A0D = false;
        this.A0C = false;
        this.A0E = "media_igtv_share_sticker";
    }
}
