package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.reels.netego.ShoppingNetegoInStoryIconType;
import com.instagram.model.reels.netego.ShoppingNetegoInStorySuggestionType;
import com.instagram.model.reels.netego.ShoppingNetegoType;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IR4 {
    public static C38041po parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C38813H7d c38813H7d = null;
            C38813H7d c38813H7d2 = null;
            C38813H7d c38813H7d3 = null;
            Integer num = null;
            ShoppingNetegoInStoryIconType shoppingNetegoInStoryIconType = null;
            Long l = null;
            Boolean bool = null;
            ShoppingNetegoType shoppingNetegoType = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            C38813H7d c38813H7d4 = null;
            ShoppingNetegoInStorySuggestionType shoppingNetegoInStorySuggestionType = null;
            C38813H7d c38813H7d5 = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("bottom_cta".equals(A0s)) {
                    c38813H7d = IR3.parseFromJson(c16l);
                } else if ("description_header".equals(A0s)) {
                    c38813H7d2 = IR3.parseFromJson(c16l);
                } else if ("description_text".equals(A0s)) {
                    c38813H7d3 = IR3.parseFromJson(c16l);
                } else if ("duration".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    shoppingNetegoInStoryIconType = (ShoppingNetegoInStoryIconType) ShoppingNetegoInStoryIconType.A01.get(A1P3);
                    if (shoppingNetegoInStoryIconType == null) {
                        shoppingNetegoInStoryIconType = ShoppingNetegoInStoryIconType.A06;
                    }
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("is_unit_dismissable".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("netego_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    shoppingNetegoType = (ShoppingNetegoType) ShoppingNetegoType.A01.get(A1P2);
                    if (shoppingNetegoType == null) {
                        shoppingNetegoType = ShoppingNetegoType.A07;
                    }
                } else if ("products".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38811H7b parseFromJson = AbstractC40717I2x.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("shops".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38812H7c parseFromJson2 = AbstractC40719I2z.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (AbstractC37300Gc1.A1L(A0s)) {
                    c38813H7d4 = IR3.parseFromJson(c16l);
                } else if ("suggestion_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    shoppingNetegoInStorySuggestionType = (ShoppingNetegoInStorySuggestionType) ShoppingNetegoInStorySuggestionType.A01.get(A1P);
                    if (shoppingNetegoInStorySuggestionType == null) {
                        shoppingNetegoInStorySuggestionType = ShoppingNetegoInStorySuggestionType.A05;
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    c38813H7d5 = IR3.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1X(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("ui_variant".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C38041po(c38813H7d, c38813H7d2, c38813H7d3, c38813H7d4, c38813H7d5, shoppingNetegoInStoryIconType, shoppingNetegoInStorySuggestionType, shoppingNetegoType, bool, num, l, str, str2, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38041po c38041po) {
        anonymousClass182.A0d();
        C38813H7d c38813H7d = c38041po.A00;
        if (c38813H7d != null) {
            anonymousClass182.A0r("bottom_cta");
            IR3.A00(anonymousClass182, c38813H7d);
        }
        C38813H7d c38813H7d2 = c38041po.A01;
        if (c38813H7d2 != null) {
            anonymousClass182.A0r("description_header");
            IR3.A00(anonymousClass182, c38813H7d2);
        }
        C38813H7d c38813H7d3 = c38041po.A02;
        if (c38813H7d3 != null) {
            anonymousClass182.A0r("description_text");
            IR3.A00(anonymousClass182, c38813H7d3);
        }
        Integer num = c38041po.A09;
        if (num != null) {
            anonymousClass182.A0Q("duration", num.intValue());
        }
        ShoppingNetegoInStoryIconType shoppingNetegoInStoryIconType = c38041po.A05;
        if (shoppingNetegoInStoryIconType != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, shoppingNetegoInStoryIconType.A00);
        }
        Long l = c38041po.A0A;
        if (l != null) {
            anonymousClass182.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, l.longValue());
        }
        Boolean bool = c38041po.A08;
        if (bool != null) {
            anonymousClass182.A0T("is_unit_dismissable", bool.booleanValue());
        }
        ShoppingNetegoType shoppingNetegoType = c38041po.A07;
        if (shoppingNetegoType != null) {
            anonymousClass182.A0S("netego_type", shoppingNetegoType.A00);
        }
        List list = c38041po.A0D;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "products", list);
            while (A0q.hasNext()) {
                C38811H7b c38811H7b = (C38811H7b) A0q.next();
                if (c38811H7b != null) {
                    anonymousClass182.A0d();
                    Long l2 = c38811H7b.A02;
                    if (l2 != null) {
                        anonymousClass182.A0R("ad_id", l2.longValue());
                    }
                    String str = c38811H7b.A03;
                    if (str != null) {
                        anonymousClass182.A0S("card_modifier_label", str);
                    }
                    C38813H7d c38813H7d4 = c38811H7b.A00;
                    if (c38813H7d4 != null) {
                        anonymousClass182.A0r("cta");
                        IR3.A00(anonymousClass182, c38813H7d4);
                    }
                    ProductDetailsProductItemDict productDetailsProductItemDict = c38811H7b.A01;
                    if (productDetailsProductItemDict != null) {
                        anonymousClass182.A0r("micro_product");
                        AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
                    }
                    String str2 = c38811H7b.A04;
                    if (str2 != null) {
                        anonymousClass182.A0S("product_context", str2);
                    }
                    List list2 = c38811H7b.A05;
                    if (list2 != null) {
                        Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "shoppable_media", list2);
                        while (A0q2.hasNext()) {
                            JLU jlu = (JLU) A0q2.next();
                            if (jlu != null) {
                                C38741H4f EyK = jlu.EyK(AbstractC37301Gc2.A08());
                                anonymousClass182.A0d();
                                String str3 = EyK.A01;
                                if (str3 != null) {
                                    anonymousClass182.A0S("highlighted_media_id", str3);
                                }
                                C38321qM c38321qM = EyK.A00;
                                if (c38321qM != null) {
                                    anonymousClass182.A0r("media");
                                    C38801rC c38801rC = C38321qM.A0h;
                                    C38801rC.A07(anonymousClass182, c38321qM);
                                }
                                anonymousClass182.A0a();
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        List list3 = c38041po.A0E;
        if (list3 != null) {
            Iterator A0q3 = AbstractC37301Gc2.A0q(anonymousClass182, "shops", list3);
            while (A0q3.hasNext()) {
                C38812H7c c38812H7c = (C38812H7c) A0q3.next();
                if (c38812H7c != null) {
                    anonymousClass182.A0d();
                    Long l3 = c38812H7c.A02;
                    if (l3 != null) {
                        anonymousClass182.A0R("ad_id", l3.longValue());
                    }
                    C38813H7d c38813H7d5 = c38812H7c.A00;
                    if (c38813H7d5 != null) {
                        anonymousClass182.A0r("cta");
                        IR3.A00(anonymousClass182, c38813H7d5);
                    }
                    User user = c38812H7c.A01;
                    if (user != null) {
                        AbstractC37300Gc1.A0x(anonymousClass182, user, "merchant");
                    }
                    String str4 = c38812H7c.A03;
                    if (str4 != null) {
                        anonymousClass182.A0S("merchant_details", str4);
                    }
                    List list4 = c38812H7c.A04;
                    if (list4 != null) {
                        Iterator A0q4 = AbstractC37301Gc2.A0q(anonymousClass182, "product_image_urls", list4);
                        while (A0q4.hasNext()) {
                            AbstractC167017dG.A1F(anonymousClass182, A0q4);
                        }
                        anonymousClass182.A0Z();
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        C38813H7d c38813H7d6 = c38041po.A03;
        if (c38813H7d6 != null) {
            anonymousClass182.A0r("subtitle");
            IR3.A00(anonymousClass182, c38813H7d6);
        }
        ShoppingNetegoInStorySuggestionType shoppingNetegoInStorySuggestionType = c38041po.A06;
        if (shoppingNetegoInStorySuggestionType != null) {
            anonymousClass182.A0S("suggestion_type", shoppingNetegoInStorySuggestionType.A00);
        }
        C38813H7d c38813H7d7 = c38041po.A04;
        if (c38813H7d7 != null) {
            anonymousClass182.A0r(DialogModule.KEY_TITLE);
            IR3.A00(anonymousClass182, c38813H7d7);
        }
        String str5 = c38041po.A0B;
        if (str5 != null) {
            anonymousClass182.A0S("tracking_token", str5);
        }
        String str6 = c38041po.A0C;
        if (str6 != null) {
            anonymousClass182.A0S("ui_variant", str6);
        }
        anonymousClass182.A0a();
    }
}
