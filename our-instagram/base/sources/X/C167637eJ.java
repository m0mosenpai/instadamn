package X;

import java.util.List;

/* renamed from: X.7eJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167637eJ extends C0T6 implements InterfaceC166367c5 {
    public final C167607eG A00;
    public final C167627eI A01;
    public final C148286ly A02;
    public final InterfaceC38371qR A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final String A0I;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167637eJ) {
                C167637eJ c167637eJ = (C167637eJ) obj;
                if (this.A0D != c167637eJ.A0D || this.A0G != c167637eJ.A0G || !C14360o3.A0K(this.A07, c167637eJ.A07) || !C14360o3.A0K(this.A00, c167637eJ.A00) || !C14360o3.A0K(this.A01, c167637eJ.A01) || !C14360o3.A0K(this.A05, c167637eJ.A05) || !C14360o3.A0K(this.A08, c167637eJ.A08) || this.A0A != c167637eJ.A0A || this.A0H != c167637eJ.A0H || this.A09 != c167637eJ.A09 || this.A0C != c167637eJ.A0C || !C14360o3.A0K(this.A03, c167637eJ.A03) || !C14360o3.A0K(this.A0I, c167637eJ.A0I) || !C14360o3.A0K(this.A04, c167637eJ.A04) || this.A0E != c167637eJ.A0E || !C14360o3.A0K(this.A06, c167637eJ.A06) || this.A0F != c167637eJ.A0F || !C14360o3.A0K(this.A02, c167637eJ.A02) || this.A0B != c167637eJ.A0B) {
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
        int i = 1237;
        if (this.A0D) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A0G) {
            i3 = 1231;
        }
        int hashCode8 = (((i2 + i3) * 31) + this.A07.hashCode()) * 31;
        C167607eG c167607eG = this.A00;
        int i4 = 0;
        if (c167607eG == null) {
            hashCode = 0;
        } else {
            hashCode = c167607eG.hashCode();
        }
        int i5 = (hashCode8 + hashCode) * 31;
        C167627eI c167627eI = this.A01;
        if (c167627eI == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c167627eI.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        String str = this.A05;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int hashCode9 = (((i6 + hashCode3) * 31) + this.A08.hashCode()) * 31;
        int i7 = 1237;
        if (this.A0A) {
            i7 = 1231;
        }
        int i8 = (hashCode9 + i7) * 31;
        int i9 = 1237;
        if (this.A0H) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A09) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0C) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        InterfaceC38371qR interfaceC38371qR = this.A03;
        if (interfaceC38371qR == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = interfaceC38371qR.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str2 = this.A0I;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        Integer num = this.A04;
        if (num == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        int i18 = 1237;
        if (this.A0E) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        String str3 = this.A06;
        if (str3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str3.hashCode();
        }
        int i20 = (i19 + hashCode7) * 31;
        int i21 = 1237;
        if (this.A0F) {
            i21 = 1231;
        }
        int i22 = (i20 + i21) * 31;
        C148286ly c148286ly = this.A02;
        if (c148286ly != null) {
            i4 = c148286ly.hashCode();
        }
        int i23 = (i22 + i4) * 31;
        int i24 = 1237;
        if (this.A0B) {
            i24 = 1231;
        }
        return i23 + i24;
    }

    public C167637eJ(C167607eG c167607eG, C167627eI c167627eI, C148286ly c148286ly, InterfaceC38371qR interfaceC38371qR, Integer num, String str, String str2, String str3, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A0D = z;
        this.A0G = z2;
        this.A07 = list;
        this.A00 = c167607eG;
        this.A01 = c167627eI;
        this.A05 = str;
        this.A08 = list2;
        this.A0A = z3;
        this.A0H = z4;
        this.A09 = z5;
        this.A0C = z6;
        this.A03 = interfaceC38371qR;
        this.A0I = str2;
        this.A04 = num;
        this.A0E = z7;
        this.A06 = str3;
        this.A0F = z8;
        this.A02 = c148286ly;
        this.A0B = z9;
    }
}
