package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.IxS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42852IxS implements InterfaceC43442JHg {
    public final /* synthetic */ IMV A00;
    public final /* synthetic */ Product A01;
    public final /* synthetic */ InterfaceC23621Ds A02;

    public C42852IxS(IMV imv, Product product, InterfaceC23621Ds interfaceC23621Ds) {
        this.A00 = imv;
        this.A02 = interfaceC23621Ds;
        this.A01 = product;
    }

    @Override // X.InterfaceC43442JHg
    public final void DVJ(String str) {
        IMV imv = this.A00;
        C05A c05a = imv.A02;
        Boolean A0a = AbstractC166997dE.A0a();
        c05a.Egh(A0a);
        imv.A03.Egh(A0a);
        this.A02.resumeWith(A0a);
        C41728Idz c41728Idz = imv.A00;
        Product product = this.A01;
        String A0d = AbstractC37302Gc3.A0d(product);
        C14360o3.A0A(A0d);
        c41728Idz.A05(product, A0d);
    }

    @Override // X.InterfaceC43442JHg
    public final void Dxo(List list) {
        IMV imv = this.A00;
        C05A c05a = imv.A02;
        Boolean A0a = AbstractC166997dE.A0a();
        c05a.Egh(A0a);
        imv.A03.Egh(A0a);
        this.A02.resumeWith(A0a);
        C41728Idz c41728Idz = imv.A00;
        Product product = this.A01;
        String A0d = AbstractC37302Gc3.A0d(product);
        C14360o3.A0A(A0d);
        c41728Idz.A05(product, A0d);
    }

    @Override // X.InterfaceC43442JHg
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C41730Ie1 c41730Ie1 = (C41730Ie1) obj;
        C14360o3.A0B(c41730Ie1, 0);
        IMV imv = this.A00;
        AbstractC166997dE.A1Y(imv.A02, false);
        C05A c05a = imv.A03;
        Boolean A0b = AbstractC166997dE.A0b();
        c05a.Egh(A0b);
        this.A02.resumeWith(A0b);
        C41728Idz c41728Idz = imv.A00;
        String A0d = AbstractC37302Gc3.A0d(this.A01);
        C14360o3.A0A(A0d);
        UserSession userSession = c41728Idz.A03;
        C1563470e A0G = AbstractC37300Gc1.A0G(userSession);
        C14360o3.A07(A0G);
        if (A0G.A01 != null) {
            if (A0d != null) {
                if (A0G.A09(A0d) != null) {
                    InterfaceC11380iw interfaceC11380iw = c41728Idz.A01;
                    String str = c41728Idz.A0B;
                    String str2 = c41728Idz.A0A;
                    String str3 = c41728Idz.A07;
                    String str4 = c41728Idz.A0D;
                    String str5 = A0G.A01;
                    if (str5 != null) {
                        String A09 = A0G.A09(A0d);
                        if (A09 != null) {
                            AbstractC41757IeY.A04(interfaceC11380iw, userSession, c41728Idz.A04, null, c41730Ie1, str, str2, A0d, str3, str4, "lightbox_sticky_cta", str5, A09, c41728Idz.A06, c41728Idz.A08, c41728Idz.A05.A04());
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }
}
