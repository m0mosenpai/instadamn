package com.instagram.common.ui.touch;

import X.C1342364l;
import X.C14360o3;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class TouchOverlayView extends View {
    public final C1342364l A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchOverlayView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        float f = this.A00.A00;
        if (f != 0.0f) {
            canvas.drawColor(((int) (f * 128.0f)) * 16777216);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = new C1342364l(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ TouchOverlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
