package X;

import java.util.List;

/* renamed from: X.URx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66659URx extends C0T6 implements XLW {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public UQL A04;
    public C66630UPs A05;
    public C66629UPr A06;
    public VE6 A07;
    public VEH A08;
    public Boolean A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public List A0E;
    public final String A0F;

    public C66659URx(VE6 ve6, VEH veh, Boolean bool, String str, String str2, List list, int i, int i2, int i3) {
        C14360o3.A0B(list, 7);
        this.A0D = str;
        this.A08 = veh;
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
        this.A03 = 0;
        this.A0E = list;
        this.A01 = i;
        this.A07 = ve6;
        this.A00 = i2;
        this.A02 = i3;
        this.A0B = str2;
        this.A09 = bool;
        this.A0C = null;
        this.A0A = null;
        this.A0F = "media_karaoke_caption_sticker";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66659URx) {
                C66659URx c66659URx = (C66659URx) obj;
                if (!C14360o3.A0K(this.A0D, c66659URx.A0D) || this.A08 != c66659URx.A08 || !C14360o3.A0K(this.A06, c66659URx.A06) || !C14360o3.A0K(this.A05, c66659URx.A05) || !C14360o3.A0K(this.A04, c66659URx.A04) || this.A03 != c66659URx.A03 || !C14360o3.A0K(this.A0E, c66659URx.A0E) || this.A01 != c66659URx.A01 || this.A07 != c66659URx.A07 || this.A00 != c66659URx.A00 || this.A02 != c66659URx.A02 || !C14360o3.A0K(this.A0B, c66659URx.A0B) || !C14360o3.A0K(this.A09, c66659URx.A09) || !C14360o3.A0K(this.A0C, c66659URx.A0C) || !C14360o3.A0K(this.A0A, c66659URx.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XLW
    public final C66630UPs AzN() {
        return this.A05;
    }

    @Override // X.XLW
    public final C66629UPr AzV() {
        return this.A06;
    }

    @Override // X.XLW
    public final int Bss() {
        return this.A03;
    }

    @Override // X.XLW
    public final VEH C0n() {
        return this.A08;
    }

    @Override // X.XLW
    public final UQL C8W() {
        return this.A04;
    }

    @Override // X.XLW
    public final String CEI() {
        return this.A0D;
    }

    @Override // X.XBS
    public final String getTypeName() {
        return this.A0F;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((((((((AbstractC166997dE.A0J(this.A07, (AbstractC166997dE.A0J(this.A0E, (((((((AbstractC166997dE.A0J(this.A08, this.A0D.hashCode() * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + this.A03) * 31) + this.A01) * 31) + this.A00) * 31) + this.A02) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31;
        String str = this.A0A;
        if (str != null) {
            i = str.hashCode();
        }
        return A0J + i;
    }

    @Override // X.XLW
    public final void ETS(C66630UPs c66630UPs) {
        this.A05 = c66630UPs;
    }

    @Override // X.XLW
    public final void ETU(C66629UPr c66629UPr) {
        this.A06 = c66629UPr;
    }

    @Override // X.XLW
    public final void EdX(int i) {
        this.A03 = i;
    }

    @Override // X.XLW
    public final void Efq(UQL uql) {
        this.A04 = uql;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C66659URx() {
        /*
            r10 = this;
            r3 = 0
            java.lang.String r4 = X.AbstractC167017dG.A0j()
            X.VEH r2 = X.VEH.A1d
            r7 = 0
            X.0sl r6 = X.C16930sl.A00
            X.VE6 r1 = X.VE6.A06
            r0 = r10
            r5 = r3
            r8 = r7
            r9 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66659URx.<init>():void");
    }
}
