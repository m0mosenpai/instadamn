package X;

import android.view.Surface;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7t9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176517t9 implements InterfaceC179087xK, InterfaceC179437xt, InterfaceC178827wu {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public InterfaceC180227zC A05;
    public C178907x2 A06;
    public TimeUnit A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public C22981ABg A0E;
    public final C178747wm A0F;
    public final C176507t8 A0G;
    public final AwakeTimeSinceBootClock A0H;
    public final AbstractC179397xp A0I;
    public final C176527tA A0J;
    public final C176537tB A0K;
    public volatile AbstractC180277zH A0L;
    public volatile boolean A0M;

    @Override // X.InterfaceC178827wu
    public final String B0u() {
        return "GlSurfaceOutput";
    }

    public final void A00() {
        synchronized (this.A0G) {
            AbstractC180277zH abstractC180277zH = this.A0L;
            this.A0L = null;
            if (abstractC180277zH != null) {
                abstractC180277zH.A02();
            }
        }
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        Object obj;
        AbstractC180277zH AMi;
        this.A05 = interfaceC180227zC;
        this.A08 = false;
        this.A0M = false;
        if (interfaceC180227zC != null) {
            C180357zP c180357zP = interfaceC180227zC.C4K().A01;
            boolean z = this.A0B;
            C176507t8 c176507t8 = this.A0G;
            if (z) {
                obj = c176507t8.A0C;
            } else {
                obj = c176507t8.A0B;
                if (obj == null) {
                    obj = c176507t8.A00();
                }
            }
            if (obj != null) {
                HashMap hashMap = C180357zP.A01;
                synchronized (hashMap) {
                    C176517t9 c176517t9 = (C176517t9) hashMap.remove(obj);
                    if (c176517t9 != null) {
                        c176517t9.A00();
                    }
                    hashMap.put(obj, this);
                    C180347zO c180347zO = c180357zP.A00;
                    synchronized (c176507t8) {
                        Surface A00 = c176507t8.A00();
                        A00.getClass();
                        if (A00.isValid()) {
                            InterfaceC180227zC interfaceC180227zC2 = this.A05;
                            if (interfaceC180227zC2 != null && (interfaceC180227zC2.B09().AqC() & 32) != 0 && this.A00 != 7) {
                                AMi = c180347zO.A00.B0A(5).AMj(A00, 5);
                            } else {
                                AMi = c180347zO.A00.B09().AMi(A00);
                            }
                            this.A0L = AMi;
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC179437xt
    public final Object BOS() {
        return this.A0G;
    }

    @Override // X.InterfaceC179437xt
    public final int BaF() {
        InterfaceC180227zC interfaceC180227zC = this.A05;
        if (interfaceC180227zC != null && (interfaceC180227zC.B09().AqC() & 32) != 0) {
            return this.A01;
        }
        return 3;
    }

    @Override // X.InterfaceC179437xt
    public final int BaJ() {
        int i = this.A0G.A07;
        if (i == 1) {
            return 1;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 4;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        if (r8 <= r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        if (r5.convert(r1, r3) >= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0068, code lost:
    
        if (r8 >= r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: all -> 0x006f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:10:0x0019, B:12:0x001d, B:14:0x0023, B:17:0x002e, B:19:0x0032, B:21:0x0038, B:25:0x006d, B:30:0x0043, B:32:0x0047, B:34:0x004d, B:36:0x0055, B:38:0x0059, B:40:0x005f), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047 A[Catch: all -> 0x006f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:10:0x0019, B:12:0x001d, B:14:0x0023, B:17:0x002e, B:19:0x0032, B:21:0x0038, B:25:0x006d, B:30:0x0043, B:32:0x0047, B:34:0x004d, B:36:0x0055, B:38:0x0059, B:40:0x005f), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059 A[Catch: all -> 0x006f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:10:0x0019, B:12:0x001d, B:14:0x0023, B:17:0x002e, B:19:0x0032, B:21:0x0038, B:25:0x006d, B:30:0x0043, B:32:0x0047, B:34:0x004d, B:36:0x0055, B:38:0x0059, B:40:0x005f), top: B:3:0x0003 }] */
    @Override // X.InterfaceC179437xt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CTm(X.InterfaceC179467xw r11) {
        /*
            r10 = this;
            X.7t8 r4 = r10.A0G
            monitor-enter(r4)
            X.7zH r0 = r10.A0L     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L6c
            boolean r0 = r4.A04()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L6c
            long r8 = r11.C8d()     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L6f
            r6 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L6c
            java.util.concurrent.TimeUnit r3 = r10.A07     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L28
            long r1 = r10.A04     // Catch: java.lang.Throwable -> L6f
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L28
            long r1 = r5.convert(r1, r3)     // Catch: java.lang.Throwable -> L6f
            goto L2a
        L28:
            r1 = -1
        L2a:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L43
            java.util.concurrent.TimeUnit r3 = r10.A07     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L3d
            long r1 = r10.A03     // Catch: java.lang.Throwable -> L6f
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L3d
            long r1 = r5.convert(r1, r3)     // Catch: java.lang.Throwable -> L6f
            goto L3f
        L3d:
            r1 = -1
        L3f:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6a
        L43:
            java.util.concurrent.TimeUnit r3 = r10.A07     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L55
            long r1 = r10.A03     // Catch: java.lang.Throwable -> L6f
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L55
            long r1 = r5.convert(r1, r3)     // Catch: java.lang.Throwable -> L6f
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L6c
        L55:
            java.util.concurrent.TimeUnit r3 = r10.A07     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L64
            long r1 = r10.A04     // Catch: java.lang.Throwable -> L6f
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L64
            long r1 = r5.convert(r1, r3)     // Catch: java.lang.Throwable -> L6f
            goto L66
        L64:
            r1 = -1
        L66:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L6c
        L6a:
            r0 = 1
            goto L6d
        L6c:
            r0 = 0
        L6d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6f
            return r0
        L6f:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176517t9.CTm(X.7xw):boolean");
    }

    @Override // X.InterfaceC179437xt
    public final boolean CZh() {
        return this.A09;
    }

    @Override // X.InterfaceC179437xt
    public final boolean Cem() {
        return false;
    }

    @Override // X.InterfaceC179437xt
    public final Exception Cmh() {
        IllegalStateException illegalStateException;
        synchronized (this.A0G) {
            AbstractC180277zH abstractC180277zH = this.A0L;
            if (abstractC180277zH == null) {
                this.A0F.A00(EnumC200658u8.A0e);
                illegalStateException = new IllegalStateException("Gl surface is null");
            } else {
                try {
                    abstractC180277zH.A05();
                    illegalStateException = null;
                } catch (C80D e) {
                    this.A0F.A00(EnumC200658u8.A0L);
                    return e;
                }
            }
        }
        return illegalStateException;
    }

    @Override // X.InterfaceC179437xt
    public final C179407xq FBc(InterfaceC179467xw interfaceC179467xw) {
        return FBd(interfaceC179467xw, this.A0I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r2.A0E == false) goto L24;
     */
    @Override // X.InterfaceC179437xt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C179407xq FBd(X.InterfaceC179467xw r12, X.AbstractC179397xp r13) {
        /*
            r11 = this;
            X.7t8 r2 = r11.A0G
            monitor-enter(r2)
            X.7xq r5 = r12.CGV()     // Catch: java.lang.Throwable -> L77
            r3 = 0
            if (r5 == 0) goto L6e
            boolean r0 = r5.A00()     // Catch: java.lang.Throwable -> L77
            if (r0 != 0) goto L19
            X.7wm r1 = r11.A0F     // Catch: java.lang.Throwable -> L77
            X.8u8 r0 = X.EnumC200658u8.A0i     // Catch: java.lang.Throwable -> L77
            r1.A00(r0)     // Catch: java.lang.Throwable -> L77
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
            goto L76
        L19:
            X.7zH r4 = r11.A0L     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto L25
            X.7wm r1 = r11.A0F     // Catch: java.lang.Throwable -> L77
            X.8u8 r0 = X.EnumC200658u8.A0h     // Catch: java.lang.Throwable -> L77
            r1.A00(r0)     // Catch: java.lang.Throwable -> L77
            goto L17
        L25:
            int r0 = r4.A01()     // Catch: java.lang.Throwable -> L77
            r11.A0D = r0     // Catch: java.lang.Throwable -> L77
            int r0 = r4.A00()     // Catch: java.lang.Throwable -> L77
            r11.A0C = r0     // Catch: java.lang.Throwable -> L77
            int r1 = r2.A09     // Catch: java.lang.Throwable -> L77
            r0 = 1
            if (r1 == 0) goto L39
            if (r1 != r0) goto L4e
            goto L41
        L39:
            long r0 = r12.C8d()     // Catch: java.lang.Throwable -> L77
            r4.A04(r0)     // Catch: java.lang.Throwable -> L77
            goto L4e
        L41:
            X.7tB r3 = r11.A0K     // Catch: java.lang.Throwable -> L77
            long r0 = r12.C8d()     // Catch: java.lang.Throwable -> L77
            long r0 = r3.A00(r0)     // Catch: java.lang.Throwable -> L77
            r4.A04(r0)     // Catch: java.lang.Throwable -> L77
        L4e:
            int r4 = r5.A01     // Catch: java.lang.Throwable -> L77
            int r5 = r5.A00     // Catch: java.lang.Throwable -> L77
            int r6 = r11.A0D     // Catch: java.lang.Throwable -> L77
            int r7 = r11.A0C     // Catch: java.lang.Throwable -> L77
            int r8 = r2.A06     // Catch: java.lang.Throwable -> L77
            boolean r0 = r12.CVE()     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L63
            boolean r0 = r2.A0E     // Catch: java.lang.Throwable -> L77
            r9 = 1
            if (r0 != 0) goto L64
        L63:
            r9 = 0
        L64:
            r10 = 0
            r3 = r13
            r3.A09(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77
            X.7xq r3 = r13.A08()     // Catch: java.lang.Throwable -> L77
            goto L17
        L6e:
            X.7wm r1 = r11.A0F     // Catch: java.lang.Throwable -> L77
            X.8u8 r0 = X.EnumC200658u8.A0j     // Catch: java.lang.Throwable -> L77
            r1.A00(r0)     // Catch: java.lang.Throwable -> L77
            goto L17
        L76:
            return r3
        L77:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176517t9.FBd(X.7xw, X.7xp):X.7xq");
    }

    @Override // X.InterfaceC179437xt
    public final boolean contains(Object obj) {
        if (this.A0G != obj) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        Object obj;
        InterfaceC180227zC interfaceC180227zC = this.A05;
        this.A05 = null;
        this.A08 = false;
        this.A0M = false;
        if (interfaceC180227zC != null) {
            interfaceC180227zC.C4K();
            boolean z = this.A0B;
            C176507t8 c176507t8 = this.A0G;
            if (z) {
                obj = c176507t8.A0C;
            } else {
                obj = c176507t8.A0B;
                if (obj == null) {
                    obj = c176507t8.A00();
                }
            }
            if (obj != null) {
                HashMap hashMap = C180357zP.A01;
                synchronized (hashMap) {
                    if (equals((C176517t9) hashMap.get(obj))) {
                        hashMap.remove(obj);
                    }
                    A00();
                }
            }
        }
        C178907x2 c178907x2 = this.A06;
        if (c178907x2 != null) {
            c178907x2.A06.A00(this);
        }
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
        C176507t8 c176507t8 = this.A0G;
        synchronized (c176507t8) {
            c176507t8.A01();
            this.A0M = false;
        }
        C178907x2 c178907x2 = this.A06;
        if (c178907x2 != null) {
            c178907x2.A06.A00(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[Catch: all -> 0x0073, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0011, B:9:0x001c, B:11:0x0021, B:13:0x0042, B:15:0x0046, B:17:0x004a, B:18:0x005e, B:19:0x0068, B:27:0x0025, B:29:0x0029, B:32:0x002f, B:33:0x003b, B:34:0x0033, B:35:0x003e, B:36:0x0061), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0025 A[Catch: all -> 0x0073, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0011, B:9:0x001c, B:11:0x0021, B:13:0x0042, B:15:0x0046, B:17:0x004a, B:18:0x005e, B:19:0x0068, B:27:0x0025, B:29:0x0029, B:32:0x002f, B:33:0x003b, B:34:0x0033, B:35:0x003e, B:36:0x0061), top: B:3:0x0003 }] */
    @Override // X.InterfaceC179437xt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void swapBuffers() {
        /*
            r7 = this;
            X.7t8 r5 = r7.A0G
            monitor-enter(r5)
            X.ABg r4 = r7.A0E     // Catch: java.lang.Throwable -> L73
            X.7zH r3 = r7.A0L     // Catch: java.lang.Throwable -> L73
            boolean r2 = r7.A0M     // Catch: java.lang.Throwable -> L73
            if (r4 == 0) goto Le
            if (r3 == 0) goto L61
            goto L11
        Le:
            if (r3 == 0) goto L61
            goto L1c
        L11:
            int r1 = r3.A01()     // Catch: java.lang.Throwable -> L73
            int r0 = r3.A00()     // Catch: java.lang.Throwable -> L73
            r4.A00(r1, r0)     // Catch: java.lang.Throwable -> L73
        L1c:
            boolean r0 = r7.A0A     // Catch: java.lang.Throwable -> L73
            r6 = 1
            if (r0 == 0) goto L25
            r3.A03()     // Catch: java.lang.Throwable -> L73
            goto L40
        L25:
            int r1 = r7.A02     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L3e
            X.7zC r0 = r7.A05     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L33
            if (r1 == r6) goto L3b
            r0.flush()     // Catch: java.lang.Throwable -> L73
            goto L3e
        L33:
            X.7wm r1 = r7.A0F     // Catch: java.lang.Throwable -> L73
            X.8u8 r0 = X.EnumC200658u8.A0f     // Catch: java.lang.Throwable -> L73
            r1.A00(r0)     // Catch: java.lang.Throwable -> L73
            goto L3e
        L3b:
            r0.AVe()     // Catch: java.lang.Throwable -> L73
        L3e:
            r7.A08 = r6     // Catch: java.lang.Throwable -> L73
        L40:
            if (r2 != 0) goto L5e
            X.7tA r4 = r7.A0J     // Catch: java.lang.Throwable -> L73
            if (r4 == 0) goto L5e
            com.facebook.common.time.AwakeTimeSinceBootClock r0 = r7.A0H     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L5e
            long r2 = r0.nowNanos()     // Catch: java.lang.Throwable -> L73
            X.7wk r0 = r4.A00     // Catch: java.lang.Throwable -> L73
            X.7w3 r0 = r0.A0F     // Catch: java.lang.Throwable -> L73
            X.AuG r1 = new X.AuG     // Catch: java.lang.Throwable -> L73
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L73
            X.7w0 r0 = (X.C178267w0) r0     // Catch: java.lang.Throwable -> L73
            android.os.Handler r0 = r0.A00     // Catch: java.lang.Throwable -> L73
            r0.post(r1)     // Catch: java.lang.Throwable -> L73
        L5e:
            r7.A0M = r6     // Catch: java.lang.Throwable -> L73
            goto L68
        L61:
            X.7wm r1 = r7.A0F     // Catch: java.lang.Throwable -> L73
            X.8u8 r0 = X.EnumC200658u8.A0g     // Catch: java.lang.Throwable -> L73
            r1.A00(r0)     // Catch: java.lang.Throwable -> L73
        L68:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L73
            X.7x2 r0 = r7.A06
            if (r0 == 0) goto L72
            X.7x6 r0 = r0.A06
            r0.A01(r7)
        L72:
            return
        L73:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L73
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176517t9.swapBuffers():void");
    }

    public C176517t9(AwakeTimeSinceBootClock awakeTimeSinceBootClock, C178747wm c178747wm, C176527tA c176527tA, C176507t8 c176507t8, boolean z) {
        AbstractC179397xp anonymousClass814;
        this.A0F = c178747wm;
        this.A0G = c176507t8;
        this.A0B = z;
        if (c176507t8.A08 != 1) {
            anonymousClass814 = new C179417xr();
        } else {
            anonymousClass814 = new AnonymousClass814(false);
        }
        this.A0I = anonymousClass814;
        this.A0J = c176527tA;
        this.A0H = awakeTimeSinceBootClock;
        anonymousClass814.A00 = "glSurfaceOutput";
        this.A0A = true;
        this.A0M = false;
        this.A02 = 0;
        this.A01 = 0;
        this.A0K = new C176537tB();
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
        this.A06 = c178907x2;
    }

    @Override // X.InterfaceC179437xt
    public final void EZs(C22981ABg c22981ABg) {
        this.A0E = c22981ABg;
    }

    public C176517t9(C178747wm c178747wm, C176507t8 c176507t8) {
        this(null, c178747wm, null, c176507t8, false);
    }

    public C176517t9() {
    }
}
