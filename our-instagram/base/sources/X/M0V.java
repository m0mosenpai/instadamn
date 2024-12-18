package X;

import android.view.ViewGroup;

/* loaded from: classes8.dex */
public final class M0V implements Runnable {
    public final /* synthetic */ KCY A00;

    public M0V(KCY kcy) {
        this.A00 = kcy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = this.A00.A08;
        if (viewGroup != null) {
            AbstractC43594JPz.A18(viewGroup, this);
        }
    }
}
