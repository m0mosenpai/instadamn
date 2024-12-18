package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class HqN {
    public static Map A00(InterfaceC43583JMr interfaceC43583JMr) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43583JMr.Aal() != null) {
            A1I.put("alacorn_session_id", interfaceC43583JMr.Aal());
        }
        if (interfaceC43583JMr.AbO() != null) {
            A1I.put("allows_saving", interfaceC43583JMr.AbO());
        }
        if (interfaceC43583JMr.getArtistId() != null) {
            A1I.put("artist_id", interfaceC43583JMr.getArtistId());
        }
        if (interfaceC43583JMr.getAudioClusterId() != null) {
            A1I.put("audio_cluster_id", interfaceC43583JMr.getAudioClusterId());
        }
        if (interfaceC43583JMr.Afr() != null) {
            A1I.put("beats", interfaceC43583JMr.Afr());
        }
        if (interfaceC43583JMr.Akf() != null) {
            A1I.put("can_remix_be_shared_to_fb", interfaceC43583JMr.Akf());
        }
        String str2 = null;
        if (interfaceC43583JMr.AsE() != null) {
            ImageUrl AsE = interfaceC43583JMr.AsE();
            if (AsE != null) {
                str = AsE.getUrl();
            } else {
                str = null;
            }
            A1I.put("cover_artwork_thumbnail_uri", str);
        }
        if (interfaceC43583JMr.AsF() != null) {
            ImageUrl AsF = interfaceC43583JMr.AsF();
            if (AsF != null) {
                str2 = AsF.getUrl();
            }
            A1I.put("cover_artwork_uri", str2);
        }
        if (interfaceC43583JMr.getDashManifest() != null) {
            A1I.put("dash_manifest", interfaceC43583JMr.getDashManifest());
        }
        if (interfaceC43583JMr.AwV() != null) {
            A1I.put("delay_in_ms_at_start", interfaceC43583JMr.AwV());
        }
        if (interfaceC43583JMr.AwW() != null) {
            A1I.put("delay_in_ms_on_loop", interfaceC43583JMr.AwW());
        }
        if (interfaceC43583JMr.getDisplayArtist() != null) {
            A1I.put("display_artist", interfaceC43583JMr.getDisplayArtist());
        }
        if (interfaceC43583JMr.Azh() != null) {
            A1I.put("duration", interfaceC43583JMr.Azh());
        }
        if (interfaceC43583JMr.Azi() != null) {
            A1I.put("duration_in_ms", interfaceC43583JMr.Azi());
        }
        if (interfaceC43583JMr.BC4() != null) {
            A1I.put("has_lyrics", interfaceC43583JMr.BC4());
        }
        if (interfaceC43583JMr.BE6() != null) {
            A1I.put("highlight_start_times_in_ms", interfaceC43583JMr.BE6());
        }
        if (interfaceC43583JMr.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC43583JMr.getId(), A1I);
        }
        User BFU = interfaceC43583JMr.BFU();
        if (BFU != null) {
            A1I.put("ig_artist", BFU.A07());
        }
        if (interfaceC43583JMr.CQj() != null) {
            A1I.put("is_bookmarked", interfaceC43583JMr.CQj());
        }
        if (interfaceC43583JMr.CU4() != null) {
            A1I.put("is_explicit", interfaceC43583JMr.CU4());
        }
        if (interfaceC43583JMr.CXk() != null) {
            A1I.put("is_local_audio", interfaceC43583JMr.CXk());
        }
        if (interfaceC43583JMr.CXs() != null) {
            A1I.put("is_loop_disabled", interfaceC43583JMr.CXs());
        }
        if (interfaceC43583JMr.CZu() != null) {
            A1I.put("is_original_sound", interfaceC43583JMr.CZu());
        }
        if (interfaceC43583JMr.BOF() != null) {
            A1I.put("local_audio_file_path", interfaceC43583JMr.BOF());
        }
        if (interfaceC43583JMr.BZx() != null) {
            A1I.put("original_sound_media_id", interfaceC43583JMr.BZx());
        }
        if (interfaceC43583JMr.BiP() != null) {
            A1I.put("progressive_download_fast_start_url", interfaceC43583JMr.BiP());
        }
        if (interfaceC43583JMr.getProgressiveDownloadUrl() != null) {
            A1I.put("progressive_download_url", interfaceC43583JMr.getProgressiveDownloadUrl());
        }
        if (interfaceC43583JMr.Bth() != null) {
            A1I.put("server_side_audio_status", interfaceC43583JMr.Bth());
        }
        if (interfaceC43583JMr.Bzx() != null) {
            A1I.put("starting_point", interfaceC43583JMr.Bzx());
        }
        if (interfaceC43583JMr.getTitle() != null) {
            AbstractC37300Gc1.A17(interfaceC43583JMr.getTitle(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
