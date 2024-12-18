package com.instagram.api.realtimepeak;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC23021Ah;
import X.AbstractC31171DnF;
import X.C0f9;
import X.C0fM;
import X.FWU;
import X.InterfaceC19610xo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class LauncherSyncBootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        UserSession userSession;
        int A01 = C0f9.A01(-237503784);
        C0fM.A01(this, context, intent);
        AbstractC167017dG.A1N(context, intent);
        if (!FWU.A01(intent.getAction())) {
            i = -458661443;
        } else {
            AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
            if ((A0F instanceof UserSession) && (userSession = (UserSession) A0F) != null) {
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(userSession));
                A0w.E7G("mobile_config_last_sync_time_peak", 0L);
                A0w.apply();
                i = 469249524;
            } else {
                i = -8011186;
            }
        }
        C0f9.A0E(i, A01, intent);
    }
}
