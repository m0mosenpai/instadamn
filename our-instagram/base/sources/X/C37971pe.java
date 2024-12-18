package X;

import android.database.Observable;

/* renamed from: X.1pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37971pe extends Observable {
    public final void A00() {
        synchronized (((Observable) this).mObservers) {
            int size = ((Observable) this).mObservers.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC37991pg) ((Observable) this).mObservers.get(i)).Cyz();
            }
        }
    }

    public final void A01() {
        synchronized (((Observable) this).mObservers) {
            int size = ((Observable) this).mObservers.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC37991pg) ((Observable) this).mObservers.get(i)).DI6();
            }
        }
    }
}
