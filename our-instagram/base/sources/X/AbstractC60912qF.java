package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.2qF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC60912qF {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        if (r3.equals(r1) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.fragment.app.Fragment A00(androidx.fragment.app.Fragment r8, X.AbstractC12990ll r9) {
        /*
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            r6 = 1
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36329638003229136(0x81119d000041d0, double:3.0383475887279205E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            if (r0 == 0) goto Lba
            r0 = 36892587956831176(0x83119d000303c8, double:3.394359406203366E-306)
            java.lang.String r3 = X.C18U.A04(r2, r9, r0)
            java.lang.Class r7 = r8.getClass()
            java.lang.String r5 = r7.getSimpleName()
            boolean r0 = r3.equals(r5)
            if (r0 != 0) goto L3d
            boolean r0 = r8 instanceof X.InterfaceC11380iw     // Catch: java.lang.Exception -> Lba
            r1 = 0
            if (r0 == 0) goto L37
            r0 = r8
            X.0iw r0 = (X.InterfaceC11380iw) r0     // Catch: java.lang.Exception -> Lba
            if (r0 == 0) goto L37
            java.lang.String r1 = r0.getModuleName()     // Catch: java.lang.Exception -> Lba
        L37:
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto Lba
        L3d:
            r0 = 36611112980060417(0x82119d00021901, double:3.2163534974847804E-306)
            long r0 = X.C18U.A01(r2, r9, r0)
            int r4 = (int) r0
            X.2Ut r3 = X.AbstractC50712Us.A00
            r1 = 100
            X.17u r0 = new X.17u
            r0.<init>(r6, r1)
            int r0 = X.AbstractC172607mU.A00(r3, r0)
            if (r0 > r4) goto Lba
            X.2pe r4 = new X.2pe
            r4.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "ClipsViewerFragment"
            boolean r0 = X.C14360o3.A0K(r5, r0)
            if (r0 != 0) goto Lb4
            r0 = 679(0x2a7, float:9.51E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = X.C14360o3.A0K(r5, r0)
            if (r0 != 0) goto Lb4
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L79:
            int r5 = (int) r0
            java.lang.String r0 = "background_color"
            r3.putInt(r0, r5)
            java.lang.String r1 = r7.getName()
            java.lang.String r0 = "wrapped_fragment_class"
            r3.putString(r0, r1)
            android.os.Bundle r1 = r8.mArguments
            java.lang.String r0 = "wrapped_fragment_args"
            r3.putBundle(r0, r1)
            boolean r0 = r8.isStateSaved()
            if (r0 == 0) goto La2
            X.0h2 r0 = r8.getParentFragmentManager()
            androidx.fragment.app.Fragment$SavedState r1 = r0.A0N(r8)
            java.lang.String r0 = "wrapped_fragment_state"
            r3.putParcelable(r0, r1)
        La2:
            r0 = 36611112979994880(0x82119d00011900, double:3.2163534974433345E-306)
            long r1 = X.C18U.A01(r2, r9, r0)
            java.lang.String r0 = "delay_ms"
            r3.putLong(r0, r1)
            r4.setArguments(r3)
            return r4
        Lb4:
            r0 = 4278190080(0xff000000, double:2.113706745E-314)
            goto L79
        Lba:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC60912qF.A00(androidx.fragment.app.Fragment, X.0ll):androidx.fragment.app.Fragment");
    }

    public static final void A01(AbstractC12990ll abstractC12990ll, Long l, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        Long l2;
        long j;
        C14360o3.A0B(abstractC12990ll, 0);
        if (z) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (AbstractC172607mU.A00(AbstractC50712Us.A00, new C17u(1, 100)) <= ((int) C18U.A01(c06090Tz, abstractC12990ll, 36611112980060417L))) {
                long currentTimeMillis = System.currentTimeMillis();
                if (l != null) {
                    j = currentTimeMillis - l.longValue();
                } else {
                    j = 0;
                }
                long A01 = C18U.A01(c06090Tz, abstractC12990ll, 36611112979994880L) - Math.max(j, 0L);
                if (A01 > 0) {
                    if (interfaceC16820sZ != null) {
                        interfaceC16820sZ.invoke();
                    }
                    Looper myLooper = Looper.myLooper();
                    if (myLooper != null) {
                        new Handler(myLooper).postDelayed(new RunnableC24711Aws(interfaceC16660sJ, currentTimeMillis), A01);
                        return;
                    }
                    throw new IllegalStateException("Trying to delay an action from a thread without a looper");
                }
                l2 = Long.valueOf(currentTimeMillis);
                interfaceC16660sJ.invoke(l2);
            }
        }
        l2 = null;
        interfaceC16660sJ.invoke(l2);
    }
}
