package X;

import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6T4, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6T4 {
    public static final String A00(ReelCTAIntf reelCTAIntf) {
        String str;
        if (reelCTAIntf != null) {
            str = reelCTAIntf.Ats();
        } else {
            str = null;
        }
        if ("ar_effect".equals(str)) {
            return reelCTAIntf.BYV();
        }
        return null;
    }

    public static final String A01(ReelCTAIntf reelCTAIntf) {
        int A04;
        if (reelCTAIntf == null || reelCTAIntf.B65() == null) {
            return null;
        }
        String B65 = reelCTAIntf.B65();
        if (B65 != null && (A04 = AbstractC001900j.A04(B65, '_', 0)) != -1) {
            String B652 = reelCTAIntf.B65();
            if (B652 == null) {
                return null;
            }
            String substring = B652.substring(0, A04);
            C14360o3.A07(substring);
            return substring;
        }
        return reelCTAIntf.B65();
    }

    public static final String A02(ReelCTAIntf reelCTAIntf) {
        List BNi;
        AndroidLink androidLink;
        if (reelCTAIntf != null && (BNi = reelCTAIntf.BNi()) != null && (androidLink = (AndroidLink) AbstractC001800i.A0J(BNi)) != null) {
            return androidLink.CHN();
        }
        return null;
    }

    public static final void A03(AnonymousClass182 anonymousClass182, Product product) {
        anonymousClass182.A0d();
        anonymousClass182.A0S("product_id", product.A0H);
        User user = product.A0B;
        String str = null;
        if (user != null) {
            str = AbstractC76433bn.A00(user);
        }
        anonymousClass182.A0S("merchant_id", str);
        ProductAffiliateInformationDict productAffiliateInformationDict = product.A04;
        if (productAffiliateInformationDict != null && productAffiliateInformationDict.AaM() != null) {
            anonymousClass182.A0S("affiliate_campaign_id", productAffiliateInformationDict.AaM());
        }
        TaggingFeedSessionInformation taggingFeedSessionInformation = product.A00;
        if (taggingFeedSessionInformation != null) {
            anonymousClass182.A0S("waterfall_id", taggingFeedSessionInformation.A01);
            anonymousClass182.A0S(AbstractC43591JPw.A00(96), taggingFeedSessionInformation.A00);
        }
        anonymousClass182.A0a();
    }
}
