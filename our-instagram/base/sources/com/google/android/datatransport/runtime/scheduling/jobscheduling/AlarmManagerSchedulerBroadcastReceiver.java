package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import X.AbstractC166987dD;
import X.AbstractC25230BEn;
import X.AbstractC58318PtA;
import X.AbstractC62859SUg;
import X.C0f9;
import X.EnumC61103RfI;
import X.S2F;
import X.SJH;
import X.T43;
import X.TQk;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.facebook.location.platform.api.Location;

/* loaded from: classes10.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A04 = AbstractC58318PtA.A04(this, context, intent, 208650009);
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(Location.EXTRAS);
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        T43.A01(context);
        byte[] bArr = null;
        if (queryParameter != null) {
            EnumC61103RfI enumC61103RfI = (EnumC61103RfI) AbstractC62859SUg.A00.get(intValue);
            if (enumC61103RfI != null) {
                if (queryParameter2 != null) {
                    bArr = Base64.decode(queryParameter2, 0);
                }
                SJH sjh = T43.A00().A01;
                sjh.A08.execute(new TQk(S2F.A00(enumC61103RfI, queryParameter, bArr), sjh, new Runnable() { // from class: X.TJ1
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                }, i));
                C0f9.A0E(1270501429, A04, intent);
                return;
            }
            throw AbstractC25230BEn.A0n("Unknown Priority for value ", intValue);
        }
        throw AbstractC166987dD.A15("Null backendName");
    }
}
