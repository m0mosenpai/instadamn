package com.instagram.ui.widget.pageindicator;

import X.AbstractC13880nE;
import X.C14360o3;
import X.C41L;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public final class CircleWithProgressPageIndicator extends CirclePageIndicator {
    public final int A00;
    public final int A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleWithProgressPageIndicator(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    @Override // com.instagram.ui.widget.pageindicator.CirclePageIndicator
    public int getViewWidth() {
        int i = ((CirclePageIndicator) this).A08;
        if (i == -1) {
            i = 0;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i2 = ((C41L) this).A05;
        int i3 = CirclePageIndicator.A0N + i;
        return ((((paddingLeft + ((i2 * 2) * i3)) + ((i2 - 1) * ((C41L) this).A07)) + this.A01) + this.A00) - (i3 * 2);
    }

    @Override // com.instagram.ui.widget.pageindicator.CirclePageIndicator
    public int getTargetScrollPosition() {
        int i;
        int paddingLeft = getPaddingLeft();
        int i2 = ((C41L) this).A05;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 < i2) {
                int i5 = CirclePageIndicator.A0N;
                int i6 = paddingLeft + i5;
                int i7 = ((CirclePageIndicator) this).A06;
                if (i4 == i7) {
                    int i8 = i6 - i5;
                    int i9 = this.A00 + i8;
                    int i10 = ((C41L) this).A07;
                    i = i9 + (i10 * 2);
                    if (i2 > ((C41L) this).A06) {
                        if (i7 > 1) {
                            i8 -= (i5 * 2) + i10;
                        }
                        if (i7 < i2 - 2) {
                            i += (i5 * 2) + i10;
                        }
                    }
                    i3 = i8;
                } else {
                    paddingLeft = i6 + i5 + ((C41L) this).A07;
                    i4++;
                }
            } else {
                i = 0;
                break;
            }
        }
        int paddingLeft2 = i3 - getPaddingLeft();
        int width = (i - getWidth()) + getPaddingRight();
        if (width > getScrollX()) {
            return width;
        }
        if (paddingLeft2 >= getScrollX()) {
            return getScrollX();
        }
        return paddingLeft2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleWithProgressPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        this.A00 = (int) TypedValue.applyDimension(1, 16.0f, displayMetrics);
        this.A01 = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleWithProgressPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
