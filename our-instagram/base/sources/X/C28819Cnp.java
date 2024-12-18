package X;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.Modifier;

/* renamed from: X.Cnp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28819Cnp implements InterfaceC118865a3, InterfaceC118895a6, InterfaceC118885a5 {
    public final InterfaceC74953Yl A00;
    public final InterfaceC74953Yl A01;
    public final WindowInsets A02;

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ boolean ABA(InterfaceC16660sJ interfaceC16660sJ) {
        return C5X5.A00(this, interfaceC16660sJ);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier Eq3(Modifier modifier) {
        return C58m.A00(this, modifier);
    }

    @Override // X.InterfaceC118865a3
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        InterfaceC74953Yl interfaceC74953Yl = this.A01;
        int BMu = ((WindowInsets) interfaceC74953Yl.getValue()).BMu(c59z, c59z.getLayoutDirection());
        int C9Q = ((WindowInsets) interfaceC74953Yl.getValue()).C9Q(c59z);
        int BpO = ((WindowInsets) interfaceC74953Yl.getValue()).BpO(c59z, c59z.getLayoutDirection()) + BMu;
        int AhR = ((WindowInsets) interfaceC74953Yl.getValue()).AhR(c59z) + C9Q;
        C59W CpF = interfaceC1131559d.CpF(C5AU.A06(j, -BpO, -AhR));
        return AbstractC25229BEm.A0Z(c59z, new DHW(CpF, C9Q, BMu, 1), C5AU.A03(j, CpF.A01 + BpO), C5AU.A02(j, CpF.A00 + AhR));
    }

    @Override // X.InterfaceC118885a5
    public final void DTl(InterfaceC1129258b interfaceC1129258b) {
        WindowInsets windowInsets = (WindowInsets) interfaceC1129258b.Au8(CZO.A00);
        WindowInsets windowInsets2 = this.A02;
        this.A01.Egh(new C28743Cmb(windowInsets2, windowInsets));
        this.A00.Egh(new C28744Cmc(windowInsets, windowInsets2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28819Cnp)) {
            return false;
        }
        return C14360o3.A0K(((C28819Cnp) obj).A02, this.A02);
    }

    @Override // X.InterfaceC118895a6
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00.getValue();
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public C28819Cnp(WindowInsets windowInsets) {
        this.A02 = windowInsets;
        this.A01 = AbstractC25230BEn.A0U(windowInsets);
        this.A00 = AbstractC25229BEm.A0R(windowInsets);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Object AWJ(Object obj, InterfaceC16620sF interfaceC16620sF) {
        return interfaceC16620sF.invoke(obj, this);
    }

    @Override // X.InterfaceC118895a6
    public final C114175De BKT() {
        return CZO.A00;
    }

    @Override // X.InterfaceC118865a3
    public final /* synthetic */ int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC28377Cfg.A00(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.InterfaceC118865a3
    public final /* synthetic */ int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC28377Cfg.A01(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.InterfaceC118865a3
    public final /* synthetic */ int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC28377Cfg.A02(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.InterfaceC118865a3
    public final /* synthetic */ int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC28377Cfg.A03(interfaceC1131659e, interfaceC1131259a, this, i);
    }
}
