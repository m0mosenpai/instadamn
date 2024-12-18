package X;

import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* loaded from: classes7.dex */
public final class H7J extends C0T6 implements InterfaceC66482zP {
    public Long A00;
    public final FiltersLoggingInfo A01;
    public final ProductFeedItem A02;
    public final C38670GzB A03;
    public final String A04;
    public final String A05;

    public H7J(ProductFeedItem productFeedItem, C38670GzB c38670GzB) {
        String A0R;
        this.A02 = productFeedItem;
        this.A03 = c38670GzB;
        this.A00 = null;
        String str = c38670GzB.A04;
        this.A04 = (str == null || (A0R = AnonymousClass001.A0R(str, productFeedItem.getId())) == null) ? AbstractC37301Gc2.A0j(productFeedItem) : A0R;
        this.A05 = str;
        this.A01 = c38670GzB.A01;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7J) {
                H7J h7j = (H7J) obj;
                if (!C14360o3.A0K(this.A02, h7j.A02) || !C14360o3.A0K(this.A03, h7j.A03) || !C14360o3.A0K(this.A00, h7j.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A02)) + AbstractC53644Nnp.A00()) * 31) + AbstractC167017dG.A0M(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public H7J(ProductFeedItem productFeedItem, String str) {
        this(productFeedItem, new C38670GzB(null, null, str, null, null));
        AbstractC167017dG.A1P(productFeedItem, str);
    }
}
