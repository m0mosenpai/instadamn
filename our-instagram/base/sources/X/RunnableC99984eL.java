package X;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyDisplayInfo;
import java.util.List;

/* renamed from: X.4eL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC99984eL implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C23441Cg A01;

    public RunnableC99984eL(C23441Cg c23441Cg, int i) {
        this.A01 = c23441Cg;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23441Cg c23441Cg = this.A01;
        if (c23441Cg.A03 != null) {
            PhoneStateListener phoneStateListener = c23441Cg.A00;
            if (phoneStateListener == null) {
                phoneStateListener = new PhoneStateListener() { // from class: X.4eM
                    @Override // android.telephony.PhoneStateListener
                    public final void onCellInfoChanged(List list) {
                        C23441Cg.A0V(RunnableC99984eL.this.A01, list);
                    }

                    @Override // android.telephony.PhoneStateListener
                    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                        RunnableC99984eL.this.A01.A0O(telephonyDisplayInfo);
                    }

                    @Override // android.telephony.PhoneStateListener
                    public final void onServiceStateChanged(ServiceState serviceState) {
                        C23441Cg.A0M(serviceState, RunnableC99984eL.this.A01);
                    }

                    @Override // android.telephony.PhoneStateListener
                    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
                        C23441Cg.A0N(signalStrength, RunnableC99984eL.this.A01);
                    }
                };
                c23441Cg.A00 = phoneStateListener;
            }
            c23441Cg.A03.A07(phoneStateListener, this.A00);
        }
    }
}
