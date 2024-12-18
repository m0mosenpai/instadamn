package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.4dr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC99734dr {
    public void A09(View view, TextView textView, boolean z) {
        C14360o3.A0B(textView, 1);
        float f = 0.3f;
        if (z) {
            f = 1.0f;
        }
        textView.setAlpha(f);
    }

    public void A0A(View view, TextView textView, boolean z) {
        float f;
        C14360o3.A0B(textView, 1);
        C14360o3.A0B(view, 2);
        if (z) {
            f = 0.7f;
        } else {
            f = 0.3f;
            if (view.isEnabled()) {
                f = 1.0f;
            }
        }
        textView.setAlpha(f);
    }

    public void A01() {
        String str;
        Resources resources;
        int i;
        Resources resources2;
        int i2;
        if (this instanceof C99744du) {
            C99744du c99744du = (C99744du) this;
            str = "resources";
            if (c99744du.A0C.A00 && c99744du.A06 == EnumC99714dp.A03) {
                resources2 = c99744du.A05;
                if (resources2 != null) {
                    i2 = R.dimen.account_discovery_bottom_gap;
                    c99744du.A01 = resources2.getDimensionPixelSize(i2);
                    return;
                }
            } else {
                resources2 = c99744du.A05;
                if (resources2 != null) {
                    i2 = R.dimen.abc_button_padding_horizontal_material;
                    c99744du.A01 = resources2.getDimensionPixelSize(i2);
                    return;
                }
            }
        } else {
            if (!(this instanceof C99754dv)) {
                return;
            }
            C99754dv c99754dv = (C99754dv) this;
            str = "resources";
            if (c99754dv.A08.A00 && c99754dv.A04 == EnumC99714dp.A03) {
                resources = c99754dv.A03;
                if (resources != null) {
                    i = R.dimen.account_discovery_bottom_gap;
                    c99754dv.A00 = resources.getDimensionPixelSize(i);
                    return;
                }
            } else {
                resources = c99754dv.A03;
                if (resources != null) {
                    i = R.dimen.abc_button_padding_horizontal_material;
                    c99754dv.A00 = resources.getDimensionPixelSize(i);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public void A02(int i, int i2) {
        if (this instanceof C99744du) {
            C99744du c99744du = (C99744du) this;
            RectF rectF = c99744du.A0B;
            rectF.set(0.0f, 0.0f, i, i2);
            if (c99744du.A0C.A00) {
                RectF rectF2 = c99744du.A0A;
                float f = rectF.left;
                float f2 = c99744du.A00 / 2.0f;
                rectF2.set(new RectF(f + f2, rectF.top + f2, rectF.right - f2, rectF.bottom - f2));
                return;
            }
            return;
        }
        if (!(this instanceof C99754dv)) {
            return;
        }
        ((C99754dv) this).A07.set(0.0f, 0.0f, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A03(Resources resources, TextView textView) {
        int A0H;
        ColorStateList colorStateList;
        int A0H2;
        String str;
        C99754dv c99754dv;
        if (this instanceof C99744du) {
            C99744du c99744du = (C99744du) this;
            C14360o3.A0B(textView, 0);
            Context context = textView.getContext();
            C14360o3.A07(context);
            ColorStateList A09 = C1QI.A09(context);
            c99744du.A03 = A09;
            Paint paint = c99744du.A09;
            paint.setColor(A09.getDefaultColor());
            paint.setStyle(Paint.Style.FILL);
            ColorStateList A02 = C02G.A02(context, C1QI.A07(context, C1QI.A0E()));
            if (A02 == null) {
                A02 = ColorStateList.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text)));
                C14360o3.A07(A02);
            }
            c99744du.A04 = A02;
            str = "textViewColorStateList";
            textView.setTextColor(A02);
            textView.setAlpha(1.0f);
            ColorStateList colorStateList2 = c99744du.A04;
            if (colorStateList2 != null) {
                textView.setCompoundDrawableTintList(colorStateList2);
                if (c99744du.A0C == C1QL.A04) {
                    c99744du.A00 = resources.getDimensionPixelSize(R.dimen.afi_segmented_pill_border_width);
                    ColorStateList A022 = C02G.A02(context, R.color.igds_prism_secondary_button_border_A);
                    c99744du.A02 = A022;
                    if (A022 != null) {
                        c99744du.A08.setColor(A022.getDefaultColor());
                    }
                    Paint paint2 = c99744du.A08;
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(c99744du.A00);
                }
                c99744du.A05 = resources;
                c99754dv = c99744du;
                c99754dv.A01();
                return;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        if (this instanceof C99754dv) {
            C99754dv c99754dv2 = (C99754dv) this;
            C14360o3.A0B(textView, 0);
            Context context2 = textView.getContext();
            C14360o3.A07(context2);
            ColorStateList A0B = C1QI.A0B(context2, c99754dv2.A05);
            c99754dv2.A01 = A0B;
            Paint paint3 = c99754dv2.A06;
            paint3.setColor(A0B.getDefaultColor());
            paint3.setStyle(Paint.Style.FILL);
            ColorStateList A0C = C1QI.A0C(context2, c99754dv2.A05);
            c99754dv2.A02 = A0C;
            str = "textViewColorStateList";
            textView.setTextColor(A0C);
            textView.setAlpha(1.0f);
            ColorStateList colorStateList3 = c99754dv2.A02;
            if (colorStateList3 != null) {
                textView.setCompoundDrawableTintList(colorStateList3);
                c99754dv2.A03 = resources;
                c99754dv = c99754dv2;
                c99754dv.A01();
                return;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        if (this instanceof C110674yf) {
            C110674yf c110674yf = (C110674yf) this;
            C14360o3.A0B(textView, 0);
            Context context3 = textView.getContext();
            if (c110674yf.A01.ordinal() == 1) {
                A0H2 = R.color.igds_prism_indigo_primary_borderless_button_label;
            } else {
                A0H2 = AbstractC53242c7.A0H(context3, R.attr.igds_color_primary_button);
            }
            ColorStateList A023 = C02G.A02(context3, A0H2);
            c110674yf.A00 = A023;
            textView.setTextColor(A023);
            colorStateList = c110674yf.A00;
        } else {
            C99724dq c99724dq = (C99724dq) this;
            C14360o3.A0B(textView, 0);
            Context context4 = textView.getContext();
            if (c99724dq.A01.ordinal() == 1) {
                A0H = R.color.igds_prism_secondary_borderless_button_label_A;
            } else {
                A0H = AbstractC53242c7.A0H(context4, R.attr.igds_color_primary_text);
            }
            ColorStateList A024 = C02G.A02(context4, A0H);
            c99724dq.A00 = A024;
            textView.setTextColor(A024);
            colorStateList = c99724dq.A00;
        }
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public void A04(Canvas canvas) {
        RectF rectF;
        float f;
        Paint paint;
        if (this instanceof C99744du) {
            C99744du c99744du = (C99744du) this;
            RectF rectF2 = c99744du.A0B;
            float f2 = c99744du.A01;
            canvas.drawRoundRect(rectF2, f2, f2, c99744du.A09);
            if (c99744du.A0C == C1QL.A04) {
                rectF = c99744du.A0A;
                f = c99744du.A01;
                paint = c99744du.A08;
            } else {
                return;
            }
        } else {
            if ((this instanceof C110674yf) || !(this instanceof C99754dv)) {
                return;
            }
            C99754dv c99754dv = (C99754dv) this;
            rectF = c99754dv.A07;
            f = c99754dv.A00;
            paint = c99754dv.A06;
        }
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    public void A05(View view, View view2, TextView textView, boolean z) {
        if (this instanceof C99744du) {
            C99744du c99744du = (C99744du) this;
            C14360o3.A0B(textView, 1);
            C14360o3.A0B(view2, 3);
            int i = 8;
            int i2 = 0;
            if (z) {
                i2 = 8;
            }
            textView.setVisibility(i2);
            if (z) {
                i = 0;
            }
            view2.setVisibility(i);
            C99744du.A00(textView, c99744du, view.isPressed(), view.isEnabled());
            return;
        }
        if (this instanceof C99754dv) {
            C99754dv c99754dv = (C99754dv) this;
            C14360o3.A0B(textView, 1);
            C14360o3.A0B(view2, 3);
            int i3 = 8;
            int i4 = 0;
            if (z) {
                i4 = 8;
            }
            textView.setVisibility(i4);
            if (z) {
                i3 = 0;
            }
            view2.setVisibility(i3);
            C99754dv.A00(c99754dv, view.isEnabled(), view.isPressed());
            return;
        }
        C14360o3.A0B(textView, 1);
        C14360o3.A0B(view2, 3);
        int i5 = 0;
        int i6 = 0;
        if (z) {
            i6 = 4;
        }
        textView.setVisibility(i6);
        if (!z) {
            i5 = 8;
        }
        view2.setVisibility(i5);
    }

    public final void A06(TextView textView, boolean z) {
        if (this instanceof C99744du) {
            C99744du c99744du = (C99744du) this;
            C14360o3.A0B(textView, 1);
            if (z != c99744du.A07) {
                c99744du.A07 = z;
                Paint paint = c99744du.A09;
                Context context = textView.getContext();
                int i = R.attr.igds_color_secondary_button_panavision;
                if (z) {
                    i = R.attr.igds_color_secondary_button_elevated_panavision;
                }
                paint.setColor(context.getColor(AbstractC53242c7.A0H(context, i)));
            }
        }
    }

    public void A07(EnumC99714dp enumC99714dp) {
        if (!(this instanceof C99724dq)) {
            if (this instanceof C99744du) {
                ((C99744du) this).A06 = enumC99714dp;
            } else {
                if (!(this instanceof C99754dv)) {
                    return;
                }
                ((C99754dv) this).A04 = enumC99714dp;
            }
        }
    }

    public void A08(SpinnerImageView spinnerImageView) {
        Context context;
        int i;
        int i2;
        if (this instanceof C99744du) {
            C14360o3.A0B(spinnerImageView, 0);
            context = spinnerImageView.getContext();
            C14360o3.A07(context);
            i = R.drawable.nav_spinner;
            i2 = R.attr.igds_color_primary_icon;
        } else {
            boolean z = this instanceof C99754dv;
            C14360o3.A0B(spinnerImageView, 0);
            context = spinnerImageView.getContext();
            C14360o3.A0A(context);
            i = R.drawable.nav_spinner;
            if (z) {
                i2 = R.attr.igds_color_text_on_color;
            } else {
                i2 = R.attr.igds_color_secondary_icon;
            }
        }
        spinnerImageView.setImageDrawable(AbstractC85953sP.A01(context, i, AbstractC53242c7.A0H(context, i2)));
    }
}
