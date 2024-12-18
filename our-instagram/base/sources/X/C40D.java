package X;

import com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon;
import com.instagram.feed.media.EffectPreview;
import com.instagram.feed.media.ReelCTA;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.androidlink.AndroidLinkImpl;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.40D, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C40D {
    public static ReelCTA parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ShoppingSwipeUpCTATextIcon shoppingSwipeUpCTATextIcon = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            EffectPreview effectPreview = null;
            String str4 = null;
            String str5 = null;
            Boolean bool = null;
            ArrayList arrayList = null;
            ReelMultiProductLink reelMultiProductLink = null;
            String str6 = null;
            ArrayList arrayList2 = null;
            ProductCollectionLink productCollectionLink = null;
            ReelProductLink reelProductLink = null;
            ProfileShopLink profileShopLink = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("cta_link_icon".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    shoppingSwipeUpCTATextIcon = (ShoppingSwipeUpCTATextIcon) ShoppingSwipeUpCTATextIcon.A01.get(A1P);
                    if (shoppingSwipeUpCTATextIcon == null) {
                        shoppingSwipeUpCTATextIcon = ShoppingSwipeUpCTATextIcon.A05;
                    }
                } else if ("cta_link_tap_and_hold_context".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("cta_link_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("cta_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("effect_preview".equals(A0q)) {
                    effectPreview = C4HX.parseFromJson(c16l);
                } else if ("felix_deep_link".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("felix_video_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("has_instagram_shop_link".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("links".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AndroidLinkImpl parseFromJson = AbstractC87683va.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC111324zv.A00(1116).equals(A0q)) {
                    reelMultiProductLink = AE8.parseFromJson(c16l);
                } else if ("object_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(1183).equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AndroidLinkImpl parseFromJson2 = AbstractC87683va.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (AbstractC111324zv.A00(1184).equals(A0q)) {
                    productCollectionLink = IRF.parseFromJson(c16l);
                } else if ("product_link".equals(A0q)) {
                    reelProductLink = A1L.parseFromJson(c16l);
                } else if ("profile_shop_link".equals(A0q)) {
                    profileShopLink = IRI.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new ReelCTA(shoppingSwipeUpCTATextIcon, effectPreview, productCollectionLink, profileShopLink, reelMultiProductLink, reelProductLink, bool, str, str2, str3, str4, str5, str6, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ReelCTA reelCTA) {
        anonymousClass182.A0d();
        ShoppingSwipeUpCTATextIcon shoppingSwipeUpCTATextIcon = reelCTA.A00;
        if (shoppingSwipeUpCTATextIcon != null) {
            anonymousClass182.A0S("cta_link_icon", shoppingSwipeUpCTATextIcon.A00);
        }
        String str = reelCTA.A07;
        if (str != null) {
            anonymousClass182.A0S("cta_link_tap_and_hold_context", str);
        }
        String str2 = reelCTA.A08;
        if (str2 != null) {
            anonymousClass182.A0S("cta_link_text", str2);
        }
        String str3 = reelCTA.A09;
        if (str3 != null) {
            anonymousClass182.A0S("cta_type", str3);
        }
        EffectPreview effectPreview = reelCTA.A01;
        if (effectPreview != null) {
            anonymousClass182.A0r("effect_preview");
            C4HX.A00(anonymousClass182, effectPreview);
        }
        String str4 = reelCTA.A0A;
        if (str4 != null) {
            anonymousClass182.A0S("felix_deep_link", str4);
        }
        String str5 = reelCTA.A0B;
        if (str5 != null) {
            anonymousClass182.A0S("felix_video_id", str5);
        }
        Boolean bool = reelCTA.A06;
        if (bool != null) {
            anonymousClass182.A0T("has_instagram_shop_link", bool.booleanValue());
        }
        List<AndroidLink> list = reelCTA.A0D;
        if (list != null) {
            C16V.A03(anonymousClass182, "links");
            for (AndroidLink androidLink : list) {
                if (androidLink != null) {
                    AbstractC87683va.A00(anonymousClass182, androidLink.F53());
                }
            }
            anonymousClass182.A0Z();
        }
        ReelMultiProductLink reelMultiProductLink = reelCTA.A04;
        if (reelMultiProductLink != null) {
            anonymousClass182.A0r(AbstractC111324zv.A00(1116));
            AE8.A00(anonymousClass182, reelMultiProductLink);
        }
        String str6 = reelCTA.A0C;
        if (str6 != null) {
            anonymousClass182.A0S("object_id", str6);
        }
        List<AndroidLink> list2 = reelCTA.A0E;
        if (list2 != null) {
            C16V.A03(anonymousClass182, AbstractC111324zv.A00(1183));
            for (AndroidLink androidLink2 : list2) {
                if (androidLink2 != null) {
                    AbstractC87683va.A00(anonymousClass182, androidLink2.F53());
                }
            }
            anonymousClass182.A0Z();
        }
        ProductCollectionLink productCollectionLink = reelCTA.A02;
        if (productCollectionLink != null) {
            anonymousClass182.A0r(AbstractC111324zv.A00(1184));
            IRF.A00(anonymousClass182, productCollectionLink);
        }
        ReelProductLink reelProductLink = reelCTA.A05;
        if (reelProductLink != null) {
            anonymousClass182.A0r("product_link");
            anonymousClass182.A0d();
            ProductDetailsProductItemDict productDetailsProductItemDict = reelProductLink.A00;
            if (productDetailsProductItemDict != null) {
                anonymousClass182.A0r("product");
                AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
            }
            anonymousClass182.A0a();
        }
        ProfileShopLink profileShopLink = reelCTA.A03;
        if (profileShopLink != null) {
            anonymousClass182.A0r("profile_shop_link");
            IRI.A00(anonymousClass182, profileShopLink);
        }
        anonymousClass182.A0a();
    }
}
