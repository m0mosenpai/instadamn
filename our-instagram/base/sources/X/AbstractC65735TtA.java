package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicOverlayStickerModelIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.TtA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC65735TtA {
    public static Map A00(MusicOverlayStickerModelIntf musicOverlayStickerModelIntf) {
        String str;
        ArrayList arrayList;
        String str2;
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (musicOverlayStickerModelIntf.Aal() != null) {
            linkedHashMap.put("alacorn_session_id", musicOverlayStickerModelIntf.Aal());
        }
        if (musicOverlayStickerModelIntf.AbG() != null) {
            linkedHashMap.put("allow_media_creation_with_music", musicOverlayStickerModelIntf.AbG());
        }
        musicOverlayStickerModelIntf.getAllowsSaving();
        linkedHashMap.put("allows_saving", Boolean.valueOf(musicOverlayStickerModelIntf.getAllowsSaving()));
        if (musicOverlayStickerModelIntf.getArtistId() != null) {
            linkedHashMap.put("artist_id", musicOverlayStickerModelIntf.getArtistId());
        }
        if (musicOverlayStickerModelIntf.getAudioAssetId() != null) {
            linkedHashMap.put("audio_asset_id", musicOverlayStickerModelIntf.getAudioAssetId());
        }
        if (musicOverlayStickerModelIntf.Adg() != null) {
            linkedHashMap.put("audio_asset_start_time_in_ms", musicOverlayStickerModelIntf.Adg());
        }
        if (musicOverlayStickerModelIntf.Adh() != null) {
            linkedHashMap.put("audio_asset_suggested_start_time_in_ms", musicOverlayStickerModelIntf.Adh());
        }
        if (musicOverlayStickerModelIntf.getAudioClusterId() != null) {
            linkedHashMap.put("audio_cluster_id", musicOverlayStickerModelIntf.getAudioClusterId());
        }
        String str3 = null;
        if (musicOverlayStickerModelIntf.Ado() != null) {
            List<AudioFilterInfoIntf> Ado = musicOverlayStickerModelIntf.Ado();
            if (Ado != null) {
                arrayList2 = new ArrayList();
                for (AudioFilterInfoIntf audioFilterInfoIntf : Ado) {
                    if (audioFilterInfoIntf != null) {
                        arrayList2.add(audioFilterInfoIntf.F7o());
                    }
                }
            } else {
                arrayList2 = null;
            }
            linkedHashMap.put("audio_filter_infos", arrayList2);
        }
        if (musicOverlayStickerModelIntf.Adu() != null) {
            AudioMutingInfoIntf Adu = musicOverlayStickerModelIntf.Adu();
            if (Adu != null) {
                treeUpdaterJNI = Adu.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("audio_muting_info", treeUpdaterJNI);
        }
        if (musicOverlayStickerModelIntf.AiR() != null) {
            linkedHashMap.put("browse_session_id", musicOverlayStickerModelIntf.AiR());
        }
        if (musicOverlayStickerModelIntf.Aql() != null) {
            linkedHashMap.put("contains_lyrics", musicOverlayStickerModelIntf.Aql());
        }
        if (musicOverlayStickerModelIntf.AsE() != null) {
            ImageUrl AsE = musicOverlayStickerModelIntf.AsE();
            if (AsE != null) {
                str2 = AsE.getUrl();
            } else {
                str2 = null;
            }
            linkedHashMap.put("cover_artwork_thumbnail_uri", str2);
        }
        if (musicOverlayStickerModelIntf.AsF() != null) {
            linkedHashMap.put("cover_artwork_uri", musicOverlayStickerModelIntf.AsF().getUrl());
        }
        if (musicOverlayStickerModelIntf.AvV() != null) {
            linkedHashMap.put("dark_message", musicOverlayStickerModelIntf.AvV());
        }
        if (musicOverlayStickerModelIntf.getDashManifest() != null) {
            linkedHashMap.put("dash_manifest", musicOverlayStickerModelIntf.getDashManifest());
        }
        if (musicOverlayStickerModelIntf.getDerivedContentId() != null) {
            linkedHashMap.put("derived_content_id", musicOverlayStickerModelIntf.getDerivedContentId());
        }
        if (musicOverlayStickerModelIntf.Awp() != null) {
            linkedHashMap.put(AbstractC111324zv.A00(107), musicOverlayStickerModelIntf.Awp());
        }
        if (musicOverlayStickerModelIntf.getDisplayArtist() != null) {
            linkedHashMap.put("display_artist", musicOverlayStickerModelIntf.getDisplayArtist());
        }
        if (musicOverlayStickerModelIntf.AyW() != null) {
            List<AudioMetadataLabels> AyW = musicOverlayStickerModelIntf.AyW();
            if (AyW != null) {
                arrayList = AbstractC167017dG.A0q(AyW);
                for (AudioMetadataLabels audioMetadataLabels : AyW) {
                    C14360o3.A0B(audioMetadataLabels, 0);
                    arrayList.add(audioMetadataLabels.A00);
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("display_labels", arrayList);
        }
        if (musicOverlayStickerModelIntf.Azi() != null) {
            linkedHashMap.put("duration_in_ms", musicOverlayStickerModelIntf.Azi());
        }
        if (musicOverlayStickerModelIntf.getFastStartProgressiveDownloadUrl() != null) {
            linkedHashMap.put("fast_start_progressive_download_url", musicOverlayStickerModelIntf.getFastStartProgressiveDownloadUrl());
        }
        if (musicOverlayStickerModelIntf.getFormattedClipsMediaCount() != null) {
            linkedHashMap.put("formatted_clips_media_count", musicOverlayStickerModelIntf.getFormattedClipsMediaCount());
        }
        if (musicOverlayStickerModelIntf.BC4() != null) {
            linkedHashMap.put("has_lyrics", musicOverlayStickerModelIntf.BC4());
        }
        if (musicOverlayStickerModelIntf.BDn() != null) {
            linkedHashMap.put("hide_remixing", musicOverlayStickerModelIntf.BDn());
        }
        if (musicOverlayStickerModelIntf.BE6() != null) {
            linkedHashMap.put("highlight_start_times_in_ms", musicOverlayStickerModelIntf.BE6());
        }
        if (musicOverlayStickerModelIntf.getId() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, musicOverlayStickerModelIntf.getId());
        }
        User BFU = musicOverlayStickerModelIntf.BFU();
        if (BFU != null) {
            linkedHashMap.put("ig_artist", BFU.A07());
        }
        if (musicOverlayStickerModelIntf.getIgUsername() != null) {
            linkedHashMap.put("ig_username", musicOverlayStickerModelIntf.getIgUsername());
        }
        if (musicOverlayStickerModelIntf.CQj() != null) {
            linkedHashMap.put("is_bookmarked", musicOverlayStickerModelIntf.CQj());
        }
        if (musicOverlayStickerModelIntf.CT1() != null) {
            linkedHashMap.put("is_eligible_for_audio_effects", musicOverlayStickerModelIntf.CT1());
        }
        if (musicOverlayStickerModelIntf.CTb() != null) {
            linkedHashMap.put("is_eligible_for_vinyl_sticker", musicOverlayStickerModelIntf.CTb());
        }
        musicOverlayStickerModelIntf.isExplicit();
        linkedHashMap.put("is_explicit", Boolean.valueOf(musicOverlayStickerModelIntf.isExplicit()));
        if (musicOverlayStickerModelIntf.CXk() != null) {
            linkedHashMap.put("is_local_audio", musicOverlayStickerModelIntf.CXk());
        }
        if (musicOverlayStickerModelIntf.CZu() != null) {
            linkedHashMap.put("is_original_sound", musicOverlayStickerModelIntf.CZu());
        }
        if (musicOverlayStickerModelIntf.Cer() != null) {
            linkedHashMap.put("is_trending_in_clips", musicOverlayStickerModelIntf.Cer());
        }
        if (musicOverlayStickerModelIntf.BOF() != null) {
            linkedHashMap.put("local_audio_file_path", musicOverlayStickerModelIntf.BOF());
        }
        if (musicOverlayStickerModelIntf.BVj() != null) {
            MusicProduct BVj = musicOverlayStickerModelIntf.BVj();
            if (BVj != null) {
                str = BVj.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("music_product", str);
        }
        if (musicOverlayStickerModelIntf.getOriginalMediaId() != null) {
            linkedHashMap.put("original_media_id", musicOverlayStickerModelIntf.getOriginalMediaId());
        }
        if (musicOverlayStickerModelIntf.BaR() != null) {
            linkedHashMap.put("overlap_duration_in_ms", musicOverlayStickerModelIntf.BaR());
        }
        if (musicOverlayStickerModelIntf.Bd5() != null) {
            linkedHashMap.put("picked_in_post_capture", musicOverlayStickerModelIntf.Bd5());
        }
        if (musicOverlayStickerModelIntf.getPlaceholderProfilePicUrl() != null) {
            linkedHashMap.put("placeholder_profile_pic_url", musicOverlayStickerModelIntf.getPlaceholderProfilePicUrl());
        }
        if (musicOverlayStickerModelIntf.getProgressiveDownloadUrl() != null) {
            linkedHashMap.put("progressive_download_url", musicOverlayStickerModelIntf.getProgressiveDownloadUrl());
        }
        if (musicOverlayStickerModelIntf.Bkl() != null) {
            linkedHashMap.put("reactive_audio_download_url", musicOverlayStickerModelIntf.Bkl());
        }
        if (musicOverlayStickerModelIntf.BqC() != null) {
            linkedHashMap.put("sanitized_title", musicOverlayStickerModelIntf.BqC());
        }
        if (musicOverlayStickerModelIntf.Buu() != null) {
            linkedHashMap.put("should_allow_music_editing", musicOverlayStickerModelIntf.Buu());
        }
        musicOverlayStickerModelIntf.getShouldMuteAudio();
        linkedHashMap.put("should_mute_audio", Boolean.valueOf(musicOverlayStickerModelIntf.getShouldMuteAudio()));
        if (musicOverlayStickerModelIntf.getShouldMuteAudioReason() != null) {
            linkedHashMap.put("should_mute_audio_reason", musicOverlayStickerModelIntf.getShouldMuteAudioReason());
        }
        if (musicOverlayStickerModelIntf.BvC() != null) {
            MusicMuteAudioReason BvC = musicOverlayStickerModelIntf.BvC();
            if (BvC != null) {
                str3 = BvC.A00;
            }
            linkedHashMap.put("should_mute_audio_reason_type", str3);
        }
        if (musicOverlayStickerModelIntf.BvQ() != null) {
            linkedHashMap.put("should_render_soundwave", musicOverlayStickerModelIntf.BvQ());
        }
        if (musicOverlayStickerModelIntf.Bvn() != null) {
            linkedHashMap.put("should_skip_attribution", musicOverlayStickerModelIntf.Bvn());
        }
        if (musicOverlayStickerModelIntf.getSubtitle() != null) {
            linkedHashMap.put("subtitle", musicOverlayStickerModelIntf.getSubtitle());
        }
        if (musicOverlayStickerModelIntf.getTag() != null) {
            linkedHashMap.put("tag", musicOverlayStickerModelIntf.getTag());
        }
        if (musicOverlayStickerModelIntf.getTitle() != null) {
            linkedHashMap.put(DialogModule.KEY_TITLE, musicOverlayStickerModelIntf.getTitle());
        }
        if (musicOverlayStickerModelIntf.CAx() != null) {
            linkedHashMap.put("trend_rank", musicOverlayStickerModelIntf.CAx());
        }
        if (musicOverlayStickerModelIntf.CHM() != null) {
            linkedHashMap.put("web_30s_preview_download_url", musicOverlayStickerModelIntf.CHM());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
