package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HPj extends C17T implements InterfaceC39421sN {
    @Override // X.InterfaceC39421sN
    public final C5FV AjI() {
        return (C5FV) A05(1099426255, C39218HPb.class);
    }

    @Override // X.InterfaceC39421sN
    public final C5FW AjN() {
        return (C5FW) A05(-1299739516, HPc.class);
    }

    @Override // X.InterfaceC39421sN
    public final List B15() {
        return A0p(1178408536, C43246J9r.A00);
    }

    @Override // X.InterfaceC39421sN
    public final C5FX BEX() {
        return (C5FX) A05(-1104281475, HPh.class);
    }

    @Override // X.InterfaceC39421sN
    public final List BEb() {
        return A08(796539322, C39219HPk.class);
    }

    @Override // X.InterfaceC39421sN
    public final C5FY BTG() {
        return (C5FY) A05(-812329332, HQ9.class);
    }

    @Override // X.InterfaceC39421sN
    public final C5FZ BTK() {
        return (C5FZ) A05(1975902479, HQB.class);
    }

    @Override // X.InterfaceC39421sN
    public final AnonymousClass536 BiV() {
        return (AnonymousClass536) A05(-1350646880, HQO.class);
    }

    @Override // X.InterfaceC39421sN
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37389GdV.A00(this));
    }

    @Override // X.InterfaceC39421sN
    public final Long BHC() {
        return A0L(-113365898);
    }

    @Override // X.InterfaceC39421sN
    public final C39411sM Euh() {
        C38714H3b c38714H3b;
        C38715H3c c38715H3c;
        C38716H3d c38716H3d;
        ArrayList arrayList;
        C38720H3i c38720H3i;
        C38722H3k c38722H3k;
        C5FV AjI = AjI();
        AnonymousClass535 anonymousClass535 = null;
        if (AjI != null) {
            c38714H3b = AjI.EuW();
        } else {
            c38714H3b = null;
        }
        C5FW AjN = AjN();
        if (AjN != null) {
            c38715H3c = AjN.EuX();
        } else {
            c38715H3c = null;
        }
        List B15 = B15();
        C5FX BEX = BEX();
        if (BEX != null) {
            c38716H3d = BEX.Euf();
        } else {
            c38716H3d = null;
        }
        List BEb = BEb();
        if (BEb != null) {
            arrayList = AbstractC167017dG.A0q(BEb);
            Iterator it = BEb.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43534JKu) it.next()).Eui());
            }
        } else {
            arrayList = null;
        }
        Long A0L = A0L(-113365898);
        C5FY BTG = BTG();
        if (BTG != null) {
            c38720H3i = BTG.Ev9();
        } else {
            c38720H3i = null;
        }
        C5FZ BTK = BTK();
        if (BTK != null) {
            c38722H3k = BTK.EvB();
        } else {
            c38722H3k = null;
        }
        AnonymousClass536 BiV = BiV();
        if (BiV != null) {
            anonymousClass535 = BiV.EvR();
        }
        return new C39411sM(c38714H3b, c38715H3c, c38716H3d, c38720H3i, c38722H3k, anonymousClass535, A0L, B15, arrayList);
    }
}
