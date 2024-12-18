package X;

import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hqt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40126Hqt {
    public static Map A00(OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList = null;
        if (originalAudioPartMetadataIntf.Ado() != null) {
            List<AudioFilterInfoIntf> Ado = originalAudioPartMetadataIntf.Ado();
            if (Ado != null) {
                arrayList = AbstractC166987dD.A1E();
                for (AudioFilterInfoIntf audioFilterInfoIntf : Ado) {
                    if (audioFilterInfoIntf != null) {
                        arrayList.add(audioFilterInfoIntf.F7o());
                    }
                }
            }
            A1I.put("audio_filter_infos", arrayList);
        }
        originalAudioPartMetadataIntf.Ae3();
        A1I.put(AbstractC111324zv.A00(3973), Integer.valueOf(originalAudioPartMetadataIntf.Ae3()));
        if (originalAudioPartMetadataIntf.Ae6() != null) {
            MusicCanonicalType Ae6 = originalAudioPartMetadataIntf.Ae6();
            C14360o3.A0B(Ae6, 0);
            A1I.put("audio_type", Ae6.A00);
        }
        if (originalAudioPartMetadataIntf.getDisplayArtist() != null) {
            A1I.put("display_artist", originalAudioPartMetadataIntf.getDisplayArtist());
        }
        if (originalAudioPartMetadataIntf.getDisplayTitle() != null) {
            A1I.put("display_title", originalAudioPartMetadataIntf.getDisplayTitle());
        }
        originalAudioPartMetadataIntf.getDurationInMs();
        A1I.put("duration_in_ms", Integer.valueOf(originalAudioPartMetadataIntf.getDurationInMs()));
        User BFU = originalAudioPartMetadataIntf.BFU();
        if (BFU != null) {
            A1I.put("ig_artist", BFU.A07());
        }
        originalAudioPartMetadataIntf.isBookmarked();
        A1I.put("is_bookmarked", Boolean.valueOf(originalAudioPartMetadataIntf.isBookmarked()));
        if (originalAudioPartMetadataIntf.CT1() != null) {
            A1I.put("is_eligible_for_audio_effects", originalAudioPartMetadataIntf.CT1());
        }
        originalAudioPartMetadataIntf.isExplicit();
        A1I.put("is_explicit", Boolean.valueOf(originalAudioPartMetadataIntf.isExplicit()));
        if (originalAudioPartMetadataIntf.getMusicCanonicalId() != null) {
            A1I.put("music_canonical_id", originalAudioPartMetadataIntf.getMusicCanonicalId());
        }
        originalAudioPartMetadataIntf.BbS();
        A1I.put(AbstractC111324zv.A00(5041), Integer.valueOf(originalAudioPartMetadataIntf.BbS()));
        if (originalAudioPartMetadataIntf.C88() != null) {
            A1I.put(AbstractC111324zv.A00(542), originalAudioPartMetadataIntf.C88().getUrl());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
