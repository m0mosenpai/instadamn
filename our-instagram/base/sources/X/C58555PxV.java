package X;

import java.util.Arrays;

/* renamed from: X.PxV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58555PxV {
    public static final C58555PxV A05;
    public int A01 = -1;
    public int A00 = 0;
    public int[] A03 = new int[8];
    public Object[] A04 = new Object[8];
    public boolean A02 = true;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.PxV, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.A01 = -1;
        obj.A00 = 0;
        obj.A03 = new int[0];
        obj.A04 = new Object[0];
        obj.A02 = false;
        A05 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C58555PxV)) {
                C58555PxV c58555PxV = (C58555PxV) obj;
                int i = this.A00;
                if (i == c58555PxV.A00) {
                    int[] iArr = this.A03;
                    int[] iArr2 = c58555PxV.A03;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A04;
                            Object[] objArr2 = c58555PxV.A04;
                            for (int i3 = 0; i3 < i; i3++) {
                                if (objArr[i3].equals(objArr2[i3])) {
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

    public static void A00(C58555PxV c58555PxV, int i) {
        int[] iArr = c58555PxV.A03;
        if (i > iArr.length) {
            int i2 = c58555PxV.A00;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            c58555PxV.A03 = Arrays.copyOf(iArr, i);
            c58555PxV.A04 = Arrays.copyOf(c58555PxV.A04, i);
        }
    }

    public final int A01() {
        int A02;
        int A01;
        int i;
        int i2 = this.A01;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.A00; i4++) {
            int i5 = this.A03[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 5) {
                                i = AbstractC63351Si8.A02(i6) + 4;
                            } else {
                                throw new IllegalStateException(C61032Re1.A00());
                            }
                        } else {
                            A02 = AbstractC63351Si8.A02(i6) * 2;
                            A01 = ((C58555PxV) this.A04[i4]).A01();
                        }
                    } else {
                        AbstractC58536Px4 abstractC58536Px4 = (AbstractC58536Px4) this.A04[i4];
                        A02 = AbstractC63351Si8.A02(i6);
                        A01 = AbstractC63351Si8.A03(abstractC58536Px4);
                    }
                } else {
                    i = AbstractC63351Si8.A02(i6) + 8;
                }
                i3 += i;
            } else {
                long A0N = AbstractC166987dD.A0N(this.A04[i4]);
                A02 = AbstractC63351Si8.A02(i6);
                A01 = C60802RTn.A01(A0N);
            }
            i = A02 + A01;
            i3 += i;
        }
        this.A01 = i3;
        return i3;
    }

    public final void A02(int tag, Object value) {
        if (this.A02) {
            A00(this, this.A00 + 1);
            int[] iArr = this.A03;
            int i = this.A00;
            iArr[i] = tag;
            this.A04[i] = value;
            this.A00 = i + 1;
            return;
        }
        throw AbstractC43592JPx.A11();
    }

    public final void A03(C62650SKj writer) {
        if (this.A00 != 0) {
            for (int i = 0; i < this.A00; i++) {
                int i2 = this.A03[i];
                Object obj = this.A04[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 5) {
                                    AbstractC63351Si8.A05(writer.A00, i3, AbstractC166987dD.A0H(obj));
                                } else {
                                    throw AbstractC58318PtA.A0f(C61032Re1.A00());
                                }
                            } else {
                                C60802RTn c60802RTn = writer.A00;
                                int i5 = i3 << 3;
                                c60802RTn.A04(i5 | 3);
                                ((C58555PxV) obj).A03(writer);
                                c60802RTn.A04(i5 | 4);
                            }
                        } else {
                            writer.A00.A09((AbstractC58536Px4) obj, i3);
                        }
                    } else {
                        AbstractC63351Si8.A06(writer.A00, i3, AbstractC166987dD.A0N(obj));
                    }
                } else {
                    AbstractC63351Si8.A07(writer.A00, i3, AbstractC166987dD.A0N(obj));
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.A00;
        int A01 = JQ0.A01(i);
        int[] iArr = this.A03;
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        int i4 = (A01 + i2) * 31;
        Object[] objArr = this.A04;
        int i5 = 17;
        for (int i6 = 0; i6 < i; i6++) {
            i5 = AbstractC166987dD.A0I(objArr[i6], i5 * 31);
        }
        return i4 + i5;
    }
}
