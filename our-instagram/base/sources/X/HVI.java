package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HVI extends C17T implements InterfaceC43520JKg {
    @Override // X.InterfaceC43520JKg
    public final List B2G() {
        return A08(-2102114367, HVA.class);
    }

    @Override // X.InterfaceC43520JKg
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40417Hw5.A00(this));
    }

    @Override // X.InterfaceC43520JKg
    public final C38801H6q F3J() {
        ArrayList arrayList;
        List B2G = B2G();
        if (B2G != null) {
            arrayList = AbstractC167017dG.A0q(B2G);
            Iterator it = B2G.iterator();
            while (it.hasNext()) {
                arrayList.add(((JLA) it.next()).F37());
            }
        } else {
            arrayList = null;
        }
        return new C38801H6q(arrayList, A0P());
    }

    @Override // X.InterfaceC43520JKg
    public final String getText() {
        return A0P();
    }
}
