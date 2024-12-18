package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7di, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167297di extends AbstractC166097bd {
    public final EnumC168517fl A00;
    public final EnumC168547fo A01;
    public final C169307h4 A02;
    public final C169277h1 A03;
    public final AbstractC168537fn A04;
    public final EnumC168507fk A05;
    public final EnumC166167bk A06;
    public final C168497fj A07;
    public final C115925Mi A08;
    public final C38891rO A09;
    public final C115935Mj A0A;
    public final C169287h2 A0B;
    public final User A0C;
    public final C169297h3 A0D;
    public final Boolean A0E;
    public final Boolean A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final Long A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final List A0P;
    public final List A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;

    public final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (this.A0T && this.A0l) {
            if (!this.A0X || !C18U.A06(C06090Tz.A05, userSession, 36321035183727695L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167297di) {
                C167297di c167297di = (C167297di) obj;
                if (!C14360o3.A0K(this.A0K, c167297di.A0K) || this.A0V != c167297di.A0V || !C14360o3.A0K(this.A0N, c167297di.A0N) || !C14360o3.A0K(this.A0C, c167297di.A0C) || !C14360o3.A0K(this.A0J, c167297di.A0J) || !C14360o3.A0K(this.A0O, c167297di.A0O) || !C14360o3.A0K(this.A03, c167297di.A03) || !C14360o3.A0K(this.A08, c167297di.A08) || !C14360o3.A0K(this.A0A, c167297di.A0A) || this.A0l != c167297di.A0l || this.A0j != c167297di.A0j || this.A0U != c167297di.A0U || this.A0Y != c167297di.A0Y || !C14360o3.A0K(this.A0P, c167297di.A0P) || this.A0d != c167297di.A0d || this.A0X != c167297di.A0X || this.A0a != c167297di.A0a || this.A0S != c167297di.A0S || !C14360o3.A0K(this.A0G, c167297di.A0G) || this.A0T != c167297di.A0T || !C14360o3.A0K(this.A0I, c167297di.A0I) || !C14360o3.A0K(this.A07, c167297di.A07) || this.A0b != c167297di.A0b || this.A0h != c167297di.A0h || this.A05 != c167297di.A05 || this.A00 != c167297di.A00 || this.A06 != c167297di.A06 || this.A0c != c167297di.A0c || !C14360o3.A0K(this.A0M, c167297di.A0M) || !C14360o3.A0K(this.A0L, c167297di.A0L) || this.A0H != c167297di.A0H || this.A0W != c167297di.A0W || !C14360o3.A0K(this.A04, c167297di.A04) || this.A0Z != c167297di.A0Z || this.A0R != c167297di.A0R || this.A0k != c167297di.A0k || !C14360o3.A0K(this.A09, c167297di.A09) || !C14360o3.A0K(this.A0B, c167297di.A0B) || !C14360o3.A0K(this.A0D, c167297di.A0D) || this.A0i != c167297di.A0i || this.A0e != c167297di.A0e || !C14360o3.A0K(this.A02, c167297di.A02) || !C14360o3.A0K(this.A0E, c167297di.A0E) || !C14360o3.A0K(this.A0F, c167297di.A0F) || !C14360o3.A0K(this.A0Q, c167297di.A0Q) || this.A01 != c167297di.A01 || this.A0g != c167297di.A0g || this.A0f != c167297di.A0f) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        String str;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17 = this.A0K.hashCode() * 31;
        int i = 1237;
        if (this.A0V) {
            i = 1231;
        }
        int i2 = (hashCode17 + i) * 31;
        String str2 = this.A0N;
        int i3 = 0;
        if (str2 == null) {
            hashCode = 0;
        } else {
            hashCode = str2.hashCode();
        }
        int hashCode18 = (((i2 + hashCode) * 31) + this.A0C.hashCode()) * 31;
        String str3 = this.A0J;
        if (str3 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str3.hashCode();
        }
        int i4 = (hashCode18 + hashCode2) * 31;
        String str4 = this.A0O;
        if (str4 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str4.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        C169277h1 c169277h1 = this.A03;
        if (c169277h1 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c169277h1.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        C115925Mi c115925Mi = this.A08;
        if (c115925Mi == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c115925Mi.hashCode();
        }
        int i7 = (i6 + hashCode5) * 31;
        C115935Mj c115935Mj = this.A0A;
        if (c115935Mj == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c115935Mj.hashCode();
        }
        int i8 = (i7 + hashCode6) * 31;
        int i9 = 1237;
        if (this.A0l) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0j) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0U) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A0Y) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        List list = this.A0P;
        if (list == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        int i18 = 1237;
        if (this.A0d) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        int i20 = 1237;
        if (this.A0X) {
            i20 = 1231;
        }
        int i21 = (i19 + i20) * 31;
        int i22 = 1237;
        if (this.A0a) {
            i22 = 1231;
        }
        int i23 = (i21 + i22) * 31;
        int i24 = 1237;
        if (this.A0S) {
            i24 = 1231;
        }
        int i25 = (i23 + i24) * 31;
        Integer num = this.A0G;
        if (num == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num.hashCode();
        }
        int i26 = (i25 + hashCode8) * 31;
        int i27 = 1237;
        if (this.A0T) {
            i27 = 1231;
        }
        int i28 = (i26 + i27) * 31;
        Long l = this.A0I;
        if (l == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = l.hashCode();
        }
        int hashCode19 = (((i28 + hashCode9) * 31) + this.A07.hashCode()) * 31;
        int i29 = 1237;
        if (this.A0b) {
            i29 = 1231;
        }
        int i30 = (hashCode19 + i29) * 31;
        int i31 = 1237;
        if (this.A0h) {
            i31 = 1231;
        }
        int hashCode20 = (((((((i30 + i31) * 31) + this.A05.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A06.hashCode()) * 31;
        int i32 = 1237;
        if (this.A0c) {
            i32 = 1231;
        }
        int hashCode21 = (((hashCode20 + i32) * 31) + this.A0M.hashCode()) * 31;
        String str5 = this.A0L;
        if (str5 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str5.hashCode();
        }
        int i33 = (hashCode21 + hashCode10) * 31;
        int intValue = this.A0H.intValue();
        switch (intValue) {
            case 1:
                str = "LOCAL_PENDING";
                break;
            case 2:
                str = "LOCAL_DELETING";
                break;
            case 3:
                str = "LOCAL_HIDING";
                break;
            case 4:
                str = "LOCAL_UNHIDING";
                break;
            case 5:
                str = "LOCAL_UNCOVERING";
                break;
            case 6:
                str = "LOCAL_ALL_REPLIES_HIDING";
                break;
            case 7:
                str = "LOCAL_BLOCKING";
                break;
            default:
                str = "NETWORK";
                break;
        }
        int hashCode22 = (i33 + str.hashCode() + intValue) * 31;
        int i34 = 1237;
        if (this.A0W) {
            i34 = 1231;
        }
        int hashCode23 = (((hashCode22 + i34) * 31) + this.A04.hashCode()) * 31;
        int i35 = 1237;
        if (this.A0Z) {
            i35 = 1231;
        }
        int i36 = (hashCode23 + i35) * 31;
        int i37 = 1237;
        if (this.A0R) {
            i37 = 1231;
        }
        int i38 = (i36 + i37) * 31;
        int i39 = 1237;
        if (this.A0k) {
            i39 = 1231;
        }
        int i40 = (i38 + i39) * 31;
        C38891rO c38891rO = this.A09;
        if (c38891rO == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = c38891rO.hashCode();
        }
        int i41 = (i40 + hashCode11) * 31;
        C169287h2 c169287h2 = this.A0B;
        if (c169287h2 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = c169287h2.hashCode();
        }
        int i42 = (i41 + hashCode12) * 31;
        C169297h3 c169297h3 = this.A0D;
        if (c169297h3 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = c169297h3.hashCode();
        }
        int i43 = (i42 + hashCode13) * 31;
        int i44 = 1237;
        if (this.A0i) {
            i44 = 1231;
        }
        int i45 = (i43 + i44) * 31;
        int i46 = 1237;
        if (this.A0e) {
            i46 = 1231;
        }
        int i47 = (i45 + i46) * 31;
        C169307h4 c169307h4 = this.A02;
        if (c169307h4 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = c169307h4.hashCode();
        }
        int i48 = (i47 + hashCode14) * 31;
        Boolean bool = this.A0E;
        if (bool == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = bool.hashCode();
        }
        int i49 = (i48 + hashCode15) * 31;
        Boolean bool2 = this.A0F;
        if (bool2 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = bool2.hashCode();
        }
        int i50 = (i49 + hashCode16) * 31;
        List list2 = this.A0Q;
        if (list2 != null) {
            i3 = list2.hashCode();
        }
        int hashCode24 = (((i50 + i3) * 31) + this.A01.hashCode()) * 31;
        int i51 = 1237;
        if (this.A0g) {
            i51 = 1231;
        }
        int i52 = (hashCode24 + i51) * 31;
        int i53 = 1237;
        if (this.A0f) {
            i53 = 1231;
        }
        return i52 + i53;
    }

    public C167297di(EnumC168517fl enumC168517fl, EnumC168547fo enumC168547fo, C169307h4 c169307h4, C169277h1 c169277h1, AbstractC168537fn abstractC168537fn, EnumC168507fk enumC168507fk, EnumC166167bk enumC166167bk, C168497fj c168497fj, C115925Mi c115925Mi, C38891rO c38891rO, C115935Mj c115935Mj, C169287h2 c169287h2, User user, C169297h3 c169297h3, Boolean bool, Boolean bool2, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21) {
        super(str);
        this.A0K = str;
        this.A0V = z;
        this.A0N = str2;
        this.A0C = user;
        this.A0J = str3;
        this.A0O = str4;
        this.A03 = c169277h1;
        this.A08 = c115925Mi;
        this.A0A = c115935Mj;
        this.A0l = z2;
        this.A0j = z3;
        this.A0U = z4;
        this.A0Y = z5;
        this.A0P = list;
        this.A0d = z6;
        this.A0X = z7;
        this.A0a = z8;
        this.A0S = z9;
        this.A0G = num;
        this.A0T = z10;
        this.A0I = l;
        this.A07 = c168497fj;
        this.A0b = z11;
        this.A0h = z12;
        this.A05 = enumC168507fk;
        this.A00 = enumC168517fl;
        this.A06 = enumC166167bk;
        this.A0c = z13;
        this.A0M = str5;
        this.A0L = str6;
        this.A0H = num2;
        this.A0W = z14;
        this.A04 = abstractC168537fn;
        this.A0Z = z15;
        this.A0R = z16;
        this.A0k = z17;
        this.A09 = c38891rO;
        this.A0B = c169287h2;
        this.A0D = c169297h3;
        this.A0i = z18;
        this.A0e = z19;
        this.A02 = c169307h4;
        this.A0E = bool;
        this.A0F = bool2;
        this.A0Q = list2;
        this.A01 = enumC168547fo;
        this.A0g = z20;
        this.A0f = z21;
    }

    public static /* synthetic */ C167297di A00(EnumC168517fl enumC168517fl, C167297di c167297di, C169307h4 c169307h4, EnumC168507fk enumC168507fk, EnumC166167bk enumC166167bk, C169287h2 c169287h2, C169297h3 c169297h3, Boolean bool, Boolean bool2, Integer num, Integer num2, Long l, String str, String str2, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        List list2 = list;
        Boolean bool3 = bool2;
        C169307h4 c169307h42 = c169307h4;
        C169287h2 c169287h22 = c169287h2;
        boolean z9 = z8;
        String str3 = str;
        boolean z10 = z4;
        String str4 = str2;
        Boolean bool4 = bool;
        boolean z11 = z2;
        EnumC168517fl enumC168517fl2 = enumC168517fl;
        boolean z12 = z;
        boolean z13 = z3;
        boolean z14 = z6;
        EnumC166167bk enumC166167bk2 = enumC166167bk;
        Integer num3 = num;
        C169297h3 c169297h32 = c169297h3;
        Long l2 = l;
        boolean z15 = z5;
        boolean z16 = z7;
        EnumC168507fk enumC168507fk2 = enumC168507fk;
        Integer num4 = num2;
        if ((i & 1) != 0) {
            str3 = c167297di.A0K;
        }
        boolean z17 = (i & 2) != 0 ? c167297di.A0V : false;
        String str5 = (i & 4) != 0 ? c167297di.A0N : null;
        User user = (i & 8) != 0 ? c167297di.A0C : null;
        String str6 = (i & 16) != 0 ? c167297di.A0J : null;
        if ((i & 32) != 0) {
            str4 = c167297di.A0O;
        }
        C169277h1 c169277h1 = (i & 64) != 0 ? c167297di.A03 : null;
        C115925Mi c115925Mi = (i & 128) != 0 ? c167297di.A08 : null;
        C115935Mj c115935Mj = (i & 256) != 0 ? c167297di.A0A : null;
        boolean z18 = (i & 512) != 0 ? c167297di.A0l : false;
        if ((i & 1024) != 0) {
            z12 = c167297di.A0j;
        }
        boolean z19 = (i & C3OO.FLAG_MOVED) != 0 ? c167297di.A0U : false;
        boolean z20 = (i & 4096) != 0 ? c167297di.A0Y : false;
        List list3 = (i & 8192) != 0 ? c167297di.A0P : null;
        boolean z21 = (i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? c167297di.A0d : false;
        boolean z22 = (i & Constants.LOAD_RESULT_PGO) != 0 ? c167297di.A0X : false;
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            z11 = c167297di.A0a;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            z13 = c167297di.A0S;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            num3 = c167297di.A0G;
        }
        if ((i & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            z10 = c167297di.A0T;
        }
        if ((i & 1048576) != 0) {
            l2 = c167297di.A0I;
        }
        C168497fj c168497fj = (i & 2097152) != 0 ? c167297di.A07 : null;
        if ((i & 4194304) != 0) {
            z15 = c167297di.A0b;
        }
        boolean z23 = (i & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0 ? c167297di.A0h : false;
        if ((i & 16777216) != 0) {
            enumC168507fk2 = c167297di.A05;
        }
        if ((i & 33554432) != 0) {
            enumC168517fl2 = c167297di.A00;
        }
        if ((i & 67108864) != 0) {
            enumC166167bk2 = c167297di.A06;
        }
        boolean z24 = (i & 134217728) != 0 ? c167297di.A0c : false;
        String str7 = (i & 268435456) != 0 ? c167297di.A0M : null;
        String str8 = (i & 536870912) != 0 ? c167297di.A0L : null;
        if ((i & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) != 0) {
            num4 = c167297di.A0H;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            z14 = c167297di.A0W;
        }
        AbstractC168537fn abstractC168537fn = (i2 & 1) != 0 ? c167297di.A04 : null;
        if ((i2 & 2) != 0) {
            z16 = c167297di.A0Z;
        }
        if ((i2 & 4) != 0) {
            z9 = c167297di.A0R;
        }
        boolean z25 = (i2 & 8) != 0 ? c167297di.A0k : false;
        C38891rO c38891rO = (i2 & 16) != 0 ? c167297di.A09 : null;
        if ((i2 & 32) != 0) {
            c169287h22 = c167297di.A0B;
        }
        if ((i2 & 64) != 0) {
            c169297h32 = c167297di.A0D;
        }
        boolean z26 = (i2 & 128) != 0 ? c167297di.A0i : false;
        boolean z27 = (i2 & 256) != 0 ? c167297di.A0e : false;
        if ((i2 & 512) != 0) {
            c169307h42 = c167297di.A02;
        }
        if ((i2 & 1024) != 0) {
            bool4 = c167297di.A0E;
        }
        if ((i2 & C3OO.FLAG_MOVED) != 0) {
            bool3 = c167297di.A0F;
        }
        if ((i2 & 4096) != 0) {
            list2 = c167297di.A0Q;
        }
        EnumC168547fo enumC168547fo = (i2 & 8192) != 0 ? c167297di.A01 : null;
        boolean z28 = (i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? c167297di.A0g : false;
        boolean z29 = (i2 & Constants.LOAD_RESULT_PGO) != 0 ? c167297di.A0f : false;
        C14360o3.A0B(str3, 0);
        C14360o3.A0B(user, 3);
        C14360o3.A0B(c168497fj, 21);
        C14360o3.A0B(enumC168507fk2, 24);
        C14360o3.A0B(enumC168517fl2, 25);
        C14360o3.A0B(enumC166167bk2, 26);
        C14360o3.A0B(str7, 28);
        C14360o3.A0B(num4, 30);
        C14360o3.A0B(abstractC168537fn, 32);
        C14360o3.A0B(enumC168547fo, 45);
        return new C167297di(enumC168517fl2, enumC168547fo, c169307h42, c169277h1, abstractC168537fn, enumC168507fk2, enumC166167bk2, c168497fj, c115925Mi, c38891rO, c115935Mj, c169287h22, user, c169297h32, bool4, bool3, num3, num4, l2, str3, str5, str6, str4, str7, str8, list3, list2, z17, z18, z12, z19, z20, z21, z22, z11, z13, z10, z15, z23, z24, z14, z16, z9, z25, z26, z27, z28, z29);
    }
}
