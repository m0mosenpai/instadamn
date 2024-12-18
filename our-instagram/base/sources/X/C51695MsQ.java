package X;

import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MsQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51695MsQ extends C0T6 {
    public final ProductCollectionFeedTaggingMeta A00;
    public final ArrayList A01;
    public final ArrayList A02;
    public final List A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51695MsQ) {
                C51695MsQ c51695MsQ = (C51695MsQ) obj;
                if (!C14360o3.A0K(this.A01, c51695MsQ.A01) || !C14360o3.A0K(this.A02, c51695MsQ.A02) || !C14360o3.A0K(this.A04, c51695MsQ.A04) || !C14360o3.A0K(this.A03, c51695MsQ.A03) || !C14360o3.A0K(this.A00, c51695MsQ.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A03, (((AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C51695MsQ(ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta, ArrayList arrayList, ArrayList arrayList2, List list, List list2) {
        MSZ.A1O(arrayList, list2);
        this.A01 = arrayList;
        this.A02 = arrayList2;
        this.A04 = list;
        this.A03 = list2;
        this.A00 = productCollectionFeedTaggingMeta;
    }

    public C51695MsQ() {
        this(null, AbstractC166987dD.A1E(), null, null, AbstractC166987dD.A1E());
    }
}
