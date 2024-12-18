package com.instagram.debug.devoptions.section.activityfeed;

import X.AbstractC018607g;
import X.AbstractC107254sW;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC25231BEo;
import X.AbstractC59962oe;
import X.AnonymousClass194;
import X.C0f9;
import X.C12L;
import X.C14360o3;
import X.C9GR;
import X.GHY;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import X.PZS;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes5.dex */
public final class ActivityFeedOptions implements DeveloperOptionsSection {
    public static final ActivityFeedOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC16960so.A1Q(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.activityfeed.ActivityFeedOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(502033164);
                InterfaceC19630xq A0x = AbstractC166987dD.A0x(UserSession.this);
                InterfaceC19610xo ARD = A0x.ARD();
                ARD.E7D("newsfeed_row_inline_controls_nux_view_count", 0);
                ARD.apply();
                InterfaceC19610xo ARD2 = A0x.ARD();
                ARD2.E7G("newsfeed_row_inline_controls_nux_timestamp", 0L);
                ARD2.apply();
                C0f9.A0C(1913492883, A05);
            }
        }, 2131958316), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.activityfeed.ActivityFeedOptions$getItems$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(312385160);
                UserSession userSession2 = UserSession.this;
                C14360o3.A0B(userSession2, 0);
                AbstractC166987dD.A1Z(new PZS(userSession2, null, 48), AnonymousClass194.A02(AbstractC25231BEo.A0e(C12L.A00)));
                C9GR.A00(fragmentActivity, "Notification feed item generated", null, 0);
                C0f9.A0C(-1574742506, A05);
            }
        }, 2131957796), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.activityfeed.ActivityFeedOptions$getItems$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-619230609);
                UserSession userSession2 = UserSession.this;
                C14360o3.A0B(userSession2, 0);
                AbstractC107254sW.A00(userSession2).A01();
                C9GR.A09(fragmentActivity, "Local AF db cleared");
                C0f9.A0C(-1990694691, A05);
            }
        }, 2131957795));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131957794;
    }
}
