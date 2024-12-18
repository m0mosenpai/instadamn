package com.instagram.bugreporter;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C023409i;
import X.C05F;
import X.C09540e5;
import X.C09Y;
import X.C0f9;
import X.C0fM;
import X.C54748OGw;
import X.MT6;
import X.OVY;
import X.OWK;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.bugreporter.model.BugReport;

/* loaded from: classes9.dex */
public final class BugReportUploadFailedNotificationDismissedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A01 = C0f9.A01(353852769);
        C0fM.A01(this, context, intent);
        AbstractC167017dG.A1N(context, intent);
        Bundle extras = intent.getExtras();
        Object obj = null;
        if (extras != null && extras.getString("IgSessionManager.SESSION_TOKEN_KEY") != null) {
            C09Y c09y = C023409i.A0A;
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                new C54748OGw(c09y.A06(extras2), "BugReportUploadFailedNotificationDismissedReceiver").A00(C05F.A05);
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0E(1988429158, A01, intent);
                throw A0g;
            }
        }
        Bundle extras3 = intent.getExtras();
        if (extras3 != null) {
            Object A00 = OWK.A00.A00(extras3);
            if (!(A00 instanceof C09540e5)) {
                obj = A00;
            }
            BugReport bugReport = (BugReport) obj;
            if (bugReport != null) {
                MT6.A03(new OVY(bugReport.A0G).A00());
            }
        }
        C0f9.A0E(-1392967791, A01, intent);
    }
}
