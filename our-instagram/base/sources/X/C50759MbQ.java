package X;

import android.telephony.PhoneStateListener;

/* renamed from: X.MbQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50759MbQ extends PhoneStateListener {
    public final /* synthetic */ N09 A00;

    public C50759MbQ(N09 n09) {
        this.A00 = n09;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r2 == 2) goto L18;
     */
    @Override // android.telephony.PhoneStateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCallStateChanged(int r5, java.lang.String r6) {
        /*
            r4 = this;
            X.N09 r3 = r4.A00
            X.Op8 r2 = r3.audioManagerQplLogger
            java.lang.String r0 = "state="
            java.lang.String r1 = X.AnonymousClass001.A0O(r0, r5)
            java.lang.String r0 = "on_call_state_changed"
            r2.Cnc(r0, r1)
            r2 = 0
            if (r5 == 0) goto L19
            r1 = 1
            if (r5 == r1) goto L25
            r0 = 2
            if (r5 == r0) goto L22
        L18:
            return
        L19:
            boolean r0 = r3.A05
            if (r0 == 0) goto L18
            X.NhG r0 = X.EnumC53278NhG.A02
            r3.A08(r0)
        L22:
            r3.A05 = r2
            return
        L25:
            X.OZk r0 = r3.A09
            X.ObB r0 = r0.A05
            int r2 = r0.A00
            if (r2 == r1) goto L31
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L32
        L31:
            r0 = 1
        L32:
            r3.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50759MbQ.onCallStateChanged(int, java.lang.String):void");
    }
}
