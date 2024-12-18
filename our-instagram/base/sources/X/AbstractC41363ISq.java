package X;

import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ISq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41363ISq {
    public static final List A00(TaggingFeedMultiSelectState taggingFeedMultiSelectState) {
        C14360o3.A0B(taggingFeedMultiSelectState, 0);
        Collection values = taggingFeedMultiSelectState.A04.values();
        ArrayList A0q = AbstractC167017dG.A0q(values);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            A0q.add(it.next());
        }
        return A0q;
    }

    public static final boolean A01(TaggingFeedMultiSelectState taggingFeedMultiSelectState, Product product, String str) {
        C14360o3.A0B(taggingFeedMultiSelectState, 0);
        if (product == null || !taggingFeedMultiSelectState.A04.containsKey(product.A0H)) {
            if (str != null && taggingFeedMultiSelectState.A01.contains(str)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
