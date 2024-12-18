package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsBreakingCreatorInfo;
import com.instagram.api.schemas.ClipsCreationEntryPoint;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.OriginalityInfo;
import com.instagram.api.schemas.ProfessionalClipsUpsellType;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gd4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37362Gd4 {
    public static Map A00(C3x9 c3x9) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        ArrayList arrayList;
        TreeUpdaterJNI F7o;
        String str;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        TreeUpdaterJNI treeUpdaterJNI7;
        TreeUpdaterJNI treeUpdaterJNI8;
        TreeUpdaterJNI treeUpdaterJNI9;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI10;
        TreeUpdaterJNI treeUpdaterJNI11;
        String str2;
        TreeUpdaterJNI treeUpdaterJNI12;
        TreeUpdaterJNI treeUpdaterJNI13;
        TreeUpdaterJNI treeUpdaterJNI14;
        TreeUpdaterJNI treeUpdaterJNI15;
        String str3;
        TreeUpdaterJNI treeUpdaterJNI16;
        TreeUpdaterJNI treeUpdaterJNI17;
        TreeUpdaterJNI treeUpdaterJNI18;
        TreeUpdaterJNI treeUpdaterJNI19;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI20 = null;
        if (c3x9.AYE() != null) {
            InterfaceC83973oh AYE = c3x9.AYE();
            if (AYE != null) {
                treeUpdaterJNI19 = AYE.F7o();
            } else {
                treeUpdaterJNI19 = null;
            }
            A1I.put("achievements_info", treeUpdaterJNI19);
        }
        if (c3x9.AZi() != null) {
            InterfaceC84033on AZi = c3x9.AZi();
            if (AZi != null) {
                treeUpdaterJNI18 = AZi.F7o();
            } else {
                treeUpdaterJNI18 = null;
            }
            A1I.put("additional_audio_info", treeUpdaterJNI18);
        }
        if (c3x9.Acs() != null) {
            C5HF Acs = c3x9.Acs();
            if (Acs != null) {
                treeUpdaterJNI17 = Acs.F7o();
            } else {
                treeUpdaterJNI17 = null;
            }
            A1I.put("asset_recommendation_info", treeUpdaterJNI17);
        }
        if (c3x9.Adx() != null) {
            InterfaceC84063oq Adx = c3x9.Adx();
            if (Adx != null) {
                treeUpdaterJNI16 = Adx.F7o();
            } else {
                treeUpdaterJNI16 = null;
            }
            A1I.put("audio_ranking_info", treeUpdaterJNI16);
        }
        if (c3x9.Ae6() != null) {
            MusicCanonicalType Ae6 = c3x9.Ae6();
            if (Ae6 != null) {
                str3 = Ae6.A00;
            } else {
                str3 = null;
            }
            A1I.put("audio_type", str3);
        }
        if (c3x9.Ai5() != null) {
            InterfaceC84103ov Ai5 = c3x9.Ai5();
            if (Ai5 != null) {
                treeUpdaterJNI15 = Ai5.F7o();
            } else {
                treeUpdaterJNI15 = null;
            }
            A1I.put("branded_content_tag_info", treeUpdaterJNI15);
        }
        if (c3x9.AiB() != null) {
            C5HH AiB = c3x9.AiB();
            if (AiB != null) {
                treeUpdaterJNI14 = AiB.F7o();
            } else {
                treeUpdaterJNI14 = null;
            }
            A1I.put(AbstractC111324zv.A00(2004), treeUpdaterJNI14);
        }
        if (c3x9.AiC() != null) {
            ClipsBreakingCreatorInfo AiC = c3x9.AiC();
            if (AiC != null) {
                treeUpdaterJNI13 = AiC.F7o();
            } else {
                treeUpdaterJNI13 = null;
            }
            A1I.put(AbstractC111324zv.A00(2005), treeUpdaterJNI13);
        }
        if (c3x9.Amv() != null) {
            C5HK Amv = c3x9.Amv();
            if (Amv != null) {
                treeUpdaterJNI12 = Amv.F7o();
            } else {
                treeUpdaterJNI12 = null;
            }
            A1I.put(AbstractC111324zv.A00(792), treeUpdaterJNI12);
        }
        if (c3x9.AoE() != null) {
            ClipsCreationEntryPoint AoE = c3x9.AoE();
            if (AoE != null) {
                str2 = AoE.A00;
            } else {
                str2 = null;
            }
            A1I.put("clips_creation_entry_point", str2);
        }
        if (c3x9.Aqs() != null) {
            InterfaceC84133oz Aqs = c3x9.Aqs();
            if (Aqs != null) {
                treeUpdaterJNI11 = Aqs.F7o();
            } else {
                treeUpdaterJNI11 = null;
            }
            A1I.put("content_appreciation_info", treeUpdaterJNI11);
        }
        if (c3x9.ArW() != null) {
            ClipsContextualHighlightInfoIntf ArW = c3x9.ArW();
            if (ArW != null) {
                treeUpdaterJNI10 = ArW.F7o();
            } else {
                treeUpdaterJNI10 = null;
            }
            A1I.put("contextual_highlight_info", treeUpdaterJNI10);
        }
        if (c3x9.AvR() != null) {
            List<JKA> AvR = c3x9.AvR();
            if (AvR != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (JKA jka : AvR) {
                    if (jka != null) {
                        arrayList2.add(jka.F7o());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1I.put("cutout_sticker_info", arrayList2);
        }
        if (c3x9.Ay0() != null) {
            A1I.put("disable_use_in_clips_client_cache", c3x9.Ay0());
        }
        if (c3x9.B3d() != null) {
            C5HL B3d = c3x9.B3d();
            if (B3d != null) {
                treeUpdaterJNI9 = B3d.F7o();
            } else {
                treeUpdaterJNI9 = null;
            }
            A1I.put("external_media_info", treeUpdaterJNI9);
        }
        if (c3x9.B5N() != null) {
            A1I.put("featured_label", c3x9.B5N());
        }
        if (c3x9.BDx() != null) {
            A1I.put("high_intent_follow_eligible", c3x9.BDx());
        }
        if (c3x9.CUJ() != null) {
            A1I.put("is_fan_club_promo_video", c3x9.CUJ());
        }
        if (c3x9.CUL() != null) {
            A1I.put(AbstractC111324zv.A00(2609), c3x9.CUL());
        }
        if (c3x9.CbJ() != null) {
            A1I.put("is_public_chat_welcome_video", c3x9.CbJ());
        }
        if (c3x9.Cd0() != null) {
            A1I.put("is_shared_to_fb", c3x9.Cd0());
        }
        if (c3x9.BPh() != null) {
            InterfaceC84163p3 BPh = c3x9.BPh();
            if (BPh != null) {
                treeUpdaterJNI8 = BPh.F7o();
            } else {
                treeUpdaterJNI8 = null;
            }
            A1I.put("mashup_info", treeUpdaterJNI8);
        }
        if (c3x9.BSU() != null) {
            C5HM BSU = c3x9.BSU();
            if (BSU != null) {
                treeUpdaterJNI7 = BSU.F7o();
            } else {
                treeUpdaterJNI7 = null;
            }
            A1I.put(AbstractC111324zv.A00(2714), treeUpdaterJNI7);
        }
        if (c3x9.getMusicCanonicalId() != null) {
            A1I.put("music_canonical_id", c3x9.getMusicCanonicalId());
        }
        if (c3x9.BVc() != null) {
            MusicInfo BVc = c3x9.BVc();
            if (BVc != null) {
                treeUpdaterJNI6 = BVc.F7o();
            } else {
                treeUpdaterJNI6 = null;
            }
            A1I.put("music_info", treeUpdaterJNI6);
        }
        if (c3x9.BYO() != null) {
            C5HN BYO = c3x9.BYO();
            if (BYO != null) {
                treeUpdaterJNI5 = BYO.F7o();
            } else {
                treeUpdaterJNI5 = null;
            }
            A1I.put("nux_info", treeUpdaterJNI5);
        }
        if (c3x9.BZw() != null) {
            OriginalSoundDataIntf BZw = c3x9.BZw();
            if (BZw != null) {
                treeUpdaterJNI4 = BZw.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1I.put("original_sound_info", treeUpdaterJNI4);
        }
        if (c3x9.Ba3() != null) {
            OriginalityInfo Ba3 = c3x9.Ba3();
            if (Ba3 != null) {
                treeUpdaterJNI3 = Ba3.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("originality_info", treeUpdaterJNI3);
        }
        if (c3x9.BhS() != null) {
            ProfessionalClipsUpsellType BhS = c3x9.BhS();
            if (BhS != null) {
                str = BhS.A00;
            } else {
                str = null;
            }
            A1I.put("professional_clips_upsell_type", str);
        }
        if (c3x9.getReusableTextAttributeString() != null) {
            A1I.put("reusable_text_attribute_string", c3x9.getReusableTextAttributeString());
        }
        if (c3x9.Bp8() != null) {
            List<InterfaceC93104Fm> Bp8 = c3x9.Bp8();
            if (Bp8 != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC93104Fm interfaceC93104Fm : Bp8) {
                    if (interfaceC93104Fm != null && (F7o = interfaceC93104Fm.F7o()) != null) {
                        arrayList.add(F7o);
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("reusable_text_info", arrayList);
        }
        if (c3x9.Buh() != null) {
            ClipsShoppingInfoIntf Buh = c3x9.Buh();
            if (Buh != null) {
                treeUpdaterJNI2 = Buh.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("shopping_info", treeUpdaterJNI2);
        }
        if (c3x9.Bvv() != null) {
            A1I.put("show_achievements", c3x9.Bvv());
        }
        if (c3x9.Bwz() != null) {
            A1I.put("show_tips", c3x9.Bwz());
        }
        if (c3x9.C2z() != null) {
            A1I.put("stripped_media_id", c3x9.C2z());
        }
        if (c3x9.C5g() != null) {
            InterfaceC110214xq C5g = c3x9.C5g();
            if (C5g != null) {
                treeUpdaterJNI = C5g.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("template_info", treeUpdaterJNI);
        }
        if (c3x9.CGA() != null) {
            C5HS CGA = c3x9.CGA();
            if (CGA != null) {
                treeUpdaterJNI20 = CGA.F7o();
            }
            A1I.put(AbstractC111324zv.A00(3305), treeUpdaterJNI20);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
