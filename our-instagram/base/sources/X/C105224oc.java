package X;

import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.4oc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105224oc extends C0T6 {
    public final float A00;
    public final int A01;
    public final C9BS A02;
    public final C9BU A03;
    public final C9BW A04;
    public final C9C6 A05;
    public final C38321qM A06;
    public final C80143i3 A07;
    public final EnumC79303gb A08;
    public final EnumC76383bi A09;
    public final C3t9 A0A;
    public final EnumC74373Vt A0B;
    public final User A0C;
    public final User A0D;
    public final Float A0E;
    public final Integer A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final Map A0K;
    public final Map A0L;
    public final Map A0M;
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
    public final float A0Z;
    public final float A0a;
    public final int A0b;
    public final int A0c;
    public final String A0d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C105224oc) {
                C105224oc c105224oc = (C105224oc) obj;
                if (!C14360o3.A0K(this.A0H, c105224oc.A0H) || !C14360o3.A0K(this.A0G, c105224oc.A0G) || this.A0b != c105224oc.A0b || this.A0c != c105224oc.A0c || this.A01 != c105224oc.A01 || this.A0B != c105224oc.A0B || this.A08 != c105224oc.A08 || this.A0P != c105224oc.A0P || this.A0X != c105224oc.A0X || !C14360o3.A0K(this.A0L, c105224oc.A0L) || !C14360o3.A0K(this.A0K, c105224oc.A0K) || !C14360o3.A0K(this.A0M, c105224oc.A0M) || !C14360o3.A0K(this.A0d, c105224oc.A0d) || this.A0O != c105224oc.A0O || Float.compare(this.A0a, c105224oc.A0a) != 0 || Float.compare(this.A0Z, c105224oc.A0Z) != 0 || !C14360o3.A0K(this.A07, c105224oc.A07) || !C14360o3.A0K(this.A0A, c105224oc.A0A) || !C14360o3.A0K(this.A04, c105224oc.A04) || this.A0Y != c105224oc.A0Y || !C14360o3.A0K(this.A02, c105224oc.A02) || this.A0V != c105224oc.A0V || this.A0U != c105224oc.A0U || this.A0Q != c105224oc.A0Q || !C14360o3.A0K(this.A03, c105224oc.A03) || this.A0R != c105224oc.A0R || this.A0T != c105224oc.A0T || this.A0S != c105224oc.A0S || !C14360o3.A0K(this.A0D, c105224oc.A0D) || !C14360o3.A0K(this.A0C, c105224oc.A0C) || !C14360o3.A0K(this.A0J, c105224oc.A0J) || Float.compare(this.A00, c105224oc.A00) != 0 || !C14360o3.A0K(this.A0I, c105224oc.A0I) || this.A09 != c105224oc.A09 || this.A0W != c105224oc.A0W || !C14360o3.A0K(this.A0F, c105224oc.A0F) || this.A0N != c105224oc.A0N || !C14360o3.A0K(this.A06, c105224oc.A06) || !C14360o3.A0K(this.A05, c105224oc.A05) || !C14360o3.A0K(this.A0E, c105224oc.A0E)) {
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
        int hashCode8 = ((((((((((((this.A0H.hashCode() * 31) + this.A0G.hashCode()) * 31) + this.A0b) * 31) + this.A0c) * 31) + this.A01) * 31) + this.A0B.hashCode()) * 31) + this.A08.hashCode()) * 31;
        int i = 1237;
        if (this.A0P) {
            i = 1231;
        }
        int i2 = (hashCode8 + i) * 31;
        int i3 = 1237;
        if (this.A0X) {
            i3 = 1231;
        }
        int hashCode9 = (((((((i2 + i3) * 31) + this.A0L.hashCode()) * 31) + this.A0K.hashCode()) * 31) + this.A0M.hashCode()) * 31;
        String str = this.A0d;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (hashCode9 + hashCode) * 31;
        int i6 = 1237;
        if (this.A0O) {
            i6 = 1231;
        }
        int floatToIntBits = (((((((i5 + i6) * 31) + Float.floatToIntBits(this.A0a)) * 31) + Float.floatToIntBits(this.A0Z)) * 31) + this.A07.hashCode()) * 31;
        C3t9 c3t9 = this.A0A;
        if (c3t9 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c3t9.hashCode();
        }
        int hashCode10 = (((floatToIntBits + hashCode2) * 31) + this.A04.hashCode()) * 31;
        int i7 = 1237;
        if (this.A0Y) {
            i7 = 1231;
        }
        int hashCode11 = (((hashCode10 + i7) * 31) + this.A02.hashCode()) * 31;
        int i8 = 1237;
        if (this.A0V) {
            i8 = 1231;
        }
        int i9 = (hashCode11 + i8) * 31;
        int i10 = 1237;
        if (this.A0U) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A0Q) {
            i12 = 1231;
        }
        int hashCode12 = (((i11 + i12) * 31) + this.A03.hashCode()) * 31;
        int i13 = 1237;
        if (this.A0R) {
            i13 = 1231;
        }
        int i14 = (hashCode12 + i13) * 31;
        int i15 = 1237;
        if (this.A0T) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        int i17 = 1237;
        if (this.A0S) {
            i17 = 1231;
        }
        int i18 = (i16 + i17) * 31;
        User user = this.A0D;
        if (user == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = user.hashCode();
        }
        int i19 = (i18 + hashCode3) * 31;
        User user2 = this.A0C;
        if (user2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = user2.hashCode();
        }
        int hashCode13 = (((((i19 + hashCode4) * 31) + this.A0J.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31;
        String str2 = this.A0I;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int hashCode14 = (((hashCode13 + hashCode5) * 31) + this.A09.hashCode()) * 31;
        int i20 = 1237;
        if (this.A0W) {
            i20 = 1231;
        }
        int i21 = (hashCode14 + i20) * 31;
        Integer num = this.A0F;
        if (num == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num.hashCode();
        }
        int i22 = (i21 + hashCode6) * 31;
        int i23 = 1237;
        if (this.A0N) {
            i23 = 1231;
        }
        int hashCode15 = (((i22 + i23) * 31) + this.A06.hashCode()) * 31;
        C9C6 c9c6 = this.A05;
        if (c9c6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c9c6.hashCode();
        }
        int i24 = (hashCode15 + hashCode7) * 31;
        Float f = this.A0E;
        if (f != null) {
            i4 = f.hashCode();
        }
        return i24 + i4;
    }

    public C105224oc(C9BS c9bs, C9BU c9bu, C9BW c9bw, C9C6 c9c6, C38321qM c38321qM, C80143i3 c80143i3, EnumC79303gb enumC79303gb, EnumC76383bi enumC76383bi, C3t9 c3t9, EnumC74373Vt enumC74373Vt, User user, User user2, Float f, Integer num, String str, String str2, String str3, String str4, String str5, Map map, Map map2, Map map3, float f2, float f3, float f4, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        C14360o3.A0B(str4, 31);
        C14360o3.A0B(enumC76383bi, 34);
        this.A0H = str;
        this.A0G = str2;
        this.A0b = i;
        this.A0c = i2;
        this.A01 = i3;
        this.A0B = enumC74373Vt;
        this.A08 = enumC79303gb;
        this.A0P = z;
        this.A0X = z2;
        this.A0L = map;
        this.A0K = map2;
        this.A0M = map3;
        this.A0d = str3;
        this.A0O = z3;
        this.A0a = f2;
        this.A0Z = f3;
        this.A07 = c80143i3;
        this.A0A = c3t9;
        this.A04 = c9bw;
        this.A0Y = z4;
        this.A02 = c9bs;
        this.A0V = z5;
        this.A0U = z6;
        this.A0Q = z7;
        this.A03 = c9bu;
        this.A0R = z8;
        this.A0T = z9;
        this.A0S = z10;
        this.A0D = user;
        this.A0C = user2;
        this.A0J = str4;
        this.A00 = f4;
        this.A0I = str5;
        this.A09 = enumC76383bi;
        this.A0W = z11;
        this.A0F = num;
        this.A0N = z12;
        this.A06 = c38321qM;
        this.A05 = c9c6;
        this.A0E = f;
    }
}
