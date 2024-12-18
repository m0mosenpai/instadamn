package com.instagram.rtc.signaling.notifications.service;

import X.AbstractC27671Vv;
import X.AbstractC54159Nwv;
import X.BQ5;
import X.C08770cf;
import X.C0f9;
import X.C23821Ep;
import X.C3ER;
import X.C55051Oa2;
import X.C6QM;
import X.DSA;
import X.InterfaceC09390do;
import X.InterfaceC16620sF;
import X.MSY;
import X.OPw;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;

/* loaded from: classes9.dex */
public final class RtcCallActionIntentHandlerService extends Service {
    public final AbstractC27671Vv A00 = C3ER.A00();
    public final InterfaceC09390do A01 = MSY.A0p(this, 12);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int A04 = C0f9.A04(-1045136790);
        super.onDestroy();
        C6QM.A00(this);
        C0f9.A0B(1280423174, A04);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        RtcConnectionEntity rtcConnectionEntity;
        boolean z;
        String Bl4;
        InterfaceC16620sF bq5;
        int A04 = C0f9.A04(-1966378129);
        if (intent != null) {
            C08770cf.A01.A01(this, intent);
            try {
                intent.getAction();
                Bundle extras = intent.getExtras();
                if (extras != null && (rtcConnectionEntity = (RtcConnectionEntity) extras.getParcelable("com.instagram.rtc.notifications.service.entity")) != null) {
                    RtcConnectionEntity A00 = C55051Oa2.A00(OPw.A00(rtcConnectionEntity));
                    if (A00 != null) {
                        rtcConnectionEntity = A00;
                    }
                    String action = intent.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode != -2034635050) {
                            if (hashCode != -607360496) {
                                if (hashCode == 1422340809 && action.equals("DISMISS_LIVE_NOTIFICATION")) {
                                    Bl4 = rtcConnectionEntity.Bl4();
                                    bq5 = new DSA(46, rtcConnectionEntity, this);
                                    AbstractC54159Nwv.A00(Bl4, bq5);
                                }
                            } else if (action.equals("DISMISS_MISSED")) {
                                z = false;
                                Bl4 = rtcConnectionEntity.Bl4();
                                bq5 = new BQ5(7, this, rtcConnectionEntity, z);
                                AbstractC54159Nwv.A00(Bl4, bq5);
                            }
                        } else if (action.equals("DECLINE")) {
                            z = true;
                            Bl4 = rtcConnectionEntity.Bl4();
                            bq5 = new BQ5(7, this, rtcConnectionEntity, z);
                            AbstractC54159Nwv.A00(Bl4, bq5);
                        }
                    }
                    ((C23821Ep) this.A01.getValue()).A00.cancel(OPw.A01(rtcConnectionEntity), 1910377639);
                }
            } finally {
                stopSelf();
            }
        }
        C0f9.A0B(870950075, A04);
        return 1;
    }
}
