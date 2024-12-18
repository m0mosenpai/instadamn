package X;

import java.util.Arrays;

/* renamed from: X.2i4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56152i4 implements Comparable {
    public static int A0C = 1;
    public float A00;
    public Integer A06;
    public boolean A07;
    public int A02 = -1;
    public int A01 = -1;
    public int A04 = 0;
    public boolean A08 = false;
    public float[] A0A = new float[9];
    public float[] A09 = new float[9];
    public C56162i5[] A0B = new C56162i5[16];
    public int A03 = 0;
    public int A05 = 0;

    public final void A00() {
        this.A06 = C05F.A0Y;
        this.A04 = 0;
        this.A02 = -1;
        this.A01 = -1;
        this.A00 = 0.0f;
        this.A08 = false;
        int i = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            this.A0B[i2] = null;
        }
        this.A03 = 0;
        this.A05 = 0;
        this.A07 = false;
        Arrays.fill(this.A09, 0.0f);
    }

    public final void A01(C56162i5 c56162i5) {
        int i = 0;
        while (true) {
            int i2 = this.A03;
            if (i < i2) {
                if (this.A0B[i] != c56162i5) {
                    i++;
                } else {
                    return;
                }
            } else {
                C56162i5[] c56162i5Arr = this.A0B;
                int length = c56162i5Arr.length;
                if (i2 >= length) {
                    c56162i5Arr = (C56162i5[]) Arrays.copyOf(c56162i5Arr, length * 2);
                    this.A0B = c56162i5Arr;
                }
                int i3 = this.A03;
                c56162i5Arr[i3] = c56162i5;
                this.A03 = i3 + 1;
                return;
            }
        }
    }

    public final void A02(C56162i5 c56162i5) {
        int i = this.A03;
        int i2 = 0;
        while (i2 < i) {
            C56162i5[] c56162i5Arr = this.A0B;
            if (c56162i5Arr[i2] != c56162i5) {
                i2++;
            } else {
                while (true) {
                    int i3 = i - 1;
                    if (i2 < i3) {
                        int i4 = i2 + 1;
                        c56162i5Arr[i2] = c56162i5Arr[i4];
                        i2 = i4;
                    } else {
                        this.A03 = i3;
                        return;
                    }
                }
            }
        }
    }

    public final void A03(C56162i5 c56162i5, C56142i3 c56142i3) {
        int i = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            this.A0B[i2].A07(c56162i5, c56142i3, false);
        }
        this.A03 = 0;
    }

    public final void A04(C56142i3 c56142i3, float f) {
        this.A00 = f;
        this.A08 = true;
        int i = this.A03;
        this.A01 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.A0B[i2].A03(c56142i3, this, false);
        }
        this.A03 = 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A02 - ((C56152i4) obj).A02;
    }

    public final String toString() {
        return AnonymousClass001.A0O("", this.A02);
    }

    public C56152i4(Integer num) {
        this.A06 = num;
    }
}
