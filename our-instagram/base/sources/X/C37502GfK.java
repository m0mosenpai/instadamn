package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MomentAdsTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.fragment.NewsfeedFragment;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;
import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;
import java.util.EnumSet;

/* renamed from: X.GfK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37502GfK {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final String A03;
    public final String A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;

    public static final void A00(C38321qM c38321qM, C75113Zb c75113Zb, C37502GfK c37502GfK) {
        c75113Zb.A1t = false;
        C75113Zb.A00(c75113Zb, 26);
        c38321qM.AEH(c37502GfK.A01);
    }

    public static final void A01(C38321qM c38321qM, C37502GfK c37502GfK) {
        UserSession userSession = c37502GfK.A01;
        EnumSet enumSet = AbstractC75103Za.A00;
        if (C76253bV.A03(userSession, c38321qM) || c38321qM.A0C.BUm() == MomentAdsTypeEnum.A0B) {
            C3KL.A00(userSession).A06("instagram_feed_timeline");
        }
    }

    public final void A02(C38321qM c38321qM, C75113Zb c75113Zb) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        A0r.A0B(null, new NewsfeedFragment());
        A0r.A08();
        A0r.A05();
        UpcomingEvent A2B = c38321qM.A2B(userSession);
        if (A2B != null) {
            AbstractC25651Mw.A00(userSession).E4s(new C42242InS(A2B));
        }
        AbstractC41775Ier.A05(userSession, c38321qM, this.A02, c75113Zb, "cta_bar_view_upcoming_event", this.A04, null, null, null, false);
    }

    public final void A03(C38321qM c38321qM, C75113Zb c75113Zb, String str) {
        Hj6 hj6;
        UpcomingEventReminderAction upcomingEventReminderAction;
        UserSession userSession = this.A01;
        UpcomingEvent A2B = c38321qM.A2B(userSession);
        if (A2B != null) {
            c75113Zb.A1t = true;
            C75113Zb.A00(c75113Zb, 26);
            c38321qM.AEH(userSession);
            boolean A01 = new C146066i4(userSession).A01(A2B);
            if (C18U.A06(C06090Tz.A05, userSession, 36320305039286625L)) {
                FragmentActivity fragmentActivity = this.A00;
                IMG img = new IMG(AbstractC166987dD.A0O(fragmentActivity), fragmentActivity, userSession, this.A02, str, AbstractC25229BEm.A0a(fragmentActivity));
                C43041J1h c43041J1h = new C43041J1h(c38321qM, c75113Zb, new C43040J1g(1, c38321qM, c75113Zb, img, this), img, this);
                InterfaceC09390do interfaceC09390do = this.A08;
                UpcomingEventReminderRepository upcomingEventReminderRepository = (UpcomingEventReminderRepository) interfaceC09390do.getValue();
                if (((UpcomingEventReminderRepository) interfaceC09390do.getValue()).A06.A01(A2B)) {
                    upcomingEventReminderAction = UpcomingEventReminderAction.A05;
                } else {
                    upcomingEventReminderAction = UpcomingEventReminderAction.A04;
                }
                upcomingEventReminderRepository.A03(c43041J1h, new OCN(c38321qM, upcomingEventReminderAction, A2B, str), AbstractC25229BEm.A0a(fragmentActivity));
            } else {
                IMX imx = (IMX) this.A07.getValue();
                imx.A00 = new C43043J1j(c38321qM, c75113Zb, this);
                C41111IIc c41111IIc = new C41111IIc(c38321qM, A2B, str, !A01);
                if (!A01) {
                    hj6 = new C39418Hb2(c41111IIc, imx);
                } else {
                    hj6 = C39420Hb4.A00;
                }
                imx.A00(hj6, c41111IIc);
            }
            if ((!AbstractC41774Ieq.A0B(A2B)) || AbstractC41774Ieq.A0B(A2B)) {
                AbstractC25651Mw.A00(userSession).E4s(new C42242InS(A2B));
            }
        }
        AbstractC41775Ier.A05(userSession, c38321qM, this.A02, c75113Zb, str, this.A04, null, null, null, false);
    }

    public C37502GfK(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        this.A00 = fragmentActivity;
        this.A02 = interfaceC60442pS;
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = str2;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C43204J8b(this, 16));
        this.A08 = AbstractC09440dt.A00(enumC09460dv, new C43204J8b(this, 17));
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C43204J8b(this, 14));
        this.A09 = AbstractC09440dt.A00(enumC09460dv, new C43204J8b(this, 18));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C43204J8b(this, 15));
    }
}
