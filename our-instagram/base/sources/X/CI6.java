package X;

import java.util.List;

/* loaded from: classes5.dex */
public abstract class CI6 {
    public static final void A00(C6Nu c6Nu, InterfaceC30819Dgu interfaceC30819Dgu, C6R c6r, int i) {
        int ordinal;
        InterfaceC16610sE interfaceC16610sE;
        if (c6r != null && (ordinal = c6r.ordinal()) != -1) {
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 1) {
                        throw B4Z.A00();
                    }
                } else {
                    interfaceC16610sE = AbstractC27793CNi.A01;
                }
            } else {
                interfaceC16610sE = AbstractC27793CNi.A00;
            }
            c6Nu.CgH(null, interfaceC16610sE);
            return;
        }
        AbstractC25227BEk.A13(c6Nu, new C30517Dc0(i, 3), -124400139);
        if (interfaceC30819Dgu instanceof C26199BiP) {
            List list = ((C26199BiP) interfaceC30819Dgu).A00;
            DNT dnt = DNT.A00;
            DNS dns = DNS.A00;
            AbstractC25227BEk.A15(c6Nu, new C30750Dfn(list, 14), new C30183DRo(38, list, (InterfaceC16660sJ) dnt), new C30183DRo(39, list, (InterfaceC16660sJ) dns), list.size());
            return;
        }
        if (!(interfaceC30819Dgu instanceof C26200BiQ)) {
            return;
        }
        AbstractC25227BEk.A13(c6Nu, C30715DfD.A00(interfaceC30819Dgu, 5), -1473792903);
    }
}
