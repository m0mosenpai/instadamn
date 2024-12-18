package com.instagram.ui.widget.editphonenumber;

import X.AbstractC10360h2;
import X.AbstractC13880nE;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31181DnP;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.AnonymousClass001;
import X.AnonymousClass780;
import X.C06090Tz;
import X.C0f9;
import X.C106904rr;
import X.C18U;
import X.C35754Fqr;
import X.Em3;
import X.EnumC33365Eoy;
import X.GY8;
import X.InterfaceC37212GaN;
import X.RunnableC36869GMq;
import X.VBB;
import X.ViewOnClickListenerC35675FpA;
import X.ViewOnClickListenerC35682FpH;
import X.ViewOnFocusChangeListenerC35693FpT;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.common.session.UserSession;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;

/* loaded from: classes6.dex */
public class EditPhoneNumberView extends LinearLayout {
    public ViewGroup A00;
    public EditText A01;
    public ImageView A02;
    public ImageView A03;
    public CountryCodeTextView A04;
    public InlineErrorMessageView A05;
    public boolean A06;
    public UserSession A07;
    public boolean A08;
    public final PhoneNumberUtil A09;
    public final Runnable A0A;

    public static void A01(Fragment fragment, AbstractC10360h2 abstractC10360h2, UserSession userSession, EnumC33365Eoy enumC33365Eoy, GY8 gy8, InterfaceC37212GaN interfaceC37212GaN, EditPhoneNumberView editPhoneNumberView) {
        editPhoneNumberView.A07 = userSession;
        CountryCodeData A00 = AnonymousClass780.A00(editPhoneNumberView.getContext());
        String str = editPhoneNumberView.A04.A00;
        if (str == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            if (!"+1".equals(A00.A00()) && C18U.A06(C06090Tz.A05, userSession, 2342155445872886899L)) {
                editPhoneNumberView.setCountryCodeWithPlus(A00);
            } else {
                editPhoneNumberView.A04.setCountryCodeWithPlus("+1");
            }
        }
        ViewOnClickListenerC35675FpA viewOnClickListenerC35675FpA = new ViewOnClickListenerC35675FpA(9, userSession, interfaceC37212GaN, abstractC10360h2, fragment, gy8);
        editPhoneNumberView.A04.setOnClickListener(viewOnClickListenerC35675FpA);
        editPhoneNumberView.A03.setOnClickListener(viewOnClickListenerC35675FpA);
        if (editPhoneNumberView.A08) {
            editPhoneNumberView.A02.setOnClickListener(ViewOnClickListenerC35682FpH.A00(editPhoneNumberView, 19));
        }
        editPhoneNumberView.A01.setOnFocusChangeListener(new ViewOnFocusChangeListenerC35693FpT(2, editPhoneNumberView, interfaceC37212GaN));
        C35754Fqr.A00(editPhoneNumberView.A01, interfaceC37212GaN, 22);
        editPhoneNumberView.A01.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        editPhoneNumberView.A01.addTextChangedListener(new Em3(enumC33365Eoy, interfaceC37212GaN, editPhoneNumberView));
        editPhoneNumberView.A04.addTextChangedListener(new VBB(3, editPhoneNumberView, interfaceC37212GaN));
        editPhoneNumberView.A01.addTextChangedListener(C106904rr.A00(editPhoneNumberView.A07));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.A01.clearFocus();
        AbstractC13880nE.A0O(this.A01);
    }

    public String getCountryCode() {
        String str = this.A04.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getCountryCodeWithoutPlus() {
        return this.A04.getCountryCodeWithoutPlus();
    }

    public String getPhone() {
        return AbstractC167007dF.A0g(this.A01);
    }

    public String getPhoneNumber() {
        String str = this.A04.A00;
        if (str == null) {
            str = "";
        }
        String stripSeparators = PhoneNumberUtils.stripSeparators(AnonymousClass001.A0g(str, " ", AbstractC167007dF.A0g(this.A01)));
        stripSeparators.getClass();
        return stripSeparators;
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        this.A01.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public void setCountryCodeWithCountryPrefix(CountryCodeData countryCodeData) {
        this.A04.setCountryCodeWithCountryPrefix(countryCodeData);
    }

    public void setCountryCodeWithPlus(CountryCodeData countryCodeData) {
        this.A04.setCountryCodeWithPlus(countryCodeData);
        this.A01.postDelayed(this.A0A, 200L);
    }

    public void setHint(int i) {
        this.A01.setHint(i);
    }

    public void setupEditPhoneNumberView(CountryCodeData countryCodeData, String str) {
        this.A04.setCountryCodeWithCountryPrefix(countryCodeData);
        if (str != null && !str.isEmpty()) {
            this.A01.setText(AbstractC31181DnP.A0H(str));
        }
    }

    public EditPhoneNumberView(Context context) {
        super(context);
        this.A06 = false;
        this.A09 = PhoneNumberUtil.A01(getContext());
        this.A0A = new RunnableC36869GMq(this);
        A00(context, null);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        int i3;
        Context context2 = getContext();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context2).inflate(R.layout.layout_edit_phone_view, this);
        this.A00 = viewGroup;
        this.A04 = (CountryCodeTextView) viewGroup.requireViewById(R.id.country_code_picker);
        this.A01 = AbstractC31173DnH.A0H(this.A00, R.id.phone_number);
        this.A02 = AbstractC31173DnH.A0I(this.A00, R.id.clear_button);
        this.A03 = AbstractC31173DnH.A0I(this.A00, R.id.country_code_drop_down);
        this.A05 = (InlineErrorMessageView) this.A00.requireViewById(R.id.phone_inline_error);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0T);
            if (obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) {
                this.A04.setCompoundDrawablesWithIntrinsicBounds(R.drawable.instagram_device_phone_pano_outline_24, 0, 0, 0);
                AbstractC166997dE.A1F(this.A04.getCompoundDrawables()[0].mutate(), AbstractC53242c7.A01(context2));
                if (obtainStyledAttributes.hasValue(5)) {
                    this.A04.setCompoundDrawablePadding(obtainStyledAttributes.getDimensionPixelSize(5, R.dimen.abc_button_padding_horizontal_material));
                }
            }
            if (obtainStyledAttributes.hasValue(2) && obtainStyledAttributes.getBoolean(2, false)) {
                this.A04.setTypeface(null, 1);
            }
            if (obtainStyledAttributes.hasValue(3)) {
                this.A04.setTextColor(obtainStyledAttributes.getColor(3, 0));
            }
            if (obtainStyledAttributes.hasValue(0)) {
                this.A08 = obtainStyledAttributes.getBoolean(0, false);
            }
            if (obtainStyledAttributes.hasValue(6)) {
                i = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            } else {
                i = 0;
            }
            if (obtainStyledAttributes.hasValue(7)) {
                i2 = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            } else {
                i2 = 0;
            }
            if (obtainStyledAttributes.hasValue(8)) {
                i3 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            } else {
                i3 = 0;
            }
            this.A04.setPadding(i2, 0, i, 0);
            this.A01.setPadding(i, 0, i3, 0);
            if (obtainStyledAttributes.hasValue(10)) {
                float dimension = obtainStyledAttributes.getDimension(10, 0.0f);
                this.A04.setTextSize(0, dimension);
                this.A01.setTextSize(0, dimension);
            }
            boolean z = obtainStyledAttributes.getBoolean(1, false);
            this.A06 = z;
            if (z) {
                Resources resources = getResources();
                int A05 = AbstractC166997dE.A05(resources);
                this.A00.requireViewById(R.id.phone_number_container).setBackgroundResource(AbstractC53242c7.A0H(context, R.attr.textEditBackground));
                this.A00.requireViewById(R.id.phone_number_container).setPadding(A05, 0, A05, 0);
                AbstractC31172DnG.A1F(resources, this.A00.requireViewById(R.id.phone_number_container).getLayoutParams(), R.dimen.container_height);
                this.A00.requireViewById(R.id.phone_number_container).requestLayout();
                this.A03.setVisibility(0);
                this.A01.setPadding(resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), 0, 0, 0);
                this.A03.setBackgroundResource(R.drawable.container_divider);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public TextView getCountryCodeTextView() {
        return this.A04;
    }

    public EditText getNumberEditText() {
        return this.A01;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1312548448);
        super.onDetachedFromWindow();
        this.A01.removeCallbacks(this.A0A);
        UserSession userSession = this.A07;
        if (userSession != null) {
            this.A01.removeTextChangedListener(C106904rr.A00(userSession));
        }
        C0f9.A0D(-656689200, A06);
    }

    public EditPhoneNumberView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = false;
        this.A09 = PhoneNumberUtil.A01(getContext());
        this.A0A = new RunnableC36869GMq(this);
        A00(context, attributeSet);
    }

    public void setHint(String str) {
        this.A01.setHint(str);
    }

    public void setupEditPhoneNumberView(String str, String str2) {
        this.A04.setCountryCodeWithPlus(str);
        if (str2 != null && !str2.isEmpty()) {
            this.A01.setText(AbstractC31181DnP.A0H(str2));
        }
    }
}
