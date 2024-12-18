package X;

import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* loaded from: classes7.dex */
public final class H79 extends C0T6 implements InterfaceC66482zP {
    public final C38660Gz1 A00;
    public final IHJ A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H79) {
                H79 h79 = (H79) obj;
                if (!C14360o3.A0K(this.A00, h79.A00) || !C14360o3.A0K(this.A01, h79.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String id;
        ProductFeedItem productFeedItem = this.A00.A04;
        if (productFeedItem == null || (id = productFeedItem.getId()) == null) {
            return "";
        }
        return id;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C38660Gz1 c38660Gz1;
        H79 h79 = (H79) obj;
        C38660Gz1 c38660Gz12 = this.A00;
        if (h79 != null) {
            c38660Gz1 = h79.A00;
        } else {
            c38660Gz1 = null;
        }
        return C14360o3.A0K(c38660Gz12, c38660Gz1);
    }

    public H79(C38660Gz1 c38660Gz1, IHJ ihj) {
        this.A00 = c38660Gz1;
        this.A01 = ihj;
    }
}
