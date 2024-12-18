package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HMf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39177HMf extends C17T implements InterfaceC81733ki {
    @Override // X.InterfaceC81733ki
    public final List B9F() {
        return A0o(2081886408, HT6.class);
    }

    @Override // X.InterfaceC81733ki
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37375GdH.A00(this));
    }

    @Override // X.InterfaceC81733ki
    public final int C9n() {
        return getIntValueByHashCode(-407761836);
    }

    @Override // X.InterfaceC81733ki
    public final C81723kh EqZ() {
        List B9F = B9F();
        ArrayList A0q = AbstractC167017dG.A0q(B9F);
        Iterator it = B9F.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC43571JMf) it.next()).Ezq());
        }
        return new C81723kh(A0q, getIntValueByHashCode(-407761836));
    }
}
