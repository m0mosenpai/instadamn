package X;

import com.instagram.model.shopping.productfeed.ProductFeedItem;
import java.util.List;

/* renamed from: X.GtY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38338GtY extends AbstractC66542zW {
    public final List A01 = AbstractC166987dD.A1E();
    public final List A00 = AbstractC166987dD.A1E();

    @Override // X.AbstractC66542zW
    public final int A02() {
        return this.A00.size();
    }

    @Override // X.AbstractC66542zW
    public final int A03() {
        return this.A01.size();
    }

    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        return C14360o3.A0K(((ProductFeedItem) this.A01.get(i)).getId(), ((ProductFeedItem) this.A00.get(i2)).getId());
    }

    @Override // X.AbstractC66542zW
    public final boolean A04(int i, int i2) {
        return A05(i, i2);
    }
}
