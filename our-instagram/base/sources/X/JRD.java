package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.LyricsIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class JRD {
    public static Map A00(TrackData trackData) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        trackData.getAllowsSaving();
        A1I.put("allows_saving", Boolean.valueOf(trackData.getAllowsSaving()));
        if (trackData.getArtistId() != null) {
            A1I.put("artist_id", trackData.getArtistId());
        }
        if (trackData.getAudioAssetId() != null) {
            A1I.put("audio_asset_id", trackData.getAudioAssetId());
        }
        if (trackData.getAudioClusterId() != null) {
            A1I.put("audio_cluster_id", trackData.getAudioClusterId());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (trackData.AsE() != null) {
            ImageUrl AsE = trackData.AsE();
            if (AsE != null) {
                str = AsE.getUrl();
            } else {
                str = null;
            }
            A1I.put("cover_artwork_thumbnail_uri", str);
        }
        if (trackData.AsF() != null) {
            A1I.put("cover_artwork_uri", trackData.AsF().getUrl());
        }
        if (trackData.AvV() != null) {
            A1I.put("dark_message", trackData.AvV());
        }
        if (trackData.getDashManifest() != null) {
            A1I.put("dash_manifest", trackData.getDashManifest());
        }
        if (trackData.getDisplayArtist() != null) {
            A1I.put("display_artist", trackData.getDisplayArtist());
        }
        if (trackData.Azi() != null) {
            A1I.put("duration_in_ms", trackData.Azi());
        }
        if (trackData.getFastStartProgressiveDownloadUrl() != null) {
            A1I.put("fast_start_progressive_download_url", trackData.getFastStartProgressiveDownloadUrl());
        }
        if (trackData.BC4() != null) {
            A1I.put("has_lyrics", trackData.BC4());
        }
        if (trackData.BE6() != null) {
            A1I.put("highlight_start_times_in_ms", trackData.BE6());
        }
        if (trackData.getId() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, trackData.getId());
        }
        if (trackData.getIgUsername() != null) {
            A1I.put("ig_username", trackData.getIgUsername());
        }
        if (trackData.CT1() != null) {
            A1I.put("is_eligible_for_audio_effects", trackData.CT1());
        }
        if (trackData.CTb() != null) {
            A1I.put("is_eligible_for_vinyl_sticker", trackData.CTb());
        }
        trackData.isExplicit();
        A1I.put("is_explicit", Boolean.valueOf(trackData.isExplicit()));
        if (trackData.BPT() != null) {
            LyricsIntf BPT = trackData.BPT();
            if (BPT != null) {
                treeUpdaterJNI = BPT.F7o();
            }
            A1I.put("lyrics", treeUpdaterJNI);
        }
        if (trackData.getProgressiveDownloadUrl() != null) {
            A1I.put("progressive_download_url", trackData.getProgressiveDownloadUrl());
        }
        if (trackData.Bkl() != null) {
            A1I.put("reactive_audio_download_url", trackData.Bkl());
        }
        if (trackData.BqC() != null) {
            A1I.put("sanitized_title", trackData.BqC());
        }
        if (trackData.getSubtitle() != null) {
            A1I.put("subtitle", trackData.getSubtitle());
        }
        if (trackData.getTitle() != null) {
            A1I.put(DialogModule.KEY_TITLE, trackData.getTitle());
        }
        if (trackData.CHM() != null) {
            A1I.put("web_30s_preview_download_url", trackData.CHM());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
