package X;

import android.app.Activity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import java.util.ArrayList;

/* renamed from: X.FPm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34677FPm {
    public final Activity A00;
    public final UserSession A01;
    public final C2056398n A02;

    public final void A00(DirectThreadAnalyticsParams directThreadAnalyticsParams, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        Long l;
        C14360o3.A0B(str, 0);
        InterfaceC19610xo ARD = this.A02.A00.ARD();
        ARD.E77(AnonymousClass001.A0R("direct_has_seen_nudity_forward_friction_", str), true);
        ARD.apply();
        UserSession userSession = this.A01;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        Activity activity = this.A00;
        A0y.A0g = activity.getString(2131956792);
        A0y.A1J = true;
        A0y.A0K = new ViewOnClickListenerC35609Fo0(3, directThreadAnalyticsParams, this, interfaceC16820sZ, z);
        A0y.A0h = activity.getString(2131974426);
        A0y.A1N = true;
        A0y.A0L = new ViewOnClickListenerC35672Fp7(9, directThreadAnalyticsParams, this, z);
        C189478aR A00 = A0y.A00();
        ArrayList A1E = AbstractC166987dD.A1E();
        EnumC1579076z enumC1579076z = null;
        A1E.add(new FullscreenBannerViewModel.SectionBulletPoint(null, "ls://icon?icon=shield-pano", AbstractC166997dE.A0p(activity, 2131962810), activity.getString(2131962808)));
        A1E.add(new FullscreenBannerViewModel.SectionBulletPoint(null, "ls://icon?icon=heart-pano", AbstractC166997dE.A0p(activity, 2131962811), activity.getString(2131962809)));
        A00.A02(activity, AbstractC34102F3e.A00(new FullscreenBannerViewModel(Integer.valueOf(R.drawable.ig_illustrations_illo_content_checkpoint_refresh), null, activity.getString(2131962812), null, A1E)));
        if (z) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "mwb_odnc_interaction_event");
            if (A0f.isSampled()) {
                AbstractC31178DnM.A16(A0f, userSession);
                AbstractC31179DnN.A19(A0f, "fwd_friction_impression");
                Long l2 = null;
                if (directThreadAnalyticsParams != null) {
                    l = Long.valueOf(directThreadAnalyticsParams.A01);
                } else {
                    l = null;
                }
                A0f.A9K("thread_size", l);
                if (directThreadAnalyticsParams != null) {
                    enumC1579076z = directThreadAnalyticsParams.A02;
                }
                A0f.A8R(enumC1579076z, "direct_source");
                if (directThreadAnalyticsParams != null) {
                    l2 = Long.valueOf(directThreadAnalyticsParams.A00);
                }
                A0f.A9K("consistent_thread_fbid", l2);
                A0f.Cht();
            }
        }
    }

    public C34677FPm(Activity activity, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = AbstractC2056298m.A00(userSession);
    }
}
