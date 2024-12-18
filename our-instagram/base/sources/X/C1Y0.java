package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;
import java.util.Date;

/* renamed from: X.1Y0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Y0 implements C1Y2 {
    @Override // X.C1Y2
    public final C52776NXh CsW(Context context, InterfaceC58266PsA interfaceC58266PsA, BugReportSource bugReportSource, AbstractC12990ll abstractC12990ll, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C52776NXh c52776NXh;
        Bundle bundle = new Bundle();
        bundle.putString("ARG_RAGESHAKE_BOTTOM_SHEET_AD_ID", str);
        bundle.putBoolean("ARG_RAGESHAKE_BOTTOM_SHEET_MANUAL_REPORT_FROM_HELP_SETTING", z);
        bundle.putBoolean("ARG_RAGESHAKE_BOTTOM_SHEET_REPORT_FROM_LONG_PRESS", z2);
        bundle.putBoolean("ARG_RAGESHAKE_DISMISSED_PREVIOUS_VIEWS", z3);
        bundle.putString("ARG_SCREEN_FROM", str2);
        bundle.putString("ARG_NAV_CHAIN", str3);
        bundle.putSerializable("ARG_BOTTOM_SHEET_BUG_REPORT_SOURCE", bugReportSource);
        if ((abstractC12990ll instanceof UserSession) && C2TN.A00((UserSession) abstractC12990ll)) {
            if (OWB.A00(AbstractC12880la.A01(context), new Date().getTime()) != C05F.A00) {
                c52776NXh = new N8J();
                c52776NXh.setArguments(bundle);
                return c52776NXh;
            }
        }
        c52776NXh = new C52776NXh();
        c52776NXh.setArguments(bundle);
        return c52776NXh;
    }
}
