package X;

import android.view.View;

/* renamed from: X.Aum, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24591Aum implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ABE A01;

    public RunnableC24591Aum(View view, ABE abe) {
        this.A01 = abe;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        view.setHapticFeedbackEnabled(true);
        view.performHapticFeedback(1);
    }
}
