package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class P4I implements InterfaceC58050Pob {
    public final /* synthetic */ C50911Meg A00;

    @Override // X.InterfaceC58050Pob
    public final void Dpl(C51761Mtk c51761Mtk) {
        ArrayList arrayList;
        Object value;
        String str;
        ArrayList A1E;
        Boolean bool;
        ArrayList A0T;
        Boolean bool2;
        User user;
        ImageInfo BGx;
        List AlQ;
        ExtendedImageUrl extendedImageUrl;
        String str2;
        User user2;
        C51745MtU c51745MtU = (C51745MtU) c51761Mtk.A02;
        if (c51745MtU != null) {
            List list = (List) c51745MtU.A01;
            if (list != null) {
                C50911Meg c50911Meg = this.A00;
                arrayList = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Product(null, ((ImmutablePandoProductDetailsProductItemDict) AbstractC25225BEi.A0l(it).getRequiredTreeField(0, "node", C60255QwT.class, -548658410).reinterpretRequired(0, C67314Ujz.class, -861521069).reinterpret(ImmutablePandoProductDetailsProductItemDict.class)).F7S(MSZ.A0S(C1DS.A00(c50911Meg.A00)))));
                }
            } else {
                arrayList = null;
            }
            Boolean valueOf = Boolean.valueOf(c51745MtU.A02);
            Integer valueOf2 = Integer.valueOf(c51745MtU.A00);
            if (arrayList != null && !arrayList.isEmpty()) {
                C05A c05a = this.A00.A04;
                do {
                    value = c05a.getValue();
                    C51728Mt5 c51728Mt5 = (C51728Mt5) value;
                    Product product = (Product) AbstractC001800i.A0O(arrayList, 0);
                    if (product != null && (user2 = product.A0B) != null) {
                        str = user2.getUsername();
                    } else {
                        str = null;
                    }
                    A1E = AbstractC166987dD.A1E();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ProductImageContainer productImageContainer = ((Product) it2.next()).A09;
                        if (productImageContainer != null && (BGx = productImageContainer.BGx()) != null && (AlQ = BGx.AlQ()) != null && (extendedImageUrl = (ExtendedImageUrl) AbstractC001800i.A0O(AlQ, 0)) != null && (str2 = extendedImageUrl.A0A) != null) {
                            A1E.add(AbstractC25225BEi.A0t(str2));
                        }
                    }
                    Product product2 = (Product) AbstractC001800i.A0O(arrayList, 0);
                    if (product2 != null && (user = product2.A0B) != null) {
                        bool = Boolean.valueOf(user.isVerified());
                    } else {
                        bool = null;
                    }
                    A0T = AbstractC001800i.A0T(P4L.A00, c51728Mt5.A08);
                    bool2 = c51728Mt5.A02;
                    C14360o3.A0B(A0T, 6);
                } while (!c05a.AIi(value, new C51728Mt5(null, bool, valueOf, bool2, 2131954104, null, valueOf2, str, A1E, A0T, arrayList)));
            }
        }
    }

    public P4I(C50911Meg c50911Meg) {
        this.A00 = c50911Meg;
    }

    @Override // X.InterfaceC58050Pob
    public final void onFailure() {
        Object value;
        C51728Mt5 c51728Mt5;
        C05A c05a = this.A00.A04;
        do {
            value = c05a.getValue();
            c51728Mt5 = (C51728Mt5) value;
        } while (!C51728Mt5.A00(c51728Mt5, value, AbstractC001800i.A0T(P4M.A00, c51728Mt5.A08), c05a));
    }
}
