package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.38a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C688938a {
    public boolean A00;
    public final UserSession A01;

    public C688938a(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void A00(AbstractC59962oe abstractC59962oe, JG4 jg4, C40990IDl c40990IDl, String str, Map map) {
        if (!this.A00) {
            this.A00 = true;
            AbstractC192798gL A02 = C192108fB.A02(null, this.A01, str, map);
            A02.A00(new HDa(abstractC59962oe, jg4, this, c40990IDl));
            abstractC59962oe.schedule(A02);
        }
    }
}
