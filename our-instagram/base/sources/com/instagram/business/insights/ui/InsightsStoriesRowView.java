package com.instagram.business.insights.ui;

import X.AbstractC13880nE;
import X.AbstractC166997dE;
import X.AbstractC25225BEi;
import X.C14360o3;
import X.C46076KaY;
import X.MOB;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class InsightsStoriesRowView extends LinearLayout implements MOB {
    public MOB A00;
    public List A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightsStoriesRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A00(context, 3);
    }

    private final void A00(Context context, int i) {
        setOrientation(0);
        setImportantForAccessibility(2);
        int A0B = AbstractC166997dE.A0B(getResources());
        int i2 = i - 1;
        int A0A = (AbstractC13880nE.A0A(context) - (A0B * i2)) / i;
        float A05 = AbstractC13880nE.A05(AbstractC13880nE.A0I(context));
        ArrayList A17 = AbstractC25225BEi.A17(i);
        for (int i3 = 0; i3 < i; i3++) {
            C46076KaY c46076KaY = new C46076KaY(context);
            c46076KaY.setAspect(A05);
            c46076KaY.A00 = this;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0A, -2);
            int i4 = A0B;
            if (i3 == i2) {
                i4 = 0;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i4;
            addView(c46076KaY, layoutParams);
            A17.add(c46076KaY);
        }
        this.A01 = A17;
    }

    @Override // X.MOB
    public final void DLS(View view, String str) {
        C14360o3.A0B(view, 0);
        MOB mob = this.A00;
        if (mob != null) {
            mob.DLS(view, str);
        }
    }

    public final void setDelegate(MOB mob) {
        this.A00 = mob;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightsStoriesRowView(Context context, int i) {
        super(context);
        C14360o3.A0B(context, 1);
        A00(context, i);
    }
}
