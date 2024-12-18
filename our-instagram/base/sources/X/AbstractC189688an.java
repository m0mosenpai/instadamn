package X;

import android.R;
import android.os.Looper;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.8an, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC189688an {
    public static boolean A00 = true;
    public static boolean A01;
    public static final C012504o A02 = new C012504o(0);

    public static final void A00(C22P c22p) {
        C14360o3.A0B(c22p, 0);
        if (!A01) {
            A01 = true;
            C006802i c006802i = C006802i.A0p;
            c006802i.markerStart(R.bool.config_carDockEnablesAccelerometer);
            c006802i.markerAnnotate(R.bool.config_carDockEnablesAccelerometer, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c22p.name());
        }
    }

    public static final void A02(UserSession userSession, C55U c55u, String str, String str2, int i) {
        C14360o3.A0B(userSession, 1);
        C006802i c006802i = C006802i.A0p;
        c006802i.markerStart(i);
        if (str != null) {
            c006802i.markerAnnotate(i, "camera_session_id", str);
        }
        if (c55u != null) {
            c006802i.markerAnnotate(i, "camera_destination", c55u.A02);
        }
        if (str2 != null) {
            c006802i.markerAnnotate(i, TraceFieldType.TransportType, str2);
        }
    }

    public static final void A03(UserSession userSession, String str, boolean z) {
        C14360o3.A0B(userSession, 0);
        if (!C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            AbstractC12120kG.A07("igcam", "markerTtiAddPoint() is not called from the UI thread", null);
        }
        C012504o c012504o = A02;
        if (c012504o.size() >= 3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't add new point, limit reached: points=");
            sb.append(c012504o);
            sb.append(" new point=");
            sb.append(str);
            AbstractC12120kG.A07("igcam", sb.toString(), null);
            return;
        }
        if (c012504o.contains(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Duplicated point: points=");
            sb2.append(c012504o);
            sb2.append(" new point=");
            sb2.append(str);
            AbstractC12120kG.A07("igcam", sb2.toString(), null);
            return;
        }
        if (c012504o.isEmpty() || !z) {
            A00 = z;
        }
        c012504o.add(str);
        C006802i.A0p.markerPoint(R.bool.config_carDockEnablesAccelerometer, str);
        if (c012504o.size() >= 3) {
            C006802i c006802i = C006802i.A0p;
            short s = 3;
            if (A00) {
                s = 2;
            }
            c006802i.markerEnd(R.bool.config_carDockEnablesAccelerometer, s);
            c012504o.clear();
            A01 = false;
        }
    }

    public static final void A01(UserSession userSession, C55U c55u, String str) {
        C006802i c006802i = C006802i.A0p;
        if (str != null) {
            c006802i.markerAnnotate(R.bool.config_carDockEnablesAccelerometer, "camera_session_id", str);
        }
        if (c55u != null) {
            c006802i.markerAnnotate(R.bool.config_carDockEnablesAccelerometer, "camera_destination", c55u.A02);
        }
        A03(userSession, "on_fully_visible", true);
    }

    public static final void A04(String str, String str2, Throwable th, boolean z) {
        C006802i c006802i = C006802i.A0p;
        c006802i.markerAnnotate(R.bool.config_batterySdCardAccessibility, "capture_source", str);
        c006802i.markerAnnotate(R.bool.config_batterySdCardAccessibility, "camera_position", str2);
        if (th != null) {
            String stackTraceString = android.util.Log.getStackTraceString(th);
            C14360o3.A07(stackTraceString);
            c006802i.markerAnnotate(R.bool.config_batterySdCardAccessibility, "stack_trace", C00Q.A03(stackTraceString, 1000));
        }
        short s = 3;
        if (z) {
            s = 2;
        }
        c006802i.markerEnd(R.bool.config_batterySdCardAccessibility, s);
    }
}
