package X;

import com.instagram.api.schemas.SellerShoppableFeedType;

/* renamed from: X.16o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC223416o {
    public static final SellerShoppableFeedType A00(String str) {
        SellerShoppableFeedType sellerShoppableFeedType = (SellerShoppableFeedType) SellerShoppableFeedType.A01.get(str);
        if (sellerShoppableFeedType == null) {
            return SellerShoppableFeedType.A08;
        }
        return sellerShoppableFeedType;
    }
}
