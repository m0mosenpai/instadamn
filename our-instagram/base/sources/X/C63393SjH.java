package X;

import com.google.common.collect.Multisets$ImmutableEntry;
import java.util.Comparator;

/* renamed from: X.SjH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63393SjH {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C63393SjH A04;
    public C63393SjH A05;
    public C63393SjH A06;
    public C63393SjH A07;
    public final Object A08;

    private C63393SjH A00() {
        C63393SjH c63393SjH;
        int i = this.A01;
        this.A01 = 0;
        C63393SjH c63393SjH2 = this.A05;
        c63393SjH2.getClass();
        C63393SjH c63393SjH3 = this.A07;
        c63393SjH3.getClass();
        c63393SjH2.A07 = c63393SjH3;
        c63393SjH3.A05 = c63393SjH2;
        C63393SjH c63393SjH4 = this.A04;
        C63393SjH c63393SjH5 = this.A06;
        if (c63393SjH4 != null) {
            if (c63393SjH5 == null) {
                return c63393SjH4;
            }
            if (c63393SjH4.A02 >= c63393SjH5.A02) {
                c63393SjH = this.A05;
                c63393SjH.getClass();
                c63393SjH.A04 = this.A04.A02(c63393SjH);
                c63393SjH.A06 = this.A06;
            } else {
                c63393SjH = this.A07;
                c63393SjH.getClass();
                c63393SjH.A06 = this.A06.A03(c63393SjH);
                c63393SjH.A04 = this.A04;
            }
            c63393SjH.A00 = this.A00 - 1;
            c63393SjH.A03 = this.A03 - i;
            return c63393SjH.A01();
        }
        return c63393SjH5;
    }

    private C63393SjH A01() {
        int i;
        int i2;
        C63393SjH c63393SjH;
        int i3;
        int i4;
        int i5;
        int i6;
        C63393SjH c63393SjH2 = this.A04;
        if (c63393SjH2 == null) {
            i = 0;
        } else {
            i = c63393SjH2.A02;
        }
        C63393SjH c63393SjH3 = this.A06;
        if (c63393SjH3 == null) {
            i2 = 0;
        } else {
            i2 = c63393SjH3.A02;
        }
        int i7 = i - i2;
        if (i7 != -2) {
            if (i7 != 2) {
                A07();
                return this;
            }
            c63393SjH2.getClass();
            c63393SjH = this.A04;
            C63393SjH c63393SjH4 = c63393SjH.A04;
            if (c63393SjH4 == null) {
                i5 = 0;
            } else {
                i5 = c63393SjH4.A02;
            }
            C63393SjH c63393SjH5 = c63393SjH.A06;
            if (c63393SjH5 == null) {
                i6 = 0;
            } else {
                i6 = c63393SjH5.A02;
            }
            if (i5 - i6 < 0) {
                C18C.A0F(AbstractC167007dF.A1W(c63393SjH5));
                c63393SjH.A06 = c63393SjH5.A04;
                c63393SjH5.A04 = c63393SjH;
                c63393SjH5.A03 = c63393SjH.A03;
                c63393SjH5.A00 = c63393SjH.A00;
                c63393SjH.A06();
                c63393SjH5.A07();
                this.A04 = c63393SjH5;
                c63393SjH = c63393SjH5;
            }
            C18C.A0F(AbstractC167007dF.A1W(c63393SjH));
            this.A04 = c63393SjH.A06;
            c63393SjH.A06 = this;
        } else {
            c63393SjH3.getClass();
            c63393SjH = this.A06;
            C63393SjH c63393SjH6 = c63393SjH.A04;
            if (c63393SjH6 == null) {
                i3 = 0;
            } else {
                i3 = c63393SjH6.A02;
            }
            C63393SjH c63393SjH7 = c63393SjH.A06;
            if (c63393SjH7 == null) {
                i4 = 0;
            } else {
                i4 = c63393SjH7.A02;
            }
            if (i3 - i4 > 0) {
                C18C.A0F(AbstractC167007dF.A1W(c63393SjH6));
                c63393SjH.A04 = c63393SjH6.A06;
                c63393SjH6.A06 = c63393SjH;
                c63393SjH6.A03 = c63393SjH.A03;
                c63393SjH6.A00 = c63393SjH.A00;
                c63393SjH.A06();
                c63393SjH6.A07();
                this.A06 = c63393SjH6;
                c63393SjH = c63393SjH6;
            }
            C18C.A0F(AbstractC167007dF.A1W(c63393SjH));
            this.A06 = c63393SjH.A04;
            c63393SjH.A04 = this;
        }
        c63393SjH.A03 = this.A03;
        c63393SjH.A00 = this.A00;
        A06();
        c63393SjH.A07();
        return c63393SjH;
    }

    private C63393SjH A02(C63393SjH node) {
        C63393SjH c63393SjH = this.A06;
        if (c63393SjH == null) {
            return this.A04;
        }
        this.A06 = c63393SjH.A02(node);
        this.A00--;
        this.A03 -= node.A01;
        return A01();
    }

    private C63393SjH A03(C63393SjH node) {
        C63393SjH c63393SjH = this.A04;
        if (c63393SjH == null) {
            return this.A06;
        }
        this.A04 = c63393SjH.A03(node);
        this.A00--;
        this.A03 -= node.A01;
        return A01();
    }

    public static C63393SjH A04(C63393SjH c63393SjH, Object obj, Comparator comparator) {
        int compare = comparator.compare(obj, c63393SjH.A08);
        if (compare < 0) {
            C63393SjH c63393SjH2 = c63393SjH.A04;
            if (c63393SjH2 != null) {
                C63393SjH A04 = A04(c63393SjH2, obj, comparator);
                if (A04 == null) {
                    return c63393SjH;
                }
                return A04;
            }
        } else if (compare != 0) {
            C63393SjH c63393SjH3 = c63393SjH.A06;
            if (c63393SjH3 == null) {
                return null;
            }
            return A04(c63393SjH3, obj, comparator);
        }
        return c63393SjH;
    }

    public static C63393SjH A05(C63393SjH c63393SjH, Object obj, Comparator comparator) {
        int compare = comparator.compare(obj, c63393SjH.A08);
        if (compare > 0) {
            C63393SjH c63393SjH2 = c63393SjH.A06;
            if (c63393SjH2 != null) {
                C63393SjH A05 = A05(c63393SjH2, obj, comparator);
                if (A05 == null) {
                    return c63393SjH;
                }
                return A05;
            }
        } else if (compare != 0) {
            C63393SjH c63393SjH3 = c63393SjH.A04;
            if (c63393SjH3 == null) {
                return null;
            }
            return A05(c63393SjH3, obj, comparator);
        }
        return c63393SjH;
    }

    private void A06() {
        int i;
        int i2;
        long j;
        long j2;
        C63393SjH c63393SjH = this.A04;
        if (c63393SjH == null) {
            i = 0;
        } else {
            i = c63393SjH.A00;
        }
        int i3 = i + 1;
        C63393SjH c63393SjH2 = this.A06;
        if (c63393SjH2 == null) {
            i2 = 0;
        } else {
            i2 = c63393SjH2.A00;
        }
        this.A00 = i3 + i2;
        long j3 = this.A01;
        if (c63393SjH == null) {
            j = 0;
        } else {
            j = c63393SjH.A03;
        }
        long j4 = j3 + j;
        if (c63393SjH2 == null) {
            j2 = 0;
        } else {
            j2 = c63393SjH2.A03;
        }
        this.A03 = j4 + j2;
        A07();
    }

    private void A07() {
        int i;
        int i2;
        C63393SjH c63393SjH = this.A04;
        if (c63393SjH == null) {
            i = 0;
        } else {
            i = c63393SjH.A02;
        }
        C63393SjH c63393SjH2 = this.A06;
        if (c63393SjH2 == null) {
            i2 = 0;
        } else {
            i2 = c63393SjH2.A02;
        }
        this.A02 = Math.max(i, i2) + 1;
    }

    public final int A08(Object comparator, Comparator e) {
        C63393SjH c63393SjH;
        int compare = e.compare(comparator, this.A08);
        if (compare < 0) {
            c63393SjH = this.A04;
        } else if (compare > 0) {
            c63393SjH = this.A06;
        } else {
            return this.A01;
        }
        if (c63393SjH == null) {
            return 0;
        }
        return c63393SjH.A08(comparator, e);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C63393SjH A09(java.lang.Object r5, java.util.Comparator r6, int[] r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.A08
            int r0 = r6.compare(r5, r0)
            r1 = 0
            if (r0 >= 0) goto L29
            X.SjH r0 = r4.A04
            if (r0 == 0) goto L36
            X.SjH r0 = r0.A09(r5, r6, r7)
            r4.A04 = r0
        L13:
            r1 = r7[r1]
            if (r1 == 0) goto L1d
            int r0 = r4.A00
            int r0 = r0 + (-1)
            r4.A00 = r0
        L1d:
            long r2 = r4.A03
            int r0 = -r1
            long r0 = (long) r0
            long r2 = r2 + r0
            r4.A03 = r2
            X.SjH r0 = r4.A01()
            return r0
        L29:
            if (r0 <= 0) goto L39
            X.SjH r0 = r4.A06
            if (r0 == 0) goto L36
            X.SjH r0 = r0.A09(r5, r6, r7)
            r4.A06 = r0
            goto L13
        L36:
            r7[r1] = r1
            return r4
        L39:
            int r0 = r4.A01
            r7[r1] = r0
            X.SjH r0 = r4.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63393SjH.A09(java.lang.Object, java.util.Comparator, int[]):X.SjH");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C63393SjH A0A(java.lang.Object r10, java.util.Comparator r11, int[] r12, int r13) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.A08
            int r0 = r11.compare(r10, r0)
            r8 = 1
            r1 = 0
            if (r0 >= 0) goto L3c
            X.SjH r0 = r9.A04
            if (r0 != 0) goto L62
            r12[r1] = r1
            X.SjH r0 = new X.SjH
            r0.<init>(r10, r13)
            r9.A04 = r0
            X.SjH r1 = r9.A05
            r1.getClass()
            X.SjH r0 = r9.A04
            r1.A07 = r0
            r0.A05 = r1
            r0.A07 = r9
            r9.A05 = r0
        L26:
            int r1 = r9.A02
            r0 = 2
            int r0 = java.lang.Math.max(r0, r1)
            r9.A02 = r0
            int r0 = r9.A00
            int r0 = r0 + 1
            r9.A00 = r0
            long r2 = r9.A03
            long r0 = (long) r13
            long r2 = r2 + r0
            r9.A03 = r2
        L3b:
            return r9
        L3c:
            if (r0 <= 0) goto L83
            X.SjH r0 = r9.A06
            if (r0 != 0) goto L59
            r12[r1] = r1
            X.SjH r1 = new X.SjH
            r1.<init>(r10, r13)
            r9.A06 = r1
            X.SjH r0 = r9.A07
            r0.getClass()
            r9.A07 = r1
            r1.A05 = r9
            r1.A07 = r0
            r0.A05 = r1
            goto L26
        L59:
            int r5 = r0.A02
            X.SjH r4 = r0.A0A(r10, r11, r12, r13)
            r9.A06 = r4
            goto L6a
        L62:
            int r5 = r0.A02
            X.SjH r4 = r0.A0A(r10, r11, r12, r13)
            r9.A04 = r4
        L6a:
            r0 = r12[r1]
            if (r0 != 0) goto L74
            int r0 = r9.A00
            int r0 = r0 + 1
            r9.A00 = r0
        L74:
            long r2 = r9.A03
            long r0 = (long) r13
            long r2 = r2 + r0
            r9.A03 = r2
            int r0 = r4.A02
            if (r0 == r5) goto L3b
            X.SjH r0 = r9.A01()
            return r0
        L83:
            int r0 = r9.A01
            r12[r1] = r0
            long r6 = (long) r0
            long r2 = (long) r13
            long r6 = r6 + r2
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L92
            r8 = 0
        L92:
            X.C18C.A0E(r8)
            int r0 = r9.A01
            int r0 = r0 + r13
            r9.A01 = r0
            long r0 = r9.A03
            long r0 = r0 + r2
            r9.A03 = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63393SjH.A0A(java.lang.Object, java.util.Comparator, int[], int):X.SjH");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        if (r1 > 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C63393SjH A0B(java.lang.Object r5, java.util.Comparator r6, int[] r7, int r8) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.A08
            int r0 = r6.compare(r5, r0)
            r1 = 0
            if (r0 >= 0) goto L1a
            X.SjH r0 = r4.A04
            if (r0 == 0) goto L41
            X.SjH r0 = r0.A0B(r5, r6, r7, r8)
            r4.A04 = r0
            r1 = r7[r1]
            if (r1 > 0) goto L2a
            if (r1 != 0) goto L38
            return r4
        L1a:
            if (r0 <= 0) goto L44
            X.SjH r0 = r4.A06
            if (r0 == 0) goto L41
            X.SjH r0 = r0.A0B(r5, r6, r7, r8)
            r4.A06 = r0
            r1 = r7[r1]
            if (r1 <= 0) goto L38
        L2a:
            if (r8 < r1) goto L3d
            int r0 = r4.A00
            int r0 = r0 + (-1)
            r4.A00 = r0
            long r2 = r4.A03
            long r0 = (long) r1
        L35:
            long r2 = r2 - r0
            r4.A03 = r2
        L38:
            X.SjH r0 = r4.A01()
            return r0
        L3d:
            long r2 = r4.A03
            long r0 = (long) r8
            goto L35
        L41:
            r7[r1] = r1
            return r4
        L44:
            int r0 = r4.A01
            r7[r1] = r0
            if (r8 < r0) goto L4f
            X.SjH r0 = r4.A00()
            return r0
        L4f:
            int r0 = r0 - r8
            r4.A01 = r0
            long r2 = r4.A03
            long r0 = (long) r8
            long r2 = r2 - r0
            r4.A03 = r2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63393SjH.A0B(java.lang.Object, java.util.Comparator, int[], int):X.SjH");
    }

    public final C63393SjH A0C(Object obj, Comparator comparator, int[] iArr, int i) {
        int compare = comparator.compare(obj, this.A08);
        if (compare < 0) {
            C63393SjH c63393SjH = this.A04;
            if (c63393SjH != null) {
                this.A04 = c63393SjH.A0C(obj, comparator, iArr, i);
                if (iArr[0] == i) {
                    this.A00--;
                    this.A03 += -r1;
                }
                return A01();
            }
            iArr[0] = 0;
        } else if (compare > 0) {
            C63393SjH c63393SjH2 = this.A06;
            if (c63393SjH2 != null) {
                this.A06 = c63393SjH2.A0C(obj, comparator, iArr, i);
                if (iArr[0] == i) {
                    this.A00--;
                    this.A03 += -r1;
                }
                return A01();
            }
            iArr[0] = 0;
        } else {
            int i2 = this.A01;
            iArr[0] = i2;
            if (i == i2) {
                return A00();
            }
        }
        return this;
    }

    public final String toString() {
        return new Multisets$ImmutableEntry(this.A08, this.A01).toString();
    }

    public C63393SjH(Object elem, int elemCount) {
        C18C.A0E(AbstractC167007dF.A1O(elemCount));
        this.A08 = elem;
        this.A01 = elemCount;
        this.A03 = elemCount;
        this.A00 = 1;
        this.A02 = 1;
        this.A04 = null;
        this.A06 = null;
    }

    public C63393SjH() {
        this.A08 = null;
        this.A01 = 1;
    }
}
