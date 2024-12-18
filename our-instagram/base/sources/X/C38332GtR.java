package X;

import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.GtR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38332GtR extends AbstractC52922bZ {
    public boolean A00;
    public final int A01;
    public final C2GT A02;
    public final UserSession A03;
    public final C41728Idz A04;
    public final ILD A05;
    public final IMV A06;
    public final C42343Ip5 A07;
    public final Product A08;
    public final String A09;
    public final Map A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC24731Iq A0D;
    public final InterfaceC19390xP A0E;

    private final ProductGroup A00() {
        C42343Ip5 c42343Ip5 = this.A07;
        String str = this.A08.A0H;
        C14360o3.A0B(str, 0);
        return (ProductGroup) c42343Ip5.A00.get(str);
    }

    public static final Product A01(C38332GtR c38332GtR) {
        List A00;
        Object obj;
        ILD ild = c38332GtR.A05;
        ProductGroup A002 = c38332GtR.A00();
        Product product = c38332GtR.A08;
        if (A002 != null && (A00 = A002.A00()) != null) {
            Iterator it = A00.iterator();
            loop0: while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    Product product2 = (Product) obj;
                    C14360o3.A0A(product2);
                    List<ProductVariantPossibleValueDictIntf> list = product2.A0O;
                    if (list != null) {
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : list) {
                                if (!C14360o3.A0K(ild.A00.get(productVariantPossibleValueDictIntf.getId()), productVariantPossibleValueDictIntf.getValue())) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Product product3 = (Product) obj;
            if (product3 != null) {
                return product3;
            }
        }
        return product;
    }

    private final void A02(String str, boolean z) {
        InterfaceC02590Ai A0f;
        C41728Idz c41728Idz = this.A04;
        Product product = this.A08;
        C38683GzO A03 = C128205qp.A03(c41728Idz.A03, product);
        C18920wW c18920wW = c41728Idz.A02;
        if (z) {
            A0f = AbstractC166987dD.A0f(c18920wW, "instagram_shopping_pdp_action_with_unselected_variants");
            C38683GzO.A02(A0f, A03);
            AbstractC31171DnF.A1C(A0f, str);
            Boolean bool = A03.A04;
            if (bool != null) {
                A0f.A7v("is_checkout_enabled", bool);
                Boolean bool2 = A03.A02;
                if (bool2 != null) {
                    A0f.A7v("can_add_to_bag", bool2);
                    AbstractC37300Gc1.A0t(A0f, c41728Idz.A0D);
                    AbstractC37300Gc1.A0s(A0f, c41728Idz.A07);
                    AbstractC37300Gc1.A0n(A0f, c41728Idz.A0A);
                    AbstractC37304Gc5.A13(A0f, c41728Idz.A00);
                    A0f.A9K("drops_launch_date", A03.A06);
                    A0f.A7v("has_drops_launched", A03.A03);
                    AbstractC37300Gc1.A0q(A0f, c41728Idz.A0B);
                    AbstractC37300Gc1.A0m(A0f, "shopping_pdp_button");
                    A0f.A9K(AbstractC111324zv.A00(1185), A03.A07);
                    ArrayList A00 = C41728Idz.A00(product.A0N);
                    if (A00 != null) {
                        A0f.AAk("discount_ids", A00);
                    }
                    C38321qM c38321qM = c41728Idz.A04;
                    if (c38321qM != null) {
                        AbstractC37302Gc3.A0x(A0f, c38321qM);
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            A0f = AbstractC166987dD.A0f(c18920wW, "instagram_shopping_pdp_action");
            C38683GzO.A02(A0f, A03);
            AbstractC31171DnF.A1C(A0f, str);
            Boolean bool3 = A03.A04;
            if (bool3 != null) {
                A0f.A7v("is_checkout_enabled", bool3);
                Boolean bool4 = A03.A02;
                if (bool4 != null) {
                    A0f.A7v("can_add_to_bag", bool4);
                    AbstractC37300Gc1.A0t(A0f, c41728Idz.A0D);
                    AbstractC37300Gc1.A0q(A0f, c41728Idz.A0B);
                    AbstractC37304Gc5.A13(A0f, c41728Idz.A00);
                    String A14 = AbstractC25225BEi.A14();
                    if (A14 != null) {
                        AbstractC25225BEi.A1N(A0f, A14);
                    }
                    AbstractC37300Gc1.A0s(A0f, c41728Idz.A07);
                    A0f.A9K("drops_launch_date", A03.A06);
                    A0f.A7v("has_drops_launched", A03.A03);
                    AbstractC37300Gc1.A0n(A0f, c41728Idz.A0A);
                    AbstractC37300Gc1.A0m(A0f, "shopping_pdp_button");
                    A0f.AAP("url", product.A0F);
                    ArrayList A002 = C41728Idz.A00(product.A0N);
                    if (A002 != null) {
                        A0f.AAk("discount_ids", A002);
                    }
                    C38321qM c38321qM2 = c41728Idz.A04;
                    if (c38321qM2 != null) {
                        AbstractC37302Gc3.A0x(A0f, c38321qM2);
                    }
                    String str2 = c41728Idz.A08;
                    if (str2 != null && str2.length() != 0) {
                        A0f.A9K("collection_page_id", AbstractC166997dE.A0j(str2));
                    }
                    String str3 = c41728Idz.A0C;
                    if (str3 != null) {
                        C0Zx c0Zx = new C0Zx();
                        c0Zx.A06("search_session_id", str3);
                        A0f.AAQ(c0Zx, AbstractC111324zv.A00(3087));
                    }
                    AbstractC37303Gc4.A0b(A0f);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        A0f.Cht();
    }

    private final boolean A03(Integer num) {
        Object obj;
        ProductGroup A00 = A00();
        if (A00 != null) {
            ILD ild = this.A05;
            Iterator A0i = AbstractC31177DnL.A0i(A00.A02);
            while (true) {
                if (A0i.hasNext()) {
                    obj = A0i.next();
                    if (ild.A00.get(((ProductVariantDimension) obj).A02) == null) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ProductVariantDimension productVariantDimension = (ProductVariantDimension) obj;
            if (productVariantDimension != null) {
                C41226IMr c41226IMr = new C41226IMr(A00, productVariantDimension);
                Iterator A0i2 = AbstractC31177DnL.A0i(A00.A02);
                while (A0i2.hasNext()) {
                    ProductVariantDimension productVariantDimension2 = (ProductVariantDimension) A0i2.next();
                    String A1A = AbstractC166987dD.A1A(productVariantDimension2.A02, ild.A00);
                    if (A1A != null && !productVariantDimension2.equals(productVariantDimension)) {
                        c41226IMr.A01(productVariantDimension2, A1A);
                    }
                }
                C41225IMq A002 = c41226IMr.A00();
                ArrayList A01 = A002.A01();
                VariantSelectorModel variantSelectorModel = new VariantSelectorModel(productVariantDimension, A01, null, A002.A00(), Collections.unmodifiableList(A00.A02).indexOf(productVariantDimension), A01.indexOf(ild.A00.get(productVariantDimension.A02)));
                C41728Idz c41728Idz = this.A04;
                Product product = this.A08;
                ProductVariantDimension productVariantDimension3 = variantSelectorModel.A08;
                String str = productVariantDimension3.A02;
                C14360o3.A07(str);
                ProductVariantVisualStyle productVariantVisualStyle = productVariantDimension3.A00;
                C14360o3.A07(productVariantVisualStyle);
                String str2 = productVariantVisualStyle.A00;
                boolean A1U = AbstractC167007dF.A1U(str2);
                C38683GzO A03 = C128205qp.A03(c41728Idz.A03, product);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41728Idz.A02, "instagram_shopping_reveal_product_variant_selector");
                C38683GzO.A02(A0f, A03);
                Boolean bool = A03.A04;
                if (bool != null) {
                    A0f.A7v("is_checkout_enabled", bool);
                    Boolean bool2 = A03.A02;
                    if (bool2 != null) {
                        A0f.A7v("can_add_to_bag", bool2);
                        A0f.A9K("item_count", AbstractC37302Gc3.A0T());
                        A0f.AAP("variant_id", str);
                        A0f.AAP("visual_style", str2);
                        C41728Idz.A01(A0f, c41728Idz);
                        A0f.A7v("can_enable_restock_reminder", AbstractC31173DnH.A0e(A0f, "shopping_session_id", c41728Idz.A0D, A1U));
                        A0f.Cht();
                        AbstractC166987dD.A1Z(new C57166PZk(num, this, variantSelectorModel, null, 23), AbstractC141776au.A00(this));
                        return true;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            return false;
        }
        return false;
    }

    public final void A04(boolean z) {
        C141796aw A00;
        int i;
        boolean A002 = this.A05.A00(this.A08);
        if (z) {
            A02("add_to_bag", A002);
        }
        if (A002) {
            if (A00() == null) {
                A00 = AbstractC141776au.A00(this);
                i = 18;
            } else {
                if (A03(C05F.A00)) {
                    return;
                }
                A00 = AbstractC141776au.A00(this);
                i = 19;
            }
        } else {
            A00 = AbstractC141776au.A00(this);
            i = 20;
        }
        C43172J6r.A03(this, A00, i);
    }

    public final void A05(boolean z) {
        C141796aw A00;
        int i;
        boolean A002 = this.A05.A00(this.A08);
        if (z) {
            A02("checkout", A002);
        }
        if (A002) {
            if (A00() == null) {
                A00 = AbstractC141776au.A00(this);
                i = 21;
            } else {
                if (A03(C05F.A01)) {
                    return;
                }
                A00 = AbstractC141776au.A00(this);
                i = 22;
            }
        } else {
            A00 = AbstractC141776au.A00(this);
            i = 23;
        }
        C43172J6r.A03(this, A00, i);
    }

    public /* synthetic */ C38332GtR(UserSession userSession, C41728Idz c41728Idz, Product product, String str, Map map, int i) {
        IMV imv = new IMV(userSession, c41728Idz, C70Y.A00(userSession), product);
        ILD ild = new ILD(map);
        C14360o3.A0B(userSession, 0);
        C42343Ip5 c42343Ip5 = (C42343Ip5) userSession.A01(C42343Ip5.class, J8N.A00);
        AbstractC167027dH.A13(userSession, product, map);
        AbstractC167007dF.A1J(c41728Idz, 5, c42343Ip5);
        this.A03 = userSession;
        this.A08 = product;
        this.A0A = map;
        this.A09 = str;
        this.A04 = c41728Idz;
        this.A01 = i;
        this.A06 = imv;
        this.A05 = ild;
        this.A07 = c42343Ip5;
        this.A0B = C1XM.A00(new J8U(this, 40));
        this.A0C = C1XM.A00(new J8U(this, 41));
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24721Ip.A05;
        C3JM c3jm = InterfaceC24731Iq.A00;
        C24721Ip c24721Ip = new C24721Ip(C3JM.A00);
        this.A0D = c24721Ip;
        this.A0E = AbstractC07080Za.A03(c24721Ip);
        this.A02 = AbstractC58232lf.A00(AnonymousClass191.A00, C10Q.A00(new C43176J6w(this), imv.A06, imv.A05, imv.A07));
    }
}
