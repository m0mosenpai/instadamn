package X;

import java.util.Arrays;

/* renamed from: X.PuD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58373PuD {
    public static final C58373PuD A05;
    public int A01 = -1;
    public int A00 = 0;
    public int[] A03 = new int[8];
    public Object[] A04 = new Object[8];
    public boolean A02 = true;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.PuD, java.lang.Object] */
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
            if (obj != null && (obj instanceof C58373PuD)) {
                C58373PuD c58373PuD = (C58373PuD) obj;
                int i = this.A00;
                if (i == c58373PuD.A00) {
                    int[] iArr = this.A03;
                    int[] iArr2 = c58373PuD.A03;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A04;
                            Object[] objArr2 = c58373PuD.A04;
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

    public final int A00() {
        int A052;
        int A03;
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
                                i = AbstractC63226Sfd.A05(i6) + 4;
                            } else {
                                throw new IllegalStateException(Q7Q.A00());
                            }
                        } else {
                            A052 = AbstractC63226Sfd.A05(i6) * 2;
                            A03 = ((C58373PuD) this.A04[i4]).A00();
                        }
                    } else {
                        AbstractC58387PuR abstractC58387PuR = (AbstractC58387PuR) this.A04[i4];
                        boolean z = Q7P.A02;
                        A052 = AbstractC63226Sfd.A05(i6);
                        int A01 = abstractC58387PuR.A01();
                        A03 = AbstractC58321PtD.A06(A01) + A01;
                    }
                } else {
                    i = AbstractC63226Sfd.A05(i6) + 8;
                }
                i3 += i;
            } else {
                long A0N = AbstractC166987dD.A0N(this.A04[i4]);
                A052 = AbstractC63226Sfd.A05(i6);
                A03 = Q7P.A03(A0N);
            }
            i = A052 + A03;
            i3 += i;
        }
        this.A01 = i3;
        return i3;
    }

    public final void A01(int i, Object obj) {
        if (this.A02) {
            int i2 = this.A00;
            int[] iArr = this.A03;
            if (i2 == iArr.length) {
                int i3 = i2 >> 1;
                if (i2 < 4) {
                    i3 = 8;
                }
                int i4 = i2 + i3;
                this.A03 = Arrays.copyOf(iArr, i4);
                this.A04 = Arrays.copyOf(this.A04, i4);
            }
            int[] iArr2 = this.A03;
            int i5 = this.A00;
            iArr2[i5] = i;
            this.A04[i5] = obj;
            this.A00 = i5 + 1;
            return;
        }
        throw AbstractC43592JPx.A11();
    }

    public final void A02(InterfaceC65555Tma interfaceC65555Tma) {
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
                                    ((C63603SqB) interfaceC65555Tma).A00.A06(i3, AbstractC166987dD.A0H(obj));
                                } else {
                                    throw AbstractC58318PtA.A0f(Q7Q.A00());
                                }
                            } else {
                                Q7P q7p = ((C63603SqB) interfaceC65555Tma).A00;
                                int i5 = i3 << 3;
                                q7p.A05(i5 | 3);
                                ((C58373PuD) obj).A02(interfaceC65555Tma);
                                q7p.A05(i5 | 4);
                            }
                        } else {
                            Q7P q7p2 = ((C63603SqB) interfaceC65555Tma).A00;
                            AbstractC63226Sfd.A08(q7p2, i3);
                            q7p2.A0A((AbstractC58387PuR) obj);
                        }
                    } else {
                        ((C63603SqB) interfaceC65555Tma).A00.A08(i3, AbstractC166987dD.A0N(obj));
                    }
                } else {
                    ((C63603SqB) interfaceC65555Tma).A00.A09(i3, AbstractC166987dD.A0N(obj));
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
