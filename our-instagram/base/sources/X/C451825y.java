package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.25y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C451825y implements InterfaceC449925e {
    public static C451825y A01;
    public final UserSession A00;

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        C14360o3.A0B(context, 0);
        ArrayList A04 = C51652Yn.A05.A04(context, (int) C18U.A01(C06090Tz.A05, this.A00, 36605091436238035L));
        if (!A04.isEmpty()) {
            return AbstractC100734fc.A01(A04);
        }
        return "Logs not available.";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "aware_trace";
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
    public final String getTag() {
        return "AwareTraceLogsProvider";
    }

    public C451825y(UserSession userSession) {
        this.A00 = userSession;
    }
}
