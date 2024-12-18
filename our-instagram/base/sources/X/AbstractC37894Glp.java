package X;

import android.os.Parcelable;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Glp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37894Glp {
    public static AudioOverlayTrack parseFromJson(C16L c16l) {
        EnumC185288Jt enumC185288Jt;
        C14360o3.A0B(c16l, 0);
        try {
            AudioOverlayTrack audioOverlayTrack = new AudioOverlayTrack();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("snippet_start_time_ms".equals(A0q)) {
                    audioOverlayTrack.A03 = c16l.A1D();
                } else if ("snippet_duration_ms".equals(A0q)) {
                    audioOverlayTrack.A02 = c16l.A1D();
                } else if ("start_time_in_video_ms".equals(A0q)) {
                    audioOverlayTrack.A04 = c16l.A1D();
                } else if ("end_time_in_video_ms".equals(A0q)) {
                    audioOverlayTrack.A01 = c16l.A1D();
                } else {
                    String str = null;
                    if ("audio_cluster_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        audioOverlayTrack.A0B = str;
                    } else if ("audio_asset_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        audioOverlayTrack.A0A = str;
                    } else if ("original_sound_media_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        audioOverlayTrack.A0E = str;
                    } else if ("music_browser_category".equals(A0q)) {
                        audioOverlayTrack.A09 = OPV.parseFromJson(c16l);
                    } else if ("music_asset".equals(A0q)) {
                        audioOverlayTrack.A08 = AbstractC37895Glq.parseFromJson(c16l);
                    } else if ("downloaded_track".equals(A0q)) {
                        audioOverlayTrack.A06 = AbstractC37896Glr.parseFromJson(c16l);
                    } else if ("audio_filter".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        C14360o3.A0B(str, 0);
                        try {
                            enumC185288Jt = EnumC185288Jt.valueOf(str);
                        } catch (IllegalArgumentException unused) {
                            enumC185288Jt = null;
                        }
                        audioOverlayTrack.A05 = enumC185288Jt;
                    } else if ("volume".equals(A0q)) {
                        audioOverlayTrack.A00 = (float) c16l.A0U();
                    } else if (AbstractC111324zv.A00(741).equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        audioOverlayTrack.A0C = str;
                    } else if (AbstractC111324zv.A00(739).equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        audioOverlayTrack.A07 = I4Z.A00(str);
                    }
                }
                c16l.A0z();
            }
            return audioOverlayTrack;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, AudioOverlayTrack audioOverlayTrack) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("snippet_start_time_ms", audioOverlayTrack.A03);
        anonymousClass182.A0Q("snippet_duration_ms", audioOverlayTrack.A02);
        anonymousClass182.A0Q("start_time_in_video_ms", audioOverlayTrack.A04);
        anonymousClass182.A0Q("end_time_in_video_ms", audioOverlayTrack.A01);
        String str = audioOverlayTrack.A0B;
        if (str != null) {
            anonymousClass182.A0S("audio_cluster_id", str);
        }
        String str2 = audioOverlayTrack.A0A;
        if (str2 != null) {
            anonymousClass182.A0S("audio_asset_id", str2);
        }
        String str3 = audioOverlayTrack.A0E;
        if (str3 != null) {
            anonymousClass182.A0S("original_sound_media_id", str3);
        }
        if (audioOverlayTrack.A09 != null) {
            anonymousClass182.A0r("music_browser_category");
            OPV.A00(anonymousClass182, audioOverlayTrack.A09);
        }
        if (audioOverlayTrack.A08 != null) {
            anonymousClass182.A0r("music_asset");
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            anonymousClass182.A0d();
            String str4 = musicAssetModel.A0E;
            if (str4 != null) {
                anonymousClass182.A0S("audio_asset_id", str4);
            }
            String str5 = musicAssetModel.A0B;
            if (str5 != null) {
                anonymousClass182.A0S("audio_cluster_id", str5);
            }
            String str6 = musicAssetModel.A0H;
            if (str6 != null) {
                anonymousClass182.A0S("progressive_download_url", str6);
            }
            String str7 = musicAssetModel.A0C;
            if (str7 != null) {
                anonymousClass182.A0S("dash_manifest", str7);
            }
            if (musicAssetModel.A0J != null) {
                C16V.A03(anonymousClass182, "highlight_start_times_in_ms");
                for (Number number : musicAssetModel.A0J) {
                    if (number != null) {
                        anonymousClass182.A0h(number.intValue());
                    }
                }
                anonymousClass182.A0Z();
            }
            AbstractC37301Gc2.A1F(anonymousClass182, musicAssetModel.A0I);
            if (musicAssetModel.A06 != null) {
                anonymousClass182.A0r("ig_artist");
                User user = musicAssetModel.A06;
                Parcelable.Creator creator = User.CREATOR;
                AbstractC38851rI.A08(anonymousClass182, user);
            }
            String str8 = musicAssetModel.A0D;
            if (str8 != null) {
                anonymousClass182.A0S("display_artist", str8);
            }
            String str9 = musicAssetModel.A0A;
            if (str9 != null) {
                anonymousClass182.A0S("artist_id", str9);
            }
            if (musicAssetModel.A02 != null) {
                anonymousClass182.A0r("cover_artwork_uri");
                AbstractC222616c.A01(anonymousClass182, musicAssetModel.A02);
            }
            if (musicAssetModel.A03 != null) {
                anonymousClass182.A0r("cover_artwork_thumbnail_uri");
                AbstractC222616c.A01(anonymousClass182, musicAssetModel.A03);
            }
            anonymousClass182.A0Q("duration_in_ms", musicAssetModel.A00);
            anonymousClass182.A0T("is_explicit", musicAssetModel.A0S);
            anonymousClass182.A0T("is_eligible_for_audio_effects", musicAssetModel.A0Q);
            anonymousClass182.A0T("is_eligible_for_vinyl_sticker", musicAssetModel.A0R);
            anonymousClass182.A0T("has_lyrics", musicAssetModel.A0O);
            anonymousClass182.A0T("is_original_sound", musicAssetModel.A0U);
            anonymousClass182.A0T("allows_saving", musicAssetModel.A0L);
            String str10 = musicAssetModel.A0G;
            if (str10 != null) {
                anonymousClass182.A0S("original_sound_media_id", str10);
            }
            String str11 = musicAssetModel.A09;
            if (str11 != null) {
                anonymousClass182.A0S("alacorn_session_id", str11);
            }
            anonymousClass182.A0T("is_bookmarked", musicAssetModel.A0P);
            anonymousClass182.A0T("can_remix_be_shared_to_fb", musicAssetModel.A0M);
            anonymousClass182.A0T("can_remix_be_shared_to_fb_expansion", musicAssetModel.A0N);
            anonymousClass182.A0T("is_local_audio", musicAssetModel.A0T);
            String str12 = musicAssetModel.A0F;
            if (str12 != null) {
                anonymousClass182.A0S("local_audio_file_path", str12);
            }
            anonymousClass182.A0a();
        }
        if (audioOverlayTrack.A06 != null) {
            anonymousClass182.A0r("downloaded_track");
            DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
            anonymousClass182.A0d();
            anonymousClass182.A0S("track_file_path", downloadedTrack.A02);
            anonymousClass182.A0Q("partial_track_start_offset_ms", downloadedTrack.A01);
            anonymousClass182.A0Q("partial_track_duration_offset_ms", downloadedTrack.A00);
            anonymousClass182.A0a();
        }
        EnumC185288Jt enumC185288Jt = audioOverlayTrack.A05;
        if (enumC185288Jt != null) {
            anonymousClass182.A0S("audio_filter", enumC185288Jt.name());
        }
        anonymousClass182.A0P("volume", audioOverlayTrack.A00);
        String str13 = audioOverlayTrack.A0C;
        if (str13 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(741), str13);
        }
        InstagramAudioApplySource instagramAudioApplySource = audioOverlayTrack.A07;
        if (instagramAudioApplySource != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(739), String.valueOf(instagramAudioApplySource.A00));
        }
        anonymousClass182.A0a();
    }
}
