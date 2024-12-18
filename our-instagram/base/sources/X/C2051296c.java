package X;

import com.facebook.common.classmarkers.ClassMarkerLoader;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executors;

/* renamed from: X.96c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2051296c extends AbstractC219814y {
    public static final C2051596f A05 = new C2051596f(Executors.newSingleThreadExecutor());
    public long A00;
    public String A01;
    public String A02;
    public boolean A03 = false;
    public final InterfaceC2049495d A04;

    @Override // X.AbstractC219814y
    public final void A04() {
    }

    @Override // X.AbstractC219814y, X.InterfaceC219914z
    public final int AhK() {
        return 7;
    }

    @Override // X.AbstractC219814y
    public final C2050695w A02(int i, int i2) {
        String str;
        if (this.A02 == null || (str = this.A01) == null) {
            return null;
        }
        C2050695w c2050695w = new C2050695w();
        Map map = c2050695w.A02;
        map.put("classpreload_list", str);
        map.put("classpreload_status", this.A02);
        c2050695w.A01.put("classpreload_duration", Long.valueOf(this.A00));
        this.A02 = null;
        this.A00 = 0L;
        this.A01 = null;
        return c2050695w;
    }

    @Override // X.AbstractC219814y
    public final boolean A05() {
        boolean z;
        final InterfaceC2049495d interfaceC2049495d = this.A04;
        if (interfaceC2049495d != null) {
            final C2051596f c2051596f = A05;
            if (!C0GH.A00 && !this.A03) {
                this.A03 = true;
                if (C0GH.A00) {
                    return true;
                }
                HashSet hashSet = c2051596f.A00;
                synchronized (hashSet) {
                    z = false;
                    if (!hashSet.add(interfaceC2049495d.getClass())) {
                        z = true;
                    }
                }
                ClassMarkerLoader.loadIsClassPreloadRunMarker();
                if (z) {
                    return true;
                }
                c2051596f.A01.execute(new Runnable() { // from class: X.9Ge
                    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[Catch: Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e, Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e, Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e, TryCatch #1 {Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e, blocks: (B:3:0x002a, B:6:0x0037, B:7:0x003a, B:10:0x0050, B:10:0x0050, B:10:0x0050, B:13:0x0063, B:13:0x0063, B:13:0x0063, B:14:0x0066, B:14:0x0066, B:14:0x0066, B:17:0x005c, B:17:0x005c, B:17:0x005c, B:22:0x0077, B:22:0x0077, B:22:0x0077, B:23:0x007d, B:23:0x007d, B:23:0x007d, B:24:0x0043), top: B:2:0x002a }] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            r8 = this;
                            X.95d r5 = r2
                            java.lang.Class r1 = r5.getClass()
                            r0 = 0
                            X.C14360o3.A0B(r1, r0)
                            java.lang.String r2 = r1.getName()
                            int r0 = r2.length()
                            int r0 = r0 + 11
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>(r0)
                            java.lang.String r0 = "<cls>"
                            r1.append(r0)
                            r1.append(r2)
                            java.lang.String r0 = "</cls>"
                            r1.append(r0)
                            java.lang.String r4 = X.AbstractC166987dD.A19(r1)
                            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L7e
                            boolean r2 = r5 instanceof com.facebook.mobileboost.boosters.instagram.classpreload.DirectThreadClassPreloader     // Catch: java.lang.Throwable -> L7e
                            if (r2 == 0) goto L43
                            java.lang.String r1 = "DirectThreadClassPreloader.preload"
                            r0 = 75497134(0x47ffeae, float:3.009205E-36)
                        L37:
                            X.C0fO.A01(r1, r0)     // Catch: java.lang.Throwable -> L7e
                        L3a:
                            java.lang.String r1 = "StartPreloading.%s"
                            r0 = 1708478000(0x65d54e30, float:1.259133E23)
                            X.AbstractC09800fd.A03(r1, r4, r0)     // Catch: java.lang.Throwable -> L7e
                            goto L4d
                        L43:
                            boolean r0 = r5 instanceof com.facebook.mobileboost.boosters.instagram.classpreload.DirectInboxClassPreloader     // Catch: java.lang.Throwable -> L7e
                            if (r0 == 0) goto L3a
                            java.lang.String r1 = "DirectInboxClassPreloader.preload"
                            r0 = -22038212(0xfffffffffeafb93c, float:-1.1678835E38)
                            goto L37
                        L4d:
                            r5.preloadClasses()     // Catch: java.lang.Throwable -> L76
                            r0 = 1282914044(0x4c77b6fc, float:6.4936944E7)
                            X.AbstractC09800fd.A00(r0)     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
                            if (r2 == 0) goto L5c
                            r0 = -1688727988(0xffffffff9b580e4c, float:-1.7871721E-22)
                            goto L63
                        L5c:
                            boolean r0 = r5 instanceof com.facebook.mobileboost.boosters.instagram.classpreload.DirectInboxClassPreloader     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
                            if (r0 == 0) goto L66
                            r0 = -298613061(0xffffffffee3386bb, float:-1.3890174E28)
                        L63:
                            X.C0fO.A00(r0)     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
                        L66:
                            X.96c r3 = r3     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
                            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
                            long r1 = r1 - r6
                            java.lang.String r0 = "Succeeded"
                            r3.A01 = r4     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
                            r3.A00 = r1     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
                            r3.A02 = r0     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
                            return
                        L76:
                            r1 = move-exception
                            r0 = 197871819(0xbcb48cb, float:7.830228E-32)
                            X.AbstractC09800fd.A00(r0)     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
                            throw r1     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
                        L7e:
                            r1 = move-exception
                            boolean r0 = r5 instanceof com.facebook.mobileboost.boosters.instagram.classpreload.DirectThreadClassPreloader
                            if (r0 == 0) goto L9a
                            r0 = 1309927893(0x4e13e9d5, float:6.203938E8)
                        L86:
                            X.C0fO.A00(r0)
                        L89:
                            X.96c r3 = r3
                            java.lang.String r0 = "Failed : "
                            java.lang.String r2 = X.AbstractC166997dE.A0y(r0, r1)
                            r0 = 0
                            r3.A01 = r4
                            r3.A00 = r0
                            r3.A02 = r2
                            return
                        L9a:
                            boolean r0 = r5 instanceof com.facebook.mobileboost.boosters.instagram.classpreload.DirectInboxClassPreloader
                            if (r0 == 0) goto L89
                            r0 = -1639263567(0xffffffff9e4ad2b1, float:-1.0737361E-20)
                            goto L86
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC207519Ge.run():void");
                    }
                });
                return true;
            }
        }
        return false;
    }

    public C2051296c(InterfaceC2049495d interfaceC2049495d) {
        this.A04 = interfaceC2049495d;
    }
}
