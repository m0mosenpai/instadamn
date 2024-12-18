package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HWJ extends C17T implements InterfaceC38121pw {
    public List A00;

    @Override // X.InterfaceC38121pw
    public final List B1N() {
        List list = this.A00;
        if (list == null) {
            return A08(455263097, HWI.class);
        }
        return list;
    }

    @Override // X.InterfaceC38121pw
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40699I2f.A00(this));
    }

    @Override // X.InterfaceC38121pw
    public final InterfaceC38121pw EBc(C1DY c1dy) {
        ArrayList arrayList;
        List<JMY> B1N = B1N();
        if (B1N != null) {
            arrayList = AbstractC167017dG.A0q(B1N);
            for (JMY jmy : B1N) {
                jmy.EBb(c1dy);
                arrayList.add(jmy);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.InterfaceC38121pw
    public final C38111pv F5N(C1DY c1dy) {
        ArrayList arrayList;
        List B1N = B1N();
        if (B1N != null) {
            arrayList = AbstractC167017dG.A0q(B1N);
            Iterator it = B1N.iterator();
            while (it.hasNext()) {
                arrayList.add(((JMY) it.next()).F5L(c1dy));
            }
        } else {
            arrayList = null;
        }
        return new C38111pv(arrayList);
    }
}
