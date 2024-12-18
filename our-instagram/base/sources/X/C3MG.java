package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.3MG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3MG {
    public final void A01(String str, UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(str, 2);
        Map map = ((C130235uT) userSession.A01(C130235uT.class, C130225uS.A00)).A00;
        String id = c38321qM.getId();
        if (id != null) {
            map.put(id, str);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.3MF] */
    public static final void A00() {
        C3MF c3mf = C3MF.A04;
        C3MF c3mf2 = c3mf;
        if (c3mf == null) {
            ?? obj = new Object();
            C3MF.A04 = obj;
            c3mf2 = obj;
        }
        C14360o3.A0C(c3mf2, "null cannot be cast to non-null type com.instagram.shopping.adapter.ifu.ShoppingIFUManager");
    }
}
