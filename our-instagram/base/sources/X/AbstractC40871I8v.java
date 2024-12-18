package X;

import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import java.io.IOException;

/* renamed from: X.I8v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40871I8v {
    public static ShoppingTaggingFeedHeader parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ShoppingTaggingFeedHeader shoppingTaggingFeedHeader = new ShoppingTaggingFeedHeader();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("primary_text".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    shoppingTaggingFeedHeader.A01 = A0m;
                } else if ("secondary_text".equals(A0s)) {
                    shoppingTaggingFeedHeader.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("exit_enabled".equals(A0s)) {
                    shoppingTaggingFeedHeader.A03 = c16l.A0d();
                } else if ("search_enabled".equals(A0s)) {
                    shoppingTaggingFeedHeader.A04 = c16l.A0d();
                } else if ("default_search_text".equals(A0s)) {
                    shoppingTaggingFeedHeader.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("selection_count_enabled".equals(A0s)) {
                    shoppingTaggingFeedHeader.A05 = c16l.A0d();
                }
                c16l.A0z();
            }
            return shoppingTaggingFeedHeader;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
