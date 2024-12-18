package X;

import android.view.ViewTreeObserver;
import android.view.Window;

/* renamed from: X.Fpr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC35717Fpr implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Window A01;
    public final /* synthetic */ C189478aR A02;

    public ViewTreeObserverOnGlobalLayoutListenerC35717Fpr(Window window, C189478aR c189478aR, int i) {
        this.A02 = c189478aR;
        this.A00 = i;
        this.A01 = window;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.A02.A03.A0S(this.A00);
        AbstractC166997dE.A1K(this.A01.getDecorView(), this);
    }
}
