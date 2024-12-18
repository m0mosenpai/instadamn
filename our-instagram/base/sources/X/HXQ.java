package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HXQ extends C17T implements InterfaceC43549JLj {
    public List A00;

    @Override // X.InterfaceC43549JLj
    public final List Ayw() {
        List list = this.A00;
        if (list == null) {
            return A08(1550150433, HXP.class);
        }
        return list;
    }

    @Override // X.InterfaceC43549JLj
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I5F.A00(this));
    }

    @Override // X.InterfaceC43549JLj
    public final String BPp() {
        return A0i(-1081138730);
    }

    @Override // X.InterfaceC43549JLj
    public final Boolean BUs() {
        return getOptionalBooleanValueByHashCode(1024940639);
    }

    @Override // X.InterfaceC43549JLj
    public final InterfaceC43549JLj EC2(C1DY c1dy) {
        ArrayList arrayList;
        List<InterfaceC43548JLi> Ayw = Ayw();
        if (Ayw != null) {
            arrayList = AbstractC167017dG.A0q(Ayw);
            for (InterfaceC43548JLi interfaceC43548JLi : Ayw) {
                interfaceC43548JLi.EC1(c1dy);
                arrayList.add(interfaceC43548JLi);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.InterfaceC43549JLj
    public final C38825H7t F6r(C1DY c1dy) {
        ArrayList arrayList;
        List Ayw = Ayw();
        if (Ayw != null) {
            arrayList = AbstractC167017dG.A0q(Ayw);
            Iterator it = Ayw.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43548JLi) it.next()).F6q(c1dy));
            }
        } else {
            arrayList = null;
        }
        return new C38825H7t(getOptionalBooleanValueByHashCode(1024940639), A0i(-1081138730), arrayList);
    }
}
