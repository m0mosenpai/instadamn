package X;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.2Og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC49252Og {
    public static final InterfaceC09390do A0f = AbstractC09440dt.A01(C2Oh.A00);
    public static final C49262Oi A0K = new C1Ym() { // from class: X.2Oi
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `branded_content_tags_model` TEXT");
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `clips_shopping_metadata` TEXT");
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `videocrop_width` INTEGER");
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `videocrop_height` INTEGER");
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `videocrop_rectF` TEXT");
        }
    };
    public static final C49272Oj A0V = new C1Ym() { // from class: X.2Oj
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            if (interfaceC37481ol.E7O("SELECT * FROM drafts").getColumnIndex("clips_sound_effects") < 0) {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `clips_sound_effects` TEXT DEFAULT '' NOT NULL");
            } else {
                AbstractC49252Og.A00(null, "Migrations.MIGRATION_3_TO_4", "skipping clips_sound_effects add column statement as already exists ");
            }
        }
    };
    public static final C49282Ok A0Z = new C1Ym() { // from class: X.2Ok
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `audio_tracks` (`audio_track_id` TEXT NOT NULL, `start_time_ms` INTEGER NOT NULL, `duration_ms` INTEGER NOT NULL, `file_path` TEXT NOT NULL, `last_used_time_ms` INTEGER NOT NULL, PRIMARY KEY(`audio_track_id`, `start_time_ms`))");
        }
    };
    public static final C49292Ol A0a = new C1Ym() { // from class: X.2Ol
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `has_published_clip` INTEGER NOT NULL DEFAULT 0");
        }
    };
    public static final C49302Om A0b = new C1Ym() { // from class: X.2Om
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `clips_remix_original_media` (`media_id` TEXT NOT NULL, `file_path` TEXT NOT NULL, `file_size` INTEGER NOT NULL, `last_used_time_ms` INTEGER NOT NULL, PRIMARY KEY(`media_id`))");
        }
    };
    public static final C49312On A0c = new C1Ym() { // from class: X.2On
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `story_drafts` (`draft_id` TEXT NOT NULL, `revision_id` TEXT NOT NULL, `composition_id` TEXT NOT NULL, `date_created` INTEGER NOT NULL, `date_modified` INTEGER NOT NULL, `media_info` TEXT, `persisted_media_info` TEXT, `media_edits` TEXT, `cover_file_path` TEXT, PRIMARY KEY(`draft_id`))");
        }
    };
    public static final C49322Oo A0d = new C1Ym() { // from class: X.2Oo
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `retake_video_segments` TEXT");
        }
    };
    public static final C49332Op A0e = new C1Ym() { // from class: X.2Op
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `clips_template_info` TEXT");
        }
    };
    public static final C49342Oq A00 = new C1Ym() { // from class: X.2Oq
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `is_comment_disabled` INTEGER NOT NULL DEFAULT 0");
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `is_caption_enabled` INTEGER NOT NULL DEFAULT 0");
        }
    };
    public static final C49362Os A01 = new C1Ym() { // from class: X.2Os
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `is_like_and_view_counts_disabled` INTEGER NOT NULL DEFAULT 0");
        }
    };
    public static final C49372Ot A02 = new C1Ym() { // from class: X.2Ot
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            Cursor E7O = interfaceC37481ol.E7O("SELECT * FROM drafts");
            if (E7O.getColumnIndex("is_share_to_feed") > -1) {
                if (E7O.getColumnIndex("is_like_and_view_counts_disabled") < 0) {
                    interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `is_like_and_view_counts_disabled` INTEGER NOT NULL DEFAULT 0");
                } else {
                    AbstractC49252Og.A00(null, "Migrations.MIGRATION_12_TO_13", "skipping is_like_and_view_counts_disabled add column statement as column already exists");
                }
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `drafts_backup` (`id` TEXT NOT NULL, `clips_creation_type` TEXT NOT NULL, `last_user_save_time` INTEGER NOT NULL DEFAULT -1, `last_save_time` INTEGER NOT NULL DEFAULT -1, `last_pre_capture_save_time` INTEGER NOT NULL DEFAULT -1, `was_last_save_user_initiated` INTEGER NOT NULL DEFAULT 0, `video_segments` TEXT NOT NULL, `retake_video_segments` TEXT, `audio_Track` TEXT, `attriubtion_only_audio_track` TEXT, `pending_media_key` TEXT, `post_capture_media_edits` TEXT, `logging_info` TEXT, `remix_info` TEXT, `original_destination_type` TEXT, `caption` TEXT NOT NULL DEFAULT '', `cover_photo_file_uri` TEXT, `funded_content_deal_id` TEXT, `people_tags` TEXT NOT NULL, `collaborator_id` TEXT, `location` TEXT, `original_audio_title` TEXT, `multiple_audio_tracks` TEXT NOT NULL, `clips_sound_effects` TEXT NOT NULL, `clips_template_info` TEXT, `clips_multiple_audio_segments` TEXT NOT NULL, `media_id` TEXT, `voice_effect` TEXT, `clips_draft_info_version` INTEGER, `has_published_clip` INTEGER NOT NULL DEFAULT 0, `branded_content_tags_model` TEXT, `clips_shopping_metadata` TEXT, `is_comment_disabled` INTEGER NOT NULL DEFAULT 0, `is_caption_enabled` INTEGER NOT NULL DEFAULT 0, `is_like_and_view_counts_disabled` INTEGER NOT NULL DEFAULT 0, `cropcords_cropLeft` REAL, `cropcords_cropTop` REAL, `cropcords_cropRight` REAL, `cropcords_cropBottom` REAL, `feedmetadata_title` TEXT, `feedmetadata_previewCropCoordinates` TEXT, `feedmetadata_isInternal` INTEGER, `feedmetadata_shareToFacebook` INTEGER, `feedmetadata_seriesId` TEXT, `feedmetadata_shoppingMetadata` TEXT, `feedmetadata_isUnifiedvideo` INTEGER, `feedmetadata_coverIsCustom` INTEGER, `feedmetadata_coverWidth` INTEGER, `feedmetadata_coverHeight` INTEGER, `feedmetadata_coverFromVideoTimeMs` INTEGER, `feedmetadata_coverIsFromVideoEdited` INTEGER, `feedmetadata_areCaptionsEnabled` INTEGER, `feedmetadata_areCommentsDisabled` INTEGER, `feedmetadata_isFundedContentDeal` INTEGER, `feedmetadata_isPaidPartnership` INTEGER, `feedmetadata_brandedContentTags` TEXT, `feedmetadata_partnerBoostEnabled` INTEGER, `feedmetadata_isLikeAndViewCountsDisabled` INTEGER, `feedmetadata_filterId` INTEGER, `feedmetadata_filterStrength` INTEGER, `feedmetadata_postCropAspectRatio` REAL, `feedmetadata_isLandscape` INTEGER, `videocrop_width` INTEGER, `videocrop_height` INTEGER, `videocrop_rectF` TEXT, PRIMARY KEY(`id`))");
                interfaceC37481ol.ATG("INSERT INTO `drafts_backup` (`id`,`clips_creation_type`,`last_user_save_time`,`last_save_time`,`last_pre_capture_save_time`,`was_last_save_user_initiated`,`video_segments`,`retake_video_segments`,`audio_Track`,`attriubtion_only_audio_track`,`pending_media_key`,`post_capture_media_edits`,`logging_info`,`remix_info`,`original_destination_type`,`caption`,`cover_photo_file_uri`,`funded_content_deal_id`,`people_tags`,`collaborator_id`,`location`,`original_audio_title`,`multiple_audio_tracks`,`clips_sound_effects`,`clips_template_info`,`clips_multiple_audio_segments`,`media_id`,`voice_effect`,`clips_draft_info_version`,`has_published_clip`,`branded_content_tags_model`,`clips_shopping_metadata`,`is_comment_disabled`,`is_caption_enabled`,`is_like_and_view_counts_disabled`,`cropcords_cropLeft`,`cropcords_cropTop`,`cropcords_cropRight`,`cropcords_cropBottom`,`feedmetadata_title`,`feedmetadata_previewCropCoordinates`,`feedmetadata_isInternal`,`feedmetadata_shareToFacebook`,`feedmetadata_seriesId`,`feedmetadata_shoppingMetadata`,`feedmetadata_isUnifiedvideo`,`feedmetadata_coverIsCustom`,`feedmetadata_coverWidth`,`feedmetadata_coverHeight`,`feedmetadata_coverFromVideoTimeMs`,`feedmetadata_coverIsFromVideoEdited`,`feedmetadata_areCaptionsEnabled`,`feedmetadata_areCommentsDisabled`,`feedmetadata_isFundedContentDeal`,`feedmetadata_isPaidPartnership`,`feedmetadata_brandedContentTags`,`feedmetadata_partnerBoostEnabled`,`feedmetadata_isLikeAndViewCountsDisabled`,`feedmetadata_filterId`,`feedmetadata_filterStrength`,`feedmetadata_postCropAspectRatio`,`feedmetadata_isLandscape`,`videocrop_width`,`videocrop_height`,`videocrop_rectF`) SELECT `id`,`clips_creation_type`,`last_user_save_time`,`last_save_time`,`last_pre_capture_save_time`,`was_last_save_user_initiated`,`video_segments`,`retake_video_segments`,`audio_Track`,`attriubtion_only_audio_track`,`pending_media_key`,`post_capture_media_edits`,`logging_info`,`remix_info`,`original_destination_type`,`caption`,`cover_photo_file_uri`,`funded_content_deal_id`,`people_tags`,`collaborator_id`,`location`,`original_audio_title`,`multiple_audio_tracks`,`clips_sound_effects`,`clips_template_info`,`clips_multiple_audio_segments`,`media_id`,`voice_effect`,`clips_draft_info_version`,`has_published_clip`,`branded_content_tags_model`,`clips_shopping_metadata`,`is_comment_disabled`,`is_caption_enabled`,`is_like_and_view_counts_disabled`,`cropcords_cropLeft`,`cropcords_cropTop`,`cropcords_cropRight`,`cropcords_cropBottom`,`feedmetadata_title`,`feedmetadata_previewCropCoordinates`,`feedmetadata_isInternal`,`feedmetadata_shareToFacebook`,`feedmetadata_seriesId`,`feedmetadata_shoppingMetadata`,`feedmetadata_isUnifiedvideo`,`feedmetadata_coverIsCustom`,`feedmetadata_coverWidth`,`feedmetadata_coverHeight`,`feedmetadata_coverFromVideoTimeMs`,`feedmetadata_coverIsFromVideoEdited`,`feedmetadata_areCaptionsEnabled`,`feedmetadata_areCommentsDisabled`,`feedmetadata_isFundedContentDeal`,`feedmetadata_isPaidPartnership`,`feedmetadata_brandedContentTags`,`feedmetadata_partnerBoostEnabled`,`feedmetadata_isLikeAndViewCountsDisabled`,`feedmetadata_filterId`,`feedmetadata_filterStrength`,`feedmetadata_postCropAspectRatio`,`feedmetadata_isLandscape`,`videocrop_width`,`videocrop_height`,`videocrop_rectF` FROM drafts");
                interfaceC37481ol.ATG("DROP TABLE `drafts`");
                interfaceC37481ol.ATG("ALTER TABLE `drafts_backup` RENAME TO `drafts`");
                return;
            }
            AbstractC49252Og.A00(null, "Migrations.MIGRATION_12_TO_13", "skipping is_share_to_feed drop column statement as column doesn't exist");
        }
    };
    public static final C49382Ou A03 = new C1Ym() { // from class: X.2Ou
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `interest_topics` TEXT NOT NULL DEFAULT ''");
        }
    };
    public static final C2Ov A04 = new C1Ym() { // from class: X.2Ov
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `is_share_to_feed` INTEGER NOT NULL DEFAULT 1");
        }
    };
    public static final C49402Ox A05 = new C1Ym() { // from class: X.2Ox
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `audio_amplitudes` (`audio_asset_id` TEXT NOT NULL, `audio_amplitudes_list` TEXT NOT NULL, `last_used_time_ms` INTEGER NOT NULL, PRIMARY KEY(`audio_asset_id`))");
        }
    };
    public static final C49412Oy A06 = new C1Ym() { // from class: X.2Oy
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `collaborator_ids` TEXT DEFAULT '' NOT NULL ");
        }
    };
    public static final C49422Oz A07 = new C1Ym() { // from class: X.2Oz
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `audience` TEXT DEFAULT NULL");
        }
    };
    public static final C2P1 A08 = new C1Ym() { // from class: X.2P1
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `stacked_timeline_actions` TEXT DEFAULT '' NOT NULL ");
        }
    };
    public static final C2P2 A09 = new C1Ym() { // from class: X.2P2
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `org_cta_type` TEXT DEFAULT NULL");
        }
    };
    public static final C2P3 A0A = new C1Ym() { // from class: X.2P3
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `audio_enhancement_effect` TEXT DEFAULT NULL");
        }
    };
    public static final C2P4 A0B = new C1Ym() { // from class: X.2P4
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `entry_point` TEXT DEFAULT NULL");
        }
    };
    public static final C2P5 A0C = new C1Ym() { // from class: X.2P5
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `is_gifts_allowed` INTEGER NOT NULL DEFAULT 1");
        }
    };
    public static final C2P6 A0D = new C1Ym() { // from class: X.2P6
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `max_duration_in_ms` INTEGER NOT NULL DEFAULT 0");
        }
    };
    public static final C2P7 A0E = new C1Ym() { // from class: X.2P7
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `comment_poll` TEXT DEFAULT NULL");
            } catch (SQLiteException unused) {
                AbstractC49252Og.A00(null, "Migrations.MIGRATION_24_TO_25", "Column comment_poll probably already exists.");
            }
        }
    };
    public static final C2P8 A0F = new C1Ym() { // from class: X.2P8
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `created_at_time` INTEGER NOT NULL DEFAULT -1");
        }
    };
    public static final C2P9 A0G = new C1Ym() { // from class: X.2P9
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE `drafts` ADD COLUMN `mediadraft_version` INTEGER NOT NULL DEFAULT 0");
                interfaceC37481ol.ATG("ALTER TABLE `drafts` ADD COLUMN `mediadraft_stickers` TEXT DEFAULT NULL");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_26_TO_27", null);
            }
        }
    };
    public static final C2PA A0H = new C1Ym() { // from class: X.2PA
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `upcoming_event` TEXT DEFAULT NULL");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_27_TO_28", null);
            }
        }
    };
    public static final C2PB A0I = new C1Ym() { // from class: X.2PB
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `linked_highlight_id` TEXT DEFAULT NULL");
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `highlight_media_id` TEXT DEFAULT NULL");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_28_TO_29", null);
            }
        }
    };
    public static final C2PC A0J = new C1Ym() { // from class: X.2PC
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `hide_from_profile_grid` INTEGER NOT NULL DEFAULT 0");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_29_TO_30", null);
            }
        }
    };
    public static final C2PD A0L = new C1Ym() { // from class: X.2PD
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `meta_verified_added_link` TEXT DEFAULT NULL");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_30_TO_31", null);
            }
        }
    };
    public static final C2PE A0M = new C1Ym() { // from class: X.2PE
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `metagallery_media_id` TEXT DEFAULT NULL");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_31_TO_32", null);
            }
        }
    };
    public static final C2PF A0N = new C1Ym() { // from class: X.2PF
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `name` TEXT DEFAULT NULL");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_32_TO_33", null);
            }
        }
    };
    public static final C2PG A0O = new C1Ym() { // from class: X.2PG
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `bio_product` TEXT DEFAULT NULL");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_33_TO_34", null);
            }
        }
    };
    public static final C2PH A0P = new C1Ym() { // from class: X.2PH
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `content_scheduling_metadata` TEXT DEFAULT NULL");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_34_TO_35", null);
            }
        }
    };
    public static final C2PI A0Q = new C1Ym() { // from class: X.2PI
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `trial_params` TEXT DEFAULT NULL");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_35_TO_36", null);
            }
        }
    };
    public static final C2PJ A0R = new C1Ym() { // from class: X.2PJ
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `has_comment_prompt` INTEGER NOT NULL DEFAULT 0");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_36_TO_37", null);
            }
        }
    };
    public static final C2PK A0S = new C1Ym() { // from class: X.2PK
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `gen_ai_detection_method` TEXT DEFAULT NULL");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_37_TO_38", null);
            }
        }
    };
    public static final C2PL A0T = new C1Ym() { // from class: X.2PL
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `template_disabled` INTEGER NOT NULL DEFAULT 1");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_38_TO_39", null);
            }
        }
    };
    public static final C2PM A0U = new C1Ym() { // from class: X.2PM
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `is_share_count_disabled` INTEGER NOT NULL DEFAULT 0");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_39_TO_40", null);
            }
        }
    };
    public static final C2PN A0W = new C1Ym() { // from class: X.2PN
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `is_pinned` INTEGER NOT NULL DEFAULT 0");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_40_TO_41", null);
            }
        }
    };
    public static final C2PO A0X = new C1Ym() { // from class: X.2PO
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE`drafts` ADD COLUMN `third_party_downloads_enabled` INTEGER NOT NULL DEFAULT 0");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_41_TO_42", null);
            }
        }
    };
    public static final C2PP A0Y = new C1Ym() { // from class: X.2PP
        @Override // X.C1Ym
        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            try {
                interfaceC37481ol.ATG("ALTER TABLE `drafts` ADD COLUMN `mediadraft_unschematized_compositions` TEXT NOT NULL DEFAULT ''");
                interfaceC37481ol.ATG("ALTER TABLE `drafts` ADD COLUMN `mediadraft_media_type` INTEGER NOT NULL DEFAULT 2");
            } catch (SQLException e) {
                AbstractC49252Og.A00(e, "Migrations.MIGRATION_42_TO_43", null);
            }
        }
    };

    public static final void A00(Exception exc, String str, String str2) {
        C0f5 AEp = C18950wb.A00.AEp(str, 817898221);
        if (str2 != null) {
            AEp.ABW(DialogModule.KEY_MESSAGE, str2);
        }
        if (exc != null) {
            AEp.ERI(exc);
        }
        AEp.report();
    }
}
