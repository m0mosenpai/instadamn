package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HUp extends C17T implements JMO {
    public InterfaceC43562JLw A00;
    public List A01;

    @Override // X.JMO
    public final List BaB() {
        List list = this.A01;
        if (list == null) {
            return A08(-1547473904, HUq.class);
        }
        return list;
    }

    @Override // X.JMO
    public final InterfaceC43562JLw CDq() {
        InterfaceC43562JLw interfaceC43562JLw = this.A00;
        if (interfaceC43562JLw == null) {
            return (InterfaceC43562JLw) A05(339043230, HUq.class);
        }
        return interfaceC43562JLw;
    }

    @Override // X.JMO
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40361Hv7.A00(this));
    }

    @Override // X.JMO
    public final String Alx() {
        return A0j(553933994);
    }

    @Override // X.JMO
    public final Integer C59() {
        return getOptionalIntValueByHashCode(-643954005);
    }

    @Override // X.JMO
    public final String C5f() {
        return A0h(1769642752);
    }

    @Override // X.JMO
    public final JMO EAx(C1DY c1dy) {
        ArrayList arrayList;
        List<InterfaceC43562JLw> BaB = BaB();
        InterfaceC43562JLw interfaceC43562JLw = null;
        if (BaB != null) {
            arrayList = AbstractC167017dG.A0q(BaB);
            for (InterfaceC43562JLw interfaceC43562JLw2 : BaB) {
                interfaceC43562JLw2.EAy(c1dy);
                arrayList.add(interfaceC43562JLw2);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        InterfaceC43562JLw CDq = CDq();
        if (CDq != null) {
            CDq.EAy(c1dy);
            interfaceC43562JLw = CDq;
        }
        this.A00 = interfaceC43562JLw;
        return this;
    }

    @Override // X.JMO
    public final H6O F2b(C1DY c1dy) {
        ArrayList arrayList;
        String A0j = A0j(553933994);
        String A0f = A0f();
        List BaB = BaB();
        H6P h6p = null;
        if (BaB != null) {
            arrayList = AbstractC167017dG.A0q(BaB);
            Iterator it = BaB.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43562JLw) it.next()).F2c(c1dy));
            }
        } else {
            arrayList = null;
        }
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-643954005);
        String A0h = A0h(1769642752);
        InterfaceC43562JLw CDq = CDq();
        if (CDq != null) {
            h6p = CDq.F2c(c1dy);
        }
        return new H6O(h6p, optionalIntValueByHashCode, A0j, A0f, A0h, arrayList);
    }

    @Override // X.JMO
    public final String getMediaId() {
        return A0f();
    }
}
