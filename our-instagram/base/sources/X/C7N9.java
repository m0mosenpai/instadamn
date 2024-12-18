package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.7N9, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7N9 {
    public static boolean A00;

    public static final int A00(Context context, boolean z) {
        int A01;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        C14360o3.A0B(context, 0);
        if (z) {
            A01 = (int) (AbstractC13890nF.A01(context) * 0.9d);
            if (A00 && A01 > (dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.ar_effect_picker_background_height))) {
                A01 = dimensionPixelSize2;
            }
            int A012 = ((AbstractC13890nF.A01(context) - context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material)) - context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width)) - (context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material) * 2);
            if (A01 > A012) {
                return A012;
            }
        } else {
            A01 = (int) (AbstractC13890nF.A01(context) * 0.711d);
            if (A00 && A01 > (dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ar_effect_picker_background_height))) {
                return dimensionPixelSize;
            }
        }
        return A01;
    }

    public static final void A01(View view) {
        C14360o3.A0B(view, 0);
        A03(view, 0.711d);
    }

    public static final void A02(View view) {
        C14360o3.A0B(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            Context context = view.getContext();
            C14360o3.A07(context);
            int A01 = (int) (AbstractC13890nF.A01(context) * 0.711d);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ar_effect_picker_background_height);
            if (A01 > dimensionPixelSize) {
                A01 = dimensionPixelSize;
            }
            layoutParams.width = A01;
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A03(View view, double d) {
        int dimensionPixelSize;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            Context context = view.getContext();
            C14360o3.A07(context);
            int A01 = (int) (AbstractC13890nF.A01(context) * d);
            if (A00 && A01 > (dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ar_effect_picker_background_height))) {
                A01 = dimensionPixelSize;
            }
            layoutParams.width = A01;
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
