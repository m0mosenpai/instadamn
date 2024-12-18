package com.instagram.business.insights.ui;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.C00O;
import X.C14360o3;
import X.C46076KaY;
import X.InterfaceC11380iw;
import X.MOB;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class InsightsTopStoriesView extends LinearLayout implements MOB {
    public MOB A00;
    public List A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightsTopStoriesView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        A00(context);
    }

    private final void A00(Context context) {
        setOrientation(0);
        int A0B = AbstractC166997dE.A0B(getResources());
        int A0A = (int) (((AbstractC13880nE.A0A(context) - (A0B * 5)) - AbstractC166997dE.A05(r0)) / 3.1f);
        float A05 = AbstractC13880nE.A05(AbstractC13880nE.A0I(context));
        ArrayList A17 = AbstractC25225BEi.A17(6);
        int i = 0;
        do {
            C46076KaY c46076KaY = new C46076KaY(context);
            c46076KaY.setAspect(A05);
            c46076KaY.A00 = this;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0A, -2);
            int i2 = A0B;
            if (i == 5) {
                i2 = 0;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i2;
            addView(c46076KaY, layoutParams);
            A17.add(c46076KaY);
            i++;
        } while (i < 6);
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

    public final void setShowAvatarForMediaOverlay(boolean z) {
    }

    public final void setData(ImmutableList immutableList, InterfaceC11380iw interfaceC11380iw) {
        AbstractC167017dG.A1N(immutableList, interfaceC11380iw);
        C14360o3.A07(getResources().getString(2131968674));
        List<View> list = this.A01;
        if (list == null) {
            C14360o3.A0F("imageItemViews");
            throw C00O.createAndThrow();
        }
        int i = 0;
        for (View view : list) {
            int i2 = i + 1;
            if (i < immutableList.size()) {
                immutableList.get(i);
                throw AbstractC166987dD.A15("getMetric");
            }
            view.setVisibility(8);
            i = i2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightsTopStoriesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A00(context);
    }
}
