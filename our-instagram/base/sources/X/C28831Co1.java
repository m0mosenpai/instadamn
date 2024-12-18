package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.Co1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28831Co1 implements InterfaceC1127857k {
    public static final C28831Co1 A00 = new C28831Co1();

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cnk(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A00(interfaceC1131259a, this, list, i);
    }

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cnn(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A01(interfaceC1131259a, this, list, i);
    }

    @Override // X.InterfaceC1127857k
    public final InterfaceC119205ac CpD(C59Z c59z, List list, long j) {
        C59W c59w;
        C59W c59w2;
        int i;
        int i2;
        C59W c59w3;
        InterfaceC1131559d interfaceC1131559d = (InterfaceC1131559d) AbstractC001800i.A0O(list, AbstractC167007dF.A1R(0, c59z, list) ? 1 : 0);
        if (interfaceC1131559d != null) {
            c59w = interfaceC1131559d.CpF(j);
        } else {
            c59w = null;
        }
        InterfaceC1131559d interfaceC1131559d2 = (InterfaceC1131559d) AbstractC001800i.A0O(list, 2);
        if (interfaceC1131559d2 != null) {
            c59w2 = interfaceC1131559d2.CpF(j);
        } else {
            c59w2 = null;
        }
        int i3 = 0;
        if (c59w != null) {
            i = c59w.A00;
        } else {
            i = 0;
        }
        if (c59w2 != null) {
            i2 = c59w2.A00;
        } else {
            i2 = 0;
        }
        int A002 = (Constraints.A00(j) - i) - i2;
        int A03 = Constraints.A03(j);
        int A01 = Constraints.A01(j);
        long A04 = Constraints.A04(A03, A01, Constraints.A02(j), A002);
        InterfaceC1131559d interfaceC1131559d3 = (InterfaceC1131559d) AbstractC001800i.A0O(list, 0);
        if (interfaceC1131559d3 != null) {
            c59w3 = interfaceC1131559d3.CpF(A04);
            if (c59w3 != null) {
                i3 = c59w3.A00;
            }
        } else {
            c59w3 = null;
        }
        return AbstractC25229BEm.A0Z(c59z, new C30176DRg(i2, 4, c59w3, c59w2, c59w), A01, i3 + i + i2);
    }

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cpf(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A02(interfaceC1131259a, this, list, i);
    }

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cpi(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A03(interfaceC1131259a, this, list, i);
    }
}
