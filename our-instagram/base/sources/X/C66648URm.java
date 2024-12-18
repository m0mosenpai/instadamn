package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.URm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66648URm extends C0T6 implements XLW {
    public int A00;
    public UQL A01;
    public C66630UPs A02;
    public C66629UPr A03;
    public C66613UPa A04;
    public VEH A05;
    public Integer A06;
    public String A07;
    public final String A08;

    /* JADX WARN: Multi-variable type inference failed */
    public C66648URm() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 255);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66648URm) {
                C66648URm c66648URm = (C66648URm) obj;
                if (!C14360o3.A0K(this.A07, c66648URm.A07) || this.A05 != c66648URm.A05 || !C14360o3.A0K(this.A03, c66648URm.A03) || !C14360o3.A0K(this.A02, c66648URm.A02) || !C14360o3.A0K(this.A01, c66648URm.A01) || this.A00 != c66648URm.A00 || !C14360o3.A0K(this.A04, c66648URm.A04) || !C14360o3.A0K(this.A06, c66648URm.A06)) {
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
        return this.A07;
    }

    @Override // X.XBS
    public final String getTypeName() {
        return this.A08;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = AbstractC166997dE.A0J(this.A04, (((((((AbstractC166997dE.A0J(this.A05, this.A07.hashCode() * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00) * 31);
        Integer num = this.A06;
        if (num != null) {
            i = num.hashCode();
        }
        return A0J + i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.UPa] */
    public /* synthetic */ C66648URm(UQL uql, C66630UPs c66630UPs, C66629UPr c66629UPr, C66613UPa c66613UPa, VEH veh, Integer num, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        String A0j = AbstractC167017dG.A0j();
        VEH veh2 = VEH.A1d;
        ?? obj = new Object();
        obj.A0E = null;
        obj.A0F = null;
        obj.A0G = null;
        obj.A04 = null;
        obj.A05 = null;
        obj.A06 = null;
        obj.A0A = null;
        obj.A0H = null;
        obj.A0I = null;
        obj.A0B = null;
        obj.A0C = null;
        obj.A0J = null;
        obj.A00 = null;
        obj.A01 = null;
        obj.A02 = null;
        obj.A03 = null;
        obj.A07 = null;
        obj.A0K = null;
        obj.A0D = null;
        obj.A0L = null;
        obj.A0M = null;
        obj.A08 = null;
        obj.A09 = null;
        obj.A0N = null;
        this.A07 = A0j;
        this.A05 = veh2;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
        this.A04 = obj;
        this.A06 = null;
        this.A08 = "media_location_sticker";
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
