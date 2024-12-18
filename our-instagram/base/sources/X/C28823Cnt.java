package X;

import androidx.compose.ui.unit.Constraints;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cnt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28823Cnt implements InterfaceC1127857k {
    public final /* synthetic */ float A00;

    public C28823Cnt(float f) {
        this.A00 = f;
    }

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
        C59W CpF;
        C59W CpF2;
        float f;
        int i = 0;
        boolean A1R = AbstractC167007dF.A1R(0, c59z, list);
        int A03 = Constraints.A03(j);
        int A01 = Constraints.A01(j);
        long A04 = Constraints.A04(A03, A01, 0, Constraints.A00(j));
        InterfaceC1131559d interfaceC1131559d = (InterfaceC1131559d) AbstractC001800i.A0O(list, 0);
        if (interfaceC1131559d != null && (CpF = interfaceC1131559d.CpF(A04)) != null) {
            int i2 = CpF.A01;
            InterfaceC1131559d interfaceC1131559d2 = (InterfaceC1131559d) AbstractC001800i.A0O(list, 2);
            if (interfaceC1131559d2 != null && (CpF2 = interfaceC1131559d2.CpF(A04)) != null) {
                int i3 = (A01 - i2) - CpF2.A01;
                if (i3 < 0) {
                    i3 = 0;
                }
                InterfaceC1131559d interfaceC1131559d3 = (InterfaceC1131559d) AbstractC001800i.A0O(list, A1R ? 1 : 0);
                if (interfaceC1131559d3 != null) {
                    boolean z = false;
                    C59W A0N = AbstractC25236BEt.A0N(interfaceC1131559d3, i3, A04);
                    if (A0N != null) {
                        int i4 = A0N.A01;
                        if (A01 == 0) {
                            f = 100.0f;
                        } else {
                            f = i4 / A01;
                        }
                        if (f < this.A00) {
                            z = true;
                        }
                        C5Hb A042 = AbstractC133095zb.A04(CpF, A0N, CpF2);
                        Iterator it = A042.iterator();
                        if (it.hasNext()) {
                            Integer valueOf = Integer.valueOf(((C59W) it.next()).A00);
                            while (it.hasNext()) {
                                Integer valueOf2 = Integer.valueOf(((C59W) it.next()).A00);
                                if (valueOf.compareTo(valueOf2) < 0) {
                                    valueOf = valueOf2;
                                }
                            }
                            if (valueOf != null) {
                                i = valueOf.intValue();
                            }
                        }
                        return AbstractC25229BEm.A0Z(c59z, new DI6(A042, i, A01, i4, i3, i2, z), A01, i);
                    }
                }
            }
        }
        return new C28834Co4(3);
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
