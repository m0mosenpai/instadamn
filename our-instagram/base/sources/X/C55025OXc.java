package X;

import android.os.Process;
import android.util.Pair;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.OXc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55025OXc {
    public static HashMap A00() {
        try {
            HashMap A01 = A01();
            if (A01 == null) {
                return null;
            }
            HashMap A1G = AbstractC166987dD.A1G();
            Iterator A14 = AbstractC166997dE.A14(A01);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                OKO A012 = OZK.A01(OZK.A02(StringFormatUtil.formatStrLocaleSafe("/proc/%d/task/%s/stat", Integer.valueOf(Process.myPid()), A1K.getKey())));
                if (A012 != null) {
                    A1G.put(AbstractC31172DnG.A17(A1K), new Pair(A1K.getValue(), A012));
                }
            }
            return A1G;
        } catch (Exception e) {
            C0K8.A05(C55025OXc.class, "Error getting thread level CPU Usage data", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap A01() {
        /*
            android.os.StrictMode$ThreadPolicy r11 = android.os.StrictMode.allowThreadDiskReads()
            java.lang.String r7 = "/proc/self/task"
            java.util.HashMap r9 = X.AbstractC166987dD.A1G()
            r10 = 0
            java.io.File r8 = X.AbstractC166987dD.A11(r7)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.io.File[] r6 = r8.listFiles()     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L66
            if (r6 == 0) goto L4b
            int r5 = r6.length     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L66
            r4 = 0
        L17:
            if (r4 >= r5) goto L4b
            r3 = r6[r4]     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L66
            java.lang.String r1 = r3.getName()     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L66
            java.lang.String r0 = "/proc/self/task/%s/comm"
            java.lang.String r2 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L66
            java.lang.String r1 = "r"
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L3e java.lang.Exception -> L4f java.lang.Throwable -> L66
            r0.<init>(r2, r1)     // Catch: java.io.IOException -> L3e java.lang.Exception -> L4f java.lang.Throwable -> L66
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L34
            r0.close()     // Catch: java.io.IOException -> L3e java.lang.Exception -> L4f java.lang.Throwable -> L66
            goto L3f
        L34:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L39
            goto L3d
        L39:
            r0 = move-exception
            X.AbstractC61625Rqp.A00(r1, r0)     // Catch: java.io.IOException -> L3e java.lang.Exception -> L4f java.lang.Throwable -> L66
        L3d:
            throw r1     // Catch: java.io.IOException -> L3e java.lang.Exception -> L4f java.lang.Throwable -> L66
        L3e:
            r1 = 0
        L3f:
            if (r1 == 0) goto L48
            java.lang.String r0 = r3.getName()     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L66
            r9.put(r0, r1)     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L66
        L48:
            int r4 = r4 + 1
            goto L17
        L4b:
            android.os.StrictMode.setThreadPolicy(r11)
            return r9
        L4f:
            r2 = move-exception
            goto L55
        L51:
            r0 = move-exception
            goto L68
        L53:
            r2 = move-exception
            r8 = r10
        L55:
            java.lang.String r0 = "Error getting threads from task directory: %s"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r7)     // Catch: java.lang.Throwable -> L66
            java.lang.Class<X.OXc> r0 = X.C55025OXc.class
            X.C0K8.A06(r0, r1, r2)     // Catch: java.lang.Throwable -> L66
            if (r8 == 0) goto L65
            android.os.StrictMode.setThreadPolicy(r11)
        L65:
            return r10
        L66:
            r0 = move-exception
            r10 = r8
        L68:
            if (r10 == 0) goto L6d
            android.os.StrictMode.setThreadPolicy(r11)
        L6d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55025OXc.A01():java.util.HashMap");
    }
}
