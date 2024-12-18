package com.instagram.business.insights.ui;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC43594JPz;
import X.C14360o3;
import X.C46076KaY;
import X.InterfaceC11380iw;
import X.MOB;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.google.common.collect.ImmutableList;

/* loaded from: classes8.dex */
public final class InsightsTopPostsView extends LinearLayout implements MOB {
    public MOB A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightsTopPostsView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        setOrientation(1);
    }

    @Override // X.MOB
    public final void DLS(View view, String str) {
        C14360o3.A0B(view, 0);
        MOB mob = this.A00;
        if (mob != null) {
            mob.DLS(view, str);
        }
    }

    public final void setData(ImmutableList immutableList, InterfaceC11380iw interfaceC11380iw) {
        boolean A1R = AbstractC167007dF.A1R(0, immutableList, interfaceC11380iw);
        removeAllViews();
        int size = immutableList.size();
        int i = 0;
        for (int i2 = 0; i2 < size && i < 2; i2 += 3) {
            InsightsImagesRowView insightsImagesRowView = new InsightsImagesRowView(AbstractC166997dE.A0L(this), 3);
            ImmutableList subList = immutableList.subList(i2, Math.min(immutableList.size(), i2 + 3));
            C14360o3.A07(subList);
            insightsImagesRowView.removeAllViews();
            int size2 = subList.size();
            int i3 = insightsImagesRowView.A00;
            if (0 < Math.min(size2, i3)) {
                subList.get(0);
                Context A0L = AbstractC166997dE.A0L(insightsImagesRowView);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                if (A1R) {
                    layoutParams.setMarginEnd(AbstractC43594JPz.A04(A0L));
                }
                new C46076KaY(A0L).setLayoutParams(layoutParams);
                throw AbstractC166987dD.A15("getInstagramMediaId");
            }
            for (int i4 = 0; i4 < i3; i4++) {
                Context A0L2 = AbstractC166997dE.A0L(insightsImagesRowView);
                boolean A1Q = AbstractC167007dF.A1Q(i4, size2 - 1);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                if (A1Q) {
                    layoutParams2.setMarginEnd(AbstractC43594JPz.A04(A0L2));
                }
                C46076KaY c46076KaY = new C46076KaY(A0L2);
                c46076KaY.setLayoutParams(layoutParams2);
                c46076KaY.setVisibility(4);
                insightsImagesRowView.addView(c46076KaY);
            }
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = getResources().getDimensionPixelOffset(R.dimen.account_recs_header_image_margin);
            insightsImagesRowView.setLayoutParams(layoutParams3);
            insightsImagesRowView.A01 = this;
            addView(insightsImagesRowView);
            i++;
        }
    }

    public final void setDelegate(MOB mob) {
        this.A00 = mob;
    }

    public final void setShowAvatarForMediaOverlay(boolean z) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightsTopPostsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        setOrientation(1);
    }
}
