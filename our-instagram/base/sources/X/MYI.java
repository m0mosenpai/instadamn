package X;

import android.database.Cursor;
import android.graphics.RectF;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igtv.persistence.draft.IGTVBrandedContentTags;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.user.model.UpcomingEventImpl;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class MYI implements Callable {
    public final /* synthetic */ C37581ov A00;
    public final /* synthetic */ C49442Pb A01;

    public MYI(C37581ov c37581ov, C49442Pb c49442Pb) {
        this.A01 = c49442Pb;
        this.A00 = c37581ov;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C50602MVn c50602MVn;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        EnumC76383bi A00;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        String string19;
        String string20;
        EnumC192868gS enumC192868gS;
        C219779nP c219779nP;
        String string21;
        String string22;
        String string23;
        String string24;
        String string25;
        String string26;
        String string27;
        String string28;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod;
        C9ZU c9zu;
        String string29;
        String string30;
        String string31;
        C54969OTb c54969OTb;
        String string32;
        C51662Mrt c51662Mrt;
        String string33;
        String string34;
        String string35;
        String string36;
        C49442Pb c49442Pb = this.A01;
        C1YP c1yp = c49442Pb.A02;
        c1yp.beginTransaction();
        try {
            C37581ov c37581ov = this.A00;
            Cursor query = c1yp.query(c37581ov, (CancellationSignal) null);
            try {
                int A01 = AbstractC37601ox.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                int A012 = AbstractC37601ox.A01(query, "clips_creation_type");
                int A013 = AbstractC37601ox.A01(query, "last_user_save_time");
                int A014 = AbstractC37601ox.A01(query, "last_save_time");
                int A015 = AbstractC37601ox.A01(query, "created_at_time");
                int A016 = AbstractC37601ox.A01(query, "last_pre_capture_save_time");
                int A017 = AbstractC37601ox.A01(query, "was_last_save_user_initiated");
                int A018 = AbstractC37601ox.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                int A019 = AbstractC37601ox.A01(query, "video_segments");
                int A0110 = AbstractC37601ox.A01(query, "retake_video_segments");
                int A0111 = AbstractC37601ox.A01(query, "audio_Track");
                int A0112 = AbstractC37601ox.A01(query, "attriubtion_only_audio_track");
                int A0113 = AbstractC37601ox.A01(query, "pending_media_key");
                int A0114 = AbstractC37601ox.A01(query, "post_capture_media_edits");
                int A0115 = AbstractC37601ox.A01(query, "logging_info");
                int A0116 = AbstractC37601ox.A01(query, "remix_info");
                int A0117 = AbstractC37601ox.A01(query, "original_destination_type");
                int A0118 = AbstractC37601ox.A01(query, "caption");
                int A0119 = AbstractC37601ox.A01(query, "cover_photo_file_uri");
                int A0120 = AbstractC37601ox.A01(query, "is_share_to_feed");
                int A0121 = AbstractC37601ox.A01(query, "funded_content_deal_id");
                int A0122 = AbstractC37601ox.A01(query, "people_tags");
                int A0123 = AbstractC37601ox.A01(query, "comment_poll");
                int A0124 = AbstractC37601ox.A01(query, "audience");
                int A0125 = AbstractC37601ox.A01(query, "collaborator_id");
                int A0126 = AbstractC37601ox.A01(query, "collaborator_ids");
                int A0127 = AbstractC37601ox.A01(query, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                int A0128 = AbstractC37601ox.A01(query, "location");
                int A0129 = AbstractC37601ox.A01(query, "original_audio_title");
                int A0130 = AbstractC37601ox.A01(query, "multiple_audio_tracks");
                int A0131 = AbstractC37601ox.A01(query, "clips_sound_effects");
                int A0132 = AbstractC37601ox.A01(query, "clips_template_info");
                int A0133 = AbstractC37601ox.A01(query, "template_disabled");
                int A0134 = AbstractC37601ox.A01(query, "clips_multiple_audio_segments");
                int A0135 = AbstractC37601ox.A01(query, "upcoming_event");
                int A0136 = AbstractC37601ox.A01(query, "linked_highlight_id");
                int A0137 = AbstractC37601ox.A01(query, "highlight_media_id");
                int A0138 = AbstractC37601ox.A01(query, "media_id");
                int A0139 = AbstractC37601ox.A01(query, "voice_effect");
                int A0140 = AbstractC37601ox.A01(query, "audio_enhancement_effect");
                int A0141 = AbstractC37601ox.A01(query, "clips_draft_info_version");
                int A0142 = AbstractC37601ox.A01(query, "has_published_clip");
                int A0143 = AbstractC37601ox.A01(query, "branded_content_tags_model");
                int A0144 = AbstractC37601ox.A01(query, "clips_shopping_metadata");
                int A0145 = AbstractC37601ox.A01(query, "is_comment_disabled");
                int A0146 = AbstractC37601ox.A01(query, "is_caption_enabled");
                int A0147 = AbstractC37601ox.A01(query, "is_like_and_view_counts_disabled");
                int A0148 = AbstractC37601ox.A01(query, "is_share_count_disabled");
                int A0149 = AbstractC37601ox.A01(query, "is_gifts_allowed");
                int A0150 = AbstractC37601ox.A01(query, "interest_topics");
                int A0151 = AbstractC37601ox.A01(query, "stacked_timeline_actions");
                int A0152 = AbstractC37601ox.A01(query, "org_cta_type");
                int A0153 = AbstractC37601ox.A01(query, "max_duration_in_ms");
                int A0154 = AbstractC37601ox.A01(query, "hide_from_profile_grid");
                int A0155 = AbstractC37601ox.A01(query, "meta_verified_added_link");
                int A0156 = AbstractC37601ox.A01(query, "metagallery_media_id");
                int A0157 = AbstractC37601ox.A01(query, "bio_product");
                int A0158 = AbstractC37601ox.A01(query, "content_scheduling_metadata");
                int A0159 = AbstractC37601ox.A01(query, "trial_params");
                int A0160 = AbstractC37601ox.A01(query, "has_comment_prompt");
                int A0161 = AbstractC37601ox.A01(query, "gen_ai_detection_method");
                int A0162 = AbstractC37601ox.A01(query, "is_pinned");
                int A0163 = AbstractC37601ox.A01(query, "third_party_downloads_enabled");
                int A0164 = AbstractC37601ox.A01(query, "cropcords_cropLeft");
                int A0165 = AbstractC37601ox.A01(query, "cropcords_cropTop");
                int A0166 = AbstractC37601ox.A01(query, "cropcords_cropRight");
                int A0167 = AbstractC37601ox.A01(query, "cropcords_cropBottom");
                int A0168 = AbstractC37601ox.A01(query, "feedmetadata_title");
                int A0169 = AbstractC37601ox.A01(query, "feedmetadata_previewCropCoordinates");
                int A0170 = AbstractC37601ox.A01(query, "feedmetadata_isInternal");
                int A0171 = AbstractC37601ox.A01(query, "feedmetadata_shareToFacebook");
                int A0172 = AbstractC37601ox.A01(query, "feedmetadata_seriesId");
                int A0173 = AbstractC37601ox.A01(query, "feedmetadata_shoppingMetadata");
                int A0174 = AbstractC37601ox.A01(query, "feedmetadata_isUnifiedvideo");
                int A0175 = AbstractC37601ox.A01(query, "feedmetadata_coverIsCustom");
                int A0176 = AbstractC37601ox.A01(query, "feedmetadata_coverWidth");
                int A0177 = AbstractC37601ox.A01(query, "feedmetadata_coverHeight");
                int A0178 = AbstractC37601ox.A01(query, "feedmetadata_coverFromVideoTimeMs");
                int A0179 = AbstractC37601ox.A01(query, "feedmetadata_coverIsFromVideoEdited");
                int A0180 = AbstractC37601ox.A01(query, "feedmetadata_areCaptionsEnabled");
                int A0181 = AbstractC37601ox.A01(query, "feedmetadata_areCommentsDisabled");
                int A0182 = AbstractC37601ox.A01(query, "feedmetadata_isFundedContentDeal");
                int A0183 = AbstractC37601ox.A01(query, "feedmetadata_isPaidPartnership");
                int A0184 = AbstractC37601ox.A01(query, "feedmetadata_brandedContentTags");
                int A0185 = AbstractC37601ox.A01(query, "feedmetadata_partnerBoostEnabled");
                int A0186 = AbstractC37601ox.A01(query, "feedmetadata_isLikeAndViewCountsDisabled");
                int A0187 = AbstractC37601ox.A01(query, "feedmetadata_filterId");
                int A0188 = AbstractC37601ox.A01(query, "feedmetadata_filterStrength");
                int A0189 = AbstractC37601ox.A01(query, "feedmetadata_postCropAspectRatio");
                int A0190 = AbstractC37601ox.A01(query, "feedmetadata_isLandscape");
                int A0191 = AbstractC37601ox.A01(query, "videocrop_width");
                int A0192 = AbstractC37601ox.A01(query, "videocrop_height");
                int A0193 = AbstractC37601ox.A01(query, "videocrop_rectF");
                int A0194 = AbstractC37601ox.A01(query, "mediadraft_version");
                int A0195 = AbstractC37601ox.A01(query, "mediadraft_stickers");
                int A0196 = AbstractC37601ox.A01(query, "mediadraft_unschematized_compositions");
                int A0197 = AbstractC37601ox.A01(query, "mediadraft_media_type");
                if (query.moveToFirst()) {
                    String string37 = query.getString(A01);
                    C5JK A002 = AbstractC50598MVj.A00(query.getString(A012));
                    long j = query.getLong(A013);
                    long j2 = query.getLong(A014);
                    long j3 = query.getLong(A015);
                    long j4 = query.getLong(A016);
                    boolean A1M = AbstractC167007dF.A1M(query.getInt(A017));
                    if (query.isNull(A018)) {
                        string = null;
                    } else {
                        string = query.getString(A018);
                    }
                    List A003 = AbstractC50597MVi.A00(query.getString(A019));
                    if (query.isNull(A0110)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(A0110);
                    }
                    List A004 = AbstractC50597MVi.A00(string2);
                    if (query.isNull(A0111)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(A0111);
                    }
                    AudioOverlayTrack A005 = C49452Pc.A00(string3);
                    if (query.isNull(A0112)) {
                        string4 = null;
                    } else {
                        string4 = query.getString(A0112);
                    }
                    AudioOverlayTrack A006 = C49452Pc.A00(string4);
                    if (query.isNull(A0113)) {
                        string5 = null;
                    } else {
                        string5 = query.getString(A0113);
                    }
                    if (query.isNull(A0114)) {
                        string6 = null;
                    } else {
                        string6 = query.getString(A0114);
                    }
                    C203248yh A007 = AbstractC50600MVl.A00(string6);
                    if (query.isNull(A0115)) {
                        string7 = null;
                    } else {
                        string7 = query.getString(A0115);
                    }
                    ShareMediaLoggingInfo A008 = AbstractC50604MVp.A00(string7);
                    if (query.isNull(A0116)) {
                        string8 = null;
                    } else {
                        string8 = query.getString(A0116);
                    }
                    C9JS A009 = AbstractC50599MVk.A00(string8);
                    if (!query.isNull(A0117)) {
                        query.getString(A0117);
                    }
                    String string38 = query.getString(A0118);
                    if (query.isNull(A0119)) {
                        string9 = null;
                    } else {
                        string9 = query.getString(A0119);
                    }
                    boolean A1M2 = AbstractC167007dF.A1M(query.getInt(A0120));
                    if (query.isNull(A0121)) {
                        string10 = null;
                    } else {
                        string10 = query.getString(A0121);
                    }
                    List A0010 = MW2.A00(query.getString(A0122));
                    if (query.isNull(A0123)) {
                        string11 = null;
                    } else {
                        string11 = query.getString(A0123);
                    }
                    C101394gx A0011 = MW1.A00(string11);
                    if (query.isNull(A0124)) {
                        A00 = null;
                    } else {
                        A00 = C49442Pb.A00(query.getString(A0124));
                    }
                    if (query.isNull(A0125)) {
                        string12 = null;
                    } else {
                        string12 = query.getString(A0125);
                    }
                    List A0198 = AbstractC50601MVm.A01(query.getString(A0126));
                    if (query.isNull(A0127)) {
                        string13 = null;
                    } else {
                        string13 = query.getString(A0127);
                    }
                    if (query.isNull(A0128)) {
                        string14 = null;
                    } else {
                        string14 = query.getString(A0128);
                    }
                    Venue A0012 = MW3.A00(string14);
                    if (query.isNull(A0129)) {
                        string15 = null;
                    } else {
                        string15 = query.getString(A0129);
                    }
                    List A0199 = c49442Pb.A0A.A01(query.getString(A0130));
                    List A0013 = c49442Pb.A0B.A00(query.getString(A0131));
                    if (query.isNull(A0132)) {
                        string16 = null;
                    } else {
                        string16 = query.getString(A0132);
                    }
                    C110204xp A0014 = AbstractC50610MVv.A00(string16);
                    boolean A1M3 = AbstractC167007dF.A1M(query.getInt(A0133));
                    List A01100 = AbstractC50601MVm.A01(query.getString(A0134));
                    if (query.isNull(A0135)) {
                        string17 = null;
                    } else {
                        string17 = query.getString(A0135);
                    }
                    UpcomingEventImpl A0015 = AbstractC50609MVu.A00(string17);
                    if (query.isNull(A0136)) {
                        string18 = null;
                    } else {
                        string18 = query.getString(A0136);
                    }
                    if (query.isNull(A0137)) {
                        string19 = null;
                    } else {
                        string19 = query.getString(A0137);
                    }
                    if (query.isNull(A0138)) {
                        string20 = null;
                    } else {
                        string20 = query.getString(A0138);
                    }
                    if (!query.isNull(A0139) && (string36 = query.getString(A0139)) != null) {
                        try {
                            enumC192868gS = EnumC192868gS.valueOf(string36);
                        } catch (IllegalArgumentException unused) {
                            enumC192868gS = null;
                        }
                    } else {
                        enumC192868gS = null;
                    }
                    if (!query.isNull(A0140) && (string35 = query.getString(A0140)) != null) {
                        try {
                            c219779nP = A0B.parseFromJson(C16V.A00(string35));
                        } catch (IllegalArgumentException unused2) {
                            c219779nP = null;
                        }
                    } else {
                        c219779nP = null;
                    }
                    if (!query.isNull(A0141)) {
                        query.getInt(A0141);
                    }
                    boolean A1M4 = AbstractC167007dF.A1M(query.getInt(A0142));
                    if (query.isNull(A0143)) {
                        string21 = null;
                    } else {
                        string21 = query.getString(A0143);
                    }
                    C54632OBh A0016 = AbstractC50605MVq.A00(string21);
                    if (query.isNull(A0144)) {
                        string22 = null;
                    } else {
                        string22 = query.getString(A0144);
                    }
                    C38686GzR A0017 = MW0.A00(string22);
                    boolean A1M5 = AbstractC167007dF.A1M(query.getInt(A0145));
                    boolean A1M6 = AbstractC167007dF.A1M(query.getInt(A0146));
                    boolean A1M7 = AbstractC167007dF.A1M(query.getInt(A0147));
                    boolean A1M8 = AbstractC167007dF.A1M(query.getInt(A0148));
                    boolean A1M9 = AbstractC167007dF.A1M(query.getInt(A0149));
                    List A01101 = AbstractC50601MVm.A01(query.getString(A0150));
                    List A0018 = MW4.A00(query.getString(A0151));
                    if (query.isNull(A0152)) {
                        string23 = null;
                    } else {
                        string23 = query.getString(A0152);
                    }
                    int i = query.getInt(A0153);
                    boolean A1M10 = AbstractC167007dF.A1M(query.getInt(A0154));
                    if (query.isNull(A0155)) {
                        string24 = null;
                    } else {
                        string24 = query.getString(A0155);
                    }
                    if (query.isNull(A0156)) {
                        string25 = null;
                    } else {
                        string25 = query.getString(A0156);
                    }
                    if (query.isNull(A0157)) {
                        string26 = null;
                    } else {
                        string26 = query.getString(A0157);
                    }
                    C51685MsG A0019 = AbstractC50614MVz.A00(string26);
                    if (query.isNull(A0158)) {
                        string27 = null;
                    } else {
                        string27 = query.getString(A0158);
                    }
                    C38709H2v A0020 = AbstractC50612MVx.A00(string27);
                    if (query.isNull(A0159)) {
                        string28 = null;
                    } else {
                        string28 = query.getString(A0159);
                    }
                    C51756Mtf A0021 = AbstractC50613MVy.A00(string28);
                    boolean A1M11 = AbstractC167007dF.A1M(query.getInt(A0160));
                    if (!query.isNull(A0161) && (string34 = query.getString(A0161)) != null) {
                        mediaGenAIDetectionMethod = AbstractC85933sM.A00(string34);
                    } else {
                        mediaGenAIDetectionMethod = null;
                    }
                    boolean A1M12 = AbstractC167007dF.A1M(query.getInt(A0162));
                    boolean A1M13 = AbstractC167007dF.A1M(query.getInt(A0163));
                    if (query.isNull(A0164) && query.isNull(A0165) && query.isNull(A0166) && query.isNull(A0167)) {
                        c9zu = null;
                    } else {
                        c9zu = new C9ZU(2, query.getFloat(A0164), query.getFloat(A0165), query.getFloat(A0166), query.getFloat(A0167));
                    }
                    if (query.isNull(A0168) && query.isNull(A0169) && query.isNull(A0170) && query.isNull(A0171) && query.isNull(A0172) && query.isNull(A0173) && query.isNull(A0174) && query.isNull(A0175) && query.isNull(A0176) && query.isNull(A0177) && query.isNull(A0178) && query.isNull(A0179) && query.isNull(A0180) && query.isNull(A0181) && query.isNull(A0182) && query.isNull(A0183) && query.isNull(A0184) && query.isNull(A0185) && query.isNull(A0186) && query.isNull(A0187) && query.isNull(A0188) && query.isNull(A0189) && query.isNull(A0190)) {
                        c54969OTb = null;
                    } else {
                        String string39 = query.getString(A0168);
                        if (query.isNull(A0169)) {
                            string29 = null;
                        } else {
                            string29 = query.getString(A0169);
                        }
                        RectF A0022 = OPE.A00(string29);
                        query.getInt(A0170);
                        query.getInt(A0171);
                        if (!query.isNull(A0172)) {
                            query.getString(A0172);
                        }
                        if (query.isNull(A0173)) {
                            string30 = null;
                        } else {
                            string30 = query.getString(A0173);
                        }
                        IGTVShoppingMetadata A0023 = OPG.A00(string30);
                        query.getInt(A0174);
                        query.getInt(A0175);
                        query.getInt(A0176);
                        query.getInt(A0177);
                        query.getInt(A0178);
                        query.getInt(A0179);
                        query.getInt(A0180);
                        query.getInt(A0181);
                        query.getInt(A0182);
                        query.getInt(A0183);
                        if (query.isNull(A0184)) {
                            string31 = null;
                        } else {
                            string31 = query.getString(A0184);
                        }
                        IGTVBrandedContentTags A0024 = OPF.A00(string31);
                        query.getInt(A0185);
                        query.getInt(A0186);
                        query.getInt(A0187);
                        query.getInt(A0188);
                        query.getFloat(A0189);
                        query.getInt(A0190);
                        c54969OTb = new C54969OTb(A0022, A0024, A0023, string39);
                    }
                    if (query.isNull(A0191) && query.isNull(A0192) && query.isNull(A0193)) {
                        c51662Mrt = null;
                    } else {
                        int i2 = query.getInt(A0191);
                        int i3 = query.getInt(A0192);
                        if (query.isNull(A0193)) {
                            string32 = null;
                        } else {
                            string32 = query.getString(A0193);
                        }
                        RectF A0025 = AbstractC50601MVm.A00(string32);
                        if (A0025 != null) {
                            c51662Mrt = new C51662Mrt(A0025, i2, i3);
                        } else {
                            throw AbstractC166987dD.A14(AbstractC111324zv.A00(1617));
                        }
                    }
                    int i4 = query.getInt(A0194);
                    if (query.isNull(A0195)) {
                        string33 = null;
                    } else {
                        string33 = query.getString(A0195);
                    }
                    List A01102 = AbstractC50606MVr.A01(string33);
                    List A0026 = AbstractC50611MVw.A00(query.getString(A0196));
                    EnumC50656MXw enumC50656MXw = (EnumC50656MXw) AbstractC166997dE.A0m(EnumC50656MXw.A01, query.getInt(A0197));
                    if (enumC50656MXw == null) {
                        enumC50656MXw = EnumC50656MXw.A05;
                    }
                    c50602MVn = new C50602MVn(c9zu, A0021, A0017, A0020, mediaGenAIDetectionMethod, A0014, A008, A007, A0016, A009, enumC192868gS, A002, c219779nP, A0019, c54969OTb, new C50603MVo(enumC50656MXw, A01102, A0026, i4), c51662Mrt, A00, A0012, A005, A006, A0011, A0015, string37, string, string5, string38, string9, string10, string12, string13, string15, string18, string19, string20, string23, string24, string25, A003, A004, A0010, A0198, A0199, A0013, A01100, A01101, A0018, i, j, j2, j3, j4, A1M, A1M2, A1M3, A1M4, A1M5, A1M6, A1M7, A1M8, A1M9, A1M10, A1M11, A1M12, A1M13);
                } else {
                    c50602MVn = null;
                }
                c1yp.setTransactionSuccessful();
                return c50602MVn;
            } finally {
                query.close();
                c37581ov.A00();
            }
        } finally {
            c1yp.endTransaction();
        }
    }
}
