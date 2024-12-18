package X;

import com.facebook.common.dextricks.Constants;
import java.util.List;
import java.util.Map;

/* renamed from: X.MtW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51747MtW extends C0T6 {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final C38679GzK A05;
    public final C51735MtI A06;
    public final C38657Gyy A07;
    public final C38321qM A08;
    public final C69151Vig A09;
    public final AbstractC53526Nls A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final List A0H;
    public final Map A0I;
    public final Map A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final String A0O;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51747MtW) {
                C51747MtW c51747MtW = (C51747MtW) obj;
                if (!C14360o3.A0K(this.A0H, c51747MtW.A0H) || !C14360o3.A0K(this.A07, c51747MtW.A07) || !C14360o3.A0K(this.A09, c51747MtW.A09) || this.A0C != c51747MtW.A0C || !C14360o3.A0K(this.A0A, c51747MtW.A0A) || !C14360o3.A0K(this.A0F, c51747MtW.A0F) || this.A04 != c51747MtW.A04 || this.A0K != c51747MtW.A0K || !C14360o3.A0K(this.A0J, c51747MtW.A0J) || this.A03 != c51747MtW.A03 || this.A0M != c51747MtW.A0M || !C14360o3.A0K(this.A00, c51747MtW.A00) || !C14360o3.A0K(this.A0D, c51747MtW.A0D) || !C14360o3.A0K(this.A0O, c51747MtW.A0O) || !C14360o3.A0K(this.A0G, c51747MtW.A0G) || !C14360o3.A0K(this.A0E, c51747MtW.A0E) || !C14360o3.A0K(this.A05, c51747MtW.A05) || !C14360o3.A0K(this.A0B, c51747MtW.A0B) || !C14360o3.A0K(this.A08, c51747MtW.A08) || !C14360o3.A0K(this.A0I, c51747MtW.A0I) || this.A01 != c51747MtW.A01 || this.A0N != c51747MtW.A0N || this.A02 != c51747MtW.A02 || this.A0L != c51747MtW.A0L || !C14360o3.A0K(this.A06, c51747MtW.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0G = (((AbstractC166987dD.A0G(this.A0H) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31;
        int intValue = this.A0C.intValue();
        switch (intValue) {
            case 1:
                str = "Idle";
                break;
            case 2:
                str = "Loading";
                break;
            case 3:
                str = "Error";
                break;
            default:
                str = "Start";
                break;
        }
        return AbstractC166987dD.A0I(this.A06, AbstractC167007dF.A0D(this.A0L, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A0N, AbstractC167007dF.A0D(this.A01, AbstractC166997dE.A0J(this.A0I, (((((((((((((((AbstractC167007dF.A0D(this.A0M, (AbstractC166997dE.A0J(this.A0J, AbstractC167007dF.A0D(this.A0K, (((AbstractC166997dE.A0J(this.A0A, AbstractC25231BEo.A0H(str, intValue, A0G)) + AbstractC167017dG.A0O(this.A0F)) * 31) + this.A04) * 31)) + this.A03) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A0O)) * 31) + AbstractC167017dG.A0O(this.A0G)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC166997dE.A0I(this.A08)) * 31))))));
    }

    public C51747MtW(C38679GzK c38679GzK, C51735MtI c51735MtI, C38657Gyy c38657Gyy, C38321qM c38321qM, C69151Vig c69151Vig, AbstractC53526Nls abstractC53526Nls, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List list, Map map, Map map2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0H = list;
        this.A07 = c38657Gyy;
        this.A09 = c69151Vig;
        this.A0C = num;
        this.A0A = abstractC53526Nls;
        this.A0F = str;
        this.A04 = i;
        this.A0K = z;
        this.A0J = map;
        this.A03 = i2;
        this.A0M = z2;
        this.A00 = str2;
        this.A0D = str3;
        this.A0O = str4;
        this.A0G = str5;
        this.A0E = str6;
        this.A05 = c38679GzK;
        this.A0B = num2;
        this.A08 = c38321qM;
        this.A0I = map2;
        this.A01 = z3;
        this.A0N = z4;
        this.A02 = z5;
        this.A0L = z6;
        this.A06 = c51735MtI;
    }

    public static /* synthetic */ C51747MtW A00(C38679GzK c38679GzK, C51735MtI c51735MtI, C38657Gyy c38657Gyy, C38321qM c38321qM, C69151Vig c69151Vig, AbstractC53526Nls abstractC53526Nls, C51747MtW c51747MtW, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, Map map, Map map2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C51735MtI c51735MtI2 = c51735MtI;
        boolean z7 = z6;
        boolean z8 = z5;
        boolean z9 = z4;
        boolean z10 = z3;
        Map map3 = map2;
        Integer num3 = num2;
        C38679GzK c38679GzK2 = c38679GzK;
        C38321qM c38321qM2 = c38321qM;
        String str6 = str5;
        String str7 = str4;
        List list2 = list;
        C38657Gyy c38657Gyy2 = c38657Gyy;
        Map map4 = map;
        C69151Vig c69151Vig2 = c69151Vig;
        int i4 = i;
        Integer num4 = num;
        boolean z11 = z;
        AbstractC53526Nls abstractC53526Nls2 = abstractC53526Nls;
        int i5 = i2;
        String str8 = str;
        boolean z12 = z2;
        String str9 = str2;
        String str10 = str3;
        if ((i3 & 1) != 0) {
            list2 = c51747MtW.A0H;
        }
        if ((i3 & 2) != 0) {
            c38657Gyy2 = c51747MtW.A07;
        }
        if ((i3 & 4) != 0) {
            c69151Vig2 = c51747MtW.A09;
        }
        if ((i3 & 8) != 0) {
            num4 = c51747MtW.A0C;
        }
        if ((i3 & 16) != 0) {
            abstractC53526Nls2 = c51747MtW.A0A;
        }
        if ((i3 & 32) != 0) {
            str8 = c51747MtW.A0F;
        }
        if ((i3 & 64) != 0) {
            i4 = c51747MtW.A04;
        }
        if ((i3 & 128) != 0) {
            z11 = c51747MtW.A0K;
        }
        if ((i3 & 256) != 0) {
            map4 = c51747MtW.A0J;
        }
        if ((i3 & 512) != 0) {
            i5 = c51747MtW.A03;
        }
        if ((i3 & 1024) != 0) {
            z12 = c51747MtW.A0M;
        }
        if ((i3 & C3OO.FLAG_MOVED) != 0) {
            str9 = c51747MtW.A00;
        }
        if ((i3 & 4096) != 0) {
            str10 = c51747MtW.A0D;
        }
        String str11 = (i3 & 8192) != 0 ? c51747MtW.A0O : null;
        if ((i3 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            str7 = c51747MtW.A0G;
        }
        if ((32768 & i3) != 0) {
            str6 = c51747MtW.A0E;
        }
        if ((65536 & i3) != 0) {
            c38679GzK2 = c51747MtW.A05;
        }
        if ((131072 & i3) != 0) {
            num3 = c51747MtW.A0B;
        }
        if ((262144 & i3) != 0) {
            c38321qM2 = c51747MtW.A08;
        }
        if ((524288 & i3) != 0) {
            map3 = c51747MtW.A0I;
        }
        if ((1048576 & i3) != 0) {
            z10 = c51747MtW.A01;
        }
        if ((2097152 & i3) != 0) {
            z9 = c51747MtW.A0N;
        }
        if ((4194304 & i3) != 0) {
            z8 = c51747MtW.A02;
        }
        if ((8388608 & i3) != 0) {
            z7 = c51747MtW.A0L;
        }
        if ((i3 & 16777216) != 0) {
            c51735MtI2 = c51747MtW.A06;
        }
        AbstractC25233BEq.A0w(0, list2, num4, abstractC53526Nls2);
        C14360o3.A0B(map4, 8);
        C14360o3.A0B(map3, 19);
        C14360o3.A0B(c51735MtI2, 24);
        return new C51747MtW(c38679GzK2, c51735MtI2, c38657Gyy2, c38321qM2, c69151Vig2, abstractC53526Nls2, num4, num3, str8, str9, str10, str11, str7, str6, list2, map4, map3, i4, i5, z11, z12, z10, z9, z8, z7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51747MtW() {
        /*
            r26 = this;
            r1 = 0
            X.0sl r15 = X.C16930sl.A00
            java.lang.Integer r7 = X.C05F.A00
            X.NUc r6 = X.C52716NUc.A00
            r18 = 0
            X.0sk r16 = X.AbstractC06930Yk.A0E()
            java.util.LinkedHashMap r17 = X.AbstractC166987dD.A1I()
            X.MtI r2 = new X.MtI
            r2.<init>()
            r0 = r26
            r3 = r1
            r4 = r1
            r5 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r19 = r18
            r20 = r18
            r21 = r18
            r22 = r18
            r23 = r18
            r24 = r18
            r25 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51747MtW.<init>():void");
    }
}
