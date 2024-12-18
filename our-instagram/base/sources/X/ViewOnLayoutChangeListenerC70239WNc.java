package X;

import android.view.View;

/* renamed from: X.WNc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnLayoutChangeListenerC70239WNc implements View.OnLayoutChangeListener {
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        view.requestApplyInsets();
    }
}
