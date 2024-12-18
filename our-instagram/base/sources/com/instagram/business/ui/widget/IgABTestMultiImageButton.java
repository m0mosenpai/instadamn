package com.instagram.business.ui.widget;

import X.AbstractC167007dF;
import X.C14360o3;
import X.C153406vA;
import X.C44353Jis;
import X.JQ0;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class IgABTestMultiImageButton extends IgMultiImageButton {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final C44353Jis A03;
    public final C153406vA A04;

    @Override // com.instagram.igds.components.imagebutton.IgMultiImageButton, com.instagram.igds.components.imagebutton.IgImageButton, com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        if (this.A02) {
            C153406vA c153406vA = this.A04;
            int i = c153406vA.A00 + c153406vA.A06;
            float width = (canvas.getWidth() - i) - c153406vA.A07;
            c153406vA.setBounds(0, 0, i, i);
            canvas.save();
            canvas.translate(width, width);
            c153406vA.draw(canvas);
            canvas.restore();
        }
        if (this.A01) {
            C44353Jis c44353Jis = this.A03;
            int i2 = c44353Jis.A00 + c44353Jis.A01;
            float width2 = ((canvas.getWidth() - i2) * 1.0f) / 2.0f;
            c44353Jis.setBounds(0, 0, i2, i2);
            canvas.save();
            AbstractC167007dF.A0u(canvas, c44353Jis, width2, ((canvas.getWidth() * 1.0f) - i2) - c44353Jis.A02);
        }
    }

    public final void setAlphabet(String str) {
        C44353Jis c44353Jis;
        String str2;
        if (str != null) {
            this.A00 = str;
            C153406vA c153406vA = this.A04;
            c153406vA.A03 = str;
            c153406vA.invalidateSelf();
            c153406vA.A04 = true;
            c153406vA.invalidateSelf();
            c44353Jis = this.A03;
            str2 = this.A00;
        } else {
            C153406vA c153406vA2 = this.A04;
            c153406vA2.A04 = false;
            c153406vA2.invalidateSelf();
            c44353Jis = this.A03;
            str2 = null;
        }
        c44353Jis.A03 = str2;
        invalidate();
    }

    public final void setBottomCenterAlphabetCircleDrawableEnabled(boolean z) {
        this.A01 = z;
        invalidate();
    }

    public final void setBottomRightAlphabetCircleDrawableEnabled(boolean z) {
        this.A02 = z;
        invalidate();
    }

    public /* synthetic */ IgABTestMultiImageButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgABTestMultiImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A04 = new C153406vA(context);
        this.A03 = new C44353Jis(context);
        this.A00 = "";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgABTestMultiImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgABTestMultiImageButton(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
