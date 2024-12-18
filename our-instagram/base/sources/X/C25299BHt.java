package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BHt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25299BHt implements InterfaceC1127857k {
    public final InterfaceC16820sZ A00;
    public final InterfaceC16820sZ A01;

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

    public C25299BHt(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A01 = interfaceC16820sZ;
        this.A00 = interfaceC16820sZ2;
    }

    @Override // X.InterfaceC1127857k
    public final InterfaceC119205ac CpD(C59Z c59z, List list, long j) {
        ArrayList arrayList;
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(((InterfaceC1131659e) obj).BbJ() instanceof C28839Co9)) {
                A0q.add(obj);
            }
        }
        List list2 = (List) this.A00.invoke();
        if (list2 != null) {
            arrayList = AbstractC25230BEn.A0q(list2);
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C114205Dh c114205Dh = (C114205Dh) list2.get(i2);
                if (c114205Dh != null) {
                    InterfaceC1131559d interfaceC1131559d = (InterfaceC1131559d) A0q.get(i2);
                    float f = c114205Dh.A02;
                    float f2 = c114205Dh.A01;
                    int floor = (int) Math.floor(f - f2);
                    float f3 = c114205Dh.A00;
                    arrayList.add(new C09530e4(interfaceC1131559d.CpF(C5AU.A04(0, floor, 0, (int) Math.floor(f3 - r8))), new C119235af(AbstractC113765Bo.A00(Math.round(f2), Math.round(c114205Dh.A03)))));
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList A0q2 = AbstractC25230BEn.A0q(list);
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj2 = list.get(i3);
            if (((InterfaceC1131659e) obj2).BbJ() instanceof C28839Co9) {
                A0q2.add(obj2);
            }
        }
        return AbstractC25229BEm.A0Z(c59z, new DRZ(41, arrayList, AbstractC122425gd.A00(A0q2, this.A01)), Constraints.A01(j), Constraints.A00(j));
    }
}
