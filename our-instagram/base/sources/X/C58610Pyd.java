package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Pyd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58610Pyd implements AnonymousClass622 {
    public static AtomicReference A00 = new AtomicReference();

    @Override // X.AnonymousClass622
    public final void Cz3(boolean z) {
        synchronized (C63342Shx.A09) {
            Iterator it = AbstractC31180DnO.A0n(C63342Shx.A0A).iterator();
            while (it.hasNext()) {
                C63342Shx c63342Shx = (C63342Shx) it.next();
                if (c63342Shx.A06.get()) {
                    Iterator it2 = c63342Shx.A05.iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        throw AbstractC166987dD.A15("onBackgroundStateChanged");
                    }
                }
            }
        }
    }
}
