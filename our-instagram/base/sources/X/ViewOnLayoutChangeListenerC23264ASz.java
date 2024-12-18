package X;

import android.view.View;

/* renamed from: X.ASz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnLayoutChangeListenerC23264ASz implements View.OnLayoutChangeListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;

    public ViewOnLayoutChangeListenerC23264ASz(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float f = this.A00;
        view.setScaleX(f);
        view.setScaleY(f);
        view.setTranslationY(AbstractC166987dD.A08(view) * this.A01 * f);
    }
}
