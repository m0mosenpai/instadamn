package X;

import android.view.View;

/* renamed from: X.ASx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnLayoutChangeListenerC23262ASx implements View.OnLayoutChangeListener {
    public final /* synthetic */ C191478dz A00;

    public ViewOnLayoutChangeListenerC23262ASx(C191478dz c191478dz) {
        this.A00 = c191478dz;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.A00.A05.A0B(Integer.valueOf(view.getHeight()));
    }
}
