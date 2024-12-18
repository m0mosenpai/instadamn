package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.Tun, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnAttachStateChangeListenerC65830Tun implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewTreeObserver A02;
    public final /* synthetic */ C5SW A03;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC65830Tun(View view, View view2, ViewTreeObserver viewTreeObserver, C5SW c5sw) {
        this.A01 = view;
        this.A02 = viewTreeObserver;
        this.A00 = view2;
        this.A03 = c5sw;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.A01.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = this.A02;
        if (!viewTreeObserver.isAlive()) {
            viewTreeObserver = this.A00.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this.A03);
    }
}
