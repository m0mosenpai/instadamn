package com.instagram.creation.photo.crop;

import X.C14360o3;
import X.C82P;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class CropHighlightView extends View {
    public C82P A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropHighlightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        C82P c82p = this.A00;
        if (c82p != null) {
            c82p.A00(canvas);
        }
    }

    public final void setCropDimensions(RectF rectF) {
        C14360o3.A0B(rectF, 0);
        C82P c82p = this.A00;
        if (c82p != null) {
            c82p.A01(rectF, false, true);
        }
    }

    public final C82P getHighlightView() {
        return this.A00;
    }

    public final void setDarkenPaintColor(int i) {
        C82P c82p = this.A00;
        if (c82p != null) {
            c82p.A04.setColor(c82p.A03.getColor(i));
        }
    }

    public final void setHighlightView(C82P c82p) {
        this.A00 = c82p;
        invalidate();
    }

    public /* synthetic */ CropHighlightView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
