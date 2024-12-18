package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Map;

/* renamed from: X.26A, reason: invalid class name */
/* loaded from: classes.dex */
public final class C26A implements AnonymousClass266 {
    @Override // X.AnonymousClass266
    public final boolean Bv4() {
        return true;
    }

    @Override // X.AnonymousClass266
    public final void FEr(UserSession userSession, File file) {
        C14360o3.A0B(file, 1);
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(file));
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        C14360o3.A07(allStackTraces);
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            printWriter.print(key);
            printWriter.print(" ");
            printWriter.print(key.getState());
            printWriter.println(":");
            C0s6 A00 = AbstractC13190m5.A00(value);
            while (A00.hasNext()) {
                printWriter.println(A00.next());
            }
            printWriter.println();
        }
        printWriter.flush();
    }

    @Override // X.AnonymousClass266
    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    @Override // X.AnonymousClass266
    public final String getTag() {
        return "StackTraceLogsProvider";
    }

    @Override // X.AnonymousClass266
    public final String getFilenamePrefix() {
        return "stacktrace";
    }
}
