package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes7.dex */
public final class HH3 extends AbstractC60592pi {
    public final C3BD A00;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A00.A01();
    }

    public HH3(Context context, View.OnClickListener onClickListener, FrameLayout frameLayout, float f, int i) {
        C3BD c3bd = new C3BD(context, onClickListener, context.getString(i), -1, AbstractC25229BEm.A1Y(context));
        this.A00 = c3bd;
        if (c3bd.A02 == null) {
            c3bd.A07(frameLayout);
        }
        this.A00.A06(null);
        View view = c3bd.A02;
        if (view != null) {
            view.setAlpha(f);
        }
    }
}
