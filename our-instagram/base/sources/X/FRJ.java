package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.direct.ui.countdowntimer.CountdownTimerPill;

/* loaded from: classes6.dex */
public final class FRJ {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public CountdownTimerPill A04;
    public C7IK A05;
    public final Activity A06;
    public final UserSession A07;
    public final InterfaceC56392iX A08;
    public final Context A09;

    public FRJ(Activity activity, View view, UserSession userSession) {
        C14360o3.A0B(view, 1);
        this.A07 = userSession;
        this.A06 = activity;
        this.A09 = view.getContext();
        InterfaceC56392iX A00 = AbstractC56372iV.A00(view);
        this.A08 = A00;
        A00.EZv(new G0Q(this, 1));
    }

    public final void A00(C7IK c7ik) {
        if (c7ik != null) {
            this.A05 = c7ik;
            View view = this.A00;
            if (view != null) {
                view.setBackgroundColor(c7ik.A02);
            }
            TextView textView = this.A03;
            if (textView != null) {
                textView.setTextColor(c7ik.A0C);
            }
            TextView textView2 = this.A02;
            if (textView2 != null) {
                textView2.setTextColor(c7ik.A0D);
            }
            ImageView imageView = this.A01;
            if (imageView != null) {
                imageView.setImageTintList(ColorStateList.valueOf(c7ik.A0D));
            }
            CountdownTimerPill countdownTimerPill = this.A04;
            if (countdownTimerPill != null) {
                countdownTimerPill.setPillColor(c7ik.A0A);
            }
        }
    }

    public final void A01(C2EE c2ee) {
        C32067E6t An6;
        if (c2ee != null && (An6 = c2ee.An6()) != null) {
            InterfaceC56392iX interfaceC56392iX = this.A08;
            if (interfaceC56392iX.CWW() && interfaceC56392iX.CGb() == 0) {
                return;
            }
            Long l = An6.A00;
            if (l != null) {
                long longValue = l.longValue() * 1000;
                long currentTimeMillis = longValue - System.currentTimeMillis();
                if (!An6.A01() || currentTimeMillis <= 1000) {
                    return;
                }
                interfaceC56392iX.getView().setVisibility(0);
                TextView textView = this.A03;
                if (textView != null) {
                    textView.setText(An6.A04);
                }
                TextView textView2 = this.A03;
                if (textView2 != null) {
                    textView2.setSelected(true);
                }
                TextView textView3 = this.A02;
                if (textView3 != null) {
                    Context context = this.A09;
                    int i = 2131958989;
                    if (AbstractC31171DnF.A1W(this.A07, c2ee.Asv())) {
                        i = 2131958990;
                    }
                    AbstractC166987dD.A1P(context, textView3, i);
                }
                CountdownTimerPill countdownTimerPill = this.A04;
                if (countdownTimerPill != null) {
                    countdownTimerPill.A02(new C37056GUm(this, 17), currentTimeMillis, longValue, false, false, C7HD.A03(this.A07));
                }
                ViewOnClickListenerC35684FpJ.A00(interfaceC56392iX.getView(), An6, this, c2ee, 24);
                A00(this.A05);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
