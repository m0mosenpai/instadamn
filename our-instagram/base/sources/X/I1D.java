package X;

import com.instagram.api.schemas.GuideMediaType;
import com.instagram.guides.model.GuideItemAttachment;
import com.instagram.model.shopping.ProductContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I1D {
    /* JADX WARN: Type inference failed for: r6v0, types: [X.IMy, java.lang.Object] */
    public static C41233IMy parseFromJson(C16L c16l) {
        ProductContainer productContainer;
        ProductDetailsProductItemDict productDetailsProductItemDict;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                ArrayList arrayList = null;
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31171DnF.A1a(A0q)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1Q(A0q)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("mixed_media_items".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H7P parseFromJson = IQS.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A04 = arrayList;
                } else if ("attachment".equals(A0q)) {
                    obj.A00 = I1C.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            List list = obj.A04;
            GuideItemAttachment guideItemAttachment = obj.A00;
            if (guideItemAttachment != null && (productContainer = guideItemAttachment.A01) != null && (productDetailsProductItemDict = productContainer.A00) != null && list != null) {
                Product A01 = AbstractC38048Gob.A01(productDetailsProductItemDict);
                for (int i = 0; i < list.size(); i++) {
                    H7P h7p = (H7P) list.get(i);
                    if (h7p.A00 == GuideMediaType.A05) {
                        H3V h3v = h7p.A01.A00;
                        h3v.getClass();
                        String str = h3v.A02;
                        ProductImageContainer productImageContainer = h3v.A00;
                        String str2 = h3v.A03;
                        String str3 = h3v.A04;
                        ProductDetailsProductItemDict productDetailsProductItemDict2 = A01.A01;
                        ProductDetailsProductItemDict productDetailsProductItemDict3 = null;
                        int A00 = AbstractC37301Gc2.A00(new C37761pD(null));
                        ProductImageContainerImpl F6D = productImageContainer.F6D();
                        if (productDetailsProductItemDict2 != null) {
                            productDetailsProductItemDict3 = productDetailsProductItemDict2;
                        }
                        H3V h3v2 = new H3V(F6D, productDetailsProductItemDict3, str, str2, str3);
                        H7O h7o = h7p.A01;
                        C14360o3.A0B(h7o, 1);
                        C38321qM c38321qM = h7o.A01;
                        AbstractC31180DnO.A0w(A00);
                        H7O h7o2 = new H7O(h3v2, c38321qM);
                        GuideMediaType guideMediaType = h7p.A00;
                        AbstractC31180DnO.A0w(A00);
                        list.add(i, new H7P(guideMediaType, h7o2));
                    }
                }
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
