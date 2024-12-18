package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Cnm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28816Cnm implements InterfaceC118865a3 {
    public final int A00;
    public final C28364CfO A01;
    public final CVF A02;
    public final InterfaceC16820sZ A03;

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ boolean ABA(InterfaceC16660sJ interfaceC16660sJ) {
        return C5X5.A00(this, interfaceC16660sJ);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier Eq3(Modifier modifier) {
        return C58m.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28816Cnm) {
                C28816Cnm c28816Cnm = (C28816Cnm) obj;
                if (!C14360o3.A0K(this.A01, c28816Cnm.A01) || this.A00 != c28816Cnm.A00 || !C14360o3.A0K(this.A02, c28816Cnm.A02) || !C14360o3.A0K(this.A03, c28816Cnm.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0J(this.A02, (AbstractC166987dD.A0G(this.A01) + this.A00) * 31));
    }

    public C28816Cnm(C28364CfO c28364CfO, CVF cvf, InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A01 = c28364CfO;
        this.A00 = i;
        this.A02 = cvf;
        this.A03 = interfaceC16820sZ;
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Object AWJ(Object obj, InterfaceC16620sF interfaceC16620sF) {
        return interfaceC16620sF.invoke(obj, this);
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
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        int A00 = Constraints.A00(j);
        int Cnm = interfaceC1131559d.Cnm(A00);
        int A01 = Constraints.A01(j);
        if (Cnm >= A01) {
            j = Constraints.A04(Constraints.A03(j), Integer.MAX_VALUE, Constraints.A02(j), A00);
        }
        C59W CpF = interfaceC1131559d.CpF(j);
        int min = Math.min(CpF.A01, A01);
        return AbstractC25229BEm.A0Z(c59z, new C30176DRg(min, 0, CpF, c59z, this), min, CpF.A00);
    }

    @Override // X.InterfaceC118865a3
    public final /* synthetic */ int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC28377Cfg.A02(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.InterfaceC118865a3
    public final /* synthetic */ int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC28377Cfg.A03(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("HorizontalScrollLayoutModifier(scrollerPosition=");
        A1C.append(this.A01);
        A1C.append(", cursorOffset=");
        A1C.append(this.A00);
        A1C.append(", transformedText=");
        A1C.append(this.A02);
        A1C.append(", textLayoutResultProvider=");
        return AbstractC167017dG.A0o(this.A03, A1C);
    }
}
