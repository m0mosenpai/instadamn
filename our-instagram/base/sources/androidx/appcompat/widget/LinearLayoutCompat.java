package androidx.appcompat.widget;

import X.AbstractC010103p;
import X.AbstractC53402cO;
import X.AbstractC65702TsY;
import X.AnonymousClass001;
import X.C71x;
import X.UCE;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: classes11.dex */
public class LinearLayoutCompat extends ViewGroup {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Drawable A08;
    public boolean A09;
    public boolean A0A;
    public int[] A0B;
    public int[] A0C;
    public int A0D;
    public int A0E;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        int resourceId;
        this.A09 = true;
        this.A01 = -1;
        this.A02 = 0;
        this.A05 = 8388659;
        int[] iArr = AbstractC53402cO.A0D;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        AbstractC010103p.A06(context, obtainStyledAttributes, attributeSet, this, iArr, i, 0);
        int i2 = obtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        if (!obtainStyledAttributes.getBoolean(2, true)) {
            this.A09 = false;
        }
        this.A00 = obtainStyledAttributes.getFloat(4, -1.0f);
        this.A01 = obtainStyledAttributes.getInt(3, -1);
        this.A0A = obtainStyledAttributes.getBoolean(7, false);
        if (obtainStyledAttributes.hasValue(5) && (resourceId = obtainStyledAttributes.getResourceId(5, 0)) != 0) {
            drawable = C71x.A00(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(5);
        }
        setDividerDrawable(drawable);
        this.A0E = obtainStyledAttributes.getInt(8, 0);
        this.A0D = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    public final boolean A07(int i) {
        int i2;
        if (i == 0) {
            i2 = this.A0E & 1;
        } else if (i == getChildCount()) {
            i2 = this.A0E & 4;
        } else {
            if ((this.A0E & 2) == 0) {
                return false;
            }
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() == 8) {
                }
            }
            return false;
        }
        return i2 != 0;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this instanceof ActionMenuView) {
            return ((ActionMenuView) this).generateLayoutParams(layoutParams);
        }
        if (!(layoutParams instanceof UCE) && !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return new LinearLayout.LayoutParams(layoutParams);
        }
        return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
    }

    public void setWeightSum(float f) {
        this.A00 = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void A05(Canvas canvas, int i) {
        this.A08.setBounds(getPaddingLeft() + this.A0D, i, AbstractC65702TsY.A08(this) - this.A0D, this.A03 + i);
        this.A08.draw(canvas);
    }

    public final void A06(Canvas canvas, int i) {
        this.A08.setBounds(i, getPaddingTop() + this.A0D, this.A04 + i, AbstractC65702TsY.A07(this) - this.A0D);
        this.A08.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.UDo, android.view.ViewGroup$LayoutParams, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this instanceof ActionMenuView) {
            ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.A04 = false;
            ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
            return layoutParams;
        }
        int i = this.A06;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.A01 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.A01;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.A01 == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.A02;
            if (this.A06 == 1 && (i = this.A05 & 112) != 48) {
                if (i != 16) {
                    if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.A07;
                    }
                } else {
                    i3 += (AbstractC65702TsY.A0A(this, getBottom() - getTop()) - this.A07) / 2;
                }
            }
            return i3 + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.A01;
    }

    public Drawable getDividerDrawable() {
        return this.A08;
    }

    public int getDividerPadding() {
        return this.A0D;
    }

    public int getDividerWidth() {
        return this.A04;
    }

    public int getGravity() {
        return this.A05;
    }

    public int getOrientation() {
        return this.A06;
    }

    public int getShowDividers() {
        return this.A0E;
    }

    public float getWeightSum() {
        return this.A00;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.A08 != null) {
            if (this.A06 == 1) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt != null && childAt.getVisibility() != 8 && A07(i2)) {
                        A05(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin) - this.A03);
                    }
                }
                if (A07(childCount)) {
                    View childAt2 = getChildAt(childCount - 1);
                    if (childAt2 == null) {
                        bottom = AbstractC65702TsY.A07(this) - this.A03;
                    } else {
                        bottom = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) childAt2.getLayoutParams()).bottomMargin;
                    }
                    A05(canvas, bottom);
                    return;
                }
                return;
            }
            int childCount2 = getChildCount();
            boolean z = true;
            if (getLayoutDirection() != 1) {
                z = false;
            }
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt3 = getChildAt(i3);
                if (childAt3 != null && childAt3.getVisibility() != 8 && A07(i3)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt3.getLayoutParams();
                    if (z) {
                        left2 = childAt3.getRight() + marginLayoutParams.rightMargin;
                    } else {
                        left2 = (childAt3.getLeft() - marginLayoutParams.leftMargin) - this.A04;
                    }
                    A06(canvas, left2);
                }
            }
            if (A07(childCount2)) {
                View childAt4 = getChildAt(childCount2 - 1);
                if (childAt4 == null) {
                    if (z) {
                        right = getPaddingLeft();
                    } else {
                        left = getWidth();
                        i = getPaddingRight();
                        right = (left - i) - this.A04;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt4.getLayoutParams();
                    if (z) {
                        left = childAt4.getLeft();
                        i = marginLayoutParams2.leftMargin;
                        right = (left - i) - this.A04;
                    } else {
                        right = childAt4.getRight() + marginLayoutParams2.rightMargin;
                    }
                }
                A06(canvas, right);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0201, code lost:
    
        if (((android.view.ViewGroup.LayoutParams) r12).width == (-1)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x020d, code lost:
    
        if (((android.view.ViewGroup.LayoutParams) r12).width != r9) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03cc, code lost:
    
        if (((android.view.ViewGroup.LayoutParams) r6).height != (-1)) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0598, code lost:
    
        if (((android.view.ViewGroup.LayoutParams) r4).height != (-1)) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x05b6, code lost:
    
        if (((android.view.ViewGroup.LayoutParams) r4).height != (-1)) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0108, code lost:
    
        if (((android.view.ViewGroup.LayoutParams) r4).width != (-1)) goto L57;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.A01 = i;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("base aligned child index out of range (0, ", ")", getChildCount()));
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.A08) {
            this.A08 = drawable;
            boolean z = false;
            if (drawable != null) {
                this.A04 = drawable.getIntrinsicWidth();
                this.A03 = drawable.getIntrinsicHeight();
            } else {
                this.A04 = 0;
                this.A03 = 0;
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setGravity(int i) {
        if (this.A05 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.A05 = i;
            requestLayout();
        }
    }

    public void setOrientation(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.A0E) {
            requestLayout();
        }
        this.A0E = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.A05;
        if ((i3 & 112) != i2) {
            this.A05 = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof UCE;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void setBaselineAligned(boolean z) {
        this.A09 = z;
    }

    public void setDividerPadding(int i) {
        this.A0D = i;
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.A05;
        if ((8388615 & i3) != i2) {
            this.A05 = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.A0A = z;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        boolean z = this instanceof ActionMenuView;
        Context context = getContext();
        if (z) {
            return new LinearLayout.LayoutParams(context, attributeSet);
        }
        return new LinearLayout.LayoutParams(context, attributeSet);
    }
}
