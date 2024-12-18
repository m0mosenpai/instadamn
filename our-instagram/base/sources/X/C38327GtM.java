package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductSource;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GtM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38327GtM extends AbstractC52922bZ {
    public final int A00;
    public final C2GT A01;
    public final C2GS A02;
    public final ProductSource A03;
    public final C39333HYy A04;
    public final String A05;
    public final String A06;
    public final InterfaceC09390do A07;
    public final InterfaceC06180Ui A08;
    public final InterfaceC15070pN A09;
    public final C42866Ixg A0A;

    /* JADX WARN: Type inference failed for: r6v0, types: [X.2GT, X.2GS] */
    public C38327GtM(UserSession userSession, ProductSource productSource, EnumC39584Hdu enumC39584Hdu, String str, String str2, java.util.Set set, int i) {
        AbstractC25233BEq.A0v(1, userSession, set, productSource);
        C14360o3.A0B(enumC39584Hdu, 5);
        this.A03 = productSource;
        this.A00 = i;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = J8U.A00(userSession, 43);
        C42866Ixg c42866Ixg = new C42866Ixg(this, 2);
        this.A0A = c42866Ixg;
        C16930sl c16930sl = C16930sl.A00;
        ?? c2gt = new C2GT(new C37783Gjy(productSource, "", null, c16930sl, c16930sl, C16910sj.A00, set, true, false, false, false, false, false));
        this.A02 = c2gt;
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 0);
        this.A08 = A00;
        this.A01 = c2gt;
        this.A09 = new C06160Ug(null, A00);
        C39333HYy c39333HYy = new C39333HYy(userSession, c42866Ixg, enumC39584Hdu);
        c39333HYy.A03(AbstractC37302Gc3.A0N(c2gt).A00);
        this.A04 = c39333HYy;
    }

    public static final List A00(C38327GtM c38327GtM, String str) {
        String str2;
        List list = AbstractC37302Gc3.A0N(c38327GtM.A01).A04;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            C41037IFg c41037IFg = ((C41643IbZ) obj).A01().A02;
            if (c41037IFg != null) {
                ProductDetailsProductItemDict productDetailsProductItemDict = c41037IFg.A01;
                if (productDetailsProductItemDict != null) {
                    str2 = AbstractC38048Gob.A01(productDetailsProductItemDict).A0H;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                str2 = null;
            }
            if (C14360o3.A0K(str, str2)) {
                A1E.add(obj);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E);
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            A0q.add(((C41643IbZ) it.next()).A02());
        }
        return A0q;
    }

    public final void A01(C41643IbZ c41643IbZ, Product product) {
        C141796aw A00;
        int i;
        AbstractC167017dG.A1N(product, c41643IbZ);
        String str = this.A05;
        if (str != null && !C14360o3.A0K(AbstractC37302Gc3.A0d(product), str)) {
            A00 = AbstractC141776au.A00(this);
            i = 28;
        } else {
            int i2 = this.A00;
            if (i2 != -1) {
                C2GT c2gt = this.A01;
                if (AbstractC37302Gc3.A0N(c2gt).A06.size() == i2 && !AbstractC37302Gc3.A0N(c2gt).A06.contains(product.A0H)) {
                    A00 = AbstractC141776au.A00(this);
                    i = 26;
                }
            }
            C30184DRp c30184DRp = new C30184DRp(32, product, c41643IbZ, this);
            AbstractC37304Gc5.A0x(this.A01, this.A02, c30184DRp);
            return;
        }
        C43172J6r.A03(this, A00, i);
    }
}
