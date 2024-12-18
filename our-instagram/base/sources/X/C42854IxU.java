package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.IxU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42854IxU implements InterfaceC43442JHg {
    public final /* synthetic */ IND A00;
    public final /* synthetic */ Product A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    @Override // X.InterfaceC43442JHg
    public final void Dxo(List list) {
        C14360o3.A0B(list, 0);
        IND ind = this.A00;
        Product product = this.A01;
        String str = this.A03;
        String str2 = this.A04;
        User user = product.A0B;
        JI6 ji6 = ind.A07;
        C41726Idx C02 = ji6.C02();
        C41753IeT c41753IeT = new C41753IeT(C02);
        C41595Iai c41595Iai = C02.A02;
        EnumC39591He1 enumC39591He1 = c41595Iai.A03;
        boolean z = c41595Iai.A06;
        EnumC39591He1 enumC39591He12 = c41595Iai.A04;
        EnumC39591He1 enumC39591He13 = c41595Iai.A05;
        c41753IeT.A02 = new C41595Iai(EnumC39591He1.A04, c41595Iai.A01, c41595Iai.A02, enumC39591He1, enumC39591He12, enumC39591He13, z);
        C41726Idx.A02(ji6, c41753IeT);
        InterfaceC60442pS interfaceC60442pS = ind.A02;
        UserSession userSession = ind.A01;
        AbstractC41757IeY.A05(interfaceC60442pS, userSession, ji6.Byj(), ind.A06, product, str, str2, AbstractC37302Gc3.A0e(user), ind.A08, ind.A0C);
        JGU jgu = (JGU) list.get(0);
        Context context = ind.A00.getContext();
        if (context != null) {
            AbstractC41666Iby.A02(jgu.BSe(context, userSession), 0, "product_details_add_to_cart_failure");
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C42854IxU(IND ind, Product product, String str, String str2, String str3) {
        this.A00 = ind;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = product;
    }

    @Override // X.InterfaceC43442JHg
    public final void DVJ(String str) {
        IND ind = this.A00;
        Product product = this.A01;
        String str2 = this.A03;
        String str3 = this.A04;
        User user = product.A0B;
        JI6 ji6 = ind.A07;
        C41726Idx C02 = ji6.C02();
        C41753IeT c41753IeT = new C41753IeT(C02);
        C41595Iai c41595Iai = C02.A02;
        EnumC39591He1 enumC39591He1 = c41595Iai.A03;
        boolean z = c41595Iai.A06;
        EnumC39591He1 enumC39591He12 = c41595Iai.A04;
        EnumC39591He1 enumC39591He13 = c41595Iai.A05;
        c41753IeT.A02 = new C41595Iai(EnumC39591He1.A04, c41595Iai.A01, c41595Iai.A02, enumC39591He1, enumC39591He12, enumC39591He13, z);
        C41726Idx.A02(ji6, c41753IeT);
        AbstractC41757IeY.A05(ind.A02, ind.A01, ji6.Byj(), ind.A06, product, str2, str3, AbstractC37302Gc3.A0e(user), ind.A08, ind.A0C);
        AbstractC59962oe abstractC59962oe = ind.A00;
        if (abstractC59962oe.isVisible()) {
            Context context = abstractC59962oe.getContext();
            if (context != null) {
                AbstractC41666Iby.A01(context);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC43442JHg
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String A00;
        String A09;
        C41730Ie1 c41730Ie1 = (C41730Ie1) obj;
        C14360o3.A0B(c41730Ie1, 0);
        IND ind = this.A00;
        String str2 = this.A02;
        String str3 = this.A03;
        String str4 = this.A04;
        Product product = this.A01;
        User user = product.A0B;
        JI6 ji6 = ind.A07;
        C41726Idx C02 = ji6.C02();
        UserSession userSession = ind.A01;
        AbstractC23021Ah.A00(userSession).A0R();
        C41753IeT c41753IeT = new C41753IeT(C02);
        C41595Iai c41595Iai = C02.A02;
        c41753IeT.A02 = new C41595Iai(EnumC39591He1.A05, c41595Iai.A01, c41595Iai.A02, c41595Iai.A03, c41595Iai.A04, c41595Iai.A05, c41595Iai.A06);
        C41726Idx.A02(ji6, c41753IeT);
        C1563470e A0G = AbstractC37300Gc1.A0G(userSession);
        C14360o3.A07(A0G);
        InterfaceC60442pS interfaceC60442pS = ind.A02;
        if (user != null) {
            str = AbstractC76433bn.A00(user);
        } else {
            str = null;
        }
        String str5 = ind.A08;
        String str6 = ind.A0C;
        String str7 = A0G.A01;
        if (str7 != null) {
            if (user != null && (A00 = AbstractC76433bn.A00(user)) != null && (A09 = A0G.A09(A00)) != null) {
                AbstractC41757IeY.A04(interfaceC60442pS, userSession, ji6.Byj(), ind.A06, c41730Ie1, str3, str4, str, str5, str6, str2, str7, A09, null, ind.A09, product.A04());
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
