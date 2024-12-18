package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162907Rb {
    public final List A00;

    public C162907Rb(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final void A00(Object obj) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C7QB) it.next()).D8a(obj);
        }
    }

    public final void A01(Object obj) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C7QB) it.next()).Dw5(obj);
        }
    }

    public final void A02(Object obj, Object obj2) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C7QB) it.next()).CzN(obj, obj2);
        }
    }
}
