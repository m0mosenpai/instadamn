package com.instagram.feed.widget;

import X.C14360o3;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes2.dex */
public final class IgProgressImageViewProgressBar extends ProgressBar {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgProgressImageViewProgressBar(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.save();
        canvas.rotate(270.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            setMeasuredDimension(progressDrawable.getIntrinsicWidth(), progressDrawable.getIntrinsicHeight());
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgProgressImageViewProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgProgressImageViewProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }
}
