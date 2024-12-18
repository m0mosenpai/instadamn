package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class U3t implements InterfaceC72008XEw {
    public long A00;
    public long A01;
    public Integer A02;
    public String A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final U3s A07;
    public final C103284l3 A08;
    public final QuickPerformanceLogger A09;
    public final HashMap A0A;
    public final HashMap A0B;
    public final List A0C;
    public final List A0D;
    public final InterfaceC103334l8 A0E;
    public final InterfaceC103314l6 A0F;
    public final List A0G;
    public final AtomicBoolean A0H;
    public final AtomicBoolean A0I;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        if (A05() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        A00();
        A01();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void A02() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0I     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L12
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0H     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L12
            goto L3a
        L12:
            java.util.HashMap r0 = r3.A0B     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r2 = X.AbstractC167007dF.A0k(r0)     // Catch: java.lang.Throwable -> L3c
        L18:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L3c
            X.C14360o3.A07(r0)     // Catch: java.lang.Throwable -> L3c
            X.U4I r0 = (X.U4I) r0     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r1 = r0.A00     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r0 = X.C05F.A0N     // Catch: java.lang.Throwable -> L3c
            if (r1 == r0) goto L18
            goto L3a
        L2e:
            boolean r0 = r3.A05()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3a
            r3.A00()     // Catch: java.lang.Throwable -> L3c
            r3.A01()     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r3)
            return
        L3c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U3t.A02():void");
    }

    public static final synchronized void A04(U3t u3t, String str) {
        synchronized (u3t) {
            u3t.A09(str, (short) 3);
            if (u3t.A0B()) {
                u3t.A06(C05F.A0Y);
            }
            int i = u3t.A06;
            String A05 = AnonymousClass001.A05(i, "marker_id:", ",error:", str);
            String A0x = AnonymousClass001.A0x("marker_id:", ",instance_key:", ",error:", str, i, u3t.A05);
            u3t.A0F.EHA(AnonymousClass001.A0R("TTRCTrace|", String.valueOf(i)), A05, new Throwable(A0x));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00aa, code lost:
    
        if (r6 == X.C05F.A0Y) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized boolean A06(java.lang.Integer r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Integer r0 = r5.A07()     // Catch: java.lang.Throwable -> Lb2
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> Lb2
            r3 = 1
            r4 = 0
            if (r1 == r4) goto L57
            if (r1 == r3) goto L14
            r0 = 2
            if (r1 != r0) goto Lb0
            goto L9c
        L14:
            java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.Throwable -> Lb2
            if (r6 == r0) goto L2a
            java.lang.Integer r0 = X.C05F.A0j     // Catch: java.lang.Throwable -> Lb2
            if (r6 == r0) goto L2a
            java.lang.Integer r0 = X.C05F.A0u     // Catch: java.lang.Throwable -> Lb2
            if (r6 == r0) goto L2a
            java.lang.Integer r0 = X.C05F.A0Y     // Catch: java.lang.Throwable -> Lb2
            if (r6 == r0) goto L2a
            java.lang.Integer r0 = X.C05F.A0N     // Catch: java.lang.Throwable -> Lb2
            if (r6 != r0) goto Lb0
            goto Lac
        L2a:
            java.lang.String r1 = "cache_and_network_queries"
            java.util.List r0 = r5.A0C     // Catch: java.lang.Throwable -> Lb2
            java.lang.String[] r0 = X.AbstractC31173DnH.A1b(r0, r4)     // Catch: java.lang.Throwable -> Lb2
            r5.A0A(r1, r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = "network_only_queries"
            java.util.List r0 = r5.A0D     // Catch: java.lang.Throwable -> Lb2
            java.lang.String[] r0 = X.AbstractC31173DnH.A1b(r0, r4)     // Catch: java.lang.Throwable -> Lb2
            r5.A0A(r1, r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "steps"
            java.util.HashMap r0 = r5.A0A     // Catch: java.lang.Throwable -> Lb2
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> Lb2
            X.C14360o3.A07(r1)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Throwable -> Lb2
            r5.A0A(r2, r0)     // Catch: java.lang.Throwable -> Lb2
            goto Lac
        L57:
            java.lang.Integer r0 = X.C05F.A01     // Catch: java.lang.Throwable -> Lb2
            if (r6 == r0) goto Lac
            java.lang.Integer r0 = X.C05F.A0N     // Catch: java.lang.Throwable -> Lb2
            if (r6 == r0) goto Lac
            java.lang.Integer r0 = X.C05F.A0j     // Catch: java.lang.Throwable -> Lb2
            if (r6 == r0) goto Lac
            java.lang.Integer r0 = X.C05F.A0u     // Catch: java.lang.Throwable -> Lb2
            if (r6 == r0) goto Lac
            java.lang.Integer r0 = X.C05F.A0Y     // Catch: java.lang.Throwable -> Lb2
            if (r6 == r0) goto Lac
            java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.Throwable -> Lb2
            if (r6 != r0) goto Lb0
            java.lang.String r1 = "cache_and_network_queries"
            java.util.List r0 = r5.A0C     // Catch: java.lang.Throwable -> Lb2
            java.lang.String[] r0 = X.AbstractC31173DnH.A1b(r0, r4)     // Catch: java.lang.Throwable -> Lb2
            r5.A0A(r1, r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = "network_only_queries"
            java.util.List r0 = r5.A0D     // Catch: java.lang.Throwable -> Lb2
            java.lang.String[] r0 = X.AbstractC31173DnH.A1b(r0, r4)     // Catch: java.lang.Throwable -> Lb2
            r5.A0A(r1, r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "steps"
            java.util.HashMap r0 = r5.A0A     // Catch: java.lang.Throwable -> Lb2
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> Lb2
            X.C14360o3.A07(r1)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Throwable -> Lb2
            r5.A0A(r2, r0)     // Catch: java.lang.Throwable -> Lb2
            goto Lac
        L9c:
            java.lang.Integer r0 = X.C05F.A0N     // Catch: java.lang.Throwable -> Lb2
            if (r6 == r0) goto Lac
            java.lang.Integer r0 = X.C05F.A0j     // Catch: java.lang.Throwable -> Lb2
            if (r6 == r0) goto Lac
            java.lang.Integer r0 = X.C05F.A0u     // Catch: java.lang.Throwable -> Lb2
            if (r6 == r0) goto Lac
            java.lang.Integer r0 = X.C05F.A0Y     // Catch: java.lang.Throwable -> Lb2
            if (r6 != r0) goto Lb0
        Lac:
            r5.A02 = r6     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r5)
            return r3
        Lb0:
            monitor-exit(r5)
            return r4
        Lb2:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U3t.A06(java.lang.Integer):boolean");
    }

    public final synchronized Integer A07() {
        Integer num;
        num = this.A02;
        if (num == null) {
            C14360o3.A0F("traceState");
            throw C00O.createAndThrow();
        }
        return num;
    }

    public final synchronized void A08(String str, long j) {
        String str2;
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerPoint(i, i2, str, null, j, TimeUnit.MILLISECONDS);
        U3s u3s = this.A07;
        if (str == null) {
            str2 = "Unknown name";
        } else {
            str2 = str;
        }
        u3s.A06(i, i2, str2, j);
        this.A0G.add(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (A07() == X.C05F.A0C) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A0B() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Integer r1 = r3.A07()     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.Throwable -> L1d
            if (r1 == r0) goto L1a
            java.lang.Integer r1 = r3.A07()     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r0 = X.C05F.A01     // Catch: java.lang.Throwable -> L1d
            if (r1 == r0) goto L1a
            java.lang.Integer r2 = r3.A07()     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r1 = X.C05F.A0C     // Catch: java.lang.Throwable -> L1d
            r0 = 0
            if (r2 != r1) goto L1b
        L1a:
            r0 = 1
        L1b:
            monitor-exit(r3)
            return r0
        L1d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U3t.A0B():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (A06(r3) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A0C(java.lang.Integer r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Integer r0 = r2.A07()     // Catch: java.lang.Throwable -> L11
            if (r0 == r3) goto Le
            boolean r1 = r2.A06(r3)     // Catch: java.lang.Throwable -> L11
            r0 = 0
            if (r1 == 0) goto Lf
        Le:
            r0 = 1
        Lf:
            monitor-exit(r2)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U3t.A0C(java.lang.Integer):boolean");
    }

    @Override // X.InterfaceC72008XEw
    public final synchronized void AA2(String str, TimeUnit timeUnit, long j) {
        U4I u4i;
        C14360o3.A0B(timeUnit, 2);
        if (A0C(C05F.A01)) {
            HashMap hashMap = this.A0B;
            if (hashMap.containsKey(str)) {
                A04(this, AnonymousClass001.A0R("Attempted to Add Query Twice for: ", str));
            } else {
                if (j != -1) {
                    u4i = new U4I(this, str, timeUnit.toMillis(j));
                } else {
                    u4i = new U4I(this, str);
                }
                hashMap.put(str, u4i);
            }
        }
    }

    @Override // X.InterfaceC72008XEw
    public final synchronized void AAO(String str) {
        if (A0C(C05F.A01)) {
            HashMap hashMap = this.A0A;
            if (hashMap.containsKey(str)) {
                A04(this, AnonymousClass001.A0R("Attempted to Add Additional Step Twice for: ", str));
            } else {
                hashMap.put(str, new C66225U4v());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        if (r2 != 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        if (r3 != r5) goto L23;
     */
    @Override // X.InterfaceC72008XEw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void AF2(long r9, java.lang.String r11, boolean r12, long r13) {
        /*
            r8 = this;
            r7 = r8
            monitor-enter(r7)
            r6 = 0
            java.lang.Integer r5 = X.C05F.A0C     // Catch: java.lang.Throwable -> L77
            boolean r0 = r8.A0C(r5)     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L2d
            java.util.HashMap r0 = r8.A0B     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r0.get(r11)     // Catch: java.lang.Throwable -> L27
            X.U4I r4 = (X.U4I) r4     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L2d
            if (r12 == 0) goto L18
            goto L1a
        L18:
            r3 = r5
            goto L1c
        L1a:
            java.lang.Integer r3 = X.C05F.A0N     // Catch: java.lang.Throwable -> L77
        L1c:
            java.lang.Integer r0 = r4.A00     // Catch: java.lang.Throwable -> L77
            int r2 = r0.intValue()     // Catch: java.lang.Throwable -> L77
            r0 = 2
            r1 = 1
            if (r2 == r0) goto L31
            goto L29
        L27:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L77
        L29:
            if (r2 == r6) goto L2f
            if (r2 == r1) goto L31
        L2d:
            monitor-exit(r7)
            return
        L2f:
            if (r3 == r5) goto L36
        L31:
            java.lang.Integer r0 = X.C05F.A0N     // Catch: java.lang.Throwable -> L77
            if (r3 == r0) goto L36
            goto L2d
        L36:
            r4.A00 = r3     // Catch: java.lang.Throwable -> L77
            r5 = 0
            r4.A03 = r1     // Catch: java.lang.Throwable -> L77
            long r0 = r4.A04     // Catch: java.lang.Throwable -> L77
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L42
            r5 = 1
        L42:
            r4.A01 = r5     // Catch: java.lang.Throwable -> L77
            X.U3t r3 = r4.A06     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = "cache_was_recent_for_"
            java.lang.String r2 = r4.A05     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r2)     // Catch: java.lang.Throwable -> L77
            r0 = r5 ^ 1
            r3.CnU(r1, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = "cache_age_ms_for_"
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r2)     // Catch: java.lang.Throwable -> L77
            r3.CnS(r0, r9)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = "ttcc_for_"
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r2)     // Catch: java.lang.Throwable -> L77
            r3.A03 = r0     // Catch: java.lang.Throwable -> L77
            r3.A00 = r13     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L6b
            r3.A08(r0, r13)     // Catch: java.lang.Throwable -> L77
        L6b:
            r8.A03(r13)     // Catch: java.lang.Throwable -> L77
            if (r12 == 0) goto L2d
            r4.A00()     // Catch: java.lang.Throwable -> L77
            r8.A02()     // Catch: java.lang.Throwable -> L77
            goto L2d
        L77:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U3t.AF2(long, java.lang.String, boolean, long):void");
    }

    @Override // X.InterfaceC72008XEw
    public final synchronized void AUk(String str) {
        long now = this.A0E.now();
        if (A0B()) {
            A06(C05F.A0Y);
            A00();
            A09(str, (short) 3);
            EventBuilder level = this.A09.markEventBuilder(21364738, String.valueOf(this.A06)).annotate("duration", now - this.A01).setLevel(3);
            if (str != null) {
                level.annotate(DialogModule.KEY_MESSAGE, str);
            }
            level.report();
        }
    }

    @Override // X.InterfaceC72008XEw
    public final synchronized void Ch8(String str) {
        long now = this.A0E.now();
        if (A0B()) {
            A00();
            HashMap hashMap = this.A0B;
            if (!hashMap.isEmpty() || !this.A0A.isEmpty()) {
                Iterator A0k = AbstractC167007dF.A0k(hashMap);
                boolean z = true;
                while (A0k.hasNext()) {
                    Object next = A0k.next();
                    C14360o3.A07(next);
                    U4I u4i = (U4I) next;
                    Integer num = u4i.A00;
                    if (num != C05F.A0C || u4i.A01) {
                        if (num != C05F.A0N) {
                            z = false;
                        }
                    }
                }
                if (z && A05()) {
                    Iterator A0k2 = AbstractC167007dF.A0k(hashMap);
                    while (A0k2.hasNext()) {
                        Object next2 = A0k2.next();
                        C14360o3.A07(next2);
                        U4I u4i2 = (U4I) next2;
                        if (u4i2.A00 == C05F.A0C) {
                            u4i2.A00();
                        }
                    }
                    A01();
                }
            }
            A06(C05F.A0j);
            A09(str, (short) 4);
            long j = now - this.A01;
            if (j > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                this.A09.markEventBuilder(21364739, String.valueOf(this.A06)).annotate("duration", j).setLevel(5).report();
            }
        }
    }

    @Override // X.InterfaceC72008XEw
    public final synchronized void CnY() {
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerDropForUserFlow(i, i2);
        this.A07.A01(i, i2);
        A06(C05F.A0u);
        this.A08.A01(this);
    }

    @Override // X.InterfaceC72008XEw
    public final synchronized void Cna(String str) {
        String str2;
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerPoint(i, i2, str);
        U3s u3s = this.A07;
        if (str == null) {
            str2 = "Unknown name";
        } else {
            str2 = str;
        }
        u3s.A06(i, i2, str2, this.A0E.now());
        this.A0G.add(str);
    }

    @Override // X.InterfaceC72008XEw
    public final synchronized void Cnb(String str, long j) {
        String str2;
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerPoint(i, i2, str, null, j, TimeUnit.MILLISECONDS);
        U3s u3s = this.A07;
        if (str == null) {
            str2 = "Unknown name";
        } else {
            str2 = str;
        }
        u3s.A06(i, i2, str2, j);
        this.A0G.add(str);
    }

    @Override // X.InterfaceC72008XEw
    public final synchronized void CsE(String str, boolean z) {
        long now = this.A0E.now();
        if (A0C(C05F.A0C)) {
            U4I u4i = (U4I) this.A0B.get(str);
            if (u4i != null) {
                Integer num = C05F.A0N;
                int intValue = u4i.A00.intValue();
                if (intValue == 2 || intValue == 0 || intValue == 1) {
                    u4i.A00 = num;
                    u4i.A02 = true;
                    String A0R = AnonymousClass001.A0R("ttnc_for_", u4i.A05);
                    U3t u3t = u4i.A06;
                    u3t.A03 = A0R;
                    u3t.A00 = now;
                    u3t.A08(A0R, now);
                    u4i.A00();
                    A03(now);
                    A02();
                }
            }
        }
    }

    @Override // X.InterfaceC72008XEw
    public final synchronized void EoN(String str) {
        long now = this.A0E.now();
        if (A0C(C05F.A0C)) {
            C66225U4v c66225U4v = (C66225U4v) this.A0A.get(str);
            if (c66225U4v != null && c66225U4v.A00 == C05F.A00) {
                c66225U4v.A00 = C05F.A01;
                String A0R = AnonymousClass001.A0R("step_completed_", str);
                if (this.A00 <= now) {
                    this.A03 = A0R;
                    this.A00 = now;
                }
                A08(A0R, now);
                A03(this.A00);
                A02();
            }
        }
    }

    @Override // X.InterfaceC72008XEw
    public final synchronized void EoO(String str) {
        long now = this.A0E.now();
        Integer num = C05F.A0C;
        if (A0C(num)) {
            C66225U4v c66225U4v = (C66225U4v) this.A0A.get(str);
            if (c66225U4v != null && c66225U4v.A00 == C05F.A00) {
                c66225U4v.A00 = num;
                A03(Math.max(this.A00, now));
                A02();
            }
        }
    }

    private final void A00() {
        String A0g;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap = this.A0B;
        Iterator A0k = AbstractC167007dF.A0k(hashMap);
        while (A0k.hasNext()) {
            Object next = A0k.next();
            C14360o3.A07(next);
            U4I u4i = (U4I) next;
            int intValue = u4i.A00.intValue();
            if (intValue != 0) {
                if (intValue == 1 || intValue == 2) {
                    arrayList4.add(u4i.A05);
                }
            } else {
                arrayList3.add(u4i.A05);
            }
        }
        Iterator A14 = AbstractC166997dE.A14(this.A0A);
        while (A14.hasNext()) {
            Map.Entry entry = (Map.Entry) A14.next();
            Object key = entry.getKey();
            Integer num = ((C66225U4v) entry.getValue()).A00;
            if (num == C05F.A0C) {
                arrayList2.add(key);
            } else if (num == C05F.A00) {
                arrayList5.add(key);
            }
        }
        A0A("revoked_queries", (String[]) arrayList.toArray(new String[0]));
        A0A("revoked_steps", (String[]) arrayList2.toArray(new String[0]));
        A0A("pending_cache_and_network_queries", (String[]) arrayList3.toArray(new String[0]));
        A0A("pending_network_queries", (String[]) arrayList4.toArray(new String[0]));
        A0A("pending_steps", (String[]) arrayList5.toArray(new String[0]));
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator A0k2 = AbstractC167007dF.A0k(hashMap);
        while (A0k2.hasNext()) {
            Object next2 = A0k2.next();
            C14360o3.A07(next2);
            U4I u4i2 = (U4I) next2;
            if (u4i2.A00 == C05F.A0N) {
                if (u4i2.A03 && !u4i2.A02) {
                    arrayList6.add(u4i2.A05);
                } else {
                    arrayList7.add(u4i2.A05);
                }
            }
        }
        if ((!arrayList6.isEmpty()) || (!arrayList7.isEmpty())) {
            if (arrayList7.isEmpty()) {
                A0g = "CACHE";
            } else if (arrayList6.isEmpty()) {
                A0g = "NETWORK";
            } else {
                C01T.A1C(arrayList6);
                C01T.A1C(arrayList7);
                A0g = AnonymousClass001.A0g(AbstractC001800i.A0P(", ", "", "", arrayList6, X5G.A00), ", ", AbstractC001800i.A0P(", ", "", "", arrayList7, X5H.A00));
            }
            CnT("ttrc_source", A0g);
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator A0k3 = AbstractC167007dF.A0k(hashMap);
        while (A0k3.hasNext()) {
            Object next3 = A0k3.next();
            C14360o3.A07(next3);
            U4I u4i3 = (U4I) next3;
            if (u4i3.A03) {
                arrayList8.add(u4i3.A05);
            }
        }
        if (!arrayList8.isEmpty()) {
            C01T.A1C(arrayList8);
            CnT("ttrc_cache_rendered", AbstractC001800i.A0P(", ", "", "", arrayList8, null));
        }
    }

    private final void A01() {
        String str;
        try {
            QuickPerformanceLogger quickPerformanceLogger = this.A09;
            int i = this.A06;
            int i2 = this.A05;
            quickPerformanceLogger.markerEndAtPointForUserFlow(i, i2, (short) 2, this.A03);
            this.A07.A03(i, i2, this.A01, this.A00, (short) 2);
            this.A08.A01(this);
            A06(C05F.A0N);
        } catch (C0XW e) {
            A09("Point not found", (short) 3);
            A06(C05F.A0Y);
            int i3 = this.A06;
            String A0R = AnonymousClass001.A0R("TTRCTrace | ", String.valueOf(i3));
            String[] strArr = e.A02;
            if (strArr != null) {
                str = AbstractC009903n.A07(", ", "", "", null, strArr);
            } else {
                str = "null";
            }
            InterfaceC103314l6 interfaceC103314l6 = this.A0F;
            interfaceC103314l6.E79("ttrc_qpl_points_known", str);
            interfaceC103314l6.E79("ttrc_qpl_points_submitted", AbstractC001800i.A0P(", ", "", "", this.A0G, null));
            Locale locale = Locale.US;
            String format = String.format(locale, "%d:%d", Arrays.copyOf(AbstractC25228BEl.A1Z(Integer.valueOf(i3), this.A05), 2));
            C14360o3.A07(format);
            interfaceC103314l6.E79("ttrc_qpl_markerid_sumbited", format);
            interfaceC103314l6.E79("ttrc_qpl_markerid_known", AbstractC65702TsY.A0h("%d:%d", locale, AbstractC25228BEl.A1Z(Integer.valueOf(e.A01), e.A00), 2));
            interfaceC103314l6.EHA(A0R, "Error while ending trace", e);
        }
    }

    private final void A03(long j) {
        if (!this.A04 && A05()) {
            if (A07() == C05F.A00 || A07() == C05F.A0C) {
                Iterator A0k = AbstractC167007dF.A0k(this.A0B);
                while (A0k.hasNext()) {
                    Object next = A0k.next();
                    C14360o3.A07(next);
                    Integer num = ((U4I) next).A00;
                    if (num != C05F.A0N && num != C05F.A0C) {
                        return;
                    }
                }
                A08("time_to_initial_content", j);
                this.A04 = true;
            }
        }
    }

    private final boolean A05() {
        Iterator A0k = AbstractC167007dF.A0k(this.A0A);
        while (A0k.hasNext()) {
            Object next = A0k.next();
            C14360o3.A07(next);
            Integer num = ((C66225U4v) next).A00;
            if (num != C05F.A01 && num != C05F.A0C) {
                return false;
            }
        }
        return true;
    }

    public final void A09(String str, short s) {
        if (str != null && str.length() != 0) {
            MarkerEditor withMarker = this.A09.withMarker(this.A06, this.A05);
            withMarker.annotate("end_reason", str);
            withMarker.markerEditingCompleted();
        }
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerEndForUserFlow(i, i2, s);
        this.A07.A03(i, i2, this.A01, this.A00, s);
        this.A08.A01(this);
    }

    public final void A0A(String str, String[] strArr) {
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerAnnotate(i, i2, str, strArr);
        if (strArr != null) {
            this.A07.A09(i, i2, str, strArr);
        }
    }

    @Override // X.InterfaceC72008XEw
    public final long CBF() {
        return (this.A05 & 4294967295L) | ((this.A06 << 32) & (-4294967296L));
    }

    @Override // X.InterfaceC72008XEw
    public final void Ch7() {
        Ch8("leftSurface");
    }

    @Override // X.InterfaceC72008XEw
    public final void CnR(String str, int i) {
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i2 = this.A06;
        int i3 = this.A05;
        quickPerformanceLogger.markerAnnotate(i2, i3, str, i);
        if (str != null) {
            this.A07.A04(i2, i3, str, i);
        }
    }

    @Override // X.InterfaceC72008XEw
    public final void CnS(String str, long j) {
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerAnnotate(i, i2, str, j);
        if (str != null) {
            this.A07.A05(i, i2, str, j);
        }
    }

    @Override // X.InterfaceC72008XEw
    public final void CnT(String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerAnnotate(i, i2, str, str2);
        if (str != null && str2 != null) {
            this.A07.A07(i, i2, str, str2);
        }
    }

    @Override // X.InterfaceC72008XEw
    public final void CnU(String str, boolean z) {
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerAnnotate(i, i2, str, z);
        if (str != null) {
            this.A07.A08(i, i2, str, z);
        }
    }

    @Override // X.InterfaceC72008XEw
    public final MarkerEditor FEA() {
        MarkerEditor withMarker = this.A09.withMarker(this.A06, this.A05);
        C14360o3.A07(withMarker);
        return withMarker;
    }

    @Override // X.InterfaceC72008XEw
    public final int getMarkerId() {
        return this.A06;
    }

    public final String toString() {
        return AnonymousClass001.A01('_', this.A06, this.A05);
    }

    public U3t(InterfaceC103334l8 interfaceC103334l8, InterfaceC103314l6 interfaceC103314l6, C103284l3 c103284l3, QuickPerformanceLogger quickPerformanceLogger, String str, int i, int i2, long j, long j2, boolean z, boolean z2) {
        AbstractC167007dF.A1D(quickPerformanceLogger, 1, c103284l3);
        this.A09 = quickPerformanceLogger;
        this.A08 = c103284l3;
        this.A0E = interfaceC103334l8;
        this.A0F = interfaceC103314l6;
        this.A06 = i;
        this.A05 = i2;
        this.A0B = new HashMap();
        this.A0A = new HashMap();
        this.A0C = new ArrayList();
        this.A0D = new ArrayList();
        VM8 vm8 = U3s.A01;
        U3s u3s = U3s.A02;
        if (u3s == null) {
            synchronized (vm8) {
                u3s = U3s.A02;
                if (u3s == null) {
                    u3s = new U3s();
                    U3s.A02 = u3s;
                }
            }
        }
        this.A07 = u3s;
        this.A0G = new ArrayList();
        this.A0I = new AtomicBoolean(false);
        this.A0H = new AtomicBoolean(false);
        this.A02 = C05F.A00;
        long j3 = (!z || j2 <= 0) ? j : j2;
        this.A01 = j3;
        int i3 = this.A06;
        int i4 = this.A05;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        quickPerformanceLogger.markerStartForUserFlow(i3, i4, j3, timeUnit, z2);
        u3s.A02(this.A06, this.A05, this.A01);
        if (z) {
            quickPerformanceLogger.markerPoint(this.A06, this.A05, "ttrc_start_trace_api_called", j, timeUnit);
            u3s.A06(this.A06, this.A05, "ttrc_start_trace_api_called", j);
        } else if (j2 > 0) {
            quickPerformanceLogger.markerPoint(this.A06, this.A05, "ttrc_touch_up", j2, timeUnit);
            u3s.A06(this.A06, this.A05, "ttrc_touch_up", j2);
        }
        MarkerEditor withMarker = quickPerformanceLogger.withMarker(this.A06, this.A05);
        try {
            withMarker.annotate("ttrc_qpl_instancekey", this.A05);
            withMarker.annotate("ttrc_tracking_version", 1);
            withMarker.annotate("ttrc_back_start_on_touch_up", z);
            int i5 = this.A06;
            int i6 = this.A05;
            u3s.A04(i5, i6, "ttrc_qpl_instancekey", i6);
            u3s.A04(this.A06, this.A05, "ttrc_tracking_version", 1);
            u3s.A08(this.A06, this.A05, "ttrc_back_start_on_touch_up", z);
            if (str != null) {
                withMarker.annotate("ttrc_touch_up_module", str);
                u3s.A07(this.A06, this.A05, "ttrc_touch_up_module", str);
            }
            withMarker.markerEditingCompleted();
            this.A04 = false;
        } catch (Throwable th) {
            withMarker.markerEditingCompleted();
            throw th;
        }
    }
}
