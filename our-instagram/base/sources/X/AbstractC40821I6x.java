package X;

import java.io.IOException;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.I6x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40821I6x {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.ICs] */
    public static C40971ICs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(AbstractC166997dE.A0s(c16l))) {
                    obj.A00 = C38321qM.A00(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
