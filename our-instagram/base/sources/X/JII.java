package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;

/* loaded from: classes7.dex */
public interface JII {
    void Db4(C38675GzG c38675GzG, Product product);

    void Db5(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2);

    void Db6(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2);

    void Db9(Product product, String str, String str2, int i, int i2);

    boolean DbA(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z);

    void DbB(String str, int i);

    void DbC(Product product, int i, int i2);

    void DbE(C38675GzG c38675GzG, ProductTile productTile, int i, int i2);

    boolean DbG(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z);

    void DbH(Product product);

    void DbI(Product product);

    void DbJ(String str);

    void DbK(Product product);
}
