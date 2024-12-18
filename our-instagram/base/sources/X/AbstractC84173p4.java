package X;

import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalSoundConsumptionInfo;
import java.io.IOException;

/* renamed from: X.3p4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84173p4 {
    public static OriginalSoundConsumptionInfo parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            MusicMuteAudioReason musicMuteAudioReason = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("display_media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_bookmarked".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("is_trending_in_clips".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("should_mute_audio_reason".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("should_mute_audio_reason_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    musicMuteAudioReason = AbstractC84183p5.A00(A1P);
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("is_bookmarked", "OriginalSoundConsumptionInfo");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("should_mute_audio_reason", "OriginalSoundConsumptionInfo");
                } else {
                    return new OriginalSoundConsumptionInfo(musicMuteAudioReason, str, str2, bool.booleanValue(), bool2.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("is_trending_in_clips", "OriginalSoundConsumptionInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
