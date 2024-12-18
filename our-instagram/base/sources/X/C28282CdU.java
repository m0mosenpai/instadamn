package X;

import java.util.Arrays;

/* renamed from: X.CdU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28282CdU {
    public int A00;
    public int[] A01 = new int[16];
    public final C01U A02 = new C01U();

    private final void A00(int i, int i2) {
        if (i <= 131072) {
            int[] iArr = this.A01;
            int length = iArr.length;
            if (length < i) {
                int i3 = length;
                while (i3 < i) {
                    i3 *= 2;
                }
                int[] iArr2 = new int[i3];
                AbstractC06960Yn.A0U(iArr, iArr2, i2, 0, length);
                this.A01 = iArr2;
                return;
            }
            return;
        }
        throw AbstractC166987dD.A12(AnonymousClass001.A0c("Requested item capacity ", " is larger than max supported: 131072!", i));
    }

    public final int A01(int i) {
        int i2 = this.A00;
        if (i >= i2) {
            if (i < this.A01.length + i2) {
                return r1[i - i2] - 1;
            }
            return -1;
        }
        return -1;
    }

    public final int A02(int i, int i2) {
        int A01;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
            A01 = A01(i);
            if (A01 == i2 || A01 == -1) {
                break;
            }
        } while (A01 != -2);
        return i;
    }

    public final void A03() {
        int[] iArr = this.A01;
        Arrays.fill(iArr, 0, iArr.length, 0);
        this.A02.clear();
    }

    public final void A04(int i) {
        C01U c01u;
        int i2 = this.A00;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 131072) {
            A00(i3 + 1, 0);
        } else {
            int[] iArr = this.A01;
            int length = iArr.length;
            int max = Math.max(i - (length / 2), 0);
            this.A00 = max;
            int i4 = max - i2;
            if (i4 >= 0) {
                if (i4 < length) {
                    System.arraycopy(iArr, i4, iArr, 0, length - i4);
                }
                int[] iArr2 = this.A01;
                int length2 = iArr2.length;
                Arrays.fill(iArr2, Math.max(0, length2 - i4), length2, 0);
            } else {
                int i5 = -i4;
                int i6 = length + i5;
                if (i6 < 131072) {
                    A00(i6 + 1, i5);
                } else {
                    if (i5 < length) {
                        System.arraycopy(iArr, 0, iArr, i5, length - i5);
                    }
                    int[] iArr3 = this.A01;
                    Arrays.fill(iArr3, 0, Math.min(iArr3.length, i5), 0);
                }
            }
        }
        while (true) {
            c01u = this.A02;
            if (!AbstractC25226BEj.A1b(c01u) || ((C27852CPp) c01u.A0O()).A01 >= this.A00) {
                break;
            } else {
                c01u.removeFirst();
            }
        }
        while (AbstractC25226BEj.A1b(c01u) && ((C27852CPp) c01u.A0Q()).A01 > this.A00 + this.A01.length) {
            c01u.removeLast();
        }
    }

    public final void A05(int i, int i2) {
        if (i >= 0) {
            A04(i);
            this.A01[i - this.A00] = i2 + 1;
            return;
        }
        throw AbstractC166987dD.A12("Negative lanes are not supported");
    }

    public final int[] A06(int i) {
        C01U c01u = this.A02;
        Integer valueOf = Integer.valueOf(i);
        C27852CPp c27852CPp = (C27852CPp) AbstractC001800i.A0O(c01u, AbstractC16960so.A1L(c01u, DRS.A00(valueOf, 46), c01u.size()));
        if (c27852CPp != null) {
            return c27852CPp.A00;
        }
        return null;
    }
}
