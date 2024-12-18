package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ib7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41617Ib7 {
    public C38321qM A00;
    public EnumC39541HdD A01;
    public C39354HZt A02;
    public Integer A03;
    public Map A04;
    public final Map A05;

    public final void A00(UserSession userSession, Product product, List list) {
        this.A05.put(C41723Idu.A00(userSession, product), list);
    }

    public C41617Ib7(C41723Idu c41723Idu) {
        this.A01 = EnumC39541HdD.A02;
        HashMap A1G = AbstractC166987dD.A1G();
        this.A05 = A1G;
        this.A03 = null;
        this.A04 = AbstractC166987dD.A1G();
        this.A01 = c41723Idu.A01;
        this.A00 = c41723Idu.A00;
        A1G.putAll(c41723Idu.A05);
        this.A03 = c41723Idu.A03;
        this.A04 = c41723Idu.A04;
        this.A02 = c41723Idu.A02;
    }

    public C41617Ib7() {
        this.A01 = EnumC39541HdD.A02;
        this.A05 = AbstractC166987dD.A1G();
        this.A03 = null;
        this.A04 = AbstractC166987dD.A1G();
    }
}
