package X;

import android.view.View;

/* renamed from: X.PNv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56928PNv implements Runnable {
    public final /* synthetic */ View A00;

    public RunnableC56928PNv(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.bringToFront();
    }
}
