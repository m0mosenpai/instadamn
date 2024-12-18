package X;

import android.content.Context;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;

/* renamed from: X.26K, reason: invalid class name */
/* loaded from: classes.dex */
public final class C26K implements InterfaceC449925e, InterfaceC13000lm {
    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        return null;
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "IGTVUploadReportLogsProvider";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "igtv_upload_report_flow";
    }
}
