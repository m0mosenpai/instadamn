package com.instagram.ui.widget.refresh;

import X.AnonymousClass001;
import X.C0w9;
import X.C14360o3;
import X.C70543Eq;
import android.content.Context;
import android.util.AttributeSet;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes11.dex */
public class IgSwipeRefreshLayout extends SwipeRefreshLayout {
    public final C70543Eq A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgSwipeRefreshLayout(Context context) {
        super(context, null);
        C14360o3.A0B(context, 1);
        this.A00 = new C70543Eq(String.valueOf(hashCode()));
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int childDrawingOrder = super.getChildDrawingOrder(i, i2);
        if (childDrawingOrder >= i) {
            C0w9.A07("IgSwipeRefreshLayout", new IndexOutOfBoundsException(AnonymousClass001.A0n("getChildDrawingOrder() returns an invalid index ", " (child count is ", ") in IgSwipeRefreshLayout.", childDrawingOrder, i)));
            return i - 1;
        }
        return childDrawingOrder;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public void setRefreshing(boolean z) {
        super.setRefreshing(z);
        C70543Eq c70543Eq = this.A00;
        if (z) {
            c70543Eq.A00(1.0d, true);
        } else {
            c70543Eq.A00(0.0d, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A00 = new C70543Eq(String.valueOf(hashCode()));
    }
}
