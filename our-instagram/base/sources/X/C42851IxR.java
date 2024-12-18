package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.IxR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42851IxR implements InterfaceC43442JHg {
    public final /* synthetic */ C41646Ibe A00;
    public final /* synthetic */ Product A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC43442JHg
    public final void Dxo(List list) {
        C14360o3.A0B(list, 0);
        C41646Ibe c41646Ibe = this.A00;
        Fragment fragment = c41646Ibe.A02;
        if (fragment.isVisible()) {
            if (AbstractC166987dD.A1b(list)) {
                AbstractC41666Iby.A02(((JGU) list.get(0)).BSe(fragment.requireContext(), c41646Ibe.A03), 0, AnonymousClass001.A0R(this.A02, "_product_add_to_cart_failure"));
            } else {
                throw AbstractC166987dD.A12("Failed requirement.");
            }
        }
        InterfaceC60442pS interfaceC60442pS = c41646Ibe.A04;
        UserSession userSession = c41646Ibe.A03;
        String str = this.A02;
        String str2 = c41646Ibe.A0E;
        Product product = this.A01;
        AbstractC41757IeY.A05(interfaceC60442pS, userSession, null, null, product, str, str2, AbstractC37302Gc3.A0d(product), null, c41646Ibe.A0I);
    }

    public C42851IxR(C41646Ibe c41646Ibe, Product product, String str) {
        this.A00 = c41646Ibe;
        this.A01 = product;
        this.A02 = str;
    }

    @Override // X.InterfaceC43442JHg
    public final void DVJ(String str) {
        C41646Ibe c41646Ibe = this.A00;
        Fragment fragment = c41646Ibe.A02;
        if (fragment.isVisible()) {
            AbstractC41666Iby.A01(fragment.requireContext());
        }
        Product product = this.A01;
        AbstractC41757IeY.A05(c41646Ibe.A04, c41646Ibe.A03, null, null, product, this.A02, c41646Ibe.A0E, AbstractC37302Gc3.A0d(product), null, c41646Ibe.A0I);
    }

    @Override // X.InterfaceC43442JHg
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C41730Ie1 c41730Ie1 = (C41730Ie1) obj;
        C14360o3.A0B(c41730Ie1, 0);
        C41646Ibe c41646Ibe = this.A00;
        UserSession userSession = c41646Ibe.A03;
        AbstractC23021Ah.A00(userSession).A0R();
        C1563470e A0G = AbstractC37300Gc1.A0G(userSession);
        Product product = this.A01;
        User user = product.A0B;
        String str = null;
        String A0o = AbstractC37301Gc2.A0o(user);
        C14360o3.A0A(A0o);
        A0G.A0H(product, A0o);
        Fragment fragment = c41646Ibe.A02;
        if (fragment.isVisible()) {
            C31349DqE c31349DqE = c41646Ibe.A01;
            if (c31349DqE != null) {
                AbstractC31177DnL.A1L(c31349DqE);
                c41646Ibe.A01 = null;
            }
            c41646Ibe.A01 = AbstractC41666Iby.A00(fragment.requireActivity(), new C42704Iuz(3, product, c41646Ibe), c41730Ie1);
        }
        C1563470e A0G2 = AbstractC37300Gc1.A0G(userSession);
        C14360o3.A07(A0G2);
        InterfaceC60442pS interfaceC60442pS = c41646Ibe.A04;
        String str2 = this.A02;
        String str3 = c41646Ibe.A0E;
        String A0o2 = AbstractC37301Gc2.A0o(user);
        String str4 = c41646Ibe.A0I;
        String moduleName = interfaceC60442pS.getModuleName();
        String str5 = A0G2.A01;
        if (str5 != null) {
            if (user != null) {
                str = AbstractC76433bn.A00(user);
            }
            C14360o3.A0A(str);
            String A09 = A0G2.A09(str);
            if (A09 != null) {
                AbstractC41757IeY.A04(interfaceC60442pS, userSession, null, null, c41730Ie1, str2, str3, A0o2, null, str4, moduleName, str5, A09, null, null, product.A04());
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
