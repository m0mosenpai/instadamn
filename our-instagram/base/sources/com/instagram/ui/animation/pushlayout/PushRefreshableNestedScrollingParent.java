package com.instagram.ui.animation.pushlayout;

import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* loaded from: classes11.dex */
public final class PushRefreshableNestedScrollingParent extends RefreshableNestedScrollingParent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushRefreshableNestedScrollingParent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    public final float getXFraction() {
        int width = getWidth();
        float x = getX();
        if (width != 0) {
            return x / width;
        }
        return x;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushRefreshableNestedScrollingParent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushRefreshableNestedScrollingParent(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }
}
