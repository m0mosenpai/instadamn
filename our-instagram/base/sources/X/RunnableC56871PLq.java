package X;

import android.view.View;

/* renamed from: X.PLq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56871PLq implements Runnable {
    public final /* synthetic */ View A00;

    public RunnableC56871PLq(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC43593JPy.A0E(this.A00.animate(), 1.0f).setDuration(120L).start();
    }
}
