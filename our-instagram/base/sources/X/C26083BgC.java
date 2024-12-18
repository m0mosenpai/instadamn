package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.BgC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26083BgC extends C0T6 {
    public final C45126Jxv A00;
    public final C26069Bfx A01;
    public final ImageUrl A02;
    public final C84 A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final String A0N;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26083BgC) {
                C26083BgC c26083BgC = (C26083BgC) obj;
                if (!C14360o3.A0K(this.A05, c26083BgC.A05) || !C14360o3.A0K(this.A08, c26083BgC.A08) || !C14360o3.A0K(this.A07, c26083BgC.A07) || !C14360o3.A0K(this.A04, c26083BgC.A04) || !C14360o3.A0K(this.A06, c26083BgC.A06) || !C14360o3.A0K(this.A02, c26083BgC.A02) || !C14360o3.A0K(this.A0B, c26083BgC.A0B) || !C14360o3.A0K(this.A0N, c26083BgC.A0N) || !C14360o3.A0K(this.A0A, c26083BgC.A0A) || !C14360o3.A0K(this.A0C, c26083BgC.A0C) || !C14360o3.A0K(this.A0I, c26083BgC.A0I) || !C14360o3.A0K(this.A0J, c26083BgC.A0J) || this.A03 != c26083BgC.A03 || this.A0L != c26083BgC.A0L || !C14360o3.A0K(this.A0D, c26083BgC.A0D) || !C14360o3.A0K(this.A09, c26083BgC.A09) || !C14360o3.A0K(this.A00, c26083BgC.A00) || this.A0M != c26083BgC.A0M || !C14360o3.A0K(this.A0F, c26083BgC.A0F) || !C14360o3.A0K(this.A0G, c26083BgC.A0G) || !C14360o3.A0K(this.A0H, c26083BgC.A0H) || !C14360o3.A0K(this.A0E, c26083BgC.A0E) || this.A0K != c26083BgC.A0K || !C14360o3.A0K(this.A01, c26083BgC.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public C26083BgC(C45126Jxv c45126Jxv, C26069Bfx c26069Bfx, ImageUrl imageUrl, C84 c84, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, List list3, List list4, List list5, List list6, List list7, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(list2, 12);
        this.A05 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A04 = str4;
        this.A06 = str5;
        this.A02 = imageUrl;
        this.A0B = str6;
        this.A0N = str7;
        this.A0A = str8;
        this.A0C = str9;
        this.A0I = list;
        this.A0J = list2;
        this.A03 = c84;
        this.A0L = z;
        this.A0D = list3;
        this.A09 = str10;
        this.A00 = c45126Jxv;
        this.A0M = z2;
        this.A0F = list4;
        this.A0G = list5;
        this.A0H = list6;
        this.A0E = list7;
        this.A0K = z3;
        this.A01 = c26069Bfx;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A0K, (AbstractC166997dE.A0J(this.A0H, (((AbstractC167007dF.A0D(this.A0M, (((AbstractC166997dE.A0J(this.A0D, AbstractC167007dF.A0D(this.A0L, (AbstractC166997dE.A0J(this.A0J, AbstractC166997dE.A0J(this.A0I, AbstractC166997dE.A0K(this.A0C, AbstractC166997dE.A0K(this.A0A, AbstractC166997dE.A0K(this.A0N, (((AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A08, AbstractC166987dD.A0J(this.A05))))) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31))))) + AbstractC167017dG.A0M(this.A03)) * 31)) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A0G)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public static /* synthetic */ C26083BgC A00(C45126Jxv c45126Jxv, C26069Bfx c26069Bfx, C26083BgC c26083BgC, ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, List list3, List list4, List list5, List list6, int i, boolean z, boolean z2) {
        List list7 = list6;
        List list8 = list5;
        List list9 = list4;
        List list10 = list3;
        boolean z3 = z2;
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        boolean z4 = z;
        String str12 = str4;
        C26069Bfx c26069Bfx2 = c26069Bfx;
        C45126Jxv c45126Jxv2 = c45126Jxv;
        ImageUrl imageUrl2 = imageUrl;
        String str13 = str8;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        List list11 = list;
        List list12 = list2;
        if ((i & 1) != 0) {
            str9 = c26083BgC.A05;
        }
        String str17 = (i & 2) != 0 ? c26083BgC.A08 : null;
        if ((i & 4) != 0) {
            str10 = c26083BgC.A07;
        }
        if ((i & 8) != 0) {
            str11 = c26083BgC.A04;
        }
        if ((i & 16) != 0) {
            str12 = c26083BgC.A06;
        }
        if ((i & 32) != 0) {
            imageUrl2 = c26083BgC.A02;
        }
        if ((i & 64) != 0) {
            str14 = c26083BgC.A0B;
        }
        String str18 = (i & 128) != 0 ? c26083BgC.A0N : null;
        if ((i & 256) != 0) {
            str15 = c26083BgC.A0A;
        }
        if ((i & 512) != 0) {
            str16 = c26083BgC.A0C;
        }
        List list13 = (i & 1024) != 0 ? c26083BgC.A0I : null;
        if ((i & C3OO.FLAG_MOVED) != 0) {
            list11 = c26083BgC.A0J;
        }
        C84 c84 = (i & 4096) != 0 ? c26083BgC.A03 : null;
        if ((i & 8192) != 0) {
            z4 = c26083BgC.A0L;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            list12 = c26083BgC.A0D;
        }
        if ((i & Constants.LOAD_RESULT_PGO) != 0) {
            str13 = c26083BgC.A09;
        }
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            c45126Jxv2 = c26083BgC.A00;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            z3 = c26083BgC.A0M;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            list10 = c26083BgC.A0F;
        }
        if ((i & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            list9 = c26083BgC.A0G;
        }
        if ((i & 1048576) != 0) {
            list8 = c26083BgC.A0H;
        }
        if ((i & 2097152) != 0) {
            list7 = c26083BgC.A0E;
        }
        boolean z5 = (i & 4194304) != 0 ? c26083BgC.A0K : false;
        if ((i & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0) {
            c26069Bfx2 = c26083BgC.A01;
        }
        C14360o3.A0B(str9, 0);
        AbstractC167027dH.A0a(1, str17, str10, str11, str12);
        C14360o3.A0B(str18, 7);
        AbstractC25234BEr.A0l(8, str15, str16, list13, list11);
        C14360o3.A0B(list12, 14);
        C14360o3.A0B(list8, 20);
        return new C26083BgC(c45126Jxv2, c26069Bfx2, imageUrl2, c84, str9, str17, str10, str11, str12, str14, str18, str15, str16, str13, list13, list11, list12, list10, list9, list8, list7, z4, z3, z5);
    }
}
