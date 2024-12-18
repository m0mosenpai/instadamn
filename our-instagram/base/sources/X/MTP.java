package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class MTP implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AbstractC1127657i A00;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public MTP(AbstractC1127657i abstractC1127657i) {
        this.A00 = abstractC1127657i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AbstractC1127657i abstractC1127657i = this.A00;
        if (!AbstractC105064oM.A02(abstractC1127657i)) {
            abstractC1127657i.A05();
        }
    }
}
