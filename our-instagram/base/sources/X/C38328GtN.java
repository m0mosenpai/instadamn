package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.GtN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38328GtN extends AbstractC52922bZ {
    public java.util.Set A00;
    public final C2GT A01;
    public final C39325HYq A02;
    public final C39331HYw A03;
    public final InterfaceC06180Ui A04;
    public final InterfaceC15070pN A05;
    public final C2GS A06;
    public final C42866Ixg A07;
    public final UserSession A08;
    public final C41202ILq A09;
    public final C41203ILr A0A;
    public final C42868Ixi A0B;
    public final C42870Ixk A0C;

    public final void A01(C41643IbZ c41643IbZ, Product product, boolean z) {
        AbstractC167017dG.A1N(product, c41643IbZ);
        java.util.Set set = this.A00;
        if (!C41643IbZ.A00(c41643IbZ, set)) {
            boolean z2 = !C41643IbZ.A00(c41643IbZ, (java.util.Set) ((C26063Bfr) AbstractC37301Gc2.A0e(this.A01)).A01);
            if (z2 && !C41768Iek.A02(this.A08, C41768Iek.A00).getBoolean("has_seen_hide_from_shop_nux_dialog", false)) {
                C39325HYq c39325HYq = this.A02;
                c39325HYq.A01(c41643IbZ, product);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c39325HYq.A02, "instagram_shopping_shop_manager_hide_product_nux");
                if (A0f.isSampled()) {
                    I6O.A00(A0f, c39325HYq, c41643IbZ, product);
                    AbstractC37300Gc1.A0m(A0f, ((INS) c39325HYq).A01);
                    A0f.Cht();
                }
                AbstractC166987dD.A1Z(new C57166PZk(c41643IbZ, this, product, null, 26), AbstractC141776au.A00(this));
                return;
            }
            A00(this, new DHP(24, c41643IbZ, z2));
            set.add(c41643IbZ.A02());
            if (z2) {
                if (!z) {
                    this.A02.A01(c41643IbZ, product);
                }
                this.A0A.A00(c41643IbZ, product);
            } else {
                this.A02.A00(c41643IbZ, product);
                this.A09.A00(c41643IbZ, product);
            }
        }
    }

    public static final void A00(C38328GtN c38328GtN, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC37304Gc5.A0x(c38328GtN.A01, c38328GtN.A06, interfaceC16660sJ);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.PIC, X.HYw] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.2GT, X.2GS] */
    public C38328GtN(Context context, AbstractC018607g abstractC018607g, UserSession userSession, C39325HYq c39325HYq) {
        AbstractC167027dH.A13(userSession, context, abstractC018607g);
        C14360o3.A0B(c39325HYq, 4);
        this.A08 = userSession;
        this.A02 = c39325HYq;
        this.A00 = AbstractC31171DnF.A0l();
        C42870Ixk c42870Ixk = new C42870Ixk(this);
        this.A0C = c42870Ixk;
        C42868Ixi c42868Ixi = new C42868Ixi(this);
        this.A0B = c42868Ixi;
        C42866Ixg c42866Ixg = new C42866Ixg(this, 4);
        this.A07 = c42866Ixg;
        this.A03 = new PIC(userSession, c42866Ixg);
        this.A0A = new C41203ILr(context, abstractC018607g, userSession, c42870Ixk);
        this.A09 = new C41202ILq(context, abstractC018607g, userSession, c42868Ixi);
        ?? c2gt = new C2GT(new C26063Bfr("", C16930sl.A00, C16910sj.A00, false, false, false));
        this.A06 = c2gt;
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 0);
        this.A04 = A00;
        this.A01 = c2gt;
        this.A05 = new C06160Ug(null, A00);
    }
}
