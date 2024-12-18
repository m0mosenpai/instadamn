package androidx.media3.common;

import X.AbstractC167007dF;
import X.C00O;
import X.C62960SZd;
import X.C62989SaD;
import X.C72843Xop;
import X.XQ7;
import X.XQ8;
import X.XQ9;
import X.XQH;
import X.Y95;
import android.util.Pair;
import java.util.Arrays;

/* loaded from: classes12.dex */
public abstract class Timeline {
    public static final Timeline A00 = new XQ7();

    public abstract C72843Xop A0B(C72843Xop c72843Xop, int i, boolean z);

    public final boolean equals(Object obj) {
        int A07;
        if (this != obj) {
            if (obj instanceof Timeline) {
                Timeline timeline = (Timeline) obj;
                int A02 = timeline.A02();
                int A022 = A02();
                if (A02 == A022) {
                    int A01 = timeline.A01();
                    int A012 = A01();
                    if (A01 == A012) {
                        C62960SZd c62960SZd = new C62960SZd();
                        C72843Xop c72843Xop = new C72843Xop();
                        C62989SaD c62989SaD = C62989SaD.A02;
                        if (0 < A022) {
                            A0A(c62960SZd, 0);
                            throw C00O.createAndThrow();
                        }
                        if (0 < A012) {
                            A0B(c72843Xop, 0, true);
                            throw null;
                        }
                        int A06 = A06(true);
                        if (A06 != timeline.A06(true) || (A07 = A07(true)) != timeline.A07(true)) {
                            return false;
                        }
                        while (A06 != A07) {
                            int A04 = A04(A06, true);
                            if (A04 == timeline.A04(A06, true)) {
                                A06 = A04;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int A01() {
        if (this instanceof XQ8) {
            return ((XQ8) this).A00.A01();
        }
        if (this instanceof XQH) {
            return ((XQH) this).A00;
        }
        return 0;
    }

    public final int A02() {
        if (this instanceof XQ8) {
            return ((XQ8) this).A00.A02();
        }
        if (this instanceof XQH) {
            return ((XQH) this).A01;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A03(int r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.XQ8
            if (r0 == 0) goto Le
            r0 = r7
            X.XQ8 r0 = (X.XQ8) r0
            androidx.media3.common.Timeline r0 = r0.A00
            int r1 = r0.A03(r8)
        Ld:
            return r1
        Le:
            boolean r0 = r7 instanceof X.XQ9
            if (r0 == 0) goto L5b
            r4 = r7
            X.XQ9 r4 = (X.XQ9) r4
            r6 = 0
            X.XQH r4 = (X.XQH) r4
            int[] r5 = r4.A04
            int r1 = r8 + 1
            int r3 = java.util.Arrays.binarySearch(r5, r1)
            if (r3 >= 0) goto L36
            int r0 = r3 + 2
            int r3 = -r0
        L25:
            r2 = r5[r3]
            androidx.media3.common.Timeline[] r4 = r4.A05
            r0 = r4[r3]
            int r8 = r8 - r2
            int r0 = r0.A03(r8)
            r1 = -1
            if (r0 == r1) goto L3f
            int r1 = r2 + r0
            return r1
        L36:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L25
            r0 = r5[r3]
            if (r0 != r1) goto L25
            goto L36
        L3f:
            if (r3 <= 0) goto Ld
            int r3 = r3 + (-1)
            if (r3 == r1) goto Ld
            r2 = r4[r3]
            int r0 = r2.A02()
            boolean r0 = X.AbstractC167007dF.A1N(r0)
            if (r0 != 0) goto L3f
            if (r3 == r1) goto Ld
            r1 = r5[r3]
            int r0 = r2.A07(r6)
            int r1 = r1 + r0
            return r1
        L5b:
            r0 = 0
            r1 = 1
            int r0 = r7.A06(r0)
            int r1 = r8 - r1
            if (r8 != r0) goto Ld
            r1 = -1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.Timeline.A03(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A04(int r8, boolean r9) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.XQ8
            if (r0 == 0) goto Le
            r0 = r7
            X.XQ8 r0 = (X.XQ8) r0
            androidx.media3.common.Timeline r0 = r0.A00
            int r1 = r0.A04(r8, r9)
        Ld:
            return r1
        Le:
            boolean r0 = r7 instanceof X.XQ9
            if (r0 == 0) goto L5b
            r6 = r7
            X.XQ9 r6 = (X.XQ9) r6
            r4 = r6
            X.XQH r4 = (X.XQH) r4
            int[] r5 = r4.A04
            int r1 = r8 + 1
            int r3 = java.util.Arrays.binarySearch(r5, r1)
            if (r3 >= 0) goto L36
            int r0 = r3 + 2
            int r3 = -r0
        L25:
            r2 = r5[r3]
            androidx.media3.common.Timeline[] r4 = r4.A05
            r0 = r4[r3]
            int r8 = r8 - r2
            int r0 = r0.A04(r8, r9)
            r1 = -1
            if (r0 == r1) goto L3f
            int r1 = r2 + r0
            return r1
        L36:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L25
            r0 = r5[r3]
            if (r0 != r1) goto L25
            goto L36
        L3f:
            int r3 = X.XQ9.A00(r6, r3, r9)
            if (r3 == r1) goto Ld
            r2 = r4[r3]
            int r0 = r2.A02()
            boolean r0 = X.AbstractC167007dF.A1N(r0)
            if (r0 != 0) goto L3f
            if (r3 == r1) goto Ld
            r1 = r5[r3]
            int r0 = r2.A06(r9)
            int r1 = r1 + r0
            return r1
        L5b:
            int r0 = r7.A07(r9)
            if (r8 != r0) goto L63
            r1 = -1
            return r1
        L63:
            int r1 = r8 + 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.Timeline.A04(int, boolean):int");
    }

    public final int A05(Object obj) {
        int intValue;
        int A05;
        if (this instanceof XQ8) {
            return ((XQ8) this).A00.A05(obj);
        }
        if (this instanceof XQ9) {
            XQ9 xq9 = (XQ9) this;
            if (!(obj instanceof Pair)) {
                return -1;
            }
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            XQH xqh = (XQH) xq9;
            Number number = (Number) xqh.A02.get(obj2);
            if (number == null || (intValue = number.intValue()) == -1 || (A05 = xqh.A05[intValue].A05(obj3)) == -1) {
                return -1;
            }
            return xqh.A03[intValue] + A05;
        }
        return -1;
    }

    public final int A06(boolean z) {
        if (this instanceof XQ8) {
            return ((XQ8) this).A00.A06(z);
        }
        if (this instanceof XQ9) {
            XQ9 xq9 = (XQ9) this;
            if (xq9.A00 != 0) {
                int i = 0;
                if (z) {
                    int[] iArr = ((Y95) xq9.A01).A02;
                    if (iArr.length > 0) {
                        i = iArr[0];
                    } else {
                        i = -1;
                    }
                }
                do {
                    XQH xqh = (XQH) xq9;
                    Timeline timeline = xqh.A05[i];
                    if (AbstractC167007dF.A1N(timeline.A02())) {
                        i = XQ9.A00(xq9, i, z);
                    } else {
                        return xqh.A04[i] + timeline.A06(z);
                    }
                } while (i != -1);
                return -1;
            }
            return -1;
        }
        if (AbstractC167007dF.A1N(A02())) {
            return -1;
        }
        return 0;
    }

    public final int A07(boolean z) {
        int i;
        if (this instanceof XQ8) {
            return ((XQ8) this).A00.A07(z);
        }
        if (this instanceof XQ9) {
            XQ9 xq9 = (XQ9) this;
            int i2 = xq9.A00;
            if (i2 == 0) {
                return -1;
            }
            if (z) {
                int[] iArr = ((Y95) xq9.A01).A02;
                int length = iArr.length;
                if (length > 0) {
                    i = iArr[length - 1];
                } else {
                    i = -1;
                }
            } else {
                i = i2 - 1;
            }
            do {
                XQH xqh = (XQH) xq9;
                Timeline timeline = xqh.A05[i];
                if (AbstractC167007dF.A1N(timeline.A02())) {
                    if (z) {
                        Y95 y95 = (Y95) xq9.A01;
                        int i3 = y95.A01[i] - 1;
                        if (i3 < 0) {
                            return -1;
                        }
                        i = y95.A02[i3];
                    } else {
                        if (i <= 0) {
                            return -1;
                        }
                        i--;
                    }
                } else {
                    return xqh.A04[i] + timeline.A07(z);
                }
            } while (i != -1);
            return -1;
        }
        if (AbstractC167007dF.A1N(A02())) {
            return -1;
        }
        return A02() - 1;
    }

    public final void A08(int i) {
        Timeline timeline;
        if (this instanceof XQ8) {
            timeline = ((XQ8) this).A00;
        } else if (this instanceof XQ9) {
            XQH xqh = (XQH) ((XQ9) this);
            int[] iArr = xqh.A03;
            int i2 = i + 1;
            int binarySearch = Arrays.binarySearch(iArr, i2);
            if (binarySearch < 0) {
                binarySearch = -(binarySearch + 2);
                int i3 = iArr[binarySearch];
                timeline = xqh.A05[binarySearch];
                i -= i3;
            }
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i2);
            int i32 = iArr[binarySearch];
            timeline = xqh.A05[binarySearch];
            i -= i32;
        } else {
            throw new IndexOutOfBoundsException();
        }
        timeline.A08(i);
        throw null;
    }

    public final void A09(C72843Xop c72843Xop, Object obj) {
        int intValue;
        if (this instanceof XQ9) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            XQH xqh = (XQH) ((XQ9) this);
            Number number = (Number) xqh.A02.get(obj2);
            if (number == null) {
                intValue = -1;
            } else {
                intValue = number.intValue();
            }
            xqh.A05[intValue].A09(c72843Xop, obj3);
        } else {
            A0B(c72843Xop, A05(obj), true);
        }
        throw null;
    }

    public final void A0A(C62960SZd c62960SZd, int i) {
        Timeline timeline;
        if (this instanceof XQ8) {
            timeline = ((XQ8) this).A00;
        } else if (this instanceof XQ9) {
            XQH xqh = (XQH) ((XQ9) this);
            int[] iArr = xqh.A04;
            int i2 = i + 1;
            int binarySearch = Arrays.binarySearch(iArr, i2);
            if (binarySearch < 0) {
                binarySearch = -(binarySearch + 2);
                int i3 = iArr[binarySearch];
                timeline = xqh.A05[binarySearch];
                i -= i3;
            }
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i2);
            int i32 = iArr[binarySearch];
            timeline = xqh.A05[binarySearch];
            i -= i32;
        } else {
            throw new IndexOutOfBoundsException();
        }
        timeline.A0A(c62960SZd, i);
        throw null;
    }

    public final int hashCode() {
        C62960SZd c62960SZd = new C62960SZd();
        C72843Xop c72843Xop = new C72843Xop();
        int A02 = A02();
        int i = (217 + A02) * 31;
        if (0 < A02) {
            A0A(c62960SZd, 0);
            throw C00O.createAndThrow();
        }
        int A01 = A01();
        int i2 = i + A01;
        if (0 < A01) {
            A0B(c72843Xop, 0, true);
            throw null;
        }
        int A06 = A06(true);
        while (A06 != -1) {
            i2 = (i2 * 31) + A06;
            A06 = A04(A06, true);
        }
        return i2;
    }
}
