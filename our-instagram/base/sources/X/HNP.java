package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HNP extends C17T implements JJL {
    public List A00;
    public List A01;

    @Override // X.JJL
    public final JJL E8m(C1DY c1dy) {
        ArrayList arrayList;
        List list = this.A00;
        if (list == null) {
            list = A08(1969903821, C37982GnP.class);
        }
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1G(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        List list2 = this.A01;
        if (list2 != null || (list2 = A08(1973704552, C37982GnP.class)) != null) {
            arrayList2 = AbstractC167007dF.A0i(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                AbstractC37304Gc5.A1G(c1dy, arrayList2, it2);
            }
        }
        this.A01 = arrayList2;
        return this;
    }

    @Override // X.JJL
    public final C26123Bh8 Era(C1DY c1dy) {
        ArrayList arrayList;
        String A0h = A0h(1253013930);
        String A0h2 = A0h(-1076648986);
        String A0h3 = AbstractC37304Gc5.A0h(this);
        List list = this.A00;
        if (list == null) {
            list = A08(1969903821, C37982GnP.class);
        }
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1C(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        List list2 = this.A01;
        if (list2 != null || (list2 = A08(1973704552, C37982GnP.class)) != null) {
            arrayList2 = AbstractC167007dF.A0i(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                AbstractC37304Gc5.A1C(c1dy, arrayList2, it2);
            }
        }
        return new C26123Bh8(A0h, A0h2, A0h3, A0h(-1773366604), arrayList, arrayList2);
    }
}
