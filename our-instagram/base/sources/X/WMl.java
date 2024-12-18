package X;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;

/* loaded from: classes11.dex */
public final class WMl implements View.OnClickListener {
    public final /* synthetic */ IGCTMessagingAdsInfoDictIntf A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C65886Tvq A02;
    public final /* synthetic */ C41181vS A03;
    public final /* synthetic */ C6U5 A04;
    public final /* synthetic */ InterfaceC145586hH A05;

    public WMl(IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf, UserSession userSession, C65886Tvq c65886Tvq, C41181vS c41181vS, C6U5 c6u5, InterfaceC145586hH interfaceC145586hH) {
        this.A05 = interfaceC145586hH;
        this.A01 = userSession;
        this.A04 = c6u5;
        this.A02 = c65886Tvq;
        this.A03 = c41181vS;
        this.A00 = iGCTMessagingAdsInfoDictIntf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Long l;
        Animation loadAnimation;
        ConstraintLayout constraintLayout;
        int A05 = C0f9.A05(883832762);
        InterfaceC145586hH interfaceC145586hH = this.A05;
        UserSession userSession = this.A01;
        C6U5 c6u5 = this.A04;
        interfaceC145586hH.DIV(userSession, c6u5.A0B);
        try {
            loadAnimation = AnimationUtils.loadAnimation(c6u5.A00().getContext(), R.anim.button_slide_up_0_to_100);
            loadAnimation.setAnimationListener(new AnimationAnimationListenerC35726Fq0(c6u5, 5));
            constraintLayout = c6u5.A08;
        } catch (Resources.NotFoundException unused) {
        }
        if (constraintLayout != null) {
            constraintLayout.startAnimation(loadAnimation);
            c6u5.A0C = true;
            IgLinearLayout igLinearLayout = c6u5.A09;
            if (igLinearLayout != null) {
                C12500ku c12500ku = new C12500ku(igLinearLayout);
                while (c12500ku.hasNext()) {
                    AbstractC166997dE.A0S((View) c12500ku.next(), R.id.option_text).setOnClickListener(null);
                }
                C65886Tvq c65886Tvq = this.A02;
                C41181vS c41181vS = this.A03;
                C40971v4 c40971v4 = c41181vS.A0g;
                OnFeedMessagesIntf onFeedMessagesIntf = null;
                if (c40971v4 != null) {
                    str = c40971v4.A0S;
                } else {
                    str = null;
                }
                IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf = this.A00;
                if (iGCTMessagingAdsInfoDictIntf != null) {
                    l = Long.valueOf(VTE.A00(iGCTMessagingAdsInfoDictIntf));
                    onFeedMessagesIntf = iGCTMessagingAdsInfoDictIntf.BUJ();
                } else {
                    l = null;
                }
                c65886Tvq.A04(userSession, c41181vS.A0b, l, str, AbstractC76663cE.A00(onFeedMessagesIntf));
                C0f9.A0C(53451541, A05);
                return;
            }
            C14360o3.A0F("optionsListView");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("ctaButtonLayout");
        throw C00O.createAndThrow();
    }
}
