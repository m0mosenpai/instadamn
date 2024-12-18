package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.ProductCollection;

/* renamed from: X.GtH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38322GtH extends AbstractC52922bZ {
    public final C2GT A00;
    public final C2GS A01;
    public final ILP A02;
    public final C39330HYv A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final InterfaceC09390do A08;
    public final InterfaceC06180Ui A09;
    public final InterfaceC15070pN A0A;
    public final C42866Ixg A0B;

    public final void A00(C41643IbZ c41643IbZ, ProductCollection productCollection) {
        IH6 ih6;
        ILP ilp = this.A02;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(ilp.A00, "instagram_shopping_product_collection_picker_collection_select");
        if (A0f.isSampled()) {
            AbstractC37300Gc1.A0n(A0f, ilp.A01);
            String Ap3 = productCollection.Ap3();
            if (Ap3 == null) {
                Ap3 = "";
            }
            A0f.AAP("product_collection_id", Ap3);
            A0f.Cht();
        }
        C41036IFf c41036IFf = c41643IbZ.A01().A00;
        if (c41036IFf != null && (ih6 = c41036IFf.A00) != null) {
            String str = ih6.A01;
            AbstractC166987dD.A1Z(new C57161PZf(productCollection, ih6, this, ih6.A00, str, null, 21), AbstractC141776au.A00(this));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A01(String str) {
        DHI dhi = new DHI(str, 2);
        AbstractC37304Gc5.A0x(this.A00, this.A01, dhi);
        C39330HYv c39330HYv = this.A03;
        c39330HYv.A01 = str;
        c39330HYv.A06(true);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.HYv, X.PIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.2GT, X.2GS] */
    public C38322GtH(UserSession userSession, ILP ilp, String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1P(userSession, ilp);
        this.A02 = ilp;
        this.A06 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A05 = str4;
        ?? c2gt = new C2GT(new C38680GzL());
        this.A01 = c2gt;
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 0);
        this.A09 = A00;
        this.A00 = c2gt;
        this.A0A = new C06160Ug(null, A00);
        this.A08 = J8U.A00(userSession, 42);
        C42866Ixg c42866Ixg = new C42866Ixg(this, 1);
        this.A0B = c42866Ixg;
        this.A03 = new PIC(userSession, c42866Ixg);
    }
}
