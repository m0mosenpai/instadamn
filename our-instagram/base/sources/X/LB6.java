package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes8.dex */
public abstract class LB6 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        FragmentActivity A042 = C6BQ.A04(c6fq);
        if (Build.VERSION.SDK_INT < 33 && !AbstractC23451Ch.A07(A04, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            AbstractC43592JPx.A1C(A04, new C48291LYp(1, A04, new ME8(A042, userSession, A04, A0e, 6)), "android.permission.WRITE_EXTERNAL_STORAGE");
            return null;
        }
        A01(A04, A042, userSession, A0e);
        return null;
    }

    public static final void A01(Activity activity, Context context, UserSession userSession, String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        if (mimeTypeFromExtension != null) {
            C121275eQ A04 = AbstractC50633MWu.A04(context, userSession, new OUQ(str, "imagined_for_you_media", AbstractC43592JPx.A1a(MediaStreamTrack.VIDEO_TRACK_KIND, 1, mimeTypeFromExtension), false, false), -1L, true);
            C43922JbX.A01(A04, activity, 4);
            C1GJ.A04(A04, -5);
        }
    }
}
