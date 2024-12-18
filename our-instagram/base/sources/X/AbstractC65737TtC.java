package X;

import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.TtC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC65737TtC {
    public static Map A00(OriginalSoundConsumptionInfoIntf originalSoundConsumptionInfoIntf) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (originalSoundConsumptionInfoIntf.AyY() != null) {
            linkedHashMap.put(AbstractC111324zv.A00(4333), originalSoundConsumptionInfoIntf.AyY());
        }
        originalSoundConsumptionInfoIntf.isBookmarked();
        linkedHashMap.put("is_bookmarked", Boolean.valueOf(originalSoundConsumptionInfoIntf.isBookmarked()));
        originalSoundConsumptionInfoIntf.isTrendingInClips();
        linkedHashMap.put("is_trending_in_clips", Boolean.valueOf(originalSoundConsumptionInfoIntf.isTrendingInClips()));
        if (originalSoundConsumptionInfoIntf.getShouldMuteAudioReason() != null) {
            linkedHashMap.put("should_mute_audio_reason", originalSoundConsumptionInfoIntf.getShouldMuteAudioReason());
        }
        if (originalSoundConsumptionInfoIntf.BvC() != null) {
            MusicMuteAudioReason BvC = originalSoundConsumptionInfoIntf.BvC();
            if (BvC != null) {
                str = BvC.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("should_mute_audio_reason_type", str);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
