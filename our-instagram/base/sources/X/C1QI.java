package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.1QI, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1QI {
    public static final int A01(Context context) {
        C14360o3.A0B(context, 0);
        if (A0E().ordinal() == 1) {
            return R.color.igds_prism_primary_borderless_button_indigo;
        }
        return AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button);
    }

    public static final int A05(Context context, C1QL c1ql) {
        if (c1ql.ordinal() == 1) {
            return R.color.igds_prism_primary_button_background_indigo;
        }
        return AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button);
    }

    public static final int A06(Context context, C1QL c1ql) {
        C14360o3.A0B(c1ql, 1);
        if (c1ql.ordinal() == 1) {
            return R.color.igds_prism_primary_button_label_indigo;
        }
        return AbstractC53242c7.A0H(context, R.attr.igds_color_text_on_color);
    }

    public static final int A07(Context context, C1QL c1ql) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c1ql, 1);
        if (c1ql.ordinal() == 1) {
            return R.color.igds_prism_secondary_button_label_A;
        }
        return AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text);
    }

    public static final int A08(Context context, C1QL c1ql) {
        C14360o3.A0B(c1ql, 1);
        if (c1ql.ordinal() == 1) {
            return R.color.igds_prism_secondary_borderless_button_label_a;
        }
        return AbstractC53242c7.A07(context);
    }

    public static final ColorStateList A09(Context context) {
        int A0H;
        C14360o3.A0B(context, 0);
        C1QL A0E = A0E();
        C14360o3.A0B(A0E, 1);
        if (A0E.ordinal() == 1) {
            A0H = R.color.igds_prism_secondary_button_background_A;
        } else {
            A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_button_panavision);
        }
        ColorStateList A02 = C02G.A02(context, A0H);
        if (A02 == null) {
            ColorStateList valueOf = ColorStateList.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_button_panavision)));
            C14360o3.A07(valueOf);
            return valueOf;
        }
        return A02;
    }

    public static final ColorStateList A0B(Context context, C1QL c1ql) {
        C14360o3.A0B(context, 0);
        if (c1ql == null) {
            c1ql = A0E();
        }
        ColorStateList A02 = C02G.A02(context, A05(context, c1ql));
        if (A02 == null) {
            ColorStateList valueOf = ColorStateList.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button)));
            C14360o3.A07(valueOf);
            return valueOf;
        }
        return A02;
    }

    public static final ColorStateList A0C(Context context, C1QL c1ql) {
        C14360o3.A0B(context, 0);
        if (c1ql == null) {
            c1ql = A0E();
        }
        ColorStateList A02 = C02G.A02(context, A06(context, c1ql));
        if (A02 == null) {
            ColorStateList valueOf = ColorStateList.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_text_on_color)));
            C14360o3.A07(valueOf);
            return valueOf;
        }
        return A02;
    }

    public static final Drawable A0D(Context context, boolean z) {
        int A0H;
        C14360o3.A0B(context, 0);
        if (A0E().ordinal() == 1) {
            A0H = R.drawable.dynamic_empty_story_badge_vector_drawable;
            if (z) {
                A0H = R.drawable.dynamic_empty_story_badge_vector_drawable_light;
            }
        } else {
            A0H = AbstractC53242c7.A0H(context, R.attr.emptyStoryBadge);
        }
        return C52112aB.A02().A05(context, A0H);
    }

    public static final void A0G(View view, TextView textView) {
        C14360o3.A0B(textView, 0);
        C14360o3.A0B(view, 1);
        C1QL A0E = A0E();
        if (A0E != C1QL.A03) {
            Context context = textView.getContext();
            GradientDrawable gradientDrawable = new GradientDrawable();
            C14360o3.A0A(context);
            gradientDrawable.setColor(A0B(context, null));
            gradientDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.abc_button_padding_horizontal_material));
            view.setBackground(gradientDrawable);
            textView.setTextColor(context.getColor(A06(context, A0E)));
        }
    }

    public static final void A0H(View view, TextView textView) {
        C14360o3.A0B(textView, 0);
        C14360o3.A0B(view, 1);
        C1QL A0E = A0E();
        if (A0E != C1QL.A03) {
            Context context = textView.getContext();
            A0F(view);
            int[][] iArr = {new int[]{android.R.attr.state_selected}, new int[0]};
            C14360o3.A0A(context);
            textView.setTextColor(new ColorStateList(iArr, new int[]{context.getColor(A07(context, A0E)), context.getColor(A07(context, A0E))}));
        }
    }

    public static final void A0I(TextView textView, int i) {
        C14360o3.A0B(textView, 0);
        if (A0E().A00) {
            textView.setTextColor(C02G.A02(textView.getContext(), A00(R.color.igds_primary_button)));
        } else {
            textView.setTextColor(i);
        }
    }

    public static final C1QL A0E() {
        C14650od c14650od = C14650od.A03;
        if (c14650od != null) {
            boolean A06 = C18U.A06(C06090Tz.A05, c14650od.A00, 36329277225976041L);
            if (Boolean.valueOf(A06) != null && A06) {
                return C1QL.A04;
            }
        }
        return C1QL.A03;
    }

    public static final int A00(int i) {
        if (A0E().ordinal() == 1) {
            return R.color.igds_prism_indigo_borderless_button_link;
        }
        return i;
    }

    public static final int A02(Context context) {
        if (A0E() == C1QL.A04 && C14640oc.A0B()) {
            return R.color.igds_prism_primary_borderless_button_indigo;
        }
        return AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button);
    }

    public static final int A03(Context context) {
        if (A0E().ordinal() == 1) {
            return R.color.igds_prism_indigo_primary_borderless_button_label;
        }
        return AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button);
    }

    public static /* synthetic */ int A04(Context context) {
        int color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_icon));
        if (A0E().A00) {
            return context.getColor(A00(R.color.igds_primary_button));
        }
        return color;
    }

    public static final ColorStateList A0A(Context context) {
        int A0H;
        C1QL A0E = A0E();
        C14360o3.A0B(A0E, 1);
        if (A0E.ordinal() == 1) {
            A0H = R.color.igds_prism_secondary_button_background_a;
        } else {
            A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_button_panavision);
        }
        ColorStateList A02 = C02G.A02(context, A0H);
        if (A02 == null) {
            ColorStateList valueOf = ColorStateList.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_button_panavision)));
            C14360o3.A07(valueOf);
            return valueOf;
        }
        return A02;
    }

    public static final void A0F(View view) {
        C1QL A0E = A0E();
        if (A0E != C1QL.A03) {
            Context context = view.getContext();
            GradientDrawable gradientDrawable = new GradientDrawable();
            if (A0E == C1QL.A04) {
                gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(R.dimen.afi_segmented_pill_border_width), context.getColor(R.color.igds_prism_secondary_button_border_A));
            }
            C14360o3.A0A(context);
            gradientDrawable.setColor(A09(context));
            gradientDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.abc_button_padding_horizontal_material));
            view.setBackground(gradientDrawable);
        }
    }
}
