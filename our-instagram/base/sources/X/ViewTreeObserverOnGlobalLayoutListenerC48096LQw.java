package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.LQw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC48096LQw implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C42D A02;

    public ViewTreeObserverOnGlobalLayoutListenerC48096LQw(View view, C42D c42d, float f) {
        this.A01 = view;
        this.A02 = c42d;
        this.A00 = f;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.A01;
        AbstractC166997dE.A1K(view, this);
        C42E.A00(view, this.A00);
    }
}