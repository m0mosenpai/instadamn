package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.CallAdsInfoDict;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData;
import com.instagram.api.schemas.IGAdProfileProductTabDict;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.IGCTATextVariant;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IGPostTriggerExperience;
import com.instagram.api.schemas.IGRFSurveyInfoDict;
import com.instagram.api.schemas.PostTriggerExperienceEligibleTrigger;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.mediatype.CTAStyle;
import com.instagram.sponsored.signals.model.AdsCTATrustInfoIntf;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;
import com.instagram.sponsored.signals.model.AdsTextTrustInfoIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gda, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37394Gda {
    public static Map A00(InterfaceC39541sb interfaceC39541sb) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        TreeUpdaterJNI treeUpdaterJNI7;
        TreeUpdaterJNI treeUpdaterJNI8;
        TreeUpdaterJNI treeUpdaterJNI9;
        TreeUpdaterJNI treeUpdaterJNI10;
        TreeUpdaterJNI treeUpdaterJNI11;
        ArrayList arrayList;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI12;
        TreeUpdaterJNI treeUpdaterJNI13;
        TreeUpdaterJNI treeUpdaterJNI14;
        TreeUpdaterJNI treeUpdaterJNI15;
        TreeUpdaterJNI treeUpdaterJNI16;
        TreeUpdaterJNI treeUpdaterJNI17;
        ArrayList arrayList3;
        ArrayList arrayList4;
        TreeUpdaterJNI treeUpdaterJNI18;
        TreeUpdaterJNI treeUpdaterJNI19;
        TreeUpdaterJNI treeUpdaterJNI20;
        TreeUpdaterJNI treeUpdaterJNI21;
        TreeUpdaterJNI treeUpdaterJNI22;
        TreeUpdaterJNI treeUpdaterJNI23;
        TreeUpdaterJNI treeUpdaterJNI24;
        TreeUpdaterJNI treeUpdaterJNI25;
        TreeUpdaterJNI treeUpdaterJNI26;
        TreeUpdaterJNI treeUpdaterJNI27;
        TreeUpdaterJNI treeUpdaterJNI28;
        TreeUpdaterJNI treeUpdaterJNI29;
        TreeUpdaterJNI treeUpdaterJNI30;
        TreeUpdaterJNI treeUpdaterJNI31;
        TreeUpdaterJNI treeUpdaterJNI32;
        TreeUpdaterJNI treeUpdaterJNI33;
        ArrayList arrayList5;
        TreeUpdaterJNI treeUpdaterJNI34;
        String str;
        TreeUpdaterJNI treeUpdaterJNI35;
        String str2;
        ArrayList arrayList6;
        TreeUpdaterJNI treeUpdaterJNI36;
        TreeUpdaterJNI treeUpdaterJNI37;
        TreeUpdaterJNI treeUpdaterJNI38;
        TreeUpdaterJNI treeUpdaterJNI39;
        String str3;
        TreeUpdaterJNI treeUpdaterJNI40;
        TreeUpdaterJNI treeUpdaterJNI41;
        TreeUpdaterJNI treeUpdaterJNI42;
        ArrayList arrayList7;
        TreeUpdaterJNI treeUpdaterJNI43;
        ArrayList arrayList8;
        TreeUpdaterJNI treeUpdaterJNI44;
        TreeUpdaterJNI treeUpdaterJNI45;
        String str4;
        TreeUpdaterJNI treeUpdaterJNI46;
        TreeUpdaterJNI treeUpdaterJNI47;
        TreeUpdaterJNI treeUpdaterJNI48;
        TreeUpdaterJNI treeUpdaterJNI49;
        TreeUpdaterJNI treeUpdaterJNI50;
        TreeUpdaterJNI treeUpdaterJNI51;
        TreeUpdaterJNI treeUpdaterJNI52;
        TreeUpdaterJNI treeUpdaterJNI53;
        TreeUpdaterJNI treeUpdaterJNI54;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC39541sb.AXn() != null) {
            A1I.put("about_ad_params", interfaceC39541sb.AXn());
        }
        if (interfaceC39541sb.AYx() != null) {
            A1I.put("actor_id", interfaceC39541sb.AYx());
        }
        if (interfaceC39541sb.AZ3() != null) {
            A1I.put("ad_action", interfaceC39541sb.AZ3());
        }
        TreeUpdaterJNI treeUpdaterJNI55 = null;
        if (interfaceC39541sb.AZB() != null) {
            InterfaceC104764ng AZB = interfaceC39541sb.AZB();
            if (AZB != null) {
                treeUpdaterJNI54 = AZB.F7o();
            } else {
                treeUpdaterJNI54 = null;
            }
            A1I.put("ad_disclaimer_info", treeUpdaterJNI54);
        }
        if (interfaceC39541sb.AZC() != null) {
            A1I.put(AbstractC111324zv.A00(715), interfaceC39541sb.AZC());
        }
        if (interfaceC39541sb.AZE() != null) {
            A1I.put("ad_id", interfaceC39541sb.AZE());
        }
        if (interfaceC39541sb.AZL() != null) {
            A1I.put("ad_objective_type", interfaceC39541sb.AZL());
        }
        if (interfaceC39541sb.AZO() != null) {
            InterfaceC37891pS AZO = interfaceC39541sb.AZO();
            if (AZO != null) {
                treeUpdaterJNI53 = AZO.F7o();
            } else {
                treeUpdaterJNI53 = null;
            }
            A1I.put("ad_pod_rules", treeUpdaterJNI53);
        }
        if (interfaceC39541sb.AZQ() != null) {
            InterfaceC87713vf AZQ = interfaceC39541sb.AZQ();
            if (AZQ != null) {
                treeUpdaterJNI52 = AZQ.F7o();
            } else {
                treeUpdaterJNI52 = null;
            }
            A1I.put("ad_tag", treeUpdaterJNI52);
        }
        if (interfaceC39541sb.AZR() != null) {
            A1I.put("ad_title", interfaceC39541sb.AZR());
        }
        if (interfaceC39541sb.Aa3() != null) {
            InterfaceC37891pS Aa3 = interfaceC39541sb.Aa3();
            if (Aa3 != null) {
                treeUpdaterJNI51 = Aa3.F7o();
            } else {
                treeUpdaterJNI51 = null;
            }
            A1I.put(AbstractC111324zv.A00(1901), treeUpdaterJNI51);
        }
        if (interfaceC39541sb.Aa6() != null) {
            AdsIAWRatingInfoIntf Aa6 = interfaceC39541sb.Aa6();
            if (Aa6 != null) {
                treeUpdaterJNI50 = Aa6.F7o();
            } else {
                treeUpdaterJNI50 = null;
            }
            A1I.put(AbstractC111324zv.A00(719), treeUpdaterJNI50);
        }
        if (interfaceC39541sb.AaD() != null) {
            AdsRatingInfoIntf AaD = interfaceC39541sb.AaD();
            if (AaD != null) {
                treeUpdaterJNI49 = AaD.F7o();
            } else {
                treeUpdaterJNI49 = null;
            }
            A1I.put(AbstractC111324zv.A00(720), treeUpdaterJNI49);
        }
        if (interfaceC39541sb.AaF() != null) {
            InterfaceC104774nh AaF = interfaceC39541sb.AaF();
            if (AaF != null) {
                treeUpdaterJNI48 = AaF.F7o();
            } else {
                treeUpdaterJNI48 = null;
            }
            A1I.put("ads_shopping_info", treeUpdaterJNI48);
        }
        if (interfaceC39541sb.AaI() != null) {
            A1I.put("adtaxon_i18n_top1_l7_prediction", interfaceC39541sb.AaI());
        }
        if (interfaceC39541sb.AaR() != null) {
            InterfaceC39271s5 AaR = interfaceC39541sb.AaR();
            if (AaR != null) {
                treeUpdaterJNI47 = AaR.F7o();
            } else {
                treeUpdaterJNI47 = null;
            }
            A1I.put("afi_info", treeUpdaterJNI47);
        }
        if (interfaceC39541sb.AcH() != null) {
            A1I.put("app_id", interfaceC39541sb.AcH());
        }
        if (interfaceC39541sb.AcT() != null) {
            AppstoreMetadataDict AcT = interfaceC39541sb.AcT();
            if (AcT != null) {
                treeUpdaterJNI46 = AcT.F7o();
            } else {
                treeUpdaterJNI46 = null;
            }
            A1I.put("appstore_metadata", treeUpdaterJNI46);
        }
        if (interfaceC39541sb.Afo() != null) {
            BrandedContentAdsPaidPartnershipLabelRemovalOption Afo = interfaceC39541sb.Afo();
            if (Afo != null) {
                str4 = Afo.A00;
            } else {
                str4 = null;
            }
            A1I.put("bca_ppl_removal_option", str4);
        }
        C914346k AgT = interfaceC39541sb.AgT();
        if (AgT != null) {
            A1I.put(AbstractC111324zv.A00(1988), AgT.A00());
        }
        if (interfaceC39541sb.AiV() != null) {
            A1I.put("brs_applied_content_blocklists", interfaceC39541sb.AiV());
        }
        if (interfaceC39541sb.AiY() != null) {
            A1I.put("brs_threshold", interfaceC39541sb.AiY());
        }
        if (interfaceC39541sb.AjP() != null) {
            InterfaceC104784ni AjP = interfaceC39541sb.AjP();
            if (AjP != null) {
                treeUpdaterJNI45 = AjP.F7o();
            } else {
                treeUpdaterJNI45 = null;
            }
            A1I.put("buyer_incentive_feed", treeUpdaterJNI45);
        }
        if (interfaceC39541sb.Ajk() != null) {
            CallAdsInfoDict Ajk = interfaceC39541sb.Ajk();
            if (Ajk != null) {
                treeUpdaterJNI44 = Ajk.F7o();
            } else {
                treeUpdaterJNI44 = null;
            }
            A1I.put("call_ads_info", treeUpdaterJNI44);
        }
        if (interfaceC39541sb.AkD() != null) {
            A1I.put("campaign_id", interfaceC39541sb.AkD());
        }
        if (interfaceC39541sb.Ame() != null) {
            List<InterfaceC38791rB> Ame = interfaceC39541sb.Ame();
            if (Ame != null) {
                arrayList8 = AbstractC166987dD.A1E();
                for (InterfaceC38791rB interfaceC38791rB : Ame) {
                    if (interfaceC38791rB != null) {
                        arrayList8.add(interfaceC38791rB.F7o());
                    }
                }
            } else {
                arrayList8 = null;
            }
            A1I.put(AbstractC111324zv.A00(2037), arrayList8);
        }
        if (interfaceC39541sb.Ann() != null) {
            InterfaceC39281s8 Ann = interfaceC39541sb.Ann();
            if (Ann != null) {
                treeUpdaterJNI43 = Ann.F7o();
            } else {
                treeUpdaterJNI43 = null;
            }
            A1I.put("click_to_direct_lead_gen_ads_info", treeUpdaterJNI43);
        }
        if (interfaceC39541sb.ArY() != null) {
            A1I.put("contextual_label_info", interfaceC39541sb.ArY());
        }
        if (interfaceC39541sb.getCookies() != null) {
            A1I.put("cookies", interfaceC39541sb.getCookies());
        }
        if (interfaceC39541sb.Ark() != null) {
            List<InterfaceC38791rB> Ark = interfaceC39541sb.Ark();
            if (Ark != null) {
                arrayList7 = AbstractC166987dD.A1E();
                for (InterfaceC38791rB interfaceC38791rB2 : Ark) {
                    if (interfaceC38791rB2 != null) {
                        arrayList7.add(interfaceC38791rB2.F7o());
                    }
                }
            } else {
                arrayList7 = null;
            }
            A1I.put("cop_render_output", arrayList7);
        }
        if (interfaceC39541sb.Asj() != null) {
            A1I.put("creation_source", interfaceC39541sb.Asj());
        }
        if (interfaceC39541sb.Asn() != null) {
            InterfaceC104794nk Asn = interfaceC39541sb.Asn();
            if (Asn != null) {
                treeUpdaterJNI42 = Asn.F7o();
            } else {
                treeUpdaterJNI42 = null;
            }
            A1I.put("creative_transformations", treeUpdaterJNI42);
        }
        if (interfaceC39541sb.Asp() != null) {
            InterfaceC104804nl Asp = interfaceC39541sb.Asp();
            if (Asp != null) {
                treeUpdaterJNI41 = Asp.F7o();
            } else {
                treeUpdaterJNI41 = null;
            }
            A1I.put("creative_transformations_v2", treeUpdaterJNI41);
        }
        if (interfaceC39541sb.Atg() != null) {
            InterfaceC104814nm Atg = interfaceC39541sb.Atg();
            if (Atg != null) {
                treeUpdaterJNI40 = Atg.F7o();
            } else {
                treeUpdaterJNI40 = null;
            }
            A1I.put("cta_info", treeUpdaterJNI40);
        }
        if (interfaceC39541sb.Atm() != null) {
            CTAStyle Atm = interfaceC39541sb.Atm();
            if (Atm != null) {
                str3 = Atm.A00;
            } else {
                str3 = null;
            }
            A1I.put("cta_style", str3);
        }
        if (interfaceC39541sb.Atv() != null) {
            InterfaceC87573vP Atv = interfaceC39541sb.Atv();
            if (Atv != null) {
                treeUpdaterJNI39 = Atv.F7o();
            } else {
                treeUpdaterJNI39 = null;
            }
            A1I.put("ctd_ads_info", treeUpdaterJNI39);
        }
        if (interfaceC39541sb.Aty() != null) {
            InterfaceC39301sB Aty = interfaceC39541sb.Aty();
            if (Aty != null) {
                treeUpdaterJNI38 = Aty.F7o();
            } else {
                treeUpdaterJNI38 = null;
            }
            A1I.put("ctj_ads_info", treeUpdaterJNI38);
        }
        if (interfaceC39541sb.Au0() != null) {
            IGCTMessagingAdsInfoDictIntf Au0 = interfaceC39541sb.Au0();
            if (Au0 != null) {
                treeUpdaterJNI37 = Au0.F7o();
            } else {
                treeUpdaterJNI37 = null;
            }
            A1I.put("ctmessaging_ads_info", treeUpdaterJNI37);
        }
        if (interfaceC39541sb.Au1() != null) {
            InterfaceC104824nn Au1 = interfaceC39541sb.Au1();
            if (Au1 != null) {
                treeUpdaterJNI36 = Au1.F7o();
            } else {
                treeUpdaterJNI36 = null;
            }
            A1I.put(AbstractC111324zv.A00(2225), treeUpdaterJNI36);
        }
        if (interfaceC39541sb.Axd() != null) {
            A1I.put("direct_share", interfaceC39541sb.Axd());
        }
        if (interfaceC39541sb.AyU() != null) {
            A1I.put("display_domain", interfaceC39541sb.AyU());
        }
        if (interfaceC39541sb.AyV() != null) {
            A1I.put("display_fb_page_name", interfaceC39541sb.AyV());
        }
        if (interfaceC39541sb.Ayi() != null) {
            A1I.put("display_viewability_eligible", interfaceC39541sb.Ayi());
        }
        if (interfaceC39541sb.getDominantColor() != null) {
            A1I.put("dominant_color", interfaceC39541sb.getDominantColor());
        }
        if (interfaceC39541sb.AzC() != null) {
            A1I.put("dr_ad_type", interfaceC39541sb.AzC());
        }
        if (interfaceC39541sb.Azx() != null) {
            List<InterfaceC43533JKt> Azx = interfaceC39541sb.Azx();
            if (Azx != null) {
                arrayList6 = AbstractC166987dD.A1E();
                for (InterfaceC43533JKt interfaceC43533JKt : Azx) {
                    if (interfaceC43533JKt != null) {
                        arrayList6.add(interfaceC43533JKt.F7o());
                    }
                }
            } else {
                arrayList6 = null;
            }
            A1I.put("dynamic_ads_links", arrayList6);
        }
        if (interfaceC39541sb.B02() != null) {
            DynamicProductAdDisplayOption B02 = interfaceC39541sb.B02();
            if (B02 != null) {
                str2 = B02.A00;
            } else {
                str2 = null;
            }
            A1I.put("dynamic_product_ad_display_option", str2);
        }
        if (interfaceC39541sb.B1Q() != null) {
            A1I.put("enable_ads_follow_button", interfaceC39541sb.B1Q());
        }
        if (interfaceC39541sb.B1h() != null) {
            A1I.put("enable_reels_end_scene", interfaceC39541sb.B1h());
        }
        if (interfaceC39541sb.B4X() != null) {
            A1I.put("fb_app_id", interfaceC39541sb.B4X());
        }
        if (interfaceC39541sb.B4v() != null) {
            A1I.put("fb_page_url", interfaceC39541sb.B4v());
        }
        if (interfaceC39541sb.B5i() != null) {
            InterfaceC104834np B5i = interfaceC39541sb.B5i();
            if (B5i != null) {
                treeUpdaterJNI35 = B5i.F7o();
            } else {
                treeUpdaterJNI35 = null;
            }
            A1I.put("feed_end_scene_data", treeUpdaterJNI35);
        }
        if (interfaceC39541sb.B82() != null) {
            AdFormatType B82 = interfaceC39541sb.B82();
            if (B82 != null) {
                str = B82.A00;
            } else {
                str = null;
            }
            A1I.put("format_type", str);
        }
        if (interfaceC39541sb.B9f() != null) {
            InterfaceC104844nr B9f = interfaceC39541sb.B9f();
            if (B9f != null) {
                treeUpdaterJNI34 = B9f.F7o();
            } else {
                treeUpdaterJNI34 = null;
            }
            A1I.put("gesture_to_action_info", treeUpdaterJNI34);
        }
        if (interfaceC39541sb.BA3() != null) {
            A1I.put("global_position", interfaceC39541sb.BA3());
        }
        if (interfaceC39541sb.BDh() != null) {
            A1I.put("hide_flow_type", interfaceC39541sb.BDh());
        }
        if (interfaceC39541sb.BDj() != null) {
            A1I.put("hide_label", interfaceC39541sb.BDj());
        }
        if (interfaceC39541sb.BDm() != null) {
            List<InterfaceC39331sE> BDm = interfaceC39541sb.BDm();
            if (BDm != null) {
                arrayList5 = AbstractC166987dD.A1E();
                for (InterfaceC39331sE interfaceC39331sE : BDm) {
                    if (interfaceC39331sE != null) {
                        arrayList5.add(interfaceC39331sE.F7o());
                    }
                }
            } else {
                arrayList5 = null;
            }
            A1I.put("hide_reasons_v2", arrayList5);
        }
        if (interfaceC39541sb.BEV() != null) {
            InterfaceC39391sK BEV = interfaceC39541sb.BEV();
            if (BEV != null) {
                treeUpdaterJNI33 = BEV.F7o();
            } else {
                treeUpdaterJNI33 = null;
            }
            A1I.put("iab", treeUpdaterJNI33);
        }
        if (interfaceC39541sb.BEa() != null) {
            InterfaceC39421sN BEa = interfaceC39541sb.BEa();
            if (BEa != null) {
                treeUpdaterJNI32 = BEa.F7o();
            } else {
                treeUpdaterJNI32 = null;
            }
            A1I.put("iab_post_click_data", treeUpdaterJNI32);
        }
        if (interfaceC39541sb.BEc() != null) {
            A1I.put("iaw_wca_exclusion_targeting_rule_oc", interfaceC39541sb.BEc());
        }
        if (interfaceC39541sb.BFH() != null) {
            InterfaceC104854ns BFH = interfaceC39541sb.BFH();
            if (BFH != null) {
                treeUpdaterJNI31 = BFH.F7o();
            } else {
                treeUpdaterJNI31 = null;
            }
            A1I.put(AbstractC111324zv.A00(2479), treeUpdaterJNI31);
        }
        if (interfaceC39541sb.BFI() != null) {
            InterfaceC104864nt BFI = interfaceC39541sb.BFI();
            if (BFI != null) {
                treeUpdaterJNI30 = BFI.F7o();
            } else {
                treeUpdaterJNI30 = null;
            }
            A1I.put("ig_ad_media_text_ocr_info", treeUpdaterJNI30);
        }
        if (interfaceC39541sb.BFJ() != null) {
            AdsCTATrustInfoIntf BFJ = interfaceC39541sb.BFJ();
            if (BFJ != null) {
                treeUpdaterJNI29 = BFJ.F7o();
            } else {
                treeUpdaterJNI29 = null;
            }
            A1I.put(AbstractC111324zv.A00(2480), treeUpdaterJNI29);
        }
        if (interfaceC39541sb.BFK() != null) {
            AdsTextTrustInfoIntf BFK = interfaceC39541sb.BFK();
            if (BFK != null) {
                treeUpdaterJNI28 = BFK.F7o();
            } else {
                treeUpdaterJNI28 = null;
            }
            A1I.put(AbstractC111324zv.A00(2481), treeUpdaterJNI28);
        }
        if (interfaceC39541sb.BFN() != null) {
            IGAdsIABScreenshotDataDict BFN = interfaceC39541sb.BFN();
            if (BFN != null) {
                treeUpdaterJNI27 = BFN.F7o();
            } else {
                treeUpdaterJNI27 = null;
            }
            A1I.put(AbstractC111324zv.A00(2482), treeUpdaterJNI27);
        }
        if (interfaceC39541sb.BFZ() != null) {
            IGCTATextVariant BFZ = interfaceC39541sb.BFZ();
            if (BFZ != null) {
                treeUpdaterJNI26 = BFZ.F7o();
            } else {
                treeUpdaterJNI26 = null;
            }
            A1I.put(AbstractC111324zv.A00(2491), treeUpdaterJNI26);
        }
        if (interfaceC39541sb.BFc() != null) {
            A1I.put("ig_events_extracted_date", interfaceC39541sb.BFc());
        }
        if (interfaceC39541sb.BFe() != null) {
            InterfaceC88193wT BFe = interfaceC39541sb.BFe();
            if (BFe != null) {
                treeUpdaterJNI25 = BFe.F7o();
            } else {
                treeUpdaterJNI25 = null;
            }
            A1I.put("ig_feed_video_watch_and_browse_info", treeUpdaterJNI25);
        }
        if (interfaceC39541sb.BFf() != null) {
            InterfaceC104874ny BFf = interfaceC39541sb.BFf();
            if (BFf != null) {
                treeUpdaterJNI24 = BFf.F7o();
            } else {
                treeUpdaterJNI24 = null;
            }
            A1I.put("ig_format_liquidity_ads_info", treeUpdaterJNI24);
        }
        if (interfaceC39541sb.BG5() != null) {
            InterfaceC104884nz BG5 = interfaceC39541sb.BG5();
            if (BG5 != null) {
                treeUpdaterJNI23 = BG5.F7o();
            } else {
                treeUpdaterJNI23 = null;
            }
            A1I.put("ig_oops_survey_info", treeUpdaterJNI23);
        }
        if (interfaceC39541sb.BG6() != null) {
            InterfaceC104894o0 BG6 = interfaceC39541sb.BG6();
            if (BG6 != null) {
                treeUpdaterJNI22 = BG6.F7o();
            } else {
                treeUpdaterJNI22 = null;
            }
            A1I.put("ig_pbia_profile_and_browse_info", treeUpdaterJNI22);
        }
        if (interfaceC39541sb.BGD() != null) {
            IGRFSurveyInfoDict BGD = interfaceC39541sb.BGD();
            if (BGD != null) {
                treeUpdaterJNI21 = BGD.F7o();
            } else {
                treeUpdaterJNI21 = null;
            }
            A1I.put("ig_rf_survey_info", treeUpdaterJNI21);
        }
        if (interfaceC39541sb.BGF() != null) {
            InterfaceC104904o2 BGF = interfaceC39541sb.BGF();
            if (BGF != null) {
                treeUpdaterJNI20 = BGF.F7o();
            } else {
                treeUpdaterJNI20 = null;
            }
            A1I.put("ig_transparency_and_control_disclaimer_data", treeUpdaterJNI20);
        }
        if (interfaceC39541sb.BGM() != null) {
            C46j BGM = interfaceC39541sb.BGM();
            if (BGM != null) {
                treeUpdaterJNI19 = BGM.F7o();
            } else {
                treeUpdaterJNI19 = null;
            }
            A1I.put(AbstractC111324zv.A00(1002), treeUpdaterJNI19);
        }
        if (interfaceC39541sb.BH5() != null) {
            A1I.put("imp_signature", interfaceC39541sb.BH5());
        }
        if (interfaceC39541sb.BHB() != null) {
            A1I.put(AbstractC111324zv.A00(2526), interfaceC39541sb.BHB());
        }
        if (interfaceC39541sb.BJK() != null) {
            InterfaceC38221qC BJK = interfaceC39541sb.BJK();
            if (BJK != null) {
                treeUpdaterJNI18 = BJK.F7o();
            } else {
                treeUpdaterJNI18 = null;
            }
            A1I.put("invalidation_rules", treeUpdaterJNI18);
        }
        if (interfaceC39541sb.CU8() != null) {
            A1I.put("isExternalUrlLandingPage", interfaceC39541sb.CU8());
        }
        if (interfaceC39541sb.CPy() != null) {
            A1I.put("is_app_mae_ad_exclusion_eligible", interfaceC39541sb.CPy());
        }
        if (interfaceC39541sb.CQK() != null) {
            A1I.put(AbstractC111324zv.A00(2592), interfaceC39541sb.CQK());
        }
        if (interfaceC39541sb.CQW() != null) {
            A1I.put("is_bau_ifu_eligible", interfaceC39541sb.CQW());
        }
        if (interfaceC39541sb.CQk() != null) {
            A1I.put("is_boosted", interfaceC39541sb.CQk());
        }
        if (interfaceC39541sb.CRf() != null) {
            A1I.put("is_consent_growth_ifu_eligible", interfaceC39541sb.CRf());
        }
        if (interfaceC39541sb.CRg() != null) {
            A1I.put("is_consent_growth_popup_eligible", interfaceC39541sb.CRg());
        }
        if (interfaceC39541sb.CRm() != null) {
            A1I.put("is_conversions_ad_with_upcoming_event", interfaceC39541sb.CRm());
        }
        if (interfaceC39541sb.CSS() != null) {
            A1I.put("is_delayed_skip_ad", interfaceC39541sb.CSS());
        }
        if (interfaceC39541sb.CSW() != null) {
            A1I.put("is_demo", interfaceC39541sb.CSW());
        }
        if (interfaceC39541sb.CUh() != null) {
            A1I.put("is_feed_glados_control_eligible", interfaceC39541sb.CUh());
        }
        if (interfaceC39541sb.CV6() != null) {
            A1I.put("is_form_extension_eligible", interfaceC39541sb.CV6());
        }
        if (interfaceC39541sb.CVu() != null) {
            A1I.put("is_holdout", interfaceC39541sb.CVu());
        }
        if (interfaceC39541sb.CW5() != null) {
            A1I.put("is_ig_events_excluded_ad", interfaceC39541sb.CW5());
        }
        if (interfaceC39541sb.CXL() != null) {
            A1I.put("is_leadgen_native_eligible", interfaceC39541sb.CXL());
        }
        if (interfaceC39541sb.CXw() != null) {
            A1I.put("is_luxury_vertical_ad", interfaceC39541sb.CXw());
        }
        if (interfaceC39541sb.CYx() != null) {
            A1I.put("is_multi_ads_eligible", interfaceC39541sb.CYx());
        }
        if (interfaceC39541sb.CaD() != null) {
            A1I.put("is_pharma_and_sensitive_vertical_ad", interfaceC39541sb.CaD());
        }
        if (interfaceC39541sb.CaE() != null) {
            A1I.put("is_pharma_vertical_ad", interfaceC39541sb.CaE());
        }
        if (interfaceC39541sb.Caf() != null) {
            A1I.put("is_post_click_afi_eligible", interfaceC39541sb.Caf());
        }
        if (interfaceC39541sb.Caw() != null) {
            A1I.put("is_previewable_video_ad", interfaceC39541sb.Caw());
        }
        if (interfaceC39541sb.Cc8() != null) {
            A1I.put("is_rev_share", interfaceC39541sb.Cc8());
        }
        if (interfaceC39541sb.Ccp() != null) {
            A1I.put("is_sensitive_vertical_ad", interfaceC39541sb.Ccp());
        }
        if (interfaceC39541sb.CdF() != null) {
            A1I.put("is_shops_ifu_eligible", interfaceC39541sb.CdF());
        }
        if (interfaceC39541sb.BKC() != null) {
            A1I.put("item_type", interfaceC39541sb.BKC());
        }
        List items = interfaceC39541sb.getItems();
        if (items != null) {
            ArrayList A0i = AbstractC167007dF.A0i(items);
            Iterator it = items.iterator();
            while (it.hasNext()) {
                A0i.add(((C38321qM) it.next()).A1D());
            }
            A1I.put(DialogModule.KEY_ITEMS, A0i);
        }
        if (interfaceC39541sb.BKx() != null) {
            A1I.put("label", interfaceC39541sb.BKx());
        }
        if (interfaceC39541sb.BMh() != null) {
            A1I.put("lead_gen_allow_phone_zip_format_improvement", interfaceC39541sb.BMh());
        }
        if (interfaceC39541sb.BMi() != null) {
            List<AndroidLink> BMi = interfaceC39541sb.BMi();
            if (BMi != null) {
                arrayList4 = AbstractC166987dD.A1E();
                for (AndroidLink androidLink : BMi) {
                    if (androidLink != null) {
                        arrayList4.add(androidLink.F7o());
                    }
                }
            } else {
                arrayList4 = null;
            }
            A1I.put("lead_gen_android_links", arrayList4);
        }
        if (interfaceC39541sb.BMj() != null) {
            A1I.put("lead_gen_call_to_action_title", interfaceC39541sb.BMj());
        }
        if (interfaceC39541sb.BMl() != null) {
            A1I.put("lead_gen_force_full_page_context_card", interfaceC39541sb.BMl());
        }
        if (interfaceC39541sb.BMm() != null) {
            A1I.put("lead_gen_form_id", interfaceC39541sb.BMm());
        }
        if (interfaceC39541sb.BMo() != null) {
            List<AndroidLink> BMo = interfaceC39541sb.BMo();
            if (BMo != null) {
                arrayList3 = AbstractC166987dD.A1E();
                for (AndroidLink androidLink2 : BMo) {
                    if (androidLink2 != null) {
                        arrayList3.add(androidLink2.F7o());
                    }
                }
            } else {
                arrayList3 = null;
            }
            A1I.put("lead_gen_ios_links", arrayList3);
        }
        if (interfaceC39541sb.BMp() != null) {
            A1I.put("lead_gen_new_experience_ineligible", interfaceC39541sb.BMp());
        }
        if (interfaceC39541sb.BMq() != null) {
            InterfaceC104914o3 BMq = interfaceC39541sb.BMq();
            if (BMq != null) {
                treeUpdaterJNI17 = BMq.F7o();
            } else {
                treeUpdaterJNI17 = null;
            }
            A1I.put("lead_gen_preclick_data", treeUpdaterJNI17);
        }
        if (interfaceC39541sb.BNP() != null) {
            A1I.put("link_hint_text", interfaceC39541sb.BNP());
        }
        if (interfaceC39541sb.BNT() != null) {
            A1I.put("link_text", interfaceC39541sb.BNT());
        }
        if (interfaceC39541sb.BQT() != null) {
            C46j BQT = interfaceC39541sb.BQT();
            if (BQT != null) {
                treeUpdaterJNI16 = BQT.F7o();
            } else {
                treeUpdaterJNI16 = null;
            }
            A1I.put("media_background", treeUpdaterJNI16);
        }
        if (interfaceC39541sb.getMediaId() != null) {
            AbstractC37300Gc1.A18(interfaceC39541sb.getMediaId(), A1I);
        }
        if (interfaceC39541sb.BSs() != null) {
            C4o4 BSs = interfaceC39541sb.BSs();
            if (BSs != null) {
                treeUpdaterJNI15 = BSs.F7o();
            } else {
                treeUpdaterJNI15 = null;
            }
            A1I.put(AbstractC111324zv.A00(2715), treeUpdaterJNI15);
        }
        if (interfaceC39541sb.BVd() != null) {
            InterfaceC104924o5 BVd = interfaceC39541sb.BVd();
            if (BVd != null) {
                treeUpdaterJNI14 = BVd.F7o();
            } else {
                treeUpdaterJNI14 = null;
            }
            A1I.put("music_info", treeUpdaterJNI14);
        }
        if (interfaceC39541sb.BYm() != null) {
            InterfaceC104934o6 BYm = interfaceC39541sb.BYm();
            if (BYm != null) {
                treeUpdaterJNI13 = BYm.F7o();
            } else {
                treeUpdaterJNI13 = null;
            }
            A1I.put("on_impressions_control", treeUpdaterJNI13);
        }
        if (interfaceC39541sb.BZH() != null) {
            A1I.put("optimization_goal_name", interfaceC39541sb.BZH());
        }
        if (interfaceC39541sb.Baa() != null) {
            A1I.put("overlay_subtitle", interfaceC39541sb.Baa());
        }
        if (interfaceC39541sb.Baq() != null) {
            A1I.put("pac_ad_media_ids", interfaceC39541sb.Baq());
        }
        if (interfaceC39541sb.Baz() != null) {
            A1I.put("page_id", interfaceC39541sb.Baz());
        }
        if (interfaceC39541sb.Bck() != null) {
            A1I.put(AbstractC37307Gc9.A01(0, 12, 106), interfaceC39541sb.Bck());
        }
        if (interfaceC39541sb.BeI() != null) {
            InterfaceC104944o7 BeI = interfaceC39541sb.BeI();
            if (BeI != null) {
                treeUpdaterJNI12 = BeI.F7o();
            } else {
                treeUpdaterJNI12 = null;
            }
            A1I.put("political_context", treeUpdaterJNI12);
        }
        if (interfaceC39541sb.Bf8() != null) {
            List<IGPostTriggerExperience> Bf8 = interfaceC39541sb.Bf8();
            if (Bf8 != null) {
                arrayList2 = AbstractC167007dF.A0i(Bf8);
                for (IGPostTriggerExperience iGPostTriggerExperience : Bf8) {
                    C14360o3.A0B(iGPostTriggerExperience, 0);
                    arrayList2.add(iGPostTriggerExperience.A00);
                }
            } else {
                arrayList2 = null;
            }
            A1I.put("post_trigger_experience_eligibilities", arrayList2);
        }
        if (interfaceC39541sb.Bf9() != null) {
            List<PostTriggerExperienceEligibleTrigger> Bf9 = interfaceC39541sb.Bf9();
            if (Bf9 != null) {
                arrayList = AbstractC167007dF.A0i(Bf9);
                for (PostTriggerExperienceEligibleTrigger postTriggerExperienceEligibleTrigger : Bf9) {
                    C14360o3.A0B(postTriggerExperienceEligibleTrigger, 0);
                    arrayList.add(postTriggerExperienceEligibleTrigger.A00);
                }
            } else {
                arrayList = null;
            }
            A1I.put("post_trigger_experience_eligible_triggers", arrayList);
        }
        if (interfaceC39541sb.Bi3() != null) {
            IGAdProfileProductTabDict Bi3 = interfaceC39541sb.Bi3();
            if (Bi3 != null) {
                treeUpdaterJNI11 = Bi3.F7o();
            } else {
                treeUpdaterJNI11 = null;
            }
            A1I.put(AbstractC111324zv.A00(2924), treeUpdaterJNI11);
        }
        if (interfaceC39541sb.BiD() != null) {
            C47W BiD = interfaceC39541sb.BiD();
            if (BiD != null) {
                treeUpdaterJNI10 = BiD.F7o();
            } else {
                treeUpdaterJNI10 = null;
            }
            A1I.put("profile_visit_ads_info", treeUpdaterJNI10);
        }
        if (interfaceC39541sb.Bm0() != null) {
            C4o9 Bm0 = interfaceC39541sb.Bm0();
            if (Bm0 != null) {
                treeUpdaterJNI9 = Bm0.F7o();
            } else {
                treeUpdaterJNI9 = null;
            }
            A1I.put("reels_mid_scene_info", treeUpdaterJNI9);
        }
        if (interfaceC39541sb.Bm1() != null) {
            InterfaceC104954oA Bm1 = interfaceC39541sb.Bm1();
            if (Bm1 != null) {
                treeUpdaterJNI8 = Bm1.F7o();
            } else {
                treeUpdaterJNI8 = null;
            }
            A1I.put("reels_multi_ads_info", treeUpdaterJNI8);
        }
        if (interfaceC39541sb.But() != null) {
            InterfaceC104964oB But = interfaceC39541sb.But();
            if (But != null) {
                treeUpdaterJNI7 = But.F7o();
            } else {
                treeUpdaterJNI7 = null;
            }
            A1I.put("short_video_dtd", treeUpdaterJNI7);
        }
        if (interfaceC39541sb.Bv2() != null) {
            A1I.put("should_fetch_preview_comments", interfaceC39541sb.Bv2());
        }
        if (interfaceC39541sb.BvW() != null) {
            A1I.put("should_show_exclusive_info_cta", interfaceC39541sb.BvW());
        }
        if (interfaceC39541sb.Bvg() != null) {
            A1I.put("should_show_secondary_cta_on_profile", interfaceC39541sb.Bvg());
        }
        if (interfaceC39541sb.Bvw() != null) {
            A1I.put("show_ad_choices", interfaceC39541sb.Bvw());
        }
        if (interfaceC39541sb.BwT() != null) {
            A1I.put("show_icon", interfaceC39541sb.BwT());
        }
        if (interfaceC39541sb.Bwg() != null) {
            A1I.put(AbstractC111324zv.A00(3103), interfaceC39541sb.Bwg());
        }
        if (interfaceC39541sb.BzH() != null) {
            InterfaceC104974oC BzH = interfaceC39541sb.BzH();
            if (BzH != null) {
                treeUpdaterJNI6 = BzH.F7o();
            } else {
                treeUpdaterJNI6 = null;
            }
            A1I.put("sponsored_ad_disclaimer", treeUpdaterJNI6);
        }
        if (interfaceC39541sb.C1Q() != null) {
            InterfaceC104984oD C1Q = interfaceC39541sb.C1Q();
            if (C1Q != null) {
                treeUpdaterJNI5 = C1Q.F7o();
            } else {
                treeUpdaterJNI5 = null;
            }
            A1I.put("story_dynamic_ad_flexible_tiles_info", treeUpdaterJNI5);
        }
        if (interfaceC39541sb.C4k() != null) {
            IGAdCreativeStory9x16CaptionData C4k = interfaceC39541sb.C4k();
            if (C4k != null) {
                treeUpdaterJNI4 = C4k.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1I.put("systematic_caption", treeUpdaterJNI4);
        }
        if (interfaceC39541sb.C5p() != null) {
            InterfaceC38901rP C5p = interfaceC39541sb.C5p();
            if (C5p != null) {
                treeUpdaterJNI3 = C5p.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("testimonial_data", treeUpdaterJNI3);
        }
        if (interfaceC39541sb.C5q() != null) {
            TestimonialDict C5q = interfaceC39541sb.C5q();
            if (C5q != null) {
                treeUpdaterJNI2 = C5q.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("testimonial_data_v2", treeUpdaterJNI2);
        }
        if (interfaceC39541sb.C6P() != null) {
            InterfaceC104994oF C6P = interfaceC39541sb.C6P();
            if (C6P != null) {
                treeUpdaterJNI = C6P.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("text_overlay", treeUpdaterJNI);
        }
        if (interfaceC39541sb.CAR() != null) {
            A1I.put("tracking_token", interfaceC39541sb.CAR());
        }
        if (interfaceC39541sb.CDT() != null) {
            InterfaceC105004oG CDT = interfaceC39541sb.CDT();
            if (CDT != null) {
                treeUpdaterJNI55 = CDT.F7o();
            }
            A1I.put("urp_card_transformation", treeUpdaterJNI55);
        }
        if (interfaceC39541sb.CEO() != null) {
            A1I.put("validated_product_cursor", interfaceC39541sb.CEO());
        }
        if (interfaceC39541sb.CFu() != null) {
            A1I.put("view_tags", interfaceC39541sb.CFu());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
