package X;

import android.os.Build;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.OSg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54956OSg {
    public static Boolean A00;
    public static final int[] A01 = {720, 640, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI};

    public static final boolean A00() {
        boolean z = true;
        if (C1AD.A06(C06090Tz.A05, 18296771134357963L)) {
            return true;
        }
        Boolean bool = A00;
        if (bool == null) {
            String str = Build.MODEL;
            C14360o3.A08(str);
            if (!AbstractC001900j.A0a(str, "XT1049", false) && !AbstractC001900j.A0a(str, "XT1050", false) && !AbstractC001900j.A0a(str, "XT1052", false) && !AbstractC001900j.A0a(str, "XT1053", false) && !AbstractC001900j.A0a(str, "XT1055", false) && !AbstractC001900j.A0a(str, "XT1056", false) && !AbstractC001900j.A0a(str, "XT1058", false) && !AbstractC001900j.A0a(str, "XT1060", false)) {
                z = false;
            }
            bool = Boolean.valueOf(z);
            A00 = bool;
            if (bool == null) {
                throw AbstractC166997dE.A0g();
            }
        }
        return bool.booleanValue();
    }
}
