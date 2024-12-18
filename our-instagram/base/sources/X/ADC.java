package X;

import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.AudioFilterType;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class ADC {
    public static AudioFilterInfo parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            AudioFilterType audioFilterType = null;
            while (c16l.A1J() != C16R.A09) {
                if ("filter_type".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    audioFilterType = (AudioFilterType) AudioFilterType.A01.get(A1P);
                    if (audioFilterType == null) {
                        audioFilterType = AudioFilterType.A0A;
                    }
                }
                c16l.A0z();
            }
            if (audioFilterType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("filter_type", c16l, "AudioFilterInfo");
                throw C00O.createAndThrow();
            }
            return new AudioFilterInfo(audioFilterType);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, AudioFilterInfo audioFilterInfo) {
        anonymousClass182.A0d();
        AudioFilterType audioFilterType = audioFilterInfo.A00;
        if (audioFilterType != null) {
            anonymousClass182.A0S("filter_type", audioFilterType.A00);
        }
        anonymousClass182.A0a();
    }
}
