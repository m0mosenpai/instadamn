package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.FPj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34674FPj {
    public final Bundle A00;
    public final ConcurrentLinkedQueue A02 = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A01 = new ConcurrentLinkedQueue();

    /* JADX WARN: Type inference failed for: r1v3, types: [X.GYr, java.lang.Object] */
    public final InterfaceC37154GYr A00() {
        Object obj;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((GXQ) it.next()).Cq8(this.A00);
        }
        Iterator it2 = this.A02.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (((InterfaceC37154GYr) obj).CY3()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC37154GYr interfaceC37154GYr = (InterfaceC37154GYr) obj;
        if (interfaceC37154GYr == null) {
            return new Object();
        }
        return interfaceC37154GYr;
    }

    public C34674FPj(Bundle bundle) {
        this.A00 = bundle;
    }
}
