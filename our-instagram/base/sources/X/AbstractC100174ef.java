package X;

import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* renamed from: X.4ef, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC100174ef {
    public final long A00 = 1000 / Os.sysconf(OsConstants._SC_CLK_TCK);

    public static String A01(File file) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            return bufferedReader.readLine();
        } finally {
            bufferedReader.close();
        }
    }

    public static void A02(StringBuilder sb, long j, long j2) {
        long j3 = (j * 1000) / j2;
        long j4 = j3 / 10;
        sb.append(j4);
        if (j4 < 10) {
            long j5 = j3 - (j4 * 10);
            if (j5 != 0) {
                sb.append('.');
                sb.append(j5);
            }
        }
    }
}
