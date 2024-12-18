package X;

import com.instagram.api.schemas.LineType;

/* renamed from: X.5xv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132175xv extends C0T6 {
    public final LineType A00;
    public final EnumC132165xt A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C132175xv(LineType lineType, EnumC132165xt enumC132165xt, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        this.A06 = str;
        this.A07 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A02 = str6;
        this.A08 = str7;
        this.A0A = z;
        this.A0D = z2;
        this.A09 = z3;
        this.A01 = enumC132165xt;
        this.A00 = lineType;
        this.A0B = z4;
        this.A0C = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132175xv) {
                C132175xv c132175xv = (C132175xv) obj;
                if (!C14360o3.A0K(this.A06, c132175xv.A06) || !C14360o3.A0K(this.A07, c132175xv.A07) || !C14360o3.A0K(this.A03, c132175xv.A03) || !C14360o3.A0K(this.A04, c132175xv.A04) || !C14360o3.A0K(this.A05, c132175xv.A05) || !C14360o3.A0K(this.A02, c132175xv.A02) || !C14360o3.A0K(this.A08, c132175xv.A08) || this.A0A != c132175xv.A0A || this.A0D != c132175xv.A0D || this.A09 != c132175xv.A09 || this.A01 != c132175xv.A01 || this.A00 != c132175xv.A00 || this.A0B != c132175xv.A0B || this.A0C != c132175xv.A0C) {
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
        int hashCode4 = ((((this.A06.hashCode() * 31) + this.A07.hashCode()) * 31) + this.A03.hashCode()) * 31;
        String str = this.A04;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31 * 31;
        String str2 = this.A05;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.A02;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31 * 31;
        String str4 = this.A08;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int A00 = (((i4 + i) * 31) + AbstractC53644Nnp.A00()) * 31;
        int i5 = 1237;
        if (this.A0A) {
            i5 = 1231;
        }
        int i6 = (A00 + i5) * 31;
        int i7 = 1237;
        if (this.A0D) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A09) {
            i9 = 1231;
        }
        int hashCode5 = (((((i8 + i9) * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode()) * 31;
        int i10 = 1237;
        if (this.A0B) {
            i10 = 1231;
        }
        int i11 = (hashCode5 + i10) * 31;
        int i12 = 1237;
        if (this.A0C) {
            i12 = 1231;
        }
        return i11 + i12;
    }
}
