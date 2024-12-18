package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.GdD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37371GdD {
    public static Map A00(OriginalSoundDataIntf originalSoundDataIntf) {
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        originalSoundDataIntf.getAllowCreatorToRename();
        A1I.put("allow_creator_to_rename", Boolean.valueOf(originalSoundDataIntf.getAllowCreatorToRename()));
        if (originalSoundDataIntf.getAudioAssetId() != null) {
            A1I.put("audio_asset_id", originalSoundDataIntf.getAudioAssetId());
        }
        if (originalSoundDataIntf.Adg() != null) {
            A1I.put("audio_asset_start_time_in_ms", originalSoundDataIntf.Adg());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (originalSoundDataIntf.Ado() != null) {
            List<AudioFilterInfoIntf> Ado = originalSoundDataIntf.Ado();
            if (Ado != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (AudioFilterInfoIntf audioFilterInfoIntf : Ado) {
                    if (audioFilterInfoIntf != null) {
                        arrayList2.add(audioFilterInfoIntf.F7o());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1I.put("audio_filter_infos", arrayList2);
        }
        if (originalSoundDataIntf.Adv() != null) {
            List<OriginalAudioPartMetadataIntf> Adv = originalSoundDataIntf.Adv();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf : Adv) {
                if (originalAudioPartMetadataIntf != null) {
                    A1E.add(originalAudioPartMetadataIntf.F7o());
                }
            }
            A1I.put("audio_parts", A1E);
        }
        if (originalSoundDataIntf.Adw() != null) {
            List<OriginalAudioPartMetadataIntf> Adw = originalSoundDataIntf.Adw();
            if (Adw != null) {
                arrayList = AbstractC166987dD.A1E();
                for (OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf2 : Adw) {
                    if (originalAudioPartMetadataIntf2 != null) {
                        arrayList.add(originalAudioPartMetadataIntf2.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("audio_parts_by_filter", arrayList);
        }
        if (originalSoundDataIntf.Akf() != null) {
            A1I.put("can_remix_be_shared_to_fb", originalSoundDataIntf.Akf());
        }
        if (originalSoundDataIntf.Akg() != null) {
            A1I.put("can_remix_be_shared_to_fb_expansion", originalSoundDataIntf.Akg());
        }
        if (originalSoundDataIntf.AqX() != null) {
            A1I.put("consumption_info", originalSoundDataIntf.AqX().F7o());
        }
        if (originalSoundDataIntf.getDashManifest() != null) {
            A1I.put("dash_manifest", originalSoundDataIntf.getDashManifest());
        }
        if (originalSoundDataIntf.Azi() != null) {
            A1I.put("duration_in_ms", originalSoundDataIntf.Azi());
        }
        if (originalSoundDataIntf.getFormattedClipsMediaCount() != null) {
            A1I.put("formatted_clips_media_count", originalSoundDataIntf.getFormattedClipsMediaCount());
        }
        originalSoundDataIntf.getHideRemixing();
        A1I.put("hide_remixing", Boolean.valueOf(originalSoundDataIntf.getHideRemixing()));
        if (originalSoundDataIntf.BFU() != null) {
            A1I.put("ig_artist", originalSoundDataIntf.BFU().A07());
        }
        originalSoundDataIntf.isAudioAutomaticallyAttributed();
        A1I.put("is_audio_automatically_attributed", Boolean.valueOf(originalSoundDataIntf.isAudioAutomaticallyAttributed()));
        if (originalSoundDataIntf.CT1() != null) {
            A1I.put("is_eligible_for_audio_effects", originalSoundDataIntf.CT1());
        }
        if (originalSoundDataIntf.CTb() != null) {
            A1I.put("is_eligible_for_vinyl_sticker", originalSoundDataIntf.CTb());
        }
        originalSoundDataIntf.isExplicit();
        A1I.put("is_explicit", Boolean.valueOf(originalSoundDataIntf.isExplicit()));
        if (originalSoundDataIntf.CZr() != null) {
            A1I.put("is_original_audio_download_eligible", originalSoundDataIntf.CZr());
        }
        if (originalSoundDataIntf.Cc7() != null) {
            A1I.put("is_reuse_disabled", originalSoundDataIntf.Cc7());
        }
        if (originalSoundDataIntf.CgF() != null) {
            A1I.put("is_xpost_from_fb", originalSoundDataIntf.CgF());
        }
        if (originalSoundDataIntf.getMusicCanonicalId() != null) {
            A1I.put("music_canonical_id", originalSoundDataIntf.getMusicCanonicalId());
        }
        if (originalSoundDataIntf.BYR() != null) {
            A1I.put("oa_owner_is_music_artist", originalSoundDataIntf.BYR());
        }
        if (originalSoundDataIntf.BZj() != null) {
            OriginalAudioSubtype BZj = originalSoundDataIntf.BZj();
            C14360o3.A0B(BZj, 0);
            A1I.put("original_audio_subtype", BZj.A00);
        }
        if (originalSoundDataIntf.getOriginalAudioTitle() != null) {
            A1I.put("original_audio_title", originalSoundDataIntf.getOriginalAudioTitle());
        }
        if (originalSoundDataIntf.getOriginalMediaId() != null) {
            A1I.put("original_media_id", originalSoundDataIntf.getOriginalMediaId());
        }
        if (originalSoundDataIntf.BaR() != null) {
            A1I.put("overlap_duration_in_ms", originalSoundDataIntf.BaR());
        }
        if (originalSoundDataIntf.Bg7() != null) {
            A1I.put("previous_trend_rank", originalSoundDataIntf.Bg7());
        }
        if (originalSoundDataIntf.getProgressiveDownloadUrl() != null) {
            A1I.put("progressive_download_url", originalSoundDataIntf.getProgressiveDownloadUrl());
        }
        originalSoundDataIntf.getShouldMuteAudio();
        A1I.put("should_mute_audio", Boolean.valueOf(originalSoundDataIntf.getShouldMuteAudio()));
        if (originalSoundDataIntf.C8O() != null) {
            A1I.put("time_created", originalSoundDataIntf.C8O());
        }
        if (originalSoundDataIntf.CAx() != null) {
            A1I.put("trend_rank", originalSoundDataIntf.CAx());
        }
        if (originalSoundDataIntf.CIV() != null) {
            XpostOriginalSoundFBCreatorInfo CIV = originalSoundDataIntf.CIV();
            if (CIV != null) {
                treeUpdaterJNI = CIV.F7o();
            }
            A1I.put(AbstractC111324zv.A00(3325), treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
