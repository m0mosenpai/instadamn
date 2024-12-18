package X;

import android.view.View;

/* renamed from: X.0mw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC13700mw implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener {
    public final Runnable A00;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C14360o3.A0B(view, 0);
        view.removeOnLayoutChangeListener(this);
        view.removeOnAttachStateChangeListener(this);
        this.A00.run();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C14360o3.A0B(view, 0);
        view.removeOnLayoutChangeListener(this);
        view.removeOnAttachStateChangeListener(this);
    }

    public ViewOnAttachStateChangeListenerC13700mw(Runnable runnable) {
        this.A00 = runnable;
    }
}
