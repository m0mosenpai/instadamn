package X;

import com.instagram.api.schemas.CreatorViewerSignalAudioDetailsImpl;
import com.instagram.api.schemas.FormattedStringImpl;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import java.io.IOException;

/* renamed from: X.HmP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39876HmP {
    public static CreatorViewerSignalAudioDetailsImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            TrackOrOriginalSoundSchema trackOrOriginalSoundSchema = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            FormattedStringImpl formattedStringImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("audio_info".equals(A0s)) {
                    trackOrOriginalSoundSchema = AbstractC40426HwH.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1L(A0s)) {
                    formattedStringImpl = IO9.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new CreatorViewerSignalAudioDetailsImpl(formattedStringImpl, trackOrOriginalSoundSchema);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
