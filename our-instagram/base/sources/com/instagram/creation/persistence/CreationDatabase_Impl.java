package com.instagram.creation.persistence;

import X.AbstractC28801aI;
import X.AbstractC28981ab;
import X.C28381Yz;
import X.C28621Zy;
import X.C28861aP;
import X.C2PV;
import X.C2PX;
import X.C2PY;
import X.C2PZ;
import X.C37471ok;
import X.C49432Pa;
import X.C49442Pb;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.creation.persistence.CreationDatabase_Impl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class CreationDatabase_Impl extends CreationDatabase {
    public volatile C2PX A00;
    public volatile C2PY A01;
    public volatile C49432Pa A02;
    public volatile C2PZ A03;
    public volatile C2PV A04;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, new HashMap(0), new HashMap(0), "drafts", "audio_amplitudes", "audio_tracks", "clips_remix_original_media", "story_drafts");
    }

    @Override // com.instagram.creation.persistence.CreationDatabase
    public final C2PV A00() {
        C2PV c2pv;
        if (this.A04 != null) {
            return this.A04;
        }
        synchronized (this) {
            if (this.A04 == null) {
                this.A04 = new C49442Pb(this);
            }
            c2pv = this.A04;
        }
        return c2pv;
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("DELETE FROM `drafts`");
            CHx.ATG("DELETE FROM `audio_amplitudes`");
            CHx.ATG("DELETE FROM `audio_tracks`");
            CHx.ATG("DELETE FROM `clips_remix_original_media`");
            CHx.ATG("DELETE FROM `story_drafts`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            CHx.E7O("PRAGMA wal_checkpoint(FULL)").close();
            if (!((C37471ok) CHx).A00.inTransaction()) {
                CHx.ATG("VACUUM");
            }
        }
    }

    @Override // X.C1YP
    public final InterfaceC29101an createOpenHelper(C28381Yz c28381Yz) {
        return c28381Yz.A02.AL5(AbstractC28981ab.A00(c28381Yz.A00, new C28861aP(c28381Yz, new AbstractC28801aI() { // from class: X.2PU
            @Override // X.AbstractC28801aI
            public final void onPostMigrate(InterfaceC37481ol interfaceC37481ol) {
            }

            {
                super(43);
            }

            @Override // X.AbstractC28801aI
            public final void createAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `drafts` (`id` TEXT NOT NULL, `clips_creation_type` TEXT NOT NULL, `last_user_save_time` INTEGER NOT NULL DEFAULT -1, `last_save_time` INTEGER NOT NULL DEFAULT -1, `created_at_time` INTEGER NOT NULL DEFAULT -1, `last_pre_capture_save_time` INTEGER NOT NULL DEFAULT -1, `was_last_save_user_initiated` INTEGER NOT NULL DEFAULT 0, `name` TEXT, `video_segments` TEXT NOT NULL, `retake_video_segments` TEXT, `audio_Track` TEXT, `attriubtion_only_audio_track` TEXT, `pending_media_key` TEXT, `post_capture_media_edits` TEXT, `logging_info` TEXT, `remix_info` TEXT, `original_destination_type` TEXT, `caption` TEXT NOT NULL DEFAULT '', `cover_photo_file_uri` TEXT, `is_share_to_feed` INTEGER NOT NULL DEFAULT 1, `funded_content_deal_id` TEXT, `people_tags` TEXT NOT NULL, `comment_poll` TEXT, `audience` TEXT, `collaborator_id` TEXT, `collaborator_ids` TEXT NOT NULL, `entry_point` TEXT, `location` TEXT, `original_audio_title` TEXT, `multiple_audio_tracks` TEXT NOT NULL, `clips_sound_effects` TEXT NOT NULL, `clips_template_info` TEXT, `template_disabled` INTEGER NOT NULL, `clips_multiple_audio_segments` TEXT NOT NULL, `upcoming_event` TEXT, `linked_highlight_id` TEXT, `highlight_media_id` TEXT, `media_id` TEXT, `voice_effect` TEXT, `audio_enhancement_effect` TEXT, `clips_draft_info_version` INTEGER, `has_published_clip` INTEGER NOT NULL DEFAULT 0, `branded_content_tags_model` TEXT, `clips_shopping_metadata` TEXT, `is_comment_disabled` INTEGER NOT NULL DEFAULT 0, `is_caption_enabled` INTEGER NOT NULL DEFAULT 0, `is_like_and_view_counts_disabled` INTEGER NOT NULL DEFAULT 0, `is_share_count_disabled` INTEGER NOT NULL DEFAULT 0, `is_gifts_allowed` INTEGER NOT NULL DEFAULT 1, `interest_topics` TEXT NOT NULL, `stacked_timeline_actions` TEXT NOT NULL, `org_cta_type` TEXT, `max_duration_in_ms` INTEGER NOT NULL DEFAULT 0, `hide_from_profile_grid` INTEGER NOT NULL DEFAULT 0, `meta_verified_added_link` TEXT, `metagallery_media_id` TEXT, `bio_product` TEXT, `content_scheduling_metadata` TEXT, `trial_params` TEXT, `has_comment_prompt` INTEGER NOT NULL, `gen_ai_detection_method` TEXT, `is_pinned` INTEGER NOT NULL, `third_party_downloads_enabled` INTEGER NOT NULL, `cropcords_cropLeft` REAL, `cropcords_cropTop` REAL, `cropcords_cropRight` REAL, `cropcords_cropBottom` REAL, `feedmetadata_title` TEXT, `feedmetadata_previewCropCoordinates` TEXT, `feedmetadata_isInternal` INTEGER, `feedmetadata_shareToFacebook` INTEGER, `feedmetadata_seriesId` TEXT, `feedmetadata_shoppingMetadata` TEXT, `feedmetadata_isUnifiedvideo` INTEGER, `feedmetadata_coverIsCustom` INTEGER, `feedmetadata_coverWidth` INTEGER, `feedmetadata_coverHeight` INTEGER, `feedmetadata_coverFromVideoTimeMs` INTEGER, `feedmetadata_coverIsFromVideoEdited` INTEGER, `feedmetadata_areCaptionsEnabled` INTEGER, `feedmetadata_areCommentsDisabled` INTEGER, `feedmetadata_isFundedContentDeal` INTEGER, `feedmetadata_isPaidPartnership` INTEGER, `feedmetadata_brandedContentTags` TEXT, `feedmetadata_partnerBoostEnabled` INTEGER, `feedmetadata_isLikeAndViewCountsDisabled` INTEGER, `feedmetadata_filterId` INTEGER, `feedmetadata_filterStrength` INTEGER, `feedmetadata_postCropAspectRatio` REAL, `feedmetadata_isLandscape` INTEGER, `videocrop_width` INTEGER, `videocrop_height` INTEGER, `videocrop_rectF` TEXT, `mediadraft_version` INTEGER NOT NULL DEFAULT 0, `mediadraft_stickers` TEXT, `mediadraft_unschematized_compositions` TEXT NOT NULL DEFAULT '', `mediadraft_media_type` INTEGER NOT NULL DEFAULT 2, PRIMARY KEY(`id`))");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `audio_amplitudes` (`audio_asset_id` TEXT NOT NULL, `audio_amplitudes_list` TEXT NOT NULL, `last_used_time_ms` INTEGER NOT NULL, PRIMARY KEY(`audio_asset_id`))");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `audio_tracks` (`audio_track_id` TEXT NOT NULL, `start_time_ms` INTEGER NOT NULL, `duration_ms` INTEGER NOT NULL, `file_path` TEXT NOT NULL, `last_used_time_ms` INTEGER NOT NULL, PRIMARY KEY(`audio_track_id`, `start_time_ms`))");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `clips_remix_original_media` (`media_id` TEXT NOT NULL, `file_path` TEXT NOT NULL, `file_size` INTEGER NOT NULL, `last_used_time_ms` INTEGER NOT NULL, PRIMARY KEY(`media_id`))");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `story_drafts` (`draft_id` TEXT NOT NULL, `revision_id` TEXT NOT NULL, `composition_id` TEXT NOT NULL, `date_created` INTEGER NOT NULL, `date_modified` INTEGER NOT NULL, `media_info` TEXT, `persisted_media_info` TEXT, `media_edits` TEXT, `cover_file_path` TEXT, PRIMARY KEY(`draft_id`))");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                interfaceC37481ol.ATG("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '84dc2eaff08ae87ec0ecc1161d786465')");
            }

            @Override // X.AbstractC28801aI
            public final void dropAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `drafts`");
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `audio_amplitudes`");
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `audio_tracks`");
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `clips_remix_original_media`");
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `story_drafts`");
                List list = CreationDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A01(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onCreate(InterfaceC37481ol interfaceC37481ol) {
                List list = CreationDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A00(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onOpen(InterfaceC37481ol interfaceC37481ol) {
                CreationDatabase_Impl creationDatabase_Impl = CreationDatabase_Impl.this;
                creationDatabase_Impl.mDatabase = interfaceC37481ol;
                creationDatabase_Impl.internalInitInvalidationTracker(interfaceC37481ol);
                List list = creationDatabase_Impl.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A02(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final A6Q onValidateSchema(InterfaceC37481ol interfaceC37481ol) {
                StringBuilder sb;
                String str;
                HashMap hashMap = new HashMap(97);
                hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new C63003SaR(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "TEXT", null, 1, 1, true));
                hashMap.put("clips_creation_type", new C63003SaR("clips_creation_type", "TEXT", null, 0, 1, true));
                hashMap.put("last_user_save_time", new C63003SaR("last_user_save_time", "INTEGER", "-1", 0, 1, true));
                hashMap.put("last_save_time", new C63003SaR("last_save_time", "INTEGER", "-1", 0, 1, true));
                hashMap.put("created_at_time", new C63003SaR("created_at_time", "INTEGER", "-1", 0, 1, true));
                hashMap.put("last_pre_capture_save_time", new C63003SaR("last_pre_capture_save_time", "INTEGER", "-1", 0, 1, true));
                hashMap.put("was_last_save_user_initiated", new C63003SaR("was_last_save_user_initiated", "INTEGER", "0", 0, 1, true));
                hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, new C63003SaR(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "TEXT", null, 0, 1, false));
                hashMap.put("video_segments", new C63003SaR("video_segments", "TEXT", null, 0, 1, true));
                hashMap.put("retake_video_segments", new C63003SaR("retake_video_segments", "TEXT", null, 0, 1, false));
                hashMap.put("audio_Track", new C63003SaR("audio_Track", "TEXT", null, 0, 1, false));
                hashMap.put("attriubtion_only_audio_track", new C63003SaR("attriubtion_only_audio_track", "TEXT", null, 0, 1, false));
                hashMap.put("pending_media_key", new C63003SaR("pending_media_key", "TEXT", null, 0, 1, false));
                hashMap.put("post_capture_media_edits", new C63003SaR("post_capture_media_edits", "TEXT", null, 0, 1, false));
                hashMap.put("logging_info", new C63003SaR("logging_info", "TEXT", null, 0, 1, false));
                hashMap.put("remix_info", new C63003SaR("remix_info", "TEXT", null, 0, 1, false));
                hashMap.put("original_destination_type", new C63003SaR("original_destination_type", "TEXT", null, 0, 1, false));
                hashMap.put("caption", new C63003SaR("caption", "TEXT", "''", 0, 1, true));
                hashMap.put("cover_photo_file_uri", new C63003SaR("cover_photo_file_uri", "TEXT", null, 0, 1, false));
                hashMap.put("is_share_to_feed", new C63003SaR("is_share_to_feed", "INTEGER", RealtimeSubscription.GRAPHQL_MQTT_VERSION, 0, 1, true));
                hashMap.put("funded_content_deal_id", new C63003SaR("funded_content_deal_id", "TEXT", null, 0, 1, false));
                hashMap.put("people_tags", new C63003SaR("people_tags", "TEXT", null, 0, 1, true));
                hashMap.put("comment_poll", new C63003SaR("comment_poll", "TEXT", null, 0, 1, false));
                hashMap.put("audience", new C63003SaR("audience", "TEXT", null, 0, 1, false));
                hashMap.put("collaborator_id", new C63003SaR("collaborator_id", "TEXT", null, 0, 1, false));
                hashMap.put("collaborator_ids", new C63003SaR("collaborator_ids", "TEXT", null, 0, 1, true));
                hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, new C63003SaR(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "TEXT", null, 0, 1, false));
                hashMap.put("location", new C63003SaR("location", "TEXT", null, 0, 1, false));
                hashMap.put("original_audio_title", new C63003SaR("original_audio_title", "TEXT", null, 0, 1, false));
                hashMap.put("multiple_audio_tracks", new C63003SaR("multiple_audio_tracks", "TEXT", null, 0, 1, true));
                hashMap.put("clips_sound_effects", new C63003SaR("clips_sound_effects", "TEXT", null, 0, 1, true));
                hashMap.put("clips_template_info", new C63003SaR("clips_template_info", "TEXT", null, 0, 1, false));
                hashMap.put("template_disabled", new C63003SaR("template_disabled", "INTEGER", null, 0, 1, true));
                hashMap.put("clips_multiple_audio_segments", new C63003SaR("clips_multiple_audio_segments", "TEXT", null, 0, 1, true));
                hashMap.put("upcoming_event", new C63003SaR("upcoming_event", "TEXT", null, 0, 1, false));
                hashMap.put("linked_highlight_id", new C63003SaR("linked_highlight_id", "TEXT", null, 0, 1, false));
                hashMap.put("highlight_media_id", new C63003SaR("highlight_media_id", "TEXT", null, 0, 1, false));
                hashMap.put("media_id", new C63003SaR("media_id", "TEXT", null, 0, 1, false));
                hashMap.put("voice_effect", new C63003SaR("voice_effect", "TEXT", null, 0, 1, false));
                hashMap.put("audio_enhancement_effect", new C63003SaR("audio_enhancement_effect", "TEXT", null, 0, 1, false));
                hashMap.put("clips_draft_info_version", new C63003SaR("clips_draft_info_version", "INTEGER", null, 0, 1, false));
                hashMap.put("has_published_clip", new C63003SaR("has_published_clip", "INTEGER", "0", 0, 1, true));
                hashMap.put("branded_content_tags_model", new C63003SaR("branded_content_tags_model", "TEXT", null, 0, 1, false));
                hashMap.put("clips_shopping_metadata", new C63003SaR("clips_shopping_metadata", "TEXT", null, 0, 1, false));
                hashMap.put("is_comment_disabled", new C63003SaR("is_comment_disabled", "INTEGER", "0", 0, 1, true));
                hashMap.put("is_caption_enabled", new C63003SaR("is_caption_enabled", "INTEGER", "0", 0, 1, true));
                hashMap.put("is_like_and_view_counts_disabled", new C63003SaR("is_like_and_view_counts_disabled", "INTEGER", "0", 0, 1, true));
                hashMap.put("is_share_count_disabled", new C63003SaR("is_share_count_disabled", "INTEGER", "0", 0, 1, true));
                hashMap.put("is_gifts_allowed", new C63003SaR("is_gifts_allowed", "INTEGER", RealtimeSubscription.GRAPHQL_MQTT_VERSION, 0, 1, true));
                hashMap.put("interest_topics", new C63003SaR("interest_topics", "TEXT", null, 0, 1, true));
                hashMap.put("stacked_timeline_actions", new C63003SaR("stacked_timeline_actions", "TEXT", null, 0, 1, true));
                hashMap.put("org_cta_type", new C63003SaR("org_cta_type", "TEXT", null, 0, 1, false));
                hashMap.put("max_duration_in_ms", new C63003SaR("max_duration_in_ms", "INTEGER", "0", 0, 1, true));
                hashMap.put("hide_from_profile_grid", new C63003SaR("hide_from_profile_grid", "INTEGER", "0", 0, 1, true));
                hashMap.put("meta_verified_added_link", new C63003SaR("meta_verified_added_link", "TEXT", null, 0, 1, false));
                hashMap.put("metagallery_media_id", new C63003SaR("metagallery_media_id", "TEXT", null, 0, 1, false));
                hashMap.put("bio_product", new C63003SaR("bio_product", "TEXT", null, 0, 1, false));
                hashMap.put("content_scheduling_metadata", new C63003SaR("content_scheduling_metadata", "TEXT", null, 0, 1, false));
                hashMap.put("trial_params", new C63003SaR("trial_params", "TEXT", null, 0, 1, false));
                hashMap.put("has_comment_prompt", new C63003SaR("has_comment_prompt", "INTEGER", null, 0, 1, true));
                hashMap.put("gen_ai_detection_method", new C63003SaR("gen_ai_detection_method", "TEXT", null, 0, 1, false));
                hashMap.put("is_pinned", new C63003SaR("is_pinned", "INTEGER", null, 0, 1, true));
                hashMap.put("third_party_downloads_enabled", new C63003SaR("third_party_downloads_enabled", "INTEGER", null, 0, 1, true));
                hashMap.put("cropcords_cropLeft", new C63003SaR("cropcords_cropLeft", "REAL", null, 0, 1, false));
                hashMap.put("cropcords_cropTop", new C63003SaR("cropcords_cropTop", "REAL", null, 0, 1, false));
                hashMap.put("cropcords_cropRight", new C63003SaR("cropcords_cropRight", "REAL", null, 0, 1, false));
                hashMap.put("cropcords_cropBottom", new C63003SaR("cropcords_cropBottom", "REAL", null, 0, 1, false));
                hashMap.put("feedmetadata_title", new C63003SaR("feedmetadata_title", "TEXT", null, 0, 1, false));
                hashMap.put("feedmetadata_previewCropCoordinates", new C63003SaR("feedmetadata_previewCropCoordinates", "TEXT", null, 0, 1, false));
                hashMap.put("feedmetadata_isInternal", new C63003SaR("feedmetadata_isInternal", "INTEGER", null, 0, 1, false));
                hashMap.put("feedmetadata_shareToFacebook", new C63003SaR("feedmetadata_shareToFacebook", "INTEGER", null, 0, 1, false));
                hashMap.put("feedmetadata_seriesId", new C63003SaR("feedmetadata_seriesId", "TEXT", null, 0, 1, false));
                hashMap.put("feedmetadata_shoppingMetadata", new C63003SaR("feedmetadata_shoppingMetadata", "TEXT", null, 0, 1, false));
                hashMap.put("feedmetadata_isUnifiedvideo", new C63003SaR("feedmetadata_isUnifiedvideo", "INTEGER", null, 0, 1, false));
                hashMap.put("feedmetadata_coverIsCustom", new C63003SaR("feedmetadata_coverIsCustom", "INTEGER", null, 0, 1, false));
                hashMap.put("feedmetadata_coverWidth", new C63003SaR("feedmetadata_coverWidth", "INTEGER", null, 0, 1, false));
                hashMap.put("feedmetadata_coverHeight", new C63003SaR("feedmetadata_coverHeight", "INTEGER", null, 0, 1, false));
                hashMap.put("feedmetadata_coverFromVideoTimeMs", new C63003SaR("feedmetadata_coverFromVideoTimeMs", "INTEGER", null, 0, 1, false));
                hashMap.put("feedmetadata_coverIsFromVideoEdited", new C63003SaR("feedmetadata_coverIsFromVideoEdited", "INTEGER", null, 0, 1, false));
                hashMap.put("feedmetadata_areCaptionsEnabled", new C63003SaR("feedmetadata_areCaptionsEnabled", "INTEGER", null, 0, 1, false));
                hashMap.put("feedmetadata_areCommentsDisabled", new C63003SaR("feedmetadata_areCommentsDisabled", "INTEGER", null, 0, 1, false));
                hashMap.put("feedmetadata_isFundedContentDeal", new C63003SaR("feedmetadata_isFundedContentDeal", "INTEGER", null, 0, 1, false));
                hashMap.put("feedmetadata_isPaidPartnership", new C63003SaR("feedmetadata_isPaidPartnership", "INTEGER", null, 0, 1, false));
                hashMap.put("feedmetadata_brandedContentTags", new C63003SaR("feedmetadata_brandedContentTags", "TEXT", null, 0, 1, false));
                hashMap.put("feedmetadata_partnerBoostEnabled", new C63003SaR("feedmetadata_partnerBoostEnabled", "INTEGER", null, 0, 1, false));
                hashMap.put("feedmetadata_isLikeAndViewCountsDisabled", new C63003SaR("feedmetadata_isLikeAndViewCountsDisabled", "INTEGER", null, 0, 1, false));
                hashMap.put("feedmetadata_filterId", new C63003SaR("feedmetadata_filterId", "INTEGER", null, 0, 1, false));
                hashMap.put("feedmetadata_filterStrength", new C63003SaR("feedmetadata_filterStrength", "INTEGER", null, 0, 1, false));
                hashMap.put("feedmetadata_postCropAspectRatio", new C63003SaR("feedmetadata_postCropAspectRatio", "REAL", null, 0, 1, false));
                hashMap.put("feedmetadata_isLandscape", new C63003SaR("feedmetadata_isLandscape", "INTEGER", null, 0, 1, false));
                hashMap.put("videocrop_width", new C63003SaR("videocrop_width", "INTEGER", null, 0, 1, false));
                hashMap.put("videocrop_height", new C63003SaR("videocrop_height", "INTEGER", null, 0, 1, false));
                hashMap.put("videocrop_rectF", new C63003SaR("videocrop_rectF", "TEXT", null, 0, 1, false));
                hashMap.put("mediadraft_version", new C63003SaR("mediadraft_version", "INTEGER", "0", 0, 1, true));
                hashMap.put("mediadraft_stickers", new C63003SaR("mediadraft_stickers", "TEXT", null, 0, 1, false));
                hashMap.put("mediadraft_unschematized_compositions", new C63003SaR("mediadraft_unschematized_compositions", "TEXT", "''", 0, 1, true));
                hashMap.put("mediadraft_media_type", new C63003SaR("mediadraft_media_type", "INTEGER", "2", 0, 1, true));
                C23008ACh c23008ACh = new C23008ACh("drafts", hashMap, new HashSet(0), new HashSet(0));
                C23008ACh A00 = RrF.A00(interfaceC37481ol, "drafts");
                if (!c23008ACh.equals(A00)) {
                    sb = new StringBuilder();
                    sb.append("drafts(com.instagram.creation.persistence.draft.ClipsDraftEntity).\n Expected:\n");
                    sb.append(c23008ACh);
                    sb.append("\n Found:\n");
                    sb.append(A00);
                } else {
                    HashMap hashMap2 = new HashMap(3);
                    hashMap2.put("audio_asset_id", new C63003SaR("audio_asset_id", "TEXT", null, 1, 1, true));
                    hashMap2.put("audio_amplitudes_list", new C63003SaR("audio_amplitudes_list", "TEXT", null, 0, 1, true));
                    hashMap2.put("last_used_time_ms", new C63003SaR("last_used_time_ms", "INTEGER", null, 0, 1, true));
                    C23008ACh c23008ACh2 = new C23008ACh("audio_amplitudes", hashMap2, new HashSet(0), new HashSet(0));
                    C23008ACh A002 = RrF.A00(interfaceC37481ol, "audio_amplitudes");
                    if (!c23008ACh2.equals(A002)) {
                        sb = new StringBuilder();
                        str = "audio_amplitudes(com.instagram.creation.persistence.audiotracks.ClipsAudioAmplitudesEntity).\n Expected:\n";
                    } else {
                        HashMap hashMap3 = new HashMap(5);
                        hashMap3.put("audio_track_id", new C63003SaR("audio_track_id", "TEXT", null, 1, 1, true));
                        hashMap3.put("start_time_ms", new C63003SaR("start_time_ms", "INTEGER", null, 2, 1, true));
                        hashMap3.put("duration_ms", new C63003SaR("duration_ms", "INTEGER", null, 0, 1, true));
                        hashMap3.put("file_path", new C63003SaR("file_path", "TEXT", null, 0, 1, true));
                        hashMap3.put("last_used_time_ms", new C63003SaR("last_used_time_ms", "INTEGER", null, 0, 1, true));
                        c23008ACh2 = new C23008ACh("audio_tracks", hashMap3, new HashSet(0), new HashSet(0));
                        A002 = RrF.A00(interfaceC37481ol, "audio_tracks");
                        if (!c23008ACh2.equals(A002)) {
                            sb = new StringBuilder();
                            str = "audio_tracks(com.instagram.creation.persistence.audiotracks.ClipsAudioTracksEntity).\n Expected:\n";
                        } else {
                            HashMap hashMap4 = new HashMap(4);
                            hashMap4.put("media_id", new C63003SaR("media_id", "TEXT", null, 1, 1, true));
                            hashMap4.put("file_path", new C63003SaR("file_path", "TEXT", null, 0, 1, true));
                            hashMap4.put("file_size", new C63003SaR("file_size", "INTEGER", null, 0, 1, true));
                            hashMap4.put("last_used_time_ms", new C63003SaR("last_used_time_ms", "INTEGER", null, 0, 1, true));
                            C23008ACh c23008ACh3 = new C23008ACh("clips_remix_original_media", hashMap4, new HashSet(0), new HashSet(0));
                            A002 = RrF.A00(interfaceC37481ol, "clips_remix_original_media");
                            if (!c23008ACh3.equals(A002)) {
                                sb = new StringBuilder();
                                sb.append("clips_remix_original_media(com.instagram.creation.persistence.remix.ClipsRemixOriginalMediaEntity).\n Expected:\n");
                                sb.append(c23008ACh3);
                                sb.append("\n Found:\n");
                                sb.append(A002);
                            } else {
                                HashMap hashMap5 = new HashMap(9);
                                hashMap5.put("draft_id", new C63003SaR("draft_id", "TEXT", null, 1, 1, true));
                                hashMap5.put("revision_id", new C63003SaR("revision_id", "TEXT", null, 0, 1, true));
                                hashMap5.put("composition_id", new C63003SaR("composition_id", "TEXT", null, 0, 1, true));
                                hashMap5.put("date_created", new C63003SaR("date_created", "INTEGER", null, 0, 1, true));
                                hashMap5.put("date_modified", new C63003SaR("date_modified", "INTEGER", null, 0, 1, true));
                                hashMap5.put("media_info", new C63003SaR("media_info", "TEXT", null, 0, 1, false));
                                hashMap5.put("persisted_media_info", new C63003SaR("persisted_media_info", "TEXT", null, 0, 1, false));
                                hashMap5.put("media_edits", new C63003SaR("media_edits", "TEXT", null, 0, 1, false));
                                hashMap5.put("cover_file_path", new C63003SaR("cover_file_path", "TEXT", null, 0, 1, false));
                                C23008ACh c23008ACh4 = new C23008ACh("story_drafts", hashMap5, new HashSet(0), new HashSet(0));
                                C23008ACh A003 = RrF.A00(interfaceC37481ol, "story_drafts");
                                if (!c23008ACh4.equals(A003)) {
                                    sb = new StringBuilder();
                                    sb.append("story_drafts(com.instagram.creation.persistence.draft.StoryDraftEntity).\n Expected:\n");
                                    sb.append(c23008ACh4);
                                    sb.append("\n Found:\n");
                                    sb.append(A003);
                                } else {
                                    return new A6Q(true, null);
                                }
                            }
                        }
                    }
                    sb.append(str);
                    sb.append(c23008ACh2);
                    sb.append("\n Found:\n");
                    sb.append(A002);
                }
                return new A6Q(false, sb.toString());
            }

            @Override // X.AbstractC28801aI
            public final void onPreMigrate(InterfaceC37481ol interfaceC37481ol) {
                C3EP.A01(interfaceC37481ol);
            }
        }, "84dc2eaff08ae87ec0ecc1161d786465", "699b348b375f52d34fe3b8a66fd2ae52"), c28381Yz.A04, false, false));
    }

    @Override // X.C1YP
    public final List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    @Override // X.C1YP
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.C1YP
    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(C2PV.class, Collections.emptyList());
        hashMap.put(C2PX.class, Collections.emptyList());
        hashMap.put(C2PY.class, Collections.emptyList());
        hashMap.put(C2PZ.class, Collections.emptyList());
        hashMap.put(C49432Pa.class, Collections.emptyList());
        return hashMap;
    }
}
