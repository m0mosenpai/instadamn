package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.TxP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65972TxP {
    public List A00 = new CopyOnWriteArrayList();

    public static final void A00(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("onPost");
        }
    }
}
