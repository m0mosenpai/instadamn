package X;

import java.util.List;

/* renamed from: X.7c2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166337c2 extends C0T6 implements InterfaceC166347c3 {
    public final C25314BIj A00;
    public final C51756Mtf A01;
    public final C166047bW A02;
    public final InterfaceC166277bw A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166337c2) {
                C166337c2 c166337c2 = (C166337c2) obj;
                if (!C14360o3.A0K(this.A08, c166337c2.A08) || !C14360o3.A0K(this.A01, c166337c2.A01) || !C14360o3.A0K(this.A03, c166337c2.A03) || !C14360o3.A0K(this.A09, c166337c2.A09) || !C14360o3.A0K(this.A02, c166337c2.A02) || !C14360o3.A0K(this.A00, c166337c2.A00) || !C14360o3.A0K(this.A05, c166337c2.A05) || !C14360o3.A0K(this.A04, c166337c2.A04) || this.A0F != c166337c2.A0F || this.A0D != c166337c2.A0D || !C14360o3.A0K(this.A07, c166337c2.A07) || this.A0E != c166337c2.A0E || this.A0B != c166337c2.A0B || this.A0C != c166337c2.A0C || this.A0G != c166337c2.A0G || !C14360o3.A0K(this.A06, c166337c2.A06) || this.A0A != c166337c2.A0A) {
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
        int hashCode7 = this.A08.hashCode() * 31;
        C51756Mtf c51756Mtf = this.A01;
        int i = 0;
        if (c51756Mtf == null) {
            hashCode = 0;
        } else {
            hashCode = c51756Mtf.hashCode();
        }
        int hashCode8 = (((((hashCode7 + hashCode) * 31) + this.A03.hashCode()) * 31) + this.A09.hashCode()) * 31;
        C166047bW c166047bW = this.A02;
        if (c166047bW == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c166047bW.hashCode();
        }
        int i2 = (hashCode8 + hashCode2) * 31;
        C25314BIj c25314BIj = this.A00;
        if (c25314BIj == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c25314BIj.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str = this.A05;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        Integer num = this.A04;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        int i6 = 1237;
        if (this.A0F) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A0D) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        String str2 = this.A07;
        if (str2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str2.hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        int i11 = 1237;
        if (this.A0E) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0B) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A0C) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        int i17 = 1237;
        if (this.A0G) {
            i17 = 1231;
        }
        int i18 = (i16 + i17) * 31;
        String str3 = this.A06;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i19 = (i18 + i) * 31;
        int i20 = 1237;
        if (this.A0A) {
            i20 = 1231;
        }
        return i19 + i20;
    }

    public C166337c2(C25314BIj c25314BIj, C51756Mtf c51756Mtf, C166047bW c166047bW, InterfaceC166277bw interfaceC166277bw, Integer num, String str, String str2, String str3, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A08 = list;
        this.A01 = c51756Mtf;
        this.A03 = interfaceC166277bw;
        this.A09 = list2;
        this.A02 = c166047bW;
        this.A00 = c25314BIj;
        this.A05 = str;
        this.A04 = num;
        this.A0F = z;
        this.A0D = z2;
        this.A07 = str2;
        this.A0E = z3;
        this.A0B = z4;
        this.A0C = z5;
        this.A0G = z6;
        this.A06 = str3;
        this.A0A = z7;
    }
}
