package X;

import android.content.Context;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.Product;
import java.util.ArrayList;

/* renamed from: X.IyN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42909IyN implements InterfaceC43419JGj {
    public final /* synthetic */ C39039HGp A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;
    public final /* synthetic */ InterfaceC43418JGi A03;

    public C42909IyN(C39039HGp c39039HGp, C6FG c6fg, C102884kP c102884kP, InterfaceC43418JGi interfaceC43418JGi) {
        this.A00 = c39039HGp;
        this.A01 = c6fg;
        this.A02 = c102884kP;
        this.A03 = interfaceC43418JGi;
    }

    @Override // X.InterfaceC43419JGj
    public final void D2w(C39703HjZ c39703HjZ) {
        ProductImageContainer productImageContainer;
        ProductImageContainer productImageContainer2;
        FBProductItemDetailsDict fBProductItemDetailsDict;
        FBProductItemDetailsDict fBProductItemDetailsDict2;
        C39039HGp c39039HGp = this.A00;
        Context context = this.A01.A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (ProductFeedItem productFeedItem : c39703HjZ.A00) {
            Product A02 = productFeedItem.A02();
            if (A02 == null || (productImageContainer2 = A02.A0A) == null) {
                ProductTile productTile = productFeedItem.A02;
                if (productTile != null) {
                    Product product = productTile.A07;
                    if (product != null) {
                        productImageContainer = product.A0A;
                    } else {
                        ProductTileProductImpl productTileProductImpl = productTile.A02;
                        if (productTileProductImpl != null && (fBProductItemDetailsDict2 = productTileProductImpl.A00) != null) {
                            productImageContainer = fBProductItemDetailsDict2.C85();
                        }
                    }
                    if (productImageContainer != null) {
                        ProductTile productTile2 = productFeedItem.A02;
                        C14360o3.A0B(productTile2, 0);
                        Product product2 = productTile2.A07;
                        productImageContainer2 = null;
                        if (product2 != null) {
                            productImageContainer2 = product2.A0A;
                        } else {
                            ProductTileProductImpl productTileProductImpl2 = productTile2.A02;
                            if (productTileProductImpl2 != null && (fBProductItemDetailsDict = productTileProductImpl2.A00) != null) {
                                productImageContainer2 = fBProductItemDetailsDict.C85();
                            }
                        }
                    }
                }
            }
            A1E.add(productImageContainer2);
        }
        C102884kP c102884kP = this.A02;
        String A0F = c102884kP.A0F();
        String A0I = c102884kP.A0I();
        String A0F2 = c102884kP.A0F();
        EnumC39620HeU enumC39620HeU = EnumC39620HeU.A04;
        String str = "";
        String A0J = c102884kP.A0J();
        if (A0J != null) {
            str = A0J;
        }
        c39039HGp.A00 = I9B.A00(context, new C42575Ist(str), enumC39620HeU, this.A03, A0F, A0I, "bloks", "bloks", A0F2, A1E, 0, 0);
    }
}
