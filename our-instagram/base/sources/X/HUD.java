package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HUD extends C17T implements JMN {
    public List A00;

    @Override // X.JMN
    public final List CH6() {
        List list = this.A00;
        if (list == null) {
            return A08(-810660181, HXX.class);
        }
        return list;
    }

    @Override // X.JMN
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40323HuT.A00(this));
    }

    @Override // X.JMN
    public final Integer BME() {
        return getOptionalIntValueByHashCode(-651789604);
    }

    @Override // X.JMN
    public final String BPp() {
        return A0i(-1081138730);
    }

    @Override // X.JMN
    public final Boolean BUs() {
        return getOptionalBooleanValueByHashCode(1024940639);
    }

    @Override // X.JMN
    public final JMN EAk(C1DY c1dy) {
        ArrayList arrayList;
        List<InterfaceC43550JLk> CH6 = CH6();
        if (CH6 != null) {
            arrayList = AbstractC167017dG.A0q(CH6);
            for (InterfaceC43550JLk interfaceC43550JLk : CH6) {
                interfaceC43550JLk.ECA(c1dy);
                arrayList.add(interfaceC43550JLk);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.JMN
    public final H64 F1o(C1DY c1dy) {
        ArrayList arrayList;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-651789604);
        String A0i = A0i(-1081138730);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1024940639);
        String A0j = A0j(-795590343);
        List CH6 = CH6();
        if (CH6 != null) {
            arrayList = AbstractC167017dG.A0q(CH6);
            Iterator it = CH6.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43550JLk) it.next()).F76(c1dy));
            }
        } else {
            arrayList = null;
        }
        return new H64(optionalBooleanValueByHashCode, optionalIntValueByHashCode, A0i, A0j, arrayList);
    }

    @Override // X.JMN
    public final H64 F1p(C1DV c1dv) {
        return F1o(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.JMN
    public final String getSliderId() {
        return A0j(-795590343);
    }
}
