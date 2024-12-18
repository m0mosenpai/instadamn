package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HRl extends C17T implements JL1 {
    @Override // X.JL1
    public final List C5D() {
        return A0o(-1543665910, HRm.class);
    }

    @Override // X.JL1
    public final H4X Ey2() {
        String A0h = A0h(3355);
        List C5D = C5D();
        ArrayList A0q = AbstractC167017dG.A0q(C5D);
        Iterator it = C5D.iterator();
        while (it.hasNext()) {
            A0q.add(((JL2) it.next()).Ey3());
        }
        return new H4X(A0h, A0X(), A0q);
    }

    @Override // X.JL1
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40147HrG.A00(this));
    }

    @Override // X.JL1
    public final String getId() {
        return A0h(3355);
    }

    @Override // X.JL1
    public final String getText() {
        return A0X();
    }
}
