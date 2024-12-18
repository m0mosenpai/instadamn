package X;

import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadataImpl;
import java.io.IOException;

/* renamed from: X.HwJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40428HwJ {
    public static C38806H6w parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            TrackMetadataImpl trackMetadataImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            TrackDataImpl trackDataImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("metadata".equals(A0s)) {
                    trackMetadataImpl = AbstractC38068Gox.parseFromJson(c16l);
                } else if ("track".equals(A0s)) {
                    trackDataImpl = AbstractC84383pX.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (trackMetadataImpl == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("metadata", c16l, "TrackSchemaImpl");
            } else if (trackDataImpl == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("track", c16l, "TrackSchemaImpl");
            } else {
                return new C38806H6w(trackDataImpl, trackMetadataImpl);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
