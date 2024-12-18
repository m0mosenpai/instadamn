package X;

import android.view.View;

/* renamed from: X.WsY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71363WsY implements Runnable {
    public final /* synthetic */ W9A A00;

    public RunnableC71363WsY(W9A w9a) {
        this.A00 = w9a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W9A w9a = this.A00;
        C66303U8b c66303U8b = w9a.A07;
        View view = w9a.A05;
        c66303U8b.setBounds(0, 0, view.getWidth(), view.getHeight());
        Runnable runnable = w9a.A02;
        if (runnable != null) {
            runnable.run();
        }
        w9a.A02 = null;
    }
}
