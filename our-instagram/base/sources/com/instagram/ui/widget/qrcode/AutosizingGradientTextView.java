package com.instagram.ui.widget.qrcode;

import X.AbstractC009903n;
import X.AbstractC43592JPx;
import X.C0f9;
import X.C13680mu;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class AutosizingGradientTextView extends IgTextView {
    public int A00;
    public int A01;
    public int[] A02;

    private final void A00(int i, int i2) {
        int[] iArr = this.A02;
        if (iArr != null) {
            Integer num = null;
            Integer A04 = AbstractC009903n.A04(iArr, 0);
            int[] iArr2 = this.A02;
            if (iArr2 != null) {
                num = AbstractC009903n.A04(iArr2, 1);
            }
            if (A04 != null && num != null) {
                getPaint().setShader(new LinearGradient(0.0f, i2, i, 0.0f, A04.intValue(), num.intValue(), Shader.TileMode.CLAMP));
                invalidate();
            }
        }
    }

    public final void setGradient(int[] iArr) {
        this.A02 = iArr;
        A00(getWidth(), getHeight());
    }

    public /* synthetic */ AutosizingGradientTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int A06 = C0f9.A06(-1870505663);
        String obj = getText().toString();
        setTextSize(0, C13680mu.A00(Layout.Alignment.ALIGN_CENTER, new TextPaint(getPaint()), obj, View.MeasureSpec.getSize(i), getMaxLines(), this.A01, this.A00));
        super.onMeasure(i, i2);
        C0f9.A0D(730941591, A06);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1668174876);
        super.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
        C0f9.A0D(-994157332, A06);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutosizingGradientTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = AbstractC43592JPx.A01(context, 40);
        this.A01 = AbstractC43592JPx.A01(context, 14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutosizingGradientTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutosizingGradientTextView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
