package X;

import java.util.List;

/* renamed from: X.Cnr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28821Cnr implements InterfaceC1127857k {
    public final C28712Cm4 A00;

    @Override // X.InterfaceC1127857k
    public final InterfaceC119205ac CpD(C59Z c59z, List list, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C28838Co8 c28838Co8;
        int size = list.size();
        C59W[] c59wArr = new C59W[size];
        long j2 = 0;
        int size2 = list.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size2; i7++) {
            InterfaceC1131559d interfaceC1131559d = (InterfaceC1131559d) list.get(i7);
            Object BbJ = interfaceC1131559d.BbJ();
            if ((BbJ instanceof C28838Co8) && (c28838Co8 = (C28838Co8) BbJ) != null && AbstractC25230BEn.A1X(c28838Co8.A00)) {
                C59W CpF = interfaceC1131559d.CpF(j);
                j2 = AbstractC119215ad.A00(CpF.A01, CpF.A00);
                c59wArr[i7] = CpF;
            }
        }
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            InterfaceC1131559d interfaceC1131559d2 = (InterfaceC1131559d) list.get(i8);
            if (c59wArr[i8] == null) {
                c59wArr[i8] = interfaceC1131559d2.CpF(j);
            }
        }
        if (c59z.CXp()) {
            i = AbstractC25225BEi.A06(j2);
        } else {
            if (size != 0) {
                C59W c59w = c59wArr[0];
                int i9 = size - 1;
                if (i9 != 0) {
                    if (c59w != null) {
                        i2 = c59w.A01;
                    } else {
                        i2 = 0;
                    }
                    C58612mK it = new C17u(1, i9).iterator();
                    while (it.hasNext()) {
                        C59W c59w2 = c59wArr[it.A00()];
                        if (c59w2 != null) {
                            i3 = c59w2.A01;
                        } else {
                            i3 = 0;
                        }
                        if (i2 < i3) {
                            c59w = c59w2;
                            i2 = i3;
                        }
                    }
                }
                if (c59w != null) {
                    i = c59w.A01;
                }
            }
            i = 0;
        }
        if (c59z.CXp()) {
            i6 = C119055aN.A00(j2);
        } else if (size != 0) {
            C59W c59w3 = c59wArr[0];
            int i10 = size - 1;
            if (i10 != 0) {
                if (c59w3 != null) {
                    i4 = c59w3.A00;
                } else {
                    i4 = 0;
                }
                C58612mK it2 = new C17u(1, i10).iterator();
                while (it2.hasNext()) {
                    C59W c59w4 = c59wArr[it2.A00()];
                    if (c59w4 != null) {
                        i5 = c59w4.A00;
                    } else {
                        i5 = 0;
                    }
                    if (i4 < i5) {
                        c59w3 = c59w4;
                        i4 = i5;
                    }
                }
            }
            if (c59w3 != null) {
                i6 = c59w3.A00;
            }
        }
        if (!c59z.CXp()) {
            this.A00.A04.Egh(new C119055aN(AbstractC119215ad.A00(i, i6)));
        }
        return AbstractC25229BEm.A0Z(c59z, new C30174DRe(c59wArr, i, this, i6, 0), i, i6);
    }

    public C28821Cnr(C28712Cm4 c28712Cm4) {
        this.A00 = c28712Cm4;
    }

    @Override // X.InterfaceC1127857k
    public final int Cnk(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(AbstractC25235BEs.A0K(list, 0).Cnj(i));
        int A05 = AbstractC25226BEj.A05(list);
        int i2 = 1;
        if (1 <= A05) {
            while (true) {
                valueOf = AbstractC25235BEs.A0j(valueOf, AbstractC25235BEs.A0K(list, i2).Cnj(i));
                if (i2 == A05) {
                    break;
                }
                i2++;
            }
        }
        return AbstractC25227BEk.A06(valueOf, 0);
    }

    @Override // X.InterfaceC1127857k
    public final int Cnn(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(AbstractC25235BEs.A0K(list, 0).Cnm(i));
        int A05 = AbstractC25226BEj.A05(list);
        int i2 = 1;
        if (1 <= A05) {
            while (true) {
                valueOf = AbstractC25235BEs.A0j(valueOf, AbstractC25235BEs.A0K(list, i2).Cnm(i));
                if (i2 == A05) {
                    break;
                }
                i2++;
            }
        }
        return AbstractC25227BEk.A06(valueOf, 0);
    }

    @Override // X.InterfaceC1127857k
    public final int Cpf(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(AbstractC25235BEs.A0K(list, 0).Cpe(i));
        int A05 = AbstractC25226BEj.A05(list);
        int i2 = 1;
        if (1 <= A05) {
            while (true) {
                valueOf = AbstractC25235BEs.A0j(valueOf, AbstractC25235BEs.A0K(list, i2).Cpe(i));
                if (i2 == A05) {
                    break;
                }
                i2++;
            }
        }
        return AbstractC25227BEk.A06(valueOf, 0);
    }

    @Override // X.InterfaceC1127857k
    public final int Cpi(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(AbstractC25235BEs.A0K(list, 0).Cph(i));
        int A05 = AbstractC25226BEj.A05(list);
        int i2 = 1;
        if (1 <= A05) {
            while (true) {
                valueOf = AbstractC25235BEs.A0j(valueOf, AbstractC25235BEs.A0K(list, i2).Cph(i));
                if (i2 == A05) {
                    break;
                }
                i2++;
            }
        }
        return AbstractC25227BEk.A06(valueOf, 0);
    }
}
