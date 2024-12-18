package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes7.dex */
public final class IMV {
    public final C41728Idz A00;
    public final C70Y A01;
    public final C05A A02;
    public final C05A A03;
    public final C05A A04;
    public final C0UO A05;
    public final C0UO A06;
    public final C0UO A07;
    public final UserSession A08;
    public final Product A09;

    public IMV(UserSession userSession, C41728Idz c41728Idz, C70Y c70y, Product product) {
        AbstractC167027dH.A0a(1, userSession, product, c70y, c41728Idz);
        this.A08 = userSession;
        this.A09 = product;
        this.A01 = c70y;
        this.A00 = c41728Idz;
        C008002u A00 = C10E.A00(Boolean.valueOf(c70y.A08(product)));
        this.A03 = A00;
        this.A06 = AbstractC208910l.A02(A00);
        Boolean A0a = AbstractC166997dE.A0a();
        C008002u A1H = AbstractC25225BEi.A1H(A0a);
        this.A02 = A1H;
        this.A05 = AbstractC208910l.A02(A1H);
        C008002u A1H2 = AbstractC25225BEi.A1H(A0a);
        this.A04 = A1H2;
        this.A07 = AbstractC208910l.A02(A1H2);
    }

    public final Object A00(String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C89563yw.A01;
        C89563yw c89563yw = new C89563yw(C1E2.A02(interfaceC23621Ds));
        AbstractC166997dE.A1Y(this.A04, true);
        UserSession userSession = this.A08;
        Product product = this.A09;
        String str2 = product.A0H;
        String A0d = AbstractC37302Gc3.A0d(product);
        C14360o3.A0A(A0d);
        C42865Ixf c42865Ixf = new C42865Ixf(1, this, c89563yw);
        C1ON A00 = ISX.A00(userSession, String.valueOf(i), str2, A0d, str);
        A00.A00 = new C39026HGc(userSession, c42865Ixf, str2, 1);
        C1GJ.A03(A00);
        return c89563yw.A00();
    }
}
