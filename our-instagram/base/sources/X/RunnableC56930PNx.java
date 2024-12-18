package X;

import android.view.View;

/* renamed from: X.PNx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56930PNx implements Runnable {
    public final /* synthetic */ View A00;

    public RunnableC56930PNx(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.bringToFront();
    }
}
