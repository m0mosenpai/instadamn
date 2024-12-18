package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.IxQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42850IxQ implements InterfaceC43442JHg {
    public final /* synthetic */ C41165IKe A00;
    public final /* synthetic */ Product A01;

    public C42850IxQ(C41165IKe c41165IKe, Product product) {
        this.A00 = c41165IKe;
        this.A01 = product;
    }

    @Override // X.InterfaceC43442JHg
    public final void DVJ(String str) {
        C41165IKe c41165IKe = this.A00;
        Fragment fragment = c41165IKe.A02;
        if (fragment.isVisible()) {
            AbstractC41666Iby.A01(fragment.requireContext());
        }
        Product product = this.A01;
        AbstractC41757IeY.A05(c41165IKe.A04, c41165IKe.A03, null, null, product, "wish_list_feed", c41165IKe.A0B, AbstractC37300Gc1.A0T(product), null, c41165IKe.A0C);
    }

    @Override // X.InterfaceC43442JHg
    public final void Dxo(List list) {
        C41165IKe c41165IKe = this.A00;
        Fragment fragment = c41165IKe.A02;
        if (fragment.isVisible()) {
            C18C.A0E(AbstractC166987dD.A1b(list));
            AbstractC41666Iby.A02(((JGU) list.get(0)).BSe(fragment.requireContext(), c41165IKe.A03), 0, "wish_list_feed_product_add_to_cart_failure");
        }
        InterfaceC60442pS interfaceC60442pS = c41165IKe.A04;
        UserSession userSession = c41165IKe.A03;
        String str = c41165IKe.A0B;
        Product product = this.A01;
        AbstractC41757IeY.A05(interfaceC60442pS, userSession, null, null, product, "wish_list_feed", str, AbstractC37300Gc1.A0T(product), null, c41165IKe.A0C);
    }

    @Override // X.InterfaceC43442JHg
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C41730Ie1 c41730Ie1 = (C41730Ie1) obj;
        C41165IKe c41165IKe = this.A00;
        UserSession userSession = c41165IKe.A03;
        AbstractC23021Ah.A00(userSession).A0R();
        C1563470e A0G = AbstractC37300Gc1.A0G(userSession);
        Product product = this.A01;
        User user = product.A0B;
        A0G.A0H(product, AbstractC76433bn.A00(user));
        Fragment fragment = c41165IKe.A02;
        if (fragment.isVisible()) {
            C31349DqE c31349DqE = c41165IKe.A00;
            if (c31349DqE != null) {
                AbstractC31177DnL.A1L(c31349DqE);
                c41165IKe.A00 = null;
            }
            c41165IKe.A00 = AbstractC41666Iby.A00(fragment.requireActivity(), new C42704Iuz(2, this, c41730Ie1), c41730Ie1);
        }
        C1563470e A0G2 = AbstractC37300Gc1.A0G(userSession);
        InterfaceC60442pS interfaceC60442pS = c41165IKe.A04;
        String str = c41165IKe.A0B;
        String A00 = AbstractC76433bn.A00(user);
        String str2 = c41165IKe.A0C;
        String moduleName = interfaceC60442pS.getModuleName();
        String str3 = A0G2.A01;
        str3.getClass();
        String A09 = A0G2.A09(AbstractC76433bn.A00(user));
        A09.getClass();
        AbstractC41757IeY.A04(interfaceC60442pS, userSession, null, null, c41730Ie1, "wish_list_feed", str, A00, null, str2, moduleName, str3, A09, null, null, product.A04());
    }
}
