package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class QJn extends AbstractC219814y {
    public static final AtomicBoolean A00 = AbstractC166997dE.A17();

    @Override // X.AbstractC219814y
    public final void A04() {
        Object obj;
        InterfaceC65540TmD interfaceC65540TmD = S9Z.A00;
        if (interfaceC65540TmD != C63986SxG.A00) {
            if (C0Hi.A00) {
                obj = S9Z.A02[5];
            } else {
                obj = S9Z.A03[5];
            }
            if (obj != null && S9Z.A01.getAndSet(false)) {
                interfaceC65540TmD.notAsBadTimeToDoGc();
            }
        }
    }

    @Override // X.AbstractC219814y
    public final boolean A05() {
        Object obj;
        InterfaceC65204Tfn interfaceC65204Tfn;
        InterfaceC65540TmD interfaceC65540TmD = S9Z.A00;
        if (interfaceC65540TmD != C63986SxG.A00) {
            boolean z = C0Hi.A00;
            if (z) {
                obj = S9Z.A02[5];
            } else {
                obj = S9Z.A03[5];
            }
            if (obj != null && !S9Z.A01.getAndSet(true)) {
                if (z) {
                    interfaceC65204Tfn = S9Z.A02[5];
                } else {
                    interfaceC65204Tfn = S9Z.A03[5];
                }
                if (interfaceC65204Tfn != null) {
                    interfaceC65204Tfn.toString();
                    interfaceC65540TmD.badTimeToDoGc(interfaceC65204Tfn);
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // X.AbstractC219814y, X.InterfaceC219914z
    public final int AhK() {
        return 3;
    }
}
