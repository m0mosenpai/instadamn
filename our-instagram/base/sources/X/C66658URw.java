package X;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.URw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66658URw extends C0T6 implements XLW {
    public int A00;
    public UQL A01;
    public C66630UPs A02;
    public C66629UPr A03;
    public VEH A04;
    public Integer A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public List A0B;
    public boolean A0C;
    public boolean A0D;
    public final String A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66658URw) {
                C66658URw c66658URw = (C66658URw) obj;
                if (!C14360o3.A0K(this.A09, c66658URw.A09) || this.A04 != c66658URw.A04 || !C14360o3.A0K(this.A03, c66658URw.A03) || !C14360o3.A0K(this.A02, c66658URw.A02) || !C14360o3.A0K(this.A01, c66658URw.A01) || this.A00 != c66658URw.A00 || !C14360o3.A0K(this.A07, c66658URw.A07) || !C14360o3.A0K(this.A08, c66658URw.A08) || !C14360o3.A0K(this.A05, c66658URw.A05) || this.A0D != c66658URw.A0D || this.A0C != c66658URw.A0C || !C14360o3.A0K(this.A0B, c66658URw.A0B) || !C14360o3.A0K(this.A0A, c66658URw.A0A) || !C14360o3.A0K(this.A06, c66658URw.A06)) {
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
        return this.A09;
    }

    @Override // X.XBS
    public final String getTypeName() {
        return this.A0E;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = AbstractC166997dE.A0J(this.A0B, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0D, (((AbstractC166997dE.A0K(this.A07, (((((((AbstractC166997dE.A0J(this.A04, this.A09.hashCode() * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31)));
        List list = this.A0A;
        if (list != null) {
            i = list.hashCode();
        }
        return ((A0J + i) * 31) + this.A06.hashCode();
    }

    public /* synthetic */ C66658URw(UQL uql, C66630UPs c66630UPs, C66629UPr c66629UPr, VEH veh, Integer num, String str, String str2, String str3, String str4, List list, List list2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z, boolean z2) {
        String A0j = AbstractC167017dG.A0j();
        VEH veh2 = VEH.A1d;
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 12);
        this.A09 = A0j;
        this.A04 = veh2;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
        this.A07 = "";
        this.A08 = null;
        this.A05 = null;
        this.A0D = false;
        this.A0C = false;
        this.A0B = c16930sl;
        this.A0A = null;
        this.A06 = "";
        this.A0E = "media_poll_v2_sticker";
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

    public C66658URw() {
        String A0j = AbstractC167017dG.A0j();
        VEH veh = VEH.A1d;
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 12);
        this.A09 = A0j;
        this.A04 = veh;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
        this.A07 = "";
        this.A08 = null;
        this.A05 = null;
        this.A0D = false;
        this.A0C = false;
        this.A0B = c16930sl;
        this.A0A = null;
        this.A06 = "";
        this.A0E = "media_poll_v2_sticker";
    }
}
