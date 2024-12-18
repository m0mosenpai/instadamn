package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.URv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66657URv extends C0T6 implements XLW {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public UQL A06;
    public C66630UPs A07;
    public C66629UPr A08;
    public VEH A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public final String A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66657URv) {
                C66657URv c66657URv = (C66657URv) obj;
                if (!C14360o3.A0K(this.A0D, c66657URv.A0D) || this.A09 != c66657URv.A09 || !C14360o3.A0K(this.A08, c66657URv.A08) || !C14360o3.A0K(this.A07, c66657URv.A07) || !C14360o3.A0K(this.A06, c66657URv.A06) || this.A05 != c66657URv.A05 || !C14360o3.A0K(this.A0A, c66657URv.A0A) || !C14360o3.A0K(this.A0C, c66657URv.A0C) || Float.compare(this.A00, c66657URv.A00) != 0 || Float.compare(this.A02, c66657URv.A02) != 0 || !C14360o3.A0K(this.A0B, c66657URv.A0B) || Float.compare(this.A01, c66657URv.A01) != 0 || this.A03 != c66657URv.A03 || this.A04 != c66657URv.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XLW
    public final C66630UPs AzN() {
        return this.A07;
    }

    @Override // X.XLW
    public final C66629UPr AzV() {
        return this.A08;
    }

    @Override // X.XLW
    public final int Bss() {
        return this.A05;
    }

    @Override // X.XLW
    public final VEH C0n() {
        return this.A09;
    }

    @Override // X.XLW
    public final UQL C8W() {
        return this.A06;
    }

    @Override // X.XLW
    public final String CEI() {
        return this.A0D;
    }

    @Override // X.XBS
    public final String getTypeName() {
        return this.A0E;
    }

    public final int hashCode() {
        int i = 0;
        int A00 = AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A0K(this.A0C, AbstractC166997dE.A0K(this.A0A, (((((((AbstractC166997dE.A0J(this.A09, this.A0D.hashCode() * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + this.A05) * 31)), this.A00), this.A02);
        String str = this.A0B;
        if (str != null) {
            i = str.hashCode();
        }
        return ((AbstractC166997dE.A00((A00 + i) * 31, this.A01) + this.A03) * 31) + this.A04;
    }

    public /* synthetic */ C66657URv(UQL uql, C66630UPs c66630UPs, C66629UPr c66629UPr, VEH veh, String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker, float f, float f2, float f3, int i, int i2, int i3, int i4) {
        String A0j = AbstractC167017dG.A0j();
        VEH veh2 = VEH.A1d;
        this.A0D = A0j;
        this.A09 = veh2;
        this.A08 = null;
        this.A07 = null;
        this.A06 = null;
        this.A05 = 0;
        this.A0A = "";
        this.A0C = "";
        this.A00 = 0.0f;
        this.A02 = 0.0f;
        this.A0B = null;
        this.A01 = 0.0f;
        this.A03 = 0;
        this.A04 = 0;
        this.A0E = "media_poll_sticker";
    }

    @Override // X.XLW
    public final void ETS(C66630UPs c66630UPs) {
        this.A07 = c66630UPs;
    }

    @Override // X.XLW
    public final void ETU(C66629UPr c66629UPr) {
        this.A08 = c66629UPr;
    }

    @Override // X.XLW
    public final void EdX(int i) {
        this.A05 = i;
    }

    @Override // X.XLW
    public final void Efq(UQL uql) {
        this.A06 = uql;
    }

    public C66657URv() {
        String A0j = AbstractC167017dG.A0j();
        VEH veh = VEH.A1d;
        this.A0D = A0j;
        this.A09 = veh;
        this.A08 = null;
        this.A07 = null;
        this.A06 = null;
        this.A05 = 0;
        this.A0A = "";
        this.A0C = "";
        this.A00 = 0.0f;
        this.A02 = 0.0f;
        this.A0B = null;
        this.A01 = 0.0f;
        this.A03 = 0;
        this.A04 = 0;
        this.A0E = "media_poll_sticker";
    }
}
