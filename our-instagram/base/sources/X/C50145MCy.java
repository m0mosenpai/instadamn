package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;

/* renamed from: X.MCy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C50145MCy extends C03E implements InterfaceC16620sF {
    public static final C50145MCy A00 = new C50145MCy();

    public C50145MCy() {
        super(2, LJK.class, "generateShoppingProductUrl", "generateShoppingProductUrl(Lcom/instagram/user/model/ProductDetailsProductItemDict;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) obj;
        AbstractC167017dG.A1N(productDetailsProductItemDict, obj2);
        User user = productDetailsProductItemDict.A0G;
        if (user != null && user.A03.getUsername() != null) {
            return AnonymousClass001.A15("https://www.instagram.com/_n/product_display_page?product_id=", productDetailsProductItemDict.A0h, "&business_user_id=", AbstractC76433bn.A00(user), "&merchant_name=", user.getUsername(), "&checkout_style=native_checkout&entry_point=deeplink");
        }
        throw AbstractC166987dD.A14("Merchant id and merchant name must not be null");
    }
}
