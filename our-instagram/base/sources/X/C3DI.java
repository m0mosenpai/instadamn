package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.3DI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3DI {
    public C3DJ A00;
    public final C3DK A01;

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ae, code lost:
    
        if (r2.A00 > 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r5.isHidden() != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r9 = this;
            java.lang.String r1 = "FragmentVisibilityDetector.updateSelfVisibility"
            r0 = -352243033(0xffffffffeb0132a7, float:-1.5619063E26)
            X.AbstractC09800fd.A01(r1, r0)
            X.3DK r7 = r9.A01     // Catch: java.lang.Throwable -> Lbd
            boolean r6 = r7.A02     // Catch: java.lang.Throwable -> Lbd
            androidx.fragment.app.Fragment r5 = r7.A04     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r5.isResumed()     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L1f
            boolean r0 = r5.mUserVisibleHint     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L1f
            boolean r1 = r5.isHidden()     // Catch: java.lang.Throwable -> Lbd
            r0 = 1
            if (r1 == 0) goto L20
        L1f:
            r0 = 0
        L20:
            r7.A02 = r0     // Catch: java.lang.Throwable -> Lbd
            if (r0 == r6) goto Lb6
            X.C3DK.A01(r7)     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r5 instanceof X.AbstractC72463Mt     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L7b
            androidx.fragment.app.Fragment r0 = r5.mParentFragment     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L39
            java.util.List r3 = X.AbstractC72493Mw.A00(r0)     // Catch: java.lang.Throwable -> Lbd
        L33:
            int r8 = r3.size()     // Catch: java.lang.Throwable -> Lbd
            r4 = 0
            goto L52
        L39:
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L4d
            X.0h2 r0 = r0.getSupportFragmentManager()     // Catch: java.lang.Throwable -> Lbd
            X.06g r0 = r0.A0U     // Catch: java.lang.Throwable -> Lbd
            java.util.List r3 = r0.A04()     // Catch: java.lang.Throwable -> Lbd
        L49:
            X.C14360o3.A07(r3)     // Catch: java.lang.Throwable -> Lbd
            goto L33
        L4d:
            java.util.List r3 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lbd
            goto L49
        L52:
            if (r4 >= r8) goto L7b
            java.lang.Object r1 = r3.get(r4)     // Catch: java.lang.Throwable -> Lbd
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1     // Catch: java.lang.Throwable -> Lbd
            if (r1 == r5) goto L78
            boolean r0 = r1 instanceof X.InterfaceC60002oi     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L78
            X.2oi r1 = (X.InterfaceC60002oi) r1     // Catch: java.lang.Throwable -> Lbd
            X.3DI r1 = r1.getFragmentVisibilityDetector()     // Catch: java.lang.Throwable -> Lbd
            if (r1 == 0) goto L78
            boolean r0 = r7.A02     // Catch: java.lang.Throwable -> Lbd
            r2 = -1
            if (r0 == 0) goto L6e
            r2 = 1
        L6e:
            X.3DK r1 = r1.A01     // Catch: java.lang.Throwable -> Lbd
            int r0 = r1.A00     // Catch: java.lang.Throwable -> Lbd
            int r0 = r0 + r2
            r1.A00 = r0     // Catch: java.lang.Throwable -> Lbd
            X.C3DK.A01(r1)     // Catch: java.lang.Throwable -> Lbd
        L78:
            int r4 = r4 + 1
            goto L52
        L7b:
            if (r6 == 0) goto Lb6
            boolean r0 = r7.A02     // Catch: java.lang.Throwable -> Lbd
            if (r0 != 0) goto Lb6
            androidx.fragment.app.Fragment r1 = r5.mParentFragment     // Catch: java.lang.Throwable -> Lbd
            if (r1 == 0) goto Lb6
            boolean r0 = r1.isResumed()     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto Lb6
            java.util.List r0 = X.AbstractC72493Mw.A00(r1)     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto Lb6
            boolean r0 = r1 instanceof X.InterfaceC60002oi     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto Lb6
            X.2oi r1 = (X.InterfaceC60002oi) r1     // Catch: java.lang.Throwable -> Lbd
            X.3DI r0 = r1.getFragmentVisibilityDetector()     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto Lb6
            X.3DK r2 = r0.A01     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r2.A02     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto Lb0
            boolean r0 = r2.A01     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto Lb0
            int r1 = r2.A00     // Catch: java.lang.Throwable -> Lbd
            r0 = 1
            if (r1 <= 0) goto Lb1
        Lb0:
            r0 = 0
        Lb1:
            r2.A03 = r0     // Catch: java.lang.Throwable -> Lbd
            X.C3DK.A00(r2)     // Catch: java.lang.Throwable -> Lbd
        Lb6:
            r0 = -1635909390(0xffffffff9e7e00f2, float:-1.34468435E-20)
            X.AbstractC09800fd.A00(r0)
            return
        Lbd:
            r1 = move-exception
            r0 = 1961872970(0x74efce4a, float:1.5199499E32)
            X.AbstractC09800fd.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3DI.A00():void");
    }

    public final void A01(InterfaceC55792hK interfaceC55792hK) {
        java.util.Set set = this.A00.A00;
        synchronized (set) {
            set.add(interfaceC55792hK);
        }
    }

    public C3DI(Fragment fragment) {
        C3DJ c3dj = new C3DJ();
        this.A00 = c3dj;
        this.A01 = new C3DK(fragment, c3dj);
    }
}
