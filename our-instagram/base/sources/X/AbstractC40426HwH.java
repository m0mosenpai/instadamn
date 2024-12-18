package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadataImpl;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import java.io.IOException;

/* renamed from: X.HwH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40426HwH {
    public static TrackOrOriginalSoundSchema parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            TrackMetadataImpl trackMetadataImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            OriginalSoundData originalSoundData = null;
            TrackDataImpl trackDataImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("metadata".equals(A0s)) {
                    trackMetadataImpl = AbstractC38068Gox.parseFromJson(c16l);
                } else if ("original_sound".equals(A0s)) {
                    originalSoundData = C3XP.parseFromJson(c16l);
                } else if ("track".equals(A0s)) {
                    trackDataImpl = AbstractC84383pX.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new TrackOrOriginalSoundSchema(originalSoundData, trackDataImpl, trackMetadataImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
