package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4Vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96604Vv {
    public static final Object A0H = new Object();
    public static final C4W2 A0I;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C4W5 A08;
    public Object A0A;

    @Deprecated
    public Object A0B;
    public boolean A0D;

    @Deprecated
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public Object A0C = A0H;
    public C4W2 A09 = A0I;

    public final void A00(C4W5 c4w5, C4W2 c4w2, Object obj, Object obj2, int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2) {
        C4W2 c4w22;
        Object obj3;
        C4W1 c4w1;
        this.A0C = obj;
        if (c4w2 != null) {
            c4w22 = c4w2;
        } else {
            c4w22 = A0I;
        }
        this.A09 = c4w22;
        if (c4w2 != null && (c4w1 = c4w2.A03) != null) {
            obj3 = c4w1.A02;
        } else {
            obj3 = null;
        }
        this.A0B = obj3;
        this.A0A = obj2;
        this.A06 = j;
        this.A07 = j2;
        this.A04 = j3;
        this.A0G = z;
        this.A0D = z2;
        boolean z3 = false;
        if (c4w5 != null) {
            z3 = true;
        }
        this.A0E = z3;
        this.A08 = c4w5;
        this.A02 = j4;
        this.A03 = j5;
        this.A00 = 0;
        this.A01 = i;
        this.A05 = j6;
        this.A0F = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            C96604Vv c96604Vv = (C96604Vv) obj;
            if (!Util.A0I(this.A0C, c96604Vv.A0C) || !Util.A0I(this.A09, c96604Vv.A09) || !Util.A0I(this.A0A, c96604Vv.A0A) || !Util.A0I(this.A08, c96604Vv.A08) || this.A06 != c96604Vv.A06 || this.A07 != c96604Vv.A07 || this.A04 != c96604Vv.A04 || this.A0G != c96604Vv.A0G || this.A0D != c96604Vv.A0D || this.A0F != c96604Vv.A0F || this.A02 != c96604Vv.A02 || this.A03 != c96604Vv.A03 || this.A00 != c96604Vv.A00 || this.A01 != c96604Vv.A01 || this.A05 != c96604Vv.A05) {
                return false;
            }
        }
        return true;
    }

    static {
        C96614Vw c96614Vw = new C96614Vw();
        c96614Vw.A07 = "com.google.android.exoplayer2.Timeline";
        c96614Vw.A00 = android.net.Uri.EMPTY;
        A0I = c96614Vw.A00();
    }

    public final boolean A01() {
        boolean z = this.A0E;
        C4W5 c4w5 = this.A08;
        boolean z2 = false;
        if (c4w5 != null) {
            z2 = true;
        }
        boolean z3 = false;
        if (z == z2) {
            z3 = true;
        }
        C4B8.A04(z3);
        if (c4w5 != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((217 + this.A0C.hashCode()) * 31) + this.A09.hashCode()) * 31;
        Object obj = this.A0A;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        C4W5 c4w5 = this.A08;
        if (c4w5 != null) {
            i = c4w5.hashCode();
        }
        int i3 = (i2 + i) * 31;
        long j = this.A06;
        int i4 = (i3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A07;
        int i5 = (i4 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.A04;
        int i6 = (((((((i5 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.A0G ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31;
        long j4 = this.A02;
        int i7 = (i6 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.A03;
        int i8 = (((((i7 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.A00) * 31) + this.A01) * 31;
        long j6 = this.A05;
        return i8 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
