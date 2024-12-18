package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class I9I {
    public static final void A00(UserSession userSession, C38321qM c38321qM, AndroidLink androidLink, String str, String str2, boolean z) {
        Long A0j;
        String B9G = androidLink.B9G();
        if (B9G != null && (A0j = AbstractC166997dE.A0j(B9G)) != null && A0j.longValue() > 0) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(null, userSession), "ig_deeplink_funnel_event");
            A0f.AAP("ig_deeplink_event_name", str);
            if (str2 == null) {
                str2 = "invalid";
            }
            A0f.AAP(AbstractC111324zv.A00(186), str2);
            A0f.A9K(AbstractC111324zv.A00(957), A0j);
            A0f.AAP("ig_deeplink_reason", String.valueOf(androidLink.B9H()));
            if (z) {
                String name = c38321qM.BRp().name();
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06(AbstractC43591JPw.A00(776), name);
                c0Zx.A06("checkout_experience", I9H.A00(androidLink));
                A0f.AAQ(c0Zx, "client_dict");
            }
            IGD AeI = C3N0.A00(userSession).AeI();
            if (AeI != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = AeI.A01.iterator();
                while (it.hasNext()) {
                    A1E.add(Long.valueOf(((EnumC71343Hv) ((C71353Hw) it.next()).A01).A00).toString());
                }
                A0f.AAk(AbstractC111324zv.A00(3251), A1E);
            }
            A0f.Cht();
        }
    }
}
