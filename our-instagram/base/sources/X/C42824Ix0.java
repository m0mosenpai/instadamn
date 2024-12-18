package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.api.schemas.ProductDiscountInformationDictImpl;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Ix0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42824Ix0 implements InterfaceC43453JHr, JPo {
    public final /* synthetic */ MerchantShoppingCartFragment A00;

    @Override // X.InterfaceC43453JHr
    public final void DSu(User user) {
    }

    @Override // X.JHT
    public final void Dw3(ProductFeedItem productFeedItem) {
    }

    public C42824Ix0(MerchantShoppingCartFragment merchantShoppingCartFragment) {
        this.A00 = merchantShoppingCartFragment;
    }

    public static void A00(C42824Ix0 c42824Ix0, Product product) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = c42824Ix0.A00;
        AbstractC37301Gc2.A0O(merchantShoppingCartFragment).A0G(product, merchantShoppingCartFragment.A0U);
        MultiProductComponent multiProductComponent = merchantShoppingCartFragment.A06;
        if (multiProductComponent != null && multiProductComponent.A04 == EnumC39622HeW.A0P) {
            multiProductComponent.A02(new ProductFeedItem(product));
            C41745IeJ c41745IeJ = merchantShoppingCartFragment.A07;
            EnumC39539HdB enumC39539HdB = merchantShoppingCartFragment.A0A;
            C41745IeJ.A03(c41745IeJ, merchantShoppingCartFragment, merchantShoppingCartFragment.A0D, merchantShoppingCartFragment.A0E, enumC39539HdB);
        }
        if (!product.CcN()) {
            C41625IbF c41625IbF = new C41625IbF(null, merchantShoppingCartFragment.A0C, product, merchantShoppingCartFragment.A0U);
            c41625IbF.A04 = merchantShoppingCartFragment.A01;
            c41625IbF.A00();
        }
    }

    public static void A01(C42824Ix0 c42824Ix0, Product product, String str) {
        String str2;
        MerchantShoppingCartFragment merchantShoppingCartFragment = c42824Ix0.A00;
        JI0 ji0 = merchantShoppingCartFragment.A0B;
        String str3 = merchantShoppingCartFragment.A0X;
        String str4 = merchantShoppingCartFragment.A0V;
        Map map = merchantShoppingCartFragment.A0Z;
        if (map != null) {
            str2 = AbstractC166987dD.A1A(product.A0H, map);
        } else {
            str2 = null;
        }
        ji0.Crb(product, str3, str4, str, str2);
    }

    public static void A02(C42824Ix0 c42824Ix0, Runnable runnable, int i) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = c42824Ix0.A00;
        merchantShoppingCartFragment.A0b = true;
        RecyclerView recyclerView = merchantShoppingCartFragment.mRecyclerView;
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        abstractC70663Fe.getClass();
        if (AbstractC72193Ls.A06(abstractC70663Fe, recyclerView, i)) {
            runnable.run();
        } else {
            merchantShoppingCartFragment.mRecyclerView.A14(new C44229JgZ(5, runnable, c42824Ix0));
            merchantShoppingCartFragment.mRecyclerView.A0o(i);
        }
    }

    public static void A03(C42824Ix0 c42824Ix0, List list) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = c42824Ix0.A00;
        C41634IbP c41634IbP = merchantShoppingCartFragment.A0E;
        if (c41634IbP != null) {
            User user = c41634IbP.A05;
            user.getClass();
            C1XJ.A00.A15(merchantShoppingCartFragment.requireActivity(), merchantShoppingCartFragment.A02, user, "instagram_shopping_merchant_bag", merchantShoppingCartFragment.A0V, merchantShoppingCartFragment.A0O, merchantShoppingCartFragment.A0X, list, false);
        }
    }

    public final void A04() {
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        java.util.Set set = merchantShoppingCartFragment.A0a;
        set.getClass();
        ArrayList A1F = AbstractC166987dD.A1F(set);
        IgFundedIncentive igFundedIncentive = merchantShoppingCartFragment.A05;
        if (igFundedIncentive != null) {
            List list = igFundedIncentive.A0B;
            list.getClass();
            A1F.add(0, new ProductDiscountInformationDictImpl(null, ((IgFundedIncentiveDetail) list.get(0)).getDescription(), igFundedIncentive.A07, igFundedIncentive.A0A, null));
        }
        merchantShoppingCartFragment.A09.A07(merchantShoppingCartFragment.A0U, merchantShoppingCartFragment.A0N, merchantShoppingCartFragment.A0a, true);
        A03(this, A1F);
    }

    public final void A05(C41730Ie1 c41730Ie1) {
        ExtendedImageUrl extendedImageUrl;
        ImageInfo imageInfo;
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        C70Y A00 = C70Y.A00(merchantShoppingCartFragment.A02);
        A00.A07.A0F(c41730Ie1, merchantShoppingCartFragment.A0U);
        C41634IbP A05 = A00.A05(merchantShoppingCartFragment.A0U);
        if (A05 != null) {
            C41731Ie2 c41731Ie2 = merchantShoppingCartFragment.A09;
            String str = merchantShoppingCartFragment.A0U;
            String str2 = merchantShoppingCartFragment.A0N;
            String str3 = merchantShoppingCartFragment.A0Q;
            String str4 = merchantShoppingCartFragment.A0T;
            boolean A1a = AbstractC167017dG.A1a(str, str2);
            InterfaceC02590Ai A002 = C41730Ie1.A00(c41731Ie2.A02, c41730Ie1, "instagram_shopping_bag_remove_item");
            C41730Ie1.A02(A002, c41730Ie1);
            Product A04 = c41730Ie1.A04();
            boolean z = true;
            if (A04 == null || A04.A0P != A1a) {
                z = false;
            }
            AbstractC37303Gc4.A0s(A002, str, z);
            String str5 = c41731Ie2.A05;
            if (str5 != null) {
                A002.AAP("merchant_bag_entry_point", str5);
                String str6 = c41731Ie2.A06;
                if (str6 != null) {
                    C41731Ie2.A02(A002, c41731Ie2, C41731Ie2.A01(A002, c41731Ie2, "merchant_bag_prior_module", str6, str2), str3);
                    AbstractC37303Gc4.A0m(A002, str4);
                    A002.Cht();
                    int i = 0;
                    boolean A1N = AbstractC167007dF.A1N(Collections.unmodifiableList(A05.A06).size());
                    C31349DqE c31349DqE = merchantShoppingCartFragment.A03;
                    if (c31349DqE != null) {
                        AbstractC31177DnL.A1L(c31349DqE);
                        merchantShoppingCartFragment.A03 = null;
                    }
                    FragmentActivity requireActivity = merchantShoppingCartFragment.requireActivity();
                    if (!A1N) {
                        i = merchantShoppingCartFragment.A00;
                    }
                    C42704Iuz c42704Iuz = new C42704Iuz(4, this, c41730Ie1);
                    C146106i8 A0K = AbstractC31171DnF.A0K();
                    AbstractC25226BEj.A1N(requireActivity, A0K, 2131964684);
                    A0K.A0L = A1a;
                    A0K.A01 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
                    A0K.A0G = AbstractC166997dE.A0q(requireActivity.getResources(), 2131952154);
                    A0K.A02 = i;
                    A0K.A0A(c42704Iuz);
                    A0K.A0O = A1a;
                    Product A042 = c41730Ie1.A04();
                    if (A042 != null && (imageInfo = A042.A08) != null) {
                        extendedImageUrl = AbstractC40161tk.A02(imageInfo);
                    } else {
                        extendedImageUrl = null;
                    }
                    if (!AbstractC81033jX.A03(extendedImageUrl)) {
                        A0K.A09 = extendedImageUrl;
                        A0K.A03();
                    }
                    C31349DqE A003 = A0K.A00();
                    AbstractC166997dE.A1O(C41451vu.A01, A003);
                    merchantShoppingCartFragment.A03 = A003;
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public final void A06(User user, String str) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        merchantShoppingCartFragment.A0B.Crj(user, merchantShoppingCartFragment.A0X, merchantShoppingCartFragment.A0N, merchantShoppingCartFragment.A0V, merchantShoppingCartFragment.A0P, merchantShoppingCartFragment.A0R, merchantShoppingCartFragment.A0O, str);
    }

    @Override // X.JPo
    public final void AAp(ProductFeedItem productFeedItem, C41024IEt c41024IEt) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        MultiProductComponent multiProductComponent = merchantShoppingCartFragment.A06;
        if (multiProductComponent != null) {
            merchantShoppingCartFragment.A0I.A02(c41024IEt, new H7J(productFeedItem, multiProductComponent.A06), merchantShoppingCartFragment.A0U);
        }
    }

    @Override // X.JHK
    public final void Cvf(Product product) {
        String BSe;
        int i;
        String str;
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        C1563470e A0O = AbstractC37301Gc2.A0O(merchantShoppingCartFragment);
        if (A0O.A00 == A0O.A02) {
            BSe = new C42858IxY(merchantShoppingCartFragment.A02).BSe(merchantShoppingCartFragment.requireContext(), merchantShoppingCartFragment.A02);
            if (merchantShoppingCartFragment.A08.A00.getVisibility() == 0) {
                i = merchantShoppingCartFragment.A00;
            } else {
                i = 0;
            }
            str = "cart_item_limit_reached_user_error";
        } else {
            List<ProductVariantPossibleValueDictIntf> list = product.A0O;
            if (list != null && !list.isEmpty()) {
                HashMap A1G = AbstractC166987dD.A1G();
                if (list.isEmpty()) {
                    throw AbstractC31172DnG.A0u();
                }
                if (list.isEmpty()) {
                    throw AbstractC31172DnG.A0u();
                }
                for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : list) {
                    if (productVariantPossibleValueDictIntf.CGx() == ProductVariantVisualStyle.A05) {
                        A1G.put(productVariantPossibleValueDictIntf.getId(), productVariantPossibleValueDictIntf.getValue());
                    }
                }
                if (list.isEmpty()) {
                    throw AbstractC31172DnG.A0u();
                }
                list.size();
                A1G.size();
            }
            JGU A07 = AbstractC37301Gc2.A0O(merchantShoppingCartFragment).A07(product, merchantShoppingCartFragment.A0U);
            if (A07 != null) {
                BSe = A07.BSe(merchantShoppingCartFragment.requireContext(), merchantShoppingCartFragment.A02);
                if (merchantShoppingCartFragment.A08.A00.getVisibility() == 0) {
                    i = merchantShoppingCartFragment.A00;
                } else {
                    i = 0;
                }
                str = "shopping_cart_add_item_optimistic_user_error";
            } else {
                int A02 = merchantShoppingCartFragment.A07.A08.A02(product.A0H);
                if (A02 == -1) {
                    A02 = 0;
                }
                A02(this, new J5S(this, product, product), A02);
                return;
            }
        }
        AbstractC41666Iby.A02(BSe, i, str);
    }

    @Override // X.InterfaceC43453JHr
    public final void DSr(User user) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        merchantShoppingCartFragment.A0B.Crf(user, merchantShoppingCartFragment.A0X, "merchant_shopping_bag_view_shop_row");
    }

    @Override // X.InterfaceC43453JHr
    public final void DSt(User user) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        merchantShoppingCartFragment.A0B.Crf(user, merchantShoppingCartFragment.A0X, "merchant_shopping_bag_view_shop_row");
    }

    @Override // X.InterfaceC43453JHr
    public final void DSv(User user) {
        A06(user, "merchant_shopping_bag_view_shop_row");
    }

    @Override // X.JHK
    public final void Db8(Product product) {
        A01(this, product, "shopping_bag_product_collection");
    }

    @Override // X.JHT
    public final void Dw2(UnavailableProduct unavailableProduct, int i, int i2) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        merchantShoppingCartFragment.A0B.Crj(unavailableProduct.BSW(), merchantShoppingCartFragment.A0X, merchantShoppingCartFragment.A0N, merchantShoppingCartFragment.A0V, merchantShoppingCartFragment.A0P, merchantShoppingCartFragment.A0R, merchantShoppingCartFragment.A0O, "unavailable_product_card");
    }

    @Override // X.JPo
    public final void EDt(View view, ProductFeedItem productFeedItem) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        MultiProductComponent multiProductComponent = merchantShoppingCartFragment.A06;
        if (multiProductComponent != null) {
            merchantShoppingCartFragment.A0I.A01(view, new H7J(productFeedItem, multiProductComponent.A06));
        }
    }
}
