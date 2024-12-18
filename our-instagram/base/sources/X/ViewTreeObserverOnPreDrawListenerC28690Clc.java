package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.Clc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewTreeObserverOnPreDrawListenerC28690Clc implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ ConstraintLayout A02;

    public ViewTreeObserverOnPreDrawListenerC28690Clc(View view, TextView textView, ConstraintLayout constraintLayout) {
        this.A01 = textView;
        this.A02 = constraintLayout;
        this.A00 = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        TextView textView = this.A01;
        if (textView.getLineCount() > 0) {
            textView.getViewTreeObserver().removeOnPreDrawListener(this);
            AbstractC28467ChJ.A05(this.A00, textView, this.A02, 0);
            return true;
        }
        return true;
    }
}
