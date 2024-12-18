package X;

import com.instagram.search.common.analytics.SearchContext;
import java.util.List;
import java.util.Map;

/* renamed from: X.6jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147236jz extends C0T6 {
    public final C3G2 A00;
    public final String A01;
    public final String A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final SearchContext A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final Boolean A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final Long A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final List A0Y;
    public final List A0Z;
    public final List A0a;
    public final Map A0b;
    public final Map A0c;
    public final boolean A0d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C147236jz) {
                C147236jz c147236jz = (C147236jz) obj;
                if (!C14360o3.A0K(this.A0Z, c147236jz.A0Z) || !C14360o3.A0K(this.A0a, c147236jz.A0a) || this.A00 != c147236jz.A00 || !C14360o3.A0K(this.A02, c147236jz.A02) || this.A05 != c147236jz.A05 || this.A04 != c147236jz.A04 || this.A0d != c147236jz.A0d || this.A03 != c147236jz.A03 || !C14360o3.A0K(this.A0I, c147236jz.A0I) || !C14360o3.A0K(this.A08, c147236jz.A08) || !C14360o3.A0K(this.A09, c147236jz.A09) || !C14360o3.A0K(this.A0R, c147236jz.A0R) || !C14360o3.A0K(this.A0U, c147236jz.A0U) || !C14360o3.A0K(this.A0P, c147236jz.A0P) || !C14360o3.A0K(this.A0F, c147236jz.A0F) || !C14360o3.A0K(this.A0T, c147236jz.A0T) || !C14360o3.A0K(this.A0V, c147236jz.A0V) || !C14360o3.A0K(this.A0L, c147236jz.A0L) || !C14360o3.A0K(this.A0M, c147236jz.A0M) || !C14360o3.A0K(this.A0O, c147236jz.A0O) || !C14360o3.A0K(this.A0K, c147236jz.A0K) || !C14360o3.A0K(this.A0S, c147236jz.A0S) || !C14360o3.A0K(this.A0W, c147236jz.A0W) || !C14360o3.A0K(this.A01, c147236jz.A01) || !C14360o3.A0K(this.A07, c147236jz.A07) || !C14360o3.A0K(this.A0X, c147236jz.A0X) || !C14360o3.A0K(this.A0G, c147236jz.A0G) || !C14360o3.A0K(this.A0B, c147236jz.A0B) || !C14360o3.A0K(this.A0H, c147236jz.A0H) || !C14360o3.A0K(this.A0C, c147236jz.A0C) || !C14360o3.A0K(this.A0E, c147236jz.A0E) || !C14360o3.A0K(this.A0D, c147236jz.A0D) || !C14360o3.A0K(this.A0A, c147236jz.A0A) || !C14360o3.A0K(this.A0b, c147236jz.A0b) || !C14360o3.A0K(this.A0c, c147236jz.A0c) || !C14360o3.A0K(this.A0Q, c147236jz.A0Q) || !C14360o3.A0K(this.A0N, c147236jz.A0N) || !C14360o3.A0K(this.A06, c147236jz.A06) || !C14360o3.A0K(this.A0Y, c147236jz.A0Y) || !C14360o3.A0K(this.A0J, c147236jz.A0J)) {
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
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32 = ((((((((((this.A0Z.hashCode() * 31) + this.A0a.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A05) * 31) + this.A04) * 31;
        int i = 1237;
        if (this.A0d) {
            i = 1231;
        }
        int i2 = (((hashCode32 + i) * 31) + this.A03) * 31;
        Long l = this.A0I;
        int i3 = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        Boolean bool = this.A08;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        Boolean bool2 = this.A09;
        if (bool2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool2.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        String str = this.A0R;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        String str2 = this.A0U;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i8 = (i7 + hashCode5) * 31;
        String str3 = this.A0P;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i9 = (i8 + hashCode6) * 31;
        Integer num = this.A0F;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int i10 = (i9 + hashCode7) * 31;
        String str4 = this.A0T;
        if (str4 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str4.hashCode();
        }
        int i11 = (i10 + hashCode8) * 31;
        String str5 = this.A0V;
        if (str5 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str5.hashCode();
        }
        int i12 = (i11 + hashCode9) * 31;
        String str6 = this.A0L;
        if (str6 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str6.hashCode();
        }
        int i13 = (i12 + hashCode10) * 31;
        String str7 = this.A0M;
        if (str7 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str7.hashCode();
        }
        int i14 = (i13 + hashCode11) * 31;
        String str8 = this.A0O;
        if (str8 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str8.hashCode();
        }
        int i15 = (i14 + hashCode12) * 31;
        String str9 = this.A0K;
        if (str9 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str9.hashCode();
        }
        int i16 = (i15 + hashCode13) * 31;
        String str10 = this.A0S;
        if (str10 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str10.hashCode();
        }
        int i17 = (i16 + hashCode14) * 31;
        String str11 = this.A0W;
        if (str11 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str11.hashCode();
        }
        int i18 = (i17 + hashCode15) * 31;
        String str12 = this.A01;
        if (str12 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str12.hashCode();
        }
        int i19 = (i18 + hashCode16) * 31;
        Boolean bool3 = this.A07;
        if (bool3 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = bool3.hashCode();
        }
        int i20 = (i19 + hashCode17) * 31;
        String str13 = this.A0X;
        if (str13 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str13.hashCode();
        }
        int i21 = (i20 + hashCode18) * 31;
        Integer num2 = this.A0G;
        if (num2 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = num2.hashCode();
        }
        int i22 = (i21 + hashCode19) * 31;
        Boolean bool4 = this.A0B;
        if (bool4 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = bool4.hashCode();
        }
        int i23 = (i22 + hashCode20) * 31;
        Integer num3 = this.A0H;
        if (num3 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = num3.hashCode();
        }
        int i24 = (i23 + hashCode21) * 31;
        Boolean bool5 = this.A0C;
        if (bool5 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = bool5.hashCode();
        }
        int i25 = (i24 + hashCode22) * 31;
        Boolean bool6 = this.A0E;
        if (bool6 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = bool6.hashCode();
        }
        int i26 = (i25 + hashCode23) * 31;
        Boolean bool7 = this.A0D;
        if (bool7 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = bool7.hashCode();
        }
        int i27 = (i26 + hashCode24) * 31;
        Boolean bool8 = this.A0A;
        if (bool8 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = bool8.hashCode();
        }
        int i28 = (i27 + hashCode25) * 31;
        Map map = this.A0b;
        if (map == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = map.hashCode();
        }
        int i29 = (i28 + hashCode26) * 31;
        Map map2 = this.A0c;
        if (map2 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = map2.hashCode();
        }
        int i30 = (i29 + hashCode27) * 31;
        String str14 = this.A0Q;
        if (str14 == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = str14.hashCode();
        }
        int i31 = (i30 + hashCode28) * 31;
        String str15 = this.A0N;
        if (str15 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = str15.hashCode();
        }
        int i32 = (i31 + hashCode29) * 31;
        SearchContext searchContext = this.A06;
        if (searchContext == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = searchContext.hashCode();
        }
        int i33 = (i32 + hashCode30) * 31;
        List list = this.A0Y;
        if (list == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = list.hashCode();
        }
        int i34 = (i33 + hashCode31) * 31;
        String str16 = this.A0J;
        if (str16 != null) {
            i3 = str16.hashCode();
        }
        return i34 + i3;
    }

    public C147236jz(C3G2 c3g2, SearchContext searchContext, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List list, List list2, List list3, Map map, Map map2, int i, int i2, int i3, boolean z) {
        this.A0Z = list;
        this.A0a = list2;
        this.A00 = c3g2;
        this.A02 = str;
        this.A05 = i;
        this.A04 = i2;
        this.A0d = z;
        this.A03 = i3;
        this.A0I = l;
        this.A08 = bool;
        this.A09 = bool2;
        this.A0R = str2;
        this.A0U = str3;
        this.A0P = str4;
        this.A0F = num;
        this.A0T = str5;
        this.A0V = str6;
        this.A0L = str7;
        this.A0M = str8;
        this.A0O = str9;
        this.A0K = str10;
        this.A0S = str11;
        this.A0W = str12;
        this.A01 = str13;
        this.A07 = bool3;
        this.A0X = str14;
        this.A0G = num2;
        this.A0B = bool4;
        this.A0H = num3;
        this.A0C = bool5;
        this.A0E = bool6;
        this.A0D = bool7;
        this.A0A = bool8;
        this.A0b = map;
        this.A0c = map2;
        this.A0Q = str15;
        this.A0N = str16;
        this.A06 = searchContext;
        this.A0Y = list3;
        this.A0J = str17;
    }
}
