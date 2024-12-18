package com.instagram.process.asyncinit;

import X.AbstractC58327PtK;
import X.C0K8;
import X.C0YB;
import X.C0f9;
import X.C0fM;
import X.C11L;
import X.C14360o3;
import X.C2ZR;
import X.C50772Uy;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class IgAppInitReplayBroadcastReceiver extends BroadcastReceiver {
    public static final String TAG = "IgAppInitBroadcast";
    public static final C50772Uy Companion = new Object();
    public static final LinkedList originalIntents = new LinkedList();
    public static final LinkedList originalClassNames = new LinkedList();

    public static final void delayReceiverCreation(String str) {
        C14360o3.A0B(str, 0);
        originalClassNames.add(str);
    }

    public static final void replayBroadcasts(Context context) {
        C14360o3.A0B(context, 0);
        new Handler(Looper.getMainLooper()).post(new C2ZR(context));
    }

    public static final boolean wasReceiverDelayed(String str) {
        C14360o3.A0B(str, 0);
        return originalClassNames.remove(str);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int A01 = C0f9.A01(-1798033559);
        C0fM.A01(this, context, intent);
        C14360o3.A0B(context, 0);
        C14360o3.A0B(intent, 1);
        C0K8.A0D(TAG, "Received broadcast during app init");
        if (AbstractC58327PtK.A08() && originalIntents.isEmpty()) {
            String action = intent.getAction();
            if (action != null && action.startsWith("android.")) {
                intent.setAction(new C11L("android\\.").A01(action, "com.instagram.android."));
            }
            context.sendBroadcast(intent);
            C0YB.A00.markerGenerateWithAnnotations(25116204, (short) 467, 0L, TimeUnit.MILLISECONDS, null);
        } else {
            originalIntents.addLast(intent);
        }
        C0f9.A0E(-1641061337, A01, intent);
    }
}
