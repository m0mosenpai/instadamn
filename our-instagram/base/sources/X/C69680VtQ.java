package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.VtQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69680VtQ {
    public final /* synthetic */ AbstractC67878V0j A00;

    public final void A00(C69727VuM c69727VuM) {
        User user;
        User user2;
        AbstractC67878V0j abstractC67878V0j;
        C38321qM c38321qM;
        String str = null;
        switch (c69727VuM.A01().intValue()) {
            case 0:
                AbstractC67878V0j abstractC67878V0j2 = this.A00;
                AbstractC152536tg.A00(abstractC67878V0j2.getSession(), (String) c69727VuM.A0A.getValue(), null, 0);
                C66151U1s A02 = abstractC67878V0j2.A06().A02();
                UP8 up8 = c69727VuM.A00().A00;
                if (up8 != null && (user = up8.A04) != null) {
                    A02.A0A(user, AbstractC65702TsY.A0d(abstractC67878V0j2), abstractC67878V0j2.A07().A03(), 0);
                    C65740TtF A00 = AbstractC65792TuA.A00(abstractC67878V0j2.getSession());
                    UP8 up82 = c69727VuM.A00().A00;
                    if (up82 != null && (user2 = up82.A04) != null) {
                        A00.A01(user2);
                        AbstractC67878V0j.A00(c69727VuM, abstractC67878V0j2, null);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            case 1:
                AbstractC67878V0j abstractC67878V0j3 = this.A00;
                AbstractC152536tg.A00(abstractC67878V0j3.getSession(), (String) c69727VuM.A0A.getValue(), null, 7);
                C66151U1s A022 = abstractC67878V0j3.A06().A02();
                JIN A002 = c69727VuM.A00().A00();
                if (A002 != null) {
                    A022.A03(C8JW.A0V, A002);
                    U2R A003 = U1X.A00(abstractC67878V0j3.getSession());
                    JIN A004 = c69727VuM.A00().A00();
                    if (A004 != null) {
                        A003.A00(A004);
                        AbstractC67878V0j.A00(c69727VuM, abstractC67878V0j3, null);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            case 2:
            case 5:
            case 6:
            case 7:
                return;
            case 3:
                String A0j = AbstractC167017dG.A0j();
                UPT upt = c69727VuM.A00().A02;
                if (upt != null && upt.A07) {
                    abstractC67878V0j = this.A00;
                    boolean A05 = AbstractC23451Ch.A05(abstractC67878V0j.requireActivity(), abstractC67878V0j.A0l);
                    C1VW c1vw = C1VW.A00;
                    if (!C1VW.isLocationPermitted(abstractC67878V0j.requireActivity(), abstractC67878V0j.getSession(), "SEARCH_NEARBY")) {
                        UserSession session = abstractC67878V0j.getSession();
                        AbstractC68641VYw.A00.A05(session, new C4I7(abstractC67878V0j, session), "SEARCH_NEARBY", "BaseSerpGridFragment::onClickHCM");
                        C70965WlC c70965WlC = new C70965WlC(c69727VuM, abstractC67878V0j, A0j);
                        C70968WlF c70968WlF = new C70968WlF(c69727VuM, abstractC67878V0j, A0j, A05);
                        if (c1vw != null) {
                            UserSession session2 = abstractC67878V0j.getSession();
                            FragmentActivity activity = abstractC67878V0j.getActivity();
                            C14360o3.A0C(activity, "null cannot be cast to non-null type android.app.Activity");
                            c1vw.requestLocationUpdates(session2, activity, c70965WlC, c70968WlF, abstractC67878V0j.getModuleName(), true, VDJ.A0S);
                        }
                    }
                } else {
                    abstractC67878V0j = this.A00;
                    abstractC67878V0j.A06().A02().A06(c69727VuM.A00().A02, A0j);
                }
                UPT upt2 = c69727VuM.A00().A02;
                if (upt2 != null) {
                    str = upt2.A06;
                }
                AbstractC67878V0j.A00(c69727VuM, abstractC67878V0j, str);
                return;
            case 4:
                AbstractC67878V0j abstractC67878V0j4 = this.A00;
                SearchContext searchContext = new SearchContext(abstractC67878V0j4.A06().A04(), abstractC67878V0j4.A07().A03(), AbstractC65702TsY.A0d(abstractC67878V0j4), null, abstractC67878V0j4.A06().A05(), null, null, null);
                PlaylistContext playlistContext = new PlaylistContext(String.valueOf(c69727VuM.A00().A07));
                UserSession session3 = abstractC67878V0j4.getSession();
                FragmentActivity requireActivity = abstractC67878V0j4.requireActivity();
                C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A2K, abstractC67878V0j4.getSession());
                c116875Qr.A1d = false;
                c116875Qr.A1C = (String) c69727VuM.A0A.getValue();
                List list = c69727VuM.A08;
                if (list != null && (c38321qM = (C38321qM) list.get(0)) != null) {
                    str = c38321qM.getId();
                }
                c116875Qr.A1D = str;
                c116875Qr.A03(searchContext);
                c116875Qr.A0J = playlistContext;
                c116875Qr.A0o = c69727VuM.A03;
                c116875Qr.A1m = false;
                AbstractC86593tX.A0X(requireActivity, c116875Qr.A00(), session3);
                AbstractC67878V0j.A00(c69727VuM, abstractC67878V0j4, null);
                return;
            default:
                throw new RuntimeException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r1.equals(r5.A02) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.UPQ r11, int r12, int r13) {
        /*
            r10 = this;
            r0 = 0
            X.C14360o3.A0B(r11, r0)
            X.V0j r2 = r10.A00
            com.instagram.common.session.UserSession r4 = r2.getSession()
            X.C14360o3.A0B(r4, r0)
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36328242139250029(0x81105800063d6d, double:3.03746483872684E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            if (r0 == 0) goto L2c
            X.Tug r0 = r2.A06
            if (r0 != 0) goto L28
            java.lang.String r0 = "grid"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L28:
            r0.A04(r12, r13)
            return
        L2c:
            X.Bfx r5 = r11.A02
            X.V0V r0 = r2.A06()
            X.U1s r3 = r0.A02()
            java.lang.String r7 = r5.A03
            r8 = 0
            java.lang.String r1 = r2.A0J
            if (r1 == 0) goto L4c
            int r0 = r1.length()
            if (r0 == 0) goto L4c
            java.lang.String r0 = r5.A02
            boolean r0 = r1.equals(r0)
            r9 = 0
            if (r0 != 0) goto L4d
        L4c:
            r9 = 1
        L4d:
            X.GzR r4 = r11.A01
            java.lang.String r6 = "ig_search:serp_hcm"
            r3.A04(r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = r5.A02
            r2.A0J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69680VtQ.A01(X.UPQ, int, int):void");
    }

    public C69680VtQ(AbstractC67878V0j abstractC67878V0j) {
        this.A00 = abstractC67878V0j;
    }
}
