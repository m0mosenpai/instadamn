package X;

import android.view.View;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.J8j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43212J8j extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ProductFeedItem A02;
    public final /* synthetic */ JII A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43212J8j(ProductFeedItem productFeedItem, JII jii, String str, String str2, int i, int i2) {
        super(1);
        this.A03 = jii;
        this.A02 = productFeedItem;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = str;
        this.A04 = str2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View A0R = AbstractC25228BEl.A0R(obj);
        JII jii = this.A03;
        ProductFeedItem productFeedItem = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        C19260xA c19260xA = new C19260xA();
        C19260xA.A00(c19260xA, null, "product_collection_id");
        C19260xA.A00(c19260xA, null, "product_collection_type");
        jii.Db6(A0R, new C38675GzG(c19260xA, this.A05, this.A04, 2040), productFeedItem, i, i2);
        return C0eB.A00;
    }
}
