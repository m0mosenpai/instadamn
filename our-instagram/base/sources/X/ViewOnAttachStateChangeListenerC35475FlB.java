package X;

import android.view.View;

/* renamed from: X.FlB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC35475FlB implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C35129FeW A00;

    public ViewOnAttachStateChangeListenerC35475FlB(C35129FeW c35129FeW) {
        this.A00 = c35129FeW;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        GZC gzc = this.A00.A09;
        if (gzc != null) {
            gzc.Dm8();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        GZC gzc = this.A00.A09;
        if (gzc != null) {
            gzc.DB6();
        }
    }
}
