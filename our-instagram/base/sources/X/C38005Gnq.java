package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoUserTagInfoDict;
import com.instagram.api.schemas.UserTagInfoDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gnq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38005Gnq extends C17T implements InterfaceC84523py {
    public List A00;

    @Override // X.InterfaceC84523py
    public final List CIr() {
        List list = this.A00;
        if (list == null) {
            return A0o(3365, ImmutablePandoUserTagInfoDict.class);
        }
        return list;
    }

    @Override // X.InterfaceC84523py
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37370GdC.A00(this));
    }

    @Override // X.InterfaceC84523py
    public final InterfaceC84523py EBB(C1DY c1dy) {
        List<UserTagInfoDictIntf> CIr = CIr();
        ArrayList A0q = AbstractC167017dG.A0q(CIr);
        for (UserTagInfoDictIntf userTagInfoDictIntf : CIr) {
            userTagInfoDictIntf.EBA(c1dy);
            A0q.add(userTagInfoDictIntf);
        }
        this.A00 = A0q;
        return this;
    }

    @Override // X.InterfaceC84523py
    public final C84513px F3h(C1DY c1dy) {
        List CIr = CIr();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(CIr, 10));
        Iterator it = CIr.iterator();
        while (it.hasNext()) {
            arrayList.add(((UserTagInfoDictIntf) it.next()).F3g(c1dy));
        }
        return new C84513px(arrayList);
    }

    @Override // X.InterfaceC84523py
    public final C84513px F3i(C1DV c1dv) {
        return F3h(AbstractC25235BEs.A0b(c1dv));
    }
}
