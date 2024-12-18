package X;

import android.view.View;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.J8p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43218J8p extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43218J8p(ProductFeedItem productFeedItem, JII jii, String str, String str2, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A03 = jii;
        this.A04 = productFeedItem;
        this.A02 = i;
        this.A01 = i2;
        this.A06 = str;
        this.A05 = str2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            C14360o3.A0B(obj, 0);
            ((JII) this.A03).DbE(new C38675GzG(null, this.A06, this.A05, 2040), ((ProductFeedItem) this.A04).A02, this.A02, this.A01);
        } else {
            View A0R = AbstractC25228BEl.A0R(obj);
            ((JII) this.A03).Db6(A0R, new C38675GzG(null, this.A06, this.A05, 2040), (ProductFeedItem) this.A04, this.A02, this.A01);
        }
        return C0eB.A00;
    }
}
