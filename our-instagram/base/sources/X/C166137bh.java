package X;

import java.util.List;

/* renamed from: X.7bh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166137bh extends C0T6 {
    public final int A00;
    public final C206409Bx A01;
    public final C166117bf A02;
    public final C166087bc A03;
    public final Integer A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final C166127bg A0C;

    public static /* synthetic */ C166137bh A01(C166087bc c166087bc, C166137bh c166137bh) {
        return A00(null, null, c166087bc, c166137bh, null, null, 0, 8187, false, false);
    }

    public static /* synthetic */ C166137bh A02(C166137bh c166137bh, List list, int i) {
        return A00(null, null, null, c166137bh, list, null, 0, i, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166137bh) {
                C166137bh c166137bh = (C166137bh) obj;
                if (!C14360o3.A0K(this.A06, c166137bh.A06) || !C14360o3.A0K(this.A07, c166137bh.A07) || !C14360o3.A0K(this.A03, c166137bh.A03) || !C14360o3.A0K(this.A02, c166137bh.A02) || !C14360o3.A0K(this.A0C, c166137bh.A0C) || !C14360o3.A0K(this.A01, c166137bh.A01) || this.A09 != c166137bh.A09 || this.A00 != c166137bh.A00 || !C14360o3.A0K(this.A05, c166137bh.A05) || !C14360o3.A0K(this.A04, c166137bh.A04) || this.A0B != c166137bh.A0B || this.A0A != c166137bh.A0A || this.A08 != c166137bh.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C166137bh A00(C206409Bx c206409Bx, C166117bf c166117bf, C166087bc c166087bc, C166137bh c166137bh, List list, List list2, int i, int i2, boolean z, boolean z2) {
        C166127bg c166127bg;
        String str;
        boolean z3;
        boolean z4;
        boolean z5 = z2;
        int i3 = i;
        boolean z6 = z;
        C206409Bx c206409Bx2 = c206409Bx;
        C166117bf c166117bf2 = c166117bf;
        C166087bc c166087bc2 = c166087bc;
        List list3 = list2;
        List list4 = list;
        Integer num = null;
        if ((i2 & 1) != 0) {
            list4 = c166137bh.A06;
        }
        if ((i2 & 2) != 0) {
            list3 = c166137bh.A07;
        }
        if ((i2 & 4) != 0) {
            c166087bc2 = c166137bh.A03;
        }
        if ((i2 & 8) != 0) {
            c166117bf2 = c166137bh.A02;
        }
        if ((i2 & 16) != 0) {
            c166127bg = c166137bh.A0C;
        } else {
            c166127bg = null;
        }
        if ((i2 & 32) != 0) {
            c206409Bx2 = c166137bh.A01;
        }
        if ((i2 & 64) != 0) {
            z6 = c166137bh.A09;
        }
        if ((i2 & 128) != 0) {
            i3 = c166137bh.A00;
        }
        if ((i2 & 256) != 0) {
            str = c166137bh.A05;
        } else {
            str = null;
        }
        if ((i2 & 512) != 0) {
            num = c166137bh.A04;
        }
        if ((i2 & 1024) != 0) {
            z3 = c166137bh.A0B;
        } else {
            z3 = false;
        }
        if ((i2 & C3OO.FLAG_MOVED) != 0) {
            z4 = c166137bh.A0A;
        } else {
            z4 = false;
        }
        if ((i2 & 4096) != 0) {
            z5 = c166137bh.A08;
        }
        C14360o3.A0B(list4, 0);
        C14360o3.A0B(list3, 1);
        C14360o3.A0B(c166087bc2, 2);
        C14360o3.A0B(c166117bf2, 3);
        C14360o3.A0B(c166127bg, 4);
        return new C166137bh(c206409Bx2, c166117bf2, c166087bc2, c166127bg, num, str, list4, list3, i3, z6, z3, z4, z5);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((((this.A06.hashCode() * 31) + this.A07.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A02.hashCode()) * 31) + hashCode()) * 31;
        C206409Bx c206409Bx = this.A01;
        int i = 0;
        if (c206409Bx == null) {
            hashCode = 0;
        } else {
            hashCode = c206409Bx.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        int i4 = (((i2 + i3) * 31) + this.A00) * 31;
        String str = this.A05;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        Integer num = this.A04;
        if (num != null) {
            i = num.hashCode();
        }
        int i6 = (i5 + i) * 31;
        int i7 = 1237;
        if (this.A0B) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0A) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A08) {
            i11 = 1231;
        }
        return i10 + i11;
    }

    public C166137bh(C206409Bx c206409Bx, C166117bf c166117bf, C166087bc c166087bc, C166127bg c166127bg, Integer num, String str, List list, List list2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = list;
        this.A07 = list2;
        this.A03 = c166087bc;
        this.A02 = c166117bf;
        this.A0C = c166127bg;
        this.A01 = c206409Bx;
        this.A09 = z;
        this.A00 = i;
        this.A05 = str;
        this.A04 = num;
        this.A0B = z2;
        this.A0A = z3;
        this.A08 = z4;
    }
}
