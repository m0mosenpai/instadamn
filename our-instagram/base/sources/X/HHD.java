package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* loaded from: classes7.dex */
public final class HHD extends AbstractC60592pi {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ AnonymousClass389 A01;
    public final /* synthetic */ InterfaceC31040Dke A02;
    public final /* synthetic */ String A03;

    public HHD(C38321qM c38321qM, AnonymousClass389 anonymousClass389, InterfaceC31040Dke interfaceC31040Dke, String str) {
        this.A01 = anonymousClass389;
        this.A02 = interfaceC31040Dke;
        this.A03 = str;
        this.A00 = c38321qM;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null && i2 == -1 && i == 13) {
            Product product = (Product) intent.getParcelableExtra("selected_product");
            String stringExtra = intent.getStringExtra("media_id");
            if (product != null && stringExtra != null) {
                AnonymousClass389 anonymousClass389 = this.A01;
                Context requireContext = anonymousClass389.A00.requireContext();
                UserSession userSession = anonymousClass389.A03;
                AbstractC018607g abstractC018607g = anonymousClass389.A01;
                String str = product.A0H;
                InterfaceC31040Dke interfaceC31040Dke = this.A02;
                J8U j8u = new J8U(interfaceC31040Dke, 30);
                String str2 = this.A03;
                C30226DTf c30226DTf = new C30226DTf(anonymousClass389, interfaceC31040Dke, product, stringExtra, str2, 3);
                C38321qM c38321qM = this.A00;
                C65026TcC c65026TcC = new C65026TcC(product, anonymousClass389, c38321qM, interfaceC31040Dke, stringExtra, str2, 3);
                C29724D8u c29724D8u = new C29724D8u(anonymousClass389, interfaceC31040Dke, product, c38321qM, str2, stringExtra, 0);
                AbstractC167007dF.A1F(abstractC018607g, 2, str);
                C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                AbstractC37301Gc2.A1M(A0c, "commerce/community/featured_products/permission_create/", stringExtra);
                A0c.A9s("product_id", str);
                C1ON A0e = AbstractC25227BEk.A0e(A0c, C38889HAl.class, ISO.class);
                A0e.A00 = new EU1(5, j8u, c65026TcC, userSession, c29724D8u, c30226DTf);
                C1GJ.A00(requireContext, abstractC018607g, A0e);
            }
        }
        ((InterfaceC59992oh) this.A01.A00).unregisterLifecycleListener(this);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        ((InterfaceC59992oh) this.A01.A00).unregisterLifecycleListener(this);
    }
}
