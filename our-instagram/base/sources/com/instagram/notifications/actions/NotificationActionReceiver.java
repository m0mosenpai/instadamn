package com.instagram.notifications.actions;

import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.C08310bt;
import X.C0f9;
import X.C12260kU;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public final class NotificationActionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A04 = AbstractC58318PtA.A04(this, context, intent, 1216520724);
        AbstractC167017dG.A1N(context, intent);
        if (!C08310bt.A02().A00(context, intent, this)) {
            i = -1972662098;
        } else {
            intent.setComponent(new ComponentName(context, (Class<?>) ActionHandlerIntentService.class));
            C12260kU.A01(context, intent);
            i = 332143916;
        }
        C0f9.A0E(i, A04, intent);
    }
}
