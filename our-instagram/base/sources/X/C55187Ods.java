package X;

import android.os.Build;
import com.instagram.common.session.UserSession;
import com.instagram.util.jpeg.JpegBridge;

/* renamed from: X.Ods, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55187Ods {
    public static Integer A00;
    public static Integer A01;
    public static Integer A02;
    public static Integer A03;

    public static synchronized int A00(int i) {
        Integer num;
        int round;
        synchronized (C55187Ods.class) {
            if (A01 == null || A03 == null || (num = A00) == null || A02 == null) {
                A03 = 95;
                A02 = 70;
                A01 = 200;
                num = 1080;
                A00 = num;
            }
            if (i >= num.intValue()) {
                round = A02.intValue();
            } else {
                int intValue = A01.intValue();
                if (i <= intValue) {
                    round = A03.intValue();
                } else {
                    int intValue2 = A02.intValue();
                    float f = (intValue2 - r1) / (r4 - intValue);
                    round = Math.round((f * i) + (A03.intValue() - (intValue * f)));
                }
            }
        }
        return round;
    }

    public static synchronized int A01(UserSession userSession) {
        int A012;
        synchronized (C55187Ods.class) {
            A012 = AbstractC31178DnM.A01(C06090Tz.A05, userSession, 36593967470478886L);
        }
        return A012;
    }

    public static int A02(UserSession userSession, int i) {
        int A002;
        if (i > 1080) {
            A002 = AbstractC31178DnM.A01(C06090Tz.A05, userSession, 36593967470544423L);
        } else {
            A002 = A00(i);
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36311856838607651L)) {
            long A012 = (long) C23231Bc.A00().A01();
            long A013 = C18U.A01(c06090Tz, userSession, 36593331815515253L);
            if (A012 > 0 && A012 >= A013) {
                A002 += AbstractC31178DnM.A01(c06090Tz, userSession, 36593331815580790L);
            }
        }
        return Math.min(100, A002);
    }

    public static String A04(String str) {
        if ("image/jpeg".equals(str)) {
            if (JpegBridge.A01()) {
                return JpegBridge.getJpegLibraryVersionNative();
            }
            return "library_not_loaded";
        }
        if (!"image/webp".equals(str) && !"image/heic".equals(str)) {
            return "unknown";
        }
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String A03(UserSession userSession) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("highres");
        A1C.append(' ');
        synchronized (C55187Ods.class) {
        }
        A1C.append(320);
        A1C.append('-');
        A1C.append(A01(userSession));
        return A1C.toString();
    }
}
