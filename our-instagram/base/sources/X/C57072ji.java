package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ji, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57072ji {
    public boolean A00 = false;
    public final List A01 = new ArrayList();

    public final void A00(View view) {
        Object obj;
        if (this.A00) {
            List<InterfaceC57142jp> list = this.A01;
            for (InterfaceC57142jp interfaceC57142jp : list) {
                if ((interfaceC57142jp instanceof C70840Wi4) && (obj = ((C70840Wi4) interfaceC57142jp).A00.get()) != null && obj == view) {
                    return;
                }
            }
            list.add(new C70840Wi4(view));
        }
    }

    public final void A01(View view) {
        Object obj;
        if (this.A00) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                InterfaceC57142jp interfaceC57142jp = (InterfaceC57142jp) it.next();
                if ((interfaceC57142jp instanceof C70840Wi4) && ((obj = ((C70840Wi4) interfaceC57142jp).A00.get()) == null || obj == view)) {
                    it.remove();
                }
            }
        }
    }
}
