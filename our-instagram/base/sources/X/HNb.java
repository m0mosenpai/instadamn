package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HNb extends C17T implements C5HF {
    @Override // X.C5HF
    public final List Act() {
        return A0o(-1707992949, HNc.class);
    }

    @Override // X.C5HF
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39810HlK.A00(this));
    }

    @Override // X.C5HF
    public final C5HE Err() {
        List Act = Act();
        ArrayList A0q = AbstractC167017dG.A0q(Act);
        Iterator it = Act.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC43553JLn) it.next()).Ers());
        }
        return new C5HE(A0q);
    }
}
