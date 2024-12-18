package com.instagram.direct.voice.view;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC43592JPx;
import X.C09530e4;
import X.C14360o3;
import X.InterfaceC09390do;
import X.JQ0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class VoiceMessageTrimFrame extends View {
    public Bitmap A00;
    public final RectF A01;
    public final Paint A02;
    public final AttributeSet A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        RectF rectF = this.A01;
        int width = (int) (rectF.width() + (getTrimFrameHandleWidth() * 2.0f));
        Bitmap bitmap = this.A00;
        if (bitmap == null || bitmap.getWidth() != width) {
            Bitmap bitmap2 = this.A00;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            Drawable drawable = getContext().getDrawable(R.drawable.trim_frame);
            if (drawable != null) {
                Bitmap A0F = AbstractC167007dF.A0F(width, getHeight());
                Canvas A06 = AbstractC43592JPx.A06(A0F);
                drawable.setBounds(new Rect(0, 0, A0F.getWidth(), A0F.getHeight()));
                drawable.draw(A06);
                A06.drawRoundRect(new RectF(getTrimFrameHandleWidth(), getTrimFrameThickness(), A0F.getWidth() - getTrimFrameHandleWidth(), A0F.getHeight() - getTrimFrameThickness()), getTrimFrameInnerCornerRadius(), getTrimFrameInnerCornerRadius(), this.A02);
                this.A00 = A0F;
            }
        }
        Bitmap bitmap3 = this.A00;
        if (bitmap3 != null) {
            canvas.drawBitmap(bitmap3, rectF.left - getTrimFrameHandleWidth(), 0.0f, (Paint) null);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    private final float getTrimFrameHandleWidth() {
        return AbstractC166987dD.A09(this.A04.getValue());
    }

    private final float getTrimFrameInnerCornerRadius() {
        return AbstractC166987dD.A09(this.A05.getValue());
    }

    private final float getTrimFrameThickness() {
        return AbstractC166987dD.A09(this.A06.getValue());
    }

    public final RectF getTrimWindowRect() {
        return this.A01;
    }

    public /* synthetic */ VoiceMessageTrimFrame(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    public final C09530e4 getSelectionBoundsPercent() {
        Float valueOf;
        float f = 1.0f;
        if (AbstractC167007dF.A1N(getVisibility())) {
            RectF rectF = this.A01;
            valueOf = Float.valueOf(Math.max((rectF.left - getTrimFrameHandleWidth()) / (AbstractC166987dD.A07(this) - (getTrimFrameHandleWidth() * 2.0f)), 0.0f));
            f = Math.min((rectF.right - getTrimFrameHandleWidth()) / (AbstractC166987dD.A07(this) - (getTrimFrameHandleWidth() * 2.0f)), 1.0f);
        } else {
            valueOf = Float.valueOf(0.0f);
        }
        return AbstractC166987dD.A1L(valueOf, Float.valueOf(f));
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.A01;
        if (rectF.isEmpty()) {
            rectF.set(getPaddingLeft() + getTrimFrameHandleWidth(), getPaddingTop(), ((i3 - i) - getPaddingRight()) - getTrimFrameHandleWidth(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceMessageTrimFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A03 = attributeSet;
        this.A01 = AbstractC166987dD.A0X();
        Paint A0S = AbstractC166987dD.A0S(5);
        A0S.setColor(0);
        AbstractC166987dD.A1R(A0S);
        AbstractC166997dE.A1D(A0S, PorterDuff.Mode.SRC_IN);
        this.A02 = A0S;
        this.A04 = JQ0.A0p(this, 38);
        this.A05 = JQ0.A0p(this, 39);
        this.A06 = JQ0.A0p(this, 40);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VoiceMessageTrimFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VoiceMessageTrimFrame(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
