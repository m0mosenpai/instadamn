package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.ClK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnLayoutChangeListenerC28672ClK implements View.OnLayoutChangeListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public ViewOnLayoutChangeListenerC28672ClK(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.A00;
        view.removeOnLayoutChangeListener(this);
        if (i9 != 0) {
            View view2 = (View) this.A02;
            int A03 = AbstractC167017dG.A03(view2.getContext());
            int i10 = this.A01;
            AbstractC25236BEt.A0f(new Rect(0, 0, A03, i10), view2, A03, i10);
            return;
        }
        C28427CgZ c28427CgZ = (C28427CgZ) this.A02;
        int width = (this.A01 * c28427CgZ.A01.getWidth()) / 100;
        Context context = c28427CgZ.A00;
        C28427CgZ.A01(c28427CgZ, width, context.getColor(AbstractC53242c7.A07(context)));
    }
}
