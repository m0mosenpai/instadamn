package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.03O, reason: invalid class name */
/* loaded from: classes.dex */
public final class C03O implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewTreeObserver A00;
    public final View A01;
    public final Runnable A02;

    public static C03O A00(View view, Runnable runnable) {
        if (view != null) {
            C03O c03o = new C03O(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(c03o);
            view.addOnAttachStateChangeListener(c03o);
            return c03o;
        }
        throw new NullPointerException("view == null");
    }

    public final void A01() {
        ViewTreeObserver viewTreeObserver;
        if (this.A00.isAlive()) {
            viewTreeObserver = this.A00;
        } else {
            viewTreeObserver = this.A01.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        this.A01.removeOnAttachStateChangeListener(this);
    }

    public C03O(View view, Runnable runnable) {
        this.A01 = view;
        this.A00 = view.getViewTreeObserver();
        this.A02 = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        A01();
        this.A02.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A00 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        A01();
    }
}
