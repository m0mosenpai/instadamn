package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4WJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WJ {
    public int A00;
    public long A01;
    public long A02;
    public C4WK A03 = C4WK.A01;
    public Object A04;
    public Object A05;
    public boolean A06;

    public final void A02(long j, Object obj, long j2, Object obj2) {
        C4WK c4wk = C4WK.A01;
        this.A04 = obj;
        this.A05 = obj2;
        this.A00 = 0;
        this.A01 = j;
        this.A02 = j2;
        this.A03 = c4wk;
        this.A06 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            C4WJ c4wj = (C4WJ) obj;
            if (!Util.A0I(this.A04, c4wj.A04) || !Util.A0I(this.A05, c4wj.A05) || this.A00 != c4wj.A00 || this.A01 != c4wj.A01 || this.A02 != c4wj.A02 || this.A06 != c4wj.A06 || !Util.A0I(this.A03, c4wj.A03)) {
                return false;
            }
        }
        return true;
    }

    public final int A00(int i) {
        int i2;
        C4WL A00 = this.A03.A00(i);
        int i3 = -1;
        do {
            i3++;
            int[] iArr = A00.A00;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0) {
                break;
            }
        } while (i2 != 1);
        return i3;
    }

    public final long A01(int i, int i2) {
        return this.A03.A00(i).A01[i2];
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.A04;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (217 + hashCode) * 31;
        Object obj2 = this.A05;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        int i3 = (((i2 + i) * 31) + this.A00) * 31;
        long j = this.A01;
        int i4 = (i3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A02;
        return ((((i4 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.A06 ? 1 : 0)) * 31) + this.A03.hashCode();
    }
}
