package X;

import android.telephony.TelephonyCallback;

/* renamed from: X.Q3v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58706Q3v extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final C63176Seb A00;

    public C58706Q3v(C63176Seb c63176Seb) {
        this.A00 = c63176Seb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r3 == 5) goto L8;
     */
    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo r5) {
        /*
            r4 = this;
            int r3 = r5.getOverrideNetworkType()
            r2 = 5
            r0 = 3
            if (r3 == r0) goto Le
            r0 = 4
            if (r3 == r0) goto Le
            r1 = 0
            if (r3 != r2) goto Lf
        Le:
            r1 = 1
        Lf:
            X.Seb r0 = r4.A00
            if (r1 == 0) goto L15
            r2 = 10
        L15:
            X.C63176Seb.A01(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58706Q3v.onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo):void");
    }
}
