package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0nY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14080nY {
    public static final List A02 = new ArrayList();
    public static volatile C14080nY A03;
    public final Object A01 = new Object();
    public boolean A00 = false;

    public static C14080nY A00() {
        if (A03 == null) {
            synchronized (C14080nY.class) {
                if (A03 == null) {
                    A03 = new C14080nY();
                }
            }
        }
        return A03;
    }

    public final void A01() {
        Object obj = this.A01;
        synchronized (obj) {
            this.A00 = false;
            obj.notifyAll();
            Iterator it = A02.iterator();
            while (it.hasNext()) {
                ((InterfaceC14070nX) it.next()).DMT();
            }
        }
    }

    public final void A02() {
        synchronized (this.A01) {
            this.A00 = true;
            Iterator it = A02.iterator();
            while (it.hasNext()) {
                ((InterfaceC14070nX) it.next()).DMU();
            }
        }
    }

    public final void A03(long j) {
        Object obj = this.A01;
        synchronized (obj) {
            if (!this.A00) {
                return;
            }
            try {
                obj.wait(j);
            } catch (InterruptedException unused) {
            }
        }
    }
}
