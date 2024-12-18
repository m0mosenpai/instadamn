package X;

import com.instagram.api.schemas.MetaPlaceDict;
import com.instagram.api.schemas.TextPostAppHeaderFollowVariant;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.FollowStatus;

/* renamed from: X.5y1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132235y1 extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final MetaPlaceDict A01;
    public final TextPostAppHeaderFollowVariant A02;
    public final EnumC132215xz A03;
    public final C132175xv A04;
    public final C26036BfP A05;
    public final ImageUrl A06;
    public final FollowStatus A07;
    public final Double A08;
    public final Long A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
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
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132235y1) {
                C132235y1 c132235y1 = (C132235y1) obj;
                if (!C14360o3.A0K(this.A04, c132235y1.A04) || !C14360o3.A0K(this.A05, c132235y1.A05) || !C14360o3.A0K(this.A06, c132235y1.A06) || !C14360o3.A0K(this.A0B, c132235y1.A0B) || !C14360o3.A0K(this.A0F, c132235y1.A0F) || this.A00 != c132235y1.A00 || this.A07 != c132235y1.A07 || this.A0U != c132235y1.A0U || this.A0O != c132235y1.A0O || this.A0J != c132235y1.A0J || this.A0Q != c132235y1.A0Q || this.A03 != c132235y1.A03 || this.A0P != c132235y1.A0P || !C14360o3.A0K(this.A08, c132235y1.A08) || this.A0L != c132235y1.A0L || this.A0G != c132235y1.A0G || this.A0V != c132235y1.A0V || this.A0I != c132235y1.A0I || this.A0H != c132235y1.A0H || this.A0X != c132235y1.A0X || this.A0W != c132235y1.A0W || this.A02 != c132235y1.A02 || this.A0N != c132235y1.A0N || this.A0M != c132235y1.A0M || this.A0R != c132235y1.A0R || !C14360o3.A0K(this.A0A, c132235y1.A0A) || !C14360o3.A0K(this.A0E, c132235y1.A0E) || !C14360o3.A0K(this.A0D, c132235y1.A0D) || this.A0Y != c132235y1.A0Y || !C14360o3.A0K(this.A09, c132235y1.A09) || !C14360o3.A0K(this.A01, c132235y1.A01) || this.A0K != c132235y1.A0K || this.A0T != c132235y1.A0T || this.A0S != c132235y1.A0S || !C14360o3.A0K(this.A0C, c132235y1.A0C)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return AbstractC132295y8.A01(this, "header", this.A04.A03);
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A04;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = ((this.A04.hashCode() * 31) + this.A05.hashCode()) * 31;
        ImageUrl imageUrl = this.A06;
        int i = 0;
        if (imageUrl == null) {
            hashCode = 0;
        } else {
            hashCode = imageUrl.hashCode();
        }
        int hashCode9 = (((((((((hashCode8 + hashCode) * 31) + this.A0B.hashCode()) * 31) + this.A0F.hashCode()) * 31) + this.A00) * 31) + this.A07.hashCode()) * 31;
        int i2 = 1237;
        if (this.A0U) {
            i2 = 1231;
        }
        int i3 = (hashCode9 + i2) * 31;
        int i4 = 1237;
        if (this.A0O) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A0J) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A0Q) {
            i8 = 1231;
        }
        int hashCode10 = (((i7 + i8) * 31) + this.A03.hashCode()) * 31;
        int i9 = 1237;
        if (this.A0P) {
            i9 = 1231;
        }
        int i10 = (hashCode10 + i9) * 31;
        Double d = this.A08;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        int i12 = 1237;
        if (this.A0L) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        int i14 = 1237;
        if (this.A0G) {
            i14 = 1231;
        }
        int i15 = (i13 + i14) * 31;
        int i16 = 1237;
        if (this.A0V) {
            i16 = 1231;
        }
        int i17 = (i15 + i16) * 31;
        int i18 = 1237;
        if (this.A0I) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        int i20 = 1237;
        if (this.A0H) {
            i20 = 1231;
        }
        int i21 = (i19 + i20) * 31;
        int i22 = 1237;
        if (this.A0X) {
            i22 = 1231;
        }
        int i23 = (i21 + i22) * 31;
        int i24 = 1237;
        if (this.A0W) {
            i24 = 1231;
        }
        int hashCode11 = (((i23 + i24) * 31) + this.A02.hashCode()) * 31;
        int i25 = 1237;
        if (this.A0N) {
            i25 = 1231;
        }
        int i26 = (hashCode11 + i25) * 31;
        int i27 = 1237;
        if (this.A0M) {
            i27 = 1231;
        }
        int i28 = (i26 + i27) * 31;
        int i29 = 1237;
        if (this.A0R) {
            i29 = 1231;
        }
        int i30 = (i28 + i29) * 31;
        String str = this.A0A;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i31 = (i30 + hashCode3) * 31;
        String str2 = this.A0E;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i32 = (i31 + hashCode4) * 31;
        String str3 = this.A0D;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i33 = (i32 + hashCode5) * 31;
        int i34 = 1237;
        if (this.A0Y) {
            i34 = 1231;
        }
        int i35 = (i33 + i34) * 31;
        Long l = this.A09;
        if (l == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l.hashCode();
        }
        int i36 = (i35 + hashCode6) * 31;
        MetaPlaceDict metaPlaceDict = this.A01;
        if (metaPlaceDict == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = metaPlaceDict.hashCode();
        }
        int i37 = (i36 + hashCode7) * 31;
        int i38 = 1237;
        if (this.A0K) {
            i38 = 1231;
        }
        int i39 = (i37 + i38) * 31;
        int i40 = 1237;
        if (this.A0T) {
            i40 = 1231;
        }
        int i41 = (i39 + i40) * 31;
        int i42 = 1237;
        if (this.A0S) {
            i42 = 1231;
        }
        int i43 = (i41 + i42) * 31;
        String str4 = this.A0C;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i43 + i;
    }

    public C132235y1(MetaPlaceDict metaPlaceDict, TextPostAppHeaderFollowVariant textPostAppHeaderFollowVariant, EnumC132215xz enumC132215xz, C132175xv c132175xv, C26036BfP c26036BfP, ImageUrl imageUrl, FollowStatus followStatus, Double d, Long l, String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.A04 = c132175xv;
        this.A05 = c26036BfP;
        this.A06 = imageUrl;
        this.A0B = str;
        this.A0F = str2;
        this.A00 = i;
        this.A07 = followStatus;
        this.A0U = z;
        this.A0O = z2;
        this.A0J = z3;
        this.A0Q = z4;
        this.A03 = enumC132215xz;
        this.A0P = z5;
        this.A08 = d;
        this.A0L = z6;
        this.A0G = z7;
        this.A0V = z8;
        this.A0I = z9;
        this.A0H = z10;
        this.A0X = z11;
        this.A0W = z12;
        this.A02 = textPostAppHeaderFollowVariant;
        this.A0N = z13;
        this.A0M = z14;
        this.A0R = z15;
        this.A0A = str3;
        this.A0E = str4;
        this.A0D = str5;
        this.A0Y = z16;
        this.A09 = l;
        this.A01 = metaPlaceDict;
        this.A0K = z17;
        this.A0T = z18;
        this.A0S = z19;
        this.A0C = str6;
    }
}
