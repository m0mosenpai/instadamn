package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Fo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35609Fo0 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public ViewOnClickListenerC35609Fo0(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A04 = z;
        this.A02 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        Long l;
        EnumC1579076z enumC1579076z;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1583951116);
                ImageUrl imageUrl = (ImageUrl) this.A02;
                if (imageUrl != null) {
                    boolean z = this.A04;
                    AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A03;
                    WGU.A03(abstractC59962oe.requireContext(), new DialogInterfaceOnClickListenerC70206WHe(1, this.A01, abstractC59962oe), abstractC59962oe, imageUrl, z);
                } else {
                    V0N.A02((V0N) this.A03);
                }
                i = 1364821809;
                break;
            case 1:
                A05 = C0f9.A05(1525634186);
                C31659DvP.A01((C31659DvP) this.A03, (C2EC) this.A02, this.A04);
                AbstractC167007dF.A16((C189478aR) ((C15370ps) this.A01).A00);
                i = 2142285665;
                break;
            case 2:
                A05 = C0f9.A05(213994230);
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A03;
                Activity activity = (Activity) this.A01;
                boolean z2 = this.A04;
                Number number = (Number) this.A02;
                if (!z2) {
                    C41451vu c41451vu = C41451vu.A01;
                    C146106i8 A0j = AbstractC25229BEm.A0j();
                    AbstractC25226BEj.A1N(activity, A0j, 2131958950);
                    AbstractC31178DnM.A1N(c41451vu, A0j);
                } else {
                    Bundle A0b = AbstractC166987dD.A0b();
                    if (2 - number.intValue() != 0) {
                        str = "accept_request";
                    } else {
                        str = "move_thread";
                    }
                    AbstractC31171DnF.A13(A0b, str);
                    A0b.putBoolean(AbstractC111324zv.A00(3095), false);
                    A0b.putBoolean("should_use_callback", true);
                    AbstractC167017dG.A0y(activity, C3DN.A00);
                    C6XJ A03 = C6XJ.A03(activity, A0b, abstractC12990ll, ModalActivity.class, AbstractC111324zv.A00(2263));
                    A03.A08();
                    A03.A0C(activity);
                }
                i = 933900843;
                break;
            case 3:
                A05 = C0f9.A05(-1034109281);
                C3DO c3do = C3DN.A00;
                C34677FPm c34677FPm = (C34677FPm) this.A03;
                Activity activity2 = c34677FPm.A00;
                C3DN A00 = c3do.A00(activity2);
                if (A00 != null) {
                    ((C3DP) A00).A0H = new GHK(4, c34677FPm, this.A02);
                }
                AbstractC167007dF.A16(AbstractC25228BEl.A0x(activity2, c3do));
                if (this.A04) {
                    UserSession userSession = c34677FPm.A01;
                    DirectThreadAnalyticsParams directThreadAnalyticsParams = (DirectThreadAnalyticsParams) this.A01;
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "mwb_odnc_interaction_event");
                    if (A0f.isSampled()) {
                        AbstractC31178DnM.A16(A0f, userSession);
                        AbstractC31179DnN.A19(A0f, "fwd_share_anyway_click");
                        Long l2 = null;
                        if (directThreadAnalyticsParams != null) {
                            l = Long.valueOf(directThreadAnalyticsParams.A01);
                        } else {
                            l = null;
                        }
                        A0f.A9K("thread_size", l);
                        if (directThreadAnalyticsParams != null) {
                            enumC1579076z = directThreadAnalyticsParams.A02;
                        } else {
                            enumC1579076z = null;
                        }
                        A0f.A8R(enumC1579076z, "direct_source");
                        if (directThreadAnalyticsParams != null) {
                            l2 = Long.valueOf(directThreadAnalyticsParams.A00);
                        }
                        A0f.A9K("consistent_thread_fbid", l2);
                        A0f.Cht();
                    }
                }
                i = 1888173460;
                break;
            default:
                A05 = C0f9.A05(1659581799);
                if (this.A04) {
                    C35042FcF c35042FcF = (C35042FcF) this.A03;
                    AbstractC35176FfT.A02(c35042FcF.A02.requireContext(), c35042FcF.A04, "invite_friends");
                    i = 1957123363;
                    break;
                } else {
                    ((Runnable) this.A01).run();
                    C35042FcF.A00((C35042FcF) this.A03, null, F8Q.A00((Integer) this.A02));
                    i = -2133530726;
                    break;
                }
        }
        C0f9.A0C(i, A05);
    }
}
