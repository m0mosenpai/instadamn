package X;

import com.instagram.shopping.model.collection.ProductCollectionShareInfo;

/* renamed from: X.EbY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32768EbY extends FKR {
    public final ProductCollectionShareInfo A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32768EbY(ProductCollectionShareInfo productCollectionShareInfo, String str) {
        super(C2EY.A1b, str);
        C14360o3.A0B(productCollectionShareInfo, 2);
        this.A01 = str;
        this.A00 = productCollectionShareInfo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32768EbY) {
                C32768EbY c32768EbY = (C32768EbY) obj;
                if (!C14360o3.A0K(this.A01, c32768EbY.A01) || !C14360o3.A0K(this.A00, c32768EbY.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167017dG.A0O(this.A01) * 31);
    }
}
