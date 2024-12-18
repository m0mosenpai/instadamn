package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import java.util.List;

/* renamed from: X.HJo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39116HJo extends AbstractC64162vb {
    public final C41234IMz A00;
    public final UserSession A01;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C4SX c4sx;
        List list;
        String AaM;
        C41150IJp c41150IJp = (C41150IJp) obj;
        C14360o3.A0B(c41150IJp, 0);
        C41234IMz c41234IMz = this.A00;
        String str = c41150IJp.A02;
        C38686GzR c38686GzR = c41150IJp.A00;
        String str2 = c41150IJp.A03;
        String str3 = c41150IJp.A04;
        ProductAffiliateInformationDict productAffiliateInformationDict = c41150IJp.A01;
        String str4 = c41150IJp.A05;
        ShoppingTaggingFeedArguments shoppingTaggingFeedArguments = c41234IMz.A02;
        InterfaceC02590Ai A00 = AbstractC37305Gc6.A00(AbstractC37300Gc1.A0C(c41234IMz.A03), shoppingTaggingFeedArguments, "instagram_shopping_product_tagging_feed_item_impression");
        AbstractC37300Gc1.A0m(A00, "");
        AbstractC37300Gc1.A0q(A00, null);
        C38686GzR.A00(A00, c38686GzR);
        String str5 = c38686GzR.A02;
        long j = 0;
        if (str5 != null) {
            c4sx = new C4SX(Long.valueOf(AbstractC167027dH.A03(str5)));
        } else {
            c4sx = null;
        }
        A00.AAK(c4sx, "merchant_id");
        A00.AAP(AbstractC43591JPw.A00(217), null);
        A00.AAP("target_id", str4);
        A00.AAP("position", str2);
        if (productAffiliateInformationDict != null && (AaM = productAffiliateInformationDict.AaM()) != null) {
            C0Zx c0Zx = new C0Zx();
            Long A0j = AbstractC166997dE.A0j(AaM);
            if (A0j != null) {
                j = A0j.longValue();
            }
            c0Zx.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(j));
            c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "affiliate");
            list = AbstractC166987dD.A1J(c0Zx);
        } else {
            list = null;
        }
        A00.AAk("campaign_info", list);
        A00.AAP("sort_and_filters", null);
        A00.AAP("ranking_id", null);
        A00.AAP("search_text", str3);
        A00.AAP("component_id", str);
        AbstractC37304Gc5.A14(A00, shoppingTaggingFeedArguments);
    }

    public C39116HJo(UserSession userSession, C41234IMz c41234IMz) {
        super(AbstractC37302Gc3.A0J(userSession));
        this.A01 = userSession;
        this.A00 = c41234IMz;
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
    }
}
