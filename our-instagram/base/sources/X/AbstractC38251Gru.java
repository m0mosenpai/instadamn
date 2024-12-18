package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.OverlayAdTapDestinationEnum;
import com.instagram.api.schemas.OverlayAdsFormatEnum;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.androidlink.AndroidLinkImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gru, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38251Gru {
    public static C38252Grv parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C38252Grv c38252Grv = new C38252Grv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                ArrayList arrayList = null;
                String str5 = null;
                ArrayList arrayList2 = null;
                String str6 = null;
                ArrayList arrayList3 = null;
                String str7 = null;
                ArrayList arrayList4 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                ArrayList arrayList5 = null;
                String str13 = null;
                ArrayList arrayList6 = null;
                String str14 = null;
                if ("ad_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c38252Grv.A0R = str2;
                } else if ("tracking_token".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    C14360o3.A0B(str3, 0);
                    c38252Grv.A0c = str3;
                } else if ("label".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str4 = c16l.A1P();
                    }
                    C14360o3.A0B(str4, 0);
                    c38252Grv.A0X = str4;
                } else if ("hide_reasons_v2".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C39321sD parseFromJson = AbstractC39311sC.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38252Grv.A0h = arrayList;
                } else if ("ad_title".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str5 = c16l.A1P();
                    }
                    C14360o3.A0B(str5, 0);
                    c38252Grv.A0T = str5;
                } else if ("ads_shopping_info".equals(A0q)) {
                    c38252Grv.A01 = AbstractC41239INf.parseFromJson(c16l);
                } else if ("cookies".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList2.add(A1P);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList2, 0);
                    c38252Grv.A0e = arrayList2;
                } else if ("client_gap_rules".equals(A0q)) {
                    c38252Grv.A0H = AbstractC38761r8.parseFromJson(c16l);
                } else if ("link_text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str6 = c16l.A1P();
                    }
                    c38252Grv.A0Y = str6;
                } else if ("android_links".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AndroidLinkImpl parseFromJson2 = AbstractC87683va.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList3, 0);
                    c38252Grv.A0d = arrayList3;
                } else if ("media_type".equals(A0q)) {
                    c38252Grv.A0O = Integer.valueOf(c16l.A1D());
                } else if ("media_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str7 = c16l.A1P();
                    }
                    c38252Grv.A0Z = str7;
                } else if (DialogModule.KEY_ITEMS.equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38321qM A00 = C38321qM.A00(c16l);
                            if (A00 != null) {
                                arrayList4.add(A00);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList4, 0);
                    c38252Grv.A0i = arrayList4;
                } else if ("interaction_timestamp".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str8 = c16l.A1P();
                    }
                    c38252Grv.A0W = str8;
                } else if ("media_background".equals(A0q)) {
                    c38252Grv.A0B = AbstractC102684k5.parseFromJson(c16l);
                } else if ("creative_transformations".equals(A0q)) {
                    c38252Grv.A05 = C69O.parseFromJson(c16l);
                } else if ("dominant_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str9 = c16l.A1P();
                    }
                    c38252Grv.A0V = str9;
                } else if ("overlay_subtitle".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str10 = c16l.A1P();
                    }
                    c38252Grv.A0S = str10;
                } else if ("music_info".equals(A0q)) {
                    c38252Grv.A0C = AbstractC41281IOw.parseFromJson(c16l);
                } else if ("reels_mid_scene_info".equals(A0q)) {
                    c38252Grv.A0F = AbstractC41367ISu.parseFromJson(c16l);
                } else if ("reels_multi_ads_info".equals(A0q)) {
                    c38252Grv.A0G = I9N.parseFromJson(c16l);
                } else if ("is_sensitive_vertical_ad".equals(A0q)) {
                    c38252Grv.A0M = Boolean.valueOf(c16l.A0d());
                } else if ("overlay_ad_host_media_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str11 = c16l.A1P();
                    }
                    c38252Grv.A0b = str11;
                } else if ("display_domain".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str12 = c16l.A1P();
                    }
                    c38252Grv.A0U = str12;
                } else if ("dynamic_ads_links".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            H39 parseFromJson3 = AbstractC41258INz.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList5.add(parseFromJson3);
                            }
                        }
                    }
                    c38252Grv.A0g = arrayList5;
                } else if ("dynamic_product_ad_display_option".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str13 = c16l.A1P();
                    }
                    DynamicProductAdDisplayOption dynamicProductAdDisplayOption = (DynamicProductAdDisplayOption) DynamicProductAdDisplayOption.A01.get(str13);
                    if (dynamicProductAdDisplayOption == null) {
                        dynamicProductAdDisplayOption = DynamicProductAdDisplayOption.A05;
                    }
                    c38252Grv.A06 = dynamicProductAdDisplayOption;
                } else if ("cta_info".equals(A0q)) {
                    c38252Grv.A03 = AbstractC38255Gry.parseFromJson(c16l);
                } else if ("enable_reels_end_scene".equals(A0q)) {
                    c38252Grv.A0J = Boolean.valueOf(c16l.A0d());
                } else if ("cop_render_output".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList6 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38781rA parseFromJson4 = AbstractC38771r9.parseFromJson(c16l);
                            if (parseFromJson4 != null) {
                                arrayList6.add(parseFromJson4);
                            }
                        }
                    }
                    c38252Grv.A0f = arrayList6;
                } else if ("view_state_item_type".equals(A0q)) {
                    c38252Grv.A0P = Integer.valueOf(c16l.A1D());
                } else if ("brs_threshold".equals(A0q)) {
                    c38252Grv.A0Q = Long.valueOf(c16l.A0y());
                } else if ("multi_ads_data".equals(A0q)) {
                    c38252Grv.A0D = AbstractC40551HyX.parseFromJson(c16l);
                } else if ("format_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str14 = c16l.A1P();
                    }
                    AdFormatType adFormatType = (AdFormatType) AdFormatType.A01.get(str14);
                    if (adFormatType == null) {
                        adFormatType = AdFormatType.A0A;
                    }
                    c38252Grv.A00 = adFormatType;
                } else if ("carousel_rendering_configuration".equals(A0q)) {
                    c38252Grv.A04 = AbstractC39803HlD.parseFromJson(c16l);
                } else if ("overlay_ads_format".equals(A0q)) {
                    c38252Grv.A0A = AbstractC40131Hqy.parseFromJson(c16l);
                } else if ("is_rev_share".equals(A0q)) {
                    c38252Grv.A0L = Boolean.valueOf(c16l.A0d());
                } else if ("afi_info".equals(A0q)) {
                    c38252Grv.A02 = AbstractC39261s3.parseFromJson(c16l);
                } else if ("gesture_to_action_info".equals(A0q)) {
                    c38252Grv.A07 = AbstractC37921GmI.parseFromJson(c16l);
                } else if ("on_impressions_control".equals(A0q)) {
                    c38252Grv.A09 = C51J.parseFromJson(c16l);
                } else if ("research_survey".equals(A0q)) {
                    c38252Grv.A0E = AbstractC40555Hyb.parseFromJson(c16l);
                } else if ("multi_ads_media_tap_destination".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c38252Grv.A0a = str;
                } else if ("should_fetch_preview_comments".equals(A0q)) {
                    c38252Grv.A0N = Boolean.valueOf(c16l.A0d());
                } else if ("enable_ads_follow_button".equals(A0q)) {
                    c38252Grv.A0I = Boolean.valueOf(c16l.A0d());
                } else if ("is_delayed_skip_ad".equals(A0q)) {
                    c38252Grv.A0K = Boolean.valueOf(c16l.A0d());
                } else if ("lead_gen_preclick_data".equals(A0q)) {
                    c38252Grv.A08 = AbstractC107994ti.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c38252Grv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38252Grv c38252Grv) {
        String str;
        anonymousClass182.A0d();
        String str2 = c38252Grv.A0R;
        if (str2 != null) {
            anonymousClass182.A0S("ad_id", str2);
        }
        String str3 = c38252Grv.A0c;
        if (str3 != null) {
            anonymousClass182.A0S("tracking_token", str3);
            String str4 = c38252Grv.A0X;
            if (str4 != null) {
                anonymousClass182.A0S("label", str4);
                if (c38252Grv.A0h != null) {
                    C16V.A03(anonymousClass182, "hide_reasons_v2");
                    List<C39321sD> list = c38252Grv.A0h;
                    if (list != null) {
                        for (C39321sD c39321sD : list) {
                            if (c39321sD != null) {
                                anonymousClass182.A0d();
                                String str5 = c39321sD.A00;
                                if (str5 != null) {
                                    anonymousClass182.A0S("reason", str5);
                                }
                                AbstractC37301Gc2.A1E(anonymousClass182, c39321sD.A01);
                                anonymousClass182.A0a();
                            }
                        }
                        anonymousClass182.A0Z();
                        String str6 = c38252Grv.A0T;
                        if (str6 != null) {
                            anonymousClass182.A0S("ad_title", str6);
                            if (c38252Grv.A01 != null) {
                                anonymousClass182.A0r("ads_shopping_info");
                                AbstractC41239INf.A00(anonymousClass182, c38252Grv.A01);
                            }
                            str = "cookies";
                            if (c38252Grv.A0e != null) {
                                C16V.A03(anonymousClass182, "cookies");
                                List list2 = c38252Grv.A0e;
                                if (list2 != null) {
                                    Iterator it = list2.iterator();
                                    while (it.hasNext()) {
                                        AbstractC167017dG.A1F(anonymousClass182, it);
                                    }
                                    anonymousClass182.A0Z();
                                    if (c38252Grv.A0H != null) {
                                        anonymousClass182.A0r("client_gap_rules");
                                        AbstractC38761r8.A00(anonymousClass182, c38252Grv.A0H);
                                    }
                                    String str7 = c38252Grv.A0Y;
                                    if (str7 != null) {
                                        anonymousClass182.A0S("link_text", str7);
                                    }
                                    C16V.A03(anonymousClass182, "android_links");
                                    for (AndroidLinkImpl androidLinkImpl : c38252Grv.A0d) {
                                        if (androidLinkImpl != null) {
                                            AbstractC87683va.A00(anonymousClass182, androidLinkImpl);
                                        }
                                    }
                                    anonymousClass182.A0Z();
                                    Integer num = c38252Grv.A0O;
                                    if (num != null) {
                                        anonymousClass182.A0Q("media_type", num.intValue());
                                    }
                                    String str8 = c38252Grv.A0Z;
                                    if (str8 != null) {
                                        anonymousClass182.A0S("media_id", str8);
                                    }
                                    c38252Grv.A02();
                                    C16V.A03(anonymousClass182, DialogModule.KEY_ITEMS);
                                    Iterator it2 = c38252Grv.A02().iterator();
                                    while (it2.hasNext()) {
                                        C38321qM A0i = AbstractC31172DnG.A0i(it2);
                                        if (A0i != null) {
                                            C38801rC c38801rC = C38321qM.A0h;
                                            C38801rC.A07(anonymousClass182, A0i);
                                        }
                                    }
                                    anonymousClass182.A0Z();
                                    String str9 = c38252Grv.A0W;
                                    if (str9 != null) {
                                        anonymousClass182.A0S("interaction_timestamp", str9);
                                    }
                                    if (c38252Grv.A0B != null) {
                                        anonymousClass182.A0r("media_background");
                                        AbstractC102684k5.A00(anonymousClass182, c38252Grv.A0B);
                                    }
                                    if (c38252Grv.A05 != null) {
                                        anonymousClass182.A0r("creative_transformations");
                                        C69O.A00(anonymousClass182, c38252Grv.A05);
                                    }
                                    String str10 = c38252Grv.A0V;
                                    if (str10 != null) {
                                        anonymousClass182.A0S("dominant_color", str10);
                                    }
                                    String str11 = c38252Grv.A0S;
                                    if (str11 != null) {
                                        anonymousClass182.A0S("overlay_subtitle", str11);
                                    }
                                    if (c38252Grv.A0C != null) {
                                        anonymousClass182.A0r("music_info");
                                        AbstractC41281IOw.A00(anonymousClass182, c38252Grv.A0C);
                                    }
                                    if (c38252Grv.A0F != null) {
                                        anonymousClass182.A0r("reels_mid_scene_info");
                                        AbstractC41367ISu.A00(anonymousClass182, c38252Grv.A0F);
                                    }
                                    if (c38252Grv.A0G != null) {
                                        anonymousClass182.A0r("reels_multi_ads_info");
                                        C5Fl c5Fl = c38252Grv.A0G;
                                        anonymousClass182.A0d();
                                        String str12 = c5Fl.A00;
                                        if (str12 != null) {
                                            anonymousClass182.A0S("ad_info_text", str12);
                                        }
                                        anonymousClass182.A0a();
                                    }
                                    Boolean bool = c38252Grv.A0M;
                                    if (bool != null) {
                                        anonymousClass182.A0T("is_sensitive_vertical_ad", bool.booleanValue());
                                    }
                                    String str13 = c38252Grv.A0b;
                                    if (str13 != null) {
                                        anonymousClass182.A0S("overlay_ad_host_media_id", str13);
                                    }
                                    String str14 = c38252Grv.A0U;
                                    if (str14 != null) {
                                        anonymousClass182.A0S("display_domain", str14);
                                    }
                                    if (c38252Grv.A0g != null) {
                                        C16V.A03(anonymousClass182, "dynamic_ads_links");
                                        for (H39 h39 : c38252Grv.A0g) {
                                            if (h39 != null) {
                                                AbstractC41258INz.A00(anonymousClass182, h39);
                                            }
                                        }
                                        anonymousClass182.A0Z();
                                    }
                                    DynamicProductAdDisplayOption dynamicProductAdDisplayOption = c38252Grv.A06;
                                    if (dynamicProductAdDisplayOption != null) {
                                        anonymousClass182.A0S("dynamic_product_ad_display_option", dynamicProductAdDisplayOption.A00);
                                    }
                                    if (c38252Grv.A03 != null) {
                                        anonymousClass182.A0r("cta_info");
                                        AbstractC38255Gry.A00(anonymousClass182, c38252Grv.A03);
                                    }
                                    Boolean bool2 = c38252Grv.A0J;
                                    if (bool2 != null) {
                                        anonymousClass182.A0T("enable_reels_end_scene", bool2.booleanValue());
                                    }
                                    if (c38252Grv.A0f != null) {
                                        C16V.A03(anonymousClass182, "cop_render_output");
                                        for (C38781rA c38781rA : c38252Grv.A0f) {
                                            if (c38781rA != null) {
                                                AbstractC38771r9.A00(anonymousClass182, c38781rA);
                                            }
                                        }
                                        anonymousClass182.A0Z();
                                    }
                                    Integer num2 = c38252Grv.A0P;
                                    if (num2 != null) {
                                        anonymousClass182.A0Q("view_state_item_type", num2.intValue());
                                    }
                                    Long l = c38252Grv.A0Q;
                                    if (l != null) {
                                        anonymousClass182.A0R("brs_threshold", l.longValue());
                                    }
                                    if (c38252Grv.A0D != null) {
                                        anonymousClass182.A0r("multi_ads_data");
                                        IEG ieg = c38252Grv.A0D;
                                        anonymousClass182.A0d();
                                        C16V.A03(anonymousClass182, "multi_ads_media_items");
                                        for (C38252Grv c38252Grv2 : ieg.A01) {
                                            if (c38252Grv2 != null) {
                                                A00(anonymousClass182, c38252Grv2);
                                            }
                                        }
                                        anonymousClass182.A0Z();
                                        if (ieg.A00 != null) {
                                            anonymousClass182.A0r("intent_aware_ads_info");
                                            ION.A00(anonymousClass182, ieg.A00);
                                        }
                                        anonymousClass182.A0a();
                                    }
                                    AdFormatType adFormatType = c38252Grv.A00;
                                    if (adFormatType != null) {
                                        anonymousClass182.A0S("format_type", adFormatType.A00);
                                    }
                                    if (c38252Grv.A04 != null) {
                                        anonymousClass182.A0r("carousel_rendering_configuration");
                                        C87883vw c87883vw = c38252Grv.A04;
                                        anonymousClass182.A0d();
                                        Integer num3 = c87883vw.A01;
                                        if (num3 != null) {
                                            anonymousClass182.A0Q("duration_in_ms", num3.intValue());
                                        }
                                        String str15 = c87883vw.A03;
                                        if (str15 != null) {
                                            anonymousClass182.A0S("indicator_style", str15);
                                        }
                                        Boolean bool3 = c87883vw.A00;
                                        if (bool3 != null) {
                                            anonymousClass182.A0T("should_enable_autoadvance", bool3.booleanValue());
                                        }
                                        List list3 = c87883vw.A05;
                                        if (list3 != null) {
                                            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "showcase_links", list3);
                                            while (A0q.hasNext()) {
                                                AndroidLink androidLink = (AndroidLink) A0q.next();
                                                if (androidLink != null) {
                                                    AbstractC87683va.A00(anonymousClass182, androidLink.F53());
                                                }
                                            }
                                            anonymousClass182.A0Z();
                                        }
                                        String str16 = c87883vw.A04;
                                        if (str16 != null) {
                                            anonymousClass182.A0S("thumbnail_position", str16);
                                        }
                                        Integer num4 = c87883vw.A02;
                                        if (num4 != null) {
                                            anonymousClass182.A0Q("thumbnail_width", num4.intValue());
                                        }
                                        anonymousClass182.A0a();
                                    }
                                    if (c38252Grv.A0A != null) {
                                        anonymousClass182.A0r("overlay_ads_format");
                                        C5G3 c5g3 = c38252Grv.A0A;
                                        anonymousClass182.A0d();
                                        Boolean bool4 = c5g3.A05;
                                        if (bool4 != null) {
                                            anonymousClass182.A0T("apply_blur", bool4.booleanValue());
                                        }
                                        Boolean bool5 = c5g3.A06;
                                        if (bool5 != null) {
                                            anonymousClass182.A0T("apply_full_bleed_thumbnail", bool5.booleanValue());
                                        }
                                        Boolean bool6 = c5g3.A07;
                                        if (bool6 != null) {
                                            anonymousClass182.A0T("apply_partial_width", bool6.booleanValue());
                                        }
                                        Boolean bool7 = c5g3.A08;
                                        if (bool7 != null) {
                                            anonymousClass182.A0T("apply_vertical_safezone", bool7.booleanValue());
                                        }
                                        Integer num5 = c5g3.A0F;
                                        if (num5 != null) {
                                            anonymousClass182.A0Q("delay_time_ms", num5.intValue());
                                        }
                                        InterfaceC31125Dm8 interfaceC31125Dm8 = c5g3.A02;
                                        if (interfaceC31125Dm8 != null) {
                                            anonymousClass182.A0r("description_text_style");
                                            AbstractC41264IOf.A00(anonymousClass182, interfaceC31125Dm8.Exq());
                                        }
                                        Boolean bool8 = c5g3.A09;
                                        if (bool8 != null) {
                                            anonymousClass182.A0T("enable_long_press", bool8.booleanValue());
                                        }
                                        Boolean bool9 = c5g3.A0A;
                                        if (bool9 != null) {
                                            anonymousClass182.A0T("enable_swipe_left_to_dismiss", bool9.booleanValue());
                                        }
                                        String str17 = c5g3.A0K;
                                        if (str17 != null) {
                                            anonymousClass182.A0S("end_color", str17);
                                        }
                                        OverlayAdsFormatEnum overlayAdsFormatEnum = c5g3.A01;
                                        if (overlayAdsFormatEnum != null) {
                                            anonymousClass182.A0S("format", overlayAdsFormatEnum.A00);
                                        }
                                        Integer num6 = c5g3.A0G;
                                        if (num6 != null) {
                                            anonymousClass182.A0Q("highlight_time_ms", num6.intValue());
                                        }
                                        String str18 = c5g3.A0L;
                                        if (str18 != null) {
                                            anonymousClass182.A0S("initial_color", str18);
                                        }
                                        OverlayAdTapDestinationEnum overlayAdTapDestinationEnum = c5g3.A00;
                                        if (overlayAdTapDestinationEnum != null) {
                                            anonymousClass182.A0S("overlay_ad_tap_destination", overlayAdTapDestinationEnum.A00);
                                        }
                                        Integer num7 = c5g3.A0H;
                                        if (num7 != null) {
                                            anonymousClass182.A0Q("overlay_ads_height", num7.intValue());
                                        }
                                        Boolean bool10 = c5g3.A0B;
                                        if (bool10 != null) {
                                            anonymousClass182.A0T("should_discard_overlay_ads", bool10.booleanValue());
                                        }
                                        Boolean bool11 = c5g3.A0C;
                                        if (bool11 != null) {
                                            anonymousClass182.A0T("show_border", bool11.booleanValue());
                                        }
                                        Boolean bool12 = c5g3.A0D;
                                        if (bool12 != null) {
                                            anonymousClass182.A0T("show_dismiss_button", bool12.booleanValue());
                                        }
                                        Boolean bool13 = c5g3.A0E;
                                        if (bool13 != null) {
                                            anonymousClass182.A0T("show_tap_feedback", bool13.booleanValue());
                                        }
                                        InterfaceC31125Dm8 interfaceC31125Dm82 = c5g3.A03;
                                        if (interfaceC31125Dm82 != null) {
                                            anonymousClass182.A0r("sponsored_text_style");
                                            AbstractC41264IOf.A00(anonymousClass182, interfaceC31125Dm82.Exq());
                                        }
                                        Integer num8 = c5g3.A0I;
                                        if (num8 != null) {
                                            anonymousClass182.A0Q("text_spacing", num8.intValue());
                                        }
                                        Integer num9 = c5g3.A0J;
                                        if (num9 != null) {
                                            anonymousClass182.A0Q("thumbnail_size", num9.intValue());
                                        }
                                        InterfaceC31125Dm8 interfaceC31125Dm83 = c5g3.A04;
                                        if (interfaceC31125Dm83 != null) {
                                            anonymousClass182.A0r("title_text_style");
                                            AbstractC41264IOf.A00(anonymousClass182, interfaceC31125Dm83.Exq());
                                        }
                                        anonymousClass182.A0a();
                                    }
                                    Boolean bool14 = c38252Grv.A0L;
                                    if (bool14 != null) {
                                        anonymousClass182.A0T("is_rev_share", bool14.booleanValue());
                                    }
                                    if (c38252Grv.A02 != null) {
                                        anonymousClass182.A0r("afi_info");
                                        AbstractC39261s3.A00(anonymousClass182, c38252Grv.A02);
                                    }
                                    if (c38252Grv.A07 != null) {
                                        anonymousClass182.A0r("gesture_to_action_info");
                                        C114595Ff c114595Ff = c38252Grv.A07;
                                        anonymousClass182.A0d();
                                        Boolean bool15 = c114595Ff.A00;
                                        if (bool15 != null) {
                                            anonymousClass182.A0T("enable_reels_ads_nudge", bool15.booleanValue());
                                        }
                                        anonymousClass182.A0a();
                                    }
                                    if (c38252Grv.A09 != null) {
                                        anonymousClass182.A0r("on_impressions_control");
                                        C51J.A00(anonymousClass182, c38252Grv.A09);
                                    }
                                    if (c38252Grv.A0E != null) {
                                        anonymousClass182.A0r("research_survey");
                                        IKS iks = c38252Grv.A0E;
                                        anonymousClass182.A0d();
                                        String str19 = iks.A04;
                                        if (str19 != null) {
                                            anonymousClass182.A0S("ad_id", str19);
                                        }
                                        Boolean bool16 = iks.A01;
                                        if (bool16 != null) {
                                            anonymousClass182.A0T("is_demo", bool16.booleanValue());
                                        }
                                        if (iks.A00 != null) {
                                            anonymousClass182.A0r("learn_more");
                                            IGM igm = iks.A00;
                                            anonymousClass182.A0d();
                                            anonymousClass182.A0S("body", igm.A01);
                                            if (igm.A00 != null) {
                                                anonymousClass182.A0r("call_to_action");
                                                IEI iei = igm.A00;
                                                anonymousClass182.A0d();
                                                anonymousClass182.A0S(DialogModule.KEY_TITLE, iei.A00);
                                                anonymousClass182.A0S("url", iei.A01);
                                                anonymousClass182.A0a();
                                            }
                                            anonymousClass182.A0S(DialogModule.KEY_TITLE, igm.A02);
                                            anonymousClass182.A0a();
                                        }
                                        String str20 = iks.A05;
                                        if (str20 != null) {
                                            anonymousClass182.A0S("primer_message", str20);
                                        }
                                        if (iks.A09 != null) {
                                            C16V.A03(anonymousClass182, "questions");
                                            for (C41120IIl c41120IIl : iks.A09) {
                                                if (c41120IIl != null) {
                                                    anonymousClass182.A0d();
                                                    if (c41120IIl.A04 != null) {
                                                        C16V.A03(anonymousClass182, "answers");
                                                        for (C41095IHm c41095IHm : c41120IIl.A04) {
                                                            if (c41095IHm != null) {
                                                                anonymousClass182.A0d();
                                                                Boolean bool17 = c41095IHm.A00;
                                                                if (bool17 != null) {
                                                                    anonymousClass182.A0T("is_exclusive", bool17.booleanValue());
                                                                }
                                                                Integer num10 = c41095IHm.A01;
                                                                if (num10 != null) {
                                                                    anonymousClass182.A0Q("num_responders", num10.intValue());
                                                                }
                                                                anonymousClass182.A0S("text", c41095IHm.A02);
                                                                anonymousClass182.A0S(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, c41095IHm.A03);
                                                                anonymousClass182.A0a();
                                                            }
                                                        }
                                                        anonymousClass182.A0Z();
                                                    }
                                                    anonymousClass182.A0S("qid", c41120IIl.A01);
                                                    anonymousClass182.A0S(DialogModule.KEY_TITLE, c41120IIl.A02);
                                                    Integer num11 = c41120IIl.A00;
                                                    if (num11 != null) {
                                                        anonymousClass182.A0Q("total_resonders", num11.intValue());
                                                    }
                                                    anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c41120IIl.A03);
                                                    anonymousClass182.A0a();
                                                }
                                            }
                                            anonymousClass182.A0Z();
                                        }
                                        Boolean bool18 = iks.A02;
                                        if (bool18 != null) {
                                            anonymousClass182.A0T("show_primer", bool18.booleanValue());
                                        }
                                        Boolean bool19 = iks.A03;
                                        if (bool19 != null) {
                                            anonymousClass182.A0T("show_results", bool19.booleanValue());
                                        }
                                        anonymousClass182.A0S("survey_id", iks.A06);
                                        anonymousClass182.A0S("survey_type", iks.A07);
                                        String str21 = iks.A08;
                                        if (str21 != null) {
                                            anonymousClass182.A0S("tracking_token", str21);
                                        }
                                        anonymousClass182.A0a();
                                    }
                                    String str22 = c38252Grv.A0a;
                                    if (str22 != null) {
                                        anonymousClass182.A0S("multi_ads_media_tap_destination", str22);
                                    }
                                    Boolean bool20 = c38252Grv.A0N;
                                    if (bool20 != null) {
                                        anonymousClass182.A0T("should_fetch_preview_comments", bool20.booleanValue());
                                    }
                                    Boolean bool21 = c38252Grv.A0I;
                                    if (bool21 != null) {
                                        anonymousClass182.A0T("enable_ads_follow_button", bool21.booleanValue());
                                    }
                                    Boolean bool22 = c38252Grv.A0K;
                                    if (bool22 != null) {
                                        anonymousClass182.A0T("is_delayed_skip_ad", bool22.booleanValue());
                                    }
                                    if (c38252Grv.A08 != null) {
                                        anonymousClass182.A0r("lead_gen_preclick_data");
                                        AbstractC107994ti.A00(anonymousClass182, c38252Grv.A08);
                                    }
                                    anonymousClass182.A0a();
                                    return;
                                }
                            }
                        } else {
                            str = "adTitle";
                        }
                    }
                }
                str = "hideReasons";
            } else {
                str = "label";
            }
        } else {
            str = "trackingToken";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
