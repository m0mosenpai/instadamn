package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.FaT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34943FaT {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();
    public final AtomicReference A02 = new AtomicReference();
    public final AtomicReference A01 = new AtomicReference();

    public static void A00(C34943FaT c34943FaT, Throwable th) {
        Iterator it;
        CopyOnWriteArrayList copyOnWriteArrayList = c34943FaT.A00;
        synchronized (copyOnWriteArrayList) {
            c34943FaT.A01.set(th);
            it = copyOnWriteArrayList.iterator();
            copyOnWriteArrayList.clear();
        }
        while (it.hasNext()) {
            it.next();
        }
    }
}
