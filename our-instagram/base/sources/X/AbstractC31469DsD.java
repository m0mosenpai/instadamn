package X;

/* renamed from: X.DsD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31469DsD implements C07W {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0040, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x0010, B:15:0x0029, B:17:0x002d, B:19:0x0031, B:24:0x0014), top: B:3:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01() {
        /*
            r3 = this;
            r2 = r3
            X.EVa r2 = (X.C32550EVa) r2
            monitor-enter(r2)
            X.07X r1 = r2.A02     // Catch: java.lang.Throwable -> L40
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1     // Catch: java.lang.Throwable -> L40
            android.view.View r0 = r1.mView     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L23
            X.07X r1 = r1.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> L40
        L14:
            X.07T r0 = r1.getLifecycle()     // Catch: java.lang.Throwable -> L40
            X.07S r1 = r0.A07()     // Catch: java.lang.Throwable -> L40
            X.07S r0 = X.C07S.INITIALIZED     // Catch: java.lang.Throwable -> L40
            boolean r0 = r1.A00(r0)     // Catch: java.lang.Throwable -> L40
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 != 0) goto L29
            r0 = 0
            monitor-exit(r2)
            return r0
        L29:
            java.lang.Object r0 = r2.A00     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L3c
            boolean r0 = r2.A01     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L3c
            X.0sZ r0 = r2.A03     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L40
            r2.A00 = r0     // Catch: java.lang.Throwable -> L40
            r0 = 0
            r2.A01 = r0     // Catch: java.lang.Throwable -> L40
        L3c:
            monitor-exit(r2)
            java.lang.Object r0 = r2.A00
            return r0
        L40:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC31469DsD.A01():java.lang.Object");
    }

    public final void A03() {
        ((C32550EVa) this).A01 = true;
    }

    public final Object A02() {
        boolean z = this instanceof KFH;
        Object A01 = A01();
        if (z && A01 == null) {
            throw AbstractC166987dD.A14("NotNullLazyAutoCleanup: accessing value after it is cleaned up");
        }
        return A01;
    }

    public static Object A00(AbstractC31469DsD abstractC31469DsD) {
        return abstractC31469DsD.A02();
    }
}
