package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.venue.LocationDict;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.enums.EnumEntries;

/* renamed from: X.Nsk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53911Nsk {
    public static C128175qm parseFromJson(C16L c16l) {
        String str;
        String A00;
        C0KX c0kx;
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            String str2 = null;
            ArrayList arrayList = null;
            EnumC50651MXr enumC50651MXr = null;
            OA3 oa3 = null;
            C5JK c5jk = null;
            String str3 = null;
            String str4 = null;
            C203248yh c203248yh = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            EnumC50656MXw enumC50656MXw = null;
            ShareMediaLoggingInfo shareMediaLoggingInfo = null;
            AudioOverlayTrack audioOverlayTrack = null;
            AudioOverlayTrack audioOverlayTrack2 = null;
            C9JS c9js = null;
            String str5 = null;
            String str6 = null;
            MediaCroppingCoordinates mediaCroppingCoordinates = null;
            String str7 = null;
            ArrayList arrayList4 = null;
            C101394gx c101394gx = null;
            EnumC76383bi enumC76383bi = null;
            LocationDict locationDict = null;
            ArrayList arrayList5 = null;
            String str8 = null;
            ArrayList arrayList6 = null;
            String str9 = null;
            String str10 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            C110204xp c110204xp = null;
            ArrayList arrayList9 = null;
            ArrayList arrayList10 = null;
            UpcomingEventImpl upcomingEventImpl = null;
            String str11 = null;
            CropInfo cropInfo = null;
            C54632OBh c54632OBh = null;
            C38686GzR c38686GzR = null;
            OL5 ol5 = null;
            ArrayList arrayList11 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            String str12 = null;
            String str13 = null;
            ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel = null;
            String str14 = null;
            NewFundraiserInfo newFundraiserInfo = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            ArrayList arrayList12 = null;
            String str15 = null;
            Integer num = null;
            Long l = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            ArrayList arrayList13 = null;
            C51685MsG c51685MsG = null;
            E72 e72 = null;
            C51756Mtf c51756Mtf = null;
            C38709H2v c38709H2v = null;
            Boolean bool12 = null;
            MediaGenAIDetectionMethod mediaGenAIDetectionMethod = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                str = "is_caption_disabled";
                A00 = AbstractC50637MWy.A00(0, 10, 43);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("video_segments".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C115475Kh parseFromJson = AbstractC115465Kg.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("draft_save_state".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    EnumEntries enumEntries = EnumC50651MXr.A00;
                    int i = 0;
                    C14360o3.A0B(A1P4, 0);
                    EnumC50651MXr[] values = EnumC50651MXr.values();
                    int length = values.length;
                    while (true) {
                        if (i < length) {
                            enumC50651MXr = values[i];
                            if (!C14360o3.A0K(enumC50651MXr.toString(), A1P4)) {
                                i++;
                            }
                        } else {
                            enumC50651MXr = null;
                            break;
                        }
                    }
                } else if ("draft_save_metadata".equals(A0s)) {
                    oa3 = AbstractC53912Nsl.parseFromJson(c16l);
                } else if ("clips_creation_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    C5JK c5jk2 = (C5JK) C5JK.A01.get(A1P3);
                    c5jk = c5jk2;
                    if (c5jk2 == null) {
                        c5jk = C5JK.A05;
                    }
                } else if ("caption".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("is_share_to_feed".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("pending_media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("post_capture_edits".equals(A0s)) {
                    c203248yh = AbstractC203258yi.parseFromJson(c16l);
                } else if ("sticker_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            XBS parseFromJson2 = AbstractC70181WFj.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("unschematized_compositions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            JUM parseFromJson3 = AbstractC50608MVt.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("media_type".equals(A0s)) {
                    enumC50656MXw = (EnumC50656MXw) AbstractC166997dE.A0m(EnumC50656MXw.A01, c16l.A1D());
                } else if ("logging_info".equals(A0s)) {
                    shareMediaLoggingInfo = OOS.parseFromJson(c16l);
                } else if ("audio_overlay_track".equals(A0s)) {
                    audioOverlayTrack = AbstractC37894Glp.parseFromJson(c16l);
                } else if ("attribution_only_audio_overlay_track".equals(A0s)) {
                    audioOverlayTrack2 = AbstractC37894Glp.parseFromJson(c16l);
                } else if ("remix_model".equals(A0s)) {
                    c9js = C9JR.parseFromJson(c16l);
                } else if ("original_destination_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("cover_photo_path".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("crop_coordinates".equals(A0s)) {
                    mediaCroppingCoordinates = AbstractC88283wd.parseFromJson(c16l);
                } else if ("funded_content_deal_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("people_tags".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            PeopleTag parseFromJson4 = IR0.parseFromJson(c16l);
                            if (parseFromJson4 != null) {
                                arrayList4.add(parseFromJson4);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("comment_poll".equals(A0s)) {
                    c101394gx = AbstractC101354gs.parseFromJson(c16l);
                } else if ("audience".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    enumC76383bi = (EnumC76383bi) EnumC76383bi.A01.get(A1P2);
                } else if ("location".equals(A0s)) {
                    locationDict = AbstractC84373pU.parseFromJson(c16l);
                } else if ("interest_topics".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList5);
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("collaborator_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("collaborator_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList6 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList6);
                        }
                    } else {
                        arrayList6 = null;
                    }
                } else if (ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("original_audio_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("multiple_audio_tracks".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList7 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AudioOverlayTrack parseFromJson5 = AbstractC37894Glp.parseFromJson(c16l);
                            if (parseFromJson5 != null) {
                                arrayList7.add(parseFromJson5);
                            }
                        }
                    } else {
                        arrayList7 = null;
                    }
                } else if ("clips_sound_effects".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList8 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C9ZT parseFromJson6 = AbstractC23026ADi.parseFromJson(c16l);
                            if (parseFromJson6 != null) {
                                arrayList8.add(parseFromJson6);
                            }
                        }
                    } else {
                        arrayList8 = null;
                    }
                } else if ("clips_template_info".equals(A0s)) {
                    c110204xp = AbstractC88493x6.parseFromJson(c16l);
                } else if ("template_disabled".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("clips_multiple_audio_segments".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList9 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList9);
                        }
                    } else {
                        arrayList9 = null;
                    }
                } else if ("audio_effects".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList10 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C115585Ks parseFromJson7 = AbstractC115575Kr.parseFromJson(c16l);
                            if (parseFromJson7 != null) {
                                arrayList10.add(parseFromJson7);
                            }
                        }
                    } else {
                        arrayList10 = null;
                    }
                } else if ("upcoming_event".equals(A0s)) {
                    upcomingEventImpl = IT3.parseFromJson(c16l);
                } else if ("media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("video_crop_info".equals(A0s)) {
                    cropInfo = AbstractC203458z2.parseFromJson(c16l);
                } else if ("branded_content_tags_model".equals(A0s)) {
                    c54632OBh = AbstractC54866OOb.parseFromJson(c16l);
                } else if ("clips_shopping_metadata".equals(A0s)) {
                    c38686GzR = AbstractC41651Ibj.parseFromJson(c16l);
                } else if ("facebook_cross_posting_model".equals(A0s)) {
                    ol5 = AbstractC53870Nry.parseFromJson(c16l);
                } else if ("target_profiles".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList11 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            PendingRecipient parseFromJson8 = C7NT.parseFromJson(c16l);
                            if (parseFromJson8 != null) {
                                arrayList11.add(parseFromJson8);
                            }
                        }
                    } else {
                        arrayList11 = null;
                    }
                } else if ("is_draft_for_posted_clip".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("is_vcr_sticker_added".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("linked_highlight_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else if ("highlight_media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str13 = null;
                    } else {
                        str13 = c16l.A1P();
                    }
                } else if ("existing_fundraiser_to_attach".equals(A0s)) {
                    existingStandaloneFundraiserForFeedModel = AbstractC54908OQf.parseFromJson(c16l);
                } else if ("fundraiser_user_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str14 = null;
                    } else {
                        str14 = c16l.A1P();
                    }
                } else if ("new_fundraiser_model".equals(A0s)) {
                    newFundraiserInfo = OY1.parseFromJson(c16l);
                } else if ("is_comment_disabled".equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                } else if ("is_caption_disabled".equals(A0s)) {
                    bool6 = AbstractC166997dE.A0d(c16l);
                } else if ("is_like_and_view_counts_disabled".equals(A0s)) {
                    bool7 = AbstractC166997dE.A0d(c16l);
                } else if ("is_share_count_disabled".equals(A0s)) {
                    bool8 = AbstractC166997dE.A0d(c16l);
                } else if ("is_gifting_enabled".equals(A0s)) {
                    bool9 = AbstractC166997dE.A0d(c16l);
                } else if ("stacked_timeline_actions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList12 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51710Msf parseFromJson9 = AbstractC54871OOg.parseFromJson(c16l);
                            if (parseFromJson9 != null) {
                                arrayList12.add(parseFromJson9);
                            }
                        }
                    } else {
                        arrayList12 = null;
                    }
                } else if ("org_cta_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str15 = null;
                    } else {
                        str15 = c16l.A1P();
                    }
                } else if ("max_duration_in_ms".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("created_at_time".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("hide_from_profile_grid".equals(A0s)) {
                    bool10 = AbstractC166997dE.A0d(c16l);
                } else if ("disable_audio_filters".equals(A0s)) {
                    bool11 = AbstractC166997dE.A0d(c16l);
                } else if ("meta_verified_added_link".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str16 = null;
                    } else {
                        str16 = c16l.A1P();
                    }
                } else if ("metagallery_media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str17 = null;
                    } else {
                        str17 = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str18 = null;
                    } else {
                        str18 = c16l.A1P();
                    }
                } else if ("clips_spin_swappable_text_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList13 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38700H2l parseFromJson10 = AbstractC41251INr.parseFromJson(c16l);
                            if (parseFromJson10 != null) {
                                arrayList13.add(parseFromJson10);
                            }
                        }
                    } else {
                        arrayList13 = null;
                    }
                } else if ("bio_product".equals(A0s)) {
                    c51685MsG = OXq.parseFromJson(c16l);
                } else if ("audio_translations_creation_info".equals(A0s)) {
                    e72 = OOH.parseFromJson(c16l);
                } else if ("trial_params".equals(A0s)) {
                    c51756Mtf = OOx.parseFromJson(c16l);
                } else if ("content_scheduling_metadata".equals(A0s)) {
                    c38709H2v = ONO.parseFromJson(c16l);
                } else if ("has_comment_prompt".equals(A0s)) {
                    bool12 = AbstractC166997dE.A0d(c16l);
                } else if ("gen_ai_detection_method".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    mediaGenAIDetectionMethod = AbstractC85933sM.A00(A1P);
                } else if ("is_pinned".equals(A0s)) {
                    bool13 = AbstractC166997dE.A0d(c16l);
                } else if ("is_closed_captions_toggle_enabled".equals(A0s)) {
                    bool14 = AbstractC166997dE.A0d(c16l);
                } else {
                    bool15 = AbstractC37303Gc4.A0K(c16l, bool15, A0s, "third_party_downloads_enabled");
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "ClipsDraft");
            } else if (arrayList != null || !(c16l instanceof C07950bF)) {
                if (enumC50651MXr == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("draft_save_state", c16l, "ClipsDraft");
                } else if (oa3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("draft_save_metadata", c16l, "ClipsDraft");
                } else if (c5jk == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("clips_creation_type", c16l, "ClipsDraft");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_share_to_feed", c16l, "ClipsDraft");
                } else if (arrayList3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("unschematized_compositions", c16l, "ClipsDraft");
                } else if (enumC50656MXw == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("media_type", c16l, "ClipsDraft");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("template_disabled", c16l, "ClipsDraft");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_draft_for_posted_clip", c16l, "ClipsDraft");
                } else if (bool4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_vcr_sticker_added", c16l, "ClipsDraft");
                } else if (bool5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_comment_disabled", c16l, "ClipsDraft");
                } else {
                    if (bool6 == null && (c16l instanceof C07950bF)) {
                        c0kx = ((C07950bF) c16l).A03;
                    } else if (bool7 == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("is_like_and_view_counts_disabled", c16l, "ClipsDraft");
                    } else if (bool8 == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("is_share_count_disabled", c16l, "ClipsDraft");
                    } else if (bool9 == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("is_gifting_enabled", c16l, "ClipsDraft");
                    } else if (num == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("max_duration_in_ms", c16l, "ClipsDraft");
                    } else if (l == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("created_at_time", c16l, "ClipsDraft");
                    } else if (bool10 == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("hide_from_profile_grid", c16l, "ClipsDraft");
                    } else if (bool11 == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("disable_audio_filters", c16l, "ClipsDraft");
                    } else if (bool12 != null || !(c16l instanceof C07950bF)) {
                        if (bool13 == null && (c16l instanceof C07950bF)) {
                            c0kx = ((C07950bF) c16l).A03;
                            str = "is_pinned";
                        } else if (bool14 == null && (c16l instanceof C07950bF)) {
                            c0kx = ((C07950bF) c16l).A03;
                            str = "is_closed_captions_toggle_enabled";
                        } else if (bool15 == null && (c16l instanceof C07950bF)) {
                            c0kx = ((C07950bF) c16l).A03;
                            str = "third_party_downloads_enabled";
                        } else {
                            return new C128175qm(c51756Mtf, e72, c38686GzR, c38709H2v, mediaCroppingCoordinates, mediaGenAIDetectionMethod, c110204xp, ol5, cropInfo, shareMediaLoggingInfo, c203248yh, c54632OBh, c9js, oa3, enumC50651MXr, c5jk, c51685MsG, newFundraiserInfo, enumC76383bi, locationDict, audioOverlayTrack, audioOverlayTrack2, c101394gx, enumC50656MXw, upcomingEventImpl, existingStandaloneFundraiserForFeedModel, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, arrayList11, arrayList12, arrayList13, num.intValue(), l.longValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue(), bool7.booleanValue(), bool8.booleanValue(), bool9.booleanValue(), bool10.booleanValue(), bool11.booleanValue(), bool12.booleanValue(), bool13.booleanValue(), bool14.booleanValue(), bool15.booleanValue());
                        }
                    } else {
                        c0kx = ((C07950bF) c16l).A03;
                        str = "has_comment_prompt";
                    }
                    c0kx.A00(str, "ClipsDraft");
                }
            } else {
                AbstractC166997dE.A1V("video_segments", c16l, "ClipsDraft");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
