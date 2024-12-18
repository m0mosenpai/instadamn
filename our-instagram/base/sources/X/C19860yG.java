package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.0yG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19860yG implements InterfaceC449925e {
    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "profilo_internal_log";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        if (!C06570Wi.A01) {
            return null;
        }
        return C06570Wi.A00().A00();
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "IgProfiloB4bBugReportLogsProvider";
    }
}
