package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public final class AQ7 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final View A00;
    public final ImageView A01;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.A00;
        AbstractC166997dE.A1K(view, this);
        ImageView imageView = this.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int height = view.getHeight();
        Drawable drawable = imageView.getDrawable();
        drawable.getClass();
        int min = Math.min(height, drawable.getIntrinsicHeight());
        int width = view.getWidth();
        Drawable drawable2 = imageView.getDrawable();
        drawable2.getClass();
        int min2 = Math.min(Math.min(width, drawable2.getIntrinsicWidth()), min);
        layoutParams.height = min2;
        layoutParams.width = min2;
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(0);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A00.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AbstractC166997dE.A1K(this.A00, this);
    }

    public AQ7(View view, ImageView imageView) {
        this.A00 = view;
        this.A01 = imageView;
    }
}
