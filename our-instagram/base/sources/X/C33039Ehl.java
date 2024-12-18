package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ehl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33039Ehl extends C17T implements InterfaceC81773kp {
    @Override // X.InterfaceC81773kp
    public final List B2G() {
        return A0o(-2102114367, C33019EhN.class);
    }

    @Override // X.InterfaceC81773kp
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC31219Do2.A00(this));
    }

    @Override // X.InterfaceC81773kp
    public final String BkX() {
        return A0h(503586532);
    }

    @Override // X.InterfaceC81773kp
    public final C81763ko F3L() {
        List B2G = B2G();
        ArrayList A0q = AbstractC167017dG.A0q(B2G);
        Iterator it = B2G.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC81933lD) it.next()).Evu());
        }
        return new C81763ko(A0q, A0h(503586532));
    }
}
