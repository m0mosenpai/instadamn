package X;

import com.facebook.common.dextricks.Constants;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Map;

/* renamed from: X.BgA */
/* loaded from: classes5.dex */
public final class C26081BgA extends C0T6 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final C28208Cc5 A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final Map A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final Integer A0M;

    public static /* synthetic */ C26081BgA A01(ImageUrl imageUrl, C28208Cc5 c28208Cc5, C26081BgA c26081BgA, String str, int i) {
        return A00(null, imageUrl, c28208Cc5, c26081BgA, null, null, str, null, null, null, null, 0.0f, 0.0f, 0.0f, i, false, false, false, false, false, false, false, false, false, false);
    }

    public static /* synthetic */ C26081BgA A02(C28208Cc5 c28208Cc5, C26081BgA c26081BgA) {
        return A00(null, null, c28208Cc5, c26081BgA, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 6291455, false, false, false, false, false, false, false, false, false, false);
    }

    public static /* synthetic */ C26081BgA A03(C26081BgA c26081BgA, float f) {
        return A00(null, null, null, c26081BgA, null, null, null, null, null, null, null, f, 0.0f, 0.0f, 8387583, false, false, false, false, false, false, false, false, false, false);
    }

    public static /* synthetic */ C26081BgA A04(C26081BgA c26081BgA, int i) {
        return A00(null, null, null, c26081BgA, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, i, false, false, false, false, false, false, false, false, false, false);
    }

    public static /* synthetic */ C26081BgA A05(C26081BgA c26081BgA, String str, String str2, int i, boolean z) {
        return A00(null, null, null, c26081BgA, null, null, null, null, str, str2, null, 0.0f, 0.0f, 0.0f, i, z, false, false, false, false, false, false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26081BgA) {
                C26081BgA c26081BgA = (C26081BgA) obj;
                if (this.A0M != c26081BgA.A0M || !C14360o3.A0K(this.A0A, c26081BgA.A0A) || !C14360o3.A0K(this.A04, c26081BgA.A04) || !C14360o3.A0K(this.A08, c26081BgA.A08) || !C14360o3.A0K(this.A0B, c26081BgA.A0B) || !C14360o3.A0K(this.A07, c26081BgA.A07) || !C14360o3.A0K(this.A09, c26081BgA.A09) || !C14360o3.A0K(this.A06, c26081BgA.A06) || !C14360o3.A0K(this.A03, c26081BgA.A03) || this.A0H != c26081BgA.A0H || Float.compare(this.A00, c26081BgA.A00) != 0 || Float.compare(this.A02, c26081BgA.A02) != 0 || this.A0I != c26081BgA.A0I || this.A0C != c26081BgA.A0C || this.A0D != c26081BgA.A0D || this.A0J != c26081BgA.A0J || Float.compare(this.A01, c26081BgA.A01) != 0 || this.A0K != c26081BgA.A0K || this.A0F != c26081BgA.A0F || this.A0G != c26081BgA.A0G || this.A0L != c26081BgA.A0L || !C14360o3.A0K(this.A05, c26081BgA.A05) || this.A0E != c26081BgA.A0E) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A0M.intValue();
        switch (intValue) {
            case 1:
                str = "Loading";
                break;
            case 2:
                str = "Failed";
                break;
            case 3:
                str = "Success";
                break;
            default:
                str = "Initial";
                break;
        }
        return AbstractC166987dD.A0K(this.A0E, AbstractC166997dE.A0J(this.A05, AbstractC167007dF.A0D(this.A0L, AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0K, AbstractC166997dE.A00(AbstractC167007dF.A0D(this.A0J, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0I, AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC167007dF.A0D(this.A0H, (AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0J(this.A0B, AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0K(this.A0A, AbstractC25228BEl.A0F(str, intValue)))))))) + AbstractC167017dG.A0M(this.A03)) * 31), this.A00), this.A02))))), this.A01)))))));
    }

    public C26081BgA(ImageUrl imageUrl, ImageUrl imageUrl2, C28208Cc5 c28208Cc5, Integer num, String str, String str2, String str3, String str4, String str5, Map map, float f, float f2, float f3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A0M = num;
        this.A0A = str;
        this.A04 = imageUrl;
        this.A08 = str2;
        this.A0B = map;
        this.A07 = str3;
        this.A09 = str4;
        this.A06 = str5;
        this.A03 = imageUrl2;
        this.A0H = z;
        this.A00 = f;
        this.A02 = f2;
        this.A0I = z2;
        this.A0C = z3;
        this.A0D = z4;
        this.A0J = z5;
        this.A01 = f3;
        this.A0K = z6;
        this.A0F = z7;
        this.A0G = z8;
        this.A0L = z9;
        this.A05 = c28208Cc5;
        this.A0E = z10;
    }

    public static /* synthetic */ C26081BgA A00(ImageUrl imageUrl, ImageUrl imageUrl2, C28208Cc5 c28208Cc5, C26081BgA c26081BgA, Integer num, String str, String str2, String str3, String str4, String str5, Map map, float f, float f2, float f3, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        boolean z11 = z10;
        C28208Cc5 c28208Cc52 = c28208Cc5;
        boolean z12 = z8;
        boolean z13 = z7;
        boolean z14 = z6;
        boolean z15 = z4;
        boolean z16 = z9;
        boolean z17 = z3;
        Integer num2 = num;
        float f4 = f3;
        String str6 = str;
        ImageUrl imageUrl3 = imageUrl;
        String str7 = str2;
        Map map2 = map;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        boolean z18 = z5;
        ImageUrl imageUrl4 = imageUrl2;
        boolean z19 = z;
        float f5 = f;
        float f6 = f2;
        boolean z20 = z2;
        if ((i & 1) != 0) {
            num2 = c26081BgA.A0M;
        }
        if ((i & 2) != 0) {
            str6 = c26081BgA.A0A;
        }
        if ((i & 4) != 0) {
            imageUrl3 = c26081BgA.A04;
        }
        if ((i & 8) != 0) {
            str7 = c26081BgA.A08;
        }
        if ((i & 16) != 0) {
            map2 = c26081BgA.A0B;
        }
        if ((i & 32) != 0) {
            str8 = c26081BgA.A07;
        }
        if ((i & 64) != 0) {
            str9 = c26081BgA.A09;
        }
        if ((i & 128) != 0) {
            str10 = c26081BgA.A06;
        }
        if ((i & 256) != 0) {
            imageUrl4 = c26081BgA.A03;
        }
        if ((i & 512) != 0) {
            z19 = c26081BgA.A0H;
        }
        if ((i & 1024) != 0) {
            f5 = c26081BgA.A00;
        }
        if ((i & C3OO.FLAG_MOVED) != 0) {
            f6 = c26081BgA.A02;
        }
        if ((i & 4096) != 0) {
            z20 = c26081BgA.A0I;
        }
        if ((i & 8192) != 0) {
            z17 = c26081BgA.A0C;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z15 = c26081BgA.A0D;
        }
        if ((i & Constants.LOAD_RESULT_PGO) != 0) {
            z18 = c26081BgA.A0J;
        }
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            f4 = c26081BgA.A01;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            z14 = c26081BgA.A0K;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            z13 = c26081BgA.A0F;
        }
        if ((i & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            z12 = c26081BgA.A0G;
        }
        if ((i & 1048576) != 0) {
            z16 = c26081BgA.A0L;
        }
        if ((i & 2097152) != 0) {
            c28208Cc52 = c26081BgA.A05;
        }
        if ((i & 4194304) != 0) {
            z11 = c26081BgA.A0E;
        }
        AbstractC167017dG.A1N(num2, str6);
        AbstractC25234BEr.A1R(imageUrl3, str7, map2, str8, str9);
        C14360o3.A0B(str10, 7);
        C14360o3.A0B(c28208Cc52, 21);
        boolean z21 = z14;
        boolean z22 = z13;
        boolean z23 = z12;
        boolean z24 = z16;
        boolean z25 = z11;
        return new C26081BgA(imageUrl3, imageUrl4, c28208Cc52, num2, str6, str7, str8, str9, str10, map2, f5, f6, f4, z19, z20, z17, z15, z18, z21, z22, z23, z24, z25);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26081BgA() {
        /*
            r25 = this;
            r3 = 0
            java.lang.Integer r5 = X.C05F.A00
            java.lang.String r6 = ""
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.AbstractC25225BEi.A0t(r6)
            X.0sk r11 = X.AbstractC06930Yk.A0E()
            r15 = 0
            r12 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            boolean r0 = X.C2U7.A00
            r18 = r0 ^ 1
            r14 = 1128792064(0x43480000, float:200.0)
            X.0sl r1 = X.C16930sl.A00
            r0 = -1
            X.Cc5 r4 = new X.Cc5
            r4.<init>(r1, r0, r0)
            r1 = r25
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r17 = r15
            r19 = r18
            r20 = r15
            r21 = r15
            r22 = r15
            r23 = r15
            r24 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26081BgA.<init>():void");
    }
}
