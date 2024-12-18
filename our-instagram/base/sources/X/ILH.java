package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ILH {
    public C114845Gu A00;
    public final AbstractC12990ll A01;

    public final void A00(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(interfaceC60442pS, 1);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String A01 = AbstractC123955j9.A01(userSession, c38321qM);
        if (A01 != null) {
            A1I.put("extra_tracking", A01);
        }
        if (this.A00 != null) {
            System.currentTimeMillis();
            C18U.A00(C06090Tz.A05, this.A01, 37154903084236806L);
        }
    }

    public ILH(AbstractC12990ll abstractC12990ll) {
        this.A01 = abstractC12990ll;
    }
}
