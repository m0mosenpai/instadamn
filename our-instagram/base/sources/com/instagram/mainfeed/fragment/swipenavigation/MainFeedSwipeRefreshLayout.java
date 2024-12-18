package com.instagram.mainfeed.fragment.swipenavigation;

import X.AbstractC13880nE;
import X.C14360o3;
import X.C33K;
import X.C3FQ;
import X.C3HB;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.instagram.ui.widget.refresh.IgSwipeRefreshWithHScrollLayout;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class MainFeedSwipeRefreshLayout extends IgSwipeRefreshWithHScrollLayout {
    public C33K A00;
    public boolean A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MainFeedSwipeRefreshLayout(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    @Override // com.instagram.ui.widget.refresh.IgSwipeRefreshWithHScrollLayout, androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        WeakReference weakReference;
        C3FQ c3fq;
        C14360o3.A0B(motionEvent, 0);
        int actionMasked = motionEvent.getActionMasked();
        boolean z = true;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2 && !this.A01) {
                    return false;
                }
            } else {
                this.A01 = false;
            }
        } else {
            C33K c33k = this.A00;
            if (c33k != null) {
                if (!c33k.A00(motionEvent) || (weakReference = c33k.A01) == null || (c3fq = (C3FQ) weakReference.get()) == null || !c3fq.CQ6()) {
                    z = false;
                }
                this.A01 = z;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setMainFeedScrollAwayNavigatorState(C33K c33k) {
        this.A00 = c33k;
    }

    public /* synthetic */ MainFeedSwipeRefreshLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainFeedSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A01 = true;
        int A00 = C3HB.A00(context);
        A08((A00 / 3) + A00, A00 * 3);
        setDistanceToTriggerSync((int) AbstractC13880nE.A01(context, A00));
        ((SwipeRefreshLayout) this).A03 = A00 * 2;
    }
}
