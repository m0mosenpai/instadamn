package X;

import java.util.List;

/* renamed from: X.Co0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28830Co0 implements InterfaceC1127857k {
    public static final C28830Co0 A00 = new C28830Co0();

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cnk(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A00(interfaceC1131259a, this, list, i);
    }

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cnn(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A01(interfaceC1131259a, this, list, i);
    }

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cpf(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A02(interfaceC1131259a, this, list, i);
    }

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cpi(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A03(interfaceC1131259a, this, list, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List, java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    @Override // X.InterfaceC1127857k
    public final InterfaceC119205ac CpD(C59Z c59z, List list, long j) {
        int i;
        int i2;
        int i3;
        C59W c59w;
        int size = list.size();
        if (size != 0) {
            int i4 = 0;
            if (size != 1) {
                ?? A0q = AbstractC25230BEn.A0q(list);
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    A0q.add(((InterfaceC1131559d) list.get(i5)).CpF(j));
                }
                int A09 = AbstractC25229BEm.A09(A0q);
                i = 0;
                i2 = 0;
                if (A09 >= 0) {
                    while (true) {
                        C59W c59w2 = (C59W) A0q.get(i4);
                        i = Math.max(i, c59w2.A01);
                        i2 = Math.max(i2, c59w2.A00);
                        if (i4 == A09) {
                            break;
                        }
                        i4++;
                    }
                }
                i3 = 46;
                c59w = A0q;
            } else {
                C59W CpF = ((InterfaceC1131559d) list.get(0)).CpF(j);
                i = CpF.A01;
                i2 = CpF.A00;
                i3 = 45;
                c59w = CpF;
            }
            return AbstractC25229BEm.A0Z(c59z, DRU.A00(c59w, i3), i, i2);
        }
        return c59z.Cgx(AbstractC06930Yk.A0E(), DK0.A00, 0, 0);
    }
}
