package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6eE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143716eE {
    public final InterfaceC56392iX A00;
    public final boolean A01;

    public C143716eE(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        this.A00 = AbstractC56372iV.A01(viewStub, false, false);
        Context context = viewStub.getContext();
        C14360o3.A07(context);
        this.A01 = C143726eF.A0B(context);
    }

    public final void A01(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, boolean z) {
        C14360o3.A0B(userSession, 3);
        if (z) {
            int i = 0;
            if (c41551w4 != null && c41551w4.A0H.A1P) {
                return;
            }
            InterfaceC56392iX interfaceC56392iX = this.A00;
            TextView textView = (TextView) interfaceC56392iX.getView();
            Context context = textView.getContext();
            C14360o3.A07(context);
            textView.setText(AbstractC84863qa.A06(context, userSession, c41181vS));
            Context context2 = interfaceC56392iX.getView().getContext();
            View view = interfaceC56392iX.getView();
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(context2.getResources().getInteger(R.integer.config_activityLongDur));
            if (interfaceC56392iX.getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.LayoutParams layoutParams = interfaceC56392iX.getView().getLayoutParams();
                C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (!this.A01 && c41181vS != null && c41551w4 != null && AbstractC149536o5.A05(context2, userSession, c41181vS, c41551w4) && AbstractC149536o5.A0B(userSession, c41181vS, c41551w4)) {
                    C06090Tz c06090Tz = C06090Tz.A05;
                    i = (int) AbstractC13880nE.A04(context2, ((int) C18U.A01(c06090Tz, userSession, 36603519478404040L)) + ((int) C18U.A01(c06090Tz, userSession, 36595371925440648L)));
                }
                marginLayoutParams.bottomMargin = i;
            }
            interfaceC56392iX.getView().startAnimation(AnimationUtils.loadAnimation(context2, R.anim.enter_from_bottom));
        }
    }

    public final void A00() {
        InterfaceC56392iX interfaceC56392iX = this.A00;
        if (interfaceC56392iX.CWW() && interfaceC56392iX.getView().getVisibility() == 0) {
            TextView textView = (TextView) interfaceC56392iX.getView();
            Context context = textView.getContext();
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.leave_through_bottom);
            loadAnimation.setAnimationListener(new AnimationAnimationListenerC55512Ol5(textView, context));
            interfaceC56392iX.getView().startAnimation(loadAnimation);
        }
    }
}
