package X;

import java.util.Arrays;

/* renamed from: X.Sid, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63372Sid {
    public static final C63372Sid A05 = new C63372Sid(new int[0], new Object[0], 0, false);
    public int A00;
    public int A01;
    public boolean A02;
    public int[] A03;
    public Object[] A04;

    public C63372Sid(int[] iArr, Object[] objArr, int i, boolean z) {
        this.A01 = -1;
        this.A00 = i;
        this.A03 = iArr;
        this.A04 = objArr;
        this.A02 = z;
    }

    public static C63372Sid A00() {
        return A05;
    }

    public static C63372Sid A01() {
        return new C63372Sid(new int[8], new Object[8], 0, true);
    }

    public final void A07() {
        if (this.A02) {
            this.A02 = false;
        }
    }

    public final void A0B(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.A00; i2++) {
            AbstractC63321ShV.A02(this.A04[i2], String.valueOf(this.A03[i2] >>> 3), sb, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C63372Sid)) {
                C63372Sid c63372Sid = (C63372Sid) obj;
                int i = this.A00;
                if (i == c63372Sid.A00) {
                    int[] iArr = this.A03;
                    int[] iArr2 = c63372Sid.A03;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A04;
                            Object[] objArr2 = c63372Sid.A04;
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

    public C63372Sid() {
        this(new int[8], new Object[8], 0, true);
    }

    public static C63372Sid A02(C63372Sid c63372Sid, C63372Sid c63372Sid2) {
        int i = c63372Sid.A00 + c63372Sid2.A00;
        int[] copyOf = Arrays.copyOf(c63372Sid.A03, i);
        System.arraycopy(c63372Sid2.A03, 0, copyOf, c63372Sid.A00, c63372Sid2.A00);
        Object[] copyOf2 = Arrays.copyOf(c63372Sid.A04, i);
        System.arraycopy(c63372Sid2.A04, 0, copyOf2, c63372Sid.A00, c63372Sid2.A00);
        return new C63372Sid(copyOf, copyOf2, i, true);
    }

    private final void A03(int i) {
        int[] iArr = this.A03;
        if (i > iArr.length) {
            int i2 = this.A00;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.A03 = Arrays.copyOf(iArr, i);
            this.A04 = Arrays.copyOf(this.A04, i);
        }
    }

    public final int A04() {
        int A00;
        int A01;
        int i;
        int i2 = this.A01;
        if (i2 == -1) {
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
                                    i = SSM.A08(i6) + 4;
                                } else {
                                    throw new IllegalStateException(C61035Re7.A00());
                                }
                            } else {
                                int A08 = SSM.A08(i6);
                                A00 = A08 + A08;
                                A01 = ((C63372Sid) this.A04[i4]).A04();
                            }
                        } else {
                            AbstractC64539TIv abstractC64539TIv = (AbstractC64539TIv) this.A04[i4];
                            A00 = ROC.A00(i6 << 3);
                            int A052 = abstractC64539TIv.A05();
                            A01 = ROC.A00(A052) + A052;
                        }
                    } else {
                        i = SSM.A08(i6) + 8;
                    }
                    i3 += i;
                } else {
                    long A0N = AbstractC166987dD.A0N(this.A04[i4]);
                    A00 = ROC.A00(i6 << 3);
                    A01 = ROC.A01(A0N);
                }
                i = A00 + A01;
                i3 += i;
            }
            this.A01 = i3;
            return i3;
        }
        return i2;
    }

    public final int A05() {
        int i = this.A01;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.A00; i3++) {
                int i4 = this.A03[i3] >>> 3;
                AbstractC64539TIv abstractC64539TIv = (AbstractC64539TIv) this.A04[i3];
                int A00 = ROC.A00(8);
                int A002 = ROC.A00(16) + ROC.A00(i4);
                int A003 = ROC.A00(24);
                int A052 = abstractC64539TIv.A05();
                i2 += A00 + A00 + A002 + A003 + ROC.A00(A052) + A052;
            }
            this.A01 = i2;
            return i2;
        }
        return i;
    }

    public final void A06() {
        if (this.A02) {
        } else {
            throw AbstractC43592JPx.A11();
        }
    }

    public final void A09(C63372Sid c63372Sid) {
        if (!c63372Sid.equals(A05)) {
            A06();
            int i = this.A00 + c63372Sid.A00;
            A03(i);
            System.arraycopy(c63372Sid.A03, 0, this.A03, this.A00, c63372Sid.A00);
            System.arraycopy(c63372Sid.A04, 0, this.A04, this.A00, c63372Sid.A00);
            this.A00 = i;
        }
    }

    public final void A0A(InterfaceC65599Tno interfaceC65599Tno) {
        if (this.A00 != 0) {
            for (int i = 0; i < this.A00; i++) {
                int i2 = this.A03[i];
                Object obj = this.A04[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 5) {
                                    interfaceC65599Tno.FGk(i4, AbstractC166987dD.A0H(obj));
                                } else {
                                    throw AbstractC58318PtA.A0f(C61035Re7.A00());
                                }
                            } else {
                                interfaceC65599Tno.FFN(i4);
                                ((C63372Sid) obj).A0A(interfaceC65599Tno);
                                interfaceC65599Tno.FGX(i4);
                            }
                        } else {
                            interfaceC65599Tno.FG9((AbstractC64539TIv) obj, i4);
                        }
                    } else {
                        interfaceC65599Tno.FGq(i4, AbstractC166987dD.A0N(obj));
                    }
                } else {
                    interfaceC65599Tno.FGy(i4, AbstractC166987dD.A0N(obj));
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = i + 527;
        int[] iArr = this.A03;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.A04;
        for (int i7 = 0; i7 < i; i7++) {
            i3 = AbstractC166987dD.A0I(objArr[i7], i3 * 31);
        }
        return i6 + i3;
    }

    public final void A08(int i, Object obj) {
        A06();
        A03(this.A00 + 1);
        int[] iArr = this.A03;
        int i2 = this.A00;
        iArr[i2] = i;
        this.A04[i2] = obj;
        this.A00 = i2 + 1;
    }
}
