package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cnz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28829Cnz implements InterfaceC1127857k {
    public static final C28829Cnz A00 = new C28829Cnz();

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

    @Override // X.InterfaceC1127857k
    public final InterfaceC119205ac CpD(C59Z c59z, List list, long j) {
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        int size = list.size();
        Integer num = 0;
        for (int i = 0; i < size; i++) {
            A0q.add(((InterfaceC1131559d) list.get(i)).CpF(j));
        }
        int size2 = A0q.size();
        Integer num2 = num;
        for (int i2 = 0; i2 < size2; i2++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((C59W) A0q.get(i2)).A01));
        }
        int intValue = num2.intValue();
        int size3 = A0q.size();
        for (int i3 = 0; i3 < size3; i3++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((C59W) A0q.get(i3)).A00));
        }
        return AbstractC25229BEm.A0Z(c59z, DRU.A00(A0q, 17), intValue, num.intValue());
    }
}
