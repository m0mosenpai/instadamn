package X;

import java.util.Arrays;

/* renamed from: X.2i3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56142i3 {
    public static int A0F = 1000;
    public static long A0G;
    public static boolean A0H;
    public C56162i5[] A06;
    public InterfaceC56172i6 A0A;
    public InterfaceC56172i6 A0B;
    public final C56182i7 A0E;
    public boolean A04 = false;
    public int A03 = 0;
    public int A07 = 32;
    public int A00 = 32;
    public boolean A05 = false;
    public boolean[] A0D = new boolean[32];
    public int A01 = 1;
    public int A02 = 0;
    public int A08 = 32;
    public C56152i4[] A0C = new C56152i4[A0F];
    public int A09 = 0;

    private void A03() {
        for (int i = 0; i < this.A02; i++) {
            C56162i5[] c56162i5Arr = this.A06;
            C56162i5 c56162i5 = c56162i5Arr[i];
            if (c56162i5 != null) {
                C56192i8 c56192i8 = (C56192i8) this.A0E.A00;
                int i2 = c56192i8.A00;
                Object[] objArr = c56192i8.A01;
                if (i2 < 256) {
                    objArr[i2] = c56162i5;
                    c56192i8.A00 = i2 + 1;
                }
            }
            c56162i5Arr[i] = null;
        }
    }

    private final void A05(InterfaceC56172i6 interfaceC56172i6) {
        C56222iB c56222iB;
        int i;
        for (int i2 = 0; i2 < this.A01; i2++) {
            this.A0D[i2] = false;
        }
        int i3 = 0;
        while (true) {
            i3++;
            if (i3 < this.A01 * 2) {
                C56152i4 c56152i4 = ((C56162i5) interfaceC56172i6).A02;
                if (c56152i4 != null) {
                    this.A0D[c56152i4.A02] = true;
                }
                boolean[] zArr = this.A0D;
                C56152i4 BdO = interfaceC56172i6.BdO(this, zArr);
                if (BdO != null) {
                    int i4 = BdO.A02;
                    if (!zArr[i4]) {
                        zArr[i4] = true;
                        float f = Float.MAX_VALUE;
                        int i5 = -1;
                        for (int i6 = 0; i6 < this.A02; i6++) {
                            C56162i5 c56162i5 = this.A06[i6];
                            if (c56162i5.A02.A06 != C05F.A00 && !c56162i5.A04 && (i = (c56222iB = (C56222iB) c56162i5.A01).A01) != -1) {
                                int i7 = 0;
                                while (true) {
                                    if (i != -1 && i7 < c56222iB.A00) {
                                        if (c56222iB.A03[i] == i4) {
                                            float AX5 = c56162i5.A01.AX5(BdO);
                                            if (AX5 < 0.0f) {
                                                float f2 = (-c56162i5.A00) / AX5;
                                                if (f2 < f) {
                                                    i5 = i6;
                                                    f = f2;
                                                }
                                            }
                                        } else {
                                            i = c56222iB.A04[i];
                                            i7++;
                                        }
                                    }
                                }
                            }
                        }
                        if (i5 > -1) {
                            C56162i5 c56162i52 = this.A06[i5];
                            c56162i52.A02.A01 = -1;
                            c56162i52.A04(BdO);
                            C56152i4 c56152i42 = c56162i52.A02;
                            c56152i42.A01 = i5;
                            c56152i42.A03(c56162i52, this);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final C56152i4 A09(Object obj) {
        C56152i4 c56152i4 = null;
        if (obj != null) {
            if (this.A01 + 1 >= this.A00) {
                A02();
            }
            if (obj instanceof C56112hz) {
                C56112hz c56112hz = (C56112hz) obj;
                c56152i4 = c56112hz.A03;
                if (c56152i4 == null) {
                    c56112hz.A04();
                    c56152i4 = c56112hz.A03;
                }
                int i = c56152i4.A02;
                if (i != -1) {
                    if (i > this.A03 || this.A0E.A03[i] == null) {
                        c56152i4.A00();
                    }
                }
                int i2 = this.A03 + 1;
                this.A03 = i2;
                this.A01++;
                c56152i4.A02 = i2;
                c56152i4.A06 = C05F.A00;
                this.A0E.A03[i2] = c56152i4;
            }
        }
        return c56152i4;
    }

    public final void A0B() {
        C56182i7 c56182i7;
        C56152i4[] c56152i4Arr;
        int i = 0;
        while (true) {
            c56182i7 = this.A0E;
            c56152i4Arr = c56182i7.A03;
            if (i >= c56152i4Arr.length) {
                break;
            }
            C56152i4 c56152i4 = c56152i4Arr[i];
            if (c56152i4 != null) {
                c56152i4.A00();
            }
            i++;
        }
        InterfaceC56202i9 interfaceC56202i9 = c56182i7.A02;
        C56152i4[] c56152i4Arr2 = this.A0C;
        int i2 = this.A09;
        C56192i8 c56192i8 = (C56192i8) interfaceC56202i9;
        int length = c56152i4Arr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C56152i4 c56152i42 = c56152i4Arr2[i3];
            int i4 = c56192i8.A00;
            Object[] objArr = c56192i8.A01;
            if (i4 < 256) {
                objArr[i4] = c56152i42;
                c56192i8.A00 = i4 + 1;
            }
        }
        this.A09 = 0;
        Arrays.fill(c56152i4Arr, (Object) null);
        this.A03 = 0;
        this.A0A.clear();
        this.A01 = 1;
        for (int i5 = 0; i5 < this.A02; i5++) {
        }
        A03();
        this.A02 = 0;
        this.A0B = new C56162i5(c56182i7);
    }

    public final void A0D(C56152i4 c56152i4, int i) {
        InterfaceC56232iC interfaceC56232iC;
        float f;
        int i2 = c56152i4.A01;
        if (i2 == -1) {
            c56152i4.A04(this, i);
            for (int i3 = 0; i3 < this.A03 + 1; i3++) {
            }
            return;
        }
        C56162i5 c56162i5 = this.A06[i2];
        if (!c56162i5.A04) {
            if (((C56222iB) c56162i5.A01).A00 == 0) {
                c56162i5.A04 = true;
            } else {
                C56162i5 A06 = A06();
                if (i < 0) {
                    A06.A00 = -i;
                    interfaceC56232iC = A06.A01;
                    f = 1.0f;
                } else {
                    A06.A00 = i;
                    interfaceC56232iC = A06.A01;
                    f = -1.0f;
                }
                interfaceC56232iC.E6w(c56152i4, f);
                A0C(A06);
                return;
            }
        }
        c56162i5.A00 = i;
    }

    public static final int A00(Object obj) {
        C56152i4 c56152i4 = ((C56112hz) obj).A03;
        if (c56152i4 != null) {
            return (int) (c56152i4.A00 + 0.5f);
        }
        return 0;
    }

    private C56152i4 A01(Integer num) {
        Object obj;
        C56192i8 c56192i8 = (C56192i8) this.A0E.A02;
        int i = c56192i8.A00;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c56192i8.A01;
            obj = objArr[i2];
            objArr[i2] = null;
            c56192i8.A00 = i2;
        } else {
            obj = null;
        }
        C56152i4 c56152i4 = (C56152i4) obj;
        if (c56152i4 == null) {
            c56152i4 = new C56152i4(num);
        } else {
            c56152i4.A00();
        }
        c56152i4.A06 = num;
        int i3 = this.A09;
        int i4 = A0F;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            A0F = i5;
            this.A0C = (C56152i4[]) Arrays.copyOf(this.A0C, i5);
        }
        C56152i4[] c56152i4Arr = this.A0C;
        int i6 = this.A09;
        this.A09 = i6 + 1;
        c56152i4Arr[i6] = c56152i4;
        return c56152i4;
    }

    private void A02() {
        int i = this.A07 * 2;
        this.A07 = i;
        this.A06 = (C56162i5[]) Arrays.copyOf(this.A06, i);
        C56182i7 c56182i7 = this.A0E;
        c56182i7.A03 = (C56152i4[]) Arrays.copyOf(c56182i7.A03, this.A07);
        int i2 = this.A07;
        this.A0D = new boolean[i2];
        this.A00 = i2;
        this.A08 = i2;
    }

    private final void A04(C56162i5 c56162i5) {
        int i;
        if (c56162i5.A04) {
            c56162i5.A02.A04(this, c56162i5.A00);
        } else {
            C56162i5[] c56162i5Arr = this.A06;
            int i2 = this.A02;
            c56162i5Arr[i2] = c56162i5;
            C56152i4 c56152i4 = c56162i5.A02;
            c56152i4.A01 = i2;
            this.A02 = i2 + 1;
            c56152i4.A03(c56162i5, this);
        }
        if (this.A04) {
            int i3 = 0;
            while (i3 < this.A02) {
                if (this.A06[i3] == null) {
                    System.out.println("WTF");
                }
                C56162i5[] c56162i5Arr2 = this.A06;
                C56162i5 c56162i52 = c56162i5Arr2[i3];
                if (c56162i52 != null && c56162i52.A04) {
                    C56162i5 c56162i53 = c56162i5Arr2[i3];
                    c56162i53.A02.A04(this, c56162i53.A00);
                    C56192i8 c56192i8 = (C56192i8) this.A0E.A00;
                    int i4 = c56192i8.A00;
                    Object[] objArr = c56192i8.A01;
                    if (i4 < 256) {
                        objArr[i4] = c56162i53;
                        c56192i8.A00 = i4 + 1;
                    }
                    c56162i5Arr2[i3] = null;
                    int i5 = i3 + 1;
                    int i6 = i5;
                    while (true) {
                        i = this.A02;
                        if (i5 >= i) {
                            break;
                        }
                        int i7 = i5 - 1;
                        C56162i5 c56162i54 = c56162i5Arr2[i5];
                        c56162i5Arr2[i7] = c56162i54;
                        if (c56162i54.A02.A01 == i5) {
                            c56162i5Arr2[i7].A02.A01 = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i) {
                        c56162i5Arr2[i6] = null;
                    }
                    this.A02 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.A04 = false;
        }
    }

    public final C56162i5 A06() {
        Object obj;
        C56182i7 c56182i7 = this.A0E;
        C56192i8 c56192i8 = (C56192i8) c56182i7.A00;
        int i = c56192i8.A00;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c56192i8.A01;
            obj = objArr[i2];
            objArr[i2] = null;
            c56192i8.A00 = i2;
        } else {
            obj = null;
        }
        C56162i5 c56162i5 = (C56162i5) obj;
        if (c56162i5 == null) {
            c56162i5 = new C56162i5(c56182i7);
            A0G++;
        } else {
            c56162i5.A02 = null;
            c56162i5.A01.clear();
            c56162i5.A00 = 0.0f;
            c56162i5.A04 = false;
        }
        C56152i4.A0C++;
        return c56162i5;
    }

    public final C56152i4 A07() {
        if (this.A01 + 1 >= this.A00) {
            A02();
        }
        C56152i4 A01 = A01(C05F.A0C);
        int i = this.A03 + 1;
        this.A03 = i;
        this.A01++;
        A01.A02 = i;
        this.A0E.A03[i] = A01;
        return A01;
    }

    public final C56152i4 A08(int i) {
        if (this.A01 + 1 >= this.A00) {
            A02();
        }
        C56152i4 A01 = A01(C05F.A0N);
        int i2 = this.A03 + 1;
        this.A03 = i2;
        this.A01++;
        A01.A02 = i2;
        A01.A04 = i;
        this.A0E.A03[i2] = A01;
        this.A0A.A8S(A01);
        return A01;
    }

    public final void A0A() {
        InterfaceC56172i6 interfaceC56172i6 = this.A0A;
        if (!interfaceC56172i6.isEmpty()) {
            if (this.A05) {
                for (int i = 0; i < this.A02; i++) {
                    if (this.A06[i].A04) {
                    }
                }
            }
            int i2 = 0;
            while (true) {
                if (i2 >= this.A02) {
                    break;
                }
                C56162i5[] c56162i5Arr = this.A06;
                Integer num = c56162i5Arr[i2].A02.A06;
                Integer num2 = C05F.A00;
                if (num != num2 && c56162i5Arr[i2].A00 < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    do {
                        i3++;
                        float f = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        for (int i7 = 0; i7 < this.A02; i7++) {
                            C56162i5 c56162i5 = this.A06[i7];
                            if (c56162i5.A02.A06 != num2 && !c56162i5.A04 && c56162i5.A00 < 0.0f) {
                                int i8 = ((C56222iB) c56162i5.A01).A00;
                                for (int i9 = 0; i9 < i8; i9++) {
                                    InterfaceC56232iC interfaceC56232iC = c56162i5.A01;
                                    C56152i4 CEc = interfaceC56232iC.CEc(i9);
                                    float AX5 = interfaceC56232iC.AX5(CEc);
                                    if (AX5 > 0.0f) {
                                        int i10 = 0;
                                        do {
                                            float f2 = CEc.A0A[i10] / AX5;
                                            if ((f2 < f && i10 == i6) || i10 > i6) {
                                                i5 = CEc.A02;
                                                i6 = i10;
                                                i4 = i7;
                                                f = f2;
                                            }
                                            i10++;
                                        } while (i10 < 9);
                                    }
                                }
                            }
                        }
                        if (i4 != -1) {
                            C56162i5 c56162i52 = this.A06[i4];
                            c56162i52.A02.A01 = -1;
                            c56162i52.A04(this.A0E.A03[i5]);
                            C56152i4 c56152i4 = c56162i52.A02;
                            c56152i4.A01 = i4;
                            c56152i4.A03(c56162i52, this);
                        } else {
                            z = true;
                        }
                        if (i3 > this.A01 / 2) {
                            break;
                        }
                    } while (!z);
                } else {
                    i2++;
                }
            }
            A05(interfaceC56172i6);
            for (int i11 = 0; i11 < this.A02; i11++) {
                C56162i5 c56162i53 = this.A06[i11];
                c56162i53.A02.A00 = c56162i53.A00;
            }
            return;
        }
        for (int i12 = 0; i12 < this.A02; i12++) {
            C56162i5 c56162i54 = this.A06[i12];
            c56162i54.A02.A00 = c56162i54.A00;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(X.C56162i5 r19) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56142i3.A0C(X.2i5):void");
    }

    public final void A0E(C56152i4 c56152i4, C56152i4 c56152i42, int i, int i2) {
        if (i2 == 8 && c56152i42.A08 && c56152i4.A01 == -1) {
            c56152i4.A04(this, c56152i42.A00 + i);
            return;
        }
        C56162i5 A06 = A06();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            A06.A00 = i;
        }
        InterfaceC56232iC interfaceC56232iC = A06.A01;
        if (!z) {
            interfaceC56232iC.E6w(c56152i4, -1.0f);
            interfaceC56232iC.E6w(c56152i42, 1.0f);
        } else {
            interfaceC56232iC.E6w(c56152i4, 1.0f);
            interfaceC56232iC.E6w(c56152i42, -1.0f);
        }
        if (i2 != 8) {
            interfaceC56232iC.E6w(A08(i2), 1.0f);
            interfaceC56232iC.E6w(A08(i2), -1.0f);
        }
        A0C(A06);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.2i6, X.2i5, X.2iA] */
    public C56142i3() {
        this.A06 = null;
        this.A06 = new C56162i5[32];
        A03();
        C56182i7 c56182i7 = new C56182i7();
        this.A0E = c56182i7;
        ?? c56162i5 = new C56162i5(c56182i7);
        c56162i5.A03 = new C56152i4[128];
        c56162i5.A04 = new C56152i4[128];
        c56162i5.A00 = 0;
        c56162i5.A02 = new C56242iD(c56162i5, c56162i5);
        c56162i5.A01 = c56182i7;
        this.A0A = c56162i5;
        this.A0B = new C56162i5(c56182i7);
    }

    public final void A0F(C56152i4 c56152i4, C56152i4 c56152i42, int i, int i2) {
        C56162i5 A06 = A06();
        C56152i4 A07 = A07();
        A07.A04 = 0;
        A06.A05(c56152i4, c56152i42, A07, i);
        if (i2 != 8) {
            A06.A01.E6w(A08(i2), (int) (r2.AX5(A07) * (-1.0f)));
        }
        A0C(A06);
    }

    public final void A0G(C56152i4 c56152i4, C56152i4 c56152i42, int i, int i2) {
        C56162i5 A06 = A06();
        C56152i4 A07 = A07();
        A07.A04 = 0;
        A06.A06(c56152i4, c56152i42, A07, i);
        if (i2 != 8) {
            A06.A01.E6w(A08(i2), (int) (r2.AX5(A07) * (-1.0f)));
        }
        A0C(A06);
    }

    public final void A0H(C56152i4 c56152i4, C56152i4 c56152i42, C56152i4 c56152i43, C56152i4 c56152i44, float f, int i, int i2, int i3) {
        InterfaceC56232iC interfaceC56232iC;
        float f2;
        int i4;
        C56162i5 A06 = A06();
        if (c56152i42 == c56152i43) {
            interfaceC56232iC = A06.A01;
            interfaceC56232iC.E6w(c56152i4, 1.0f);
            interfaceC56232iC.E6w(c56152i44, 1.0f);
            interfaceC56232iC.E6w(c56152i42, -2.0f);
        } else {
            if (f == 0.5f) {
                interfaceC56232iC = A06.A01;
                interfaceC56232iC.E6w(c56152i4, 1.0f);
                interfaceC56232iC.E6w(c56152i42, -1.0f);
                interfaceC56232iC.E6w(c56152i43, -1.0f);
                interfaceC56232iC.E6w(c56152i44, 1.0f);
                if (i > 0 || i2 > 0) {
                    i4 = (-i) + i2;
                    f2 = i4;
                }
            } else if (f <= 0.0f) {
                interfaceC56232iC = A06.A01;
                interfaceC56232iC.E6w(c56152i4, -1.0f);
                interfaceC56232iC.E6w(c56152i42, 1.0f);
                f2 = i;
            } else {
                interfaceC56232iC = A06.A01;
                if (f >= 1.0f) {
                    interfaceC56232iC.E6w(c56152i44, -1.0f);
                    interfaceC56232iC.E6w(c56152i43, 1.0f);
                    i4 = -i2;
                    f2 = i4;
                } else {
                    float f3 = 1.0f - f;
                    interfaceC56232iC.E6w(c56152i4, f3 * 1.0f);
                    interfaceC56232iC.E6w(c56152i42, f3 * (-1.0f));
                    interfaceC56232iC.E6w(c56152i43, (-1.0f) * f);
                    interfaceC56232iC.E6w(c56152i44, 1.0f * f);
                    if (i > 0 || i2 > 0) {
                        f2 = ((-i) * f3) + (i2 * f);
                    }
                }
            }
            A06.A00 = f2;
        }
        if (i3 != 8) {
            interfaceC56232iC.E6w(A08(i3), 1.0f);
            interfaceC56232iC.E6w(A08(i3), -1.0f);
        }
        A0C(A06);
    }
}
