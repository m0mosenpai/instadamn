package X;

import com.instagram.model.shopping.productcollection.ProductCollectionTagInfo;

/* renamed from: X.I3m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40732I3m {
    public static void A00(AnonymousClass182 anonymousClass182, ProductCollectionTagInfo productCollectionTagInfo) {
        anonymousClass182.A0d();
        String str = productCollectionTagInfo.A01;
        if (str != null) {
            anonymousClass182.A0S("collection_id", str);
        }
        String str2 = productCollectionTagInfo.A02;
        if (str2 != null) {
            anonymousClass182.A0S("collection_type", str2);
        }
        String str3 = productCollectionTagInfo.A03;
        if (str3 != null) {
            anonymousClass182.A0S("untagged_collection_id", str3);
        }
        String str4 = productCollectionTagInfo.A04;
        if (str4 != null) {
            anonymousClass182.A0S("untagged_collection_type", str4);
        }
        Boolean bool = productCollectionTagInfo.A00;
        if (bool != null) {
            anonymousClass182.A0T("is_auto_tagged", bool.booleanValue());
        }
        anonymousClass182.A0a();
    }
}
