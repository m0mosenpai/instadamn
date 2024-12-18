package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HUY extends C17T implements InterfaceC43513JJz {
    @Override // X.InterfaceC43513JJz
    public final List AdQ() {
        return A0o(-1016430636, HUX.class);
    }

    @Override // X.InterfaceC43513JJz
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40340Huk.A00(this));
    }

    @Override // X.InterfaceC43513JJz
    public final H6D F2E() {
        List AdQ = AdQ();
        ArrayList A0q = AbstractC167017dG.A0q(AdQ);
        Iterator it = AdQ.iterator();
        while (it.hasNext()) {
            A0q.add(((JL9) it.next()).F2C());
        }
        return new H6D(A0q);
    }
}
