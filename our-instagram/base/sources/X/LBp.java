package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LBp {
    public static List A00(UserSession userSession, int i) {
        if (C18U.A06(C06090Tz.A05, userSession, 36328229255331172L)) {
            java.util.Set C2v = AbstractC166987dD.A0x(userSession).C2v("recent_direct_stickers");
            ArrayList A0q = AbstractC167017dG.A0q(C2v);
            Iterator it = C2v.iterator();
            while (it.hasNext()) {
                A0q.add(AbstractC47847LBq.parseFromJson(C16V.A00(AbstractC166987dD.A1B(it))));
            }
            return AbstractC001800i.A0d(AbstractC001800i.A0Z(A0q), i);
        }
        return C16930sl.A00;
    }

    public static void A01(UserSession userSession, C49807LzE c49807LzE, int i) {
        if (C18U.A06(C06090Tz.A05, userSession, 36328229255331172L)) {
            java.util.Set A06 = AbstractC16830sb.A06(c49807LzE);
            Iterator it = AbstractC001800i.A0k(AbstractC166987dD.A0x(userSession).C2v("recent_direct_stickers")).iterator();
            while (it.hasNext()) {
                C49807LzE parseFromJson = AbstractC47847LBq.parseFromJson(C16V.A00(AbstractC166987dD.A1B(it)));
                C14360o3.A07(parseFromJson);
                A06.add(parseFromJson);
            }
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            List A0d = AbstractC001800i.A0d(AbstractC001800i.A0Z(A06), i);
            ArrayList A0q = AbstractC167017dG.A0q(A0d);
            Iterator it2 = A0d.iterator();
            while (it2.hasNext()) {
                A0q.add(AbstractC47847LBq.A00((C49807LzE) it2.next()));
            }
            java.util.Set A0k = AbstractC001800i.A0k(A0q);
            InterfaceC19630xq interfaceC19630xq = A00.A01;
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.EEj("recent_direct_stickers");
            ARD.apply();
            AbstractC43594JPz.A1M(interfaceC19630xq, "recent_direct_stickers", A0k);
        }
    }
}
