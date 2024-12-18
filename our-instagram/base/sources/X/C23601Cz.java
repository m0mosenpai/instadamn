package X;

import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;

/* renamed from: X.1Cz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23601Cz extends TelephonyCallback implements TelephonyCallback.SignalStrengthsListener {
    public final /* synthetic */ C23441Cg A00;

    public /* synthetic */ C23601Cz(C23441Cg c23441Cg) {
        this.A00 = c23441Cg;
    }

    @Override // android.telephony.TelephonyCallback.SignalStrengthsListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        C23441Cg.A0N(signalStrength, this.A00);
    }
}
