package X;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class US3 extends C0T6 implements XLW {
    public int A00;
    public UQL A01;
    public C66630UPs A02;
    public C66629UPr A03;
    public VEH A04;
    public Boolean A05;
    public Boolean A06;
    public Integer A07;
    public Integer A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public List A0H;
    public List A0I;
    public final String A0J;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof US3) {
                US3 us3 = (US3) obj;
                if (!C14360o3.A0K(this.A0G, us3.A0G) || this.A04 != us3.A04 || !C14360o3.A0K(this.A03, us3.A03) || !C14360o3.A0K(this.A02, us3.A02) || !C14360o3.A0K(this.A01, us3.A01) || this.A00 != us3.A00 || !C14360o3.A0K(this.A07, us3.A07) || !C14360o3.A0K(this.A09, us3.A09) || !C14360o3.A0K(this.A0A, us3.A0A) || !C14360o3.A0K(this.A05, us3.A05) || !C14360o3.A0K(this.A0B, us3.A0B) || !C14360o3.A0K(this.A0H, us3.A0H) || !C14360o3.A0K(this.A0C, us3.A0C) || !C14360o3.A0K(this.A0D, us3.A0D) || !C14360o3.A0K(this.A0E, us3.A0E) || !C14360o3.A0K(this.A0I, us3.A0I) || !C14360o3.A0K(this.A0F, us3.A0F) || !C14360o3.A0K(this.A08, us3.A08) || !C14360o3.A0K(this.A06, us3.A06)) {
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
        return this.A0G;
    }

    @Override // X.XBS
    public final String getTypeName() {
        return this.A0J;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((((((((((((((((((((((((((((((AbstractC166997dE.A0J(this.A04, this.A0G.hashCode() * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A0H)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0M(this.A0I)) * 31) + AbstractC167017dG.A0O(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31;
        Boolean bool = this.A06;
        if (bool != null) {
            i = bool.hashCode();
        }
        return A0J + i;
    }

    public /* synthetic */ US3(UQL uql, C66630UPs c66630UPs, C66629UPr c66629UPr, VEH veh, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        String A0j = AbstractC167017dG.A0j();
        VEH veh2 = VEH.A1d;
        this.A0G = A0j;
        this.A04 = veh2;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
        this.A07 = null;
        this.A09 = null;
        this.A0A = null;
        this.A05 = null;
        this.A0B = null;
        this.A0H = null;
        this.A0C = null;
        this.A0D = null;
        this.A0E = null;
        this.A0I = null;
        this.A0F = null;
        this.A08 = null;
        this.A06 = null;
        this.A0J = "media_quiz_sticker";
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

    public US3() {
        String A0j = AbstractC167017dG.A0j();
        VEH veh = VEH.A1d;
        this.A0G = A0j;
        this.A04 = veh;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
        this.A07 = null;
        this.A09 = null;
        this.A0A = null;
        this.A05 = null;
        this.A0B = null;
        this.A0H = null;
        this.A0C = null;
        this.A0D = null;
        this.A0E = null;
        this.A0I = null;
        this.A0F = null;
        this.A08 = null;
        this.A06 = null;
        this.A0J = "media_quiz_sticker";
    }
}
