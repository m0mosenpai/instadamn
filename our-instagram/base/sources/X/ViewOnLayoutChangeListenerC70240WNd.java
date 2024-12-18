package X;

import android.view.View;

/* renamed from: X.WNd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnLayoutChangeListenerC70240WNd implements View.OnLayoutChangeListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;

    public ViewOnLayoutChangeListenerC70240WNd(View view, View view2, float f) {
        this.A02 = view;
        this.A01 = view2;
        this.A00 = f;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        W3z w3z = W3z.A00;
        View view2 = this.A02;
        View view3 = this.A01;
        w3z.A00(view2, view3, this.A00);
        view3.removeOnLayoutChangeListener(this);
    }
}
