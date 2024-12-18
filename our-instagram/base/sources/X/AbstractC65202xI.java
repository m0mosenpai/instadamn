package X;

import java.util.Iterator;

/* renamed from: X.2xI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC65202xI extends AbstractC65212xJ {
    public final InterfaceC65342xW A00;

    public AbstractC65202xI(C61742rb c61742rb, InterfaceC65342xW interfaceC65342xW, boolean z, boolean z2) {
        super(c61742rb, z, z2);
        this.A00 = interfaceC65342xW;
        if (z) {
            Iterator EWm = interfaceC65342xW.EWm(this);
            int i = 0;
            while (EWm.hasNext()) {
                Object next = EWm.next();
                if (next != null) {
                    C61742rb.A00(c61742rb, next, i);
                    i++;
                }
            }
        }
    }
}
