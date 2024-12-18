package com.instagram.ui.text;

import X.AbstractC13690mv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC53242c7;
import X.C0f9;
import X.C14360o3;
import X.C14640oc;
import X.C14740om;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class TabTextView extends TextView {
    public int A00;
    public final Paint A01;
    public final Rect A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabTextView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A02 = AbstractC166987dD.A0U();
        this.A01 = AbstractC166987dD.A0R();
        A00();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.drawRect(this.A02, this.A01);
        }
    }

    private final void A00() {
        this.A00 = AbstractC166997dE.A0B(getResources());
        Context context = getContext();
        AbstractC166987dD.A1N(context, this.A01, AbstractC53242c7.A0H(context, R.attr.textColorSelected));
        if (C14640oc.A0E()) {
            this.A00 = AbstractC167017dG.A07(context);
            C14740om.A03(this);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(101637289);
        super.onSizeChanged(i, i2, i3, i4);
        if (C14640oc.A0E()) {
            int measureText = (int) getPaint().measureText(getText().toString());
            Context A0L = AbstractC166997dE.A0L(this);
            int max = Math.max(i - ((measureText + AbstractC13690mv.A01(A0L, 20)) + AbstractC13690mv.A01(A0L, 20)), 0) / 2;
            this.A02.set(max, i2 - this.A00, i - max, i2);
        } else {
            this.A02.set(0, i2 - this.A00, i, i2);
        }
        C0f9.A0D(-690833775, A06);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A02 = AbstractC166987dD.A0U();
        this.A01 = AbstractC166987dD.A0R();
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A02 = AbstractC166987dD.A0U();
        this.A01 = AbstractC166987dD.A0R();
        A00();
    }
}
