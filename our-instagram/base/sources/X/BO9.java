package X;

import android.view.View;

/* loaded from: classes5.dex */
public final class BO9 implements View.OnLayoutChangeListener {
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        AbstractC25234BEr.A0s(view, AbstractC166987dD.A0C(AbstractC166997dE.A0L(view), 16), view.getHeight());
    }
}
