package X;

import android.content.Context;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Iee, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41763Iee {
    public static final AudioPageMetadata A05(MusicOverlayStickerModel musicOverlayStickerModel) {
        String str;
        C14360o3.A0B(musicOverlayStickerModel, 0);
        String str2 = musicOverlayStickerModel.A0R;
        Boolean bool = musicOverlayStickerModel.A0E;
        Boolean A0b = AbstractC166997dE.A0b();
        if (C14360o3.A0K(bool, A0b)) {
            str = musicOverlayStickerModel.A0S;
        } else {
            str = musicOverlayStickerModel.A0T;
        }
        String str3 = musicOverlayStickerModel.A0S;
        if (!C14360o3.A0K(bool, A0b)) {
            str3 = musicOverlayStickerModel.A0T;
        }
        ImageUrl imageUrl = musicOverlayStickerModel.A04;
        AudioType audioType = AudioType.A03;
        String str4 = musicOverlayStickerModel.A0m;
        String str5 = musicOverlayStickerModel.A0Y;
        return new AudioPageMetadata(null, imageUrl, null, null, audioType, AbstractC23129AMi.A00(musicOverlayStickerModel), str, str2, str5, str3, str3, musicOverlayStickerModel.A0e, null, null, null, null, str4, null, null, null, null, null, null, null, false, musicOverlayStickerModel.A0t, AbstractC31177DnL.A1a(musicOverlayStickerModel.A0A), musicOverlayStickerModel.A0s, AbstractC31177DnL.A1a(musicOverlayStickerModel.A0B), false);
    }

    public static final AudioPageMetadata A06(String str) {
        return new AudioPageMetadata(null, null, null, null, null, null, str, null, null, str, null, null, null, null, null, str, null, null, null, null, null, null, null, null, false, false, false, false, false, false);
    }

    public static final AudioPageMetadata A07(String str) {
        C14360o3.A0B(str, 0);
        return new AudioPageMetadata(null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, false, false, false, false, false, false);
    }

    public static final AudioPageMetadata A00(Context context, AudioFilterType audioFilterType, InterfaceC88553xD interfaceC88553xD, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        String artistId = interfaceC88553xD.getArtistId();
        String assetId = interfaceC88553xD.getAssetId();
        String audioAssetId = interfaceC88553xD.getAudioAssetId();
        String assetId2 = interfaceC88553xD.getAssetId();
        ImageUrl Adk = interfaceC88553xD.Adk();
        AudioType Ae7 = interfaceC88553xD.Ae7();
        String AD3 = interfaceC88553xD.AD3(context);
        String Ach = interfaceC88553xD.Ach();
        return new AudioPageMetadata(audioFilterType, Adk, null, interfaceC88553xD.Cq1(context), Ae7, interfaceC88553xD.BVb(), assetId, artistId, Ach, audioAssetId, assetId2, str, str2, str3, str4, null, AD3, null, str5, str8, null, str6, str7, interfaceC88553xD.BZi(), false, z, interfaceC88553xD.CQ9(), interfaceC88553xD.CQA(), interfaceC88553xD.isEligibleForAudioEffects(), z2);
    }

    public static final AudioPageMetadata A03(TrackData trackData, boolean z) {
        int i;
        Number number;
        String artistId = trackData.getArtistId();
        String audioClusterId = trackData.getAudioClusterId();
        String audioAssetId = trackData.getAudioAssetId();
        String audioClusterId2 = trackData.getAudioClusterId();
        ImageUrl AsF = trackData.AsF();
        AudioType audioType = AudioType.A03;
        String title = trackData.getTitle();
        String displayArtist = trackData.getDisplayArtist();
        boolean isExplicit = trackData.isExplicit();
        boolean A1a = AbstractC31177DnL.A1a(trackData.CT1());
        MusicAssetModel A01 = MusicAssetModel.A01(trackData, z);
        List BE6 = trackData.BE6();
        if (BE6 != null && (number = (Number) AbstractC001800i.A0J(BE6)) != null) {
            i = number.intValue();
        } else {
            i = 0;
        }
        return new AudioPageMetadata(null, AsF, null, new MusicAttributionConfig(null, A01, null, null, i, false, true), audioType, null, audioClusterId, artistId, displayArtist, audioAssetId, audioClusterId2, null, null, null, null, null, title, null, null, null, null, null, null, null, false, false, z, isExplicit, A1a, false);
    }

    public static final AudioPageMetadata A04(JIN jin, String str) {
        int i;
        Number number;
        String BgD = jin.BgD();
        String id = jin.getId();
        String audioClusterId = jin.getAudioClusterId();
        ImageUrl AsR = jin.AsR();
        ImageUrl AsT = jin.AsT();
        AudioType CBi = jin.CBi();
        String title = jin.getTitle();
        String artistId = jin.getArtistId();
        String displayArtist = jin.getDisplayArtist();
        MusicDataSource BVb = jin.BVb();
        boolean isBookmarked = jin.isBookmarked();
        boolean isExplicit = jin.isExplicit();
        boolean isEligibleForAudioEffects = jin.isEligibleForAudioEffects();
        MusicAssetModel A02 = MusicAssetModel.A02(jin);
        List BE6 = jin.BE6();
        if (BE6 != null && (number = (Number) AbstractC001800i.A0J(BE6)) != null) {
            i = number.intValue();
        } else {
            i = 0;
        }
        return new AudioPageMetadata(null, AsR, AsT, new MusicAttributionConfig(null, A02, null, null, i, false, true), CBi, BVb, BgD, artistId, displayArtist, id, audioClusterId, null, null, null, null, null, title, null, null, null, str, null, null, null, false, false, isBookmarked, isExplicit, isEligibleForAudioEffects, false);
    }

    public static final AudioPageMetadata A01(AudioFilterType audioFilterType, OriginalSoundDataIntf originalSoundDataIntf, boolean z) {
        String id = originalSoundDataIntf.BFU().getId();
        String audioAssetId = originalSoundDataIntf.getAudioAssetId();
        String audioAssetId2 = originalSoundDataIntf.getAudioAssetId();
        String audioAssetId3 = originalSoundDataIntf.getAudioAssetId();
        return new AudioPageMetadata(audioFilterType, originalSoundDataIntf.BFU().Bhu(), null, null, AudioType.A04, null, audioAssetId, id, originalSoundDataIntf.BFU().getUsername(), audioAssetId2, audioAssetId3, null, null, null, null, null, originalSoundDataIntf.getOriginalAudioTitle(), null, null, null, null, null, null, null, false, false, z, originalSoundDataIntf.isExplicit(), AbstractC31177DnL.A1a(originalSoundDataIntf.CT1()), false);
    }

    public static final AudioPageMetadata A02(OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf) {
        String str;
        AudioType audioType;
        AudioFilterType audioFilterType;
        AudioFilterInfoIntf audioFilterInfoIntf;
        String musicCanonicalId = originalAudioPartMetadataIntf.getMusicCanonicalId();
        String musicCanonicalId2 = originalAudioPartMetadataIntf.getMusicCanonicalId();
        String musicCanonicalId3 = originalAudioPartMetadataIntf.getMusicCanonicalId();
        if (originalAudioPartMetadataIntf.Ae6() == MusicCanonicalType.A04) {
            str = originalAudioPartMetadataIntf.getDisplayArtist();
        } else {
            User BFU = originalAudioPartMetadataIntf.BFU();
            if (BFU != null) {
                str = BFU.getUsername();
            } else {
                str = "";
            }
        }
        String displayTitle = originalAudioPartMetadataIntf.getDisplayTitle();
        int ordinal = originalAudioPartMetadataIntf.Ae6().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 0) {
                    throw B4Z.A00();
                }
                throw AbstractC167007dF.A0c(AbstractC111324zv.A00(95), originalAudioPartMetadataIntf.Ae6().A00);
            }
            audioType = AudioType.A04;
        } else {
            audioType = AudioType.A03;
        }
        ImageUrl C88 = originalAudioPartMetadataIntf.C88();
        boolean isBookmarked = originalAudioPartMetadataIntf.isBookmarked();
        boolean isExplicit = originalAudioPartMetadataIntf.isExplicit();
        boolean A1a = AbstractC31177DnL.A1a(originalAudioPartMetadataIntf.CT1());
        List Ado = originalAudioPartMetadataIntf.Ado();
        if (Ado != null && (audioFilterInfoIntf = (AudioFilterInfoIntf) AbstractC001800i.A0J(Ado)) != null) {
            audioFilterType = audioFilterInfoIntf.B6T();
        } else {
            audioFilterType = null;
        }
        return new AudioPageMetadata(audioFilterType, C88, null, null, audioType, null, musicCanonicalId, null, str, musicCanonicalId2, null, null, null, null, null, null, displayTitle, null, null, musicCanonicalId3, null, null, null, null, false, false, isBookmarked, isExplicit, A1a, false);
    }
}
