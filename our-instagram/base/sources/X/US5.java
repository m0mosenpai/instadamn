package X;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class US5 extends C0T6 implements XLW {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public C66248U5s A0C;
    public UQL A0D;
    public C66630UPs A0E;
    public C66629UPr A0F;
    public EnumC68144VDh A0G;
    public EnumC223009sf A0H;
    public EnumC68155VDz A0I;
    public VDY A0J;
    public VEH A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public List A0O;
    public boolean A0P;
    public boolean A0Q;
    public final String A0R;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof US5) {
                US5 us5 = (US5) obj;
                if (!C14360o3.A0K(this.A0N, us5.A0N) || this.A0K != us5.A0K || !C14360o3.A0K(this.A0F, us5.A0F) || !C14360o3.A0K(this.A0E, us5.A0E) || !C14360o3.A0K(this.A0D, us5.A0D) || this.A08 != us5.A08 || !C14360o3.A0K(this.A0L, us5.A0L) || Float.compare(this.A05, us5.A05) != 0 || !C14360o3.A0K(this.A0O, us5.A0O) || this.A0G != us5.A0G || Float.compare(this.A03, us5.A03) != 0 || Float.compare(this.A04, us5.A04) != 0 || this.A09 != us5.A09 || Float.compare(this.A06, us5.A06) != 0 || !C14360o3.A0K(this.A0C, us5.A0C) || Float.compare(this.A01, us5.A01) != 0 || Float.compare(this.A02, us5.A02) != 0 || Float.compare(this.A00, us5.A00) != 0 || this.A0B != us5.A0B || !C14360o3.A0K(this.A0M, us5.A0M) || this.A0P != us5.A0P || this.A07 != us5.A07 || this.A0J != us5.A0J || this.A0Q != us5.A0Q || this.A0H != us5.A0H || this.A0I != us5.A0I || this.A0A != us5.A0A) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XLW
    public final C66630UPs AzN() {
        return this.A0E;
    }

    @Override // X.XLW
    public final C66629UPr AzV() {
        return this.A0F;
    }

    @Override // X.XLW
    public final int Bss() {
        return this.A08;
    }

    @Override // X.XLW
    public final VEH C0n() {
        return this.A0K;
    }

    @Override // X.XLW
    public final UQL C8W() {
        return this.A0D;
    }

    @Override // X.XLW
    public final String CEI() {
        return this.A0N;
    }

    @Override // X.XBS
    public final String getTypeName() {
        return this.A0R;
    }

    public final int hashCode() {
        int i = 0;
        int A0D = (AbstractC167007dF.A0D(this.A0Q, (((AbstractC167007dF.A0D(this.A0P, (((AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00((AbstractC166997dE.A00((AbstractC166997dE.A00(AbstractC166997dE.A00((((AbstractC166997dE.A00((((((((((AbstractC166997dE.A0J(this.A0K, this.A0N.hashCode() * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31) + AbstractC167017dG.A0M(this.A0D)) * 31) + this.A08) * 31) + AbstractC167017dG.A0O(this.A0L)) * 31, this.A05) + AbstractC167017dG.A0M(this.A0O)) * 31) + AbstractC167017dG.A0M(this.A0G)) * 31, this.A03), this.A04) + this.A09) * 31, this.A06) + AbstractC167017dG.A0M(this.A0C)) * 31, this.A01), this.A02), this.A00) + this.A0B) * 31) + AbstractC167017dG.A0O(this.A0M)) * 31) + this.A07) * 31) + AbstractC167017dG.A0M(this.A0J)) * 31) + AbstractC167017dG.A0M(this.A0H)) * 31;
        EnumC68155VDz enumC68155VDz = this.A0I;
        if (enumC68155VDz != null) {
            i = enumC68155VDz.hashCode();
        }
        return ((A0D + i) * 31) + this.A0A;
    }

    public /* synthetic */ US5(C66248U5s c66248U5s, UQL uql, C66630UPs c66630UPs, C66629UPr c66629UPr, EnumC68144VDh enumC68144VDh, EnumC223009sf enumC223009sf, EnumC68155VDz enumC68155VDz, VDY vdy, VEH veh, String str, String str2, String str3, List list, DefaultConstructorMarker defaultConstructorMarker, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        String A0j = AbstractC167017dG.A0j();
        VEH veh2 = VEH.A1d;
        this.A0N = A0j;
        this.A0K = veh2;
        this.A0F = null;
        this.A0E = null;
        this.A0D = null;
        this.A08 = 0;
        this.A0L = null;
        this.A05 = 0.0f;
        this.A0O = null;
        this.A0G = null;
        this.A03 = 0.0f;
        this.A04 = 0.0f;
        this.A09 = 0;
        this.A06 = 0.0f;
        this.A0C = null;
        this.A01 = 0.0f;
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A0B = 0;
        this.A0M = null;
        this.A0P = false;
        this.A07 = 0;
        this.A0J = null;
        this.A0Q = false;
        this.A0H = null;
        this.A0I = null;
        this.A0A = 0;
        this.A0R = "media_text_sticker";
    }

    @Override // X.XLW
    public final void ETS(C66630UPs c66630UPs) {
        this.A0E = c66630UPs;
    }

    @Override // X.XLW
    public final void ETU(C66629UPr c66629UPr) {
        this.A0F = c66629UPr;
    }

    @Override // X.XLW
    public final void EdX(int i) {
        this.A08 = i;
    }

    @Override // X.XLW
    public final void Efq(UQL uql) {
        this.A0D = uql;
    }

    public US5() {
        String A0j = AbstractC167017dG.A0j();
        VEH veh = VEH.A1d;
        this.A0N = A0j;
        this.A0K = veh;
        this.A0F = null;
        this.A0E = null;
        this.A0D = null;
        this.A08 = 0;
        this.A0L = null;
        this.A05 = 0.0f;
        this.A0O = null;
        this.A0G = null;
        this.A03 = 0.0f;
        this.A04 = 0.0f;
        this.A09 = 0;
        this.A06 = 0.0f;
        this.A0C = null;
        this.A01 = 0.0f;
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A0B = 0;
        this.A0M = null;
        this.A0P = false;
        this.A07 = 0;
        this.A0J = null;
        this.A0Q = false;
        this.A0H = null;
        this.A0I = null;
        this.A0A = 0;
        this.A0R = "media_text_sticker";
    }
}
