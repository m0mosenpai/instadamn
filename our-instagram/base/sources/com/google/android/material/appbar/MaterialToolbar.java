package com.google.android.material.appbar;

import X.AbstractC63123SdR;
import X.C0f9;
import X.C65K;
import X.C65M;
import X.C65N;
import X.C65O;
import X.C72C;
import X.MSY;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.R;

/* loaded from: classes11.dex */
public class MaterialToolbar extends Toolbar {
    public Integer A00;
    public boolean A01;
    public boolean A02;

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        Integer num;
        if (drawable != null && (num = this.A00) != null) {
            drawable.setTint(num.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setSubtitleCentered(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            requestLayout();
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C65K.A00(context, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i);
        int i2;
        Context context2 = getContext();
        TypedArray A00 = C65M.A00(context2, attributeSet, C65N.A0T, new int[0], i, R.style.Widget_MaterialComponents_Toolbar);
        if (A00.hasValue(0)) {
            setNavigationIconTint(A00.getColor(0, -1));
        }
        this.A02 = A00.getBoolean(2, false);
        this.A01 = A00.getBoolean(1, false);
        A00.recycle();
        Drawable background = getBackground();
        if (background != null && !(background instanceof ColorDrawable)) {
            return;
        }
        C65O c65o = new C65O();
        if (background != null) {
            i2 = ((ColorDrawable) background).getColor();
        } else {
            i2 = 0;
        }
        c65o.A0F(ColorStateList.valueOf(i2));
        c65o.A0E(context2);
        c65o.A0A(getElevation());
        setBackground(c65o);
    }

    private void A00(Pair pair, View view) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Number) pair.first).intValue() - i, 0), Math.max(i2 - ((Number) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-866186139);
        super.onAttachedToWindow();
        C72C.A00(this);
        C0f9.A0D(-1079993379, A06);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView;
        TextView textView2;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A02 && !this.A01) {
            return;
        }
        CharSequence charSequence = this.A0J;
        int i5 = 0;
        while (true) {
            if (i5 < getChildCount()) {
                View childAt = getChildAt(i5);
                if (childAt instanceof TextView) {
                    textView = (TextView) childAt;
                    if (TextUtils.equals(textView.getText(), charSequence)) {
                        break;
                    }
                }
                i5++;
            } else {
                textView = null;
                break;
            }
        }
        CharSequence charSequence2 = this.A0I;
        int i6 = 0;
        while (true) {
            if (i6 < getChildCount()) {
                View childAt2 = getChildAt(i6);
                if (childAt2 instanceof TextView) {
                    textView2 = (TextView) childAt2;
                    if (TextUtils.equals(textView2.getText(), charSequence2)) {
                        break;
                    }
                }
                i6++;
            } else {
                textView2 = null;
                break;
            }
        }
        if (textView == null && textView2 == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i7 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt3 = getChildAt(i8);
            if (childAt3.getVisibility() != 8 && childAt3 != textView && childAt3 != textView2) {
                if (childAt3.getRight() < i7 && childAt3.getRight() > paddingLeft) {
                    paddingLeft = childAt3.getRight();
                }
                if (childAt3.getLeft() > i7 && childAt3.getLeft() < paddingRight) {
                    paddingRight = childAt3.getLeft();
                }
            }
        }
        Pair A0D = MSY.A0D(Integer.valueOf(paddingLeft), paddingRight);
        if (this.A02 && textView != null) {
            A00(A0D, textView);
        }
        if (!this.A01 || textView2 == null) {
            return;
        }
        A00(A0D, textView2);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C72C.A01(this, f);
    }

    public void setNavigationIconTint(int i) {
        this.A00 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context) {
        this(context, null);
    }
}
