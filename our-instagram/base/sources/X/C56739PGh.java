package X;

import com.instagram.model.shopping.video.ShoppingCreationConfig;

/* renamed from: X.PGh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56739PGh implements InterfaceC57995Pnf {
    public final /* synthetic */ C56363P0y A00;

    public C56739PGh(C56363P0y c56363P0y) {
        this.A00 = c56363P0y;
    }

    @Override // X.InterfaceC57995Pnf
    public final void onClick() {
        ShoppingCreationConfig shoppingCreationConfig;
        C56363P0y c56363P0y = this.A00;
        InterfaceC58310Pt2 interfaceC58310Pt2 = c56363P0y.A02;
        AbstractC59962oe abstractC59962oe = c56363P0y.A01;
        C52094N2u c52094N2u = c56363P0y.A05.A00;
        if (c52094N2u != null) {
            shoppingCreationConfig = c52094N2u.A01;
        } else {
            shoppingCreationConfig = null;
        }
        interfaceC58310Pt2.Ds7(abstractC59962oe, shoppingCreationConfig);
    }
}
