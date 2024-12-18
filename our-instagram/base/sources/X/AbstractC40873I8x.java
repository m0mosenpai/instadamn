package X;

import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.I8x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40873I8x {
    public static final C38672GzD A00(C38672GzD c38672GzD) {
        List list = c38672GzD.A04;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            AbstractC25232BEp.A1Q(((C38619GyM) obj).A03, "spinner/default", obj, A1E);
        }
        ShoppingTaggingFeedHeader shoppingTaggingFeedHeader = c38672GzD.A01;
        return C38672GzD.A00(c38672GzD.A00, shoppingTaggingFeedHeader, c38672GzD.A02, A1E, c38672GzD.A03, c38672GzD.A05);
    }
}
