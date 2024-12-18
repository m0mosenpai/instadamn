package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class HHW extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public HHW(UserSession userSession, String str, String str2, List list) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A03 = list;
        this.A01 = str2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        String str = this.A02;
        List list = this.A03;
        String str2 = this.A01;
        AbstractC167017dG.A1O(userSession, list);
        return new C38333GtS(userSession, new C42342Ip4(C12L.A00, userSession, str, str2, list), str);
    }
}
