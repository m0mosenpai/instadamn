package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IMo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41223IMo {
    public final C18920wW A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;

    public final void A01(C38321qM c38321qM, List list) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_shoppable_everything_delivery");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A15(A0f, this.A02);
            ArrayList arrayList = null;
            A0f.A9K("seed_media_id", AbstractC37302Gc3.A0W(c38321qM.A38()));
            A0f.A9K("seed_ad_id", AbstractC37302Gc3.A0W(AbstractC41071vF.A07(this.A01, c38321qM)));
            if (list != null) {
                arrayList = AbstractC167007dF.A0i(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC003100w.A0k(10, AbstractC167027dH.A0Q(it.next())));
                }
            }
            A0f.AAk(AbstractC43591JPw.A00(405), arrayList);
            A0f.Cht();
        }
    }

    public C41223IMo(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A00 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
    }

    public final void A00(C38321qM c38321qM, Product product, Integer num, Integer num2, String str, String str2) {
        Long l;
        String str3;
        AbstractC167017dG.A1N(str, str2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_shoppable_everything_item_feedback");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A15(A0f, this.A02);
            User user = null;
            A0f.A9K("seed_media_id", AbstractC37302Gc3.A0W(c38321qM.A38()));
            A0f.A9K("seed_ad_id", AbstractC37302Gc3.A0W(AbstractC41071vF.A07(this.A01, c38321qM)));
            if (num != null && num2 != null) {
                l = AbstractC31171DnF.A0V((num.intValue() * 2) + num2.intValue());
            } else {
                l = null;
            }
            A0f.A9K("position", l);
            if (product != null) {
                str3 = product.A0H;
            } else {
                str3 = null;
            }
            A0f.AAP("product_id", str3);
            if (product != null) {
                user = product.A0B;
            }
            A0f.AAP("merchant_id", AbstractC76433bn.A00(user));
            A0f.AAP("outcome", str2);
            A0f.AAP(AbstractC111324zv.A00(1196), str);
            A0f.Cht();
        }
    }
}
