package X;

import android.view.View;

/* renamed from: X.ASy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnLayoutChangeListenerC23263ASy implements View.OnLayoutChangeListener {
    public final /* synthetic */ C190398bx A00;

    public ViewOnLayoutChangeListenerC23263ASy(C190398bx c190398bx) {
        this.A00 = c190398bx;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C190398bx c190398bx = this.A00;
        c190398bx.A1K.removeOnLayoutChangeListener(this);
        C190398bx.A0E(c190398bx);
    }
}
