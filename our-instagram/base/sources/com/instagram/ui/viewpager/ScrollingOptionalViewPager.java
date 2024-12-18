package com.instagram.ui.viewpager;

import X.AbstractC43593JPy;
import X.AbstractC44803JsT;
import X.C0f9;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class ScrollingOptionalViewPager extends AbstractC44803JsT {
    public boolean A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScrollingOptionalViewPager(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (this.A00) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public final boolean getScrollingEnabled() {
        return this.A00;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        if (this.A00) {
            super.setCurrentItem(i);
        } else {
            A0I(i, false);
        }
    }

    public final void setScrollingEnabled(boolean z) {
        this.A00 = z;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int A03 = AbstractC43593JPy.A03(motionEvent, -23641839);
        if (this.A00) {
            z = super.onTouchEvent(motionEvent);
        } else {
            z = false;
        }
        C0f9.A0C(-1181352443, A03);
        return z;
    }

    public /* synthetic */ ScrollingOptionalViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingOptionalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A00 = true;
    }
}
