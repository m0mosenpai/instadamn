package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import java.util.ArrayList;

/* renamed from: X.260, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass260 implements InterfaceC449925e {
    public static AnonymousClass260 A01;
    public final UserSession A00;

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        C14360o3.A0B(context, 0);
        ArrayList A04 = C51652Yn.A05.A04(context, (int) C18U.A01(C06090Tz.A05, this.A00, 36605091436238035L));
        if (!A04.isEmpty()) {
            return AbstractC100734fc.A02(A04).toString();
        }
        return "Logs not available.";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "aware_trace_json";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return true;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "AwareTraceJsonLogsProvider";
    }

    public AnonymousClass260(UserSession userSession) {
        this.A00 = userSession;
    }
}
