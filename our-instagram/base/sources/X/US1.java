package X;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class US1 extends C0T6 implements XLW {
    public int A00;
    public UQL A01;
    public C66630UPs A02;
    public C66629UPr A03;
    public EnumC68152VDw A04;
    public VEH A05;
    public Boolean A06;
    public Boolean A07;
    public Long A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public List A0G;
    public final String A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof US1) {
                US1 us1 = (US1) obj;
                if (!C14360o3.A0K(this.A0F, us1.A0F) || this.A05 != us1.A05 || !C14360o3.A0K(this.A03, us1.A03) || !C14360o3.A0K(this.A02, us1.A02) || !C14360o3.A0K(this.A01, us1.A01) || this.A00 != us1.A00 || !C14360o3.A0K(this.A09, us1.A09) || !C14360o3.A0K(this.A06, us1.A06) || !C14360o3.A0K(this.A0A, us1.A0A) || !C14360o3.A0K(this.A0B, us1.A0B) || !C14360o3.A0K(this.A0C, us1.A0C) || !C14360o3.A0K(this.A0D, us1.A0D) || !C14360o3.A0K(this.A08, us1.A08) || this.A04 != us1.A04 || !C14360o3.A0K(this.A0G, us1.A0G) || !C14360o3.A0K(this.A0E, us1.A0E) || !C14360o3.A0K(this.A07, us1.A07)) {
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
        return this.A05;
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
        return this.A0H;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((((((((((((((((((((((((((AbstractC166997dE.A0J(this.A05, this.A0F.hashCode() * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A0G)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31;
        Boolean bool = this.A07;
        if (bool != null) {
            i = bool.hashCode();
        }
        return A0J + i;
    }

    public /* synthetic */ US1(UQL uql, C66630UPs c66630UPs, C66629UPr c66629UPr, EnumC68152VDw enumC68152VDw, VEH veh, Boolean bool, Boolean bool2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        String A0j = AbstractC167017dG.A0j();
        VEH veh2 = VEH.A1d;
        this.A0F = A0j;
        this.A05 = veh2;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
        this.A09 = null;
        this.A06 = null;
        this.A0A = null;
        this.A0B = null;
        this.A0C = null;
        this.A0D = null;
        this.A08 = null;
        this.A04 = null;
        this.A0G = null;
        this.A0E = null;
        this.A07 = null;
        this.A0H = "media_question_sticker";
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

    public US1() {
        String A0j = AbstractC167017dG.A0j();
        VEH veh = VEH.A1d;
        this.A0F = A0j;
        this.A05 = veh;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
        this.A09 = null;
        this.A06 = null;
        this.A0A = null;
        this.A0B = null;
        this.A0C = null;
        this.A0D = null;
        this.A08 = null;
        this.A04 = null;
        this.A0G = null;
        this.A0E = null;
        this.A07 = null;
        this.A0H = "media_question_sticker";
    }
}
