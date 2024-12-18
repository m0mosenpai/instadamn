package com.facebookpay.form.view;

import X.C0f9;
import X.C14360o3;
import X.C25531Mh;
import X.C2FP;
import X.C50365MLr;
import X.C70256WOb;
import X.InterfaceC16820sZ;
import X.InterfaceC71853X7l;
import X.MSY;
import X.UB7;
import X.UFS;
import X.UFU;
import X.VHc;
import X.Wai;
import X.Wap;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.autofill.AutofillValue;
import android.widget.AdapterView;
import com.facebook.R;
import com.facebookpay.logging.LoggingContext;

/* loaded from: classes11.dex */
public final class BaseAutoCompleteTextView extends UB7 {
    public InterfaceC71853X7l A00;
    public Integer A01;
    public InterfaceC16820sZ A02;
    public InterfaceC16820sZ A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A00();
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        super.setOnItemClickListener(new C70256WOb(onItemClickListener, 1));
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        Integer num = this.A01;
        if (num != null) {
            return num.intValue();
        }
        return super.getAutofillType();
    }

    public final InterfaceC16820sZ getOnAutofillListener() {
        return this.A02;
    }

    public final InterfaceC16820sZ getOnAutofillPromptListener() {
        return this.A03;
    }

    public final InterfaceC71853X7l getOnShowListener() {
        return this.A00;
    }

    private final void A00() {
        Context context = getContext();
        Drawable drawable = context.getDrawable(R.drawable.apm_buttons_shimmer_background);
        C2FP.A0A();
        int color = context.getColor(R.color.igds_elevated_background);
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(color);
        } else if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(color);
        } else if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(color);
        }
        setDropDownBackgroundDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
        InterfaceC16820sZ interfaceC16820sZ = this.A02;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        Wap wap;
        UFU ufu;
        LoggingContext loggingContext;
        VHc vHc;
        int A06 = C0f9.A06(26264688);
        super.onFocusChanged(z, i, rect);
        if (z && getAdapter() != null) {
            performFiltering(getText(), 0);
            if (getAdapter() != null && !isPopupShowing() && hasFocus() && getAdapter().getCount() > 0) {
                InterfaceC71853X7l interfaceC71853X7l = this.A00;
                if (interfaceC71853X7l != null) {
                    Wai wai = (Wai) interfaceC71853X7l;
                    int i2 = wai.A00;
                    if (i2 != 0 && i2 != 1) {
                        if (i2 == 2 || i2 == 5) {
                            wap = C2FP.A01().A04;
                            ufu = wai.A01;
                            loggingContext = ufu.A0R;
                            vHc = VHc.SHIPPING_ADDRESS;
                        }
                    } else {
                        wap = C2FP.A01().A04;
                        ufu = wai.A01;
                        loggingContext = ufu.A0R;
                        vHc = VHc.CONTACT_INFO;
                    }
                    Wap.A03(new C25531Mh(MSY.A0H(wap.A00, "client_load_ecpautofill_display"), 51), loggingContext, new C50365MLr(vHc, loggingContext, UFS.A01(ufu.A0S), "nux_checkout", 12));
                }
                showDropDown();
            }
        }
        C0f9.A0D(-677820535, A06);
    }

    public final void setAutofillType(Integer num) {
        this.A01 = num;
    }

    public final void setOnAutofillListener(InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = interfaceC16820sZ;
    }

    public final void setOnAutofillPromptListener(InterfaceC16820sZ interfaceC16820sZ) {
        this.A03 = interfaceC16820sZ;
    }

    public final void setOnShowListener(InterfaceC71853X7l interfaceC71853X7l) {
        this.A00 = interfaceC71853X7l;
    }

    public final void setParentAnchorId(int i) {
        setDropDownAnchor(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        C14360o3.A0B(context, 1);
        A00();
    }

    @Override // android.widget.TextView, android.view.View
    public final Integer getAutofillType() {
        return this.A01;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAutoCompleteTextView(Context context) {
        super(context, null, R.attr.autoCompleteTextViewStyle);
        C14360o3.A0B(context, 1);
        A00();
    }
}
