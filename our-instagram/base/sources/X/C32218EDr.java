package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EDr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32218EDr extends AnonymousClass935 {
    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(-2032958749);
        EDO edo = (EDO) obj;
        int A032 = C0f9.A03(-1879922614);
        boolean A1R = AbstractC167007dF.A1R(0, userSession, edo);
        Iterator it = edo.A01.iterator();
        while (it.hasNext()) {
            List<E6O> list = ((E6S) it.next()).A06;
            if (!list.isEmpty() && "mute_all".equals(((E6O) list.get(0)).A01)) {
                for (E6O e6o : list) {
                    String str = e6o.A02;
                    if (Boolean.valueOf(A1R).equals(e6o.A00) && str != null) {
                        AbstractC23021Ah.A00(userSession).A0k(Long.parseLong(str));
                    }
                }
            }
        }
        C0f9.A0A(4659036, A032);
        C0f9.A0A(1675874978, A03);
    }

    public C32218EDr(UserSession userSession) {
        super(userSession);
    }
}
