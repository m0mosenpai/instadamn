package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HWH extends C17T implements InterfaceC43565JLz {
    @Override // X.InterfaceC43565JLz
    public final List Ac6() {
        return A08(-847398795, HUt.class);
    }

    @Override // X.InterfaceC43565JLz
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I2Z.A00(this));
    }

    @Override // X.InterfaceC43565JLz
    public final String BjI() {
        return A0h(111948);
    }

    @Override // X.InterfaceC43565JLz
    public final Integer C9w() {
        return getOptionalIntValueByHashCode(1047317644);
    }

    @Override // X.InterfaceC43565JLz
    public final String CBn() {
        return A0h(3575610);
    }

    @Override // X.InterfaceC43565JLz
    public final H7Z F5K() {
        ArrayList arrayList;
        List Ac6 = Ac6();
        if (Ac6 != null) {
            arrayList = AbstractC167017dG.A0q(Ac6);
            Iterator it = Ac6.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43541JLb) it.next()).F2f());
            }
        } else {
            arrayList = null;
        }
        return new H7Z(getOptionalIntValueByHashCode(1047317644), A0h(111948), A0S(), A0h(3575610), arrayList);
    }

    @Override // X.InterfaceC43565JLz
    public final String getTitle() {
        return A0S();
    }
}
