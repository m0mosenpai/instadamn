package X;

import androidx.compose.ui.unit.Constraints;

/* loaded from: classes5.dex */
public final class CWV {
    public InterfaceC1131559d A00;
    public InterfaceC1131559d A01;
    public C59W A02;
    public C59W A03;
    public final Integer A04;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CWV);
    }

    public final int hashCode() {
        String str;
        Integer num = this.A04;
        if (num.intValue() != 0) {
            str = "Clip";
        } else {
            str = "Visible";
        }
        return AbstractC25230BEn.A0C(num, str) * 31 * 31;
    }

    public CWV(Integer num) {
        this.A04 = num;
    }

    public final void A00(InterfaceC1131659e interfaceC1131659e, InterfaceC1131659e interfaceC1131659e2, long j) {
        InterfaceC1131559d interfaceC1131559d;
        InterfaceC1131559d interfaceC1131559d2;
        long A04 = AbstractC25234BEr.A04(j);
        if (interfaceC1131659e != null) {
            int A00 = Constraints.A00(A04);
            AbstractC119735bX abstractC119735bX = AbstractC28419CgQ.A01;
            interfaceC1131659e.Cpe(interfaceC1131659e.Cph(A00));
            if (interfaceC1131659e instanceof InterfaceC1131559d) {
                interfaceC1131559d2 = (InterfaceC1131559d) interfaceC1131659e;
            } else {
                interfaceC1131559d2 = null;
            }
            this.A01 = interfaceC1131559d2;
            this.A03 = null;
        }
        if (interfaceC1131659e2 != null) {
            int A002 = Constraints.A00(A04);
            AbstractC119735bX abstractC119735bX2 = AbstractC28419CgQ.A01;
            interfaceC1131659e2.Cpe(interfaceC1131659e2.Cph(A002));
            if (interfaceC1131659e2 instanceof InterfaceC1131559d) {
                interfaceC1131559d = (InterfaceC1131559d) interfaceC1131659e2;
            } else {
                interfaceC1131559d = null;
            }
            this.A00 = interfaceC1131559d;
            this.A02 = null;
        }
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FlowLayoutOverflowState(type=");
        if (this.A04.intValue() != 0) {
            str = "Clip";
        } else {
            str = "Visible";
        }
        A1C.append(str);
        A1C.append(", minLinesToShowCollapse=");
        A1C.append(0);
        A1C.append(", minCrossAxisSizeToShowCollapse=");
        return AbstractC25236BEt.A0Z(A1C, 0);
    }
}
