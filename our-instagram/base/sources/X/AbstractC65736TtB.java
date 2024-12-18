package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.TtB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC65736TtB {
    public static Map A00(MusicConsumptionModel musicConsumptionModel) {
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (musicConsumptionModel.AbG() != null) {
            linkedHashMap.put("allow_media_creation_with_music", musicConsumptionModel.AbG());
        }
        if (musicConsumptionModel.Adg() != null) {
            linkedHashMap.put("audio_asset_start_time_in_ms", musicConsumptionModel.Adg());
        }
        String str = null;
        if (musicConsumptionModel.Ado() != null) {
            List<AudioFilterInfoIntf> Ado = musicConsumptionModel.Ado();
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
        if (musicConsumptionModel.Adu() != null) {
            AudioMutingInfoIntf Adu = musicConsumptionModel.Adu();
            if (Adu != null) {
                treeUpdaterJNI = Adu.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("audio_muting_info", treeUpdaterJNI);
        }
        if (musicConsumptionModel.Aql() != null) {
            linkedHashMap.put("contains_lyrics", musicConsumptionModel.Aql());
        }
        if (musicConsumptionModel.getDerivedContentId() != null) {
            linkedHashMap.put("derived_content_id", musicConsumptionModel.getDerivedContentId());
        }
        if (musicConsumptionModel.AyW() != null) {
            List<AudioMetadataLabels> AyW = musicConsumptionModel.AyW();
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
        if (musicConsumptionModel.getFormattedClipsMediaCount() != null) {
            linkedHashMap.put("formatted_clips_media_count", musicConsumptionModel.getFormattedClipsMediaCount());
        }
        User BFU = musicConsumptionModel.BFU();
        if (BFU != null) {
            linkedHashMap.put("ig_artist", BFU.A07());
        }
        if (musicConsumptionModel.CQj() != null) {
            linkedHashMap.put("is_bookmarked", musicConsumptionModel.CQj());
        }
        if (musicConsumptionModel.Cer() != null) {
            linkedHashMap.put("is_trending_in_clips", musicConsumptionModel.Cer());
        }
        if (musicConsumptionModel.BaR() != null) {
            linkedHashMap.put("overlap_duration_in_ms", musicConsumptionModel.BaR());
        }
        if (musicConsumptionModel.getPlaceholderProfilePicUrl() != null) {
            linkedHashMap.put("placeholder_profile_pic_url", musicConsumptionModel.getPlaceholderProfilePicUrl());
        }
        if (musicConsumptionModel.Bg7() != null) {
            linkedHashMap.put("previous_trend_rank", musicConsumptionModel.Bg7());
        }
        if (musicConsumptionModel.Buu() != null) {
            linkedHashMap.put("should_allow_music_editing", musicConsumptionModel.Buu());
        }
        musicConsumptionModel.getShouldMuteAudio();
        linkedHashMap.put("should_mute_audio", Boolean.valueOf(musicConsumptionModel.getShouldMuteAudio()));
        if (musicConsumptionModel.getShouldMuteAudioReason() != null) {
            linkedHashMap.put("should_mute_audio_reason", musicConsumptionModel.getShouldMuteAudioReason());
        }
        if (musicConsumptionModel.BvC() != null) {
            MusicMuteAudioReason BvC = musicConsumptionModel.BvC();
            if (BvC != null) {
                str = BvC.A00;
            }
            linkedHashMap.put("should_mute_audio_reason_type", str);
        }
        if (musicConsumptionModel.BvQ() != null) {
            linkedHashMap.put("should_render_soundwave", musicConsumptionModel.BvQ());
        }
        if (musicConsumptionModel.CAx() != null) {
            linkedHashMap.put("trend_rank", musicConsumptionModel.CAx());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
