package X;

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: X.ATk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC23275ATk implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ TextView A02;

    public ViewTreeObserverOnGlobalLayoutListenerC23275ATk(TextView textView, int i, int i2) {
        this.A02 = textView;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        TextView textView = this.A02;
        AbstractC166997dE.A1K(textView, this);
        textView.setY((this.A01 - this.A00) - textView.getHeight());
    }
}
