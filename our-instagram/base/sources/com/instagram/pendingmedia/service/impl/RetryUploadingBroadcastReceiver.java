package com.instagram.pendingmedia.service.impl;

import X.AbstractC167017dG;
import X.C023409i;
import X.C09540e5;
import X.C0f9;
import X.C0fM;
import X.C14360o3;
import X.C40121td;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class RetryUploadingBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra;
        Object c09540e5;
        String stringExtra;
        int A01 = C0f9.A01(1280804642);
        C0fM.A01(this, context, intent);
        AbstractC167017dG.A1N(context, intent);
        if (C14360o3.A0K(intent.getAction(), "com.instagram.pendingmedia.service.notification.ACTION_RETRY_UPLOADING") && (intExtra = intent.getIntExtra("NOTIFICATION_ID", -1)) != -1) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            try {
                c09540e5 = C023409i.A0A.A08(this);
            } catch (Throwable th) {
                c09540e5 = new C09540e5(th);
            }
            if (c09540e5 instanceof C09540e5) {
                c09540e5 = null;
            }
            UserSession userSession = (UserSession) c09540e5;
            if (userSession != null && (stringExtra = intent.getStringExtra("PENDING_MEDIA_KEY")) != null) {
                C40121td.A0G.A01(context, userSession).A0L(stringExtra);
            }
            notificationManager.cancel(null, intExtra);
        }
        C0f9.A0E(1112799772, A01, intent);
    }
}
