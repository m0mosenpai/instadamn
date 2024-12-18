package X;

import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import java.util.List;

/* renamed from: X.GzD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38672GzD extends C0T6 {
    public final C38686GzR A00;
    public final ShoppingTaggingFeedHeader A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final boolean A05;

    public C38672GzD(C38686GzR c38686GzR, ShoppingTaggingFeedHeader shoppingTaggingFeedHeader, String str, List list, List list2, boolean z) {
        C14360o3.A0B(shoppingTaggingFeedHeader, 2);
        this.A04 = list;
        this.A01 = shoppingTaggingFeedHeader;
        this.A00 = c38686GzR;
        this.A03 = list2;
        this.A05 = z;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38672GzD) {
                C38672GzD c38672GzD = (C38672GzD) obj;
                if (!C14360o3.A0K(this.A04, c38672GzD.A04) || !C14360o3.A0K(this.A01, c38672GzD.A01) || !C14360o3.A0K(this.A00, c38672GzD.A00) || !C14360o3.A0K(this.A03, c38672GzD.A03) || this.A05 != c38672GzD.A05 || !C14360o3.A0K(this.A02, c38672GzD.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A04))))) + AbstractC167017dG.A0O(this.A02);
    }

    public static final C38672GzD A00(C38686GzR c38686GzR, ShoppingTaggingFeedHeader shoppingTaggingFeedHeader, String str, List list, List list2, boolean z) {
        AbstractC167027dH.A12(list, shoppingTaggingFeedHeader, c38686GzR);
        C14360o3.A0B(list2, 3);
        return new C38672GzD(c38686GzR, shoppingTaggingFeedHeader, str, list, list2, z);
    }
}
