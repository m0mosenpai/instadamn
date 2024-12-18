package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.WEe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70164WEe {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public TextView A0B;
    public TextView A0C;
    public C56352iT A0D;
    public C69651Vss A0E;
    public V01 A0F;
    public boolean A0J;
    public final int A0K;
    public final ValueAnimator A0L;
    public final ColorDrawable A0M;
    public final ColorDrawable A0N;
    public final Drawable A0O;
    public final Drawable A0P;
    public final Drawable A0Q;
    public final Drawable A0R;
    public final V01 A0T;
    public final int A0U;
    public final Activity A0V;
    public final UserSession A0X;
    public boolean A0I = false;
    public String A0H = "";
    public String A0G = "";
    public final InterfaceC60122ou A0W = new C70568Wd2(this, 0);
    public final C68816VcX A0S = new C68816VcX(this);

    public static void A00(Context context, C70164WEe c70164WEe) {
        int A02 = AbstractC13950nL.A02(c70164WEe.A00, context.getColor(c70164WEe.A0T.A00()), c70164WEe.A0U);
        int round = Math.round(c70164WEe.A00 * 255.0f);
        ColorFilter A00 = C3DY.A00(A02);
        c70164WEe.A0O.setColorFilter(A00);
        c70164WEe.A0P.setColorFilter(A00);
        c70164WEe.A0R.setColorFilter(A00);
        c70164WEe.A0Q.setColorFilter(A00);
        c70164WEe.A0M.setAlpha(round);
        c70164WEe.A0N.setAlpha(round);
        View view = c70164WEe.A05;
        if (view != null) {
            float alpha = view.getAlpha();
            float f = c70164WEe.A00;
            if (alpha != f) {
                view.setAlpha(f);
            }
        }
    }

    public static void A01(C70164WEe c70164WEe) {
        if (c70164WEe.A0I) {
            int i = c70164WEe.A03;
            if (i <= c70164WEe.A02) {
                ValueAnimator valueAnimator = c70164WEe.A0L;
                if (!valueAnimator.isRunning() && Float.compare(c70164WEe.A00, 1.0f) == 0) {
                    valueAnimator.reverse();
                    return;
                }
                return;
            }
            if (i < c70164WEe.A01) {
                return;
            }
            ValueAnimator valueAnimator2 = c70164WEe.A0L;
            if (valueAnimator2.isRunning() || Float.compare(c70164WEe.A00, 0.0f) != 0) {
                return;
            }
            valueAnimator2.start();
        }
    }

    public static void A02(C70164WEe c70164WEe) {
        View view = c70164WEe.A07;
        int i = 4;
        if (view != null) {
            int i2 = 0;
            if (c70164WEe.A0J) {
                i2 = 4;
            }
            view.setVisibility(i2);
        }
        View view2 = c70164WEe.A08;
        if (view2 != null) {
            if (!c70164WEe.A0J) {
                i = 0;
            }
            view2.setVisibility(i);
        }
    }

    public final void A03() {
        if (this.A0D != null) {
            A00(this.A0V, this);
            this.A0D.A0X(this.A0W);
        }
    }

    public C70164WEe(Activity activity, UserSession userSession, C69651Vss c69651Vss, V01 v01) {
        this.A0V = activity;
        this.A0E = c69651Vss;
        this.A0U = activity.getColor(AbstractC53242c7.A08(activity));
        int A00 = AbstractC56402iY.A00(activity);
        this.A0K = A00;
        this.A0M = new ColorDrawable(AbstractC167007dF.A09(activity, R.attr.igds_color_secondary_background));
        this.A0N = new ColorDrawable(A00);
        int A002 = v01.A00();
        this.A0O = C3LQ.A08(activity, R.drawable.instagram_x_pano_outline_24, A002, R.drawable.instagram_x_pano_outline_24, R.color.bright_foreground_disabled_material_dark);
        this.A0R = C3LQ.A08(activity, R.drawable.instagram_direct_pano_outline_24, A002, R.drawable.instagram_direct_pano_outline_24, R.color.bright_foreground_disabled_material_dark);
        this.A0Q = C3LQ.A08(activity, R.drawable.instagram_more_vertical_pano_outline_24, A002, R.drawable.instagram_more_vertical_pano_outline_24, R.color.bright_foreground_disabled_material_dark);
        this.A0P = C3LQ.A08(activity, R.drawable.instagram_info_pano_outline_24, A002, R.drawable.instagram_info_pano_outline_24, R.color.bright_foreground_disabled_material_dark);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0L = ofFloat;
        ofFloat.setDuration(200L);
        this.A0X = userSession;
        this.A0T = v01;
    }
}
