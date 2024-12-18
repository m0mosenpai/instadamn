package androidx.work.impl.background.systemalarm;

import X.AbstractC58318PtA;
import X.C0f9;
import X.C2L1;
import X.C48442Kl;
import X.TQP;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    static {
        C48442Kl.A01("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        String str;
        int A04 = AbstractC58318PtA.A04(this, context, intent, -1517976881);
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            C48442Kl.A00();
        } else {
            C2L1.A00(context).A06.ATa(new TQP(goAsync(), context, intent, this));
        }
        C0f9.A0E(-1604123697, A04, intent);
    }
}
