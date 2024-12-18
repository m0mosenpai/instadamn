package com.instagram.push;

import X.AbstractC12290kX;
import X.AbstractC12960li;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C0fM;
import X.C154676xH;
import X.C18U;
import X.C226218q;
import X.C3JG;
import X.FWU;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public class InstagramAppUpgradeEventReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A01 = C0f9.A01(-760917670);
        C0fM.A01(this, context, intent);
        C226218q.A01(AbstractC12960li.A00).A0L(FWU.A00(intent), C05F.A1F);
        C3JG.A02(C05F.A0N);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        if ((A0F instanceof UserSession) && Build.VERSION.SDK_INT >= 29) {
            UserSession userSession = (UserSession) A0F;
            if (C18U.A06(C06090Tz.A05, userSession, 36318368009033845L)) {
                C154676xH.A00(AbstractC12290kX.A00, userSession).A02();
            }
        }
        C0f9.A0E(-600165217, A01, intent);
    }
}
