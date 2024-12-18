package X;

/* loaded from: classes5.dex */
public final class BHG implements InterfaceC31140Dmf {
    public AbstractC118405Xc A00;
    public AbstractC118405Xc A01;
    public AbstractC118405Xc A02;
    public AbstractC118405Xc A03;
    public COJ A04;
    public float[] A05;
    public float[] A06;
    public float[] A07;
    public int[] A08;
    public final int A09;
    public final C01I A0A;
    public final C01M A0B;
    public final InterfaceC30898DiB A0C;

    @Override // X.InterfaceC31140Dmf
    public final int AwX() {
        return 0;
    }

    @Override // X.C62F
    public final /* synthetic */ AbstractC118405Xc B2E(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3) {
        return CEj(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc3, this.A09 * 1000000);
    }

    @Override // X.C62F
    public final /* synthetic */ boolean CWV() {
        return false;
    }

    private final float A00(int i, int i2, boolean z) {
        InterfaceC30898DiB interfaceC30898DiB;
        float f;
        C01I c01i = this.A0A;
        if (i >= c01i.A00 - 1) {
            f = i2;
        } else {
            int A00 = c01i.A00(i);
            int A002 = c01i.A00(i + 1);
            if (i2 == A00) {
                f = A00;
            } else {
                int i3 = A002 - A00;
                BHF bhf = (BHF) this.A0B.A03(A00);
                if (bhf == null || (interfaceC30898DiB = bhf.A01) == null) {
                    interfaceC30898DiB = this.A0C;
                }
                float f2 = i3;
                float F8E = interfaceC30898DiB.F8E((i2 - A00) / f2);
                if (z) {
                    return F8E;
                }
                f = (f2 * F8E) + A00;
            }
        }
        return f / 1000.0f;
    }

    private final int A01(int i) {
        int i2;
        C01I c01i = this.A0A;
        int i3 = c01i.A00;
        int i4 = 0;
        if (0 <= i3) {
            if (i3 <= i3) {
                int i5 = i3 - 1;
                while (true) {
                    if (i4 <= i5) {
                        i2 = (i4 + i5) >>> 1;
                        int A00 = c01i.A00(i2);
                        if (A00 < i) {
                            i4 = i2 + 1;
                        } else {
                            if (A00 <= i) {
                                break;
                            }
                            i5 = i2 - 1;
                        }
                    } else {
                        i2 = -(i4 + 1);
                        break;
                    }
                }
                if (i2 < -1) {
                    return -(i2 + 2);
                }
                return i2;
            }
            throw new IndexOutOfBoundsException(AnonymousClass001.A0O("Index out of range: ", i3));
        }
        throw AbstractC166987dD.A12(AnonymousClass001.A0X("fromIndex(", ") > toIndex(", ')', 0, i3));
    }

    private final void A03(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3) {
        String str;
        float[] fArr;
        boolean A1W = AbstractC167007dF.A1W(this.A04);
        if (this.A02 == null) {
            this.A02 = AbstractC137336Kc.A01(abstractC118405Xc);
            this.A03 = AbstractC137336Kc.A01(abstractC118405Xc3);
            C01I c01i = this.A0A;
            int i = c01i.A00;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = c01i.A00(i2) / 1000.0f;
            }
            this.A07 = fArr2;
            int i3 = c01i.A00;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                c01i.A00(i4);
                iArr[i4] = 0;
            }
            this.A08 = iArr;
        }
        if (A1W) {
            if (this.A04 != null) {
                AbstractC118405Xc abstractC118405Xc4 = this.A00;
                if (abstractC118405Xc4 == null) {
                    str = "lastInitialValue";
                } else if (abstractC118405Xc4.equals(abstractC118405Xc)) {
                    AbstractC118405Xc abstractC118405Xc5 = this.A01;
                    if (abstractC118405Xc5 == null) {
                        str = "lastTargetValue";
                    } else if (abstractC118405Xc5.equals(abstractC118405Xc2)) {
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            this.A00 = abstractC118405Xc;
            this.A01 = abstractC118405Xc2;
            int A01 = abstractC118405Xc.A01();
            int i5 = (A01 % 2) + A01;
            this.A05 = new float[i5];
            this.A06 = new float[i5];
            C01I c01i2 = this.A0A;
            int i6 = c01i2.A00;
            float[][] fArr3 = new float[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                int A00 = c01i2.A00(i7);
                if (A00 == 0) {
                    C01M c01m = this.A0B;
                    fArr = new float[i5];
                    if (!c01m.A04(A00)) {
                        for (int i8 = 0; i8 < i5; i8++) {
                            fArr[i8] = abstractC118405Xc.A00(i8);
                        }
                    } else {
                        AbstractC118405Xc A02 = A02(c01m, A00);
                        for (int i9 = 0; i9 < i5; i9++) {
                            fArr[i9] = A02.A00(i9);
                        }
                    }
                } else if (A00 == this.A09) {
                    C01M c01m2 = this.A0B;
                    fArr = new float[i5];
                    if (!c01m2.A04(A00)) {
                        for (int i10 = 0; i10 < i5; i10++) {
                            fArr[i10] = abstractC118405Xc2.A00(i10);
                        }
                    } else {
                        AbstractC118405Xc A022 = A02(c01m2, A00);
                        for (int i11 = 0; i11 < i5; i11++) {
                            fArr[i11] = A022.A00(i11);
                        }
                    }
                } else {
                    fArr = new float[i5];
                    AbstractC118405Xc A023 = A02(this.A0B, A00);
                    for (int i12 = 0; i12 < i5; i12++) {
                        fArr[i12] = A023.A00(i12);
                    }
                }
                fArr3[i7] = fArr;
            }
            int[] iArr2 = this.A08;
            if (iArr2 == null) {
                str = "modes";
            } else {
                float[] fArr4 = this.A07;
                if (fArr4 == null) {
                    str = "times";
                } else {
                    this.A04 = new COJ(fArr4, iArr2, fArr3);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.C62F
    public final /* synthetic */ long Azq(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3) {
        return this.A09 * 1000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // X.C62F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC118405Xc CEY(X.AbstractC118405Xc r20, X.AbstractC118405Xc r21, X.AbstractC118405Xc r22, long r23) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BHG.CEY(X.5Xc, X.5Xc, X.5Xc, long):X.5Xc");
    }

    public BHG(C01I c01i, C01M c01m, InterfaceC30898DiB interfaceC30898DiB, int i) {
        this.A0A = c01i;
        this.A0B = c01m;
        this.A09 = i;
        this.A0C = interfaceC30898DiB;
    }

    public static AbstractC118405Xc A02(C01M c01m, int i) {
        Object A03 = c01m.A03(i);
        C14360o3.A0A(A03);
        return ((BHF) A03).A00;
    }

    @Override // X.InterfaceC31140Dmf
    public final int Azk() {
        return this.A09;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r8 > r3) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e A[RETURN] */
    @Override // X.C62F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC118405Xc CEj(X.AbstractC118405Xc r25, X.AbstractC118405Xc r26, X.AbstractC118405Xc r27, long r28) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BHG.CEj(X.5Xc, X.5Xc, X.5Xc, long):X.5Xc");
    }
}
