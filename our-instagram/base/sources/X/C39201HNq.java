package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HNq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39201HNq extends C17T implements InterfaceC110134xi {
    @Override // X.InterfaceC110134xi
    public final List BsM() {
        return A08(896355159, C39202HNr.class);
    }

    @Override // X.InterfaceC110134xi
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39827Hlb.A00(this));
    }

    @Override // X.InterfaceC110134xi
    public final Long BaN() {
        return A0L(-1174282985);
    }

    @Override // X.InterfaceC110134xi
    public final C110124xh EsB() {
        ArrayList arrayList;
        Long A0L = A0L(-1174282985);
        List BsM = BsM();
        if (BsM != null) {
            arrayList = AbstractC167017dG.A0q(BsM);
            Iterator it = BsM.iterator();
            while (it.hasNext()) {
                arrayList.add(((JKC) it.next()).EsC());
            }
        } else {
            arrayList = null;
        }
        return new C110124xh(A0L, arrayList);
    }
}
