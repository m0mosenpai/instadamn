package com.instagram.share.handleractivity;

import X.AbstractC001900j;
import X.AbstractC167017dG;
import X.AbstractC54199Nxd;
import X.AbstractC54201Nxf;
import X.C0f9;
import X.C14360o3;
import X.C1QT;
import X.C54815OKq;
import android.content.Intent;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class ShareHandlerActivity extends BaseShareHandlerActivity {
    @Override // com.instagram.share.handleractivity.BaseShareHandlerActivity, com.instagram.base.activity.IgActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-86065008);
        super.onCreate(bundle);
        UserSession A01 = A01();
        if (A01 == null) {
            i = 1241075451;
        } else {
            C54815OKq A002 = AbstractC54199Nxd.A00(A01);
            if (A002.A00 == 0) {
                A002.A00 = A002.A02.flowStartForMarker(980420125, "ShareHandlerActivity", false);
            }
            Intent intent = getIntent();
            String valueOf = String.valueOf(intent.getAction());
            String valueOf2 = String.valueOf(intent.getType());
            String str = AbstractC54201Nxf.A00(this, intent, A01).A04;
            if (AbstractC001900j.A0a(str, "com.facebook.stella", false)) {
                intent.putExtra("source_application", str);
            }
            C14360o3.A0B(valueOf, 0);
            AbstractC167017dG.A1P(valueOf2, str);
            long j = A002.A00;
            if (j != 0) {
                C1QT c1qt = A002.A02;
                c1qt.flowAnnotate(j, "action", valueOf);
                c1qt.flowAnnotate(A002.A00, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, valueOf2);
                c1qt.flowAnnotate(A002.A00, "source_app", str);
            }
            long j2 = A002.A00;
            if (j2 != 0) {
                A002.A02.flowEndSuccess(j2);
                A002.A00 = 0L;
            }
            if (!A04()) {
                finish();
            }
            i = 1026508341;
        }
        C0f9.A07(i, A00);
    }
}
