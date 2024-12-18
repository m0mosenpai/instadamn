package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.facebook.R;

/* renamed from: X.8BW, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8BW {
    public static C8Ba A00;

    public static final ObjectAnimator A01(View view) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "rotation", -0.5f, 0.5f).setDuration(180L);
        C14360o3.A07(duration);
        duration.setRepeatCount(-1);
        duration.setRepeatMode(2);
        duration.addListener(new AMy(view));
        return duration;
    }

    public static final C8Ba A02(Context context) {
        C8Ba c8Ba = A00;
        if (c8Ba == null) {
            int i = context.getResources().getDisplayMetrics().widthPixels;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height);
            int ceil = (int) Math.ceil((i - dimensionPixelSize) / dimensionPixelSize);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_circle_size);
            C206789Dj c206789Dj = new C206789Dj(ceil, 2);
            C206779Di c206779Di = new C206779Di(ceil, 1);
            C183318Be c183318Be = C183318Be.A00;
            Bitmap.Config config = Bitmap.Config.RGB_565;
            int i2 = dimensionPixelSize * dimensionPixelSize2;
            C14360o3.A0B(config, 0);
            int i3 = C8BY.A00[config.ordinal()];
            int i4 = 4;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        i4 = 1;
                    }
                } else {
                    i4 = 2;
                }
            }
            C8Ba c8Ba2 = new C8Ba(config, c206789Dj, c183318Be, new C8BZ(dimensionPixelSize, dimensionPixelSize2), c206779Di, dimensionPixelSize, dimensionPixelSize2, i2 * i4);
            A00 = c8Ba2;
            return c8Ba2;
        }
        return c8Ba;
    }

    public static final C8Ba A03(Context context, int i) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        C206789Dj c206789Dj = new C206789Dj(i, 1);
        C206779Di c206779Di = new C206779Di(i, 0);
        C8BX c8bx = C8BX.A00;
        Bitmap.Config config = Bitmap.Config.RGB_565;
        int i2 = dimensionPixelSize * dimensionPixelSize2;
        C14360o3.A0B(config, 0);
        int i3 = C8BY.A00[config.ordinal()];
        int i4 = 4;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    i4 = 1;
                }
            } else {
                i4 = 2;
            }
        }
        return new C8Ba(config, c206789Dj, c8bx, new C8BZ(dimensionPixelSize, dimensionPixelSize2), c206779Di, dimensionPixelSize, dimensionPixelSize2, i2 * i4);
    }

    public static final int A00(Context context, int i) {
        return (((context.getResources().getDisplayMetrics().widthPixels - (context.getResources().getDisplayMetrics().widthPixels - i)) / 2) - context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material)) - context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
    }
}
