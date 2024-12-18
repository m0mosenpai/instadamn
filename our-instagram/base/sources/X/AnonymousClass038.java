package X;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.038, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass038 {
    public final Runnable A00;
    public final CopyOnWriteArrayList A02 = new CopyOnWriteArrayList();
    public final Map A01 = new HashMap();

    public final void A00(Menu menu) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C10750hj) ((C03F) it.next())).A00.A13(menu);
        }
    }

    public final void A01(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C10750hj) ((C03F) it.next())).A00.A14(menu, menuInflater);
        }
    }

    public final void A02(C03F c03f) {
        this.A02.remove(c03f);
        AnonymousClass037 anonymousClass037 = (AnonymousClass037) this.A01.remove(c03f);
        if (anonymousClass037 != null) {
            anonymousClass037.A01.A0A(anonymousClass037.A00);
            anonymousClass037.A00 = null;
        }
        this.A00.run();
    }

    public final boolean A03(MenuItem menuItem) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            if (((C10750hj) ((C03F) it.next())).A00.A16(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass038(Runnable runnable) {
        this.A00 = runnable;
    }
}
