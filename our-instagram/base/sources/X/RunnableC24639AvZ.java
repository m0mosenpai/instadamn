package X;

import android.view.View;

/* renamed from: X.AvZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24639AvZ implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C208769Lk A01;

    public RunnableC24639AvZ(View view, C208769Lk c208769Lk) {
        this.A01 = c208769Lk;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C208769Lk c208769Lk = this.A01;
        View view = this.A00;
        view.setVisibility(0);
        view.animate().cancel();
        view.setAlpha(0.15f);
        view.animate().alpha(0.0f).setDuration(1000L).withEndAction(new RunnableC24640Ava(view, c208769Lk)).start();
    }
}
