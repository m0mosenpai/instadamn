package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.C0k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27247C0k extends C17T implements InterfaceC107774tM {
    @Override // X.InterfaceC107774tM
    public final List AZh() {
        return A08(-1230769638, C27246C0j.class);
    }

    @Override // X.InterfaceC107774tM
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, BFN.A00(this));
    }

    @Override // X.InterfaceC107774tM
    public final C107764tL EuA() {
        ArrayList arrayList;
        List AZh = AZh();
        if (AZh != null) {
            arrayList = AbstractC167017dG.A0q(AZh);
            Iterator it = AZh.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC107754tK) it.next()).Eu9());
            }
        } else {
            arrayList = null;
        }
        return new C107764tL(arrayList);
    }
}
