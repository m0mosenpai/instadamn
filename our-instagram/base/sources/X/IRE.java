package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ProductItemStickerBundleStyle;
import com.instagram.api.schemas.StoryMultiProductStickerLinkData;
import com.instagram.api.schemas.StoryMultiProductStickerLinkDataImpl;
import com.instagram.api.schemas.StoryProductItemStickerTappableData;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.shopping.reels.MultiProductSticker;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IRE {
    public static MultiProductSticker parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            ArrayList arrayList = null;
            String str2 = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_organic_product_tagging".equals(A0q)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("links".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            StoryMultiProductStickerLinkDataImpl parseFromJson = AbstractC40298Hu2.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC37300Gc1.A1J(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("multi_product_items".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1L(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("stickers".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            StoryProductItemStickerTappableData parseFromJson2 = AbstractC40305Hu9.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if (AbstractC37300Gc1.A1D(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("text_format".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("text_review_status".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("vibrant_text_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new MultiProductSticker(bool, str, str2, str3, str4, str5, str6, str7, arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, MultiProductSticker multiProductSticker) {
        anonymousClass182.A0d();
        AbstractC37301Gc2.A1D(anonymousClass182, multiProductSticker.A01);
        Boolean bool = multiProductSticker.A00;
        if (bool != null) {
            anonymousClass182.A0T("is_organic_product_tagging", bool.booleanValue());
        }
        List list = multiProductSticker.A08;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "links", list);
            while (A0q.hasNext()) {
                StoryMultiProductStickerLinkData storyMultiProductStickerLinkData = (StoryMultiProductStickerLinkData) A0q.next();
                if (storyMultiProductStickerLinkData != null) {
                    StoryMultiProductStickerLinkDataImpl F0y = storyMultiProductStickerLinkData.F0y();
                    anonymousClass182.A0d();
                    Integer num = F0y.A00;
                    if (num != null) {
                        anonymousClass182.A0Q("linkType", num.intValue());
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        String str = multiProductSticker.A02;
        if (str != null) {
            anonymousClass182.A0S("media_id", str);
        }
        List list2 = multiProductSticker.A09;
        if (list2 != null) {
            Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "multi_product_items", list2);
            while (A0q2.hasNext()) {
                ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) A0q2.next();
                if (productDetailsProductItemDict != null) {
                    AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
                }
            }
            anonymousClass182.A0Z();
        }
        List list3 = multiProductSticker.A0A;
        if (list3 != null) {
            Iterator A0q3 = AbstractC37301Gc2.A0q(anonymousClass182, "stickers", list3);
            while (A0q3.hasNext()) {
                StoryProductItemStickerTappableData storyProductItemStickerTappableData = (StoryProductItemStickerTappableData) A0q3.next();
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
        AbstractC37301Gc2.A1E(anonymousClass182, multiProductSticker.A03);
        String str2 = multiProductSticker.A04;
        if (str2 != null) {
            anonymousClass182.A0S("text_format", str2);
        }
        String str3 = multiProductSticker.A05;
        if (str3 != null) {
            anonymousClass182.A0S("text_review_status", str3);
        }
        String str4 = multiProductSticker.A06;
        if (str4 != null) {
            anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str4);
        }
        String str5 = multiProductSticker.A07;
        if (str5 != null) {
            anonymousClass182.A0S("vibrant_text_color", str5);
        }
        anonymousClass182.A0a();
    }
}
