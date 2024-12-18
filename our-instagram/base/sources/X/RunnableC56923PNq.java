package X;

import android.view.ViewGroup;

/* renamed from: X.PNq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56923PNq implements Runnable {
    public final /* synthetic */ ViewGroup A00;

    public RunnableC56923PNq(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.requestApplyInsets();
    }
}
