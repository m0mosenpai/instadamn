package X;

import com.instagram.api.schemas.IGCommentSheetMoreInfo;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.7bW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166047bW extends C0T6 {
    public final int A00;
    public final IGCommentSheetMoreInfo A01;
    public final TestimonialDict A02;
    public final ImageUrl A03;
    public final EnumC76383bi A04;
    public final EnumC40111tc A05;
    public final C3YU A06;
    public final ProductType A07;
    public final InterfaceC101404gy A08;
    public final InterfaceC101404gy A09;
    public final User A0A;
    public final Integer A0B;
    public final Long A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final Map A0Q;
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

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166047bW) {
                C166047bW c166047bW = (C166047bW) obj;
                if (this.A0B != c166047bW.A0B || this.A0S != c166047bW.A0S || this.A0Y != c166047bW.A0Y || !C14360o3.A0K(this.A0H, c166047bW.A0H) || this.A0T != c166047bW.A0T || this.A0W != c166047bW.A0W || this.A0Z != c166047bW.A0Z || this.A0U != c166047bW.A0U || this.A0g != c166047bW.A0g || this.A0a != c166047bW.A0a || this.A0b != c166047bW.A0b || this.A0c != c166047bW.A0c || this.A0d != c166047bW.A0d || this.A0e != c166047bW.A0e || this.A0f != c166047bW.A0f || !C14360o3.A0K(this.A0A, c166047bW.A0A) || !C14360o3.A0K(this.A0I, c166047bW.A0I) || this.A05 != c166047bW.A05 || !C14360o3.A0K(this.A0J, c166047bW.A0J) || !C14360o3.A0K(this.A0K, c166047bW.A0K) || this.A07 != c166047bW.A07 || !C14360o3.A0K(this.A0L, c166047bW.A0L) || !C14360o3.A0K(this.A0O, c166047bW.A0O) || !C14360o3.A0K(this.A0P, c166047bW.A0P) || !C14360o3.A0K(this.A0D, c166047bW.A0D) || this.A0h != c166047bW.A0h || !C14360o3.A0K(this.A0E, c166047bW.A0E) || !C14360o3.A0K(this.A0C, c166047bW.A0C) || !C14360o3.A0K(this.A0F, c166047bW.A0F) || this.A0V != c166047bW.A0V || this.A06 != c166047bW.A06 || !C14360o3.A0K(this.A09, c166047bW.A09) || !C14360o3.A0K(this.A08, c166047bW.A08) || this.A04 != c166047bW.A04 || this.A00 != c166047bW.A00 || this.A0R != c166047bW.A0R || !C14360o3.A0K(this.A0Q, c166047bW.A0Q) || !C14360o3.A0K(this.A03, c166047bW.A03) || this.A0X != c166047bW.A0X || !C14360o3.A0K(this.A0G, c166047bW.A0G) || !C14360o3.A0K(this.A0M, c166047bW.A0M) || !C14360o3.A0K(this.A0N, c166047bW.A0N) || !C14360o3.A0K(this.A02, c166047bW.A02) || !C14360o3.A0K(this.A01, c166047bW.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
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
        Integer num = this.A0B;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "ORGANIC";
                    break;
                case 2:
                    str = "UNKNOWN";
                    break;
                default:
                    str = "AD";
                    break;
            }
            hashCode = str.hashCode() + intValue;
        }
        int i2 = hashCode * 31;
        int i3 = 1237;
        if (this.A0S) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0Y) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        String str2 = this.A0H;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i7 = (i6 + hashCode2) * 31;
        int i8 = 1237;
        if (this.A0T) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A0W) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A0Z) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        int i14 = 1237;
        if (this.A0U) {
            i14 = 1231;
        }
        int i15 = (i13 + i14) * 31;
        int i16 = 1237;
        if (this.A0g) {
            i16 = 1231;
        }
        int i17 = (i15 + i16) * 31;
        int i18 = 1237;
        if (this.A0a) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        int i20 = 1237;
        if (this.A0b) {
            i20 = 1231;
        }
        int i21 = (i19 + i20) * 31;
        int i22 = 1237;
        if (this.A0c) {
            i22 = 1231;
        }
        int i23 = (i21 + i22) * 31;
        int i24 = 1237;
        if (this.A0d) {
            i24 = 1231;
        }
        int i25 = (i23 + i24) * 31;
        int i26 = 1237;
        if (this.A0e) {
            i26 = 1231;
        }
        int i27 = (i25 + i26) * 31;
        int i28 = 1237;
        if (this.A0f) {
            i28 = 1231;
        }
        int i29 = (i27 + i28) * 31;
        User user = this.A0A;
        if (user == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = user.hashCode();
        }
        int hashCode21 = (((((i29 + hashCode3) * 31) + this.A0I.hashCode()) * 31) + this.A05.hashCode()) * 31;
        String str3 = this.A0J;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int hashCode22 = (((hashCode21 + hashCode4) * 31) + this.A0K.hashCode()) * 31;
        ProductType productType = this.A07;
        if (productType == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = productType.hashCode();
        }
        int i30 = (hashCode22 + hashCode5) * 31;
        String str4 = this.A0L;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i31 = (i30 + hashCode6) * 31;
        String str5 = this.A0O;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i32 = (i31 + hashCode7) * 31;
        String str6 = this.A0P;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i33 = (i32 + hashCode8) * 31;
        String str7 = this.A0D;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i34 = (i33 + hashCode9) * 31;
        int i35 = 1237;
        if (this.A0h) {
            i35 = 1231;
        }
        int i36 = (i34 + i35) * 31;
        String str8 = this.A0E;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i37 = (i36 + hashCode10) * 31;
        Long l = this.A0C;
        if (l == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = l.hashCode();
        }
        int i38 = (i37 + hashCode11) * 31;
        String str9 = this.A0F;
        if (str9 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str9.hashCode();
        }
        int i39 = (i38 + hashCode12) * 31;
        int i40 = 1237;
        if (this.A0V) {
            i40 = 1231;
        }
        int hashCode23 = (((i39 + i40) * 31) + this.A06.hashCode()) * 31;
        InterfaceC101404gy interfaceC101404gy = this.A09;
        if (interfaceC101404gy == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = interfaceC101404gy.hashCode();
        }
        int i41 = (hashCode23 + hashCode13) * 31;
        InterfaceC101404gy interfaceC101404gy2 = this.A08;
        if (interfaceC101404gy2 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = interfaceC101404gy2.hashCode();
        }
        int hashCode24 = (((((i41 + hashCode14) * 31) + this.A04.hashCode()) * 31) + this.A00) * 31;
        int i42 = 1237;
        if (this.A0R) {
            i42 = 1231;
        }
        int i43 = (hashCode24 + i42) * 31;
        Map map = this.A0Q;
        if (map == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = map.hashCode();
        }
        int i44 = (i43 + hashCode15) * 31;
        ImageUrl imageUrl = this.A03;
        if (imageUrl == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = imageUrl.hashCode();
        }
        int i45 = (i44 + hashCode16) * 31;
        int i46 = 1237;
        if (this.A0X) {
            i46 = 1231;
        }
        int i47 = (i45 + i46) * 31;
        String str10 = this.A0G;
        if (str10 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str10.hashCode();
        }
        int i48 = (i47 + hashCode17) * 31;
        String str11 = this.A0M;
        if (str11 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str11.hashCode();
        }
        int i49 = (i48 + hashCode18) * 31;
        String str12 = this.A0N;
        if (str12 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str12.hashCode();
        }
        int i50 = (i49 + hashCode19) * 31;
        TestimonialDict testimonialDict = this.A02;
        if (testimonialDict == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = testimonialDict.hashCode();
        }
        int i51 = (i50 + hashCode20) * 31;
        IGCommentSheetMoreInfo iGCommentSheetMoreInfo = this.A01;
        if (iGCommentSheetMoreInfo != null) {
            i = iGCommentSheetMoreInfo.hashCode();
        }
        return i51 + i;
    }

    public C166047bW(IGCommentSheetMoreInfo iGCommentSheetMoreInfo, TestimonialDict testimonialDict, ImageUrl imageUrl, EnumC76383bi enumC76383bi, EnumC40111tc enumC40111tc, C3YU c3yu, ProductType productType, InterfaceC101404gy interfaceC101404gy, InterfaceC101404gy interfaceC101404gy2, User user, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Map map, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        C14360o3.A0B(c3yu, 31);
        C14360o3.A0B(enumC76383bi, 34);
        this.A0B = num;
        this.A0S = z;
        this.A0Y = z2;
        this.A0H = str;
        this.A0T = z3;
        this.A0W = z4;
        this.A0Z = z5;
        this.A0U = z6;
        this.A0g = z7;
        this.A0a = z8;
        this.A0b = z9;
        this.A0c = z10;
        this.A0d = z11;
        this.A0e = z12;
        this.A0f = z13;
        this.A0A = user;
        this.A0I = str2;
        this.A05 = enumC40111tc;
        this.A0J = str3;
        this.A0K = str4;
        this.A07 = productType;
        this.A0L = str5;
        this.A0O = str6;
        this.A0P = str7;
        this.A0D = str8;
        this.A0h = z14;
        this.A0E = str9;
        this.A0C = l;
        this.A0F = str10;
        this.A0V = z15;
        this.A06 = c3yu;
        this.A09 = interfaceC101404gy;
        this.A08 = interfaceC101404gy2;
        this.A04 = enumC76383bi;
        this.A00 = i;
        this.A0R = z16;
        this.A0Q = map;
        this.A03 = imageUrl;
        this.A0X = z17;
        this.A0G = str11;
        this.A0M = str12;
        this.A0N = str13;
        this.A02 = testimonialDict;
        this.A01 = iGCommentSheetMoreInfo;
    }
}
