package X;

/* renamed from: X.CnI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28786CnI implements InterfaceC31099Dlh {
    public final int A00;

    public C28786CnI(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC31099Dlh
    public final C27983CVf AAt(InterfaceC30910DiN interfaceC30910DiN) {
        InterfaceC30908DiL interfaceC30908DiL;
        long j;
        long j2;
        C27982CVe c27982CVe;
        C27963CUj c27963CUj;
        C27982CVe A01;
        C27982CVe c27982CVe2;
        C27982CVe c27982CVe3;
        boolean z;
        int A00;
        C27982CVe A002;
        boolean z2;
        C27982CVe A003;
        boolean z3;
        switch (this.A00) {
            case 0:
                C27963CUj c27963CUj2 = ((C28787CnJ) interfaceC30910DiN).A00;
                return new C27983CVf(c27963CUj2.A00(c27963CUj2.A02), c27963CUj2.A00(c27963CUj2.A00), AbstractC167007dF.A1X(interfaceC30910DiN.AtN(), C05F.A00));
            case 1:
                interfaceC30908DiL = C28782CnE.A00;
                break;
            case 2:
                interfaceC30908DiL = C28781CnD.A00;
                break;
            default:
                C28787CnJ c28787CnJ = (C28787CnJ) interfaceC30910DiN;
                C27983CVf c27983CVf = c28787CnJ.A01;
                if (c27983CVf == null) {
                    return C28157Cb4.A03.AAt(interfaceC30910DiN);
                }
                boolean z4 = c28787CnJ.A02;
                if (z4) {
                    c27982CVe = c27983CVf.A01;
                    c27963CUj = c28787CnJ.A00;
                    A01 = AbstractC28013CWl.A01(c27963CUj, c27982CVe, interfaceC30910DiN);
                    c27982CVe3 = c27983CVf.A00;
                    c27982CVe2 = A01;
                } else {
                    c27982CVe = c27983CVf.A00;
                    c27963CUj = c28787CnJ.A00;
                    A01 = AbstractC28013CWl.A01(c27963CUj, c27982CVe, interfaceC30910DiN);
                    c27982CVe2 = c27983CVf.A01;
                    c27982CVe3 = A01;
                }
                if (!C14360o3.A0K(A01, c27982CVe)) {
                    Integer AtN = interfaceC30910DiN.AtN();
                    if (AtN == C05F.A00 || (AtN == C05F.A0C && c27982CVe2.A00 > c27982CVe3.A00)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C27983CVf c27983CVf2 = new C27983CVf(c27982CVe2, c27982CVe3, z);
                    C27982CVe c27982CVe4 = c27983CVf2.A01;
                    long j3 = c27982CVe4.A01;
                    C27982CVe c27982CVe5 = c27983CVf2.A00;
                    if (j3 == c27982CVe5.A01) {
                        if (c27982CVe4.A00 != c27982CVe5.A00) {
                            return c27983CVf2;
                        }
                    } else {
                        boolean z5 = c27983CVf2.A02;
                        C27982CVe c27982CVe6 = c27982CVe5;
                        if (z5) {
                            c27982CVe6 = c27982CVe4;
                        }
                        if (c27982CVe6.A00 != 0) {
                            return c27983CVf2;
                        }
                        C27982CVe c27982CVe7 = c27982CVe4;
                        if (z5) {
                            c27982CVe7 = c27982CVe5;
                        }
                        if (c27963CUj.A03.A04.A03.A00.length() != c27982CVe7.A00) {
                            return c27983CVf2;
                        }
                    }
                    String str = c27963CUj.A03.A04.A03.A00;
                    int length = str.length();
                    if (length == 0) {
                        return c27983CVf2;
                    }
                    int i = c27963CUj.A02;
                    if (i == 0) {
                        int A004 = SQO.A00(str, 0);
                        if (z4) {
                            A003 = AbstractC28013CWl.A00(c27963CUj, c27982CVe4, A004);
                            z3 = true;
                            return new C27983CVf(A003, c27982CVe5, z3);
                        }
                        A002 = AbstractC28013CWl.A00(c27963CUj, c27982CVe5, A004);
                        z2 = false;
                        return new C27983CVf(c27982CVe4, A002, z2);
                    }
                    if (i == length) {
                        int A012 = SQO.A01(str, length);
                        if (z4) {
                            A003 = AbstractC28013CWl.A00(c27963CUj, c27982CVe4, A012);
                            z3 = false;
                            return new C27983CVf(A003, c27982CVe5, z3);
                        }
                        A002 = AbstractC28013CWl.A00(c27963CUj, c27982CVe5, A012);
                        z2 = true;
                        return new C27983CVf(c27982CVe4, A002, z2);
                    }
                    boolean A1P = AbstractC167007dF.A1P(c27983CVf.A02 ? 1 : 0, 1);
                    if (z4 ^ A1P) {
                        A00 = SQO.A01(str, i);
                    } else {
                        A00 = SQO.A00(str, i);
                    }
                    if (z4) {
                        return new C27983CVf(AbstractC28013CWl.A00(c27963CUj, c27982CVe4, A00), c27982CVe5, A1P);
                    }
                    return new C27983CVf(c27982CVe4, AbstractC28013CWl.A00(c27963CUj, c27982CVe5, A00), A1P);
                }
                return c27983CVf;
        }
        boolean A1X = AbstractC167007dF.A1X(interfaceC30910DiN.AtN(), C05F.A00);
        C27963CUj c27963CUj3 = ((C28787CnJ) interfaceC30910DiN).A00;
        long Ahf = interfaceC30908DiL.Ahf(c27963CUj3, c27963CUj3.A02);
        if (!A1X) {
            j = Ahf >> 32;
        } else {
            j = Ahf & 4294967295L;
        }
        C27982CVe A005 = c27963CUj3.A00((int) j);
        long Ahf2 = interfaceC30908DiL.Ahf(c27963CUj3, c27963CUj3.A00);
        if (A1X) {
            j2 = Ahf2 >> 32;
        } else {
            j2 = Ahf2 & 4294967295L;
        }
        return new C27983CVf(A005, c27963CUj3.A00((int) j2), A1X);
    }
}
