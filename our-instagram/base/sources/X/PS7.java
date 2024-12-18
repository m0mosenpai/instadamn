package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class PS7 implements Runnable {
    public final /* synthetic */ C51732MtD A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ java.util.Set A02;

    public PS7(C51732MtD c51732MtD, List list, java.util.Set set) {
        this.A01 = list;
        this.A02 = set;
        this.A00 = c51732MtD;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC58273PsR interfaceC58273PsR;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AbstractC166987dD.A1Y(it.next());
        }
        java.util.Set<InterfaceC57797PkP> set = this.A02;
        C51732MtD c51732MtD = this.A00;
        for (InterfaceC57797PkP interfaceC57797PkP : set) {
            if (interfaceC57797PkP instanceof InterfaceC58273PsR) {
                interfaceC58273PsR = (InterfaceC58273PsR) interfaceC57797PkP;
            } else if (interfaceC57797PkP instanceof C55736Op5) {
                interfaceC58273PsR = ((C55736Op5) interfaceC57797PkP).A00;
                if (interfaceC58273PsR != null) {
                }
            } else {
                if (!(interfaceC57797PkP instanceof InterfaceC58272PsQ) && !(interfaceC57797PkP instanceof C48220LVu)) {
                    throw B4Z.A00();
                }
                throw AbstractC166987dD.A14("Granular subscribers should not be added to subscribersWithDiffs - must be wrapped as ()-> Unit & added to granularSubscriberCallbacks");
            }
            interfaceC58273PsR.CP3(c51732MtD);
        }
    }
}
