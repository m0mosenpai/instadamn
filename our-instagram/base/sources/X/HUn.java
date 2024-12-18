package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HUn extends C17T implements JK0 {
    public List A00;

    @Override // X.JK0
    public final List C3x() {
        List list = this.A00;
        if (list == null) {
            return A08(-1525319953, HWP.class);
        }
        return list;
    }

    @Override // X.JK0
    public final JK0 EAv(C1DY c1dy) {
        ArrayList arrayList;
        List<C47N> C3x = C3x();
        if (C3x != null) {
            arrayList = AbstractC167017dG.A0q(C3x);
            for (C47N c47n : C3x) {
                c47n.EBf(c1dy);
                arrayList.add(c47n);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.JK0
    public final H6N F2Z(C1DY c1dy) {
        ArrayList arrayList;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1947593954);
        String A0i = A0i(612715144);
        String A0i2 = A0i(-395861750);
        String A0k = AbstractC37301Gc2.A0k(this);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(1074687995);
        List C3x = C3x();
        if (C3x != null) {
            arrayList = AbstractC167017dG.A0q(C3x);
            Iterator it = C3x.iterator();
            while (it.hasNext()) {
                arrayList.add(((C47N) it.next()).F5V(c1dy));
            }
        } else {
            arrayList = null;
        }
        return new H6N(optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, A0i, A0i2, A0k, A0Y(), A0i(-717979291), arrayList);
    }
}
