package com.instagram.bugreporter;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractServiceC18470vY;
import X.C023409i;
import X.C09550e6;
import X.C0K8;
import X.C14360o3;
import X.C18950wb;
import X.C55203OeE;
import X.InterfaceC58266PsA;
import X.OO8;
import X.OWK;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.bugreporter.model.BugReport;

/* loaded from: classes9.dex */
public final class BugReporterService extends AbstractServiceC18470vY {
    @Override // X.AnonymousClass028
    public final void onHandleWork(Intent intent) {
        String str;
        String str2;
        C14360o3.A0B(intent, 0);
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        Throwable th = null;
        if (extras != null) {
            str = extras.getString("IgSessionManager.SESSION_TOKEN_KEY");
        } else {
            str = null;
        }
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        AbstractC18680vv A04 = C023409i.A0A.A04(A0b);
        InterfaceC58266PsA A00 = OO8.A00(intent.getExtras(), A04);
        Bundle extras2 = intent.getExtras();
        if (extras2 == null) {
            str2 = "BugReporterService started with null extras.";
        } else {
            Object A002 = OWK.A00.A00(extras2);
            th = C09550e6.A00(A002);
            if (th == null) {
                BugReport bugReport = (BugReport) A002;
                Parcelable parcelableExtra = intent.getParcelableExtra("BugReporterActivity.INTENT_EXTRA_VIEWMODEL");
                if (parcelableExtra != null) {
                    C55203OeE c55203OeE = C55203OeE.A00;
                    C14360o3.A0A(applicationContext);
                    c55203OeE.A05(applicationContext, (BugReportComposerViewModel) parcelableExtra, A00, bugReport, A04);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            str2 = "Failed to load bug report from intent extras.";
        }
        C0K8.A0F("BugReporterService", str2, th);
        AbstractC167007dF.A15(C18950wb.A01.AEp("BugReporterService", 817892340), DialogModule.KEY_MESSAGE, str2, th);
        A00.AW5("upload_service_error", str2);
    }
}
