package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.ESf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32479ESf extends C1P1 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ Map A02;

    public C32479ESf(UserSession userSession, List list, Map map) {
        this.A01 = list;
        this.A00 = userSession;
        this.A02 = map;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1781329265);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            UserSession userSession = this.A00;
            User A0k = AbstractC31174DnI.A0k(userSession, A1B);
            if (A0k != null) {
                Boolean bool = (Boolean) this.A02.get(A1B);
                if (bool != null) {
                    A0k.A0v(bool.booleanValue());
                    AbstractC25651Mw.A00(userSession).E4s(new C42281xI(A0k));
                    A0k.A0c(userSession);
                }
                AbstractC129875tr.A00(userSession).A0E(A0k);
            }
        }
        C0f9.A0A(1709325004, A03);
    }
}
