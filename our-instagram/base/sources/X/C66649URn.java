package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.URn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66649URn extends C0T6 implements XLW {
    public int A00;
    public int A01;
    public int A02;
    public UQL A03;
    public C66630UPs A04;
    public C66629UPr A05;
    public UQM A06;
    public VEH A07;
    public String A08;
    public final String A09;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C66649URn() {
        /*
            r12 = this;
            r1 = 0
            r8 = 0
            r11 = 511(0x1ff, float:7.16E-43)
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r9 = r8
            r10 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66649URn.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66649URn) {
                C66649URn c66649URn = (C66649URn) obj;
                if (!C14360o3.A0K(this.A08, c66649URn.A08) || this.A07 != c66649URn.A07 || !C14360o3.A0K(this.A05, c66649URn.A05) || !C14360o3.A0K(this.A04, c66649URn.A04) || !C14360o3.A0K(this.A03, c66649URn.A03) || this.A02 != c66649URn.A02 || !C14360o3.A0K(this.A06, c66649URn.A06) || this.A01 != c66649URn.A01 || this.A00 != c66649URn.A00) {
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
        return this.A08;
    }

    @Override // X.XBS
    public final String getTypeName() {
        return this.A09;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((AbstractC166997dE.A0J(this.A07, this.A08.hashCode() * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31;
        UQL uql = this.A03;
        if (uql != null) {
            i = uql.hashCode();
        }
        return ((AbstractC166997dE.A0J(this.A06, (((A0J + i) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.UQM, java.lang.Object] */
    public /* synthetic */ C66649URn(UQL uql, C66630UPs c66630UPs, C66629UPr c66629UPr, UQM uqm, VEH veh, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, int i3, int i4) {
        String A0j = AbstractC167017dG.A0j();
        VEH veh2 = VEH.A1d;
        ?? obj = new Object();
        obj.A05 = 0;
        obj.A08 = 0;
        obj.A0X = "";
        UQM.A01(obj);
        obj.A0E = null;
        UQM.A00(obj);
        obj.A0e = null;
        UQM.A02(obj);
        obj.A0F = null;
        this.A08 = A0j;
        this.A07 = veh2;
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
        this.A02 = 0;
        this.A06 = obj;
        this.A01 = 0;
        this.A00 = 0;
        this.A09 = "media_gallery_sticker";
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
}
