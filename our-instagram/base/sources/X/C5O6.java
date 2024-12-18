package X;

import android.app.Activity;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.5O6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5O6 implements C5O5 {
    public final C5O5 A02;
    public final ReentrantLock A01 = new ReentrantLock();
    public final WeakHashMap A00 = new WeakHashMap();

    @Override // X.C5O5
    public final void E26(Activity activity, C4PX c4px) {
        C14360o3.A0B(activity, 0);
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            WeakHashMap weakHashMap = this.A00;
            if (C14360o3.A0K(c4px, (C4PX) weakHashMap.get(activity))) {
                return;
            }
            weakHashMap.put(activity, c4px);
            reentrantLock.unlock();
            this.A02.E26(activity, c4px);
        } finally {
            reentrantLock.unlock();
        }
    }

    public C5O6(C5O5 c5o5) {
        this.A02 = c5o5;
    }
}
