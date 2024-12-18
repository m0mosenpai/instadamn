package X;

import android.view.View;

/* renamed from: X.2jY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC56972jY extends AbstractC56982jZ implements View.OnAttachStateChangeListener {
    public final View A00;

    public ViewOnAttachStateChangeListenerC56972jY(View view) {
        this.A00 = view;
        view.addOnAttachStateChangeListener(this);
        if (this.A00.isAttachedToWindow()) {
            A01();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        A01();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        A02();
    }
}
