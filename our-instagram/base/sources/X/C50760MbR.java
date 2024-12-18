package X;

import android.telephony.PhoneStateListener;

/* renamed from: X.MbR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50760MbR extends PhoneStateListener {
    public final InterfaceC57909PmE A00;

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        if (i == 2) {
            this.A00.Cwr();
        }
    }

    public C50760MbR(InterfaceC57909PmE interfaceC57909PmE) {
        this.A00 = interfaceC57909PmE;
    }
}
