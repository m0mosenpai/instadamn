package com.facebook.analytics2.logger.legacy.uploader;

import X.C08310bt;
import X.C0f9;
import X.C0fM;
import X.TYB;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public class HighPriUploadRetryReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = C0f9.A01(393819729);
        C0fM.A01(this, context, intent);
        if (!C08310bt.A02().A00(context, intent, this)) {
            i = -1061341555;
        } else if (!"com.facebook.analytics2.logger.UPLOAD_NOW".equals(intent.getAction())) {
            i = -1107968825;
        } else {
            new TYB(goAsync(), context, intent, this).start();
            i = 394066524;
        }
        C0f9.A0E(i, A01, intent);
    }
}
