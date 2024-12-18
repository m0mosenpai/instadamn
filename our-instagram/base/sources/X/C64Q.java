package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import kotlin.Deprecated;

@Deprecated(message = "You should NOT use this directly and should only use [IgdsBottomButtonLayout] instead.")
/* renamed from: X.64Q, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64Q extends C64P {
    public View A00;
    public View A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public SpinnerImageView A07;

    public static final void A01(Context context, TypedArray typedArray, View view, TextView textView, C64Q c64q, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            textView.setText(context.getText(resourceId));
            view.setContentDescription(context.getText(resourceId));
            view.setVisibility(0);
            textView.setVisibility(0);
        } else {
            A02(view, textView, c64q, typedArray.getText(i));
        }
        c64q.A00();
    }

    public static final void A02(View view, TextView textView, C64Q c64q, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            textView.setText(charSequence);
            view.setVisibility(0);
            view.setContentDescription(charSequence);
        } else {
            view.setVisibility(8);
        }
        c64q.A00();
    }

    @Override // X.C64P
    public void setButtonType(C64R c64r) {
        C14360o3.A0B(c64r, 0);
        A03(c64r, this, this.A06 == null);
    }

    private final void A00() {
        TextView textView;
        TextView textView2;
        CharSequence text;
        CharSequence text2;
        TextView textView3 = this.A05;
        if (textView3 == null) {
            C14360o3.A0F("primaryAction");
            throw C00O.createAndThrow();
        }
        CharSequence text3 = textView3.getText();
        int i = 0;
        if ((text3 == null || text3.length() == 0) && (((textView = this.A06) == null || (text2 = textView.getText()) == null || text2.length() == 0) && ((textView2 = this.A03) == null || (text = textView2.getText()) == null || text.length() == 0))) {
            i = 8;
        }
        setVisibility(i);
    }

    public static final void A03(C64R c64r, C64Q c64q, boolean z) {
        if (c64r == C64R.A03) {
            String str = "primaryAction";
            TextView textView = c64q.A05;
            if (z) {
                if (textView != null) {
                    textView.setTextAppearance(R.style.IgPrimaryButton_Large_FullWidthMediaButton);
                    TextView textView2 = c64q.A05;
                    if (textView2 != null) {
                        textView2.setBackground(c64q.getContext().getDrawable(R.drawable.primary_media_bottom_button_full_width_selector));
                        return;
                    }
                }
            } else if (textView != null) {
                textView.setTextAppearance(R.style.IgButton_IgPrimaryMediaButton_Large);
                Context context = c64q.getContext();
                Drawable drawable = context.getDrawable(R.drawable.primary_media_bottom_button_selector);
                View view = c64q.A02;
                if (view == null) {
                    str = "primaryActionContainer";
                } else {
                    view.setBackground(drawable);
                    TextView textView3 = c64q.A06;
                    if (textView3 != null) {
                        textView3.setTextAppearance(R.style.IgButton_IgPrimaryMediaButton_Inverse_Large);
                    }
                    int dimensionPixelSize = c64q.getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                    TextView textView4 = c64q.A03;
                    if (textView4 == null) {
                        return;
                    }
                    textView4.setShadowLayer(dimensionPixelSize, 0.0f, 0.0f, context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_shadow_on_media)));
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r0.getVisibility() != 8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07() {
        /*
            r4 = this;
            android.widget.TextView r0 = r4.A06
            r3 = 1
            r2 = 8
            if (r0 == 0) goto Le
            int r0 = r0.getVisibility()
            r1 = 1
            if (r0 == r2) goto Lf
        Le:
            r1 = 0
        Lf:
            android.widget.TextView r0 = r4.A03
            if (r0 == 0) goto L26
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L26
        L19:
            android.view.View r0 = r4.A01
            if (r0 == 0) goto L25
            if (r1 == 0) goto L22
            if (r3 == 0) goto L22
            r2 = 0
        L22:
            r0.setVisibility(r2)
        L25:
            return
        L26:
            r3 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64Q.A07():void");
    }

    public final View getExtraBottomPadding() {
        return this.A01;
    }

    @Override // X.C64P
    public void setDividerVisible(boolean z) {
        View view = this.A00;
        if (view != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    @Override // X.C64P
    public void setPrimaryActionIsLoading(boolean z) {
        SpinnerImageView spinnerImageView = this.A07;
        if (spinnerImageView != null) {
            int i = 0;
            int i2 = 8;
            if (z) {
                i2 = 0;
            }
            spinnerImageView.setVisibility(i2);
            TextView textView = this.A05;
            if (textView == null) {
                C14360o3.A0F("primaryAction");
                throw C00O.createAndThrow();
            }
            if (z) {
                i = 8;
            }
            textView.setVisibility(i);
            setPrimaryButtonEnabled(!z);
        }
    }

    @Override // X.C64P
    public void setPrimaryActionOnClickListener(View.OnClickListener onClickListener) {
        View view = this.A02;
        if (view == null) {
            C14360o3.A0F("primaryActionContainer");
            throw C00O.createAndThrow();
        }
        view.setOnClickListener(onClickListener);
    }

    @Override // X.C64P
    public void setPrimaryActionText(CharSequence charSequence) {
        String str;
        TextView textView = this.A05;
        if (textView == null) {
            str = "primaryAction";
        } else {
            View view = this.A02;
            if (view == null) {
                str = "primaryActionContainer";
            } else {
                A02(view, textView, this, charSequence);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C64P
    public void setPrimaryButtonEnabled(boolean z) {
        View view = this.A02;
        if (view != null) {
            view.setEnabled(z);
            View view2 = this.A02;
            if (view2 != null) {
                Drawable background = view2.getBackground();
                if (background != null) {
                    int i = 77;
                    if (z) {
                        i = 255;
                    }
                    background.setAlpha(i);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F("primaryActionContainer");
        throw C00O.createAndThrow();
    }

    @Override // X.C64P
    public void setSecondaryActionOnClickListener(View.OnClickListener onClickListener) {
        TextView textView = this.A06;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    @Override // X.C64P
    public void setSecondaryActionText(CharSequence charSequence) {
        TextView textView = this.A06;
        if (textView != null) {
            A02(textView, textView, this, charSequence);
            A07();
        }
    }

    @Override // X.C64P
    public void setSecondaryButtonEnabled(boolean z) {
        TextView textView = this.A06;
        if (textView != null) {
            textView.setEnabled(z);
        }
        TextView textView2 = this.A06;
        if (textView2 != null) {
            float f = 0.25f;
            if (z) {
                f = 1.0f;
            }
            textView2.setAlpha(f);
        }
    }

    public final void setExtraBottomPadding(View view) {
        this.A01 = view;
    }
}
