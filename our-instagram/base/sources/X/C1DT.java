package X;

import android.telephony.ServiceState;
import android.telephony.TelephonyCallback;

/* renamed from: X.1DT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DT extends TelephonyCallback implements TelephonyCallback.ServiceStateListener {
    public final /* synthetic */ C23441Cg A00;

    public /* synthetic */ C1DT(C23441Cg c23441Cg) {
        this.A00 = c23441Cg;
    }

    @Override // android.telephony.TelephonyCallback.ServiceStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        C23441Cg.A0M(serviceState, this.A00);
    }
}
