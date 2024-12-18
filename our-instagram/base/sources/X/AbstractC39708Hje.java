package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.Hje, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39708Hje {
    public static void A00(C3N2 c3n2, C114845Gu c114845Gu) {
        Object A01;
        InterfaceC41201vU interfaceC41201vU;
        InterfaceC61432r6 interfaceC61432r6;
        String str;
        User A14;
        C3NB Azd = c3n2.Azd();
        if (Azd != null) {
            C3ND c3nd = Azd.A00.A00;
            c3nd.remove("ig_media_metrics");
            c3nd.put("ig_media_metrics", c114845Gu);
            for (C3AQ c3aq : Azd.A01) {
                try {
                    AbstractC12990ll abstractC12990ll = c3aq.A03;
                    if (abstractC12990ll instanceof UserSession) {
                        C93574Hy c93574Hy = c114845Gu.A01;
                        C14360o3.A07(c93574Hy);
                        Object obj = c93574Hy.A01;
                        if ((obj instanceof C38321qM) && c93574Hy.A06) {
                            Object obj2 = c114845Gu.A01.A02;
                            C14360o3.A0C(obj2, MSV.A00(9));
                            EnumC64222vh A02 = AbstractC82563mK.A02(AbstractC37300Gc1.A0W(obj2));
                            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.Media");
                            C38321qM c38321qM = (C38321qM) obj;
                            C6T6 c6t6 = new C6T6(new C206209Bd(17, (Object) true, (Object) null, (Object) Long.valueOf(c114845Gu.A00)), null, null, null);
                            int ordinal = A02.ordinal();
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal == 0 && (str = c93574Hy.A03) != null && (A14 = AbstractC25226BEj.A14(c38321qM)) != null) {
                                        InterfaceC41201vU c41181vS = new C41181vS(c38321qM, A14, str);
                                        C14360o3.A0C(abstractC12990ll, AbstractC111324zv.A00(6));
                                        A01 = new C41551w4((UserSession) abstractC12990ll, new Reel((C1NB) new C1N9(A14), str, false), false, null, null, C16910sj.A00, -1, System.currentTimeMillis(), false);
                                        interfaceC61432r6 = c3aq.A02;
                                        interfaceC41201vU = c41181vS;
                                    }
                                } else {
                                    UserSession userSession = (UserSession) abstractC12990ll;
                                    C120985dq A04 = C120985dq.A0d.A04(c38321qM);
                                    A01 = AbstractC37652Ghl.A01(A04, userSession, C3YS.A00(userSession), null, null);
                                    interfaceC61432r6 = c3aq.A00;
                                    interfaceC41201vU = A04;
                                }
                                if (interfaceC61432r6 != null) {
                                    interfaceC61432r6.DVi(c6t6, AnonymousClass317.A04, interfaceC41201vU, A01);
                                }
                            } else {
                                C75113Zb A0E = AbstractC37303Gc4.A0E(c38321qM);
                                InterfaceC61432r6 interfaceC61432r62 = c3aq.A01;
                                if (interfaceC61432r62 != null) {
                                    interfaceC61432r62.DVi(c6t6, AnonymousClass317.A04, c38321qM, A0E);
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
