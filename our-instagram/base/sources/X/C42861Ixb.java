package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Ixb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42861Ixb implements JHO {
    public final /* synthetic */ IND A00;
    public final /* synthetic */ Product A01;

    public C42861Ixb(IND ind, Product product) {
        this.A00 = ind;
        this.A01 = product;
    }

    @Override // X.JHO
    public final void DFf() {
        JI6 ji6 = this.A00.A07;
        C41753IeT A00 = C41753IeT.A00(ji6);
        C41595Iai c41595Iai = ji6.C02().A02;
        EnumC39591He1 enumC39591He1 = c41595Iai.A03;
        boolean z = c41595Iai.A06;
        EnumC39591He1 enumC39591He12 = c41595Iai.A00;
        EnumC39591He1 enumC39591He13 = c41595Iai.A04;
        EnumC39591He1 enumC39591He14 = c41595Iai.A05;
        A00.A02 = new C41595Iai(enumC39591He12, EnumC39591He1.A04, c41595Iai.A02, enumC39591He1, enumC39591He13, enumC39591He14, z);
        C41726Idx.A02(ji6, A00);
    }

    @Override // X.JHO
    public final void Dq6(HAX hax) {
        ProductArEffectMetadata productArEffectMetadata;
        String str;
        IND ind = this.A00;
        UserSession userSession = ind.A01;
        ArrayList A02 = AbstractC41661Ibt.A02(userSession, AbstractC31172DnG.A19(hax.A01));
        IJ9 ij9 = hax.A00;
        C39354HZt c39354HZt = null;
        if (ij9 != null && (productArEffectMetadata = ij9.A00) != null && (str = productArEffectMetadata.A03) != null) {
            c39354HZt = AbstractC41661Ibt.A00(ij9, str);
        }
        JI6 ji6 = ind.A07;
        C41753IeT A00 = C41753IeT.A00(ji6);
        C41595Iai c41595Iai = ji6.C02().A02;
        EnumC39591He1 enumC39591He1 = c41595Iai.A03;
        boolean z = c41595Iai.A06;
        A00.A02 = new C41595Iai(c41595Iai.A00, EnumC39591He1.A05, c41595Iai.A02, enumC39591He1, c41595Iai.A04, c41595Iai.A05, z);
        C41723Idu c41723Idu = ji6.C02().A04;
        HashMap A1G = AbstractC166987dD.A1G();
        EnumC39541HdD enumC39541HdD = c41723Idu.A01;
        C38321qM c38321qM = c41723Idu.A00;
        A1G.putAll(c41723Idu.A05);
        Integer num = c41723Idu.A03;
        Map map = c41723Idu.A04;
        Product product = this.A01;
        A1G.put(C41723Idu.A00(userSession, product), A02);
        A00.A04 = new C41723Idu(c38321qM, enumC39541HdD, c39354HZt, num, map, A1G);
        C41726Idx.A02(ji6, A00);
        C41702IdW c41702IdW = ind.A03;
        if (c41702IdW != null) {
            c41702IdW.A02(product, A02.size());
        }
    }
}
