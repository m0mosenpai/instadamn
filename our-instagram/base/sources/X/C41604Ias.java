package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Ias, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41604Ias {
    public static final C41604Ias A00 = new Object();

    public final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A03;
        Object A032 = c6fw.A03(1);
        C14360o3.A0C(A032, "null cannot be cast to non-null type kotlin.String");
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if (A0B instanceof UserSession) {
            UserSession userSession = (UserSession) A0B;
            FragmentActivity A04 = C6BQ.A04(c6fq);
            C14360o3.A0B(userSession, 0);
            AbstractC25233BEq.A0v(1, A04, str2, A032);
            if ("clips".equals(A032)) {
                C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A1L, userSession);
                c116875Qr.A1D = str2;
                c116875Qr.A1d = false;
                AbstractC31173DnH.A1J(A04, c116875Qr, userSession);
                return null;
            }
            C140966Yy A0r = AbstractC25225BEi.A0r(A04, userSession);
            C35028Fc1 A002 = C35028Fc1.A00(str2);
            A002.A0O = true;
            A0r.A0D(A002.A02());
            if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(A032)) {
                str = "video_thumbnail";
            } else {
                str = "photo_thumbnail";
            }
            A0r.A0B = str;
            A0r.A04();
            return null;
        }
        return null;
    }
}
