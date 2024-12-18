package com.instagram.ui.widget.segmentedprogressbar;

import X.AbstractC125325le;
import X.AbstractC13620mo;
import X.AbstractC166987dD;
import X.AbstractC43592JPx;
import X.AbstractC50787Mbx;
import X.C14360o3;
import X.C150956qv;
import X.C55942hf;
import X.JQ0;
import X.PHO;
import X.PIE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class ProgressAnchorContainer extends LinearLayout {
    public AbstractC50787Mbx A00;
    public final SegmentedProgressBar A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressAnchorContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.layout_progress_anchor_container, (ViewGroup) this, true);
        SegmentedProgressBar segmentedProgressBar = (SegmentedProgressBar) requireViewById(R.id.segment_progress_bar);
        this.A01 = segmentedProgressBar;
        this.A02 = AbstractC13620mo.A02(context);
        segmentedProgressBar.A0C = new PIE(this);
    }

    public static final void A00(ProgressAnchorContainer progressAnchorContainer, boolean z) {
        SegmentedProgressBar segmentedProgressBar = progressAnchorContainer.A01;
        int i = segmentedProgressBar.A04;
        boolean z2 = progressAnchorContainer.A02;
        int i2 = segmentedProgressBar.A03;
        if (z2) {
            i2 = (i - i2) - 1;
        }
        if (i > 1) {
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A0n = AbstractC43592JPx.A0n(progressAnchorContainer);
            A0n.A06 = new PHO(progressAnchorContainer, i, i2, z);
            A0n.A0F(true).A0H();
        }
        AbstractC50787Mbx abstractC50787Mbx = progressAnchorContainer.A00;
        if (abstractC50787Mbx != null) {
            View[] viewArr = {abstractC50787Mbx};
            if (z) {
                C150956qv.A08(viewArr, true);
            } else {
                C55942hf c55942hf2 = C150956qv.A02;
                AbstractC125325le.A04(null, viewArr, true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (!(view instanceof AbstractC50787Mbx) && !(view instanceof SegmentedProgressBar)) {
            throw AbstractC166987dD.A12("Can only attach views that extend from ProgressAnchorView");
        }
        super.addView(view);
    }

    public final AbstractC50787Mbx getAnchorView() {
        return this.A00;
    }

    public final SegmentedProgressBar getSegmentedProgressBar() {
        return this.A01;
    }

    public final void setAnchorView(AbstractC50787Mbx abstractC50787Mbx) {
        AbstractC50787Mbx abstractC50787Mbx2 = this.A00;
        if (abstractC50787Mbx2 != null) {
            removeView(abstractC50787Mbx2);
        }
        addView(abstractC50787Mbx);
        this.A00 = abstractC50787Mbx;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressAnchorContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressAnchorContainer(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ ProgressAnchorContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
