package X;

import java.lang.ref.WeakReference;

/* renamed from: X.QEv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58885QEv extends AbstractC63223SfY implements BEG, InterfaceC65639Tq2, InterfaceC65638Tq1, InterfaceC65637Tq0 {
    public C62526SFc A00;
    public C63305ShB A01 = C63305ShB.A00();
    public WeakReference A02;
    public final C03250Di A03;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C58885QEv r17) {
        /*
            r4 = r17
            X.SFc r2 = r4.A00
            if (r2 == 0) goto L5d
            java.lang.String r8 = r2.A01
            X.7mh r5 = r4.A03
            r3 = 0
            if (r5 != 0) goto L17
            java.lang.ref.WeakReference r0 = r4.A02
            if (r0 == 0) goto L60
            java.lang.Object r5 = r0.get()
            X.7mh r5 = (X.InterfaceC172717mh) r5
        L17:
            if (r5 == 0) goto L61
            r0 = r5
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            X.ACq r1 = r0.A0e
            if (r1 == 0) goto L61
            long r14 = r2.A02
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = r2.A00
            X.0JM r0 = r1.A0m
            long r10 = r0.now()
            java.lang.String r7 = r1.A0Z
            com.facebook.iabeventlogging.model.IABHistoryDataWriterEvent r6 = new com.facebook.iabeventlogging.model.IABHistoryDataWriterEvent
            r12 = r10
            r6.<init>(r7, r8, r9, r10, r12, r14, r16)
        L36:
            if (r8 == 0) goto L5e
            android.net.Uri r0 = X.AbstractC58319PtB.A09(r8)
            if (r0 == 0) goto L5e
            boolean r1 = X.AbstractC63387Sj3.A05(r0)
        L42:
            if (r6 == 0) goto L5b
            java.lang.String r0 = r2.A01
            if (r0 == 0) goto L5b
            int r0 = r0.length()
            if (r0 <= 0) goto L5b
            if (r1 != 0) goto L5b
            X.ShB r2 = r4.A01
            com.facebook.browser.lite.BrowserLiteFragment r5 = (com.facebook.browser.lite.BrowserLiteFragment) r5
            android.os.Bundle r1 = r5.A09
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r5.A0f
            r2.A06(r1, r6, r0)
        L5b:
            r4.A00 = r3
        L5d:
            return
        L5e:
            r1 = 0
            goto L42
        L60:
            r5 = r3
        L61:
            r6 = r3
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58885QEv.A00(X.QEv):void");
    }

    @Override // X.AbstractC63223SfY, X.BCM
    public final void destroy() {
        this.A02 = AbstractC25225BEi.A16(super.A03);
        super.destroy();
    }

    public C58885QEv() {
        C03250Di c03250Di = C03250Di.A00;
        C14360o3.A07(c03250Di);
        this.A03 = c03250Di;
    }
}
