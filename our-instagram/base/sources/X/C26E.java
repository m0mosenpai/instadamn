package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/* renamed from: X.26E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C26E implements AnonymousClass266 {
    @Override // X.AnonymousClass266
    public final boolean Bv4() {
        return true;
    }

    @Override // X.AnonymousClass266
    public final void FEr(UserSession userSession, File file) {
        C14360o3.A0B(file, 1);
        C14360o3.A07(C23261Bg.A00());
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            SCK sck = C63188Sen.A0b;
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(fileOutputStream));
            C0s6 A00 = AbstractC13190m5.A00(sck.A00.getLogLines());
            while (A00.hasNext()) {
                printWriter.println((String) A00.next());
            }
            fileOutputStream.close();
        } finally {
        }
    }

    @Override // X.AnonymousClass266
    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    @Override // X.AnonymousClass266
    public final String getTag() {
        return "LigerLogsProvider";
    }

    @Override // X.AnonymousClass266
    public final String getFilenamePrefix() {
        return "fb_liger_reporting";
    }
}
