package com.fbpay.w3c.views;

import X.AbstractC166997dE;
import X.C14360o3;
import X.C2J7;
import X.W6b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes11.dex */
public final class AutofillTextInputLayout extends TextInputLayout {
    public Drawable A00;
    public Drawable A01;
    public CharSequence A02;
    public View.OnClickListener A03;
    public final ColorStateList A04;
    public final ColorStateList A05;
    public final int A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutofillTextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A06 = i;
        CharSequence hint = getHint();
        if (hint == null) {
            EditText editText = this.A0F;
            if (editText != null) {
                hint = editText.getHint();
            } else {
                hint = null;
            }
        }
        this.A02 = hint;
        this.A05 = this.A0C;
        int[][] iArr = {new int[]{R.attr.state_enabled}, new int[]{-16842910}};
        Context A0L = AbstractC166997dE.A0L(this);
        this.A04 = new ColorStateList(iArr, new int[]{W6b.A01(A0L, com.facebook.R.attr.w3c_bottom_sheet_error_text_color), W6b.A01(A0L, com.facebook.R.attr.w3c_bottom_sheet_error_text_color)});
        this.A00 = A0L.getDrawable(com.facebook.R.drawable.instagram_activity_error_badge);
        C2J7.A00().A01.getValue();
    }

    public final int getDefStyleAttr() {
        return this.A06;
    }

    public final View.OnClickListener getInitCardScanner() {
        return this.A03;
    }

    public final void A0N(String str) {
        CharSequence hint = getHint();
        if (str != null) {
            if (!C14360o3.A0K(hint, str)) {
                setDefaultHintTextColor(this.A04);
                Drawable drawable = this.A1D.getDrawable();
                if (drawable != null) {
                    this.A01 = drawable;
                }
                setEndIconDrawable(this.A00);
                setHint(str);
                return;
            }
            return;
        }
        CharSequence charSequence = this.A02;
        if (!(!C14360o3.A0K(hint, charSequence))) {
            return;
        }
        setHint(charSequence);
        setDefaultHintTextColor(this.A05);
        if (!C14360o3.A0K(this.A1D.getDrawable(), this.A00)) {
            return;
        }
        setEndIconDrawable(this.A01);
    }

    public final void setInitCardScanner(View.OnClickListener onClickListener) {
        this.A03 = onClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutofillTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutofillTextInputLayout(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }
}
