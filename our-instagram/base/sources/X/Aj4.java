package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public final class Aj4 implements InterfaceC92464Cd {
    public final int A00;
    public final Object A01;

    public Aj4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC92464Cd
    public final void D18(MotionEvent motionEvent, C81373k7 c81373k7, C38321qM c38321qM, C75113Zb c75113Zb) {
        int i = this.A00;
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        switch (i) {
            case 0:
                ((BC6) this.A01).Czr(c38321qM, c75113Zb);
                return;
            case 1:
                InterfaceC25197BCu interfaceC25197BCu = (InterfaceC25197BCu) this.A01;
                if (interfaceC25197BCu == null) {
                    return;
                }
                interfaceC25197BCu.D5s(c38321qM, c75113Zb);
                return;
            case 2:
                ((BDQ) this.A01).Dwx(c38321qM, c75113Zb);
                return;
            default:
                ((BDR) this.A01).Dwy(c38321qM, c75113Zb);
                return;
        }
    }

    @Override // X.InterfaceC92464Cd
    public final void D19(MotionEvent motionEvent, C81373k7 c81373k7, C38321qM c38321qM, C75113Zb c75113Zb, C2Fb c2Fb) {
        int i = this.A00;
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        switch (i) {
            case 0:
                ((BC6) this.A01).Czr(c38321qM, c75113Zb);
                return;
            case 1:
                InterfaceC25197BCu interfaceC25197BCu = (InterfaceC25197BCu) this.A01;
                if (interfaceC25197BCu == null) {
                    return;
                }
                interfaceC25197BCu.D5s(c38321qM, c75113Zb);
                return;
            case 2:
                ((BDQ) this.A01).Dwx(c38321qM, c75113Zb);
                return;
            default:
                ((BDR) this.A01).Dwy(c38321qM, c75113Zb);
                return;
        }
    }

    @Override // X.InterfaceC92464Cd
    public final void ED7(View view, C38321qM c38321qM, C75113Zb c75113Zb) {
        switch (this.A00) {
            case 0:
                AbstractC167017dG.A1O(c38321qM, view);
                return;
            case 1:
                AbstractC167017dG.A1O(c38321qM, view);
                InterfaceC25197BCu interfaceC25197BCu = (InterfaceC25197BCu) this.A01;
                if (interfaceC25197BCu == null) {
                    return;
                }
                interfaceC25197BCu.EDA(view, c38321qM);
                return;
            case 2:
                AbstractC167017dG.A1O(c38321qM, view);
                ((BDQ) this.A01).EDn(view, c38321qM);
                return;
            default:
                AbstractC167017dG.A1O(c38321qM, view);
                ((BDR) this.A01).EDo(view, c38321qM);
                return;
        }
    }
}
