package X;

import androidx.fragment.app.Fragment;
import java.util.Iterator;

/* renamed from: X.3DK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3DK {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Fragment A04;
    public final C3DJ A05;

    public static final void A00(C3DK c3dk) {
        C3DJ c3dj = c3dk.A05;
        Fragment fragment = c3dk.A04;
        boolean z = c3dk.A03;
        java.util.Set set = c3dj.A00;
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((InterfaceC55792hK) it.next()).DIC(fragment, z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r6.A00 > 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C3DK r6) {
        /*
            boolean r2 = r6.A03
            boolean r0 = r6.A02
            if (r0 == 0) goto Lf
            boolean r0 = r6.A01
            if (r0 == 0) goto Lf
            int r1 = r6.A00
            r0 = 1
            if (r1 <= 0) goto L10
        Lf:
            r0 = 0
        L10:
            r6.A03 = r0
            if (r0 == r2) goto L46
            androidx.fragment.app.Fragment r0 = r6.A04
            java.util.List r5 = X.AbstractC72493Mw.A00(r0)
            int r4 = r5.size()
            r3 = 0
        L1f:
            if (r3 >= r4) goto L43
            java.lang.Object r1 = r5.get(r3)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r0 = r1 instanceof X.InterfaceC60002oi
            if (r0 == 0) goto L40
            X.2oi r1 = (X.InterfaceC60002oi) r1
            X.3DI r0 = r1.getFragmentVisibilityDetector()
            if (r0 == 0) goto L40
            boolean r2 = r6.A03
            X.3DK r1 = r0.A01
            boolean r0 = r1.A01
            if (r0 == r2) goto L40
            r1.A01 = r2
            A01(r1)
        L40:
            int r3 = r3 + 1
            goto L1f
        L43:
            A00(r6)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3DK.A01(X.3DK):void");
    }

    public C3DK(Fragment fragment, C3DJ c3dj) {
        C3DI fragmentVisibilityDetector;
        this.A04 = fragment;
        InterfaceC08430c6 interfaceC08430c6 = fragment.mParentFragment;
        boolean z = true;
        if ((interfaceC08430c6 instanceof InterfaceC60002oi) && ((fragmentVisibilityDetector = ((InterfaceC60002oi) interfaceC08430c6).getFragmentVisibilityDetector()) == null || !fragmentVisibilityDetector.A01.A03)) {
            z = false;
        }
        this.A01 = z;
        this.A05 = c3dj;
    }
}
