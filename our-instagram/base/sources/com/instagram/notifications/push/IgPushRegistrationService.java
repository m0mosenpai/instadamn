package com.instagram.notifications.push;

import X.AbstractC31173DnH;
import X.AbstractServiceC18470vY;
import X.C023409i;
import X.C0w9;
import X.C31403Dr8;
import android.content.Intent;

/* loaded from: classes6.dex */
public class IgPushRegistrationService extends AbstractServiceC18470vY {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Jk, java.lang.Object] */
    @Override // X.AnonymousClass028
    public final void onHandleWork(Intent intent) {
        try {
            if (intent == null) {
                C0w9.A03("IgPushRegistrationService", "onHandleWork - Null Intent");
                return;
            }
            if (intent.getExtras() == null) {
                C0w9.A03("IgPushRegistrationService", "onHandleWork - Empty extras");
                return;
            }
            String string = intent.getExtras().getString("PushRegistrationService.USER_ID");
            C31403Dr8 c31403Dr8 = new C31403Dr8(getApplicationContext(), intent);
            if (!C023409i.A0A.A0A(new Object(), null, c31403Dr8, string)) {
                AbstractC31173DnH.A1Z("onHandleWork - Error when adding operation, given id is not authenticated: ", string, "IgPushRegistrationService");
            }
        } catch (RuntimeException e) {
            C0w9.A05("IgPushRegistrationService", "onHandleWork - runtime exception", 1, e);
        }
    }
}
