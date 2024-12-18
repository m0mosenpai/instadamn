package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.LKy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47994LKy {
    public static final int A01(Context context, int i) {
        C14360o3.A0B(context, 0);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            return typedValue.data;
        }
        return context.getColor(i2);
    }

    public static final void A03(Context context, ProgressBar progressBar, int i) {
        C14360o3.A0B(progressBar, 1);
        progressBar.getIndeterminateDrawable().setColorFilter(A01(context, i), PorterDuff.Mode.SRC_IN);
    }

    public static final void A05(Button button) {
        int A04;
        Drawable rippleDrawable;
        C14360o3.A0B(button, 0);
        button.setElevation(0.0f);
        button.setStateListAnimator(null);
        Context context = button.getContext();
        int A02 = AbstractC31171DnF.A02(context.getResources(), R.dimen.account_discovery_bottom_gap);
        button.setPadding(A02, 0, A02, 0);
        button.setAllCaps(false);
        button.setTextSize(17.0f);
        button.setTextColor(A02(context, R.attr.scButtonTextColor, R.color.abc_decor_view_status_guard_light));
        int A022 = A02(context, R.attr.sc_primary_button_background, R.color.sc_default_button_background_color);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.sc_primary_button_corner_radius, typedValue, true)) {
            if (typedValue.resourceId == 0) {
                A04 = TypedValue.complexToDimensionPixelSize(typedValue.data, AbstractC167007dF.A0K(context));
            } else {
                A04 = context.getResources().getDimensionPixelSize(typedValue.resourceId);
            }
        } else {
            A04 = AbstractC166997dE.A04(context, R.dimen.abc_button_inset_vertical_material);
        }
        float f = A04;
        int A023 = A02(context, R.attr.sc_accent_deemphasized, R.color.sc_default_button_pressed_background_color);
        if (A022 == A023) {
            rippleDrawable = AbstractC46570Kj9.A00(f, f, f, f, A022);
        } else {
            rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{A023}), AbstractC46570Kj9.A00(f, f, f, f, A022), AbstractC46570Kj9.A00(f, f, f, f, AbstractC166997dE.A03(context)));
        }
        button.setBackground(rippleDrawable);
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = AbstractC31171DnF.A02(context.getResources(), R.dimen.account_group_management_clickable_width);
            button.requestLayout();
        }
    }

    public static final float A00(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId == 0) {
            return TypedValue.complexToDimension(typedValue.data, AbstractC167007dF.A0K(context));
        }
        return AbstractC166987dD.A04(context.getResources(), typedValue.resourceId);
    }

    public static final int A02(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            int i3 = typedValue.resourceId;
            if (i3 == 0) {
                return typedValue.data;
            }
            return context.getColor(i3);
        }
        return context.getColor(i2);
    }

    public static void A04(Context context, TextView textView, int i) {
        textView.setTextColor(A01(context, i));
    }
}
