package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import X.AbstractC58318PtA;
import X.C0f9;
import X.MSW;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public class IsManagedAppReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A04 = AbstractC58318PtA.A04(this, context, intent, -149583057);
        if (intent == null) {
            i = -877942130;
        } else {
            String action = intent.getAction();
            if (!action.equals("com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IS_MANAGED_APP_CHANGED")) {
                i = -1954695994;
            } else {
                MSW.A08(context, IsManagedAppCacheJobService.class).setAction(action);
                ((JobScheduler) context.getApplicationContext().getSystemService("jobscheduler")).enqueue(new JobInfo.Builder(1517668458, new ComponentName(context, (Class<?>) IsManagedAppCacheJobService.class)).setOverrideDeadline(0L).build(), new JobWorkItem(intent));
                i = -1000387589;
            }
        }
        C0f9.A0E(i, A04, intent);
    }
}
