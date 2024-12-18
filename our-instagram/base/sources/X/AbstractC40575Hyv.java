package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hyv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40575Hyv {
    public static void A00(UserSession userSession, InterfaceC38371qR interfaceC38371qR, InterfaceC60442pS interfaceC60442pS, Integer num, String str, int i) {
        long j;
        String str2;
        Long A0j;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC60442pS, userSession, interfaceC38371qR, 0), "instagram_delayed_skip_ad_timer");
        if (A0f.isSampled()) {
            C82713mZ A03 = AbstractC82703mY.A03(userSession, interfaceC38371qR, interfaceC60442pS, "instagram_delayed_skip_ad_timer");
            C38321qM BQN = interfaceC38371qR.BQN();
            C11520jB A01 = A03.A01();
            String A07 = AbstractC41071vF.A07(userSession, BQN);
            if (A07 != null && (A0j = AbstractC166997dE.A0j(A07)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            AbstractC37301Gc2.A0z(A0f, j);
            AbstractC37300Gc1.A0o(A0f, AbstractC128985sJ.A07(userSession, BQN, interfaceC60442pS));
            AbstractC37300Gc1.A0l(A0f, AbstractC128985sJ.A09(BQN));
            A0f.AAP("a_pk", AbstractC37303Gc4.A0T(userSession, BQN));
            A0f.AAP("carousel_media_id", AbstractC37300Gc1.A0R(C5I8.A10, A01));
            switch (num.intValue()) {
                case 0:
                    str2 = "impression";
                    break;
                case 1:
                    str2 = "click";
                    break;
                case 2:
                    str2 = "start";
                    break;
                case 3:
                    str2 = "pause";
                    break;
                case 4:
                    str2 = "resume";
                    break;
                case 5:
                    str2 = "destroy";
                    break;
                case 6:
                    str2 = "complete";
                    break;
                default:
                    str2 = "fragment_paused";
                    break;
            }
            A0f.AAP("event_type", str2);
            A0f.A9K("remaining_time", AbstractC31171DnF.A0V(i));
            A0f.AAP("reason", str);
            A0f.Cht();
        }
    }
}
