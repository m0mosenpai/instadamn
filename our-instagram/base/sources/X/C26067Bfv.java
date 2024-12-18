package X;

import com.facebook.common.dextricks.Constants;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bfv */
/* loaded from: classes5.dex */
public final class C26067Bfv extends C0T6 {
    public final int A00;
    public final int A01;
    public final C51743MtS A02;
    public final ImageUrl A03;
    public final C6R A04;
    public final EnumC53314Nhq A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final C5Hc A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final C3T1 A0H;

    public static /* synthetic */ C26067Bfv A01(C6R c6r, C26067Bfv c26067Bfv, int i, boolean z) {
        return A00(null, c6r, c26067Bfv, null, null, null, i, false, false, false, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26067Bfv) {
                C26067Bfv c26067Bfv = (C26067Bfv) obj;
                if (this.A0C != c26067Bfv.A0C || this.A0E != c26067Bfv.A0E || this.A0D != c26067Bfv.A0D || this.A04 != c26067Bfv.A04 || this.A0B != c26067Bfv.A0B || this.A0A != c26067Bfv.A0A || !C14360o3.A0K(this.A06, c26067Bfv.A06) || this.A05 != c26067Bfv.A05 || this.A0H != c26067Bfv.A0H || !C14360o3.A0K(this.A07, c26067Bfv.A07) || !C14360o3.A0K(this.A08, c26067Bfv.A08) || !C14360o3.A0K(this.A03, c26067Bfv.A03) || !C14360o3.A0K(this.A09, c26067Bfv.A09) || this.A0F != c26067Bfv.A0F || !C14360o3.A0K(this.A02, c26067Bfv.A02) || this.A0G != c26067Bfv.A0G || this.A01 != c26067Bfv.A01 || this.A00 != c26067Bfv.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C26067Bfv A00(ImageUrl imageUrl, C6R c6r, C26067Bfv c26067Bfv, C3T1 c3t1, String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        Integer num;
        EnumC53314Nhq enumC53314Nhq;
        C5Hc c5Hc;
        boolean z7;
        int i2;
        int i3;
        boolean z8 = z4;
        ImageUrl imageUrl2 = imageUrl;
        String str3 = str2;
        String str4 = str;
        C3T1 c3t12 = c3t1;
        boolean z9 = z3;
        C6R c6r2 = c6r;
        boolean z10 = z2;
        boolean z11 = z;
        C51743MtS c51743MtS = null;
        if ((i & 1) != 0) {
            z11 = c26067Bfv.A0C;
        }
        if ((i & 2) != 0) {
            z5 = c26067Bfv.A0E;
        } else {
            z5 = false;
        }
        if ((i & 4) != 0) {
            z10 = c26067Bfv.A0D;
        }
        if ((i & 8) != 0) {
            c6r2 = c26067Bfv.A04;
        }
        if ((i & 16) != 0) {
            z9 = c26067Bfv.A0B;
        }
        if ((i & 32) != 0) {
            z6 = c26067Bfv.A0A;
        } else {
            z6 = false;
        }
        if ((i & 64) != 0) {
            num = c26067Bfv.A06;
        } else {
            num = null;
        }
        if ((i & 128) != 0) {
            enumC53314Nhq = c26067Bfv.A05;
        } else {
            enumC53314Nhq = null;
        }
        if ((i & 256) != 0) {
            c3t12 = c26067Bfv.A0H;
        }
        if ((i & 512) != 0) {
            str4 = c26067Bfv.A07;
        }
        if ((i & 1024) != 0) {
            str3 = c26067Bfv.A08;
        }
        if ((i & C3OO.FLAG_MOVED) != 0) {
            imageUrl2 = c26067Bfv.A03;
        }
        if ((i & 4096) != 0) {
            c5Hc = c26067Bfv.A09;
        } else {
            c5Hc = null;
        }
        if ((i & 8192) != 0) {
            z8 = c26067Bfv.A0F;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            c51743MtS = c26067Bfv.A02;
        }
        if ((i & Constants.LOAD_RESULT_PGO) != 0) {
            z7 = c26067Bfv.A0G;
        } else {
            z7 = false;
        }
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            i2 = c26067Bfv.A01;
        } else {
            i2 = 0;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            i3 = c26067Bfv.A00;
        } else {
            i3 = 0;
        }
        C14360o3.A0B(c6r2, 3);
        AbstractC25234BEr.A0l(8, c3t12, str4, str3, imageUrl2);
        C14360o3.A0B(c5Hc, 12);
        return new C26067Bfv(c51743MtS, imageUrl2, c6r2, enumC53314Nhq, c3t12, num, str4, str3, c5Hc, i2, i3, z11, z5, z10, z9, z6, z8, z7);
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A0G, (AbstractC167007dF.A0D(this.A0F, AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0J(this.A0H, (((AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A0B, AbstractC166997dE.A0J(this.A04, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0E, AbstractC25225BEi.A08(this.A0C)))))) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31)))))) + AbstractC166997dE.A0I(this.A02)) * 31) + this.A01) * 31) + this.A00;
    }

    public C26067Bfv(C51743MtS c51743MtS, ImageUrl imageUrl, C6R c6r, EnumC53314Nhq enumC53314Nhq, C3T1 c3t1, Integer num, String str, String str2, C5Hc c5Hc, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A0C = z;
        this.A0E = z2;
        this.A0D = z3;
        this.A04 = c6r;
        this.A0B = z4;
        this.A0A = z5;
        this.A06 = num;
        this.A05 = enumC53314Nhq;
        this.A0H = c3t1;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = imageUrl;
        this.A09 = c5Hc;
        this.A0F = z6;
        this.A02 = c51743MtS;
        this.A0G = z7;
        this.A01 = i;
        this.A00 = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26067Bfv() {
        /*
            r20 = this;
            r2 = 0
            r13 = 0
            r15 = 1
            X.C6R r4 = X.C6R.A03
            X.3T1 r6 = X.C3T1.SUCCESS
            java.lang.String r8 = ""
            com.instagram.common.typedurl.SimpleImageUrl r3 = X.AbstractC25225BEi.A0t(r8)
            X.5HZ r10 = X.C5HZ.A01
            r11 = 5
            X.17u r1 = new X.17u
            r1.<init>(r13, r11)
            X.2Ut r0 = X.AbstractC50712Us.A00
            int r12 = X.C17s.A04(r0, r1)
            r1 = r20
            r5 = r2
            r7 = r2
            r9 = r8
            r14 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26067Bfv.<init>():void");
    }
}
