package X;

import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: X.0Nw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC04970Nw {
    public static void A00(C0NK c0nk, String str) {
        boolean z;
        int i;
        int A01;
        C04130Kf A00;
        File A02;
        File A022 = c0nk.A05().A02(c0nk.A05().A07);
        if (A022 != null) {
            String name = A022.getName();
            String substring = name.substring(name.indexOf(45) + 1);
            C04620Me c04620Me = C04620Me.A03;
            if (c04620Me != null) {
                C0Pe c0Pe = c04620Me.A01;
                if (c0Pe != null && (A02 = c0Pe.A02("")) != null) {
                    C0ME c0me = new C0ME(new File(A02, "state.txt"));
                    char A05 = c0me.A05();
                    char A06 = c0me.A06();
                    if (A05 != 'c' && A05 != 's' && A05 != 'r' && ((A05 != 'f' && A05 != 'p') || A06 == 'i')) {
                        File file = new File(A02, C0LW.A00(C0M6.CRITICAL_REPORT, C0OP.A04, "_prop.txt", 0));
                        if (file.exists()) {
                            Properties properties = new Properties();
                            try {
                                properties.load(new FileInputStream(file));
                                if ("true".equals(properties.getProperty("anr_started_in_foreground_v2", "false"))) {
                                }
                            } catch (IOException e) {
                                C0PC.A00().DEh("PrevSessIsFadV2", e, null);
                            }
                        }
                    }
                    z = true;
                    if (Build.VERSION.SDK_INT < 30 && (A01 = c04620Me.A01()) > 0 && (A00 = C04130Kf.A00(c0nk.A0J, A01)) != null) {
                        i = A00.A03();
                    } else {
                        i = -1;
                    }
                    C009203g.A01.A00(c0nk.A0J, substring, str, i, z);
                    return;
                }
                z = false;
                if (Build.VERSION.SDK_INT < 30) {
                }
                i = -1;
                C009203g.A01.A00(c0nk.A0J, substring, str, i, z);
                return;
            }
            throw new IllegalStateException("Did you call PreviousSessionHelper.init?");
        }
    }
}
