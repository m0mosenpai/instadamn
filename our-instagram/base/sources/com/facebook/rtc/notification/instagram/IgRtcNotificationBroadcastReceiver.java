package com.facebook.rtc.notification.instagram;

import X.AbstractC167007dF;
import X.AbstractC27671Vv;
import X.AbstractC54159Nwv;
import X.C0f9;
import X.C0fM;
import X.C14360o3;
import X.C30220DSz;
import X.C30484DbT;
import X.C30487DbW;
import X.C3ER;
import X.C55051Oa2;
import X.InterfaceC16620sF;
import X.OPw;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;

/* loaded from: classes9.dex */
public final class IgRtcNotificationBroadcastReceiver extends BroadcastReceiver {
    public final AbstractC27671Vv A00 = C3ER.A00();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        String Bl4;
        InterfaceC16620sF c30220DSz;
        int A01 = C0f9.A01(-1582988751);
        C0fM.A01(this, context, intent);
        boolean A1R = AbstractC167007dF.A1R(0, context, intent);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            i = 1213593660;
        } else {
            String string = extras.getString("com.instagram.rtc.notifications.service.recipient");
            if (C14360o3.A0K(intent.getAction(), "LEAVE") && string != null) {
                AbstractC54159Nwv.A00(string, new C30484DbT(44, context, this));
                i = -1928269382;
            } else {
                RtcConnectionEntity rtcConnectionEntity = (RtcConnectionEntity) extras.getParcelable("com.instagram.rtc.notifications.service.entity");
                if (rtcConnectionEntity == null) {
                    i = 14099644;
                } else {
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
                                    c30220DSz = new C30487DbW(8, rtcConnectionEntity, this, context);
                                    AbstractC54159Nwv.A00(Bl4, c30220DSz);
                                }
                            } else if (action.equals("DISMISS_MISSED")) {
                                Bl4 = rtcConnectionEntity.Bl4();
                                c30220DSz = new C30220DSz(0, rtcConnectionEntity, context, this, false);
                                AbstractC54159Nwv.A00(Bl4, c30220DSz);
                            }
                        } else if (action.equals("DECLINE")) {
                            Bl4 = rtcConnectionEntity.Bl4();
                            c30220DSz = new C30220DSz(0, rtcConnectionEntity, context, this, A1R);
                            AbstractC54159Nwv.A00(Bl4, c30220DSz);
                        }
                    }
                    i = 1118200846;
                }
            }
        }
        C0f9.A0E(i, A01, intent);
    }
}
