package com.instagram.ui.widget.flowlayout;

import X.AbstractC001800i;
import X.AbstractC166997dE;
import X.AbstractC31177DnL;
import X.AbstractC43593JPy;
import X.AbstractC43594JPz;
import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class HorizontalFlowLayout extends ViewGroup {
    public int A00;
    public final Map A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = -1;
        this.A01 = new LinkedHashMap();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C14360o3.A0B(layoutParams, 0);
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C14360o3.A0B(attributeSet, 0);
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        A00(this, i3 - i, true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int A08 = AbstractC43594JPz.A08(this, View.MeasureSpec.getSize(i));
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, i, 0, i2, 0);
            }
        }
        if (View.MeasureSpec.getMode(i) == 0) {
            A08 = -1;
        }
        int[] A00 = A00(this, A08, false);
        setMeasuredDimension(View.resolveSize(A00[0], i), View.resolveSize(A00[1], i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int[] A00(com.instagram.ui.widget.flowlayout.HorizontalFlowLayout r19, int r20, boolean r21) {
        /*
            r13 = r19
            android.content.Context r0 = r13.getContext()
            boolean r19 = X.AbstractC13620mo.A02(r0)
            int r18 = r13.getPaddingStart()
            int r12 = r13.getPaddingEnd()
            r11 = r18
            if (r19 == 0) goto L18
            int r11 = r20 - r18
        L18:
            int r10 = r13.getPaddingTop()
            java.util.Map r15 = r13.A01
            r15.clear()
            int r14 = r13.getChildCount()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 0
            r8 = 0
            r7 = 1
        L2a:
            if (r9 >= r14) goto L6a
            android.view.View r6 = r13.getChildAt(r9)
            int r2 = r6.getVisibility()
            r0 = 8
            if (r2 == r0) goto Lbc
            android.view.ViewGroup$MarginLayoutParams r2 = X.AbstractC31177DnL.A0G(r6)
            int r16 = r2.getMarginStart()
            int r3 = r2.getMarginEnd()
            int r0 = r6.getMeasuredWidth()
            int r17 = r16 + r0
            int r17 = r17 + r3
            int r5 = r2.topMargin
            int r0 = r6.getMeasuredHeight()
            int r5 = r5 + r0
            int r0 = r2.bottomMargin
            int r5 = r5 + r0
            if (r19 != 0) goto L8a
            int r3 = r11 + r17
            int r0 = r18 + r20
            if (r3 <= r0) goto L64
            r11 = r18
        L60:
            int r10 = r10 + r8
            int r7 = r7 + 1
            r8 = 0
        L64:
            int r0 = r13.A00
            if (r0 <= 0) goto L91
            if (r7 <= r0) goto L91
        L6a:
            int r0 = r13.getPaddingLeft()
            int r2 = java.lang.Math.max(r0, r1)
            int r0 = r13.getPaddingRight()
            int r2 = r2 + r0
            int r0 = r13.getPaddingTop()
            int r10 = r10 + r8
            int r1 = java.lang.Math.max(r0, r10)
            int r0 = r13.getPaddingBottom()
            int r1 = r1 + r0
            int[] r0 = new int[]{r2, r1}
            return r0
        L8a:
            int r0 = r11 - r17
            if (r0 >= r12) goto L64
            int r11 = r12 + r20
            goto L60
        L91:
            int r0 = r7 + (-1)
            X.AbstractC37301Gc2.A1T(r6, r15, r0)
            if (r21 == 0) goto Lb0
            if (r19 != 0) goto Lc3
            int r0 = r16 + r11
            int r4 = r2.topMargin
            int r4 = r4 + r10
            int r3 = r6.getMeasuredWidth()
            int r3 = r3 + r0
            int r2 = r2.topMargin
            int r2 = r2 + r10
            int r16 = r6.getMeasuredHeight()
            int r2 = r2 + r16
        Lad:
            r6.layout(r0, r4, r3, r2)
        Lb0:
            int r8 = java.lang.Math.max(r8, r5)
            if (r19 != 0) goto Lc0
            int r11 = r11 + r17
        Lb8:
            int r1 = java.lang.Math.max(r1, r11)
        Lbc:
            int r9 = r9 + 1
            goto L2a
        Lc0:
            int r11 = r11 - r17
            goto Lb8
        Lc3:
            int r0 = r6.getMeasuredWidth()
            int r0 = r11 - r0
            int r0 = r0 - r16
            int r4 = r2.topMargin
            int r4 = r4 + r10
            int r3 = r11 - r16
            int r2 = r6.getMeasuredHeight()
            int r2 = r2 + r4
            goto Lad
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.flowlayout.HorizontalFlowLayout.A00(com.instagram.ui.widget.flowlayout.HorizontalFlowLayout, int, boolean):int[]");
    }

    public final int getMaxRows() {
        return this.A00;
    }

    public final List A01(int i, int i2) {
        A00(this, getWidth(), false);
        Map map = this.A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            int A04 = AbstractC43593JPy.A04(entry);
            if (i <= A04 && A04 <= i2) {
                AbstractC31177DnL.A1S(entry, linkedHashMap);
            }
        }
        return AbstractC001800i.A0a(linkedHashMap.keySet());
    }

    public final void setMaxRows(int i) {
        this.A00 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A00 = -1;
        this.A01 = new LinkedHashMap();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C14360o3.A0B(layoutParams, 0);
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalFlowLayout(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A00 = -1;
        this.A01 = new LinkedHashMap();
    }
}
