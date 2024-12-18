package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HPg extends C17T implements InterfaceC43506JJs {
    @Override // X.InterfaceC43506JJs
    public final List AiQ() {
        return A0o(-1712747135, HNH.class);
    }

    @Override // X.InterfaceC43506JJs
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39976HoE.A00(this));
    }

    @Override // X.InterfaceC43506JJs
    public final C38246Grp Eud() {
        List AiQ = AiQ();
        ArrayList A0q = AbstractC167017dG.A0q(AiQ);
        Iterator it = AiQ.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC43502JJo) it.next()).ErR());
        }
        return new C38246Grp(A0q);
    }
}
