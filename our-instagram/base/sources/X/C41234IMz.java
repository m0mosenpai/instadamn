package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import java.util.List;
import java.util.Map;

/* renamed from: X.IMz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41234IMz {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final ShoppingTaggingFeedArguments A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public final void A01(C38686GzR c38686GzR, String str, Map map) {
        ShoppingTaggingFeedArguments shoppingTaggingFeedArguments = this.A02;
        InterfaceC02590Ai A00 = AbstractC37305Gc6.A00(AbstractC37300Gc1.A0C(this.A03), shoppingTaggingFeedArguments, "instagram_shopping_product_tagging_feed_complete");
        C38686GzR.A00(A00, c38686GzR);
        A00.A9M("selected_product_merchant_ids", map);
        A00.AAP("selected_collection_id", str);
        AbstractC37304Gc5.A14(A00, shoppingTaggingFeedArguments);
    }

    public C41234IMz(InterfaceC11380iw interfaceC11380iw, UserSession userSession, ShoppingTaggingFeedArguments shoppingTaggingFeedArguments) {
        AbstractC167017dG.A1Q(userSession, shoppingTaggingFeedArguments);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = shoppingTaggingFeedArguments;
        this.A03 = J8X.A00(this, 16);
        this.A04 = J8X.A00(this, 17);
    }

    public final void A00(C38686GzR c38686GzR, ProductAffiliateInformationDict productAffiliateInformationDict, C38645Gym c38645Gym, String str, String str2, String str3, String str4, String str5) {
        C4SX c4sx;
        String str6;
        String str7;
        String AaM;
        TextWithEntities textWithEntities;
        EnumC39576Hdm enumC39576Hdm;
        AbstractC167017dG.A1N(str, c38686GzR);
        ShoppingTaggingFeedArguments shoppingTaggingFeedArguments = this.A02;
        InterfaceC02590Ai A00 = AbstractC37305Gc6.A00(AbstractC37300Gc1.A0C(this.A03), shoppingTaggingFeedArguments, "instagram_shopping_product_tagging_feed_component_interaction");
        C38686GzR.A00(A00, c38686GzR);
        A00.AAP("component_id", str);
        String str8 = c38686GzR.A02;
        long j = 0;
        List list = null;
        if (str8 != null) {
            c4sx = new C4SX(Long.valueOf(AbstractC167027dH.A03(str8)));
        } else {
            c4sx = null;
        }
        A00.AAK(c4sx, "merchant_id");
        if (c38645Gym != null && (enumC39576Hdm = c38645Gym.A06) != null) {
            str6 = enumC39576Hdm.A00;
        } else {
            str6 = null;
        }
        A00.AAP("behavior", str6);
        if (c38645Gym != null && (textWithEntities = c38645Gym.A03) != null) {
            str7 = textWithEntities.A02;
        } else {
            str7 = null;
        }
        A00.AAP("component_primary_text", str7);
        A00.AAP(AbstractC43591JPw.A00(217), str2);
        A00.AAP("target_id", str3);
        if (productAffiliateInformationDict != null && (AaM = productAffiliateInformationDict.AaM()) != null) {
            C0Zx c0Zx = new C0Zx();
            Long A0j = AbstractC166997dE.A0j(AaM);
            if (A0j != null) {
                j = A0j.longValue();
            }
            c0Zx.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(j));
            c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "affiliate");
            list = AbstractC166987dD.A1J(c0Zx);
        }
        A00.AAk("campaign_info", list);
        A00.AAP("multi_selection_type", str4);
        A00.AAP("search_text", str5);
        AbstractC37304Gc5.A14(A00, shoppingTaggingFeedArguments);
    }
}
