package androidx.appcompat.widget;

import X.AbstractC63123SdR;
import X.AbstractC65702TsY;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int makeMeasureSpec;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else if ((id == R.id.contentPanel || id == R.id.customPanel) && view3 == null) {
                    view3 = childAt;
                } else {
                    super.onMeasure(i, i2);
                    return;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int A09 = AbstractC65702TsY.A09(this);
        if (view != null) {
            view.measure(i, 0);
            A09 += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i4 = A00(view2);
            i5 = view2.getMeasuredHeight() - i4;
            A09 += i4;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (view3 != null) {
            if (mode == 0) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - A09), mode);
            }
            view3.measure(i, makeMeasureSpec);
            i6 = view3.getMeasuredHeight();
            A09 += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i8 = size - A09;
        if (view2 != null) {
            int i9 = A09 - i4;
            int min = Math.min(i8, i5);
            if (min > 0) {
                i8 -= min;
                i4 += min;
            }
            AbstractC65702TsY.A12(view2, i4, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO, i);
            A09 = i9 + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i8 > 0) {
            AbstractC65702TsY.A12(view3, i6 + i8, mode, i);
            A09 = (A09 - i6) + view3.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                i10 = Math.max(i10, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10 + AbstractC65702TsY.A06(this), i, i3), View.resolveSizeAndState(A09, i2, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt3 = getChildAt(i12);
                if (childAt3.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt3.getLayoutParams();
                    if (layoutParams.width == -1) {
                        int i13 = layoutParams.height;
                        layoutParams.height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec2, 0, i2, 0);
                        layoutParams.height = i13;
                    }
                }
            }
        }
    }

    public static int A00(View view) {
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight <= 0) {
            minimumHeight = 0;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getChildCount() == 1) {
                    return A00(viewGroup.getChildAt(0));
                }
            }
        }
        return minimumHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r14, int r15, int r16, int r17, int r18) {
        /*
            r13 = this;
            int r12 = r13.getPaddingLeft()
            int r17 = r17 - r15
            int r0 = r13.getPaddingRight()
            int r11 = r17 - r0
            int r17 = r17 - r12
            int r0 = r13.getPaddingRight()
            int r17 = r17 - r0
            int r2 = r13.getMeasuredHeight()
            int r5 = r13.getChildCount()
            int r4 = r13.A05
            r1 = r4 & 112(0x70, float:1.57E-43)
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r0
            r0 = 16
            if (r1 == r0) goto La1
            r0 = 80
            if (r1 == r0) goto L97
            int r1 = r13.getPaddingTop()
        L30:
            android.graphics.drawable.Drawable r0 = r13.A08
            if (r0 != 0) goto L92
            r0 = 0
        L35:
            r8 = 0
        L36:
            if (r8 >= r5) goto Lad
            android.view.View r9 = r13.getChildAt(r8)
            if (r9 == 0) goto L80
            int r3 = r9.getVisibility()
            r2 = 8
            if (r3 == r2) goto L80
            int r7 = r9.getMeasuredWidth()
            int r10 = r9.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r6 = (android.widget.LinearLayout.LayoutParams) r6
            int r3 = r6.gravity
            if (r3 >= 0) goto L59
            r3 = r4
        L59:
            int r2 = r13.getLayoutDirection()
            int r2 = android.view.Gravity.getAbsoluteGravity(r3, r2)
            r3 = r2 & 7
            r2 = 1
            if (r3 == r2) goto L83
            r2 = 5
            if (r3 == r2) goto L8c
            int r3 = r6.leftMargin
            int r3 = r3 + r12
        L6c:
            boolean r2 = r13.A07(r8)
            if (r2 == 0) goto L73
            int r1 = r1 + r0
        L73:
            int r2 = r6.topMargin
            int r1 = r1 + r2
            int r7 = r7 + r3
            int r2 = r10 + r1
            r9.layout(r3, r1, r7, r2)
            int r2 = r6.bottomMargin
            int r10 = r10 + r2
            int r1 = r1 + r10
        L80:
            int r8 = r8 + 1
            goto L36
        L83:
            int r2 = r17 - r7
            int r3 = r2 / 2
            int r3 = r3 + r12
            int r2 = r6.leftMargin
            int r3 = r3 + r2
            goto L8e
        L8c:
            int r3 = r11 - r7
        L8e:
            int r2 = r6.rightMargin
            int r3 = r3 - r2
            goto L6c
        L92:
            int r0 = r0.getIntrinsicHeight()
            goto L35
        L97:
            int r1 = r13.getPaddingTop()
            int r1 = r1 + r18
            int r1 = r1 - r16
            int r1 = r1 - r2
            goto L30
        La1:
            int r1 = r13.getPaddingTop()
            int r18 = r18 - r16
            int r18 = r18 - r2
            int r0 = r18 / 2
            int r1 = r1 + r0
            goto L30
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
