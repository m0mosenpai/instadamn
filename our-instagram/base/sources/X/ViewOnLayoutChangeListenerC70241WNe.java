package X;

import android.view.View;

/* renamed from: X.WNe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnLayoutChangeListenerC70241WNe implements View.OnLayoutChangeListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public ViewOnLayoutChangeListenerC70241WNe(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj2;
        this.A03 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.A00 != 0) {
            V4U v4u = (V4U) this.A03;
            int i9 = v4u.A00;
            View view2 = (View) this.A02;
            if (i9 != 0) {
                if (i9 != view2.getHeight()) {
                    V4U.A00(v4u, this.A01 + (view2.getHeight() - v4u.A00));
                } else {
                    return;
                }
            }
            v4u.A00 = view2.getHeight();
            return;
        }
        float min = Math.min(((this.A01 - ((C88W) this.A02).A03.A01) * 0.7f) / (i4 - i2), 1.0f);
        View view3 = (View) this.A03;
        view3.setScaleX(min);
        view3.setScaleY(min);
    }
}
