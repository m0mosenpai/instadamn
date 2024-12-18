package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.Map;

/* renamed from: X.HHc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39052HHc extends AbstractC61132qb {
    public final int A00;
    public final UserSession A01;
    public final C41728Idz A02;
    public final Product A03;
    public final String A04;
    public final Map A05;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        Product product = this.A03;
        Map map = this.A05;
        return new C38332GtR(userSession, this.A02, product, this.A04, map, this.A00);
    }

    public C39052HHc(UserSession userSession, C41728Idz c41728Idz, Product product, String str, Map map, int i) {
        AbstractC167017dG.A1Q(userSession, map);
        C14360o3.A0B(c41728Idz, 5);
        this.A01 = userSession;
        this.A03 = product;
        this.A05 = map;
        this.A04 = str;
        this.A02 = c41728Idz;
        this.A00 = i;
    }
}
