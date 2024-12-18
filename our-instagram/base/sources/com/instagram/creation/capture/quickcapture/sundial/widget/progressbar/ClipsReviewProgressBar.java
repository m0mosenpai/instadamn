package com.instagram.creation.capture.quickcapture.sundial.widget.progressbar;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC50522MSa;
import X.AbstractC55154OdI;
import X.AbstractC63123SdR;
import X.C0f9;
import X.C14360o3;
import X.C16930sl;
import X.C191428du;
import X.C51833Mvb;
import X.C84B;
import X.JQ0;
import X.MSW;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class ClipsReviewProgressBar extends View {
    public int A00;
    public int A01;
    public C84B A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C191428du A07;
    public final Paint A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsReviewProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A02 = new C84B(C16930sl.A00, false);
        this.A08 = new Paint(1);
        this.A00 = 15000;
        Resources resources = getResources();
        this.A04 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A06 = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A03 = context.getColor(R.color.clips_progress_bar_background_color);
        this.A05 = AbstractC166997dE.A01(context);
        this.A07 = new C191428du(context, context.getColor(R.color.clips_progress_bar_gradient_color_0), context.getColor(R.color.clips_progress_bar_gradient_color_1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        A00(canvas, 0.0f, AbstractC166987dD.A07(this), this.A03);
        int A06 = MSW.A06(this.A02);
        float f = 0.0f;
        for (int i = 0; i < A06; i++) {
            float A01 = AbstractC50522MSa.A01(this, this.A02.A00(i));
            int i2 = 178;
            if (this.A01 < this.A02.A01(i)) {
                i2 = 76;
            }
            A00(canvas, f, A01, (this.A05 & 16777215) | (i2 << 24));
            f += A01;
        }
        this.A07.draw(canvas);
        int A062 = MSW.A06(this.A02);
        float f2 = 0.0f;
        for (int i3 = 0; i3 < A062; i3++) {
            f2 += AbstractC50522MSa.A01(this, this.A02.A00(i3));
            float f3 = this.A06;
            A00(canvas, f2 - f3, f3, this.A05);
        }
    }

    private final void A00(Canvas canvas, float f, float f2, int i) {
        Paint paint = this.A08;
        paint.setColor(i);
        canvas.drawRect(f, 0.0f, f + f2, this.A04, paint);
    }

    public final void A01(int i, int i2) {
        if (this.A02.A04(i) != null) {
            AbstractC55154OdI.A02(new C51833Mvb(i2), this.A02, i);
            invalidate();
        }
    }

    public final void A02(List list, int i) {
        C14360o3.A0B(this.A02, 0);
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 0);
        this.A02 = new C84B(c16930sl, false);
        this.A00 = i;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1E.add(new C51833Mvb(AbstractC167007dF.A0B(it)));
        }
        this.A02 = new C84B(A1E, false);
        invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            this.A07.setBounds(0, 0, (int) AbstractC50522MSa.A01(this, this.A01), this.A04);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.A04, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
    }

    public final void setPlaybackPosition(int i) {
        int min = Math.min(i, this.A02.A00);
        this.A01 = min;
        this.A07.setBounds(0, 0, (int) AbstractC50522MSa.A01(this, min), this.A04);
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1667956959);
        this.A07.A00(i, i2);
        C0f9.A0D(180472124, A06);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClipsReviewProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClipsReviewProgressBar(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ ClipsReviewProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
