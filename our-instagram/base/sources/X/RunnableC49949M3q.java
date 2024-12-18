package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.M3q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49949M3q implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;

    public RunnableC49949M3q(ViewGroup viewGroup, View view) {
        this.A00 = view;
        this.A01 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        AbstractC43593JPy.A19(view);
        this.A01.removeView(view);
        view.setOnTouchListener(null);
    }
}
