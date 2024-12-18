package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class AQ4 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C124005jE A00;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public AQ4(C124005jE c124005jE) {
        this.A00 = c124005jE;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.A00.A04();
        view.removeOnAttachStateChangeListener(this);
    }
}
