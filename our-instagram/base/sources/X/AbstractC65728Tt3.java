package X;

import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.MusicMuteAudioReason;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Tt3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC65728Tt3 {
    public static Map A00(AudioMutingInfoIntf audioMutingInfoIntf) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        audioMutingInfoIntf.AbC();
        linkedHashMap.put("allow_audio_editing", Boolean.valueOf(audioMutingInfoIntf.AbC()));
        audioMutingInfoIntf.BVt();
        linkedHashMap.put("mute_audio", Boolean.valueOf(audioMutingInfoIntf.BVt()));
        if (audioMutingInfoIntf.BVu() != null) {
            MusicMuteAudioReason BVu = audioMutingInfoIntf.BVu();
            if (BVu != null) {
                str = BVu.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("mute_reason", str);
        }
        if (audioMutingInfoIntf.BVv() != null) {
            linkedHashMap.put("mute_reason_str", audioMutingInfoIntf.BVv());
        }
        audioMutingInfoIntf.Bwc();
        linkedHashMap.put("show_muted_audio_toast", Boolean.valueOf(audioMutingInfoIntf.Bwc()));
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
