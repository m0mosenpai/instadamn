package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class LO9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ L4T A00;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public LO9(L4T l4t) {
        this.A00 = l4t;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        MRJ mrj = this.A00.A00;
        if (mrj != null) {
            mrj.DfP();
        }
    }
}
