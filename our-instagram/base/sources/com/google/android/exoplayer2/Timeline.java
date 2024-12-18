package com.google.android.exoplayer2;

import X.AbstractC97384Yy;
import X.C4B8;
import X.C4WJ;
import X.C4WT;
import X.C4YH;
import X.C4YI;
import X.C5PG;
import X.C96604Vv;
import X.C96804Wp;
import android.util.Pair;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class Timeline {
    public static final Timeline A00 = new Timeline() { // from class: X.4WT
        @Override // com.google.android.exoplayer2.Timeline
        public final C4WJ A0D(C4WJ c4wj, int i, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final C96604Vv A0E(C96604Vv c96604Vv, int i, long j) {
            throw new IndexOutOfBoundsException();
        }
    };

    public final int A05(C4WJ c4wj, C96604Vv c96604Vv, int i, int i2, boolean z) {
        int i3 = A0D(c4wj, i, false).A00;
        if (A0E(c96604Vv, i3, 0L).A01 == i) {
            int A04 = A04(i3, i2, z);
            if (A04 == -1) {
                return -1;
            }
            return A0E(c96604Vv, A04, 0L).A00;
        }
        return i + 1;
    }

    public abstract C4WJ A0D(C4WJ c4wj, int i, boolean z);

    public abstract C96604Vv A0E(C96604Vv c96604Vv, int i, long j);

    public final boolean equals(Object obj) {
        int A08;
        if (this != obj) {
            if (obj instanceof Timeline) {
                Timeline timeline = (Timeline) obj;
                int A02 = timeline.A02();
                int A022 = A02();
                if (A02 == A022 && timeline.A01() == A01()) {
                    C96604Vv c96604Vv = new C96604Vv();
                    C4WJ c4wj = new C4WJ();
                    C96604Vv c96604Vv2 = new C96604Vv();
                    C4WJ c4wj2 = new C4WJ();
                    int i = 0;
                    while (true) {
                        if (i < A022) {
                            if (!A0E(c96604Vv, i, 0L).equals(timeline.A0E(c96604Vv2, i, 0L))) {
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 0;
                            while (true) {
                                if (i2 < A01()) {
                                    if (!A0D(c4wj, i2, true).equals(timeline.A0D(c4wj2, i2, true))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    int A07 = A07(true);
                                    if (A07 != timeline.A07(true) || (A08 = A08(true)) != timeline.A08(true)) {
                                        return false;
                                    }
                                    while (A07 != A08) {
                                        int A04 = A04(A07, 0, true);
                                        if (A04 == timeline.A04(A07, 0, true)) {
                                            A07 = A04;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int A01() {
        if (this instanceof C96804Wp) {
            return ((C96804Wp) this).A04.A0Q.size();
        }
        if (this instanceof C4YI) {
            return ((C4YI) this).A01;
        }
        if (this instanceof AbstractC97384Yy) {
            return ((AbstractC97384Yy) this).A00.A01();
        }
        return 0;
    }

    public int A02() {
        if (this instanceof C96804Wp) {
            return 1;
        }
        if (this instanceof C4WT) {
            return 0;
        }
        if (this instanceof AbstractC97384Yy) {
            return ((AbstractC97384Yy) this).A00.A02();
        }
        return ((C4YI) this).A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a A[EDGE_INSN: B:33:0x005a->B:27:0x005a BREAK  A[LOOP:0: B:18:0x0042->B:31:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A03(int r11, int r12) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.AbstractC97384Yy
            if (r0 == 0) goto Le
            r0 = r10
            X.4Yy r0 = (X.AbstractC97384Yy) r0
            com.google.android.exoplayer2.Timeline r0 = r0.A00
            int r1 = r0.A03(r11, r12)
        Ld:
            return r1
        Le:
            boolean r0 = r10 instanceof X.C4YI
            if (r0 == 0) goto L61
            r8 = r10
            X.4YI r8 = (X.C4YI) r8
            r7 = 0
            r9 = 0
            r6 = 2
            int[] r5 = r8.A06
            int r1 = r11 + 1
            int r3 = java.util.Arrays.binarySearch(r5, r1)
            if (r3 >= 0) goto L39
            int r0 = r3 + 2
            int r3 = -r0
        L25:
            r2 = r5[r3]
            com.google.android.exoplayer2.Timeline[] r4 = r8.A07
            r0 = r4[r3]
            int r11 = r11 - r2
            if (r12 == r6) goto L2f
            r9 = r12
        L2f:
            int r0 = r0.A03(r11, r9)
            r1 = -1
            if (r0 == r1) goto L42
            int r1 = r2 + r0
            return r1
        L39:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L25
            r0 = r5[r3]
            if (r0 != r1) goto L25
            goto L39
        L42:
            if (r3 <= 0) goto L5a
            int r3 = r3 + (-1)
            if (r3 == r1) goto L5a
            r2 = r4[r3]
            int r0 = r2.A02()
            if (r0 == 0) goto L42
            if (r3 == r1) goto L5a
            r1 = r5[r3]
            int r0 = r2.A08(r7)
            int r1 = r1 + r0
            return r1
        L5a:
            if (r12 != r6) goto Ld
            int r1 = r8.A08(r7)
            return r1
        L61:
            r2 = 0
            r1 = 1
            if (r12 == 0) goto L72
            if (r12 == r1) goto L71
            int r0 = r10.A07(r2)
            if (r11 != r0) goto L7a
            int r11 = r10.A08(r2)
        L71:
            return r11
        L72:
            int r0 = r10.A07(r2)
            if (r11 != r0) goto L7a
            r11 = -1
            return r11
        L7a:
            int r11 = r11 - r1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Timeline.A03(int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059 A[EDGE_INSN: B:31:0x0059->B:26:0x0059 BREAK  A[LOOP:0: B:18:0x0041->B:30:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A04(int r10, int r11, boolean r12) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.AbstractC97384Yy
            if (r0 == 0) goto Le
            r0 = r9
            X.4Yy r0 = (X.AbstractC97384Yy) r0
            com.google.android.exoplayer2.Timeline r0 = r0.A00
            int r1 = r0.A04(r10, r11, r12)
        Ld:
            return r1
        Le:
            boolean r0 = r9 instanceof X.C4YI
            if (r0 == 0) goto L60
            r7 = r9
            X.4YI r7 = (X.C4YI) r7
            r8 = 0
            r6 = 2
            int[] r5 = r7.A06
            int r1 = r10 + 1
            int r3 = java.util.Arrays.binarySearch(r5, r1)
            if (r3 >= 0) goto L38
            int r0 = r3 + 2
            int r3 = -r0
        L24:
            r2 = r5[r3]
            com.google.android.exoplayer2.Timeline[] r4 = r7.A07
            r0 = r4[r3]
            int r10 = r10 - r2
            if (r11 == r6) goto L2e
            r8 = r11
        L2e:
            int r0 = r0.A04(r10, r8, r12)
            r1 = -1
            if (r0 == r1) goto L41
            int r1 = r2 + r0
            return r1
        L38:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L24
            r0 = r5[r3]
            if (r0 != r1) goto L24
            goto L38
        L41:
            int r3 = X.C4YI.A00(r7, r3, r12)
            if (r3 == r1) goto L59
            r2 = r4[r3]
            int r0 = r2.A02()
            if (r0 == 0) goto L41
            if (r3 == r1) goto L59
            r1 = r5[r3]
            int r0 = r2.A07(r12)
            int r1 = r1 + r0
            return r1
        L59:
            if (r11 != r6) goto Ld
            int r1 = r7.A07(r12)
            return r1
        L60:
            r0 = 1
            if (r11 == 0) goto L79
            if (r11 == r0) goto L72
            r0 = 2
            if (r11 != r0) goto L73
            int r0 = r9.A08(r12)
            if (r10 != r0) goto L81
            int r10 = r9.A07(r12)
        L72:
            return r10
        L73:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L79:
            int r0 = r9.A08(r12)
            if (r10 != r0) goto L81
            r10 = -1
            return r10
        L81:
            int r10 = r10 + 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Timeline.A04(int, int, boolean):int");
    }

    public int A06(Object obj) {
        int i;
        int intValue;
        int A06;
        Object obj2;
        int intValue2;
        if (this instanceof C96804Wp) {
            C96804Wp c96804Wp = (C96804Wp) this;
            i = -1;
            if ((obj instanceof Integer) && (intValue2 = ((Number) obj).intValue() - c96804Wp.A00) >= 0 && intValue2 < c96804Wp.A01()) {
                return intValue2;
            }
        } else {
            if (this instanceof AbstractC97384Yy) {
                AbstractC97384Yy abstractC97384Yy = (AbstractC97384Yy) this;
                if (abstractC97384Yy instanceof C4YH) {
                    C4YH c4yh = (C4YH) abstractC97384Yy;
                    Timeline timeline = ((AbstractC97384Yy) c4yh).A00;
                    if (C4YH.A02.equals(obj) && (obj2 = c4yh.A00) != null) {
                        obj = obj2;
                    }
                    return timeline.A06(obj);
                }
                return abstractC97384Yy.A00.A06(obj);
            }
            if (this instanceof C4YI) {
                C4YI c4yi = (C4YI) this;
                i = -1;
                if (obj instanceof Pair) {
                    Pair pair = (Pair) obj;
                    Object obj3 = pair.first;
                    Object obj4 = pair.second;
                    Number number = (Number) c4yi.A04.get(obj3);
                    if (number != null && (intValue = number.intValue()) != -1 && (A06 = c4yi.A07[intValue].A06(obj4)) != -1) {
                        return c4yi.A05[intValue] + A06;
                    }
                }
            } else {
                return -1;
            }
        }
        return i;
    }

    public final int A07(boolean z) {
        if (this instanceof AbstractC97384Yy) {
            return ((AbstractC97384Yy) this).A00.A07(z);
        }
        if (this instanceof C4YI) {
            C4YI c4yi = (C4YI) this;
            if (c4yi.A00 != 0) {
                int i = 0;
                if (z) {
                    int[] iArr = ((C5PG) c4yi.A03).A02;
                    if (iArr.length > 0) {
                        i = iArr[0];
                    } else {
                        i = -1;
                    }
                }
                do {
                    Timeline timeline = c4yi.A07[i];
                    if (timeline.A02() == 0) {
                        i = C4YI.A00(c4yi, i, z);
                    } else {
                        return c4yi.A06[i] + timeline.A07(z);
                    }
                } while (i != -1);
                return -1;
            }
            return -1;
        }
        if (A02() == 0) {
            return -1;
        }
        return 0;
    }

    public final int A08(boolean z) {
        int i;
        if (this instanceof AbstractC97384Yy) {
            return ((AbstractC97384Yy) this).A00.A08(z);
        }
        if (this instanceof C4YI) {
            C4YI c4yi = (C4YI) this;
            int i2 = c4yi.A00;
            if (i2 == 0) {
                return -1;
            }
            if (z) {
                int[] iArr = ((C5PG) c4yi.A03).A02;
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
                Timeline timeline = c4yi.A07[i];
                if (timeline.A02() == 0) {
                    if (z) {
                        C5PG c5pg = (C5PG) c4yi.A03;
                        int i3 = c5pg.A01[i] - 1;
                        if (i3 < 0) {
                            return -1;
                        }
                        i = c5pg.A02[i3];
                    } else {
                        if (i <= 0) {
                            return -1;
                        }
                        i--;
                    }
                } else {
                    return c4yi.A06[i] + timeline.A08(z);
                }
            } while (i != -1);
            return -1;
        }
        if (A02() == 0) {
            return -1;
        }
        return A02() - 1;
    }

    public final Pair A09(C4WJ c4wj, C96604Vv c96604Vv, int i, long j) {
        Pair A0A = A0A(c4wj, c96604Vv, i, j, 0L);
        A0A.getClass();
        return A0A;
    }

    public final C4WJ A0B(C4WJ c4wj, Object obj) {
        int intValue;
        if (this instanceof C4YI) {
            C4YI c4yi = (C4YI) this;
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Number number = (Number) c4yi.A04.get(obj2);
            if (number == null) {
                intValue = -1;
            } else {
                intValue = number.intValue();
            }
            int i = c4yi.A06[intValue];
            c4yi.A07[intValue].A0B(c4wj, obj3);
            c4wj.A00 += i;
            c4wj.A05 = obj;
            return c4wj;
        }
        return A0D(c4wj, A06(obj), true);
    }

    public Object A0C(int i) {
        if (this instanceof C96804Wp) {
            C96804Wp c96804Wp = (C96804Wp) this;
            C4B8.A00(i, c96804Wp.A01());
            return Integer.valueOf(c96804Wp.A00 + i);
        }
        if (this instanceof AbstractC97384Yy) {
            AbstractC97384Yy abstractC97384Yy = (AbstractC97384Yy) this;
            if (abstractC97384Yy instanceof C4YH) {
                C4YH c4yh = (C4YH) abstractC97384Yy;
                Object A0C = ((AbstractC97384Yy) c4yh).A00.A0C(i);
                if (!Util.A0I(A0C, c4yh.A00)) {
                    return A0C;
                }
                return C4YH.A02;
            }
            return abstractC97384Yy.A00.A0C(i);
        }
        if (this instanceof C4WT) {
            throw new IndexOutOfBoundsException();
        }
        C4YI c4yi = (C4YI) this;
        int[] iArr = c4yi.A05;
        int i2 = i + 1;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
            return Pair.create(c4yi.A08[binarySearch], c4yi.A07[binarySearch].A0C(i - iArr[binarySearch]));
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (iArr[binarySearch] == i2);
        return Pair.create(c4yi.A08[binarySearch], c4yi.A07[binarySearch].A0C(i - iArr[binarySearch]));
    }

    public final int hashCode() {
        int i;
        C96604Vv c96604Vv = new C96604Vv();
        C4WJ c4wj = new C4WJ();
        int A02 = A02();
        int i2 = 217 + A02;
        int i3 = 0;
        while (true) {
            i = i2 * 31;
            if (i3 >= A02) {
                break;
            }
            i2 = i + A0E(c96604Vv, i3, 0L).hashCode();
            i3++;
        }
        int A01 = i + A01();
        for (int i4 = 0; i4 < A01(); i4++) {
            A01 = (A01 * 31) + A0D(c4wj, i4, true).hashCode();
        }
        int A07 = A07(true);
        while (A07 != -1) {
            A01 = (A01 * 31) + A07;
            A07 = A04(A07, 0, true);
        }
        return A01;
    }

    public final Pair A0A(C4WJ c4wj, C96604Vv c96604Vv, int i, long j, long j2) {
        C4B8.A00(i, A02());
        A0E(c96604Vv, i, j2);
        if (j == -9223372036854775807L) {
            j = c96604Vv.A02;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c96604Vv.A00;
        A0D(c4wj, i2, false);
        while (i2 < c96604Vv.A01 && c4wj.A02 != j) {
            int i3 = i2 + 1;
            if (A0D(c4wj, i3, false).A02 > j) {
                break;
            }
            i2 = i3;
        }
        A0D(c4wj, i2, true);
        long j3 = j - c4wj.A02;
        long j4 = c4wj.A01;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = c4wj.A05;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }
}
