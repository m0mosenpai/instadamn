package X;

import com.facebook.common.dextricks.Constants;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.6gL */
/* loaded from: classes3.dex */
public final class C145006gL extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C9CN A03;
    public final C9CN A04;
    public final ImageUrl A05;
    public final C84923qg A06;
    public final C148426mC A07;
    public final CharSequence A08;
    public final String A09;
    public final List A0A;
    public final List A0B;
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
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final int A0Q;
    public final boolean A0R;
    public final boolean A0S;

    public static /* synthetic */ C145006gL A01(C145006gL c145006gL, int i) {
        return A00(null, null, null, null, c145006gL, null, null, null, 0, 0, 0, i, false, false, false, false, false, false, false, false, false, false, false, false);
    }

    public static /* synthetic */ C145006gL A02(C145006gL c145006gL, List list, List list2, int i, boolean z, boolean z2) {
        return A00(null, null, null, null, c145006gL, null, list, list2, 0, 0, 0, i, false, false, false, z, z2, false, false, false, false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C145006gL) {
                C145006gL c145006gL = (C145006gL) obj;
                if (this.A0K != c145006gL.A0K || this.A0I != c145006gL.A0I || this.A0L != c145006gL.A0L || this.A0M != c145006gL.A0M || this.A0P != c145006gL.A0P || this.A0O != c145006gL.A0O || this.A0N != c145006gL.A0N || !C14360o3.A0K(this.A04, c145006gL.A04) || !C14360o3.A0K(this.A05, c145006gL.A05) || this.A00 != c145006gL.A00 || this.A01 != c145006gL.A01 || this.A0J != c145006gL.A0J || !C14360o3.A0K(this.A09, c145006gL.A09) || !C14360o3.A0K(this.A08, c145006gL.A08) || this.A0C != c145006gL.A0C || this.A0R != c145006gL.A0R || !C14360o3.A0K(this.A0B, c145006gL.A0B) || !C14360o3.A0K(this.A0A, c145006gL.A0A) || this.A0S != c145006gL.A0S || this.A0Q != c145006gL.A0Q || !C14360o3.A0K(this.A03, c145006gL.A03) || !C14360o3.A0K(this.A06, c145006gL.A06) || this.A0G != c145006gL.A0G || !C14360o3.A0K(this.A07, c145006gL.A07) || this.A02 != c145006gL.A02 || this.A0E != c145006gL.A0E || this.A0F != c145006gL.A0F || this.A0D != c145006gL.A0D || this.A0H != c145006gL.A0H) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ViewState(showCommentButton=");
        sb.append(this.A0K);
        sb.append(", showAddCommentText=");
        sb.append(this.A0I);
        sb.append(", showCommentComposer=");
        sb.append(this.A0L);
        sb.append(", showCommentRotation=");
        sb.append(this.A0M);
        sb.append(", showDialog=");
        sb.append(this.A0P);
        sb.append(", showComposer=");
        sb.append(this.A0O);
        sb.append(", showCommentSheet=");
        sb.append(this.A0N);
        sb.append(", focusedComment=");
        sb.append(this.A04);
        sb.append(", composerAvatarUrl=");
        sb.append(this.A05);
        sb.append(", characterCount=");
        sb.append(this.A00);
        sb.append(", characterLimit=");
        sb.append(this.A01);
        sb.append(", showCharacterLimitIndication=");
        sb.append(this.A0J);
        sb.append(", authorUserName=");
        sb.append(this.A09);
        sb.append(", composerText=");
        sb.append((Object) this.A08);
        sb.append(", enablePostButton=");
        sb.append(this.A0C);
        sb.append(", commentPosting=");
        sb.append(this.A0R);
        sb.append(", comments=");
        sb.append(this.A0B);
        sb.append(", commentModels=");
        sb.append(this.A0A);
        sb.append(", hideViewerComment=");
        sb.append(this.A0S);
        sb.append(", currentViewerCommentIndex=");
        sb.append(this.A0Q);
        sb.append(", currentViewerComment=");
        sb.append(this.A03);
        sb.append(", currentViewerCommentModel=");
        sb.append(this.A06);
        sb.append(", shouldAnimateUpdate=");
        sb.append(this.A0G);
        sb.append(", currentCommentLogger=");
        sb.append(this.A07);
        sb.append(", currentRotation=");
        sb.append(this.A02);
        sb.append(", isCampfireMedia=");
        sb.append(this.A0E);
        sb.append(", isSelfStory=");
        sb.append(this.A0F);
        sb.append(", hasHiddenComments=");
        sb.append(this.A0D);
        sb.append(", shouldPerformHaptics=");
        sb.append(this.A0H);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i = 1237;
        if (this.A0K) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A0I) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0L) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0M) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0P) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0O) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0N) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        C9CN c9cn = this.A04;
        int i15 = 0;
        if (c9cn == null) {
            hashCode = 0;
        } else {
            hashCode = c9cn.hashCode();
        }
        int i16 = (i14 + hashCode) * 31;
        ImageUrl imageUrl = this.A05;
        if (imageUrl == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = imageUrl.hashCode();
        }
        int i17 = (((((i16 + hashCode2) * 31) + this.A00) * 31) + this.A01) * 31;
        int i18 = 1237;
        if (this.A0J) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        String str = this.A09;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int hashCode6 = (((i19 + hashCode3) * 31) + this.A08.hashCode()) * 31;
        int i20 = 1237;
        if (this.A0C) {
            i20 = 1231;
        }
        int i21 = (hashCode6 + i20) * 31;
        int i22 = 1237;
        if (this.A0R) {
            i22 = 1231;
        }
        int hashCode7 = (((((i21 + i22) * 31) + this.A0B.hashCode()) * 31) + this.A0A.hashCode()) * 31;
        int i23 = 1237;
        if (this.A0S) {
            i23 = 1231;
        }
        int i24 = (((hashCode7 + i23) * 31) + this.A0Q) * 31;
        C9CN c9cn2 = this.A03;
        if (c9cn2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c9cn2.hashCode();
        }
        int i25 = (i24 + hashCode4) * 31;
        C84923qg c84923qg = this.A06;
        if (c84923qg == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c84923qg.hashCode();
        }
        int i26 = (i25 + hashCode5) * 31;
        int i27 = 1237;
        if (this.A0G) {
            i27 = 1231;
        }
        int i28 = (i26 + i27) * 31;
        C148426mC c148426mC = this.A07;
        if (c148426mC != null) {
            i15 = c148426mC.hashCode();
        }
        int i29 = (((i28 + i15) * 31) + this.A02) * 31;
        int i30 = 1237;
        if (this.A0E) {
            i30 = 1231;
        }
        int i31 = (i29 + i30) * 31;
        int i32 = 1237;
        if (this.A0F) {
            i32 = 1231;
        }
        int i33 = (i31 + i32) * 31;
        int i34 = 1237;
        if (this.A0D) {
            i34 = 1231;
        }
        int i35 = (i33 + i34) * 31;
        int i36 = 1237;
        if (this.A0H) {
            i36 = 1231;
        }
        return i35 + i36;
    }

    public C145006gL(C9CN c9cn, C9CN c9cn2, ImageUrl imageUrl, C84923qg c84923qg, C148426mC c148426mC, CharSequence charSequence, String str, List list, List list2, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.A0K = z;
        this.A0I = z2;
        this.A0L = z3;
        this.A0M = z4;
        this.A0P = z5;
        this.A0O = z6;
        this.A0N = z7;
        this.A04 = c9cn;
        this.A05 = imageUrl;
        this.A00 = i;
        this.A01 = i2;
        this.A0J = z8;
        this.A09 = str;
        this.A08 = charSequence;
        this.A0C = z9;
        this.A0R = z10;
        this.A0B = list;
        this.A0A = list2;
        this.A0S = z11;
        this.A0Q = i3;
        this.A03 = c9cn2;
        this.A06 = c84923qg;
        this.A0G = z12;
        this.A07 = c148426mC;
        this.A02 = i4;
        this.A0E = z13;
        this.A0F = z14;
        this.A0D = z15;
        this.A0H = z16;
    }

    public static /* synthetic */ C145006gL A00(C9CN c9cn, C9CN c9cn2, C84923qg c84923qg, C148426mC c148426mC, C145006gL c145006gL, CharSequence charSequence, List list, List list2, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        boolean z13 = z11;
        boolean z14 = z10;
        int i5 = i3;
        C148426mC c148426mC2 = c148426mC;
        boolean z15 = z9;
        C84923qg c84923qg2 = c84923qg;
        C9CN c9cn3 = c9cn2;
        boolean z16 = z2;
        C9CN c9cn4 = c9cn;
        boolean z17 = z12;
        CharSequence charSequence2 = charSequence;
        boolean z18 = z3;
        boolean z19 = z4;
        int i6 = i2;
        boolean z20 = z5;
        boolean z21 = z7;
        int i7 = i;
        boolean z22 = z6;
        List list3 = list;
        List list4 = list2;
        boolean z23 = z;
        boolean z24 = z8;
        boolean z25 = (i4 & 1) != 0 ? c145006gL.A0K : false;
        if ((i4 & 2) != 0) {
            z23 = c145006gL.A0I;
        }
        boolean z26 = (i4 & 4) != 0 ? c145006gL.A0L : false;
        if ((i4 & 8) != 0) {
            z16 = c145006gL.A0M;
        }
        if ((i4 & 16) != 0) {
            z18 = c145006gL.A0P;
        }
        if ((i4 & 32) != 0) {
            z19 = c145006gL.A0O;
        }
        if ((i4 & 64) != 0) {
            z20 = c145006gL.A0N;
        }
        if ((i4 & 128) != 0) {
            c9cn4 = c145006gL.A04;
        }
        ImageUrl imageUrl = (i4 & 256) != 0 ? c145006gL.A05 : null;
        if ((i4 & 512) != 0) {
            i7 = c145006gL.A00;
        }
        int i8 = (i4 & 1024) != 0 ? c145006gL.A01 : 0;
        if ((i4 & C3OO.FLAG_MOVED) != 0) {
            z22 = c145006gL.A0J;
        }
        String str = (i4 & 4096) != 0 ? c145006gL.A09 : null;
        if ((i4 & 8192) != 0) {
            charSequence2 = c145006gL.A08;
        }
        if ((i4 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z21 = c145006gL.A0C;
        }
        boolean z27 = (32768 & i4) != 0 ? c145006gL.A0R : false;
        if ((65536 & i4) != 0) {
            list3 = c145006gL.A0B;
        }
        if ((131072 & i4) != 0) {
            list4 = c145006gL.A0A;
        }
        if ((262144 & i4) != 0) {
            z24 = c145006gL.A0S;
        }
        if ((524288 & i4) != 0) {
            i6 = c145006gL.A0Q;
        }
        if ((1048576 & i4) != 0) {
            c9cn3 = c145006gL.A03;
        }
        if ((2097152 & i4) != 0) {
            c84923qg2 = c145006gL.A06;
        }
        if ((4194304 & i4) != 0) {
            z15 = c145006gL.A0G;
        }
        if ((8388608 & i4) != 0) {
            c148426mC2 = c145006gL.A07;
        }
        if ((16777216 & i4) != 0) {
            i5 = c145006gL.A02;
        }
        if ((33554432 & i4) != 0) {
            z14 = c145006gL.A0E;
        }
        boolean z28 = (67108864 & i4) != 0 ? c145006gL.A0F : false;
        if ((134217728 & i4) != 0) {
            z13 = c145006gL.A0D;
        }
        if ((i4 & 268435456) != 0) {
            z17 = c145006gL.A0H;
        }
        C14360o3.A0B(charSequence2, 13);
        C14360o3.A0B(list3, 16);
        C14360o3.A0B(list4, 17);
        return new C145006gL(c9cn4, c9cn3, imageUrl, c84923qg2, c148426mC2, charSequence2, str, list3, list4, i7, i8, i6, i5, z25, z23, z26, z16, z18, z19, z20, z22, z21, z27, z24, z15, z14, z28, z13, z17);
    }
}
