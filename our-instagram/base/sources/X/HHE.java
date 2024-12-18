package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* loaded from: classes7.dex */
public final class HHE extends AbstractC60592pi {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ AnonymousClass389 A01;
    public final /* synthetic */ InterfaceC31040Dke A02;
    public final /* synthetic */ String A03;

    public HHE(C38321qM c38321qM, AnonymousClass389 anonymousClass389, InterfaceC31040Dke interfaceC31040Dke, String str) {
        this.A01 = anonymousClass389;
        this.A00 = c38321qM;
        this.A02 = interfaceC31040Dke;
        this.A03 = str;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        Product product;
        if (intent != null && i2 == -1 && i == 3 && (product = (Product) intent.getParcelableExtra("selected_product")) != null) {
            AnonymousClass389 anonymousClass389 = this.A01;
            Context requireContext = anonymousClass389.A00.requireContext();
            UserSession userSession = anonymousClass389.A03;
            AbstractC018607g abstractC018607g = anonymousClass389.A01;
            C38321qM c38321qM = this.A00;
            String id = c38321qM.getId();
            if (id != null) {
                String str = product.A0H;
                InterfaceC31040Dke interfaceC31040Dke = this.A02;
                J8U j8u = new J8U(interfaceC31040Dke, 31);
                String str2 = this.A03;
                DT6 dt6 = new DT6(anonymousClass389, product, interfaceC31040Dke, str2, 2);
                MIO mio = new MIO(c38321qM, anonymousClass389, interfaceC31040Dke, product, str2, 18);
                MEC mec = new MEC(interfaceC31040Dke, product, anonymousClass389, c38321qM, str2, 6);
                AbstractC167007dF.A1F(abstractC018607g, 2, str);
                C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                AbstractC37301Gc2.A1M(A0c, "commerce/community/featured_products/permission_create/", id);
                A0c.A9s("product_id", str);
                C1ON A0e = AbstractC25227BEk.A0e(A0c, C38889HAl.class, ISO.class);
                A0e.A00 = new EU1(5, j8u, mio, userSession, mec, dt6);
                C1GJ.A00(requireContext, abstractC018607g, A0e);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        ((InterfaceC59992oh) this.A01.A00).unregisterLifecycleListener(this);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        ((InterfaceC59992oh) this.A01.A00).unregisterLifecycleListener(this);
    }
}
