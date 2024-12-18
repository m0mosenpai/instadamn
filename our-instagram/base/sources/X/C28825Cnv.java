package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cnv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28825Cnv implements InterfaceC1127857k {
    public final int A00;
    public final Object A01;

    public C28825Cnv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC1127857k
    public final InterfaceC119205ac CpD(C59Z c59z, List list, long j) {
        switch (this.A00) {
            case 0:
                boolean A1R = AbstractC167007dF.A1R(0, c59z, list);
                int i = 0;
                long A04 = Constraints.A04(0, Constraints.A01(j), 0, Constraints.A00(j));
                C59W[] c59wArr = new C59W[list.size()];
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C59W CpF = ((InterfaceC1131559d) list.get(i3)).CpF(A04);
                    c59wArr[i3] = CpF;
                    i = Math.max(i, CpF.A01);
                    i2 = Math.max(i2, CpF.A00);
                }
                C28357CfH c28357CfH = (C28357CfH) this.A01;
                c28357CfH.A04.Egh(new C119055aN(AbstractC119215ad.A00(i, i2)));
                int A03 = C5AU.A03(j, i);
                int A02 = C5AU.A02(j, i2);
                c28357CfH.A03.Egh(new C119055aN(AbstractC119215ad.A00(A03, A02)));
                return AbstractC25229BEm.A0Z(c59z, new C30174DRe(c59wArr, A03, c28357CfH, A02, A1R ? 1 : 0), A03, A02);
            case 1:
                AbstractC167017dG.A1N(c59z, list);
                ArrayList A0i = AbstractC167007dF.A0i(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0i.add(((InterfaceC1131559d) it.next()).CpF(j));
                }
                ArrayList A0i2 = AbstractC167007dF.A0i(A0i);
                Iterator it2 = A0i.iterator();
                while (it2.hasNext()) {
                    AbstractC166997dE.A1W(A0i2, ((C59W) it2.next()).A00);
                }
                int A0H = AbstractC166987dD.A0H(AbstractC001800i.A05(A0i2));
                ArrayList A0i3 = AbstractC167007dF.A0i(A0i);
                Iterator it3 = A0i.iterator();
                while (it3.hasNext()) {
                    AbstractC166997dE.A1W(A0i3, ((C59W) it3.next()).A01);
                }
                int A0H2 = AbstractC166987dD.A0H(AbstractC001800i.A05(A0i3));
                return AbstractC25229BEm.A0Z(c59z, new C30174DRe(this.A01, A0H2, A0i, A0H, 2), A0H2, A0H);
            default:
                boolean A1R2 = AbstractC167007dF.A1R(0, c59z, list);
                C59W CpF2 = ((InterfaceC1131559d) list.get(0)).CpF(Constraints.A04(Constraints.A03(j), Constraints.A01(j), 0, Constraints.A00(j)));
                C59W CpF3 = ((InterfaceC1131559d) list.get(A1R2 ? 1 : 0)).CpF(j);
                int i4 = CpF2.A01;
                int i5 = CpF2.A00;
                C122965hX c122965hX = AbstractC122945hV.A00;
                C09530e4 A0o = AbstractC167007dF.A0o(c122965hX, CpF2.AX8(c122965hX));
                C122965hX c122965hX2 = AbstractC122945hV.A01;
                return c59z.Cgx(AbstractC25233BEq.A0p(c122965hX2, Integer.valueOf(CpF2.AX8(c122965hX2)), A0o), new C30172DRc(18, this.A01, CpF3, CpF2), i4, i5);
        }
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
    public final /* synthetic */ int Cpf(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A02(interfaceC1131259a, this, list, i);
    }

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cpi(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A03(interfaceC1131259a, this, list, i);
    }
}
