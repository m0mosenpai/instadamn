package com.instagram.debug.devoptions.debughead.data.provider;

import X.AbstractC166987dD;
import X.AnonymousClass153;
import X.C006802i;
import X.InterfaceC219914z;
import com.instagram.debug.devoptions.debughead.data.delegates.MobileBoostDelegate;
import java.util.Map;

/* loaded from: classes4.dex */
public class MobileBoostOptimizationHelper implements AnonymousClass153 {
    public MobileBoostDelegate mDelegate;
    public Map mOptBoosters = AbstractC166987dD.A1G();
    public final C006802i mLogger = C006802i.A0p;

    @Override // X.AnonymousClass153
    public void onPostReleaseBoost(InterfaceC219914z interfaceC219914z, int i, boolean z) {
    }

    public void onPreRequestBoost(InterfaceC219914z interfaceC219914z, int i) {
    }

    public void onRequestRejected(InterfaceC219914z interfaceC219914z, int i) {
    }

    @Override // X.AnonymousClass153
    public void onPostRequestBoost(InterfaceC219914z interfaceC219914z, boolean z, int i) {
        if (z) {
            this.mDelegate.onBoostRequested(interfaceC219914z.AhK());
        }
    }

    @Override // X.AnonymousClass153
    public void onPreReleaseBoost(InterfaceC219914z interfaceC219914z, int i, boolean z) {
        this.mDelegate.onBoostReleased(interfaceC219914z.AhK());
    }

    public void startTestBoosts() {
        this.mLogger.markerStart(27328514);
    }

    public void stopTestBoosts() {
        this.mLogger.markerEnd(27328514, (short) 2);
    }

    public MobileBoostOptimizationHelper(MobileBoostDelegate mobileBoostDelegate) {
        this.mDelegate = mobileBoostDelegate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r2 == X.C219714x.A00) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMobileBoostInit(X.C1J4 r9) {
        /*
            r8 = this;
            java.util.HashMap r4 = X.AbstractC166987dD.A1G()
            int[] r5 = r9.A04
            r3 = 0
        L7:
            int r0 = r5.length
            if (r3 >= r0) goto L84
            r0 = r5[r3]
            X.1JB r6 = r9.A07(r0)
            java.util.List r2 = r6.A07
            java.util.Iterator r1 = r2.iterator()
        L16:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r1.next()
            X.95s r0 = (X.C2050395s) r0
            X.14z r0 = X.C1JB.A00(r6, r0)
            r0.EDO(r8)
            goto L16
        L2a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            java.util.ArrayList r0 = X.AbstractC166987dD.A1F(r2)
            java.util.Iterator r7 = r0.iterator()
        L37:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r6 = r7.next()
            X.95s r6 = (X.C2050395s) r6
            X.14z r2 = r6.A00
            if (r2 == 0) goto L4c
            X.14x r0 = X.C219714x.A00
            r1 = 1
            if (r2 != r0) goto L4d
        L4c:
            r1 = 0
        L4d:
            int r0 = r6.A04
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r4.put(r2, r0)
            java.util.Map r0 = r8.mOptBoosters
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L6b
            java.util.Map r1 = r8.mOptBoosters
            java.util.HashSet r0 = X.AbstractC166987dD.A1H()
            r1.put(r2, r0)
        L6b:
            java.util.Map r0 = r8.mOptBoosters
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L37
            java.util.Map r0 = r8.mOptBoosters
            java.lang.Object r1 = r0.get(r2)
            java.util.Set r1 = (java.util.Set) r1
            X.14z r0 = r6.A00
            r1.add(r0)
            goto L37
        L81:
            int r3 = r3 + 1
            goto L7
        L84:
            com.instagram.debug.devoptions.debughead.data.delegates.MobileBoostDelegate r0 = r8.mDelegate
            r0.onMobileBoostInit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.debughead.data.provider.MobileBoostOptimizationHelper.onMobileBoostInit(X.1J4):void");
    }
}
