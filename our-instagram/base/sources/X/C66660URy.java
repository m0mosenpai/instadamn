package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.URy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66660URy extends C0T6 implements XLW {
    public int A00;
    public UQL A01;
    public C66630UPs A02;
    public C66629UPr A03;
    public VEH A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public final String A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66660URy) {
                C66660URy c66660URy = (C66660URy) obj;
                if (!C14360o3.A0K(this.A0F, c66660URy.A0F) || this.A04 != c66660URy.A04 || !C14360o3.A0K(this.A03, c66660URy.A03) || !C14360o3.A0K(this.A02, c66660URy.A02) || !C14360o3.A0K(this.A01, c66660URy.A01) || this.A00 != c66660URy.A00 || !C14360o3.A0K(this.A09, c66660URy.A09) || !C14360o3.A0K(this.A0A, c66660URy.A0A) || !C14360o3.A0K(this.A0B, c66660URy.A0B) || !C14360o3.A0K(this.A06, c66660URy.A06) || !C14360o3.A0K(this.A0C, c66660URy.A0C) || !C14360o3.A0K(this.A0D, c66660URy.A0D) || !C14360o3.A0K(this.A07, c66660URy.A07) || !C14360o3.A0K(this.A0E, c66660URy.A0E) || !C14360o3.A0K(this.A05, c66660URy.A05) || !C14360o3.A0K(this.A08, c66660URy.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XLW
    public final C66630UPs AzN() {
        return this.A02;
    }

    @Override // X.XLW
    public final C66629UPr AzV() {
        return this.A03;
    }

    @Override // X.XLW
    public final int Bss() {
        return this.A00;
    }

    @Override // X.XLW
    public final VEH C0n() {
        return this.A04;
    }

    @Override // X.XLW
    public final UQL C8W() {
        return this.A01;
    }

    @Override // X.XLW
    public final String CEI() {
        return this.A0F;
    }

    @Override // X.XBS
    public final String getTypeName() {
        return this.A0G;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((((((((((((((((((((((((AbstractC166997dE.A0J(this.A04, this.A0F.hashCode() * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31;
        Boolean bool = this.A08;
        if (bool != null) {
            i = bool.hashCode();
        }
        return A0J + i;
    }

    public /* synthetic */ C66660URy(UQL uql, C66630UPs c66630UPs, C66629UPr c66629UPr, VEH veh, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3, String str4, String str5, String str6, String str7, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        String A0j = AbstractC167017dG.A0j();
        VEH veh2 = VEH.A1d;
        this.A0F = A0j;
        this.A04 = veh2;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
        this.A09 = null;
        this.A0A = null;
        this.A0B = null;
        this.A06 = null;
        this.A0C = null;
        this.A0D = null;
        this.A07 = null;
        this.A0E = null;
        this.A05 = null;
        this.A08 = null;
        this.A0G = "media_link_sticker";
    }

    @Override // X.XLW
    public final void ETS(C66630UPs c66630UPs) {
        this.A02 = c66630UPs;
    }

    @Override // X.XLW
    public final void ETU(C66629UPr c66629UPr) {
        this.A03 = c66629UPr;
    }

    @Override // X.XLW
    public final void EdX(int i) {
        this.A00 = i;
    }

    @Override // X.XLW
    public final void Efq(UQL uql) {
        this.A01 = uql;
    }

    public C66660URy() {
        String A0j = AbstractC167017dG.A0j();
        VEH veh = VEH.A1d;
        this.A0F = A0j;
        this.A04 = veh;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
        this.A09 = null;
        this.A0A = null;
        this.A0B = null;
        this.A06 = null;
        this.A0C = null;
        this.A0D = null;
        this.A07 = null;
        this.A0E = null;
        this.A05 = null;
        this.A08 = null;
        this.A0G = "media_link_sticker";
    }
}