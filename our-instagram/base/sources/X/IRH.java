package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.DropsEventPageNavigationMetadataImpl;
import com.instagram.api.schemas.ProductItemStickerBundleStyle;
import com.instagram.api.schemas.StoryProductItemStickerTappableData;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import com.instagram.model.shopping.reels.ProductSticker;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IRH {
    public static ProductSticker parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            DropsLaunchAnimation dropsLaunchAnimation = null;
            DropsEventPageNavigationMetadataImpl dropsEventPageNavigationMetadataImpl = null;
            String str2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str3 = null;
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            ArrayList arrayList = null;
            String str4 = null;
            String str5 = null;
            TextReviewStatus textReviewStatus = null;
            String str6 = null;
            String str7 = null;
            Boolean bool3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("creation_method".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("drops_launch_animation".equals(A0s)) {
                    dropsLaunchAnimation = I3V.parseFromJson(c16l);
                } else if ("event_page_navigation_metadata".equals(A0s)) {
                    dropsEventPageNavigationMetadataImpl = AbstractC39903Hmq.parseFromJson(c16l);
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("is_organic_product_tagging".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("is_set_reminder_button_enabled".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC37300Gc1.A1J(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("product_item".equals(A0s)) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                } else if ("stickers".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            StoryProductItemStickerTappableData parseFromJson = AbstractC40305Hu9.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC37300Gc1.A1D(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("text_format".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("text_review_status".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    textReviewStatus = (TextReviewStatus) TextReviewStatus.A01.get(A1P);
                    if (textReviewStatus == null) {
                        textReviewStatus = TextReviewStatus.A08;
                    }
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("vibrant_text_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else {
                    bool3 = AbstractC37303Gc4.A0K(c16l, bool3, A0s, "was_text_edited");
                }
                c16l.A0z();
            }
            return new ProductSticker(dropsEventPageNavigationMetadataImpl, textReviewStatus, dropsLaunchAnimation, productDetailsProductItemDict, bool, bool2, bool3, str, str2, str3, str4, str5, str6, str7, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ProductSticker productSticker) {
        anonymousClass182.A0d();
        String str = productSticker.A07;
        if (str != null) {
            anonymousClass182.A0S("creation_method", str);
        }
        DropsLaunchAnimation dropsLaunchAnimation = productSticker.A02;
        if (dropsLaunchAnimation != null) {
            anonymousClass182.A0r("drops_launch_animation");
            anonymousClass182.A0d();
            Boolean bool = dropsLaunchAnimation.A00;
            if (bool != null) {
                anonymousClass182.A0T("show_animation", bool.booleanValue());
            }
            anonymousClass182.A0a();
        }
        DropsEventPageNavigationMetadata dropsEventPageNavigationMetadata = productSticker.A00;
        if (dropsEventPageNavigationMetadata != null) {
            anonymousClass182.A0r("event_page_navigation_metadata");
            DropsEventPageNavigationMetadataImpl Et9 = dropsEventPageNavigationMetadata.Et9();
            anonymousClass182.A0d();
            String str2 = Et9.A00;
            if (str2 != null) {
                anonymousClass182.A0S("upcoming_event_id", str2);
            }
            anonymousClass182.A0a();
        }
        AbstractC37301Gc2.A1D(anonymousClass182, productSticker.A08);
        Boolean bool2 = productSticker.A04;
        if (bool2 != null) {
            anonymousClass182.A0T("is_organic_product_tagging", bool2.booleanValue());
        }
        Boolean bool3 = productSticker.A05;
        if (bool3 != null) {
            anonymousClass182.A0T("is_set_reminder_button_enabled", bool3.booleanValue());
        }
        String str3 = productSticker.A09;
        if (str3 != null) {
            anonymousClass182.A0S("media_id", str3);
        }
        ProductDetailsProductItemDict productDetailsProductItemDict = productSticker.A03;
        if (productDetailsProductItemDict != null) {
            anonymousClass182.A0r("product_item");
            AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
        }
        List list = productSticker.A0E;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "stickers", list);
            while (A0q.hasNext()) {
                StoryProductItemStickerTappableData storyProductItemStickerTappableData = (StoryProductItemStickerTappableData) A0q.next();
                if (storyProductItemStickerTappableData != null) {
                    anonymousClass182.A0d();
                    ProductItemStickerBundleStyle productItemStickerBundleStyle = storyProductItemStickerTappableData.A00;
                    if (productItemStickerBundleStyle != null) {
                        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, productItemStickerBundleStyle.A00);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        AbstractC37301Gc2.A1E(anonymousClass182, productSticker.A0A);
        String str4 = productSticker.A0B;
        if (str4 != null) {
            anonymousClass182.A0S("text_format", str4);
        }
        TextReviewStatus textReviewStatus = productSticker.A01;
        if (textReviewStatus != null) {
            anonymousClass182.A0S("text_review_status", textReviewStatus.A00);
        }
        String str5 = productSticker.A0C;
        if (str5 != null) {
            anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str5);
        }
        String str6 = productSticker.A0D;
        if (str6 != null) {
            anonymousClass182.A0S("vibrant_text_color", str6);
        }
        Boolean bool4 = productSticker.A06;
        if (bool4 != null) {
            anonymousClass182.A0T("was_text_edited", bool4.booleanValue());
        }
        anonymousClass182.A0a();
    }
}
