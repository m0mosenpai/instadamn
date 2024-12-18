package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Wgj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70770Wgj implements C1EH {
    public static final C70770Wgj A00 = new C70770Wgj();

    /* JADX WARN: Type inference failed for: r1v0, types: [X.UPg, java.lang.Object] */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        String A1P6;
        String A1P7;
        String A1P8;
        C14360o3.A0B(c16l, 0);
        ?? obj = new Object();
        obj.A0M = null;
        obj.A04 = null;
        obj.A0p = false;
        obj.A0N = null;
        obj.A0O = null;
        obj.A0G = null;
        obj.A0H = null;
        obj.A0P = null;
        obj.A0m = null;
        obj.A00 = null;
        obj.A0Q = null;
        obj.A0R = null;
        obj.A0S = "";
        obj.A0T = null;
        obj.A0U = null;
        obj.A0V = null;
        obj.A0I = null;
        obj.A0W = null;
        obj.A0n = null;
        obj.A0J = null;
        obj.A0X = null;
        obj.A0Y = null;
        obj.A05 = null;
        obj.A06 = null;
        obj.A0o = null;
        obj.A0Z = "";
        obj.A01 = null;
        obj.A0a = null;
        obj.A07 = null;
        obj.A08 = null;
        obj.A09 = null;
        obj.A0q = false;
        obj.A0A = null;
        obj.A0B = null;
        obj.A0C = null;
        obj.A0b = null;
        obj.A03 = null;
        obj.A0c = null;
        obj.A0K = null;
        obj.A0D = null;
        obj.A0d = "";
        obj.A0e = null;
        obj.A0f = null;
        obj.A0g = null;
        obj.A0E = null;
        obj.A0r = false;
        obj.A0h = "";
        obj.A02 = null;
        obj.A0F = null;
        obj.A0i = null;
        obj.A0j = null;
        obj.A0k = null;
        obj.A0L = null;
        obj.A0l = null;
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MusicOverlayModel should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                EnumC39578Hdo enumC39578Hdo = null;
                r0 = null;
                VED ved = null;
                enumC39578Hdo = null;
                switch (A0s.hashCode()) {
                    case -2061768941:
                        if (A0s.equals("audio_asset_id")) {
                            obj.A0O = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -2060497896:
                        if (A0s.equals("subtitle")) {
                            obj.A0i = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -2041015649:
                        if (A0s.equals("audio_asset_suggested_start_time_in_ms")) {
                            obj.A0H = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case -1824429564:
                        if (A0s.equals("original_media_id")) {
                            obj.A0c = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1755167329:
                        if (A0s.equals("highlight_start_times_in_ms")) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC166997dE.A1W(arrayList, c16l.A1D());
                                }
                            }
                            obj.A0o = arrayList;
                            break;
                        }
                        break;
                    case -1532724339:
                        if (A0s.equals("overlap_duration_in_ms")) {
                            obj.A0K = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case -880361262:
                        if (A0s.equals("should_mute_audio_reason_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                enumC39578Hdo = (EnumC39578Hdo) EnumC39578Hdo.A01.get(A1P);
                            }
                            obj.A02 = enumC39578Hdo;
                            break;
                        }
                        break;
                    case -757853179:
                        if (A0s.equals("alacorn_session_id")) {
                            obj.A0M = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -747907597:
                        if (A0s.equals(AbstractC111324zv.A00(107))) {
                            obj.A0I = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case -615307517:
                        if (A0s.equals("audio_asset_start_time_in_ms")) {
                            obj.A0G = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case -567396441:
                        if (A0s.equals("should_mute_audio_reason")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                obj.A0h = A1P2;
                                break;
                            }
                        }
                        break;
                    case -512645821:
                        if (A0s.equals("is_eligible_for_vinyl_sticker")) {
                            obj.A09 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -383946360:
                        if (A0s.equals("ig_artist")) {
                            obj.A01 = (UPU) C16V.A01(c16l, Wg7.A00);
                            break;
                        }
                        break;
                    case -310659645:
                        if (A0s.equals("web_30s_preview_download_url")) {
                            obj.A0l = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -254007346:
                        if (A0s.equals("audio_muting_info")) {
                            obj.A00 = (C51699MsU) C16V.A01(c16l, C70736Wg8.A00);
                            break;
                        }
                        break;
                    case -220872642:
                        if (A0s.equals("dark_message")) {
                            obj.A0T = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -144020267:
                        if (A0s.equals("music_product")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                ved = (VED) VED.A01.get(A1P3);
                            }
                            obj.A03 = ved;
                            break;
                        }
                        break;
                    case -45086183:
                        if (A0s.equals("cover_artwork_uri")) {
                            if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                obj.A0S = A1P4;
                                break;
                            }
                        }
                        break;
                    case -22609914:
                        if (A0s.equals("cover_artwork_thumbnail_uri")) {
                            obj.A0R = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 3355:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                            if (c16l.A11() != C16R.A0G && (A1P5 = c16l.A1P()) != null) {
                                obj.A0Z = A1P5;
                                break;
                            }
                        }
                        break;
                    case 114586:
                        if (A0s.equals("tag")) {
                            obj.A0j = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 36206347:
                        if (A0s.equals("local_audio_file_path")) {
                            obj.A0b = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 55068821:
                        if (A0s.equals("duration_in_ms")) {
                            obj.A0J = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case 110371416:
                        if (A0s.equals(DialogModule.KEY_TITLE)) {
                            obj.A0k = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 195518061:
                        if (A0s.equals("is_local_audio")) {
                            obj.A0A = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 437646393:
                        if (A0s.equals("browse_session_id")) {
                            obj.A0Q = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 513375630:
                        if (A0s.equals("trend_rank")) {
                            obj.A0L = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case 527639047:
                        if (A0s.equals("reactive_audio_download_url")) {
                            obj.A0f = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 574519571:
                        if (A0s.equals("artist_id")) {
                            obj.A0N = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 682262252:
                        if (A0s.equals("fast_start_progressive_download_url")) {
                            obj.A0X = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 899841238:
                        if (A0s.equals("is_original_sound")) {
                            obj.A0B = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 930407036:
                        if (A0s.equals("should_allow_music_editing")) {
                            obj.A0E = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 932670004:
                        if (A0s.equals("sanitized_title")) {
                            obj.A0g = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1025801609:
                        if (A0s.equals("audio_cluster_id")) {
                            obj.A0P = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1033668234:
                        if (A0s.equals("is_bookmarked")) {
                            obj.A07 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1120317563:
                        if (A0s.equals("allow_media_creation_with_music")) {
                            obj.A04 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1128191036:
                        if (A0s.equals("dash_manifest")) {
                            obj.A0U = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1164010946:
                        if (A0s.equals("picked_in_post_capture")) {
                            obj.A0D = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1181455637:
                        if (A0s.equals("formatted_clips_media_count")) {
                            obj.A0Y = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1258734948:
                        if (A0s.equals("display_artist")) {
                            obj.A0W = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1353604156:
                        if (A0s.equals("should_mute_audio")) {
                            obj.A0r = c16l.A0d();
                            break;
                        }
                        break;
                    case 1357418199:
                        if (A0s.equals("ig_username")) {
                            obj.A0a = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1436807532:
                        if (A0s.equals("progressive_download_url")) {
                            obj.A0e = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1437867975:
                        if (A0s.equals("audio_filter_infos")) {
                            ArrayList arrayList2 = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    if (c16l.A11() != C16R.A0G && (A1P6 = c16l.A1P()) != null) {
                                        AbstractC65702TsY.A1T(A1P6, arrayList2, VE2.A01);
                                    }
                                }
                            }
                            obj.A0m = arrayList2;
                            break;
                        }
                        break;
                    case 1470663792:
                        if (A0s.equals("is_eligible_for_audio_effects")) {
                            obj.A08 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1545396879:
                        if (A0s.equals("allows_saving")) {
                            obj.A0p = c16l.A0d();
                            break;
                        }
                        break;
                    case 1557415452:
                        if (A0s.equals("display_labels")) {
                            ArrayList arrayList3 = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    if (c16l.A11() != C16R.A0G && (A1P7 = c16l.A1P()) != null) {
                                        AbstractC65702TsY.A1T(A1P7, arrayList3, EnumC68147VDp.A01);
                                    }
                                }
                            }
                            obj.A0n = arrayList3;
                            break;
                        }
                        break;
                    case 1630845353:
                        if (A0s.equals("is_explicit")) {
                            obj.A0q = c16l.A0d();
                            break;
                        }
                        break;
                    case 1873272280:
                        if (A0s.equals("placeholder_profile_pic_url")) {
                            if (c16l.A11() != C16R.A0G && (A1P8 = c16l.A1P()) != null) {
                                obj.A0d = A1P8;
                                break;
                            }
                        }
                        break;
                    case 1911060995:
                        if (A0s.equals("derived_content_id")) {
                            obj.A0V = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1915067790:
                        if (A0s.equals("is_trending_in_clips")) {
                            obj.A0C = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1925617355:
                        if (A0s.equals("should_skip_attribution")) {
                            obj.A0F = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1988432185:
                        if (A0s.equals("has_lyrics")) {
                            obj.A05 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 2112323158:
                        if (A0s.equals("hide_remixing")) {
                            obj.A06 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MusicOverlayModelJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return obj;
    }
}
