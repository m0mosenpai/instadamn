package X;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;

/* renamed from: X.IyS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42914IyS implements JPm {
    public final C41196ILk A00;
    public final C6FG A01;
    public final C102884kP A02;
    public final UserSession A03;
    public final C41646Ibe A04;

    @Override // X.InterfaceC43418JGi
    public final void D2v(String str, String str2, String str3, int i, int i2) {
    }

    @Override // X.JII
    public final /* synthetic */ void Db5(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
    }

    @Override // X.JII
    public final /* synthetic */ void Db9(Product product, String str, String str2, int i, int i2) {
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
    }

    @Override // X.JHT
    public final void Dw3(ProductFeedItem productFeedItem) {
    }

    @Override // X.JII
    public final void Db4(C38675GzG c38675GzG, Product product) {
        C41646Ibe c41646Ibe = this.A04;
        if (c41646Ibe != null) {
            c41646Ibe.A07(product, "mini_shop_saved_items");
            C102884kP c102884kP = this.A02;
            C6FG c6fg = this.A01;
            InterfaceC103384lE A0B = c102884kP.A0B(69);
            if (A0B != null) {
                AbstractC37304Gc5.A1O(c6fg, c102884kP, A0B);
            }
        }
    }

    @Override // X.JII
    public final void Db6(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
        C102884kP c102884kP = this.A02;
        InterfaceC103384lE A09 = c102884kP.A09();
        if (A09 != null) {
            C6FG c6fg = this.A01;
            AbstractC167017dG.A1O(c6fg, productFeedItem);
            ((SparseArray) c6fg.A00(R.id.bloks_ig_object_store_deprecated)).put(R.id.product_feed_item, productFeedItem);
            C6FP.A03(c6fg, c102884kP, C6FW.A01, A09);
        }
    }

    @Override // X.JII
    public final boolean DbA(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        C41646Ibe c41646Ibe = this.A04;
        if (c41646Ibe != null) {
            return c41646Ibe.A09(productFeedItem);
        }
        return false;
    }

    @Override // X.JII
    public final void DbE(C38675GzG c38675GzG, ProductTile productTile, int i, int i2) {
        C41646Ibe c41646Ibe = this.A04;
        if (c41646Ibe != null) {
            this.A00.A00(!AbstractC41709Idf.A03(this.A03, productTile));
            C14360o3.A0B(productTile, 0);
            c41646Ibe.A03(c38675GzG, productTile, i, i2, true);
        }
    }

    @Override // X.JII
    public final void DbH(Product product) {
        C41646Ibe c41646Ibe = this.A04;
        if (c41646Ibe != null) {
            C14360o3.A0B(product, 0);
            C41646Ibe.A00(c41646Ibe, product, "view_in_cart_cta");
        }
    }

    public C42914IyS(C41196ILk c41196ILk, C6FG c6fg, C102884kP c102884kP, UserSession userSession, C41646Ibe c41646Ibe) {
        this.A02 = c102884kP;
        this.A01 = c6fg;
        this.A03 = userSession;
        this.A04 = c41646Ibe;
        this.A00 = c41196ILk;
    }
}
