package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes8.dex */
public final class LR0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C7GN A01;

    public LR0(View view, C7GN c7gn) {
        this.A00 = view;
        this.A01 = c7gn;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        C7GN c7gn = this.A01;
        c7gn.A0F();
        C7GN.A04(c7gn);
        return true;
    }
}
