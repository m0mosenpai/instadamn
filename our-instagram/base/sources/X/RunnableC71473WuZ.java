package X;

import android.view.View;

/* renamed from: X.WuZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71473WuZ implements Runnable {
    public final /* synthetic */ View.OnFocusChangeListener A00;
    public final /* synthetic */ View A01;

    public RunnableC71473WuZ(View.OnFocusChangeListener onFocusChangeListener, View view) {
        this.A01 = view;
        this.A00 = onFocusChangeListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01;
        view.clearFocus();
        view.requestFocus();
        view.setOnFocusChangeListener(this.A00);
    }
}
