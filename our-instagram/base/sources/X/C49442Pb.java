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
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/* renamed from: X.2Pb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49442Pb extends C2PV {
    public final AbstractC49502Ph A00;
    public final AbstractC29571bY A01;
    public final C1YP A02;
    public final AbstractC29601bb A03;
    public final AbstractC29601bb A04;
    public final AbstractC29601bb A05;
    public final AbstractC29601bb A06;
    public final AbstractC29601bb A07;
    public final AbstractC29601bb A08;
    public final AbstractC29601bb A09;
    public final C49452Pc A0A = new Object();
    public final C49472Pe A0B = new Object();
    public final AbstractC29601bb A0C;
    public final AbstractC29601bb A0D;

    @Override // X.C2PV
    public final Object A01(int i, InterfaceC23621Ds interfaceC23621Ds) {
        TreeMap treeMap = C37581ov.A08;
        final C37581ov A00 = AbstractC37591ow.A00("SELECT * FROM drafts WHERE mediadraft_version < ?", 1);
        A00.ADi(1, i);
        return C2Q9.A00(new CancellationSignal(), this.A02, new Callable() { // from class: X.48W
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
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
                EnumC76383bi A002;
                String string12;
                String string13;
                String string14;
                String string15;
                String string16;
                String string17;
                String string18;
                String string19;
                String string20;
                String string21;
                EnumC192868gS enumC192868gS;
                String string22;
                C219779nP c219779nP;
                String string23;
                String string24;
                String string25;
                String string26;
                String string27;
                String string28;
                String string29;
                String string30;
                String string31;
                MediaGenAIDetectionMethod A003;
                C9ZU c9zu;
                String string32;
                String string33;
                String string34;
                C54969OTb c54969OTb;
                String string35;
                C51662Mrt c51662Mrt;
                String string36;
                C49442Pb c49442Pb = this;
                C1YP c1yp = c49442Pb.A02;
                c1yp.beginTransaction();
                try {
                    C37581ov c37581ov = A00;
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
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            String string37 = query.getString(A01);
                            C5JK A004 = AbstractC50598MVj.A00(query.getString(A012));
                            long j = query.getLong(A013);
                            long j2 = query.getLong(A014);
                            long j3 = query.getLong(A015);
                            long j4 = query.getLong(A016);
                            boolean z = false;
                            if (query.getInt(A017) != 0) {
                                z = true;
                            }
                            if (query.isNull(A018)) {
                                string = null;
                            } else {
                                string = query.getString(A018);
                            }
                            List A005 = AbstractC50597MVi.A00(query.getString(A019));
                            if (query.isNull(A0110)) {
                                string2 = null;
                            } else {
                                string2 = query.getString(A0110);
                            }
                            List A006 = AbstractC50597MVi.A00(string2);
                            if (query.isNull(A0111)) {
                                string3 = null;
                            } else {
                                string3 = query.getString(A0111);
                            }
                            AudioOverlayTrack A007 = C49452Pc.A00(string3);
                            if (query.isNull(A0112)) {
                                string4 = null;
                            } else {
                                string4 = query.getString(A0112);
                            }
                            AudioOverlayTrack A008 = C49452Pc.A00(string4);
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
                            C203248yh A009 = AbstractC50600MVl.A00(string6);
                            if (query.isNull(A0115)) {
                                string7 = null;
                            } else {
                                string7 = query.getString(A0115);
                            }
                            ShareMediaLoggingInfo A0010 = AbstractC50604MVp.A00(string7);
                            if (query.isNull(A0116)) {
                                string8 = null;
                            } else {
                                string8 = query.getString(A0116);
                            }
                            C9JS A0011 = AbstractC50599MVk.A00(string8);
                            if (!query.isNull(A0117)) {
                                query.getString(A0117);
                            }
                            String string38 = query.getString(A0118);
                            if (query.isNull(A0119)) {
                                string9 = null;
                            } else {
                                string9 = query.getString(A0119);
                            }
                            boolean z2 = false;
                            if (query.getInt(A0120) != 0) {
                                z2 = true;
                            }
                            if (query.isNull(A0121)) {
                                string10 = null;
                            } else {
                                string10 = query.getString(A0121);
                            }
                            List A0012 = MW2.A00(query.getString(A0122));
                            if (query.isNull(A0123)) {
                                string11 = null;
                            } else {
                                string11 = query.getString(A0123);
                            }
                            C101394gx A0013 = MW1.A00(string11);
                            if (query.isNull(A0124)) {
                                A002 = null;
                            } else {
                                A002 = C49442Pb.A00(query.getString(A0124));
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
                            Venue A0014 = MW3.A00(string14);
                            if (query.isNull(A0129)) {
                                string15 = null;
                            } else {
                                string15 = query.getString(A0129);
                            }
                            List A0199 = c49442Pb.A0A.A01(query.getString(A0130));
                            List A0015 = c49442Pb.A0B.A00(query.getString(A0131));
                            if (query.isNull(A0132)) {
                                string16 = null;
                            } else {
                                string16 = query.getString(A0132);
                            }
                            C110204xp A0016 = AbstractC50610MVv.A00(string16);
                            boolean z3 = false;
                            if (query.getInt(A0133) != 0) {
                                z3 = true;
                            }
                            List A01100 = AbstractC50601MVm.A01(query.getString(A0134));
                            if (query.isNull(A0135)) {
                                string17 = null;
                            } else {
                                string17 = query.getString(A0135);
                            }
                            UpcomingEventImpl A0017 = AbstractC50609MVu.A00(string17);
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
                            if (!query.isNull(A0139)) {
                                string21 = query.getString(A0139);
                            } else {
                                string21 = null;
                            }
                            if (string21 != null) {
                                try {
                                    enumC192868gS = EnumC192868gS.valueOf(string21);
                                } catch (IllegalArgumentException unused) {
                                    enumC192868gS = null;
                                }
                            } else {
                                enumC192868gS = null;
                            }
                            if (!query.isNull(A0140)) {
                                string22 = query.getString(A0140);
                            } else {
                                string22 = null;
                            }
                            if (string22 != null) {
                                try {
                                    c219779nP = A0B.parseFromJson(C16V.A00(string22));
                                } catch (IllegalArgumentException unused2) {
                                    c219779nP = null;
                                }
                            } else {
                                c219779nP = null;
                            }
                            if (!query.isNull(A0141)) {
                                query.getInt(A0141);
                            }
                            boolean z4 = false;
                            if (query.getInt(A0142) != 0) {
                                z4 = true;
                            }
                            if (query.isNull(A0143)) {
                                string23 = null;
                            } else {
                                string23 = query.getString(A0143);
                            }
                            C54632OBh A0018 = AbstractC50605MVq.A00(string23);
                            if (query.isNull(A0144)) {
                                string24 = null;
                            } else {
                                string24 = query.getString(A0144);
                            }
                            C38686GzR A0019 = MW0.A00(string24);
                            boolean z5 = false;
                            if (query.getInt(A0145) != 0) {
                                z5 = true;
                            }
                            boolean z6 = false;
                            if (query.getInt(A0146) != 0) {
                                z6 = true;
                            }
                            boolean z7 = false;
                            if (query.getInt(A0147) != 0) {
                                z7 = true;
                            }
                            boolean z8 = false;
                            if (query.getInt(A0148) != 0) {
                                z8 = true;
                            }
                            boolean z9 = false;
                            if (query.getInt(A0149) != 0) {
                                z9 = true;
                            }
                            List A01101 = AbstractC50601MVm.A01(query.getString(A0150));
                            List A0020 = MW4.A00(query.getString(A0151));
                            if (query.isNull(A0152)) {
                                string25 = null;
                            } else {
                                string25 = query.getString(A0152);
                            }
                            int i2 = query.getInt(A0153);
                            boolean z10 = false;
                            if (query.getInt(A0154) != 0) {
                                z10 = true;
                            }
                            if (query.isNull(A0155)) {
                                string26 = null;
                            } else {
                                string26 = query.getString(A0155);
                            }
                            if (query.isNull(A0156)) {
                                string27 = null;
                            } else {
                                string27 = query.getString(A0156);
                            }
                            if (query.isNull(A0157)) {
                                string28 = null;
                            } else {
                                string28 = query.getString(A0157);
                            }
                            C51685MsG A0021 = AbstractC50614MVz.A00(string28);
                            if (query.isNull(A0158)) {
                                string29 = null;
                            } else {
                                string29 = query.getString(A0158);
                            }
                            C38709H2v A0022 = AbstractC50612MVx.A00(string29);
                            if (query.isNull(A0159)) {
                                string30 = null;
                            } else {
                                string30 = query.getString(A0159);
                            }
                            C51756Mtf A0023 = AbstractC50613MVy.A00(string30);
                            boolean z11 = false;
                            if (query.getInt(A0160) != 0) {
                                z11 = true;
                            }
                            if (!query.isNull(A0161)) {
                                string31 = query.getString(A0161);
                            } else {
                                string31 = null;
                            }
                            if (string31 == null) {
                                A003 = null;
                            } else {
                                A003 = AbstractC85933sM.A00(string31);
                            }
                            boolean z12 = false;
                            if (query.getInt(A0162) != 0) {
                                z12 = true;
                            }
                            boolean z13 = false;
                            if (query.getInt(A0163) != 0) {
                                z13 = true;
                            }
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
                                    string32 = null;
                                } else {
                                    string32 = query.getString(A0169);
                                }
                                RectF A0024 = OPE.A00(string32);
                                query.getInt(A0170);
                                query.getInt(A0171);
                                if (!query.isNull(A0172)) {
                                    query.getString(A0172);
                                }
                                if (query.isNull(A0173)) {
                                    string33 = null;
                                } else {
                                    string33 = query.getString(A0173);
                                }
                                IGTVShoppingMetadata A0025 = OPG.A00(string33);
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
                                    string34 = null;
                                } else {
                                    string34 = query.getString(A0184);
                                }
                                IGTVBrandedContentTags A0026 = OPF.A00(string34);
                                query.getInt(A0185);
                                query.getInt(A0186);
                                query.getInt(A0187);
                                query.getInt(A0188);
                                query.getFloat(A0189);
                                query.getInt(A0190);
                                c54969OTb = new C54969OTb(A0024, A0026, A0025, string39);
                            }
                            if (query.isNull(A0191) && query.isNull(A0192) && query.isNull(A0193)) {
                                c51662Mrt = null;
                            } else {
                                int i3 = query.getInt(A0191);
                                int i4 = query.getInt(A0192);
                                if (query.isNull(A0193)) {
                                    string35 = null;
                                } else {
                                    string35 = query.getString(A0193);
                                }
                                RectF A0027 = AbstractC50601MVm.A00(string35);
                                if (A0027 != null) {
                                    c51662Mrt = new C51662Mrt(A0027, i3, i4);
                                } else {
                                    throw new IllegalStateException(AbstractC111324zv.A00(1617));
                                }
                            }
                            int i5 = query.getInt(A0194);
                            if (query.isNull(A0195)) {
                                string36 = null;
                            } else {
                                string36 = query.getString(A0195);
                            }
                            List A01102 = AbstractC50606MVr.A01(string36);
                            List A0028 = AbstractC50611MVw.A00(query.getString(A0196));
                            EnumC50656MXw enumC50656MXw = (EnumC50656MXw) EnumC50656MXw.A01.get(Integer.valueOf(query.getInt(A0197)));
                            if (enumC50656MXw == null) {
                                enumC50656MXw = EnumC50656MXw.A05;
                            }
                            arrayList.add(new C50602MVn(c9zu, A0023, A0019, A0022, A003, A0016, A0010, A009, A0018, A0011, enumC192868gS, A004, c219779nP, A0021, c54969OTb, new C50603MVo(enumC50656MXw, A01102, A0028, i5), c51662Mrt, A002, A0014, A007, A008, A0013, A0017, string37, string, string5, string38, string9, string10, string12, string13, string15, string18, string19, string20, string25, string26, string27, A005, A006, A0012, A0198, A0199, A0015, A01100, A01101, A0020, i2, j, j2, j3, j4, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13));
                        }
                        c1yp.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        query.close();
                        c37581ov.A00();
                    }
                } finally {
                    c1yp.endTransaction();
                }
            }
        }, interfaceC23621Ds, true);
    }

    @Override // X.C2PV
    public final Object A02(C5JK c5jk, InterfaceC23621Ds interfaceC23621Ds) {
        TreeMap treeMap = C37581ov.A08;
        final C37581ov A00 = AbstractC37591ow.A00("SELECT * FROM drafts WHERE clips_creation_type = ? AND was_last_save_user_initiated = 0 AND has_published_clip = 0 ORDER BY last_save_time DESC", 1);
        C14360o3.A0B(c5jk, 0);
        A00.ADp(1, c5jk.A00);
        return C2Q9.A00(new CancellationSignal(), this.A02, new Callable() { // from class: X.5sr
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
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
                EnumC76383bi A002;
                String string12;
                String string13;
                String string14;
                String string15;
                String string16;
                String string17;
                String string18;
                String string19;
                String string20;
                String string21;
                EnumC192868gS enumC192868gS;
                String string22;
                C219779nP c219779nP;
                String string23;
                String string24;
                String string25;
                String string26;
                String string27;
                String string28;
                String string29;
                String string30;
                String string31;
                MediaGenAIDetectionMethod A003;
                C9ZU c9zu;
                String string32;
                String string33;
                String string34;
                C54969OTb c54969OTb;
                String string35;
                C51662Mrt c51662Mrt;
                String string36;
                C49442Pb c49442Pb = this;
                C1YP c1yp = c49442Pb.A02;
                c1yp.beginTransaction();
                try {
                    C37581ov c37581ov = A00;
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
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            String string37 = query.getString(A01);
                            C5JK A004 = AbstractC50598MVj.A00(query.getString(A012));
                            long j = query.getLong(A013);
                            long j2 = query.getLong(A014);
                            long j3 = query.getLong(A015);
                            long j4 = query.getLong(A016);
                            boolean z = false;
                            if (query.getInt(A017) != 0) {
                                z = true;
                            }
                            if (query.isNull(A018)) {
                                string = null;
                            } else {
                                string = query.getString(A018);
                            }
                            List A005 = AbstractC50597MVi.A00(query.getString(A019));
                            if (query.isNull(A0110)) {
                                string2 = null;
                            } else {
                                string2 = query.getString(A0110);
                            }
                            List A006 = AbstractC50597MVi.A00(string2);
                            if (query.isNull(A0111)) {
                                string3 = null;
                            } else {
                                string3 = query.getString(A0111);
                            }
                            AudioOverlayTrack A007 = C49452Pc.A00(string3);
                            if (query.isNull(A0112)) {
                                string4 = null;
                            } else {
                                string4 = query.getString(A0112);
                            }
                            AudioOverlayTrack A008 = C49452Pc.A00(string4);
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
                            C203248yh A009 = AbstractC50600MVl.A00(string6);
                            if (query.isNull(A0115)) {
                                string7 = null;
                            } else {
                                string7 = query.getString(A0115);
                            }
                            ShareMediaLoggingInfo A0010 = AbstractC50604MVp.A00(string7);
                            if (query.isNull(A0116)) {
                                string8 = null;
                            } else {
                                string8 = query.getString(A0116);
                            }
                            C9JS A0011 = AbstractC50599MVk.A00(string8);
                            if (!query.isNull(A0117)) {
                                query.getString(A0117);
                            }
                            String string38 = query.getString(A0118);
                            if (query.isNull(A0119)) {
                                string9 = null;
                            } else {
                                string9 = query.getString(A0119);
                            }
                            boolean z2 = false;
                            if (query.getInt(A0120) != 0) {
                                z2 = true;
                            }
                            if (query.isNull(A0121)) {
                                string10 = null;
                            } else {
                                string10 = query.getString(A0121);
                            }
                            List A0012 = MW2.A00(query.getString(A0122));
                            if (query.isNull(A0123)) {
                                string11 = null;
                            } else {
                                string11 = query.getString(A0123);
                            }
                            C101394gx A0013 = MW1.A00(string11);
                            if (query.isNull(A0124)) {
                                A002 = null;
                            } else {
                                A002 = C49442Pb.A00(query.getString(A0124));
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
                            Venue A0014 = MW3.A00(string14);
                            if (query.isNull(A0129)) {
                                string15 = null;
                            } else {
                                string15 = query.getString(A0129);
                            }
                            List A0199 = c49442Pb.A0A.A01(query.getString(A0130));
                            List A0015 = c49442Pb.A0B.A00(query.getString(A0131));
                            if (query.isNull(A0132)) {
                                string16 = null;
                            } else {
                                string16 = query.getString(A0132);
                            }
                            C110204xp A0016 = AbstractC50610MVv.A00(string16);
                            boolean z3 = false;
                            if (query.getInt(A0133) != 0) {
                                z3 = true;
                            }
                            List A01100 = AbstractC50601MVm.A01(query.getString(A0134));
                            if (query.isNull(A0135)) {
                                string17 = null;
                            } else {
                                string17 = query.getString(A0135);
                            }
                            UpcomingEventImpl A0017 = AbstractC50609MVu.A00(string17);
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
                            if (!query.isNull(A0139)) {
                                string21 = query.getString(A0139);
                            } else {
                                string21 = null;
                            }
                            if (string21 != null) {
                                try {
                                    enumC192868gS = EnumC192868gS.valueOf(string21);
                                } catch (IllegalArgumentException unused) {
                                    enumC192868gS = null;
                                }
                            } else {
                                enumC192868gS = null;
                            }
                            if (!query.isNull(A0140)) {
                                string22 = query.getString(A0140);
                            } else {
                                string22 = null;
                            }
                            if (string22 != null) {
                                try {
                                    c219779nP = A0B.parseFromJson(C16V.A00(string22));
                                } catch (IllegalArgumentException unused2) {
                                    c219779nP = null;
                                }
                            } else {
                                c219779nP = null;
                            }
                            if (!query.isNull(A0141)) {
                                query.getInt(A0141);
                            }
                            boolean z4 = false;
                            if (query.getInt(A0142) != 0) {
                                z4 = true;
                            }
                            if (query.isNull(A0143)) {
                                string23 = null;
                            } else {
                                string23 = query.getString(A0143);
                            }
                            C54632OBh A0018 = AbstractC50605MVq.A00(string23);
                            if (query.isNull(A0144)) {
                                string24 = null;
                            } else {
                                string24 = query.getString(A0144);
                            }
                            C38686GzR A0019 = MW0.A00(string24);
                            boolean z5 = false;
                            if (query.getInt(A0145) != 0) {
                                z5 = true;
                            }
                            boolean z6 = false;
                            if (query.getInt(A0146) != 0) {
                                z6 = true;
                            }
                            boolean z7 = false;
                            if (query.getInt(A0147) != 0) {
                                z7 = true;
                            }
                            boolean z8 = false;
                            if (query.getInt(A0148) != 0) {
                                z8 = true;
                            }
                            boolean z9 = false;
                            if (query.getInt(A0149) != 0) {
                                z9 = true;
                            }
                            List A01101 = AbstractC50601MVm.A01(query.getString(A0150));
                            List A0020 = MW4.A00(query.getString(A0151));
                            if (query.isNull(A0152)) {
                                string25 = null;
                            } else {
                                string25 = query.getString(A0152);
                            }
                            int i = query.getInt(A0153);
                            boolean z10 = false;
                            if (query.getInt(A0154) != 0) {
                                z10 = true;
                            }
                            if (query.isNull(A0155)) {
                                string26 = null;
                            } else {
                                string26 = query.getString(A0155);
                            }
                            if (query.isNull(A0156)) {
                                string27 = null;
                            } else {
                                string27 = query.getString(A0156);
                            }
                            if (query.isNull(A0157)) {
                                string28 = null;
                            } else {
                                string28 = query.getString(A0157);
                            }
                            C51685MsG A0021 = AbstractC50614MVz.A00(string28);
                            if (query.isNull(A0158)) {
                                string29 = null;
                            } else {
                                string29 = query.getString(A0158);
                            }
                            C38709H2v A0022 = AbstractC50612MVx.A00(string29);
                            if (query.isNull(A0159)) {
                                string30 = null;
                            } else {
                                string30 = query.getString(A0159);
                            }
                            C51756Mtf A0023 = AbstractC50613MVy.A00(string30);
                            boolean z11 = false;
                            if (query.getInt(A0160) != 0) {
                                z11 = true;
                            }
                            if (!query.isNull(A0161)) {
                                string31 = query.getString(A0161);
                            } else {
                                string31 = null;
                            }
                            if (string31 == null) {
                                A003 = null;
                            } else {
                                A003 = AbstractC85933sM.A00(string31);
                            }
                            boolean z12 = false;
                            if (query.getInt(A0162) != 0) {
                                z12 = true;
                            }
                            boolean z13 = false;
                            if (query.getInt(A0163) != 0) {
                                z13 = true;
                            }
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
                                    string32 = null;
                                } else {
                                    string32 = query.getString(A0169);
                                }
                                RectF A0024 = OPE.A00(string32);
                                query.getInt(A0170);
                                query.getInt(A0171);
                                if (!query.isNull(A0172)) {
                                    query.getString(A0172);
                                }
                                if (query.isNull(A0173)) {
                                    string33 = null;
                                } else {
                                    string33 = query.getString(A0173);
                                }
                                IGTVShoppingMetadata A0025 = OPG.A00(string33);
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
                                    string34 = null;
                                } else {
                                    string34 = query.getString(A0184);
                                }
                                IGTVBrandedContentTags A0026 = OPF.A00(string34);
                                query.getInt(A0185);
                                query.getInt(A0186);
                                query.getInt(A0187);
                                query.getInt(A0188);
                                query.getFloat(A0189);
                                query.getInt(A0190);
                                c54969OTb = new C54969OTb(A0024, A0026, A0025, string39);
                            }
                            if (query.isNull(A0191) && query.isNull(A0192) && query.isNull(A0193)) {
                                c51662Mrt = null;
                            } else {
                                int i2 = query.getInt(A0191);
                                int i3 = query.getInt(A0192);
                                if (query.isNull(A0193)) {
                                    string35 = null;
                                } else {
                                    string35 = query.getString(A0193);
                                }
                                RectF A0027 = AbstractC50601MVm.A00(string35);
                                if (A0027 != null) {
                                    c51662Mrt = new C51662Mrt(A0027, i2, i3);
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'android.graphics.RectF', but it was NULL.");
                                }
                            }
                            int i4 = query.getInt(A0194);
                            if (query.isNull(A0195)) {
                                string36 = null;
                            } else {
                                string36 = query.getString(A0195);
                            }
                            List A01102 = AbstractC50606MVr.A01(string36);
                            List A0028 = AbstractC50611MVw.A00(query.getString(A0196));
                            EnumC50656MXw enumC50656MXw = (EnumC50656MXw) EnumC50656MXw.A01.get(Integer.valueOf(query.getInt(A0197)));
                            if (enumC50656MXw == null) {
                                enumC50656MXw = EnumC50656MXw.A05;
                            }
                            arrayList.add(new C50602MVn(c9zu, A0023, A0019, A0022, A003, A0016, A0010, A009, A0018, A0011, enumC192868gS, A004, c219779nP, A0021, c54969OTb, new C50603MVo(enumC50656MXw, A01102, A0028, i4), c51662Mrt, A002, A0014, A007, A008, A0013, A0017, string37, string, string5, string38, string9, string10, string12, string13, string15, string18, string19, string20, string25, string26, string27, A005, A006, A0012, A0198, A0199, A0015, A01100, A01101, A0020, i, j, j2, j3, j4, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13));
                        }
                        c1yp.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        query.close();
                        c37581ov.A00();
                    }
                } finally {
                    c1yp.endTransaction();
                }
            }
        }, interfaceC23621Ds, true);
    }

    @Override // X.C2PV
    public final Object A03(C5JK c5jk, InterfaceC23621Ds interfaceC23621Ds) {
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT EXISTS(SELECT 1 FROM drafts WHERE clips_creation_type = ? AND was_last_save_user_initiated = 0 AND has_published_clip = 0)", 1);
        C14360o3.A0B(c5jk, 0);
        A00.ADp(1, c5jk.A00);
        return C2Q9.A00(new CancellationSignal(), this.A02, new CallableC50052M7p(A00, this), interfaceC23621Ds, true);
    }

    @Override // X.C2PV
    public final Object A04(C5JK c5jk, InterfaceC23621Ds interfaceC23621Ds) {
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT EXISTS(SELECT 1 FROM drafts WHERE clips_creation_type = ? AND was_last_save_user_initiated = 1 AND has_published_clip = 0)", 1);
        A00.ADp(1, c5jk.A00);
        return C2Q9.A00(new CancellationSignal(), this.A02, new CallableC50053M7q(A00, this), interfaceC23621Ds, true);
    }

    @Override // X.C2PV
    public final Object A05(C5JK c5jk, InterfaceC23621Ds interfaceC23621Ds) {
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT EXISTS(SELECT 1 FROM drafts WHERE clips_creation_type = ?)", 1);
        C14360o3.A0B(c5jk, 0);
        A00.ADp(1, c5jk.A00);
        return C2Q9.A00(new CancellationSignal(), this.A02, new CallableC50051M7o(A00, this), interfaceC23621Ds, true);
    }

    @Override // X.C2PV
    public final Object A06(C54744OFv c54744OFv, InterfaceC23621Ds interfaceC23621Ds) {
        return C2Q9.A01(this.A02, new PUH(this, c54744OFv), interfaceC23621Ds);
    }

    @Override // X.C2PV
    public final Object A07(String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        return C2Q9.A01(this.A02, new M81(this, str2, str), interfaceC23621Ds);
    }

    @Override // X.C2PV
    public final Object A08(String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        return C2Q9.A01(this.A02, new CallableC50061M7z(this, str, str2), interfaceC23621Ds);
    }

    @Override // X.C2PV
    public final Object A09(String str, InterfaceC23621Ds interfaceC23621Ds) {
        return C2Q9.A01(this.A02, new CallableC44087JeC(this, str), interfaceC23621Ds);
    }

    @Override // X.C2PV
    public final Object A0A(String str, InterfaceC23621Ds interfaceC23621Ds) {
        return C2Q9.A01(this.A02, new CallableC50048M7l(this, str), interfaceC23621Ds);
    }

    @Override // X.C2PV
    public final Object A0B(String str, InterfaceC23621Ds interfaceC23621Ds) {
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT EXISTS(SELECT 1 FROM drafts WHERE id = ?)", 1);
        A00.ADp(1, str);
        return C2Q9.A00(new CancellationSignal(), this.A02, new CallableC50049M7m(A00, this), interfaceC23621Ds, true);
    }

    @Override // X.C2PV
    public final Object A0C(String str, InterfaceC23621Ds interfaceC23621Ds) {
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT * FROM drafts WHERE id = ?", 1);
        A00.ADp(1, str);
        return C2Q9.A00(new CancellationSignal(), this.A02, new MYI(A00, this), interfaceC23621Ds, true);
    }

    @Override // X.C2PV
    public final Object A0D(String str, InterfaceC23621Ds interfaceC23621Ds) {
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT clips_creation_type FROM drafts WHERE id = ?", 1);
        A00.ADp(1, str);
        return C2Q9.A00(new CancellationSignal(), this.A02, new CallableC50667MYk(A00, this), interfaceC23621Ds, true);
    }

    @Override // X.C2PV
    public final Object A0E(String str, InterfaceC23621Ds interfaceC23621Ds) {
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT id, video_segments FROM drafts WHERE id = ?", 1);
        A00.ADp(1, str);
        return C2Q9.A00(new CancellationSignal(), this.A02, new PUI(A00, this), interfaceC23621Ds, true);
    }

    @Override // X.C2PV
    public final Object A0F(String str, InterfaceC23621Ds interfaceC23621Ds) {
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT id FROM drafts WHERE media_id = ?", 1);
        A00.ADp(1, str);
        return C2Q9.A00(new CancellationSignal(), this.A02, new CallableC50054M7r(A00, this), interfaceC23621Ds, false);
    }

    @Override // X.C2PV
    public final Object A0G(String str, InterfaceC23621Ds interfaceC23621Ds) {
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT id, clips_creation_type, video_segments, remix_info, last_save_time, pending_media_key, caption, cover_photo_file_uri, media_id, has_published_clip, created_at_time, name, is_pinned FROM drafts WHERE id = ?", 1);
        A00.ADp(1, str);
        return C2Q9.A00(new CancellationSignal(), this.A02, new PUJ(A00, this), interfaceC23621Ds, true);
    }

    @Override // X.C2PV
    public final Object A0H(String str, InterfaceC23621Ds interfaceC23621Ds) {
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT EXISTS(SELECT 1 FROM drafts WHERE id = ? AND has_published_clip = 0)", 1);
        A00.ADp(1, str);
        return C2Q9.A00(new CancellationSignal(), this.A02, new CallableC50050M7n(A00, this), interfaceC23621Ds, true);
    }

    @Override // X.C2PV
    public final Object A0I(String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        return C2Q9.A01(this.A02, new M80(this, str, i), interfaceC23621Ds);
    }

    @Override // X.C2PV
    public final Object A0J(String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        return C2Q9.A01(this.A02, new M82(this, str, z), interfaceC23621Ds);
    }

    @Override // X.C2PV
    public final Object A0K(List list, InterfaceC23621Ds interfaceC23621Ds) {
        return C2Q9.A01(this.A02, new CallableC50055M7s(this, list), interfaceC23621Ds);
    }

    @Override // X.C2PV
    public final Object A0L(List list, InterfaceC23621Ds interfaceC23621Ds) {
        return C2Q9.A01(this.A02, new CallableC50047M7k(this, list), interfaceC23621Ds);
    }

    @Override // X.C2PV
    public final Object A0M(InterfaceC23621Ds interfaceC23621Ds) {
        TreeMap treeMap = C37581ov.A08;
        final C37581ov A00 = AbstractC37591ow.A00("SELECT id FROM drafts ORDER BY last_save_time DESC", 0);
        return C2Q9.A00(new CancellationSignal(), this.A02, new Callable() { // from class: X.4JW
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                C1YP c1yp = this.A02;
                c1yp.beginTransaction();
                try {
                    C37581ov c37581ov = A00;
                    Cursor query = c1yp.query(c37581ov, (CancellationSignal) null);
                    try {
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            arrayList.add(new C116135Ns(query.getString(0)));
                        }
                        c1yp.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        query.close();
                        c37581ov.A00();
                    }
                } finally {
                    c1yp.endTransaction();
                }
            }
        }, interfaceC23621Ds, true);
    }

    @Override // X.C2PV
    public final Object A0N(InterfaceC23621Ds interfaceC23621Ds, final long j) {
        return C2Q9.A01(this.A02, new Callable() { // from class: X.48Y
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                C49442Pb c49442Pb = C49442Pb.this;
                AbstractC29601bb abstractC29601bb = c49442Pb.A05;
                InterfaceC37561ot acquire = abstractC29601bb.acquire();
                acquire.ADi(1, j);
                try {
                    C1YP c1yp = c49442Pb.A02;
                    c1yp.beginTransaction();
                    try {
                        acquire.ATb();
                        c1yp.setTransactionSuccessful();
                        return C0eB.A00;
                    } finally {
                        c1yp.endTransaction();
                    }
                } finally {
                    abstractC29601bb.release(acquire);
                }
            }
        }, interfaceC23621Ds);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.8tu] */
    @Override // X.C2PV
    public final List A0O() {
        String string;
        String string2;
        Integer valueOf;
        Boolean valueOf2;
        Long valueOf3;
        String string3;
        String string4;
        String string5;
        String string6;
        Integer valueOf4;
        Boolean valueOf5;
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT id, clips_creation_type, was_last_save_user_initiated, video_segments, remix_info, last_save_time, pending_media_key, caption, cover_photo_file_uri, media_id, has_published_clip, created_at_time, name FROM drafts ORDER BY last_save_time DESC", 0);
        C1YP c1yp = this.A02;
        c1yp.assertNotSuspendingTransaction();
        c1yp.beginTransaction();
        try {
            Cursor query = c1yp.query(A00, (CancellationSignal) null);
            try {
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    ?? obj = new Object();
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    obj.A06 = string;
                    boolean z = true;
                    if (query.isNull(1)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(1);
                    }
                    obj.A04 = string2;
                    if (!query.isNull(2)) {
                        valueOf = Integer.valueOf(query.getInt(2));
                    } else {
                        valueOf = null;
                    }
                    if (valueOf == null) {
                        valueOf2 = null;
                    } else {
                        int intValue = valueOf.intValue();
                        boolean z2 = false;
                        if (intValue != 0) {
                            z2 = true;
                        }
                        valueOf2 = Boolean.valueOf(z2);
                    }
                    obj.A01 = valueOf2;
                    if (query.isNull(5)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(query.getLong(5));
                    }
                    obj.A02 = valueOf3;
                    if (query.isNull(6)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(6);
                    }
                    obj.A08 = string3;
                    if (query.isNull(7)) {
                        string4 = null;
                    } else {
                        string4 = query.getString(7);
                    }
                    obj.A03 = string4;
                    if (query.isNull(8)) {
                        string5 = null;
                    } else {
                        string5 = query.getString(8);
                    }
                    obj.A05 = string5;
                    if (query.isNull(9)) {
                        string6 = null;
                    } else {
                        string6 = query.getString(9);
                    }
                    obj.A07 = string6;
                    if (!query.isNull(10)) {
                        valueOf4 = Integer.valueOf(query.getInt(10));
                    } else {
                        valueOf4 = null;
                    }
                    if (valueOf4 == null) {
                        valueOf5 = null;
                    } else {
                        if (valueOf4.intValue() == 0) {
                            z = false;
                        }
                        valueOf5 = Boolean.valueOf(z);
                    }
                    obj.A00 = valueOf5;
                    arrayList.add(obj);
                }
                c1yp.setTransactionSuccessful();
                return arrayList;
            } finally {
                query.close();
                A00.A00();
            }
        } finally {
            c1yp.endTransaction();
        }
    }

    @Override // X.C2PV
    public final InterfaceC19390xP A0P() {
        TreeMap treeMap = C37581ov.A08;
        final C37581ov A00 = AbstractC37591ow.A00("SELECT id, clips_creation_type, video_segments, remix_info, last_save_time, pending_media_key, caption, cover_photo_file_uri, media_id, has_published_clip, created_at_time, name, is_pinned FROM drafts WHERE mediadraft_media_type = 2 ORDER BY last_save_time DESC", 0);
        return C2Q9.A02(this.A02, new Callable() { // from class: X.2QA
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                String string;
                String string2;
                String string3;
                String string4;
                String string5;
                C1YP c1yp = this.A02;
                c1yp.beginTransaction();
                try {
                    Cursor query = c1yp.query(A00, (CancellationSignal) null);
                    try {
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            String string6 = query.getString(0);
                            C5JK A002 = AbstractC50598MVj.A00(query.getString(1));
                            List A003 = AbstractC50597MVi.A00(query.getString(2));
                            if (query.isNull(3)) {
                                string = null;
                            } else {
                                string = query.getString(3);
                            }
                            C9JS A004 = AbstractC50599MVk.A00(string);
                            long j = query.getLong(4);
                            if (query.isNull(5)) {
                                string2 = null;
                            } else {
                                string2 = query.getString(5);
                            }
                            String string7 = query.getString(6);
                            if (query.isNull(7)) {
                                string3 = null;
                            } else {
                                string3 = query.getString(7);
                            }
                            if (query.isNull(8)) {
                                string4 = null;
                            } else {
                                string4 = query.getString(8);
                            }
                            boolean z = false;
                            if (query.getInt(9) != 0) {
                                z = true;
                            }
                            long j2 = query.getLong(10);
                            if (query.isNull(11)) {
                                string5 = null;
                            } else {
                                string5 = query.getString(11);
                            }
                            boolean z2 = false;
                            if (query.getInt(12) != 0) {
                                z2 = true;
                            }
                            arrayList.add(new MWL(A004, A002, string6, string2, string7, string3, string4, string5, A003, j, j2, z, z2));
                        }
                        c1yp.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        query.close();
                    }
                } finally {
                    c1yp.endTransaction();
                }
            }

            public final void finalize() {
                A00.A00();
            }
        }, new String[]{"drafts"}, true);
    }

    @Override // X.C2PV
    public final InterfaceC19390xP A0Q() {
        TreeMap treeMap = C37581ov.A08;
        final C37581ov A00 = AbstractC37591ow.A00("SELECT id, clips_creation_type, video_segments, remix_info, last_save_time, pending_media_key, caption, cover_photo_file_uri, media_id, has_published_clip, created_at_time, name, is_pinned FROM drafts WHERE mediadraft_media_type = 2 AND was_last_save_user_initiated = 1 ORDER BY last_save_time DESC", 0);
        return C2Q9.A02(this.A02, new Callable() { // from class: X.2Q8
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                String string;
                String string2;
                String string3;
                String string4;
                String string5;
                C1YP c1yp = this.A02;
                c1yp.beginTransaction();
                try {
                    Cursor query = c1yp.query(A00, (CancellationSignal) null);
                    try {
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            String string6 = query.getString(0);
                            C5JK A002 = AbstractC50598MVj.A00(query.getString(1));
                            List A003 = AbstractC50597MVi.A00(query.getString(2));
                            if (query.isNull(3)) {
                                string = null;
                            } else {
                                string = query.getString(3);
                            }
                            C9JS A004 = AbstractC50599MVk.A00(string);
                            long j = query.getLong(4);
                            if (query.isNull(5)) {
                                string2 = null;
                            } else {
                                string2 = query.getString(5);
                            }
                            String string7 = query.getString(6);
                            if (query.isNull(7)) {
                                string3 = null;
                            } else {
                                string3 = query.getString(7);
                            }
                            if (query.isNull(8)) {
                                string4 = null;
                            } else {
                                string4 = query.getString(8);
                            }
                            boolean z = false;
                            if (query.getInt(9) != 0) {
                                z = true;
                            }
                            long j2 = query.getLong(10);
                            if (query.isNull(11)) {
                                string5 = null;
                            } else {
                                string5 = query.getString(11);
                            }
                            boolean z2 = false;
                            if (query.getInt(12) != 0) {
                                z2 = true;
                            }
                            arrayList.add(new MWL(A004, A002, string6, string2, string7, string3, string4, string5, A003, j, j2, z, z2));
                        }
                        c1yp.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        query.close();
                    }
                } finally {
                    c1yp.endTransaction();
                }
            }

            public final void finalize() {
                A00.A00();
            }
        }, new String[]{"drafts"}, true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Pc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.2Pe] */
    public C49442Pb(final C1YP c1yp) {
        this.A02 = c1yp;
        this.A01 = new AbstractC29571bY(c1yp) { // from class: X.2Pf
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `drafts` (`id`,`clips_creation_type`,`last_user_save_time`,`last_save_time`,`created_at_time`,`last_pre_capture_save_time`,`was_last_save_user_initiated`,`name`,`video_segments`,`audio_Track`,`pending_media_key`,`post_capture_media_edits`,`logging_info`,`remix_info`,`caption`,`cover_photo_file_uri`,`is_share_to_feed`,`funded_content_deal_id`,`people_tags`,`comment_poll`,`audience`,`collaborator_id`,`collaborator_ids`,`entry_point`,`location`,`original_audio_title`,`multiple_audio_tracks`,`clips_sound_effects`,`clips_template_info`,`template_disabled`,`clips_multiple_audio_segments`,`upcoming_event`,`linked_highlight_id`,`highlight_media_id`,`media_id`,`voice_effect`,`audio_enhancement_effect`,`branded_content_tags_model`,`clips_shopping_metadata`,`has_published_clip`,`is_comment_disabled`,`is_caption_enabled`,`is_like_and_view_counts_disabled`,`is_share_count_disabled`,`is_gifts_allowed`,`interest_topics`,`stacked_timeline_actions`,`org_cta_type`,`max_duration_in_ms`,`hide_from_profile_grid`,`meta_verified_added_link`,`metagallery_media_id`,`bio_product`,`content_scheduling_metadata`,`trial_params`,`has_comment_prompt`,`gen_ai_detection_method`,`is_pinned`,`third_party_downloads_enabled`,`cropcords_cropLeft`,`cropcords_cropTop`,`cropcords_cropRight`,`cropcords_cropBottom`,`videocrop_width`,`videocrop_height`,`videocrop_rectF`,`mediadraft_version`,`mediadraft_stickers`,`mediadraft_unschematized_compositions`,`mediadraft_media_type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX WARN: Removed duplicated region for block: B:109:0x03e6  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x03f2  */
            /* JADX WARN: Removed duplicated region for block: B:115:0x040b  */
            /* JADX WARN: Removed duplicated region for block: B:118:0x0414  */
            /* JADX WARN: Removed duplicated region for block: B:130:0x04b0  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x04cd  */
            /* JADX WARN: Removed duplicated region for block: B:138:0x04f3  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x0566  */
            /* JADX WARN: Removed duplicated region for block: B:148:0x0574  */
            /* JADX WARN: Removed duplicated region for block: B:150:0x047a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:157:0x044c A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:164:0x042f A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:171:0x041c  */
            /* JADX WARN: Removed duplicated region for block: B:172:0x0420  */
            /* JADX WARN: Removed duplicated region for block: B:173:0x0424  */
            /* JADX WARN: Removed duplicated region for block: B:174:0x0428  */
            /* JADX WARN: Removed duplicated region for block: B:175:0x038a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // X.AbstractC29571bY
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void bind(X.InterfaceC37561ot r9, java.lang.Object r10) {
                /*
                    Method dump skipped, instructions count: 1458
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C49482Pf.bind(X.1ot, java.lang.Object):void");
            }
        };
        this.A00 = new AbstractC49502Ph(c1yp) { // from class: X.2Pg
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE OR ABORT `drafts` SET `id` = ?,`mediadraft_version` = ?,`mediadraft_stickers` = ?,`mediadraft_unschematized_compositions` = ?,`mediadraft_media_type` = ? WHERE `id` = ?";
            }

            @Override // X.AbstractC49502Ph
            public final /* bridge */ /* synthetic */ void A01(InterfaceC37561ot interfaceC37561ot, Object obj) {
                O7T o7t = (O7T) obj;
                String str = o7t.A01;
                interfaceC37561ot.ADp(1, str);
                C50603MVo c50603MVo = o7t.A00;
                interfaceC37561ot.ADi(2, c50603MVo.A00);
                interfaceC37561ot.ADp(3, AbstractC50606MVr.A00(c50603MVo.A02));
                List list = c50603MVo.A03;
                C14360o3.A0B(list, 0);
                interfaceC37561ot.ADp(4, AbstractC001800i.A0P("␞", "", "", list, C57632Phi.A00));
                C14360o3.A0B(c50603MVo.A01, 0);
                interfaceC37561ot.ADi(5, r0.A00);
                interfaceC37561ot.ADp(6, str);
            }
        };
        this.A03 = new AbstractC29601bb(c1yp) { // from class: X.2Pi
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM drafts WHERE id = ?";
            }
        };
        this.A04 = new AbstractC29601bb(c1yp) { // from class: X.2Pj
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM drafts WHERE pending_media_key = ?";
            }
        };
        this.A0D = new AbstractC29601bb(c1yp) { // from class: X.2Pk
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM drafts  WHERE clips_creation_type = ?";
            }
        };
        this.A05 = new AbstractC29601bb(c1yp) { // from class: X.2Pl
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM drafts  WHERE has_published_clip = 1 AND last_save_time < ?";
            }
        };
        this.A07 = new AbstractC29601bb(c1yp) { // from class: X.2Pm
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE drafts SET media_id = ? WHERE pending_media_key = ?";
            }
        };
        this.A09 = new AbstractC29601bb(c1yp) { // from class: X.2Pn
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE drafts SET has_published_clip = ? , was_last_save_user_initiated = 1 WHERE media_id = ?";
            }
        };
        this.A0C = new AbstractC29601bb(c1yp) { // from class: X.2Po
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM drafts";
            }
        };
        this.A06 = new AbstractC29601bb(c1yp) { // from class: X.2Pp
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE drafts SET name = ? WHERE id = ?";
            }
        };
        this.A08 = new AbstractC29601bb(c1yp) { // from class: X.2Pq
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE drafts SET is_pinned = ? WHERE id = ?";
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static EnumC76383bi A00(String str) {
        switch (str.hashCode()) {
            case -2032180703:
                if (str.equals("DEFAULT")) {
                    return EnumC76383bi.A06;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("Can't convert value to enum, unknown value: ", str));
            case -1610526326:
                if (str.equals("MUTUAL_FOLLOWERS")) {
                    return EnumC76383bi.A0B;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("Can't convert value to enum, unknown value: ", str));
            case -724445793:
                if (str.equals("FRIEND_LIST")) {
                    return EnumC76383bi.A09;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("Can't convert value to enum, unknown value: ", str));
            case -360916202:
                if (str.equals("SHARE_TO_DIRECT_PREVIEW")) {
                    return EnumC76383bi.A0H;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("Can't convert value to enum, unknown value: ", str));
            case 2432460:
                if (str.equals("OPAL")) {
                    return EnumC76383bi.A0C;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("Can't convert value to enum, unknown value: ", str));
            case 33310920:
                if (str.equals("REPLY_CONTROL")) {
                    return EnumC76383bi.A0E;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("Can't convert value to enum, unknown value: ", str));
            case 391665248:
                if (str.equals("ROLL_CALL_MUTUALS")) {
                    return EnumC76383bi.A0G;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("Can't convert value to enum, unknown value: ", str));
            case 605294006:
                if (str.equals("FOLLOWERS_ONLY")) {
                    return EnumC76383bi.A08;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("Can't convert value to enum, unknown value: ", str));
            case 734941130:
                if (str.equals("HALLPASS")) {
                    return EnumC76383bi.A0A;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("Can't convert value to enum, unknown value: ", str));
            case 1101936494:
                if (str.equals("PUBLIC_CHAT")) {
                    return EnumC76383bi.A0D;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("Can't convert value to enum, unknown value: ", str));
            case 1618716290:
                if (str.equals("FAN_CLUB")) {
                    return EnumC76383bi.A07;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("Can't convert value to enum, unknown value: ", str));
            case 1702038030:
                if (str.equals("CLOSE_FRIENDS")) {
                    return EnumC76383bi.A04;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("Can't convert value to enum, unknown value: ", str));
            case 1873989462:
                if (str.equals("ROLL_CALL_FOLLOWERS")) {
                    return EnumC76383bi.A0F;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("Can't convert value to enum, unknown value: ", str));
            case 1999208305:
                if (str.equals("CUSTOM")) {
                    return EnumC76383bi.A05;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("Can't convert value to enum, unknown value: ", str));
            default:
                throw new IllegalArgumentException(AnonymousClass001.A0R("Can't convert value to enum, unknown value: ", str));
        }
    }
}
