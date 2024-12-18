package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;
import com.instagram.user.model.UnavailableProductImpl;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.IyR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42913IyR implements JPm {
    public final UserSession A00;
    public final C41165IKe A01;
    public final C41646Ibe A02;

    @Override // X.InterfaceC43418JGi
    public final void D2v(String str, String str2, String str3, int i, int i2) {
    }

    @Override // X.JII
    public final /* synthetic */ void Db9(Product product, String str, String str2, int i, int i2) {
    }

    @Override // X.JII
    public final boolean DbA(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    @Override // X.JII
    public final /* synthetic */ void DbB(String str, int i) {
    }

    @Override // X.JII
    public final void DbC(Product product, int i, int i2) {
    }

    @Override // X.JII
    public final boolean DbG(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    @Override // X.JII
    public final void DbH(Product product) {
        C14360o3.A0B(product, 0);
        C41646Ibe.A00(this.A02, product, "view_in_cart_cta");
    }

    @Override // X.JII
    public final void DbI(Product product) {
    }

    @Override // X.JII
    public final /* synthetic */ void DbJ(String str) {
    }

    @Override // X.JII
    public final /* synthetic */ void DbK(Product product) {
    }

    @Override // X.JHT
    public final void Dw2(UnavailableProduct unavailableProduct, int i, int i2) {
        C14360o3.A0B(unavailableProduct, 0);
        C41165IKe c41165IKe = this.A01;
        InterfaceC60442pS interfaceC60442pS = c41165IKe.A04;
        UserSession userSession = c41165IKe.A03;
        String productId = unavailableProduct.getProductId();
        String A01 = AbstractC154266wb.A01(i, i2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_collection_home_click");
        EnumC33416Epn enumC33416Epn = EnumC33416Epn.A0C;
        A0f.AAP("collection_id", enumC33416Epn.A01);
        A0f.AAP("collection_name", enumC33416Epn.A00);
        A0f.AAP(AbstractC111324zv.A00(456), "0");
        A0f.AAP("product_id", productId);
        A0f.AAP("position", A01);
        A0f.Cht();
        FragmentActivity activity = c41165IKe.A02.getActivity();
        String str = c41165IKe.A0C;
        String str2 = c41165IKe.A0B;
        C14360o3.A0B(activity, 1);
        I7S.A00(activity, userSession, interfaceC60442pS, unavailableProduct, str, str2);
    }

    @Override // X.JHT
    public final void Dw3(ProductFeedItem productFeedItem) {
        C14360o3.A0B(productFeedItem, 0);
        C41165IKe c41165IKe = this.A01;
        UnavailableProductImpl unavailableProductImpl = productFeedItem.A05;
        unavailableProductImpl.getClass();
        FB6.A00();
        String productId = unavailableProductImpl.getProductId();
        String A00 = AbstractC76433bn.A00(unavailableProductImpl.BSW());
        UserSession userSession = c41165IKe.A03;
        InterfaceC60442pS interfaceC60442pS = c41165IKe.A04;
        String str = c41165IKe.A0B;
        Context context = c41165IKe.A02.getContext();
        AbstractC167007dF.A1K(productId, A00);
        C14360o3.A0B(context, 5);
        SaveApiUtil.A08(userSession, interfaceC60442pS, productId, A00, str);
        c41165IKe.A08.DbU(productFeedItem);
    }

    @Override // X.JII
    public final void Db4(C38675GzG c38675GzG, Product product) {
        C41165IKe c41165IKe = this.A01;
        List list = product.A0O;
        if (list != null && !list.isEmpty()) {
            HashMap A1G = AbstractC166987dD.A1G();
            if (list.isEmpty()) {
                throw AbstractC31172DnG.A0u();
            }
            if (list.isEmpty()) {
                throw AbstractC31172DnG.A0u();
            }
            list.size();
            A1G.size();
        }
        InterfaceC60442pS interfaceC60442pS = c41165IKe.A04;
        UserSession userSession = c41165IKe.A03;
        String str = c41165IKe.A0B;
        User user = product.A0B;
        AbstractC41757IeY.A06(interfaceC60442pS, userSession, null, null, product, "wish_list_feed", str, "wishlist_feed", AbstractC76433bn.A00(user), null, c41165IKe.A0C, null);
        AbstractC37300Gc1.A0G(userSession).A0D(new C42850IxQ(c41165IKe, product), product, AbstractC76433bn.A00(user), null);
    }

    @Override // X.JII
    public final void Db5(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
        String str;
        C41165IKe c41165IKe = this.A01;
        if (c38675GzG != null) {
            str = c38675GzG.A04;
        } else {
            str = null;
        }
        C41633IbO c41633IbO = c41165IKe.A09;
        C38670GzB c38670GzB = new C38670GzB(null, null, str, null, null);
        boolean A1Y = AbstractC25229BEm.A1Y(productFeedItem);
        H7J h7j = new H7J(productFeedItem, c38670GzB);
        C41024IEt c41024IEt = new C41024IEt(i, i2);
        C14360o3.A0B(view, A1Y ? 1 : 0);
        C57112jm c57112jm = c41633IbO.A00;
        C59072n8 A00 = C59062n7.A00(h7j, c41024IEt, h7j.A04);
        A00.A00(c41633IbO.A01);
        AbstractC25227BEk.A10(view, A00, c57112jm);
        C40965ICm c40965ICm = (C40965ICm) this.A00.A01(C40965ICm.class, J89.A00);
        synchronized (c40965ICm) {
            AbstractC37304Gc5.A1T(c40965ICm.A00, 37357157);
        }
    }

    @Override // X.JII
    public final void Db6(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
        FBProductItemDetailsDict A01;
        C41165IKe c41165IKe = this.A01;
        String str = null;
        if (c38675GzG != null) {
            str = c38675GzG.A04;
        }
        INP A02 = c41165IKe.A05.A02(productFeedItem, i, i2);
        A02.A03(str);
        A02.A00();
        c41165IKe.A01 = c41165IKe.A07.A01();
        ProductTile productTile = productFeedItem.A02;
        if (productTile != null && (A01 = AbstractC41709Idf.A01(productTile)) != null) {
            C1XJ c1xj = C1XJ.A00;
            FragmentActivity activity = c41165IKe.A02.getActivity();
            activity.getClass();
            c1xj.A10(activity, c41165IKe.A03, c41165IKe.A04, AbstractC37302Gc3.A0Z(A01));
            return;
        }
        Product A022 = productFeedItem.A02();
        A022.getClass();
        InterfaceC60442pS interfaceC60442pS = c41165IKe.A04;
        UserSession userSession = c41165IKe.A03;
        String str2 = A022.A0H;
        String A012 = AbstractC154266wb.A01(i, i2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_collection_home_click");
        EnumC33416Epn enumC33416Epn = EnumC33416Epn.A0C;
        A0f.AAP("collection_id", enumC33416Epn.A01);
        A0f.AAP("collection_name", enumC33416Epn.A00);
        A0f.AAP(AbstractC111324zv.A00(456), RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A0f.AAP("product_id", str2);
        A0f.AAP("position", A012);
        A0f.Cht();
        C1XJ c1xj2 = C1XJ.A00;
        FragmentActivity activity2 = c41165IKe.A02.getActivity();
        activity2.getClass();
        C42130Ile A0L = c1xj2.A0L(activity2, userSession, interfaceC60442pS, A022, "shopping_product_collection", c41165IKe.A0C);
        A0L.A0N = c41165IKe.A0B;
        A0L.A0Y = c41165IKe.A01;
        C42130Ile.A01(A0L);
    }

    @Override // X.JII
    public final void DbE(C38675GzG c38675GzG, ProductTile productTile, int i, int i2) {
        C41165IKe c41165IKe = this.A01;
        C64972wv c64972wv = c41165IKe.A06;
        c41165IKe.A07.A01();
        c64972wv.A01(null, productTile).A00();
    }

    public C42913IyR(UserSession userSession, C41165IKe c41165IKe, C41646Ibe c41646Ibe) {
        this.A00 = userSession;
        this.A01 = c41165IKe;
        this.A02 = c41646Ibe;
    }
}
