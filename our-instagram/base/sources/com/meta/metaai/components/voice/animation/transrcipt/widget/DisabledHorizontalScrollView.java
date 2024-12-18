package com.meta.metaai.components.voice.animation.transrcipt.widget;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25227BEk;
import X.AbstractC43592JPx;
import X.C09530e4;
import X.C0f9;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class DisabledHorizontalScrollView extends HorizontalScrollView {
    public float A00;
    public float A01;
    public C09530e4 A02;
    public final Paint A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisabledHorizontalScrollView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public final float getAppearingWidth() {
        return this.A00;
    }

    public final float getDisappearingWidth() {
        return this.A01;
    }

    public final void setAppearingWidth(float f) {
        this.A00 = f;
    }

    public final void setDisappearingWidth(float f) {
        this.A01 = f;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void draw(Canvas canvas) {
        Bitmap createBitmap;
        Canvas A06;
        int A03 = C0f9.A03(-1469773218);
        C14360o3.A0B(canvas, 0);
        C09530e4 c09530e4 = this.A02;
        if (c09530e4 != null) {
            createBitmap = (Bitmap) c09530e4.A00;
            A06 = (Canvas) c09530e4.A01;
        } else {
            createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            A06 = AbstractC43592JPx.A06(createBitmap);
            this.A02 = AbstractC166987dD.A1L(createBitmap, A06);
        }
        A06.drawColor(0, PorterDuff.Mode.CLEAR);
        View childAt = getChildAt(0);
        A06.save();
        A06.translate(childAt.getTranslationX(), 0.0f);
        childAt.draw(A06);
        A06.restore();
        float f = this.A01;
        if (f > 0.0f) {
            A06.drawRect(new RectF(0.0f, 0.0f, f, AbstractC166987dD.A08(this)), this.A03);
        }
        if (this.A00 > 0.0f) {
            A06.drawRect(new RectF(AbstractC166987dD.A07(this) - this.A00, 0.0f, AbstractC166987dD.A07(this), AbstractC166987dD.A08(this)), this.A03);
        }
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
        C0f9.A0A(601407467, A03);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A02 = null;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0f9.A0C(1699866799, C0f9.A05(-1294201786));
        return false;
    }

    public /* synthetic */ DisabledHorizontalScrollView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisabledHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A03 = A0S;
        A0S.setDither(true);
        Integer[] numArr = {AbstractC25227BEk.A0p(), AbstractC25227BEk.A0o()};
        int[] iArr = new int[2];
        int i = 0;
        do {
            iArr[i] = numArr[i].intValue();
            i++;
        } while (i < 2);
        Float[] fArr = {Float.valueOf(0.0f), AbstractC25227BEk.A0m()};
        float[] fArr2 = new float[2];
        int i2 = 0;
        do {
            fArr2[i2] = fArr[i2].floatValue();
            i2++;
        } while (i2 < 2);
        A0S.setShader(new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, iArr, fArr2, Shader.TileMode.CLAMP));
        AbstractC166997dE.A1D(A0S, PorterDuff.Mode.MULTIPLY);
    }
}
