package com.instagram.igds.components.form;

import X.AbstractC111324zv;
import X.AbstractC13620mo;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31177DnL;
import X.AbstractC50522MSa;
import X.AbstractC53242c7;
import X.AbstractC55110ObT;
import X.AbstractC55922hc;
import X.AbstractC56862jK;
import X.AbstractC56922jQ;
import X.AbstractC56932jR;
import X.AbstractC56952jT;
import X.C00O;
import X.C0f9;
import X.C106904rr;
import X.C14360o3;
import X.C14640oc;
import X.C54787OJe;
import X.C55343Oh9;
import X.C55346Oi6;
import X.C57012jc;
import X.InterfaceC57949Pmv;
import X.MSX;
import X.ViewOnClickListenerC55455Ok9;
import X.ViewOnFocusChangeListenerC55349OiB;
import X.ViewOnFocusChangeListenerC55473OkS;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.google.common.base.Strings;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.Arrays;
import kotlin.Deprecated;

/* loaded from: classes9.dex */
public class IgFormField extends ConstraintLayout {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public View A04;
    public View A05;
    public EditText A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public IgImageView A0C;
    public C57012jc A0D;
    public ViewOnFocusChangeListenerC55349OiB A0E;
    public C54787OJe A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public View.OnTouchListener A0K;
    public View A0L;
    public IgTextView A0M;
    public boolean A0N;
    public final TextWatcher A0O;

    /* loaded from: classes9.dex */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = C55343Oh9.A00(1);
        public int A00;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgFormField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A02 = -1;
        this.A0O = new C55346Oi6(this, 13);
        A00(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (!this.A0I && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = new Object[0];
        if (parcelable != null) {
            C14360o3.A0C(parcelable, "null cannot be cast to non-null type com.instagram.igds.components.form.IgFormField.SavedState");
            SavedState savedState = (SavedState) parcelable;
            getMEditText().setId(savedState.A00);
            super.onRestoreInstanceState(savedState.getSuperState());
            return;
        }
        throw AbstractC166987dD.A15(Strings.A00("state is null", objArr));
    }

    @Override // android.view.View
    public void setAutofillHints(String... strArr) {
        C14360o3.A0B(strArr, 0);
        getMEditText().setAutofillHints((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void setBottomDivider(View view) {
        C14360o3.A0B(view, 0);
        this.A03 = view;
    }

    public final void setBottomSubtitleErrorView(TextView textView) {
        C14360o3.A0B(textView, 0);
        this.A07 = textView;
    }

    public final void setBottomSubtitleInfoView(TextView textView) {
        C14360o3.A0B(textView, 0);
        this.A08 = textView;
    }

    public final void setComboFieldText(String str) {
        setComboFieldText(str, null);
    }

    public final void setEditTextOnTouchListener(View.OnTouchListener onTouchListener) {
        C14360o3.A0B(onTouchListener, 0);
        this.A0K = onTouchListener;
        getMEditText().setOnTouchListener(onTouchListener);
    }

    public final void setInPickerMode(View.OnClickListener onClickListener) {
        String str;
        this.A0H = false;
        this.A0I = true;
        ViewOnFocusChangeListenerC55349OiB viewOnFocusChangeListenerC55349OiB = this.A0E;
        if (viewOnFocusChangeListenerC55349OiB != null) {
            viewOnFocusChangeListenerC55349OiB.A05 = true;
            getMEditText().setEnabled(false);
            getMEditText().setFocusable(false);
            setOnClickListener(onClickListener);
            if (this.A0J) {
                ViewOnFocusChangeListenerC55349OiB viewOnFocusChangeListenerC55349OiB2 = this.A0E;
                if (viewOnFocusChangeListenerC55349OiB2 != null) {
                    AbstractC55110ObT.A03(this, AbstractC25225BEi.A1a(viewOnFocusChangeListenerC55349OiB2.A0A.A01, "valid"), true);
                }
            } else {
                setBackgroundResource(R.drawable.bg_simple_row);
            }
            C57012jc c57012jc = this.A0D;
            str = "pickerIconViewStub";
            if (c57012jc != null) {
                ImageView imageView = (ImageView) c57012jc.A01();
                boolean z = this.A0J;
                int i = R.drawable.instagram_chevron_right_outline_rtl_16;
                if (z) {
                    i = R.drawable.instagram_chevron_down_outline_16;
                }
                imageView.setImageResource(i);
                C57012jc c57012jc2 = this.A0D;
                if (c57012jc2 != null) {
                    ImageView imageView2 = (ImageView) c57012jc2.A01();
                    Context context = getContext();
                    boolean z2 = this.A0J;
                    int i2 = R.attr.igds_color_secondary_text;
                    if (z2) {
                        i2 = R.attr.igds_color_form_field_list_icon_color;
                    }
                    AbstractC31173DnH.A11(context, imageView2, AbstractC53242c7.A0H(context, i2));
                    C57012jc c57012jc3 = this.A0D;
                    if (c57012jc3 != null) {
                        c57012jc3.A03(0);
                        View view = this.A04;
                        str = "prismComboPicker";
                        if (view != null) {
                            view.setVisibility(8);
                            View view2 = this.A04;
                            if (view2 != null) {
                                view2.setOnClickListener(null);
                                AbstractC56952jT.A01(this);
                                return;
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "ruleManager";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void setInlineLabel(TextView textView) {
        C14360o3.A0B(textView, 0);
        this.A09 = textView;
    }

    public final void setMEditText(EditText editText) {
        C14360o3.A0B(editText, 0);
        this.A06 = editText;
    }

    public final void setPrismFormFieldContainer(View view) {
        C14360o3.A0B(view, 0);
        this.A05 = view;
    }

    public final void setStateView(IgImageView igImageView) {
        C14360o3.A0B(igImageView, 0);
        this.A0C = igImageView;
    }

    public final void setText(CharSequence charSequence) {
        String str;
        C14360o3.A0B(charSequence, 0);
        getMEditText().setText(charSequence);
        getMEditText().setSelection(charSequence.length());
        boolean A1N = AbstractC167007dF.A1N(charSequence.length());
        TextView inlineLabel = getInlineLabel();
        int i = 4;
        if (A1N) {
            i = 0;
        }
        inlineLabel.setVisibility(i);
        C54787OJe c54787OJe = this.A0F;
        if (c54787OJe == null) {
            C14360o3.A0F("labelAnimationHelper");
            throw C00O.createAndThrow();
        }
        if (A1N) {
            str = "inline";
        } else {
            str = "top";
        }
        c54787OJe.A00(str, false);
    }

    public final void setTextProperty(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        setText(charSequence);
    }

    public final void setTopLabel(TextView textView) {
        C14360o3.A0B(textView, 0);
        this.A0B = textView;
    }

    public final void A0D() {
        if (this.A02 != -1 && this.A0J) {
            this.A0G = true;
            getMEditText().addTextChangedListener(this.A0O);
            TextView textView = this.A0A;
            if (textView == null) {
                C14360o3.A0F("textLimitView");
                throw C00O.createAndThrow();
            }
            AbstractC50522MSa.A13(textView, this, this.A02);
        }
    }

    public final void A0E() {
        ViewOnFocusChangeListenerC55349OiB viewOnFocusChangeListenerC55349OiB = this.A0E;
        if (viewOnFocusChangeListenerC55349OiB == null) {
            C14360o3.A0F("ruleManager");
            throw C00O.createAndThrow();
        }
        viewOnFocusChangeListenerC55349OiB.A00(true);
    }

    public final View getBottomDivider() {
        View view = this.A03;
        if (view != null) {
            return view;
        }
        C14360o3.A0F("bottomDivider");
        throw C00O.createAndThrow();
    }

    public final TextView getBottomSubtitleErrorView() {
        TextView textView = this.A07;
        if (textView != null) {
            return textView;
        }
        C14360o3.A0F("bottomSubtitleErrorView");
        throw C00O.createAndThrow();
    }

    public final TextView getBottomSubtitleInfoView() {
        TextView textView = this.A08;
        if (textView != null) {
            return textView;
        }
        C14360o3.A0F("bottomSubtitleInfoView");
        throw C00O.createAndThrow();
    }

    public final CharSequence getComboFieldText() {
        IgTextView igTextView = this.A0M;
        if (igTextView == null) {
            C14360o3.A0F("prismComboPickerTextView");
            throw C00O.createAndThrow();
        }
        return igTextView.getText();
    }

    public final TextView getInlineLabel() {
        TextView textView = this.A09;
        if (textView != null) {
            return textView;
        }
        C14360o3.A0F("inlineLabel");
        throw C00O.createAndThrow();
    }

    public final EditText getMEditText() {
        EditText editText = this.A06;
        if (editText != null) {
            return editText;
        }
        C14360o3.A0F("mEditText");
        throw C00O.createAndThrow();
    }

    public final View getPrismFormFieldContainer() {
        View view = this.A05;
        if (view != null) {
            return view;
        }
        C14360o3.A0F("prismFormFieldContainer");
        throw C00O.createAndThrow();
    }

    public final String getStateType$fbandroid_java_com_instagram_igds_components_form_form() {
        ViewOnFocusChangeListenerC55349OiB viewOnFocusChangeListenerC55349OiB = this.A0E;
        if (viewOnFocusChangeListenerC55349OiB == null) {
            C14360o3.A0F("ruleManager");
            throw C00O.createAndThrow();
        }
        return viewOnFocusChangeListenerC55349OiB.A0A.A01;
    }

    public final IgImageView getStateView() {
        IgImageView igImageView = this.A0C;
        if (igImageView != null) {
            return igImageView;
        }
        C14360o3.A0F("stateView");
        throw C00O.createAndThrow();
    }

    public final TextView getTopLabel() {
        TextView textView = this.A0B;
        if (textView != null) {
            return textView;
        }
        C14360o3.A0F("topLabel");
        throw C00O.createAndThrow();
    }

    public final void setInComboMode(View.OnClickListener onClickListener) {
        String str;
        if (this.A0J) {
            this.A0H = true;
            this.A0I = false;
            ViewOnFocusChangeListenerC55349OiB viewOnFocusChangeListenerC55349OiB = this.A0E;
            if (viewOnFocusChangeListenerC55349OiB == null) {
                str = "ruleManager";
            } else {
                viewOnFocusChangeListenerC55349OiB.A05 = false;
                View view = this.A04;
                str = "prismComboPicker";
                if (view != null) {
                    view.setVisibility(0);
                    View view2 = this.A04;
                    if (view2 != null) {
                        view2.setOnClickListener(onClickListener);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public final void setLabelText(String str) {
        ViewOnFocusChangeListenerC55349OiB viewOnFocusChangeListenerC55349OiB = this.A0E;
        String str2 = "ruleManager";
        if (viewOnFocusChangeListenerC55349OiB != null) {
            viewOnFocusChangeListenerC55349OiB.A04 = str;
            View view = this.A0L;
            if (view == null) {
                str2 = "emptyAccessibilityView";
            } else {
                view.setContentDescription(str);
                ViewOnFocusChangeListenerC55349OiB viewOnFocusChangeListenerC55349OiB2 = this.A0E;
                if (viewOnFocusChangeListenerC55349OiB2 != null) {
                    if (C14360o3.A0K(viewOnFocusChangeListenerC55349OiB2.A0A.A01, "valid") || this.A0J) {
                        getInlineLabel().setText(str);
                        getTopLabel().setText(str);
                        return;
                    }
                    return;
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public final void setMaxLength(int i) {
        if (i > 0) {
            this.A02 = i;
            getMEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
    }

    public final void setPrismMode(boolean z) {
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        this.A0J = z;
        getBottomDivider().setVisibility(AbstractC167007dF.A05(!this.A0J ? 1 : 0));
        AbstractC55110ObT.A03(this, false, false);
        if (this.A0J) {
            i = AbstractC166997dE.A05(getResources());
        } else {
            i = 0;
        }
        getPrismFormFieldContainer().setPadding(i, 0, i, 0);
        ViewGroup.LayoutParams layoutParams = getPrismFormFieldContainer().getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int i5 = i / 2;
            marginLayoutParams2.setMargins(0, i5, 0, i5);
            getPrismFormFieldContainer().setLayoutParams(marginLayoutParams2);
        }
        boolean z2 = this.A0J;
        int i6 = R.dimen.add_payment_bottom_sheet_row_subtitle_size;
        if (z2) {
            i6 = R.dimen.abc_text_size_menu_header_material;
        }
        getTopLabel().setTextSize(0, getResources().getDimension(i6));
        ViewGroup.LayoutParams layoutParams2 = getTopLabel().getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            if (this.A0J) {
                i4 = this.A00;
            } else {
                i4 = this.A01;
            }
            marginLayoutParams.setMargins(0, i4, 0, 0);
            getTopLabel().setLayoutParams(marginLayoutParams);
        }
        AbstractC55110ObT.A01(this);
        if (this.A0J) {
            i2 = this.A00;
            i3 = 0;
        } else {
            i2 = this.A01;
            i3 = i2;
        }
        getMEditText().setPadding(0, i3, 0, i2);
        EditText mEditText = getMEditText();
        Context A0L = AbstractC166997dE.A0L(this);
        AbstractC31177DnL.A0z(mEditText, A0L);
        AbstractC31177DnL.A0y(getInlineLabel(), A0L);
    }

    public final void setRuleChecker(InterfaceC57949Pmv interfaceC57949Pmv) {
        ViewOnFocusChangeListenerC55349OiB viewOnFocusChangeListenerC55349OiB = this.A0E;
        if (viewOnFocusChangeListenerC55349OiB == null) {
            C14360o3.A0F("ruleManager");
            throw C00O.createAndThrow();
        }
        viewOnFocusChangeListenerC55349OiB.A03 = interfaceC57949Pmv;
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        View.inflate(context, R.layout.form_field_layout, this);
        Resources resources = getResources();
        this.A01 = AbstractC166997dE.A08(resources);
        this.A00 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        setPrismFormFieldContainer(requireViewById(R.id.prism_form_field_container));
        setStateView(AbstractC31172DnG.A0Z(this, R.id.state_icon));
        setBottomDivider(requireViewById(R.id.form_field_bottom_divider));
        setBottomSubtitleErrorView(AbstractC166997dE.A0T(this, R.id.prism_form_field_bottom_error_text));
        setBottomSubtitleInfoView(AbstractC166997dE.A0T(this, R.id.prism_form_field_bottom_info_text));
        this.A0A = AbstractC166997dE.A0T(this, R.id.form_field_limit_text);
        this.A04 = requireViewById(R.id.combo_picker_field);
        this.A0M = AbstractC31172DnG.A0X(this, R.id.combo_picker_text);
        setMEditText((EditText) requireViewById(R.id.form_field_edit_text));
        ViewOnFocusChangeListenerC55473OkS.A00(getMEditText(), 3, this);
        C55346Oi6.A01(getMEditText(), this, 12);
        int generateViewId = View.generateViewId();
        getMEditText().setId(generateViewId);
        setInlineLabel(AbstractC166997dE.A0T(this, R.id.form_field_label_inline));
        setTopLabel(AbstractC166997dE.A0T(this, R.id.form_field_label_top));
        getTopLabel().setVisibility(4);
        this.A0L = requireViewById(R.id.empty_view_for_accessibility);
        if (AbstractC56862jK.A00(getMEditText().getContext())) {
            getTopLabel().setImportantForAccessibility(2);
            getInlineLabel().setImportantForAccessibility(2);
            View view = this.A0L;
            if (view != null) {
                view.setVisibility(0);
                View view2 = this.A0L;
                if (view2 != null) {
                    view2.setLabelFor(generateViewId);
                }
            }
            C14360o3.A0F("emptyAccessibilityView");
            throw C00O.createAndThrow();
        }
        AbstractC56932jR.A03(getTopLabel());
        int A03 = AbstractC167017dG.A03(context);
        AbstractC13880nE.A0i(this, A03, A03);
        this.A0D = AbstractC31177DnL.A0U(this, R.id.form_field_picker_icon);
        View findViewById = findViewById(R.id.form_field_end_loading_view);
        C14360o3.A0C(findViewById, AbstractC111324zv.A00(13));
        C57012jc c57012jc = new C57012jc((ViewStub) findViewById);
        View view3 = this.A0L;
        if (view3 != null) {
            this.A0E = new ViewOnFocusChangeListenerC55349OiB(view3, c57012jc, this);
            this.A0F = new C54787OJe(getInlineLabel(), getTopLabel());
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A18, 0, 0);
            C14360o3.A07(obtainStyledAttributes);
            String A00 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 0);
            if (A00 != null && A00.length() != 0) {
                setLabelText(A00);
            }
            getPrismFormFieldContainer().setOnClickListener(ViewOnClickListenerC55455Ok9.A00(this, 8));
            obtainStyledAttributes.recycle();
            setPrismMode(C14640oc.A09());
            return;
        }
        C14360o3.A0F("emptyAccessibilityView");
        throw C00O.createAndThrow();
    }

    private final C106904rr getInteractionLogger() {
        Context context = getContext();
        if (context instanceof IgFragmentActivity) {
            return ((IgFragmentActivity) context).getInteractionLogger();
        }
        return null;
    }

    public final void A0F() {
        getMEditText().setEnabled(false);
        getPrismFormFieldContainer().setEnabled(false);
        AbstractC31177DnL.A0y(getMEditText(), getContext());
    }

    public final void A0G() {
        getMEditText().requestFocus();
        Object systemService = getMEditText().getContext().getSystemService("input_method");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(getMEditText(), 1);
    }

    public final void A0H(TextWatcher textWatcher) {
        getMEditText().addTextChangedListener(textWatcher);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z) {
        super.dispatchSetPressed(z);
        if (this.A0I) {
            getPrismFormFieldContainer().setPressed(z);
        }
    }

    @Deprecated(message = "")
    public final EditText getEditText() {
        return getMEditText();
    }

    public final CharSequence getText() {
        Editable text = getMEditText().getText();
        C14360o3.A07(text);
        return text;
    }

    public final CharSequence getTextProperty() {
        return getText();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(836914370);
        super.onAttachedToWindow();
        C106904rr interactionLogger = getInteractionLogger();
        if (interactionLogger != null) {
            getMEditText().addTextChangedListener(interactionLogger);
        }
        getMEditText().setOnTouchListener(this.A0K);
        EditText mEditText = getMEditText();
        ViewOnFocusChangeListenerC55349OiB viewOnFocusChangeListenerC55349OiB = this.A0E;
        if (viewOnFocusChangeListenerC55349OiB == null) {
            C14360o3.A0F("ruleManager");
            throw C00O.createAndThrow();
        }
        mEditText.addTextChangedListener(viewOnFocusChangeListenerC55349OiB);
        C0f9.A0D(1112322413, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-1947562244);
        C106904rr interactionLogger = getInteractionLogger();
        if (interactionLogger != null) {
            AbstractC31173DnH.A1D(interactionLogger, this);
        }
        EditText mEditText = getMEditText();
        ViewOnFocusChangeListenerC55349OiB viewOnFocusChangeListenerC55349OiB = this.A0E;
        if (viewOnFocusChangeListenerC55349OiB == null) {
            C14360o3.A0F("ruleManager");
            throw C00O.createAndThrow();
        }
        mEditText.removeTextChangedListener(viewOnFocusChangeListenerC55349OiB);
        getMEditText().setOnTouchListener(null);
        super.onDetachedFromWindow();
        C0f9.A0D(-621327316, A06);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float A00;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A0N) {
            this.A0N = true;
            C54787OJe c54787OJe = this.A0F;
            if (c54787OJe == null) {
                C14360o3.A0F("labelAnimationHelper");
                throw C00O.createAndThrow();
            }
            c54787OJe.A04 = true;
            TextView textView = c54787OJe.A06;
            float f = 0.0f;
            if (textView.getHeight() == 0) {
                A00 = 0.0f;
            } else {
                A00 = MSX.A00(AbstractC166987dD.A08(c54787OJe.A07), textView);
            }
            c54787OJe.A00 = A00;
            c54787OJe.A01 = (int) (c54787OJe.A07.getY() - textView.getY());
            if (AbstractC13620mo.A02(textView.getContext())) {
                textView.setPivotX(AbstractC166987dD.A07(textView));
                f = AbstractC166987dD.A08(textView);
            } else {
                textView.setPivotX(0.0f);
            }
            textView.setPivotY(f);
            String str = c54787OJe.A03;
            if (str != null) {
                c54787OJe.A00(str, c54787OJe.A05);
                c54787OJe.A03 = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.instagram.igds.components.form.IgFormField$SavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Object[] objArr = new Object[0];
        if (onSaveInstanceState != null) {
            ?? baseSavedState = new View.BaseSavedState(onSaveInstanceState);
            baseSavedState.A00 = getMEditText().getId();
            return baseSavedState;
        }
        throw AbstractC166987dD.A15(Strings.A00("superState is null", objArr));
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        getMEditText().setFilters(inputFilterArr);
    }

    public final void setImeOptions(int i) {
        getMEditText().setImeOptions(i);
    }

    public final void setInputType(int i) {
        getMEditText().setInputType(i);
    }

    public final void setSelection(int i) {
        getMEditText().setSelection(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgFormField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A02 = -1;
        this.A0O = new C55346Oi6(this, 13);
        A00(context, attributeSet);
    }

    public final void setComboFieldText(String str, String str2) {
        String str3;
        if (this.A0H) {
            IgTextView igTextView = this.A0M;
            if (igTextView == null) {
                str3 = "prismComboPickerTextView";
            } else {
                igTextView.setText(str);
                if (str2 != null) {
                    View view = this.A04;
                    if (view == null) {
                        str3 = "prismComboPicker";
                    } else {
                        view.setContentDescription(str2);
                        return;
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F(str3);
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgFormField(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A02 = -1;
        this.A0O = new C55346Oi6(this, 13);
        A00(context, null);
    }
}
