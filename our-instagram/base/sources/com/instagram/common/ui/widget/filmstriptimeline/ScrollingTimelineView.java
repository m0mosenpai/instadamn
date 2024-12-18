package com.instagram.common.ui.widget.filmstriptimeline;

import X.AbstractC55922hc;
import X.C14360o3;
import X.C69671VtF;
import X.C70818Whb;
import X.C70820Whd;
import X.C8RN;
import X.JQ0;
import X.RunnableC71327Wrv;
import X.ViewOnTouchListenerC70251WNw;
import X.WOP;
import X.X8F;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class ScrollingTimelineView extends FrameLayout {
    public boolean A00;
    public C69671VtF A01;
    public X8F A02;
    public final HorizontalScrollView A03;
    public final LinearLayout A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.VtF] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.widget.HorizontalScrollView, android.view.View, java.lang.Object, X.UC6, android.view.ViewGroup] */
    public ScrollingTimelineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A02 = new C70818Whb();
        this.A01 = new Object();
        Resources resources = getResources();
        int i2 = resources.getDisplayMetrics().widthPixels;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC55922hc.A25);
        C14360o3.A07(obtainStyledAttributes);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, resources.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material));
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        LinearLayout linearLayout = new LinearLayout(context2);
        this.A04 = linearLayout;
        int i3 = i2 / 2;
        linearLayout.setPadding(i3, 0, i3, 0);
        linearLayout.setClipToPadding(false);
        ?? horizontalScrollView = new HorizontalScrollView(context2);
        horizontalScrollView.A02 = new RunnableC71327Wrv(horizontalScrollView);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setOnTouchListener(new ViewOnTouchListenerC70251WNw(5, horizontalScrollView, this));
        horizontalScrollView.getViewTreeObserver().addOnScrollChangedListener(new WOP(this, 1));
        horizontalScrollView.A01 = new C70820Whd(this);
        horizontalScrollView.requestDisallowInterceptTouchEvent(true);
        this.A03 = horizontalScrollView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (dimensionPixelSize > 0) {
            ((ViewGroup.LayoutParams) layoutParams).height = dimensionPixelSize;
            layoutParams.gravity = 16;
        }
        addView((View) horizontalScrollView, layoutParams);
        horizontalScrollView.addView(linearLayout, new ViewGroup.LayoutParams(-2, -1));
        C8RN c8rn = new C8RN(context2);
        c8rn.setSeekerWidth(dimensionPixelSize3);
        c8rn.A03 = dimensionPixelSize2;
        c8rn.A06 = false;
        c8rn.A08 = false;
        c8rn.A07 = false;
        c8rn.setSeekbarValue(0.5f);
        addView(c8rn, new ViewGroup.LayoutParams(-2, dimensionPixelSize4 <= 0 ? -1 : dimensionPixelSize4));
    }

    public final void setListener(X8F x8f) {
        C14360o3.A0B(x8f, 0);
        this.A02 = x8f;
    }

    public final void setScrollingTimelineState(C69671VtF c69671VtF) {
        C14360o3.A0B(c69671VtF, 0);
        this.A01 = c69671VtF;
    }

    public static final /* synthetic */ boolean A00(MotionEvent motionEvent, ScrollingTimelineView scrollingTimelineView) {
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScrollingTimelineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ ScrollingTimelineView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScrollingTimelineView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
