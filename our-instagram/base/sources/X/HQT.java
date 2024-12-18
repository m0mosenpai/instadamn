package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HQT extends C17T implements InterfaceC104994oF {
    @Override // X.InterfaceC104994oF
    public final List BWD() {
        return A08(-225550348, HQF.class);
    }

    @Override // X.InterfaceC104994oF
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, Hp4.A00(this));
    }

    @Override // X.InterfaceC104994oF
    public final C38732H3v EvW() {
        ArrayList arrayList;
        List BWD = BWD();
        if (BWD != null) {
            arrayList = AbstractC167017dG.A0q(BWD);
            Iterator it = BWD.iterator();
            while (it.hasNext()) {
                arrayList.add(((JM5) it.next()).EvG());
            }
        } else {
            arrayList = null;
        }
        return new C38732H3v(arrayList);
    }
}
