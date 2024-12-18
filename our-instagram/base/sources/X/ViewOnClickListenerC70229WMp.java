package X;

import android.view.View;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IceBreakerMessageIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.WMp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnClickListenerC70229WMp implements View.OnClickListener {
    public final /* synthetic */ IGCTMessagingAdsInfoDictIntf A00;
    public final /* synthetic */ IceBreakerMessageIntf A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ IgFrameLayout A03;
    public final /* synthetic */ C65886Tvq A04;
    public final /* synthetic */ C41181vS A05;
    public final /* synthetic */ C6U5 A06;
    public final /* synthetic */ InterfaceC145586hH A07;

    public ViewOnClickListenerC70229WMp(IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf, IceBreakerMessageIntf iceBreakerMessageIntf, UserSession userSession, IgFrameLayout igFrameLayout, C65886Tvq c65886Tvq, C41181vS c41181vS, C6U5 c6u5, InterfaceC145586hH interfaceC145586hH) {
        this.A06 = c6u5;
        this.A03 = igFrameLayout;
        this.A01 = iceBreakerMessageIntf;
        this.A07 = interfaceC145586hH;
        this.A04 = c65886Tvq;
        this.A05 = c41181vS;
        this.A00 = iGCTMessagingAdsInfoDictIntf;
        this.A02 = userSession;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Long l;
        int A05 = C0f9.A05(-1355876260);
        C6U5 c6u5 = this.A06;
        IgLinearLayout igLinearLayout = c6u5.A09;
        if (igLinearLayout != null) {
            C12500ku c12500ku = new C12500ku(igLinearLayout);
            while (c12500ku.hasNext()) {
                ((View) c12500ku.next()).setSelected(false);
            }
            c6u5.A02();
            this.A03.setSelected(true);
            String message = this.A01.getMessage();
            if (message == null) {
                message = "";
            }
            c6u5.A0B = message;
            this.A07.DgA();
            C65886Tvq c65886Tvq = this.A04;
            C41181vS c41181vS = this.A05;
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
            c65886Tvq.A03(this.A02, c41181vS.A0b, l, str, AbstractC76663cE.A00(onFeedMessagesIntf));
            C0f9.A0C(487501530, A05);
            return;
        }
        C14360o3.A0F("optionsListView");
        throw C00O.createAndThrow();
    }
}
