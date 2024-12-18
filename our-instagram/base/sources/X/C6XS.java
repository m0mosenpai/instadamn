package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6XS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6XS {
    public final List A01 = new ArrayList();
    public final InterfaceC28041Xi A00 = new InterfaceC28041Xi() { // from class: X.6XT
        @Override // X.InterfaceC28041Xi
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            Iterator it = C6XS.this.A01.iterator();
            while (it.hasNext()) {
                if (!((InterfaceC28041Xi) it.next()).apply(obj)) {
                    return false;
                }
            }
            return true;
        }
    };
}
