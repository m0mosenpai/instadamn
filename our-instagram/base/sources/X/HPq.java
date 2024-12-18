package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HPq extends C17T implements InterfaceC108024tl {
    @Override // X.InterfaceC108024tl
    public final List Aqc() {
        return A08(1837147387, C39221HPm.class);
    }

    @Override // X.InterfaceC108024tl
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39985HoQ.A00(this));
    }

    @Override // X.InterfaceC108024tl
    public final Boolean B0C() {
        return getOptionalBooleanValueByHashCode(1761556171);
    }

    @Override // X.InterfaceC108024tl
    public final String BKx() {
        return A0i(102727412);
    }

    @Override // X.InterfaceC108024tl
    public final List BZN() {
        return getOptionalStringListByHashCode(-1249474914);
    }

    @Override // X.InterfaceC108024tl
    public final Integer Bjg() {
        return getOptionalIntValueByHashCode(-1030321165);
    }

    @Override // X.InterfaceC108024tl
    public final C108014tk Eup() {
        ArrayList arrayList;
        List Aqc = Aqc();
        if (Aqc != null) {
            arrayList = AbstractC167017dG.A0q(Aqc);
            Iterator it = Aqc.iterator();
            while (it.hasNext()) {
                arrayList.add(((JLQ) it.next()).Euk());
            }
        } else {
            arrayList = null;
        }
        String A0h = AbstractC37304Gc5.A0h(this);
        return new C108014tk(getOptionalBooleanValueByHashCode(1761556171), getOptionalIntValueByHashCode(-1030321165), A0h, A0i(102727412), arrayList, getOptionalStringListByHashCode(-1249474914));
    }

    @Override // X.InterfaceC108024tl
    public final String getCtaText() {
        return AbstractC37304Gc5.A0h(this);
    }
}
