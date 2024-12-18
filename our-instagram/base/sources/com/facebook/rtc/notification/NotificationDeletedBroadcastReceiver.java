package com.facebook.rtc.notification;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC54360O0s;
import X.C0f9;
import X.C0fM;
import X.C51999Myp;
import X.OXh;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class NotificationDeletedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C51999Myp c51999Myp;
        int A01 = C0f9.A01(-176658916);
        C0fM.A01(this, context, intent);
        boolean A1R = AbstractC167007dF.A1R(0, context, intent);
        String stringExtra = intent.getStringExtra("notification_type_tag");
        String stringExtra2 = intent.getStringExtra("local_call_id");
        if (stringExtra2 != null) {
            boolean booleanExtra = intent.getBooleanExtra("for_foreground", false);
            ArrayList A1E = AbstractC166987dD.A1E();
            if (stringExtra != null) {
                A1E.add(stringExtra);
            }
            if (booleanExtra) {
                A1E.add("foreground");
            }
            OXh.A02(null, "call_notification_dismissed", stringExtra2, null, A1E, null, false);
            if (intent.getBooleanExtra("end_call_on_notification_dismiss", false) && (c51999Myp = (C51999Myp) AbstractC54360O0s.A01.invoke(stringExtra2)) != null) {
                c51999Myp.A01().end(0, "call_notification_dismissed", A1R);
            }
            C0f9.A0E(-1062360300, A01, intent);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0E(396870345, A01, intent);
        throw A0g;
    }
}
