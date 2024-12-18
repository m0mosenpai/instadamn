package X;

import android.view.View;
import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;

/* renamed from: X.J8r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43220J8r extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43220J8r(Object obj, Object obj2, Object obj3, String str, String str2, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A04 = obj;
        this.A07 = str;
        this.A03 = obj2;
        this.A06 = str2;
        this.A05 = obj3;
        this.A02 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C38321qM c38321qM;
        if (this.A00 != 0) {
            C14360o3.A0B(obj, 0);
            ((JII) this.A03).DbE(new C38675GzG((C19260xA) this.A04, this.A07, this.A06, 2040), ((ProductFeedItem) this.A05).A02, this.A02, this.A01);
        } else {
            View A0R = AbstractC25228BEl.A0R(obj);
            ProductFeedItem productFeedItem = (ProductFeedItem) this.A04;
            String str2 = this.A07;
            FiltersLoggingInfo filtersLoggingInfo = (FiltersLoggingInfo) this.A03;
            ProductTile productTile = productFeedItem.A02;
            if (productTile != null && (c38321qM = productTile.A05) != null) {
                str = c38321qM.getId();
            } else {
                str = null;
            }
            H7J h7j = new H7J(productFeedItem, new C38670GzB(null, filtersLoggingInfo, str2, str, this.A06));
            InterfaceC43443JHh interfaceC43443JHh = (InterfaceC43443JHh) this.A05;
            interfaceC43443JHh.AAr(h7j, new C41024IEt(this.A02, this.A01));
            interfaceC43443JHh.EDu(A0R, h7j);
        }
        return C0eB.A00;
    }
}
