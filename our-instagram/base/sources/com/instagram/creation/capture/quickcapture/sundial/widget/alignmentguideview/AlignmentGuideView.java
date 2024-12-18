package com.instagram.creation.capture.quickcapture.sundial.widget.alignmentguideview;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC31175DnJ;
import X.C14360o3;
import X.C16930sl;
import X.JQ0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.instagram.common.ui.base.IgView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class AlignmentGuideView extends IgView {
    public List A00;
    public final Paint A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlignmentGuideView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            float A09 = AbstractC166987dD.A09(it.next());
            canvas.drawLine(A09, getPaddingTop(), A09, AbstractC166987dD.A08(this) - getPaddingBottom(), this.A01);
        }
    }

    public final void setVerticalPositionsList(List list) {
        C14360o3.A0B(list, 0);
        if (!C14360o3.A0K(this.A00, list)) {
            this.A00 = list;
            setVisibility(AbstractC31175DnJ.A01(list.isEmpty() ? 1 : 0));
            invalidate();
        }
    }

    public final List getVerticalPositionsList() {
        return this.A00;
    }

    public final void setVerticalAlignmentGuideColor(int i) {
        this.A01.setColor(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A00 = C16930sl.A00;
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setStyle(Paint.Style.STROKE);
        A0R.setStrokeWidth(AbstractC13880nE.A04(context, 1));
        A0R.setPathEffect(new DashPathEffect(new float[]{20.0f, 10.0f}, 0.0f));
        this.A01 = A0R;
    }

    public /* synthetic */ AlignmentGuideView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }
}
