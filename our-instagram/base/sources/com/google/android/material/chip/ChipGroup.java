package com.google.android.material.chip;

import X.AbstractC166997dE;
import X.AbstractC66345UAk;
import X.C0f9;
import X.C66341UAg;
import X.C70264WOk;
import X.WO9;
import X.X82;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class ChipGroup extends AbstractC66345UAk {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public int A05;
    public X82 A06;
    public WO9 A07;
    public final C70264WOk A08;

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            CompoundButton compoundButton = (CompoundButton) view;
            if (compoundButton.isChecked()) {
                int i2 = this.A00;
                if (i2 != -1 && this.A03) {
                    A00(this, i2, false);
                }
                this.A00 = compoundButton.getId();
            }
        }
        super.addView(view, i, layoutParams);
    }

    public int getCheckedChipId() {
        if (this.A03) {
            return this.A00;
        }
        return -1;
    }

    public List getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((CompoundButton) childAt).isChecked()) {
                AbstractC166997dE.A1W(arrayList, childAt.getId());
                if (this.A03) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.A04;
    }

    public int getChipSpacingVertical() {
        return this.A05;
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            super.A00 = i;
            requestLayout();
        }
    }

    public void setChipSpacingVertical(int i) {
        if (this.A05 != i) {
            this.A05 = i;
            super.A01 = i;
            requestLayout();
        }
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A07.A00 = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleSelection(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            this.A01 = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((CompoundButton) childAt).setChecked(false);
                }
            }
            this.A01 = false;
            this.A00 = -1;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChipGroup(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r9 = 2132018519(0x7f140557, float:1.9675347E38)
            r5 = r12
            r8 = r13
            android.content.Context r0 = X.C65K.A00(r11, r12, r13, r9)
            r10.<init>(r0, r12, r13)
            r3 = 0
            r10.A03 = r3
            android.content.res.Resources$Theme r1 = r0.getTheme()
            int[] r0 = X.C65N.A0F
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r12, r0, r3, r3)
            r1 = 1
            int r0 = r2.getDimensionPixelSize(r1, r3)
            r10.A01 = r0
            int r0 = r2.getDimensionPixelSize(r3, r3)
            r10.A00 = r0
            r2.recycle()
            X.WOk r0 = new X.WOk
            r0.<init>(r10)
            r10.A08 = r0
            X.WO9 r0 = new X.WO9
            r0.<init>(r10)
            r10.A07 = r0
            r2 = -1
            r10.A00 = r2
            r10.A01 = r3
            android.content.Context r4 = r10.getContext()
            int[] r6 = X.C65N.A07
            int[] r7 = new int[r3]
            android.content.res.TypedArray r4 = X.C65M.A00(r4, r5, r6, r7, r8, r9)
            int r5 = r4.getDimensionPixelOffset(r1, r3)
            r0 = 2
            int r0 = r4.getDimensionPixelOffset(r0, r5)
            r10.setChipSpacingHorizontal(r0)
            r0 = 3
            int r0 = r4.getDimensionPixelOffset(r0, r5)
            r10.setChipSpacingVertical(r0)
            r0 = 5
            boolean r0 = r4.getBoolean(r0, r3)
            r10.A03 = r0
            r0 = 6
            boolean r0 = r4.getBoolean(r0, r3)
            r10.setSingleSelection(r0)
            r0 = 4
            boolean r0 = r4.getBoolean(r0, r3)
            r10.A02 = r0
            int r0 = r4.getResourceId(r3, r2)
            if (r0 == r2) goto L7a
            r10.A00 = r0
        L7a:
            r4.recycle()
            X.WO9 r0 = r10.A07
            super.setOnHierarchyChangeListener(r0)
            r10.setImportantForAccessibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static void A00(ChipGroup chipGroup, int i, boolean z) {
        View findViewById = chipGroup.findViewById(i);
        if (findViewById instanceof Chip) {
            chipGroup.A01 = true;
            ((CompoundButton) findViewById).setChecked(z);
            chipGroup.A01 = false;
        }
    }

    private void setCheckedId(int i) {
        this.A00 = i;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof C66341UAg)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int A06 = C0f9.A06(119273414);
        super.onFinishInflate();
        int i = this.A00;
        if (i != -1) {
            A00(this, i, true);
            this.A00 = this.A00;
        }
        C0f9.A0D(1201006695, A06);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (super.A03) {
            i = getChipCount();
        } else {
            i = -1;
        }
        int i2 = super.A02;
        int i3 = 2;
        if (this.A03) {
            i3 = 1;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i, false, i3));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    public void setOnCheckedChangeListener(X82 x82) {
        this.A06 = x82;
    }

    public void setSelectionRequired(boolean z) {
        this.A02 = z;
    }

    public void setSingleLine(int i) {
        super.A03 = getResources().getBoolean(i);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // X.AbstractC66345UAk
    public void setSingleLine(boolean z) {
        super.A03 = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public ChipGroup(Context context) {
        this(context, null);
    }
}
