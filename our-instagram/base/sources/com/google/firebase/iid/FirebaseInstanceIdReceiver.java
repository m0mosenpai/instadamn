package com.google.firebase.iid;

import X.C0f9;
import X.PvO;
import X.SMK;
import X.ServiceConnectionC63445SkO;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;

/* loaded from: classes10.dex */
public final class FirebaseInstanceIdReceiver extends PvO {
    public static ServiceConnectionC63445SkO A00;

    /* JADX WARN: Code restructure failed: missing block: B:85:0x019d, code lost:
    
        if (r1 == 402) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03(android.content.Context r10, android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.A03(android.content.Context, android.content.Intent):void");
    }

    public static int A02(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        ServiceConnectionC63445SkO serviceConnectionC63445SkO;
        Log.isLoggable("FirebaseInstanceId", 3);
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        synchronized (FirebaseInstanceIdReceiver.class) {
            serviceConnectionC63445SkO = A00;
            if (serviceConnectionC63445SkO == null) {
                serviceConnectionC63445SkO = new ServiceConnectionC63445SkO(context);
                A00 = serviceConnectionC63445SkO;
            }
        }
        BroadcastReceiver.PendingResult goAsync = broadcastReceiver.goAsync();
        synchronized (serviceConnectionC63445SkO) {
            Log.isLoggable("EnhancedIntentService", 3);
            serviceConnectionC63445SkO.A04.add(new SMK(goAsync, intent, serviceConnectionC63445SkO.A05));
            ServiceConnectionC63445SkO.A00(serviceConnectionC63445SkO);
        }
        return -1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        Intent intent2;
        int A01 = C0f9.A01(-952371940);
        if (intent == null) {
            i = 7726294;
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if ((parcelableExtra instanceof Intent) && (intent2 = (Intent) parcelableExtra) != null) {
                A03(context, intent2);
                i = 928610916;
            } else {
                A03(context, intent);
                i = -1700168424;
            }
        }
        C0f9.A0E(i, A01, intent);
    }
}
