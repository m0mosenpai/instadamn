package X;

import android.view.ViewGroup;

/* loaded from: classes9.dex */
public final class PMP implements Runnable {
    public final /* synthetic */ ViewGroup A00;

    public PMP(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.requestLayout();
    }
}
