package X;

import com.instagram.api.schemas.AudioNoteResponseInfo;
import com.instagram.feed.audio.Audio;
import java.io.IOException;

/* renamed from: X.HkV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39759HkV {
    public static AudioNoteResponseInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Audio audio = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("audio_info".equals(A0s)) {
                    audio = C4G3.parseFromJson(c16l);
                } else if ("logging_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (audio == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("audio_info", c16l, "AudioNoteResponseInfo");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("logging_id", c16l, "AudioNoteResponseInfo");
            } else {
                return new AudioNoteResponseInfo(audio, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
