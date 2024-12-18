package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HU5 extends C17T implements JMB {
    public List A00;

    @Override // X.JMB
    public final List BbX() {
        List list = this.A00;
        if (list == null) {
            return A08(-1979713632, HU4.class);
        }
        return list;
    }

    @Override // X.JMB
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40315HuK.A00(this));
    }

    @Override // X.JMB
    public final String BPp() {
        return A0i(-1081138730);
    }

    @Override // X.JMB
    public final Boolean BUs() {
        return getOptionalBooleanValueByHashCode(1024940639);
    }

    @Override // X.JMB
    public final String Bjo() {
        return A0j(659010373);
    }

    @Override // X.JMB
    public final JMB EAd(C1DY c1dy) {
        ArrayList arrayList;
        List<InterfaceC43561JLv> BbX = BbX();
        if (BbX != null) {
            arrayList = AbstractC167017dG.A0q(BbX);
            for (InterfaceC43561JLv interfaceC43561JLv : BbX) {
                interfaceC43561JLv.EAc(c1dy);
                arrayList.add(interfaceC43561JLv);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.JMB
    public final C38783H5x F1X(C1DY c1dy) {
        ArrayList arrayList;
        String A0i = A0i(-1081138730);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1024940639);
        List BbX = BbX();
        if (BbX != null) {
            arrayList = AbstractC167017dG.A0q(BbX);
            Iterator it = BbX.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43561JLv) it.next()).F1V(c1dy));
            }
        } else {
            arrayList = null;
        }
        return new C38783H5x(optionalBooleanValueByHashCode, A0i, A0j(659010373), arrayList);
    }

    @Override // X.JMB
    public final C38783H5x F1Y(C1DV c1dv) {
        return F1X(AbstractC25235BEs.A0b(c1dv));
    }
}
