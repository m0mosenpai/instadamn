package X;

import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.TrackMetadata;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HwF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40424HwF {
    public static Map A00(TrackMetadata trackMetadata) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        trackMetadata.getAllowMediaCreationWithMusic();
        A1I.put("allow_media_creation_with_music", Boolean.valueOf(trackMetadata.getAllowMediaCreationWithMusic()));
        if (trackMetadata.AyW() != null) {
            List<AudioMetadataLabels> AyW = trackMetadata.AyW();
            if (AyW != null) {
                arrayList = AbstractC167017dG.A0q(AyW);
                for (AudioMetadataLabels audioMetadataLabels : AyW) {
                    C14360o3.A0B(audioMetadataLabels, 0);
                    arrayList.add(audioMetadataLabels.A00);
                }
            } else {
                arrayList = null;
            }
            A1I.put("display_labels", arrayList);
        }
        if (trackMetadata.AyX() != null) {
            A1I.put("display_media_id", trackMetadata.AyX());
        }
        if (trackMetadata.getFormattedClipsMediaCount() != null) {
            A1I.put("formatted_clips_media_count", trackMetadata.getFormattedClipsMediaCount());
        }
        trackMetadata.isBookmarked();
        A1I.put("is_bookmarked", Boolean.valueOf(trackMetadata.isBookmarked()));
        if (trackMetadata.Cer() != null) {
            A1I.put("is_trending_in_clips", trackMetadata.Cer());
        }
        if (trackMetadata.Bg7() != null) {
            A1I.put("previous_trend_rank", trackMetadata.Bg7());
        }
        if (trackMetadata.CAx() != null) {
            A1I.put("trend_rank", trackMetadata.CAx());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
