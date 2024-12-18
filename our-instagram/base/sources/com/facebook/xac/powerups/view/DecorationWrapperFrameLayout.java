package com.facebook.xac.powerups.view;

import X.AbstractC31177DnL;
import X.AbstractC43594JPz;
import X.AbstractC55922hc;
import X.AbstractC63123SdR;
import X.AbstractC65702TsY;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class DecorationWrapperFrameLayout extends FrameLayout {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecorationWrapperFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        int[] iArr = AbstractC55922hc.A1o;
        C14360o3.A08(iArr);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        this.A00 = resourceId;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View view;
        int i3;
        int i4;
        int i5;
        int childMeasureSpec;
        int childMeasureSpec2;
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 < childCount) {
                view = getChildAt(i6);
                if (view.getId() == this.A00) {
                    break;
                } else {
                    i6++;
                }
            } else {
                view = null;
                break;
            }
        }
        if (view != null && (getMeasureAllChildren() || view.getVisibility() != 8)) {
            measureChildWithMargins(view, i, 0, i2, 0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i4 = Math.max(0, view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            i3 = Math.max(0, view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            i5 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        int A06 = i4 + AbstractC65702TsY.A06(this);
        int max = Math.max(i3 + AbstractC65702TsY.A09(this), getSuggestedMinimumHeight());
        int max2 = Math.max(A06, getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        if (foreground != null) {
            max = Math.max(max, foreground.getMinimumHeight());
            max2 = Math.max(max2, foreground.getMinimumWidth());
        }
        setMeasuredDimension(View.resolveSizeAndState(max2, i, i5), View.resolveSizeAndState(max, i2, i5 << 16));
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            View childAt = getChildAt(i7);
            if (childAt != view) {
                ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(childAt);
                if (((ViewGroup.LayoutParams) A0G).width == -1) {
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (AbstractC43594JPz.A08(this, getMeasuredWidth()) - A0G.leftMargin) - A0G.rightMargin), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                } else {
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i, AbstractC65702TsY.A06(this) + A0G.leftMargin + A0G.rightMargin, ((ViewGroup.LayoutParams) A0G).width);
                }
                if (((ViewGroup.LayoutParams) A0G).height == -1) {
                    childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (AbstractC65702TsY.A0A(this, getMeasuredHeight()) - A0G.topMargin) - A0G.bottomMargin), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                } else {
                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, AbstractC65702TsY.A09(this) + A0G.topMargin + A0G.bottomMargin, ((ViewGroup.LayoutParams) A0G).height);
                }
                childAt.measure(childMeasureSpec, childMeasureSpec2);
            }
        }
    }

    public final int getMessageBubbleXmlResId() {
        return this.A00;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecorationWrapperFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ DecorationWrapperFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecorationWrapperFrameLayout(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
