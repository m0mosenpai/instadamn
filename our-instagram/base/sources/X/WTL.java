package X;

/* loaded from: classes11.dex */
public final class WTL implements InterfaceC71885X8s {
    public final /* synthetic */ C1338462s A00;
    public final /* synthetic */ InterfaceC103384lE A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ InterfaceC103384lE A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16660sJ A05;

    public WTL(C1338462s c1338462s, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, InterfaceC103384lE interfaceC103384lE3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A03 = interfaceC103384lE;
        this.A00 = c1338462s;
        this.A04 = interfaceC16820sZ;
        this.A05 = interfaceC16660sJ;
        this.A02 = interfaceC103384lE2;
        this.A01 = interfaceC103384lE3;
    }

    @Override // X.InterfaceC71885X8s
    public final boolean D1l(Integer num) {
        InterfaceC103384lE interfaceC103384lE;
        C14360o3.A0B(num, 0);
        int intValue = num.intValue();
        try {
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue != 1 || (interfaceC103384lE = this.A01) == null) {
                        return false;
                    }
                    C6FP.A03((C6FG) this.A04.invoke(), this.A00.A02, C6FW.A01, interfaceC103384lE);
                } else {
                    InterfaceC103384lE interfaceC103384lE2 = this.A02;
                    if (interfaceC103384lE2 == null) {
                        return false;
                    }
                    C6FP.A03((C6FG) this.A04.invoke(), this.A00.A02, C6FW.A01, interfaceC103384lE2);
                }
            } else {
                InterfaceC103384lE interfaceC103384lE3 = this.A03;
                if (interfaceC103384lE3 == null) {
                    return false;
                }
                C6FP.A03((C6FG) this.A04.invoke(), this.A00.A02, C6FW.A01, interfaceC103384lE3);
            }
        } catch (Throwable th) {
            this.A05.invoke(th);
        }
        return true;
    }
}
