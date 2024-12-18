package X;

import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Idt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41722Idt {
    public static final C41722Idt A00 = new Object();

    public static final C38682GzN A01(Product product) {
        String A002;
        String str;
        String str2;
        C14360o3.A0B(product, 0);
        User user = product.A0B;
        String str3 = null;
        if (user == null || (A002 = AbstractC76433bn.A00(user)) == null) {
            return null;
        }
        String str4 = product.A0H;
        String str5 = product.A0J;
        ProductDetailsProductItemDict productDetailsProductItemDict = product.A01;
        ProductAffiliateInformationDict productAffiliateInformationDict = product.A04;
        if (productAffiliateInformationDict != null) {
            str = productAffiliateInformationDict.AaM();
        } else {
            str = null;
        }
        TaggingFeedSessionInformation taggingFeedSessionInformation = product.A00;
        if (taggingFeedSessionInformation != null) {
            str2 = taggingFeedSessionInformation.A01;
            str3 = taggingFeedSessionInformation.A00;
        } else {
            str2 = null;
        }
        return new C38682GzN(null, productDetailsProductItemDict, str4, A002, str5, str, str2, str3, 128);
    }

    public static final C38686GzR A00(ProductCollection productCollection, String str, String str2, List list) {
        if (list == null) {
            list = C16930sl.A00;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38682GzN A01 = A01(AbstractC37300Gc1.A0L(it));
            if (A01 != null) {
                A1E.add(A01);
            }
        }
        ProductCollectionImpl productCollectionImpl = null;
        if (productCollection != null) {
            productCollectionImpl = productCollection.F7R(null);
        }
        return new C38686GzR(productCollectionImpl, str, str2, A1E);
    }

    public final C38686GzR A02(ClipsShoppingInfoIntf clipsShoppingInfoIntf) {
        List list;
        String str;
        ProductCollection Ap9 = clipsShoppingInfoIntf.Ap9();
        if (clipsShoppingInfoIntf.Ap9() == null) {
            list = I3Q.A00(clipsShoppingInfoIntf);
        } else {
            list = C16930sl.A00;
        }
        if (Ap9 != null) {
            str = Ap9.Ap3();
        } else {
            str = null;
        }
        return A00(Ap9, str, null, list);
    }
}
