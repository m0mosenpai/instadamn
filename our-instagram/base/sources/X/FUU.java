package X;

import java.io.IOException;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes6.dex */
public abstract class FUU {
    public static C206409Bx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C38321qM c38321qM = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(A0s)) {
                    c38321qM = AbstractC31176DnK.A0Y(c16l);
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (c38321qM == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(MediaStreamTrack.VIDEO_TRACK_KIND, c16l, "DirectIGTVShare");
                throw C00O.createAndThrow();
            }
            return new C206409Bx(c38321qM, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C206409Bx c206409Bx, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        C38321qM c38321qM = (C38321qM) c206409Bx.A00;
        if (c38321qM != null) {
            anonymousClass182.A0r(MediaStreamTrack.VIDEO_TRACK_KIND);
            C38801rC c38801rC = C38321qM.A0h;
            C38801rC.A07(anonymousClass182, c38321qM);
        }
        String str = c206409Bx.A01;
        if (str != null) {
            anonymousClass182.A0S("text", str);
        }
        anonymousClass182.A0a();
    }
}
