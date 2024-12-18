package X;

import android.app.KeyguardManager;

/* renamed from: X.Mab, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class KeyguardManagerKeyguardDismissCallbackC50733Mab extends KeyguardManager.KeyguardDismissCallback {
    public final /* synthetic */ NTY A00;

    public KeyguardManagerKeyguardDismissCallbackC50733Mab(NTY nty) {
        this.A00 = nty;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissCancelled() {
        NTY nty = this.A00;
        nty.A04 = null;
        nty.A05 = null;
        nty.A03 = null;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissError() {
        NTY nty = this.A00;
        nty.A04 = null;
        nty.A05 = null;
        nty.A03 = null;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        NTY nty = this.A00;
        C56656PDa c56656PDa = nty.A04;
        if (c56656PDa != null) {
            nty.A09.A05(c56656PDa);
        }
        C56657PDb c56657PDb = nty.A05;
        if (c56657PDb != null) {
            NTY.A02(nty, c56657PDb);
        }
        PDU pdu = nty.A03;
        if (pdu != null) {
            nty.A09.A05(pdu);
        }
    }
}
