package X;

import android.view.View;

/* renamed from: X.OkU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnLayoutChangeListenerC55475OkU implements View.OnLayoutChangeListener {
    public static final ViewOnLayoutChangeListenerC55475OkU A00 = new ViewOnLayoutChangeListenerC55475OkU();

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view.getHeight() != i8 - i6) {
            C55081Oab.A00 = view.getHeight();
        }
    }
}
