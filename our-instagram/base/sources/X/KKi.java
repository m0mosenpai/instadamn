package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class KKi extends C3PD {
    public final /* synthetic */ View.OnClickListener A00;

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        C14360o3.A0B(view, 0);
        if (!view.isEnabled()) {
            return false;
        }
        view.performHapticFeedback(3);
        this.A00.onClick(view);
        return true;
    }

    public KKi(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }
}
