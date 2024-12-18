package com.instagram.business.promote.mediapicker.view;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes11.dex */
public final class ThresholdAppBarLayoutBehavior extends AppBarLayout.Behavior {
    public float A00;

    @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        C14360o3.A0B(motionEvent, 2);
        if (motionEvent.getActionMasked() == 0) {
            this.A00 = 0.0f;
            return false;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThresholdAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC167017dG.A1P(context, attributeSet);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: A0X */
    public final void A0P(View view, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int[] iArr, int i, int i2, int i3) {
        AbstractC167027dH.A12(coordinatorLayout, appBarLayout, view);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(coordinatorLayout.getContext());
        if (viewConfiguration != null) {
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            float abs = this.A00 + Math.abs(i2);
            this.A00 = abs;
            if (abs > scaledTouchSlop * 25) {
                super.A0P(view, coordinatorLayout, appBarLayout, iArr, i, i2, i3);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public ThresholdAppBarLayoutBehavior() {
    }
}
