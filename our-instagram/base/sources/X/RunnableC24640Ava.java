package X;

import android.view.View;

/* renamed from: X.Ava, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24640Ava implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C208769Lk A01;

    public RunnableC24640Ava(View view, C208769Lk c208769Lk) {
        this.A00 = view;
        this.A01 = c208769Lk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        if (view.getParent() != null) {
            C208769Lk c208769Lk = this.A01;
            c208769Lk.A0C.removeView(view);
            c208769Lk.A0W.offer(view);
        }
    }
}
