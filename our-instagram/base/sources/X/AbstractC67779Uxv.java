package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.facebookpay.form.view.BaseAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.Uxv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC67779Uxv extends TextInputLayout {
    public int A00;
    public GradientDrawable A01;
    public ImageView A02;
    public ProgressBar A03;
    public BaseAutoCompleteTextView A04;
    public int A05;
    public boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC67779Uxv(Context context) {
        super(new ContextThemeWrapper(context, R.style.InputFieldContainerStyle), null, 0);
        C2FP.A0E();
        Context context2 = getContext();
        LayoutInflater.from(context2).inflate(R.layout.fbpay_edit_text_input_layout, this);
        setInputText((BaseAutoCompleteTextView) requireViewById(R.id.auto_complete_edit_text));
        setIcon((ImageView) requireViewById(R.id.icon));
        ProgressBar progressBar = (ProgressBar) requireViewById(R.id.spinner_icon);
        this.A03 = progressBar;
        GradientDrawable gradientDrawable = null;
        if (progressBar == null) {
            C14360o3.A0F("loadingSpinnerIcon");
            throw C00O.createAndThrow();
        }
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            C2FP.A0A();
            C14360o3.A07(context2);
            AbstractC25228BEl.A1H(PorterDuff.Mode.MULTIPLY, indeterminateDrawable, context2.getColor(R.color.igds_secondary_icon));
        }
        getInputText().setTextAlignment(5);
        BaseAutoCompleteTextView inputText = getInputText();
        C14360o3.A07(context2);
        inputText.setTextSize(0, W6b.A00(context2, R.attr.fbpay_input_field_text_size));
        A0Q(false, false);
        setOrientation(0);
        getInputText().setBackground(null);
        getInputText().setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_enabled}, new int[]{-16842910}}, new int[]{W6b.A01(context2, R.attr.fbpay_primary_text_color), W6b.A01(context2, R.attr.fbpay_disabled_text_color)}));
        getInputText().setPadding(0, (int) W6b.A00(context2, R.attr.fbpay_input_field_text_top_padding), 0, 0);
        setBackgroundResource(W6b.A02(context2, R.attr.fbpay_input_field_background));
        if (getBackground() instanceof GradientDrawable) {
            Drawable background = getBackground();
            C14360o3.A0C(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            gradientDrawable = (GradientDrawable) background;
        }
        this.A01 = gradientDrawable;
        this.A00 = (int) W6b.A00(context2, R.attr.fbpay_input_field_border_stroke);
        A0P(VEQ.A06, false);
        int A00 = (int) W6b.A00(context2, R.attr.fbpay_input_field_bottom_padding);
        int A002 = (int) W6b.A00(context2, R.attr.fbpay_input_field_top_padding);
        int A003 = (int) W6b.A00(context2, R.attr.fbpay_input_field_horizontal_padding);
        setPadding(A003, A002, A003, A00);
    }

    public final void A0O(Drawable drawable, View.OnClickListener onClickListener, Integer num) {
        C14360o3.A0B(drawable, 0);
        ProgressBar progressBar = this.A03;
        if (progressBar == null) {
            C14360o3.A0F("loadingSpinnerIcon");
            throw C00O.createAndThrow();
        }
        progressBar.setVisibility(8);
        getIcon().setImageDrawable(drawable);
        getIcon().setOnClickListener(onClickListener);
        if (num != null) {
            ViewGroup.LayoutParams layoutParams = getIcon().getLayoutParams();
            layoutParams.height = getResources().getDimensionPixelSize(num.intValue());
            getIcon().setLayoutParams(layoutParams);
        }
        getIcon().setVisibility(0);
    }

    public final void setIcon(ImageView imageView) {
        C14360o3.A0B(imageView, 0);
        this.A02 = imageView;
    }

    public final void setInputText(BaseAutoCompleteTextView baseAutoCompleteTextView) {
        C14360o3.A0B(baseAutoCompleteTextView, 0);
        this.A04 = baseAutoCompleteTextView;
    }

    public final void setStyle(VEQ veq) {
        C14360o3.A0B(veq, 0);
        A0P(veq, true);
    }

    public final void A0P(VEQ veq, boolean z) {
        int i;
        int i2;
        GradientDrawable gradientDrawable = this.A01;
        if (gradientDrawable != null) {
            gradientDrawable.mutate();
            if (veq == VEQ.A05) {
                i2 = this.A05;
            } else {
                i2 = this.A00;
            }
            gradientDrawable.setStroke(i2, W6b.A01(AbstractC166997dE.A0L(this), veq.A00));
        }
        if (z) {
            Integer num = veq.A02;
            if (num != null) {
                int intValue = num.intValue();
                Integer num2 = veq.A01;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 33;
                }
                A0O(C2FP.A0A().A04(AbstractC166997dE.A0L(this), intValue, i), null, Integer.valueOf(R.dimen.abc_select_dialog_padding_start_material));
                return;
            }
            getIcon().setVisibility(8);
        }
    }

    public final ImageView getIcon() {
        ImageView imageView = this.A02;
        if (imageView != null) {
            return imageView;
        }
        C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
        throw C00O.createAndThrow();
    }

    public final BaseAutoCompleteTextView getInputText() {
        BaseAutoCompleteTextView baseAutoCompleteTextView = this.A04;
        if (baseAutoCompleteTextView != null) {
            return baseAutoCompleteTextView;
        }
        C14360o3.A0F("inputText");
        throw C00O.createAndThrow();
    }

    public final void setShowLoadingSpinner(boolean z) {
        if (z) {
            getIcon().setVisibility(8);
            ProgressBar progressBar = this.A03;
            if (progressBar != null) {
                progressBar.setVisibility(0);
                return;
            }
        } else {
            ProgressBar progressBar2 = this.A03;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
                return;
            }
        }
        C14360o3.A0F("loadingSpinnerIcon");
        throw C00O.createAndThrow();
    }

    public final void A0N() {
        GradientDrawable gradientDrawable;
        Context A0L = AbstractC166997dE.A0L(this);
        setBackgroundResource(W6b.A02(A0L, R.attr.fbpay_box_input_field_background));
        if (getBackground() instanceof GradientDrawable) {
            Drawable background = getBackground();
            C14360o3.A0C(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            gradientDrawable = (GradientDrawable) background;
        } else {
            gradientDrawable = null;
        }
        this.A01 = gradientDrawable;
        this.A00 = (int) W6b.A00(A0L, R.attr.fbpay_box_input_field_border_stroke);
        this.A05 = (int) W6b.A00(A0L, R.attr.fbpay_box_input_field_focus_border_stroke);
        A0P(VEQ.A06, false);
    }

    public final void A0Q(boolean z, boolean z2) {
        int i;
        int[][] iArr = {new int[]{android.R.attr.state_enabled}, new int[]{-16842910}};
        Context A0L = AbstractC166997dE.A0L(this);
        if (z) {
            i = R.attr.fbpay_error_text_color;
        } else if (z2) {
            boolean z3 = this.A06;
            i = R.attr.fbpay_focus_color;
            if (z3) {
                i = R.attr.fbpay_box_input_focus_color;
            }
        } else {
            i = R.attr.fbpay_hint_text_color;
        }
        setDefaultHintTextColor(new ColorStateList(iArr, new int[]{W6b.A01(A0L, i), W6b.A01(A0L, R.attr.fbpay_disabled_text_color)}));
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(this);
            int i3 = A0G.leftMargin;
            Context A0L = AbstractC166997dE.A0L(this);
            boolean z = this.A06;
            int i4 = R.attr.fbpay_input_field_margin_top;
            if (z) {
                i4 = R.attr.fbpay_box_input_field_margin_top;
            }
            int A00 = (int) W6b.A00(A0L, i4);
            int i5 = A0G.rightMargin;
            boolean z2 = this.A06;
            int i6 = R.attr.fbpay_input_field_margin_bottom;
            if (z2) {
                i6 = R.attr.fbpay_box_input_field_margin_bottom;
            }
            A0G.setMargins(i3, A00, i5, (int) W6b.A00(A0L, i6));
        }
        if (getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            C14360o3.A0C(layoutParams, AbstractC111324zv.A00(35));
            ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        super.setId(i);
        getInputText().setDropDownAnchor(i);
    }
}
