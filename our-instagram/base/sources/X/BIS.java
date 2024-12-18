package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class BIS implements InterfaceC1127857k {
    public static final BIS A00 = new BIS();

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
        for (int i = 0; i < size; i++) {
            A0q.add(((InterfaceC1131559d) list.get(i)).CpF(j));
        }
        return AbstractC25229BEm.A0Z(c59z, DRU.A00(A0q, 1), Constraints.A01(j), Constraints.A00(j));
    }
}
