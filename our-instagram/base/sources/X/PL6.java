package X;

import android.telephony.PhoneStateListener;

/* loaded from: classes9.dex */
public final class PL6 implements Runnable {
    public final /* synthetic */ N09 A00;

    public PL6(N09 n09) {
        this.A00 = n09;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            N09 n09 = this.A00;
            C23411Cd c23411Cd = (C23411Cd) n09.A0B.getValue();
            if (c23411Cd != null) {
                PhoneStateListener phoneStateListener = n09.A00;
                if (phoneStateListener == null) {
                    phoneStateListener = new C50759MbQ(n09);
                    n09.A00 = phoneStateListener;
                }
                c23411Cd.A07(phoneStateListener, 32);
            }
        } catch (IllegalStateException e) {
            C53738Npq c53738Npq = this.A00.A0A;
            if (c53738Npq instanceof N0A) {
                if (C18U.A06(C06090Tz.A05, ((N0A) c53738Npq).A00, 36329788327084569L)) {
                    return;
                } else {
                    throw e;
                }
            }
            throw C00O.createAndThrow();
        }
    }
}