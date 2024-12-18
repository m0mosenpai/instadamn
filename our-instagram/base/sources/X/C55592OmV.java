package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.venue.LocationDict;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import kotlin.enums.EnumEntries;

/* renamed from: X.OmV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55592OmV implements C08T {
    public final /* synthetic */ ClipsSharingDraftViewModel A00;

    public C55592OmV(ClipsSharingDraftViewModel clipsSharingDraftViewModel) {
        this.A00 = clipsSharingDraftViewModel;
    }

    @Override // X.C08T
    public final Bundle ELr() {
        AnonymousClass817 anonymousClass817 = (AnonymousClass817) this.A00.A00.A02();
        if (anonymousClass817 != null) {
            C128175qm c128175qm = anonymousClass817.A01;
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C17z A0S = AbstractC167007dF.A0S(A0O);
            String str = c128175qm.A0T;
            if (str != null) {
                A0S.A0S(AbstractC50637MWy.A00(0, 10, 43), str);
            }
            List list = c128175qm.A0v;
            if (list != null) {
                Iterator A0q = AbstractC37301Gc2.A0q(A0S, "video_segments", list);
                while (A0q.hasNext()) {
                    C115475Kh c115475Kh = (C115475Kh) A0q.next();
                    if (c115475Kh != null) {
                        AbstractC115465Kg.A00(A0S, c115475Kh);
                    }
                }
                A0S.A0Z();
            }
            EnumC50651MXr enumC50651MXr = c128175qm.A0G;
            if (enumC50651MXr != null) {
                EnumEntries enumEntries = EnumC50651MXr.A00;
                A0S.A0S("draft_save_state", enumC50651MXr.toString());
            }
            OA3 oa3 = c128175qm.A0F;
            if (oa3 != null) {
                A0S.A0r("draft_save_metadata");
                A0S.A0d();
                A0S.A0R("last_save_time", oa3.A01);
                A0S.A0R("last_user_save_time", oa3.A02);
                A0S.A0R("last_precapture_save_time", oa3.A00);
                A0S.A0a();
            }
            C5JK c5jk = c128175qm.A0H;
            if (c5jk != null) {
                A0S.A0S("clips_creation_type", c5jk.A00);
            }
            String str2 = c128175qm.A0S;
            if (str2 != null) {
                A0S.A0S("caption", str2);
            }
            A0S.A0T("is_share_to_feed", c128175qm.A17);
            String str3 = c128175qm.A0i;
            if (str3 != null) {
                A0S.A0S("pending_media_id", str3);
            }
            C203248yh c203248yh = c128175qm.A0C;
            if (c203248yh != null) {
                A0S.A0r("post_capture_edits");
                AbstractC203258yi.A00(A0S, c203248yh);
            }
            List list2 = c128175qm.A0s;
            if (list2 != null) {
                Iterator A0q2 = AbstractC37301Gc2.A0q(A0S, "sticker_list", list2);
                while (A0q2.hasNext()) {
                    XBS xbs = (XBS) A0q2.next();
                    if (xbs != null) {
                        AbstractC70181WFj.A04(A0S, xbs);
                    }
                }
                A0S.A0Z();
            }
            List list3 = c128175qm.A0u;
            if (list3 != null) {
                Iterator A0q3 = AbstractC37301Gc2.A0q(A0S, "unschematized_compositions", list3);
                while (A0q3.hasNext()) {
                    JUM jum = (JUM) A0q3.next();
                    if (jum != null) {
                        AbstractC50608MVt.A00(jum, A0S);
                    }
                }
                A0S.A0Z();
            }
            EnumC50656MXw enumC50656MXw = c128175qm.A0P;
            if (enumC50656MXw != null) {
                A0S.A0Q("media_type", enumC50656MXw.A00);
            }
            ShareMediaLoggingInfo shareMediaLoggingInfo = c128175qm.A0B;
            if (shareMediaLoggingInfo != null) {
                A0S.A0r("logging_info");
                OOS.A00(A0S, shareMediaLoggingInfo);
            }
            AudioOverlayTrack audioOverlayTrack = c128175qm.A0N;
            if (audioOverlayTrack != null) {
                A0S.A0r("audio_overlay_track");
                AbstractC37894Glp.A00(A0S, audioOverlayTrack);
            }
            AudioOverlayTrack audioOverlayTrack2 = c128175qm.A0M;
            if (audioOverlayTrack2 != null) {
                A0S.A0r("attribution_only_audio_overlay_track");
                AbstractC37894Glp.A00(A0S, audioOverlayTrack2);
            }
            C9JS c9js = c128175qm.A0E;
            if (c9js != null) {
                A0S.A0r("remix_model");
                C9JR.A00(A0S, c9js);
            }
            String str4 = c128175qm.A0h;
            if (str4 != null) {
                A0S.A0S("original_destination_type", str4);
            }
            String str5 = c128175qm.A0V;
            if (str5 != null) {
                A0S.A0S("cover_photo_path", str5);
            }
            MediaCroppingCoordinates mediaCroppingCoordinates = c128175qm.A06;
            if (mediaCroppingCoordinates != null) {
                A0S.A0r("crop_coordinates");
                AbstractC88283wd.A01(A0S, mediaCroppingCoordinates);
            }
            String str6 = c128175qm.A0X;
            if (str6 != null) {
                A0S.A0S("funded_content_deal_id", str6);
            }
            List list4 = c128175qm.A0q;
            if (list4 != null) {
                Iterator A0q4 = AbstractC37301Gc2.A0q(A0S, "people_tags", list4);
                while (A0q4.hasNext()) {
                    PeopleTag peopleTag = (PeopleTag) A0q4.next();
                    if (peopleTag != null) {
                        IR0.A00(A0S, peopleTag);
                    }
                }
                A0S.A0Z();
            }
            C101394gx c101394gx = c128175qm.A0O;
            if (c101394gx != null) {
                A0S.A0r("comment_poll");
                AbstractC101354gs.A00(A0S, c101394gx, true);
            }
            EnumC76383bi enumC76383bi = c128175qm.A0K;
            if (enumC76383bi != null) {
                A0S.A0S("audience", enumC76383bi.A00);
            }
            LocationDict locationDict = c128175qm.A0L;
            if (locationDict != null) {
                A0S.A0r("location");
                AbstractC84373pU.A00(A0S, locationDict);
            }
            List list5 = c128175qm.A0o;
            if (list5 != null) {
                Iterator A0q5 = AbstractC37301Gc2.A0q(A0S, "interest_topics", list5);
                while (A0q5.hasNext()) {
                    AbstractC167017dG.A1F(A0S, A0q5);
                }
                A0S.A0Z();
            }
            String str7 = c128175qm.A0U;
            if (str7 != null) {
                A0S.A0S("collaborator_id", str7);
            }
            List list6 = c128175qm.A0n;
            if (list6 != null) {
                Iterator A0q6 = AbstractC37301Gc2.A0q(A0S, "collaborator_ids", list6);
                while (A0q6.hasNext()) {
                    AbstractC167017dG.A1F(A0S, A0q6);
                }
                A0S.A0Z();
            }
            String str8 = c128175qm.A0W;
            if (str8 != null) {
                A0S.A0S(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str8);
            }
            String str9 = c128175qm.A0g;
            if (str9 != null) {
                A0S.A0S("original_audio_title", str9);
            }
            List list7 = c128175qm.A0p;
            if (list7 != null) {
                Iterator A0q7 = AbstractC37301Gc2.A0q(A0S, "multiple_audio_tracks", list7);
                while (A0q7.hasNext()) {
                    AudioOverlayTrack audioOverlayTrack3 = (AudioOverlayTrack) A0q7.next();
                    if (audioOverlayTrack3 != null) {
                        AbstractC37894Glp.A00(A0S, audioOverlayTrack3);
                    }
                }
                A0S.A0Z();
            }
            List list8 = c128175qm.A0l;
            if (list8 != null) {
                Iterator A0q8 = AbstractC37301Gc2.A0q(A0S, "clips_sound_effects", list8);
                while (A0q8.hasNext()) {
                    C9ZT c9zt = (C9ZT) A0q8.next();
                    if (c9zt != null) {
                        AbstractC23026ADi.A00(A0S, c9zt);
                    }
                }
                A0S.A0Z();
            }
            C110204xp c110204xp = c128175qm.A08;
            if (c110204xp != null) {
                A0S.A0r("clips_template_info");
                AbstractC88493x6.A01(A0S, c110204xp);
            }
            A0S.A0T("template_disabled", c128175qm.A19);
            List list9 = c128175qm.A0k;
            if (list9 != null) {
                Iterator A0q9 = AbstractC37301Gc2.A0q(A0S, "clips_multiple_audio_segments", list9);
                while (A0q9.hasNext()) {
                    AbstractC167017dG.A1F(A0S, A0q9);
                }
                A0S.A0Z();
            }
            List list10 = c128175qm.A0j;
            if (list10 != null) {
                Iterator A0q10 = AbstractC37301Gc2.A0q(A0S, "audio_effects", list10);
                while (A0q10.hasNext()) {
                    if (A0q10.next() != null) {
                        A0S.A0d();
                        A0S.A0a();
                    }
                }
                A0S.A0Z();
            }
            UpcomingEventImpl upcomingEventImpl = c128175qm.A0Q;
            if (upcomingEventImpl != null) {
                A0S.A0r("upcoming_event");
                IT3.A00(A0S, upcomingEventImpl);
            }
            String str10 = c128175qm.A0b;
            if (str10 != null) {
                A0S.A0S("media_id", str10);
            }
            CropInfo cropInfo = c128175qm.A0A;
            if (cropInfo != null) {
                A0S.A0r("video_crop_info");
                AbstractC203458z2.A00(A0S, cropInfo);
            }
            C54632OBh c54632OBh = c128175qm.A0D;
            if (c54632OBh != null) {
                A0S.A0r("branded_content_tags_model");
                AbstractC54866OOb.A00(A0S, c54632OBh);
            }
            C38686GzR c38686GzR = c128175qm.A04;
            if (c38686GzR != null) {
                A0S.A0r("clips_shopping_metadata");
                AbstractC41651Ibj.A01(c38686GzR, A0S);
            }
            OL5 ol5 = c128175qm.A09;
            if (ol5 != null) {
                A0S.A0r("facebook_cross_posting_model");
                A0S.A0d();
                A0S.A0T("enabled", ol5.A05);
                A0S.A0T("is_account_linked", ol5.A06);
                String str11 = ol5.A01;
                if (str11 != null) {
                    A0S.A0S("account_id", str11);
                }
                String str12 = ol5.A03;
                if (str12 != null) {
                    A0S.A0S("posting_type", str12);
                }
                String str13 = ol5.A02;
                if (str13 != null) {
                    A0S.A0S("page_name", str13);
                }
                A0S.A0T("reels_share_to_facebook", ol5.A08);
                String str14 = ol5.A04;
                if (str14 != null) {
                    A0S.A0S("reels_destination_id", str14);
                }
                Integer num = ol5.A00;
                if (num != null) {
                    A0S.A0S("reels_cross_app_share_type", AbstractC54209Nxn.A00(num));
                }
                A0S.A0T("reels_cross_app_share_fb_validation_check_bypass", ol5.A07);
                A0S.A0a();
            }
            List list11 = c128175qm.A0t;
            if (list11 != null) {
                Iterator A0q11 = AbstractC37301Gc2.A0q(A0S, "target_profiles", list11);
                while (A0q11.hasNext()) {
                    PendingRecipient pendingRecipient = (PendingRecipient) A0q11.next();
                    if (pendingRecipient != null) {
                        C7NT.A00(A0S, pendingRecipient);
                    }
                }
                A0S.A0Z();
            }
            A0S.A0T("is_draft_for_posted_clip", c128175qm.A12);
            A0S.A0T("is_vcr_sticker_added", c128175qm.A18);
            String str15 = c128175qm.A0a;
            if (str15 != null) {
                A0S.A0S("linked_highlight_id", str15);
            }
            String str16 = c128175qm.A0Z;
            if (str16 != null) {
                A0S.A0S("highlight_media_id", str16);
            }
            ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel = c128175qm.A0R;
            if (existingStandaloneFundraiserForFeedModel != null) {
                A0S.A0r("existing_fundraiser_to_attach");
                AbstractC54908OQf.A00(A0S, existingStandaloneFundraiserForFeedModel);
            }
            String str17 = c128175qm.A0Y;
            if (str17 != null) {
                A0S.A0S("fundraiser_user_id", str17);
            }
            NewFundraiserInfo newFundraiserInfo = c128175qm.A0J;
            if (newFundraiserInfo != null) {
                A0S.A0r("new_fundraiser_model");
                OY1.A01(A0S, newFundraiserInfo);
            }
            A0S.A0T("is_comment_disabled", c128175qm.A11);
            A0S.A0T("is_caption_disabled", c128175qm.A0z);
            A0S.A0T("is_like_and_view_counts_disabled", c128175qm.A14);
            A0S.A0T("is_share_count_disabled", c128175qm.A16);
            A0S.A0T("is_gifting_enabled", c128175qm.A13);
            List list12 = c128175qm.A0r;
            if (list12 != null) {
                Iterator A0q12 = AbstractC37301Gc2.A0q(A0S, "stacked_timeline_actions", list12);
                while (A0q12.hasNext()) {
                    C51710Msf c51710Msf = (C51710Msf) A0q12.next();
                    if (c51710Msf != null) {
                        AbstractC54871OOg.A00(A0S, c51710Msf);
                    }
                }
                A0S.A0Z();
            }
            String str18 = c128175qm.A0f;
            if (str18 != null) {
                A0S.A0S("org_cta_type", str18);
            }
            A0S.A0Q("max_duration_in_ms", c128175qm.A00);
            A0S.A0R("created_at_time", c128175qm.A01);
            A0S.A0T("hide_from_profile_grid", c128175qm.A0y);
            A0S.A0T("disable_audio_filters", c128175qm.A0w);
            String str19 = c128175qm.A0d;
            if (str19 != null) {
                A0S.A0S("meta_verified_added_link", str19);
            }
            String str20 = c128175qm.A0c;
            if (str20 != null) {
                A0S.A0S("metagallery_media_id", str20);
            }
            String str21 = c128175qm.A0e;
            if (str21 != null) {
                A0S.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str21);
            }
            List list13 = c128175qm.A0m;
            if (list13 != null) {
                Iterator A0q13 = AbstractC37301Gc2.A0q(A0S, "clips_spin_swappable_text_list", list13);
                while (A0q13.hasNext()) {
                    C38700H2l c38700H2l = (C38700H2l) A0q13.next();
                    if (c38700H2l != null) {
                        AbstractC41251INr.A00(A0S, c38700H2l);
                    }
                }
                A0S.A0Z();
            }
            C51685MsG c51685MsG = c128175qm.A0I;
            if (c51685MsG != null) {
                A0S.A0r("bio_product");
                OXq.A01(A0S, c51685MsG);
            }
            E72 e72 = c128175qm.A03;
            if (e72 != null) {
                A0S.A0r("audio_translations_creation_info");
                OOH.A00(e72, A0S);
            }
            C51756Mtf c51756Mtf = c128175qm.A02;
            if (c51756Mtf != null) {
                A0S.A0r("trial_params");
                OOx.A00(c51756Mtf, A0S);
            }
            C38709H2v c38709H2v = c128175qm.A05;
            if (c38709H2v != null) {
                A0S.A0r("content_scheduling_metadata");
                ONO.A00(A0S, c38709H2v);
            }
            A0S.A0T("has_comment_prompt", c128175qm.A0x);
            MediaGenAIDetectionMethod mediaGenAIDetectionMethod = c128175qm.A07;
            if (mediaGenAIDetectionMethod != null) {
                A0S.A0S("gen_ai_detection_method", mediaGenAIDetectionMethod.A00);
            }
            A0S.A0T("is_pinned", c128175qm.A15);
            A0S.A0T("is_closed_captions_toggle_enabled", c128175qm.A10);
            A0S.A0T("third_party_downloads_enabled", c128175qm.A1A);
            return AbstractC31178DnM.A06("key_serialized_draft", AbstractC167017dG.A0l(A0S, A0O));
        }
        return AbstractC166987dD.A0b();
    }
}
