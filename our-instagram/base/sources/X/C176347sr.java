package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.7sr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176347sr {
    public CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();

    public final void A00() {
        if (!this.A00.isEmpty()) {
            C176567tE.A00(new Runnable() { // from class: X.7v7
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it = C176347sr.this.A00.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC174727q7) it.next()).Do5();
                    }
                }
            });
        }
    }

    public final Object clone() {
        throw new CloneNotSupportedException("CameraLifecycleNotifier is a singleton and cannot be cloned!");
    }
}
