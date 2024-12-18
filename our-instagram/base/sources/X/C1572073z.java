package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.UUID;

/* renamed from: X.73z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1572073z {
    public java.util.Set A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final UserDetailFragment A04;
    public final MUB A05;
    public final String A06;
    public final C70C A07;
    public final C1571973y A08;

    public C1572073z(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, UserDetailFragment userDetailFragment, C70C c70c, MUB mub, C1571973y c1571973y, String str) {
        C14360o3.A0B(c1571973y, 5);
        C14360o3.A0B(c70c, 6);
        this.A02 = userSession;
        this.A04 = userDetailFragment;
        this.A01 = fragmentActivity;
        this.A05 = mub;
        this.A08 = c1571973y;
        this.A07 = c70c;
        this.A03 = interfaceC60442pS;
        this.A06 = str;
        this.A00 = new HashSet();
    }

    public final void A00(UpcomingEvent upcomingEvent, User user) {
        String str;
        UserSession userSession = this.A02;
        UserDetailFragment userDetailFragment = this.A04;
        String moduleName = userDetailFragment.getModuleName();
        InterfaceC60442pS interfaceC60442pS = this.A03;
        C146076i5 c146076i5 = new C146076i5(interfaceC60442pS, userSession, moduleName);
        if (userDetailFragment.A12() && AbstractC41774Ieq.A0B(upcomingEvent)) {
            String obj = UUID.randomUUID().toString();
            C14360o3.A07(obj);
            OCU ocu = new OCU(userDetailFragment, userSession, obj);
            String title = upcomingEvent.getTitle();
            AbstractC59962oe abstractC59962oe = ocu.A00;
            C50674MYs c50674MYs = new C50674MYs(abstractC59962oe.requireContext(), ocu.A01);
            if (title != null) {
                c50674MYs.A07(title);
            }
            c50674MYs.A03(new ViewOnClickListenerC55382Ois(upcomingEvent, ocu), 2131961561);
            Context requireContext = abstractC59962oe.requireContext();
            c50674MYs.A03(new ViewOnClickListenerC55383Oit(upcomingEvent, ocu), 2131965521);
            c50674MYs.A03(new ViewOnClickListenerC55403OjE(c146076i5, upcomingEvent, ocu), 2131965529);
            c50674MYs.A03(new ViewOnClickListenerC55415OjQ(requireContext, c146076i5, upcomingEvent, user), 2131965518);
            new C31727DwY(c50674MYs).A05(abstractC59962oe.requireActivity());
            return;
        }
        C1571973y c1571973y = this.A08;
        C28341Yv A00 = AbstractC22762A2g.A00();
        AbstractC59962oe abstractC59962oe2 = c1571973y.A01;
        Context requireContext2 = abstractC59962oe2.requireContext();
        UserSession userSession2 = c1571973y.A02;
        UpcomingEventMedia BQO = upcomingEvent.BQO();
        String str2 = null;
        if (BQO != null) {
            str = BQO.getId();
        } else {
            str = null;
        }
        A00.A01(requireContext2, userSession2, interfaceC60442pS, null, upcomingEvent, str, abstractC59962oe2.getModuleName(), "profile_featured_events_header", false, false);
        C146076i5 c146076i52 = (C146076i5) c1571973y.A04.getValue();
        UpcomingEventMedia BQO2 = upcomingEvent.BQO();
        if (BQO2 != null) {
            str2 = BQO2.getId();
        }
        c146076i52.A04(upcomingEvent, str2, "open_upcoming_event_bottom_sheet", "user_profile");
    }
}
