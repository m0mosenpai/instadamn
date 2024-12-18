package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class CLC {
    public static void A00(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC38371qR interfaceC38371qR, InterfaceC60442pS interfaceC60442pS, Boolean bool) {
        long j;
        long j2;
        Long A0j;
        C14360o3.A0B(interfaceC38371qR, 0);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        C82713mZ A03 = AbstractC82703mY.A03(userSession, interfaceC38371qR, interfaceC60442pS, "instagram_ad_overlay_hide_button");
        C38321qM BQN = interfaceC38371qR.BQN();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "instagram_ad_overlay_hide_button");
        C11520jB A012 = A03.A01();
        if (A0f.isSampled()) {
            if (C1H6.A03()) {
                j = 1;
            } else {
                j = 0;
            }
            A0f.A9K(AbstractC111324zv.A00(4732), Long.valueOf(j));
            String str = null;
            A0f.AAP("radio_type", (String) A012.A01(C5I8.A6q));
            A0f.A7v(AbstractC111324zv.A00(502), true);
            A0f.AAP("source_of_action", interfaceC60442pS.getModuleName());
            AbstractC25225BEi.A1P(A0f, (String) A012.A01(C5I8.A9o));
            AbstractC25225BEi.A1N(A0f, String.valueOf(AbstractC25225BEi.A14()));
            A0f.A9K(AbstractC111324zv.A00(360), (Long) A012.A01(C5I8.A3s));
            A0f.A9K(AbstractC111324zv.A00(4072), Long.valueOf(c37644Ghd.A06()));
            A0f.AAP("chaining_session_id", (String) A012.A01(C5I8.A1C));
            String A07 = AbstractC41071vF.A07(userSession, BQN);
            if (A07 != null && (A0j = AbstractC166997dE.A0j(A07)) != null) {
                j2 = A0j.longValue();
            } else {
                j2 = 0;
            }
            A0f.A9K("ad_id", Long.valueOf(j2));
            C14360o3.A0B(BQN, 0);
            A0f.AAP(AbstractC111324zv.A00(204), AbstractC77343dK.A00(BQN.A0e));
            A0f.A7v(AbstractC111324zv.A00(451), false);
            A0f.AAP("a_pk", AbstractC25228BEl.A18(BQN.A2E(userSession)));
            A0f.AAP("m_pk", AbstractC128985sJ.A09(BQN));
            A0f.A9K("m_t", Long.valueOf(BQN.BRp().A00));
            A0f.A9K("m_ts", Long.valueOf(BQN.A1B()));
            A0f.AAP("tracking_token", AbstractC128985sJ.A07(userSession, BQN, interfaceC60442pS));
            A0f.A9K(AbstractC111324zv.A00(1098), (Long) A012.A01(C5I8.A5R));
            C40971v4 A072 = c120985dq.A07();
            if (A072 != null) {
                str = A072.A0f;
            }
            A0f.AAP("host_media_pk", str);
            if (bool != null) {
                A0f.A7v("is_swipe_to_dismiss", Boolean.valueOf(bool.booleanValue()));
            }
            A0f.Cht();
        }
    }
}
