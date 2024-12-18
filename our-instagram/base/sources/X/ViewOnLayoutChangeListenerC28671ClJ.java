package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.ClJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnLayoutChangeListenerC28671ClJ implements View.OnLayoutChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;

    public ViewOnLayoutChangeListenerC28671ClJ(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        int i9 = this.A01;
        int i10 = this.A00;
        AbstractC25236BEt.A0f(new Rect(0, 0, i9, i10), view, i9, i10);
    }
}
