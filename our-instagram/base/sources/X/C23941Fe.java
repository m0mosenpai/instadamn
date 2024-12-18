package X;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: X.1Fe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23941Fe extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final /* synthetic */ C23441Cg A00;

    public /* synthetic */ C23941Fe(C23441Cg c23441Cg) {
        this.A00 = c23441Cg;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        this.A00.A0O(telephonyDisplayInfo);
    }
}
