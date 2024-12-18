package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class AT1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C131405wV A01;

    public AT1(View view, C131405wV c131405wV) {
        this.A00 = view;
        this.A01 = c131405wV;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.A00.removeOnLayoutChangeListener(this);
        C131405wV.A02(this.A01, i4 - i2);
    }
}
