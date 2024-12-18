package X;

import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class OPH {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata, java.lang.Object] */
    public static IGTVShoppingMetadata parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("merchant_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A02 = A0m;
                } else if ("product_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    obj.A03 = arrayList;
                } else if ("collection_id".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, IGTVShoppingMetadata iGTVShoppingMetadata) {
        String str;
        anonymousClass182.A0d();
        String str2 = iGTVShoppingMetadata.A02;
        if (str2 != null) {
            anonymousClass182.A0S("merchant_id", str2);
            if (iGTVShoppingMetadata.A03 != null) {
                C16V.A03(anonymousClass182, "product_ids");
                List list = iGTVShoppingMetadata.A03;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AbstractC167017dG.A1F(anonymousClass182, it);
                    }
                    anonymousClass182.A0Z();
                    String str3 = iGTVShoppingMetadata.A01;
                    if (str3 != null) {
                        anonymousClass182.A0S("collection_id", str3);
                    }
                    anonymousClass182.A0a();
                    return;
                }
            }
            str = "productIds";
        } else {
            str = "merchantId";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
