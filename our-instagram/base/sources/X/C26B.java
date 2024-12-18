package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.facebook.tigon.tigonmns.TigonMNSServiceHolder;
import com.instagram.common.session.UserSession;
import com.instagram.service.tigon.IGTigonService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* renamed from: X.26B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C26B implements AnonymousClass266 {
    @Override // X.AnonymousClass266
    public final boolean Bv4() {
        return true;
    }

    @Override // X.AnonymousClass266
    public final void FEr(UserSession userSession, File file) {
        String str;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(file, 1);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        IGTigonService tigonService = IGTigonService.getTigonService(userSession);
        C14360o3.A07(tigonService);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);
        TigonServiceHolder tigonServiceHolder = tigonService.mTigonServiceHolder;
        if (tigonServiceHolder instanceof TigonMNSServiceHolder) {
            str = ((TigonMNSServiceHolder) tigonServiceHolder).generateBugReport();
        } else {
            str = "Tigon bug report";
        }
        printWriter.write(str);
        printWriter.flush();
        printWriter.close();
    }

    @Override // X.AnonymousClass266
    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    @Override // X.AnonymousClass266
    public final String getTag() {
        return "TigonLogsProvider";
    }

    @Override // X.AnonymousClass266
    public final String getFilenamePrefix() {
        return "mobile_network_stack";
    }
}
