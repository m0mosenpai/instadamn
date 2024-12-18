package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9op, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220659op extends C17T implements JK2 {
    @Override // X.JK2
    public final List C0d() {
        return A0o(-1635574515, C220609ok.class);
    }

    @Override // X.JK2
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC225859y4.A00(this), this);
    }

    @Override // X.JK2
    public final C211809a7 F4M() {
        List C0d = C0d();
        ArrayList A0q = AbstractC167017dG.A0q(C0d);
        Iterator it = C0d.iterator();
        while (it.hasNext()) {
            A0q.add(((BE5) it.next()).Es9());
        }
        return new C211809a7(A0q);
    }
}
