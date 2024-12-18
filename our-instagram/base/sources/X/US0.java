package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class US0 extends C0T6 implements XLW {
    public int A00;
    public UQL A01;
    public C66630UPs A02;
    public C66629UPr A03;
    public UPU A04;
    public VEH A05;
    public Float A06;
    public Float A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public final String A0G;

    /* JADX WARN: Multi-variable type inference failed */
    public US0() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 65535, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof US0) {
                US0 us0 = (US0) obj;
                if (!C14360o3.A0K(this.A0E, us0.A0E) || this.A05 != us0.A05 || !C14360o3.A0K(this.A03, us0.A03) || !C14360o3.A0K(this.A02, us0.A02) || !C14360o3.A0K(this.A01, us0.A01) || this.A00 != us0.A00 || this.A0F != us0.A0F || !C14360o3.A0K(this.A08, us0.A08) || !C14360o3.A0K(this.A06, us0.A06) || !C14360o3.A0K(this.A04, us0.A04) || !C14360o3.A0K(this.A09, us0.A09) || !C14360o3.A0K(this.A0A, us0.A0A) || !C14360o3.A0K(this.A0B, us0.A0B) || !C14360o3.A0K(this.A0C, us0.A0C) || !C14360o3.A0K(this.A07, us0.A07) || !C14360o3.A0K(this.A0D, us0.A0D)) {
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
        return this.A0E;
    }

    @Override // X.XBS
    public final String getTypeName() {
        return this.A0G;
    }

    public final int hashCode() {
        int i = 0;
        int A0K = (((AbstractC166997dE.A0K(this.A0B, AbstractC166997dE.A0K(this.A0A, AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0J(this.A04, (((AbstractC167007dF.A0D(this.A0F, (((((((AbstractC166997dE.A0J(this.A05, this.A0E.hashCode() * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31)))) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31;
        String str = this.A0D;
        if (str != null) {
            i = str.hashCode();
        }
        return A0K + i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.UPU] */
    public /* synthetic */ US0(UQL uql, C66630UPs c66630UPs, C66629UPr c66629UPr, UPU upu, VEH veh, Float f, Float f2, String str, String str2, String str3, String str4, String str5, String str6, String str7, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        String A0j = AbstractC167017dG.A0j();
        VEH veh2 = VEH.A1d;
        ?? obj = new Object();
        obj.A07 = "";
        obj.A09 = "";
        obj.A06 = null;
        obj.A00 = null;
        obj.A08 = null;
        obj.A04 = null;
        obj.A03 = null;
        obj.A05 = null;
        obj.A01 = null;
        obj.A02 = null;
        this.A0E = A0j;
        this.A05 = veh2;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
        this.A0F = false;
        this.A08 = null;
        this.A06 = null;
        this.A04 = obj;
        this.A09 = "";
        this.A0A = "";
        this.A0B = "";
        this.A0C = null;
        this.A07 = null;
        this.A0D = null;
        this.A0G = "media_visual_comment_reply_sticker";
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
}
