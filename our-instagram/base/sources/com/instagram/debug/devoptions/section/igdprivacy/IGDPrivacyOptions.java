package com.instagram.debug.devoptions.section.igdprivacy;

import X.AbstractC018607g;
import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC23021Ah;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC31176DnK;
import X.AbstractC43591JPw;
import X.AbstractC59962oe;
import X.C0f9;
import X.C9GR;
import X.EJ2;
import X.GHY;
import X.InterfaceC19610xo;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes6.dex */
public final class IGDPrivacyOptions implements DeveloperOptionsSection {
    public static final IGDPrivacyOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC16960so.A1Q(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.igdprivacy.IGDPrivacyOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(281485074);
                AbstractC25229BEm.A18(new EJ2(), AbstractC25225BEi.A0r(FragmentActivity.this, userSession));
                C0f9.A0C(1822858803, A05);
            }
        }, "Privacy Bundle NUX"), GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.igdprivacy.IGDPrivacyOptions$getItems$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1959683296);
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(UserSession.this));
                A0w.E7D("friendly_feed_nux_seen_count", 0);
                A0w.E7G("friendly_feed_nux_last_shown_time_ms", 0L);
                A0w.apply();
                C9GR.A07(fragmentActivity, 2131958038);
                C0f9.A0C(-2055848305, A05);
            }
        }, 2131958037), GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.igdprivacy.IGDPrivacyOptions$getItems$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1025585828);
                InterfaceC19610xo A0e = AbstractC31176DnK.A0e(UserSession.this);
                A0e.E7D("blend_direct_thread_nux_seen_count", 0);
                A0e.E7G("blend_direct_thread_nux_last_shown_time_ms", 0L);
                A0e.apply();
                InterfaceC19610xo A0e2 = AbstractC31176DnK.A0e(UserSession.this);
                A0e2.E7D(AbstractC111324zv.A00(1985), 0);
                A0e2.E7G(AbstractC111324zv.A00(1984), 0L);
                A0e2.apply();
                C9GR.A07(fragmentActivity, 2131957843);
                C0f9.A0C(-474785734, A05);
            }
        }, 2131957842), GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.igdprivacy.IGDPrivacyOptions$getItems$4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(585185961);
                InterfaceC19610xo A0e = AbstractC31176DnK.A0e(UserSession.this);
                A0e.E7D(AbstractC43591JPw.A00(131), 0);
                A0e.E7G("blend_direct_inbox_nux_last_shown_time_ms", 0L);
                A0e.apply();
                C9GR.A07(fragmentActivity, 2131957841);
                C0f9.A0C(-858594709, A05);
            }
        }, 2131957840));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958402;
    }
}
