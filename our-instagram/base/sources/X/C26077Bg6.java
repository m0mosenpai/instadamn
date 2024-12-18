package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.Bg6 */
/* loaded from: classes5.dex */
public final class C26077Bg6 extends C0T6 {
    public final int A00;
    public final C51760Mtj A01;
    public final C51760Mtj A02;
    public final C61 A03;
    public final C28224CcU A04;
    public final L2X A05;
    public final C77 A06;
    public final Integer A07;
    public final C5Hc A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public static /* synthetic */ C26077Bg6 A01(C51760Mtj c51760Mtj, C77 c77, C26077Bg6 c26077Bg6, Integer num, int i) {
        return A00(c51760Mtj, null, null, null, c77, c26077Bg6, num, null, 0, i, false, false, false);
    }

    public static /* synthetic */ C26077Bg6 A02(C77 c77, C26077Bg6 c26077Bg6) {
        return A00(null, null, null, null, c77, c26077Bg6, null, null, 0, 131070, false, false, false);
    }

    public static /* synthetic */ C26077Bg6 A03(C26077Bg6 c26077Bg6) {
        return A00(null, null, null, null, C77.A03, c26077Bg6, null, null, 0, 131070, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26077Bg6) {
                C26077Bg6 c26077Bg6 = (C26077Bg6) obj;
                if (this.A06 != c26077Bg6.A06 || !C14360o3.A0K(this.A04, c26077Bg6.A04) || !C14360o3.A0K(this.A01, c26077Bg6.A01) || !C14360o3.A0K(this.A02, c26077Bg6.A02) || !C14360o3.A0K(this.A05, c26077Bg6.A05) || !C14360o3.A0K(this.A08, c26077Bg6.A08) || this.A0A != c26077Bg6.A0A || this.A03 != c26077Bg6.A03 || this.A09 != c26077Bg6.A09 || this.A0B != c26077Bg6.A0B || this.A0C != c26077Bg6.A0C || this.A07 != c26077Bg6.A07 || this.A00 != c26077Bg6.A00 || this.A0G != c26077Bg6.A0G || this.A0E != c26077Bg6.A0E || this.A0F != c26077Bg6.A0F || this.A0D != c26077Bg6.A0D) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C26077Bg6 A00(C51760Mtj c51760Mtj, C51760Mtj c51760Mtj2, C28224CcU c28224CcU, L2X l2x, C77 c77, C26077Bg6 c26077Bg6, Integer num, C5Hc c5Hc, int i, int i2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = z3;
        int i3 = i;
        Integer num2 = num;
        boolean z10 = z2;
        boolean z11 = z;
        C5Hc c5Hc2 = c5Hc;
        L2X l2x2 = l2x;
        C51760Mtj c51760Mtj3 = c51760Mtj2;
        C51760Mtj c51760Mtj4 = c51760Mtj;
        C28224CcU c28224CcU2 = c28224CcU;
        C77 c772 = c77;
        C61 c61 = null;
        if ((i2 & 1) != 0) {
            c772 = c26077Bg6.A06;
        }
        if ((i2 & 2) != 0) {
            c28224CcU2 = c26077Bg6.A04;
        }
        if ((i2 & 4) != 0) {
            c51760Mtj4 = c26077Bg6.A01;
        }
        if ((i2 & 8) != 0) {
            c51760Mtj3 = c26077Bg6.A02;
        }
        if ((i2 & 16) != 0) {
            l2x2 = c26077Bg6.A05;
        }
        if ((i2 & 32) != 0) {
            c5Hc2 = c26077Bg6.A08;
        }
        if ((i2 & 64) != 0) {
            z11 = c26077Bg6.A0A;
        }
        if ((i2 & 128) != 0) {
            c61 = c26077Bg6.A03;
        }
        if ((i2 & 256) != 0) {
            z10 = c26077Bg6.A09;
        }
        if ((i2 & 512) != 0) {
            z4 = c26077Bg6.A0B;
        } else {
            z4 = false;
        }
        if ((i2 & 1024) != 0) {
            z5 = c26077Bg6.A0C;
        } else {
            z5 = false;
        }
        if ((i2 & C3OO.FLAG_MOVED) != 0) {
            num2 = c26077Bg6.A07;
        }
        if ((i2 & 4096) != 0) {
            i3 = c26077Bg6.A00;
        }
        if ((i2 & 8192) != 0) {
            z9 = c26077Bg6.A0G;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z6 = c26077Bg6.A0E;
        } else {
            z6 = false;
        }
        if ((i2 & Constants.LOAD_RESULT_PGO) != 0) {
            z7 = c26077Bg6.A0F;
        } else {
            z7 = false;
        }
        if ((i2 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            z8 = c26077Bg6.A0D;
        } else {
            z8 = false;
        }
        AbstractC167007dF.A1G(c772, 0, c5Hc2);
        C14360o3.A0B(num2, 11);
        return new C26077Bg6(c51760Mtj4, c51760Mtj3, c61, c28224CcU2, l2x2, c772, num2, c5Hc2, i3, z11, z10, z4, z5, z9, z6, z7, z8);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0D, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0G, (((AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A09, (AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0J(this.A08, (((((((AbstractC166987dD.A0G(this.A06) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31)) + AbstractC166997dE.A0I(this.A03)) * 31))) + CHU.A00(this.A07)) * 31) + this.A00) * 31))));
    }

    public C26077Bg6(C51760Mtj c51760Mtj, C51760Mtj c51760Mtj2, C61 c61, C28224CcU c28224CcU, L2X l2x, C77 c77, Integer num, C5Hc c5Hc, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A06 = c77;
        this.A04 = c28224CcU;
        this.A01 = c51760Mtj;
        this.A02 = c51760Mtj2;
        this.A05 = l2x;
        this.A08 = c5Hc;
        this.A0A = z;
        this.A03 = c61;
        this.A09 = z2;
        this.A0B = z3;
        this.A0C = z4;
        this.A07 = num;
        this.A00 = i;
        this.A0G = z5;
        this.A0E = z6;
        this.A0F = z7;
        this.A0D = z8;
    }
}
