package X;

import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.api.schemas.ProductPivotsButtonImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4ca, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99134ca implements InterfaceC38381qS, InterfaceC99144cb {
    public ProductPivotsButtonImpl A00;
    public C39561sd A01;
    public EnumC39580Hdq A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public List A0B;
    public List A0C;

    @Override // X.InterfaceC99144cb
    public final EnumC39622HeW B60() {
        return null;
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        return null;
    }

    public final String A00() {
        EnumC39580Hdq enumC39580Hdq = this.A02;
        int ordinal = enumC39580Hdq.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return AbstractC111324zv.A00(932);
                        }
                        throw new IllegalArgumentException(String.format("Unrecognized Pivot Type %s", enumC39580Hdq.A00));
                    }
                    return "tagged_products";
                }
                return "reconsideration_products";
            }
            return "multibrand_product";
        }
        return "singlebrand_product";
    }

    public final String A01() {
        EnumC39580Hdq enumC39580Hdq = this.A02;
        int ordinal = enumC39580Hdq.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 2) {
                            return "brands_with_products";
                        }
                        throw new IllegalArgumentException(String.format("Unrecognized Pivot Type %s", enumC39580Hdq.A00));
                    }
                    return "tagged_products";
                }
                return "reconsideration_products";
            }
            return "multibrand_product";
        }
        return "singlebrand_product";
    }

    @Override // X.InterfaceC99144cb
    public final JI4 Aiv() {
        ProductPivotsButtonImpl productPivotsButtonImpl = this.A00;
        if (productPivotsButtonImpl == null) {
            return null;
        }
        return new WlR(productPivotsButtonImpl);
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        return C1XV.A0d;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return this.A03;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return this.A01;
    }

    @Override // X.InterfaceC99144cb
    public final ProductCardSubtitleType Bgq() {
        if (this.A02.ordinal() != 1) {
            return ProductCardSubtitleType.A0E;
        }
        return ProductCardSubtitleType.A0A;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.instagram.model.shopping.productfeed.ProductFeedResponse, X.1um] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.instagram.model.shopping.productfeed.ProductFeedItem, java.lang.Object] */
    @Override // X.InterfaceC99144cb
    public final ProductFeedResponse Bgy() {
        ArrayList arrayList = new ArrayList();
        List list = this.A0B;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProductTile productTile = ((IEZ) it.next()).A00;
                if (productTile != null) {
                    ?? obj = new Object();
                    Integer num = C05F.A0C;
                    obj.A06 = num;
                    obj.A02 = productTile;
                    obj.A06 = num;
                    arrayList.add(obj);
                }
            }
        } else {
            List list2 = this.A0A;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new ProductFeedItem(AbstractC38048Gob.A01((ProductDetailsProductItemDict) it2.next())));
                }
            } else {
                throw new IllegalStateException("Product Pivots should contain a non null Products or Pivot Items");
            }
        }
        ?? c40791um = new C40791um();
        c40791um.A03 = arrayList;
        return c40791um;
    }

    @Override // X.InterfaceC99144cb
    public final String Byk() {
        return this.A07;
    }

    @Override // X.InterfaceC99144cb
    public final String Byo() {
        return this.A08;
    }

    @Override // X.InterfaceC99144cb
    public final String C3N() {
        return this.A02.A00;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A01;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return this.A04;
    }

    @Override // X.InterfaceC99144cb
    public final boolean EjL(UserSession userSession) {
        if (this.A00 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return this.A05;
    }

    @Override // X.InterfaceC99144cb
    public final String getTitle() {
        return this.A09;
    }
}
