package X;

import java.lang.ref.WeakReference;

/* renamed from: X.J4f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43116J4f implements Runnable {
    public final /* synthetic */ C42663IuK A00;
    public final /* synthetic */ IGC A01;

    public RunnableC43116J4f(C42663IuK c42663IuK, IGC igc) {
        this.A01 = igc;
        this.A00 = c42663IuK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C42663IuK c42663IuK = this.A00;
        if (!c42663IuK.A01) {
            c42663IuK.A01 = true;
            WeakReference weakReference = c42663IuK.A00;
            if (weakReference != null && weakReference.get() != null) {
                VVP.A00((C69304VlC) weakReference.get(), true);
            }
        }
        this.A01.A01.remove(Integer.valueOf(c42663IuK.hashCode()));
    }
}
