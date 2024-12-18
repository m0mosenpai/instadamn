package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.DtR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC31541DtR implements View.OnLayoutChangeListener {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ AbstractC1569172v A01;

    public ViewOnLayoutChangeListenerC31541DtR(Drawable drawable, AbstractC1569172v abstractC1569172v) {
        this.A01 = abstractC1569172v;
        this.A00 = drawable;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.A01.A01.setTopMarginRatio(((C74P) this.A00).A01);
    }
}
