package com.instagram.ui.text;

import X.C0f9;
import X.C14360o3;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.Filterable;
import com.instagram.common.ui.base.IgSimpleAutoCompleteTextView;

/* loaded from: classes11.dex */
public final class FreeAutoCompleteTextView extends IgSimpleAutoCompleteTextView {
    public int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreeAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = super.getThreshold();
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        if (this.A00 != 0) {
            if (getText() != null && getText().length() >= this.A00) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public int getThreshold() {
        return this.A00;
    }

    @Override // android.widget.AutoCompleteTextView
    public void setAdapter(Filterable filterable) {
        super.setAdapter((FreeAutoCompleteTextView) filterable);
        A00();
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i) {
        if (i < 0) {
            i = 1;
        }
        this.A00 = i;
        A00();
    }

    private final void A00() {
        if (!isTemporarilyDetached() && enoughToFilter() && getAdapter() != null) {
            performFiltering(getText(), 0);
            showDropDown();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = C0f9.A06(-2073548998);
        super.onFocusChanged(z, i, rect);
        if (z) {
            A00();
        }
        C0f9.A0D(942823085, A06);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreeAutoCompleteTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        this.A00 = super.getThreshold();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreeAutoCompleteTextView(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) {
        super(context, attributeSet, i, i2, theme);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreeAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A00 = super.getThreshold();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreeAutoCompleteTextView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A00 = super.getThreshold();
    }
}
