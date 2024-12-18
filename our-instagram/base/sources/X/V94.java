package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class V94 extends C17T implements InterfaceC72033XFv {
    @Override // X.InterfaceC72033XFv
    public final XG4 Aet() {
        return (XG4) A05(-1332194002, C68057V8j.class);
    }

    @Override // X.InterfaceC72033XFv
    public final List Apm() {
        return A08(-602415628, C68058V8k.class);
    }

    @Override // X.InterfaceC72033XFv
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(VPN.A00(this), this);
    }

    @Override // X.InterfaceC72033XFv
    public final URU F44() {
        UR4 ur4;
        XG4 Aet = Aet();
        ArrayList arrayList = null;
        if (Aet != null) {
            ur4 = Aet.Ex6();
        } else {
            ur4 = null;
        }
        List Apm = Apm();
        if (Apm != null) {
            arrayList = AbstractC167017dG.A0q(Apm);
            Iterator it = Apm.iterator();
            while (it.hasNext()) {
                arrayList.add(((XG9) it.next()).Ex7());
            }
        }
        return new URU(ur4, arrayList);
    }
}
