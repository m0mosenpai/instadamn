package X;

import com.facebook.perf.background.BackgroundStartupDetector;
import java.util.Iterator;

/* renamed from: X.0Uj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06190Uj {
    public static final void A00(boolean z) {
        String str;
        Boolean bool = BackgroundStartupDetector.A0G;
        Boolean valueOf = Boolean.valueOf(z);
        if (!C14360o3.A0K(bool, valueOf)) {
            String str2 = BackgroundStartupDetector.A09;
            if (z) {
                str = "BACKGROUND";
            } else {
                str = "FOREGROUND";
            }
            C0K8.A0P(str2, "bgMode=%s", str);
            BackgroundStartupDetector.A0G = valueOf;
            InterfaceC06210Ul interfaceC06210Ul = BackgroundStartupDetector.A07;
            if (interfaceC06210Ul != null) {
                Boolean bool2 = true;
                ((C24041Fy) interfaceC06210Ul).A00.m101lambda$new$0$cominstagramservicetigonIGTigonService(bool2.equals(BackgroundStartupDetector.A0G));
            }
            InterfaceC06220Um interfaceC06220Um = BackgroundStartupDetector.A08;
            if (interfaceC06220Um != null) {
                interfaceC06220Um.DN9(BackgroundStartupDetector.A0G);
            }
            Iterator it = BackgroundStartupDetector.A0C.iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                ((InterfaceC06220Um) it.next()).DN9(BackgroundStartupDetector.A0G);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r5 == 4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(int r5) {
        /*
            r4 = this;
            java.lang.String r1 = "BackgroundStartupDetector.setColdStartMode"
            r0 = 366254287(0x15d498cf, float:8.586721E-26)
            X.AbstractC09780fb.A01(r1, r0)
            java.lang.Class<com.facebook.perf.background.BackgroundStartupDetector> r3 = com.facebook.perf.background.BackgroundStartupDetector.class
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L8d
            com.facebook.perf.background.BackgroundStartupDetector.A0D = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = com.facebook.perf.background.BackgroundStartupDetector.A09     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "coldStartMode=%s"
            r0 = 1
            if (r5 == r0) goto L20
            r0 = 2
            if (r5 == r0) goto L1d
            r0 = 3
            if (r5 == r0) goto L23
            java.lang.String r0 = "PROBABLY_FOREGROUND"
            goto L25
        L1d:
            java.lang.String r0 = "PROBABLY_BACKGROUND"
            goto L25
        L20:
            java.lang.String r0 = "DEFINITELY_BACKGROUND"
            goto L25
        L23:
            java.lang.String r0 = "DEFINITELY_FOREGROUND"
        L25:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L8a
            X.C0K8.A0P(r2, r1, r0)     // Catch: java.lang.Throwable -> L8a
            java.util.ArrayList r1 = com.facebook.perf.background.BackgroundStartupDetector.A0A     // Catch: java.lang.Throwable -> L8a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8a
            r0.<init>()     // Catch: java.lang.Throwable -> L8a
            com.facebook.perf.background.BackgroundStartupDetector.A0A = r0     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8d
            X.C14360o3.A07(r1)     // Catch: java.lang.Throwable -> L8d
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L53
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L8d
            X.C14360o3.A07(r0)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = "onColdStartMode"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8d
            goto L8c
        L53:
            X.0Um r2 = com.facebook.perf.background.BackgroundStartupDetector.A08     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L62
            r0 = 3
            if (r5 == r0) goto L5e
            r1 = 4
            r0 = 0
            if (r5 != r1) goto L5f
        L5e:
            r0 = 1
        L5f:
            r2.D5i(r5, r0)     // Catch: java.lang.Throwable -> L8d
        L62:
            java.util.concurrent.CopyOnWriteArraySet r0 = com.facebook.perf.background.BackgroundStartupDetector.A0C     // Catch: java.lang.Throwable -> L8d
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L8d
            X.C14360o3.A07(r3)     // Catch: java.lang.Throwable -> L8d
        L6b:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L83
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L8d
            X.0Um r2 = (X.InterfaceC06220Um) r2     // Catch: java.lang.Throwable -> L8d
            r0 = 3
            if (r5 == r0) goto L7e
            r1 = 4
            r0 = 0
            if (r5 != r1) goto L7f
        L7e:
            r0 = 1
        L7f:
            r2.D5i(r5, r0)     // Catch: java.lang.Throwable -> L8d
            goto L6b
        L83:
            r0 = -134523289(0xfffffffff7fb5667, float:-1.01954606E34)
            X.AbstractC09780fb.A00(r0)
            return
        L8a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8d
        L8c:
            throw r0     // Catch: java.lang.Throwable -> L8d
        L8d:
            r1 = move-exception
            r0 = -838296411(0xffffffffce089ca5, float:-5.729918E8)
            X.AbstractC09780fb.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06190Uj.A01(int):void");
    }
}
