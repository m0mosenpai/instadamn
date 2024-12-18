package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AssetRecommendationType;
import com.instagram.api.schemas.ClipsBreakingCreatorInfo;
import com.instagram.api.schemas.ClipsBreakingCreatorInfoImpl;
import com.instagram.api.schemas.ClipsCreationEntryPoint;
import com.instagram.api.schemas.ClipsMerchandisingPillType;
import com.instagram.api.schemas.ContextualHighlightType;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalityFollowButtonInfo;
import com.instagram.api.schemas.OriginalityFollowButtonInfoImpl;
import com.instagram.api.schemas.OriginalityInfo;
import com.instagram.api.schemas.OriginalityInfoImpl;
import com.instagram.api.schemas.OriginalitySourceMediaInfo;
import com.instagram.api.schemas.OriginalitySourceMediaInfoImpl;
import com.instagram.api.schemas.ProfessionalClipsUpsellType;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfo;
import com.instagram.clips.model.metadata.InteractionUpsellCTAType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.clips.ClipsShoppingCTABar;
import com.instagram.model.shopping.clips.ClipsShoppingInfo;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductWrapper;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3oe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC83943oe {
    public static C88513x8 parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C83963og c83963og = null;
            C84023om c84023om = null;
            C5HE c5he = null;
            C84053op c84053op = null;
            MusicCanonicalType musicCanonicalType = null;
            C84093ou c84093ou = null;
            C5HG c5hg = null;
            ClipsBreakingCreatorInfoImpl clipsBreakingCreatorInfoImpl = null;
            C5HJ c5hj = null;
            ClipsCreationEntryPoint clipsCreationEntryPoint = null;
            C84123oy c84123oy = null;
            ClipsContextualHighlightInfo clipsContextualHighlightInfo = null;
            ArrayList arrayList = null;
            Boolean bool = null;
            C26125BhB c26125BhB = null;
            String str = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            C84153p2 c84153p2 = null;
            C38696H2h c38696H2h = null;
            String str2 = null;
            MusicInfoImpl musicInfoImpl = null;
            C26160Bhl c26160Bhl = null;
            OriginalSoundData originalSoundData = null;
            OriginalityInfoImpl originalityInfoImpl = null;
            ProfessionalClipsUpsellType professionalClipsUpsellType = null;
            String str3 = null;
            ArrayList arrayList2 = null;
            ClipsShoppingInfo clipsShoppingInfo = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            String str4 = null;
            C110204xp c110204xp = null;
            C5HR c5hr = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("achievements_info".equals(A0q)) {
                    c83963og = AbstractC83953of.parseFromJson(c16l);
                } else if ("additional_audio_info".equals(A0q)) {
                    c84023om = AbstractC83983oi.parseFromJson(c16l);
                } else if ("asset_recommendation_info".equals(A0q)) {
                    c5he = AbstractC88413wx.parseFromJson(c16l);
                } else if ("audio_ranking_info".equals(A0q)) {
                    c84053op = AbstractC84043oo.parseFromJson(c16l);
                } else if ("audio_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    musicCanonicalType = AbstractC84073or.A00(A1P3);
                } else if ("branded_content_tag_info".equals(A0q)) {
                    c84093ou = AbstractC84083ot.parseFromJson(c16l);
                } else if ("breaking_content_info".equals(A0q)) {
                    c5hg = AbstractC88393wu.parseFromJson(c16l);
                } else if ("breaking_creator_info".equals(A0q)) {
                    clipsBreakingCreatorInfoImpl = AbstractC88403wv.parseFromJson(c16l);
                } else if ("challenge_info".equals(A0q)) {
                    c5hj = AbstractC88423wy.parseFromJson(c16l);
                } else if ("clips_creation_entry_point".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    clipsCreationEntryPoint = (ClipsCreationEntryPoint) ClipsCreationEntryPoint.A01.get(A1P2);
                    if (clipsCreationEntryPoint == null) {
                        clipsCreationEntryPoint = ClipsCreationEntryPoint.A06;
                    }
                } else if ("content_appreciation_info".equals(A0q)) {
                    c84123oy = AbstractC84113ox.parseFromJson(c16l);
                } else if ("contextual_highlight_info".equals(A0q)) {
                    clipsContextualHighlightInfo = C3x0.parseFromJson(c16l);
                } else if ("cutout_sticker_info".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38694H2f parseFromJson = AbstractC39814HlO.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("disable_use_in_clips_client_cache".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("external_media_info".equals(A0q)) {
                    c26125BhB = AbstractC88443x1.parseFromJson(c16l);
                } else if ("featured_label".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("high_intent_follow_eligible".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_fan_club_promo_video".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("is_fan_club_welcome_video".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("is_public_chat_welcome_video".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("is_shared_to_fb".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("mashup_info".equals(A0q)) {
                    c84153p2 = AbstractC84143p0.parseFromJson(c16l);
                } else if ("merchandising_pill_info".equals(A0q)) {
                    c38696H2h = AbstractC88453x2.parseFromJson(c16l);
                } else if ("music_canonical_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("music_info".equals(A0q)) {
                    musicInfoImpl = C3XO.parseFromJson(c16l);
                } else if ("nux_info".equals(A0q)) {
                    c26160Bhl = AbstractC88463x3.parseFromJson(c16l);
                } else if ("original_sound_info".equals(A0q)) {
                    originalSoundData = C3XP.parseFromJson(c16l);
                } else if ("originality_info".equals(A0q)) {
                    originalityInfoImpl = AbstractC88473x4.parseFromJson(c16l);
                } else if ("professional_clips_upsell_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    professionalClipsUpsellType = (ProfessionalClipsUpsellType) ProfessionalClipsUpsellType.A01.get(A1P);
                    if (professionalClipsUpsellType == null) {
                        professionalClipsUpsellType = ProfessionalClipsUpsellType.A05;
                    }
                } else if ("reusable_text_attribute_string".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("reusable_text_info".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C93094Fl parseFromJson2 = AbstractC93044Fd.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("shopping_info".equals(A0q)) {
                    clipsShoppingInfo = AbstractC88483x5.parseFromJson(c16l);
                } else if ("show_achievements".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("show_tips".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("stripped_media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("template_info".equals(A0q)) {
                    c110204xp = AbstractC88493x6.parseFromJson(c16l);
                } else if ("viewer_interaction_settings".equals(A0q)) {
                    c5hr = AbstractC88503x7.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C88513x8(c84053op, c83963og, c5he, clipsBreakingCreatorInfoImpl, clipsCreationEntryPoint, c26125BhB, c38696H2h, musicCanonicalType, musicInfoImpl, originalSoundData, originalityInfoImpl, professionalClipsUpsellType, c84023om, c84093ou, c5hg, c5hj, c84123oy, clipsContextualHighlightInfo, c84153p2, c26160Bhl, c110204xp, c5hr, clipsShoppingInfo, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, str, str2, str3, str4, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C88513x8 c88513x8) {
        anonymousClass182.A0d();
        InterfaceC83973oh interfaceC83973oh = c88513x8.A01;
        if (interfaceC83973oh != null) {
            anonymousClass182.A0r("achievements_info");
            C83963og Erq = interfaceC83973oh.Erq();
            anonymousClass182.A0d();
            Integer num = Erq.A01;
            if (num != null) {
                anonymousClass182.A0Q("num_earned_achievements", num.intValue());
            }
            Boolean bool = Erq.A00;
            if (bool != null) {
                anonymousClass182.A0T("show_achievements", bool.booleanValue());
            }
            anonymousClass182.A0a();
        }
        C84023om c84023om = c88513x8.A0C;
        if (c84023om != null) {
            anonymousClass182.A0r("additional_audio_info");
            anonymousClass182.A0d();
            String str = c84023om.A01;
            if (str != null) {
                anonymousClass182.A0S("additional_audio_username", str);
            }
            InterfaceC84013ol interfaceC84013ol = c84023om.A00;
            if (interfaceC84013ol != null) {
                anonymousClass182.A0r("audio_reattribution_info");
                C84003ok F4A = interfaceC84013ol.F4A();
                anonymousClass182.A0d();
                anonymousClass182.A0T("should_allow_restore", F4A.A00);
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        C5HE c5he = c88513x8.A02;
        if (c5he != null) {
            anonymousClass182.A0r("asset_recommendation_info");
            anonymousClass182.A0d();
            List<InterfaceC43553JLn> list = c5he.A00;
            if (list != null) {
                C16V.A03(anonymousClass182, "asset_recommendations");
                for (InterfaceC43553JLn interfaceC43553JLn : list) {
                    if (interfaceC43553JLn != null) {
                        C38693H2e Ers = interfaceC43553JLn.Ers();
                        anonymousClass182.A0d();
                        String str2 = Ers.A02;
                        if (str2 != null) {
                            anonymousClass182.A0S("asset_id", str2);
                        }
                        String str3 = Ers.A03;
                        if (str3 != null) {
                            anonymousClass182.A0S("asset_name", str3);
                        }
                        AssetRecommendationType assetRecommendationType = Ers.A00;
                        if (assetRecommendationType != null) {
                            anonymousClass182.A0S("asset_type", assetRecommendationType.A00);
                        }
                        ImageUrl imageUrl = Ers.A01;
                        if (imageUrl != null) {
                            anonymousClass182.A0r("cover_artwork_thumbnail_uri");
                            AbstractC222616c.A01(anonymousClass182, imageUrl);
                        }
                        String str4 = Ers.A04;
                        if (str4 != null) {
                            anonymousClass182.A0S("extra", str4);
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        C84053op c84053op = c88513x8.A00;
        if (c84053op != null) {
            anonymousClass182.A0r("audio_ranking_info");
            anonymousClass182.A0d();
            String str5 = c84053op.A00;
            if (str5 != null) {
                anonymousClass182.A0S("best_audio_cluster_id", str5);
            }
            anonymousClass182.A0a();
        }
        MusicCanonicalType musicCanonicalType = c88513x8.A07;
        if (musicCanonicalType != null) {
            anonymousClass182.A0S("audio_type", musicCanonicalType.A00);
        }
        InterfaceC84103ov interfaceC84103ov = c88513x8.A0D;
        if (interfaceC84103ov != null) {
            anonymousClass182.A0r("branded_content_tag_info");
            C84093ou F4B = interfaceC84103ov.F4B();
            anonymousClass182.A0d();
            anonymousClass182.A0T("can_add_tag", F4B.A00);
            anonymousClass182.A0a();
        }
        C5HG c5hg = c88513x8.A0E;
        if (c5hg != null) {
            anonymousClass182.A0r("breaking_content_info");
            anonymousClass182.A0d();
            String str6 = c5hg.A00;
            if (str6 != null) {
                anonymousClass182.A0S("display_label", str6);
            }
            anonymousClass182.A0a();
        }
        ClipsBreakingCreatorInfo clipsBreakingCreatorInfo = c88513x8.A03;
        if (clipsBreakingCreatorInfo != null) {
            anonymousClass182.A0r("breaking_creator_info");
            ClipsBreakingCreatorInfoImpl Ert = clipsBreakingCreatorInfo.Ert();
            anonymousClass182.A0d();
            String str7 = Ert.A00;
            if (str7 != null) {
                anonymousClass182.A0S("display_label", str7);
            }
            anonymousClass182.A0a();
        }
        C5HJ c5hj = c88513x8.A0F;
        if (c5hj != null) {
            anonymousClass182.A0r("challenge_info");
            anonymousClass182.A0d();
            String str8 = c5hj.A00;
            if (str8 != null) {
                anonymousClass182.A0S("tag_name", str8);
            }
            anonymousClass182.A0a();
        }
        ClipsCreationEntryPoint clipsCreationEntryPoint = c88513x8.A04;
        if (clipsCreationEntryPoint != null) {
            anonymousClass182.A0S("clips_creation_entry_point", clipsCreationEntryPoint.A00);
        }
        C84123oy c84123oy = c88513x8.A0G;
        if (c84123oy != null) {
            anonymousClass182.A0r("content_appreciation_info");
            AbstractC84113ox.A00(anonymousClass182, c84123oy);
        }
        ClipsContextualHighlightInfo clipsContextualHighlightInfo = c88513x8.A0H;
        if (clipsContextualHighlightInfo != null) {
            anonymousClass182.A0r("contextual_highlight_info");
            anonymousClass182.A0d();
            String str9 = clipsContextualHighlightInfo.A01;
            if (str9 != null) {
                anonymousClass182.A0S("chaining_media_id", str9);
            }
            String str10 = clipsContextualHighlightInfo.A02;
            if (str10 != null) {
                anonymousClass182.A0S("contextual_highlight_id", str10);
            }
            String str11 = clipsContextualHighlightInfo.A03;
            if (str11 != null) {
                anonymousClass182.A0S("contextual_highlight_title", str11);
            }
            ContextualHighlightType contextualHighlightType = clipsContextualHighlightInfo.A00;
            if (contextualHighlightType != null) {
                anonymousClass182.A0S("contextual_highlight_type", contextualHighlightType.A00);
            }
            anonymousClass182.A0a();
        }
        List<JKA> list2 = c88513x8.A0Z;
        if (list2 != null) {
            C16V.A03(anonymousClass182, "cutout_sticker_info");
            for (JKA jka : list2) {
                if (jka != null) {
                    C38694H2f Eru = jka.Eru();
                    anonymousClass182.A0d();
                    String str12 = Eru.A00;
                    if (str12 != null) {
                        anonymousClass182.A0S("source_media_id", str12);
                    }
                    String str13 = Eru.A01;
                    if (str13 != null) {
                        anonymousClass182.A0S("source_media_username", str13);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        Boolean bool2 = c88513x8.A0N;
        if (bool2 != null) {
            anonymousClass182.A0T("disable_use_in_clips_client_cache", bool2.booleanValue());
        }
        C5HL c5hl = c88513x8.A05;
        if (c5hl != null) {
            anonymousClass182.A0r("external_media_info");
            C26125BhB Erw = c5hl.Erw();
            anonymousClass182.A0d();
            List<InterfaceC31129DmC> list3 = Erw.A00;
            if (list3 != null) {
                C16V.A03(anonymousClass182, "giphy_videos");
                for (InterfaceC31129DmC interfaceC31129DmC : list3) {
                    if (interfaceC31129DmC != null) {
                        C26131BhI Ett = interfaceC31129DmC.Ett();
                        anonymousClass182.A0d();
                        String str14 = Ett.A00;
                        if (str14 != null) {
                            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str14);
                        }
                        String str15 = Ett.A01;
                        if (str15 != null) {
                            anonymousClass182.A0S("thumbnail_url", str15);
                        }
                        String str16 = Ett.A02;
                        if (str16 != null) {
                            anonymousClass182.A0S(DialogModule.KEY_TITLE, str16);
                        }
                        String str17 = Ett.A03;
                        if (str17 != null) {
                            anonymousClass182.A0S(AbstractC31190DnZ.A01(31, 8, 115), str17);
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        String str18 = c88513x8.A0V;
        if (str18 != null) {
            anonymousClass182.A0S("featured_label", str18);
        }
        Boolean bool3 = c88513x8.A0O;
        if (bool3 != null) {
            anonymousClass182.A0T("high_intent_follow_eligible", bool3.booleanValue());
        }
        Boolean bool4 = c88513x8.A0P;
        if (bool4 != null) {
            anonymousClass182.A0T("is_fan_club_promo_video", bool4.booleanValue());
        }
        Boolean bool5 = c88513x8.A0Q;
        if (bool5 != null) {
            anonymousClass182.A0T("is_fan_club_welcome_video", bool5.booleanValue());
        }
        Boolean bool6 = c88513x8.A0R;
        if (bool6 != null) {
            anonymousClass182.A0T("is_public_chat_welcome_video", bool6.booleanValue());
        }
        Boolean bool7 = c88513x8.A0S;
        if (bool7 != null) {
            anonymousClass182.A0T("is_shared_to_fb", bool7.booleanValue());
        }
        C84153p2 c84153p2 = c88513x8.A0I;
        if (c84153p2 != null) {
            anonymousClass182.A0r("mashup_info");
            AbstractC84143p0.A00(anonymousClass182, c84153p2);
        }
        C5HM c5hm = c88513x8.A06;
        if (c5hm != null) {
            anonymousClass182.A0r("merchandising_pill_info");
            C38696H2h Es0 = c5hm.Es0();
            anonymousClass182.A0d();
            anonymousClass182.A0Q("loop_time", Es0.A00);
            List<ClipsMerchandisingPillType> list4 = Es0.A01;
            if (list4 != null) {
                C16V.A03(anonymousClass182, AbstractC111324zv.A00(1108));
                for (ClipsMerchandisingPillType clipsMerchandisingPillType : list4) {
                    if (clipsMerchandisingPillType != null) {
                        anonymousClass182.A0u(clipsMerchandisingPillType.A00);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        String str19 = c88513x8.A0W;
        if (str19 != null) {
            anonymousClass182.A0S("music_canonical_id", str19);
        }
        MusicInfo musicInfo = c88513x8.A08;
        if (musicInfo != null) {
            anonymousClass182.A0r("music_info");
            C3XO.A00(anonymousClass182, musicInfo.Ewz(new C37761pD(null)));
        }
        C5HN c5hn = c88513x8.A0J;
        if (c5hn != null) {
            anonymousClass182.A0r("nux_info");
            C26160Bhl F4K = c5hn.F4K();
            anonymousClass182.A0d();
            anonymousClass182.A0Q(AbstractC111324zv.A00(1012), F4K.A00);
            anonymousClass182.A0R("qp_id", F4K.A01);
            anonymousClass182.A0a();
        }
        OriginalSoundData originalSoundData = c88513x8.A09;
        if (originalSoundData != null) {
            anonymousClass182.A0r("original_sound_info");
            C3XP.A00(anonymousClass182, originalSoundData);
        }
        OriginalityInfo originalityInfo = c88513x8.A0A;
        if (originalityInfo != null) {
            anonymousClass182.A0r("originality_info");
            OriginalityInfoImpl Exm = originalityInfo.Exm(new C37761pD(null));
            anonymousClass182.A0d();
            Boolean bool8 = Exm.A02;
            if (bool8 != null) {
                anonymousClass182.A0T("can_remove_originality_label", bool8.booleanValue());
            }
            OriginalityFollowButtonInfo originalityFollowButtonInfo = Exm.A00;
            if (originalityFollowButtonInfo != null) {
                anonymousClass182.A0r("follow_button_info");
                OriginalityFollowButtonInfoImpl Exk = originalityFollowButtonInfo.Exk();
                anonymousClass182.A0d();
                Boolean bool9 = Exk.A00;
                if (bool9 != null) {
                    anonymousClass182.A0T("is_original_author_in_author_exp", bool9.booleanValue());
                }
                Boolean bool10 = Exk.A01;
                if (bool10 != null) {
                    anonymousClass182.A0T("show_follow_bottom_sheet_button", bool10.booleanValue());
                }
                anonymousClass182.A0a();
            }
            OriginalitySourceMediaInfo originalitySourceMediaInfo = Exm.A01;
            if (originalitySourceMediaInfo != null) {
                anonymousClass182.A0r("original_media");
                OriginalitySourceMediaInfoImpl Exo = originalitySourceMediaInfo.Exo(new C37761pD(null));
                anonymousClass182.A0d();
                String str20 = Exo.A01;
                if (str20 != null) {
                    anonymousClass182.A0S("pk", str20);
                }
                User user = Exo.A00;
                if (user != null) {
                    anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                    Parcelable.Creator creator = User.CREATOR;
                    AbstractC38851rI.A08(anonymousClass182, user);
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        ProfessionalClipsUpsellType professionalClipsUpsellType = c88513x8.A0B;
        if (professionalClipsUpsellType != null) {
            anonymousClass182.A0S("professional_clips_upsell_type", professionalClipsUpsellType.A00);
        }
        String str21 = c88513x8.A0X;
        if (str21 != null) {
            anonymousClass182.A0S("reusable_text_attribute_string", str21);
        }
        List<C93094Fl> list5 = c88513x8.A0a;
        if (list5 != null) {
            C16V.A03(anonymousClass182, "reusable_text_info");
            for (C93094Fl c93094Fl : list5) {
                if (c93094Fl != null) {
                    AbstractC93044Fd.A00(anonymousClass182, c93094Fl);
                }
            }
            anonymousClass182.A0Z();
        }
        ClipsShoppingInfo clipsShoppingInfo = c88513x8.A0M;
        if (clipsShoppingInfo != null) {
            anonymousClass182.A0r("shopping_info");
            anonymousClass182.A0d();
            ClipsShoppingCTABar clipsShoppingCTABar = clipsShoppingInfo.A00;
            if (clipsShoppingCTABar != null) {
                anonymousClass182.A0r("clips_shopping_cta_bar");
                IRA.A00(anonymousClass182, clipsShoppingCTABar);
            }
            ProductCollection productCollection = clipsShoppingInfo.A01;
            if (productCollection != null) {
                anonymousClass182.A0r("collection_metadata");
                IT1.A00(anonymousClass182, productCollection.F7R(new C37761pD(null)));
            }
            List<ProductWrapper> list6 = clipsShoppingInfo.A02;
            if (list6 != null) {
                C16V.A03(anonymousClass182, "products");
                for (ProductWrapper productWrapper : list6) {
                    if (productWrapper != null) {
                        IT2.A00(anonymousClass182, productWrapper);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        Boolean bool11 = c88513x8.A0T;
        if (bool11 != null) {
            anonymousClass182.A0T("show_achievements", bool11.booleanValue());
        }
        Boolean bool12 = c88513x8.A0U;
        if (bool12 != null) {
            anonymousClass182.A0T("show_tips", bool12.booleanValue());
        }
        String str22 = c88513x8.A0Y;
        if (str22 != null) {
            anonymousClass182.A0S("stripped_media_id", str22);
        }
        InterfaceC110214xq interfaceC110214xq = c88513x8.A0K;
        if (interfaceC110214xq != null) {
            anonymousClass182.A0r("template_info");
            AbstractC88493x6.A01(anonymousClass182, interfaceC110214xq.F4L());
        }
        C5HR c5hr = c88513x8.A0L;
        if (c5hr != null) {
            anonymousClass182.A0r("viewer_interaction_settings");
            anonymousClass182.A0d();
            anonymousClass182.A0T(AbstractC111324zv.A00(888), c5hr.A01);
            anonymousClass182.A0T(AbstractC111324zv.A00(889), c5hr.A02);
            anonymousClass182.A0T(AbstractC111324zv.A00(890), c5hr.A03);
            anonymousClass182.A0T(AbstractC111324zv.A00(891), c5hr.A04);
            anonymousClass182.A0T(AbstractC111324zv.A00(892), c5hr.A05);
            anonymousClass182.A0T(AbstractC111324zv.A00(893), c5hr.A06);
            anonymousClass182.A0T(AbstractC111324zv.A00(894), c5hr.A07);
            anonymousClass182.A0T(AbstractC111324zv.A00(895), c5hr.A08);
            anonymousClass182.A0T(AbstractC111324zv.A00(896), c5hr.A09);
            anonymousClass182.A0T(AbstractC111324zv.A00(897), c5hr.A0A);
            anonymousClass182.A0T(AbstractC111324zv.A00(913), c5hr.A0B);
            InteractionUpsellCTAType interactionUpsellCTAType = c5hr.A00;
            if (interactionUpsellCTAType != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(1027), interactionUpsellCTAType.A00);
            }
            anonymousClass182.A0T(AbstractC111324zv.A00(1268), c5hr.A0C);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
