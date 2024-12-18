package X;

import android.view.View;
import java.util.List;

/* loaded from: classes7.dex */
public final class HJF extends C42H {
    public final /* synthetic */ C54641OBr A00;
    public final /* synthetic */ OU6 A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C75113Zb A03;
    public final /* synthetic */ List A04;

    @Override // X.C42H, X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
        C4ZF c4zf;
        C14360o3.A0B(c3vz, 0);
        if (c3vz == C3VZ.A02 && (c4zf = this.A03.A0s) != null) {
            c4zf.A01();
        }
    }

    public HJF(C54641OBr c54641OBr, OU6 ou6, C38321qM c38321qM, C75113Zb c75113Zb, List list) {
        this.A03 = c75113Zb;
        this.A00 = c54641OBr;
        this.A04 = list;
        this.A01 = ou6;
        this.A02 = c38321qM;
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        View view;
        this.A03.A0A(i);
        Object A0X = AbstractC37302Gc3.A0X(this.A00.A02.A0F);
        if (A0X instanceof C905741s) {
            view = ((C905741s) A0X).A0F;
        } else if (A0X instanceof C105184oY) {
            view = ((C105184oY) A0X).A0E;
        } else if (A0X instanceof C69228Vjw) {
            view = ((C69228Vjw) A0X).A03;
            C14360o3.A06(view);
        } else {
            throw AbstractC166987dD.A12(AbstractC111324zv.A00(1856));
        }
        AbstractC56932jR.A07(view, null);
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void DXb(int i, int i2, boolean z) {
        C38321qM A0x = AbstractC25225BEi.A0x(this.A04, i);
        C75113Zb c75113Zb = this.A03;
        c75113Zb.A0B(i);
        if (A0x.Cff()) {
            OU6.A00(this.A00, this.A01, this.A02, c75113Zb);
        }
    }
}
