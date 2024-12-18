package com.instagram.notifications.local;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C023409i;
import X.C08310bt;
import X.C0f9;
import X.C0fM;
import X.C34457FGv;
import X.C57518Pfs;
import X.S55;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class LocalNotificationAlarmReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = C0f9.A01(-804192871);
        C0fM.A01(this, context, intent);
        AbstractC167017dG.A1N(context, intent);
        if (!C08310bt.A02().A00(context, intent, this)) {
            i = 1956409015;
        } else {
            UserSession A07 = C023409i.A0A.A07(intent.getExtras());
            if (A07 == null) {
                i = -990550280;
            } else {
                if (S55.A00(context)) {
                    String stringExtra = intent.getStringExtra(AbstractC111324zv.A00(2678));
                    if (stringExtra == null) {
                        i = -1720482044;
                    } else {
                        String A00 = AbstractC111324zv.A00(697);
                        if (stringExtra.equals(A00)) {
                            ((C34457FGv) A07.A01(C34457FGv.class, new C57518Pfs(A07, 34))).A00.getString(A00, null);
                        } else {
                            throw AbstractC166987dD.A12(stringExtra);
                        }
                    }
                }
                i = 59278397;
            }
        }
        C0f9.A0E(i, A01, intent);
    }
}
