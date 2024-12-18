package X;

import com.instagram.music.common.model.DownloadedTrack;
import java.io.IOException;

/* renamed from: X.Glr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37896Glr {
    public static DownloadedTrack parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("track_file_path".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("partial_track_start_offset_ms".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("partial_track_duration_offset_ms".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("track_file_path", c16l, "DownloadedTrack");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("partial_track_duration_offset_ms", c16l, "DownloadedTrack");
                } else {
                    return new DownloadedTrack(str, num.intValue(), num2.intValue());
                }
            } else {
                AbstractC166997dE.A1V("partial_track_start_offset_ms", c16l, "DownloadedTrack");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
