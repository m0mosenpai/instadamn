package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vrz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69596Vrz {
    public final Context A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;

    public C69596Vrz(View view) {
        this.A00 = view.getContext();
        this.A03 = (TextView) view.requireViewById(R.id.slider_results_summary_emoji);
        this.A01 = (ImageView) view.requireViewById(R.id.slider_results_summary_slider);
        this.A02 = (TextView) view.requireViewById(R.id.slider_results_summary_description);
    }

    public final void A00(UserSession userSession, C38321qM c38321qM) {
        float f;
        String A0k;
        C38826H7x c38826H7x;
        float f2;
        float f3;
        Wm2 A00 = AbstractC140316Wj.A00(c38321qM);
        A00.getClass();
        C14360o3.A0B(userSession, 1);
        C41160IJz A0L = C57722kl.A00(userSession).A0L(A00);
        if (A0L != null && (c38826H7x = A0L.A01) != null) {
            int A01 = A00.A01();
            Float f4 = A00.A00.A02;
            if (f4 != null) {
                f2 = f4.floatValue();
            } else {
                f2 = 0.0f;
            }
            Float f5 = c38826H7x.A01;
            if (f5 != null) {
                f3 = f5.floatValue();
            } else {
                f3 = 0.0f;
            }
            f = ((f2 * A01) + f3) / (A01 + 1);
        } else {
            Float f6 = A00.A00.A02;
            if (f6 != null) {
                f = f6.floatValue();
            } else {
                f = 0.0f;
            }
        }
        C41160IJz A0L2 = C57722kl.A00(userSession).A0L(A00);
        int A012 = A00.A01();
        if (A0L2 != null) {
            A012++;
        }
        String str = A00.A00.A06;
        if (str == null) {
            str = "😍";
        }
        Context context = this.A00;
        Resources resources = context.getResources();
        int A0A = AbstractC13880nE.A0A(context) / 2;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.browser_error_screen_description_width) / 2;
        int i = A0A - dimensionPixelSize2;
        int i2 = A0A + dimensionPixelSize2;
        float f7 = dimensionPixelSize / 2.0f;
        float dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.abc_star_medium) / 2.0f;
        float A013 = AbstractC13600mm.A01(f, 0.0f, 1.0f, (i + f7) - dimensionPixelSize3, (i2 - f7) - dimensionPixelSize3);
        TextView textView = this.A03;
        textView.setText(str);
        AbstractC13880nE.A0r(textView, new RunnableC71527WvW(this, A013));
        Resources resources2 = context.getResources();
        int dimensionPixelSize4 = resources2.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        int dimensionPixelSize5 = resources2.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        ViewOnTouchListenerC66316U8p viewOnTouchListenerC66316U8p = new ViewOnTouchListenerC66316U8p(context, userSession);
        viewOnTouchListenerC66316U8p.A09 = true;
        viewOnTouchListenerC66316U8p.invalidateSelf();
        viewOnTouchListenerC66316U8p.A02(dimensionPixelSize4);
        viewOnTouchListenerC66316U8p.A04(C05F.A01);
        viewOnTouchListenerC66316U8p.A01(f);
        viewOnTouchListenerC66316U8p.A03(dimensionPixelSize5);
        this.A01.setImageDrawable(viewOnTouchListenerC66316U8p);
        Resources resources3 = context.getResources();
        if (A012 == 0) {
            A0k = resources3.getString(2131971698);
        } else {
            A0k = AbstractC167017dG.A0k(resources3, A012, R.plurals.reel_dashboard_slider_results_summary);
        }
        this.A02.setText(A0k);
    }
}
