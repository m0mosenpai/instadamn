package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IRW {
    public static C38611qr parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            Integer num = null;
            Boolean bool = null;
            SimpleImageUrl simpleImageUrl = null;
            String str9 = null;
            C39561sd c39561sd = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            ArrayList arrayList2 = null;
            String str17 = null;
            String str18 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("ad_images".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            SimpleImageUrl A00 = AbstractC222616c.A00(c16l);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("bottomsheet_variant".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("business_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("button_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("cta_destination".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("dismiss_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("extra_data_token".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("extra_logging_info".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("global_position".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("has_dismiss".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("icon_url".equals(A0s)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A0s)) {
                    c39561sd = AbstractC39551sc.parseFromJson(c16l);
                } else if ("merchant_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("netego_variant".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else if ("product_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str13 = null;
                    } else {
                        str13 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(511).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str14 = null;
                    } else {
                        str14 = c16l.A1P();
                    }
                } else if ("rating_and_review_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str15 = null;
                    } else {
                        str15 = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str16 = null;
                    } else {
                        str16 = c16l.A1P();
                    }
                } else if ("topic_images".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            SimpleImageUrl A002 = AbstractC222616c.A00(c16l);
                            if (A002 != null) {
                                arrayList2.add(A002);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (AbstractC37300Gc1.A1X(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str17 = null;
                    } else {
                        str17 = c16l.A1P();
                    }
                } else if ("view_state_item_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str18 = null;
                    } else {
                        str18 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C38611qr(c39561sd, simpleImageUrl, bool, num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38611qr c38611qr) {
        anonymousClass182.A0d();
        String str = c38611qr.A04;
        if (str != null) {
            anonymousClass182.A0S("action_type", str);
        }
        List list = c38611qr.A0M;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "ad_images", list);
            while (A0q.hasNext()) {
                ImageUrl imageUrl = (ImageUrl) A0q.next();
                if (imageUrl != null) {
                    AbstractC222616c.A01(anonymousClass182, imageUrl);
                }
            }
            anonymousClass182.A0Z();
        }
        String str2 = c38611qr.A05;
        if (str2 != null) {
            anonymousClass182.A0S("bottomsheet_variant", str2);
        }
        String str3 = c38611qr.A06;
        if (str3 != null) {
            anonymousClass182.A0S("business_name", str3);
        }
        String str4 = c38611qr.A07;
        if (str4 != null) {
            anonymousClass182.A0S("button_text", str4);
        }
        String str5 = c38611qr.A08;
        if (str5 != null) {
            anonymousClass182.A0S("cta_destination", str5);
        }
        String str6 = c38611qr.A09;
        if (str6 != null) {
            anonymousClass182.A0S("dismiss_text", str6);
        }
        String str7 = c38611qr.A0A;
        if (str7 != null) {
            anonymousClass182.A0S("extra_data_token", str7);
        }
        String str8 = c38611qr.A0B;
        if (str8 != null) {
            anonymousClass182.A0S("extra_logging_info", str8);
        }
        Integer num = c38611qr.A03;
        if (num != null) {
            anonymousClass182.A0Q("global_position", num.intValue());
        }
        Boolean bool = c38611qr.A02;
        if (bool != null) {
            anonymousClass182.A0T("has_dismiss", bool.booleanValue());
        }
        ImageUrl imageUrl2 = c38611qr.A01;
        if (imageUrl2 != null) {
            anonymousClass182.A0r("icon_url");
            AbstractC222616c.A01(anonymousClass182, imageUrl2);
        }
        AbstractC37301Gc2.A1D(anonymousClass182, c38611qr.A0C);
        InterfaceC39571se interfaceC39571se = c38611qr.A00;
        if (interfaceC39571se != null) {
            anonymousClass182.A0r("item_client_gap_rules");
            AbstractC39551sc.A00(anonymousClass182, interfaceC39571se.Eyq());
        }
        AbstractC37301Gc2.A1I(anonymousClass182, c38611qr.A0D);
        String str9 = c38611qr.A0E;
        if (str9 != null) {
            anonymousClass182.A0S(DialogModule.KEY_MESSAGE, str9);
        }
        String str10 = c38611qr.A0F;
        if (str10 != null) {
            anonymousClass182.A0S("netego_variant", str10);
        }
        String str11 = c38611qr.A0G;
        if (str11 != null) {
            anonymousClass182.A0S("product_id", str11);
        }
        String str12 = c38611qr.A0H;
        if (str12 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(511), str12);
        }
        String str13 = c38611qr.A0I;
        if (str13 != null) {
            anonymousClass182.A0S("rating_and_review_type", str13);
        }
        AbstractC37301Gc2.A1F(anonymousClass182, c38611qr.A0J);
        List list2 = c38611qr.A0N;
        if (list2 != null) {
            Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "topic_images", list2);
            while (A0q2.hasNext()) {
                ImageUrl imageUrl3 = (ImageUrl) A0q2.next();
                if (imageUrl3 != null) {
                    AbstractC222616c.A01(anonymousClass182, imageUrl3);
                }
            }
            anonymousClass182.A0Z();
        }
        String str14 = c38611qr.A0K;
        if (str14 != null) {
            anonymousClass182.A0S("tracking_token", str14);
        }
        String str15 = c38611qr.A0L;
        if (str15 != null) {
            anonymousClass182.A0S("view_state_item_type", str15);
        }
        anonymousClass182.A0a();
    }
}
