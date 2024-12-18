package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* renamed from: X.ATn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC23278ATn implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ImageView A02;
    public final /* synthetic */ C4ZU A03;
    public final /* synthetic */ C84823qW A04;

    public ViewTreeObserverOnGlobalLayoutListenerC23278ATn(View view, ImageView imageView, C4ZU c4zu, C84823qW c84823qW, float f) {
        this.A03 = c4zu;
        this.A02 = imageView;
        this.A01 = view;
        this.A04 = c84823qW;
        this.A00 = f;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C4ZT A01 = C4ZU.A01(this.A03);
        if (A01.A00()) {
            ImageView imageView = this.A02;
            AbstractC166997dE.A1K(imageView, this);
            View view = this.A01;
            C14360o3.A0A(view);
            C4ZU.A02(imageView, view, A01, this.A04, this.A00);
        }
    }
}
