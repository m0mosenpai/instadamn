package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7x3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178917x3 {
    public static final List A00 = new ArrayList();

    public static synchronized C178927x4 A00(int i) {
        C178927x4 A01;
        synchronized (C178917x3.class) {
            A01 = A01(null, i);
        }
        return A01;
    }

    public static synchronized C178927x4 A01(Object obj, int i) {
        C178927x4 c178927x4;
        synchronized (C178917x3.class) {
            c178927x4 = new C178927x4(obj, i);
            A00.add(new WeakReference(c178927x4));
        }
        return c178927x4;
    }

    public static synchronized InterfaceC178897x1 A02() {
        synchronized (C178917x3.class) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                InterfaceC178897x1 interfaceC178897x1 = (InterfaceC178897x1) ((WeakReference) it.next()).get();
                if (interfaceC178897x1 == null) {
                    it.remove();
                } else if (interfaceC178897x1.CS8()) {
                    return interfaceC178897x1;
                }
            }
            return null;
        }
    }
}
