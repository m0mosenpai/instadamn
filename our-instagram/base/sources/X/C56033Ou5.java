package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Ou5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56033Ou5 implements InterfaceC41501vz {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        Context context;
        C54799OJt c54799OJt;
        OAD oad;
        AbstractC59962oe abstractC59962oe;
        UserSession userSession;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1773965547);
                C211849aB c211849aB = (C211849aB) obj;
                int A032 = C0f9.A03(1195005133);
                boolean z = false;
                C14360o3.A0B(c211849aB, 0);
                Integer num = c211849aB.A00;
                if (num != null && num.intValue() == 0) {
                    userSession = (UserSession) this.A06;
                    oad = (OAD) this.A05;
                    C56731PFz c56731PFz = new C56731PFz(oad, 2);
                    C14360o3.A0B(userSession, 0);
                    z = true;
                    new C195918ld(userSession, c56731PFz).A05(true, "ig_story_viewers_dashboard");
                    CallerContext callerContext = AbstractC50624MWl.A01;
                    context = (Context) this.A01;
                    c54799OJt = (C54799OJt) this.A04;
                    abstractC59962oe = (AbstractC59962oe) this.A03;
                } else {
                    CallerContext callerContext2 = AbstractC50624MWl.A01;
                    context = (Context) this.A01;
                    c54799OJt = (C54799OJt) this.A04;
                    oad = (OAD) this.A05;
                    abstractC59962oe = (AbstractC59962oe) this.A03;
                    userSession = (UserSession) this.A06;
                }
                C196068lw.A00(userSession).A01(AbstractC50624MWl.A01, new P1R(context, abstractC59962oe, userSession, oad, c54799OJt, (ReelDashboardFragment) this.A02, z), "after_new_fbc");
                C0f9.A0A(-1813837108, A032);
                i = -1464270026;
                break;
            case 1:
                A03 = C0f9.A03(-2068160600);
                C211849aB c211849aB2 = (C211849aB) obj;
                int A033 = C0f9.A03(-679394098);
                C14360o3.A0B(c211849aB2, 0);
                UserSession userSession2 = (UserSession) this.A06;
                if (C18U.A06(C06090Tz.A05, userSession2, 36329629413556685L)) {
                    C196058lv A00 = C196068lw.A00(userSession2);
                    CallerContext callerContext3 = C55628OnD.A01;
                    Object obj2 = this.A04;
                    A00.A01(callerContext3, new P1S(0, this.A01, this.A03, userSession2, c211849aB2, this.A05, obj2, this.A02), "after_new_fbc");
                } else {
                    OFL ofl = (OFL) this.A04;
                    C55628OnD.A02((Context) this.A01, (AbstractC59962oe) this.A03, userSession2, c211849aB2, (C54622OAx) this.A05, ofl, (ENZ) this.A02);
                }
                C0f9.A0A(2143130550, A033);
                i = 1943191798;
                break;
            default:
                A03 = C0f9.A03(1603151164);
                C211849aB c211849aB3 = (C211849aB) obj;
                int A0N = AbstractC167017dG.A0N(c211849aB3, -1660981184);
                UserSession userSession3 = (UserSession) this.A06;
                if (C18U.A06(C06090Tz.A05, userSession3, 36329629413556685L)) {
                    C196058lv A002 = C196068lw.A00(userSession3);
                    CallerContext callerContext4 = C55202OeD.A01;
                    Object obj3 = this.A04;
                    A002.A01(callerContext4, new P1S(1, this.A01, this.A03, userSession3, c211849aB3, this.A05, obj3, this.A02), "after_new_fbc");
                } else {
                    C54722OEz c54722OEz = (C54722OEz) this.A04;
                    C54472O5a c54472O5a = (C54472O5a) this.A05;
                    C55202OeD.A00((Context) this.A01, (AbstractC59962oe) this.A03, userSession3, c211849aB3, c54472O5a, c54722OEz, (ENZ) this.A02);
                }
                C0f9.A0A(-1782368499, A0N);
                i = -832418212;
                break;
        }
        C0f9.A0A(i, A03);
    }

    public C56033Ou5(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A06 = obj3;
        this.A01 = obj;
        this.A04 = obj5;
        this.A05 = obj4;
        this.A03 = obj2;
        this.A02 = obj6;
    }
}
