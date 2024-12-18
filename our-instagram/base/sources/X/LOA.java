package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class LOA implements View.OnAttachStateChangeListener {
    public final /* synthetic */ JV2 A00;

    public LOA(JV2 jv2) {
        this.A00 = jv2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        MRJ mrj = this.A00.A01;
        if (mrj != null) {
            mrj.E0X();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        JV2 jv2 = this.A00;
        MRJ mrj = jv2.A01;
        if (mrj != null) {
            mrj.E0W();
            mrj.DfP();
            jv2.A01 = null;
        }
    }
}
