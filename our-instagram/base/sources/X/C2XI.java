package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.2XI, reason: invalid class name */
/* loaded from: classes.dex */
public class C2XI {
    public Object A00;
    public final java.util.Set A01 = new CopyOnWriteArraySet();

    public final void A00(Object obj) {
        Object obj2 = this.A00;
        if (obj2 != obj && !C14360o3.A0K(obj2, obj)) {
            this.A00 = obj;
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                ((InterfaceC51122Wi) it.next()).DyX(this);
            }
        }
    }

    public C2XI(Object obj) {
        this.A00 = obj;
    }
}
