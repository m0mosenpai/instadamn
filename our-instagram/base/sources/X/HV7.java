package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HV7 extends C17T implements InterfaceC99414dE {
    public List A00;

    @Override // X.InterfaceC99414dE
    public final List B8X() {
        List list = this.A00;
        if (list == null) {
            return A08(381249571, HV6.class);
        }
        return list;
    }

    @Override // X.InterfaceC99414dE
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40397Hvk.A00(this));
    }

    @Override // X.InterfaceC99414dE
    public final InterfaceC99414dE EB4(C1DY c1dy) {
        ArrayList arrayList;
        List<JMW> B8X = B8X();
        if (B8X != null) {
            arrayList = AbstractC167017dG.A0q(B8X);
            for (JMW jmw : B8X) {
                jmw.EB3(c1dy);
                arrayList.add(jmw);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.InterfaceC99414dE
    public final C38792H6h F32(C1DY c1dy) {
        ArrayList arrayList;
        List B8X = B8X();
        if (B8X != null) {
            arrayList = AbstractC167017dG.A0q(B8X);
            Iterator it = B8X.iterator();
            while (it.hasNext()) {
                arrayList.add(((JMW) it.next()).F30(c1dy));
            }
        } else {
            arrayList = null;
        }
        return new C38792H6h(arrayList);
    }

    @Override // X.InterfaceC99414dE
    public final C38792H6h F33(C1DV c1dv) {
        return F32(AbstractC37304Gc5.A09(c1dv));
    }
}
