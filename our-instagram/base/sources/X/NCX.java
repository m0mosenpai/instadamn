package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class NCX extends AbstractC61132qb {
    public final UserSession A00;
    public final C54436O3q A01;
    public final List A02;

    public /* synthetic */ NCX(UserSession userSession, List list) {
        C54436O3q c54436O3q = new C54436O3q(userSession);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = list;
        this.A01 = c54436O3q;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C51001Mg8(this.A00, this.A01, this.A02);
    }
}
