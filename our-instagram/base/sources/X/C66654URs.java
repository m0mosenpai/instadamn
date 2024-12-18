package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.URs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66654URs extends C0T6 implements XLW {
    public float A00;
    public int A01;
    public int A02;
    public UQL A03;
    public C66630UPs A04;
    public C66629UPr A05;
    public UPU A06;
    public VEH A07;
    public String A08;
    public String A09;
    public final String A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66654URs) {
                C66654URs c66654URs = (C66654URs) obj;
                if (!C14360o3.A0K(this.A09, c66654URs.A09) || this.A07 != c66654URs.A07 || !C14360o3.A0K(this.A05, c66654URs.A05) || !C14360o3.A0K(this.A04, c66654URs.A04) || !C14360o3.A0K(this.A03, c66654URs.A03) || this.A02 != c66654URs.A02 || !C14360o3.A0K(this.A08, c66654URs.A08) || Float.compare(this.A00, c66654URs.A00) != 0 || this.A01 != c66654URs.A01 || !C14360o3.A0K(this.A06, c66654URs.A06)) {
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
        return this.A07;
    }

    @Override // X.XLW
    public final UQL C8W() {
        return this.A03;
    }

    @Override // X.XLW
    public final String CEI() {
        return this.A09;
    }

    @Override // X.XBS
    public final String getTypeName() {
        return this.A0A;
    }

    public final int hashCode() {
        int i = 0;
        int A00 = (AbstractC166997dE.A00(AbstractC166997dE.A0K(this.A08, (((((((AbstractC166997dE.A0J(this.A07, this.A09.hashCode() * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + this.A02) * 31), this.A00) + this.A01) * 31;
        UPU upu = this.A06;
        if (upu != null) {
            i = upu.hashCode();
        }
        return A00 + i;
    }

    public /* synthetic */ C66654URs(UQL uql, C66630UPs c66630UPs, C66629UPr c66629UPr, UPU upu, VEH veh, String str, String str2, DefaultConstructorMarker defaultConstructorMarker, float f, int i, int i2, int i3) {
        String A0j = AbstractC167017dG.A0j();
        VEH veh2 = VEH.A1d;
        this.A09 = A0j;
        this.A07 = veh2;
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
        this.A02 = 0;
        this.A08 = "";
        this.A00 = 0.0f;
        this.A01 = 0;
        this.A06 = null;
        this.A0A = "media_mention_sticker";
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

    public C66654URs() {
        String A0j = AbstractC167017dG.A0j();
        VEH veh = VEH.A1d;
        this.A09 = A0j;
        this.A07 = veh;
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
        this.A02 = 0;
        this.A08 = "";
        this.A00 = 0.0f;
        this.A01 = 0;
        this.A06 = null;
        this.A0A = "media_mention_sticker";
    }
}
