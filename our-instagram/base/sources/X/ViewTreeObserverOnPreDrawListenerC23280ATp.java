package X;

import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* renamed from: X.ATp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC23280ATp implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ ViewOnTouchListenerC1829889t A01;

    public ViewTreeObserverOnPreDrawListenerC23280ATp(ImageView imageView, ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t) {
        this.A00 = imageView;
        this.A01 = viewOnTouchListenerC1829889t;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        ViewOnTouchListenerC1829889t.A01(this.A01);
        return true;
    }
}
