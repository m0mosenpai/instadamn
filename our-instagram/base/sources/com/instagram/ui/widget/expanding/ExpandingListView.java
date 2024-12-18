package com.instagram.ui.widget.expanding;

import X.C1I2;
import X.JXT;
import X.WH9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class ExpandingListView extends RefreshableListView {
    public boolean A00;
    public boolean A01;
    public final List A02;
    public final C1I2 A03;

    public static ValueAnimator A00(View view, View view2, float f, float f2, int i) {
        int top = view.getTop();
        int bottom = view.getBottom();
        int bottom2 = view2.getBottom();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new WH9(view2, view, f, f2, bottom2, i, top, bottom));
        return ofFloat;
    }

    public C1I2 getOnScrollListener() {
        return this.A03;
    }

    public ExpandingListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = new ArrayList();
        this.A03 = new JXT(this, 4);
    }

    @Override // com.instagram.ui.widget.refresh.RefreshableListView, android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.A01) {
            List<View> list = this.A02;
            if (!list.isEmpty()) {
                for (View view : list) {
                    canvas.translate(0.0f, view.getTop());
                    view.draw(canvas);
                    canvas.translate(0.0f, -view.getTop());
                }
            }
        }
    }

    public void setExpandingDisabledOnScroll(boolean z) {
        this.A00 = z;
    }

    public void setExpandingEnabled(boolean z) {
        this.A01 = z;
    }

    public ExpandingListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = new ArrayList();
        this.A03 = new JXT(this, 4);
    }

    public ExpandingListView(Context context) {
        super(context);
        this.A02 = new ArrayList();
        this.A03 = new JXT(this, 4);
    }
}
