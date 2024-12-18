package com.instagram.api.useragent;

import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.C0f9;
import X.C1FO;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public final class LocationChangeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A04 = AbstractC58318PtA.A04(this, context, intent, -529250968);
        AbstractC167017dG.A1N(context, intent);
        synchronized (C1FO.class) {
            C1FO.A00 = null;
        }
        C0f9.A0E(-865659131, A04, intent);
    }
}
