package com.google.android.gms.analytics;

import X.AbstractC58318PtA;
import X.AbstractC63371Sic;
import X.C0f9;
import X.C3U5;
import X.C60683RMb;
import X.C60687RMf;
import X.C63335Shm;
import X.SVM;
import X.SX6;
import X.TLH;
import X.TQ4;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* loaded from: classes10.dex */
public final class CampaignTrackingReceiver extends BroadcastReceiver {
    public static Boolean A00;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A04 = AbstractC58318PtA.A04(this, context, intent, -920075324);
        C63335Shm A01 = C63335Shm.A01(context);
        C60687RMf c60687RMf = A01.A0C;
        C63335Shm.A02(c60687RMf);
        if (intent == null) {
            AbstractC63371Sic.A09(c60687RMf, "CampaignTrackingReceiver received null intent", 5);
            i = -299093981;
        } else {
            String stringExtra = intent.getStringExtra("referrer");
            String action = intent.getAction();
            c60687RMf.A0D("CampaignTrackingReceiver received", action);
            if ("com.android.vending.INSTALL_REFERRER".equals(action) && !TextUtils.isEmpty(stringExtra)) {
                Number number = (Number) SVM.A0T.A00;
                int intValue = number.intValue();
                int length = stringExtra.length();
                if (length > intValue) {
                    c60687RMf.A0C(Integer.valueOf(length), number, "Campaign data exceed the maximum supported size and will be clipped. size, limit");
                    stringExtra = AbstractC58318PtA.A0j(stringExtra, intValue);
                }
                BroadcastReceiver.PendingResult goAsync = goAsync();
                C60683RMb c60683RMb = A01.A06;
                C63335Shm.A02(c60683RMb);
                TLH tlh = new TLH(goAsync);
                C3U5.A06(stringExtra, "campaign param can't be empty");
                SX6 A002 = C63335Shm.A00(c60683RMb);
                A002.A02.submit(new TQ4(c60683RMb, tlh, stringExtra));
                i = 1060824943;
            } else {
                AbstractC63371Sic.A09(c60687RMf, "CampaignTrackingReceiver received unexpected intent without referrer extra", 5);
                i = 1583887658;
            }
        }
        C0f9.A0E(i, A04, intent);
    }
}
