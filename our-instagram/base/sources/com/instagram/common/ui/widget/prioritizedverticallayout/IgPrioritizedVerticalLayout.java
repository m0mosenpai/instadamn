package com.instagram.common.ui.widget.prioritizedverticallayout;

import X.AbstractC166997dE;
import X.AbstractC43594JPz;
import X.AbstractC55922hc;
import X.C14360o3;
import X.C66343UAi;
import X.JQ0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class IgPrioritizedVerticalLayout extends ViewGroup {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgPrioritizedVerticalLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, X.UAi] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.A00 = 1;
        return marginLayoutParams;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = Integer.MIN_VALUE;
        do {
            int childCount = getChildCount();
            i3 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    C14360o3.A0C(layoutParams, "null cannot be cast to non-null type com.instagram.common.ui.widget.prioritizedverticallayout.IgPrioritizedVerticalLayout.LayoutParams");
                    C66343UAi c66343UAi = (C66343UAi) layoutParams;
                    if (c66343UAi.A00 != i7) {
                        if (c66343UAi.A00 > i7) {
                            i3 = Math.min(i3, c66343UAi.A00);
                        }
                    } else {
                        measureChildWithMargins(childAt, i, 0, i2, i5);
                        i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
                        i4 = Math.max(i4, childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c66343UAi).leftMargin + ((ViewGroup.MarginLayoutParams) c66343UAi).rightMargin);
                        i5 += childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c66343UAi).topMargin + ((ViewGroup.MarginLayoutParams) c66343UAi).bottomMargin;
                    }
                }
            }
            i7 = i3;
        } while (i3 < Integer.MAX_VALUE);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i4 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, i6), View.resolveSizeAndState(Math.max(i5 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, 0));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C66343UAi;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, X.UAi] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context A0L = AbstractC166997dE.A0L(this);
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(A0L, attributeSet);
        marginLayoutParams.A00 = 1;
        int[] iArr = AbstractC55922hc.A1C;
        C14360o3.A08(iArr);
        TypedArray obtainStyledAttributes = A0L.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        marginLayoutParams.A00 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        return marginLayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop();
        int A08 = AbstractC43594JPz.A08(this, getWidth());
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                C14360o3.A0C(layoutParams, "null cannot be cast to non-null type com.instagram.common.ui.widget.prioritizedverticallayout.IgPrioritizedVerticalLayout.LayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int paddingLeft = getPaddingLeft() + ((A08 - ((marginLayoutParams.leftMargin + childAt.getMeasuredWidth()) + marginLayoutParams.rightMargin)) / 2) + marginLayoutParams.leftMargin;
                int i6 = paddingTop + marginLayoutParams.topMargin;
                int measuredHeight = childAt.getMeasuredHeight();
                childAt.layout(paddingLeft, i6, childAt.getMeasuredWidth() + paddingLeft, i6 + measuredHeight);
                paddingTop = i6 + measuredHeight + marginLayoutParams.bottomMargin;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgPrioritizedVerticalLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, X.UAi] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C14360o3.A0B(layoutParams, 0);
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.A00 = 1;
        return marginLayoutParams;
    }

    public /* synthetic */ IgPrioritizedVerticalLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgPrioritizedVerticalLayout(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
