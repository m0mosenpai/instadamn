package X;

import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class TJ9 implements Runnable {
    public final WeakReference A00;

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((C58772Q8e) weakReference.get()).A0K = false;
        }
    }

    public TJ9(C58772Q8e c58772Q8e) {
        this.A00 = AbstractC25225BEi.A16(c58772Q8e);
    }
}
