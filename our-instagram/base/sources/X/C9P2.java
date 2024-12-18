package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9P2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9P2 implements InterfaceC72007XEv, InterfaceC179117xN {
    public static final Object A0b = new Object();
    public int A00;
    public InterfaceC180227zC A03;
    public InterfaceC25162BBi A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public InterfaceC58019Po5 A0B;
    public boolean A0C;
    public final int A0D;
    public final Context A0E;
    public final Handler A0F;
    public final InterfaceC178817wt A0G;
    public final C178747wm A0H;
    public final WDI A0I;
    public final InterfaceC25204BDc A0J;
    public final InterfaceC25205BDd A0K;
    public final U7W A0L;
    public final Map A0N;
    public final Handler A0Q;
    public final HandlerThread A0R;
    public final InterfaceC197758om A0S;
    public final C179877yd A0T;
    public final AK4 A0U;
    public final Object A0V;
    public final boolean A0W;
    public volatile MediaComposition A0X;
    public volatile Exception A0Y;
    public volatile boolean A0Z;
    public volatile boolean A0a;
    public final Map A0P = new ConcurrentHashMap();
    public final Map A0O = AbstractC166987dD.A1G();
    public final Object A0M = new Object();
    public int A02 = -1;
    public int A01 = -1;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0082, code lost:
    
        r6.A00 = r0 + 1;
        r10 = r6.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0088, code lost:
    
        monitor-enter(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0089, code lost:
    
        r10.A01.getClass();
        r1 = r10.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
    
        if (r1.isEmpty() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0096, code lost:
    
        r11 = new X.C179387xo();
        ((X.AbstractC179397xp) r11).A00 = "glBufferedInputInput";
        r1 = new X.AnonymousClass814(false);
        ((X.AbstractC179397xp) r1).A00 = "glBufferedInputOutput";
        r7 = new X.C179427xs(r10.A02, r11, r1, false);
        r2.CGV().getClass();
        r7.A03(r2.CGV().A01, r2.CGV().A00, r2.AxI());
        r7.ACv(r10.A01);
        r10.A00++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d5, code lost:
    
        r7.A0A.A03 = r2.C8d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e6, code lost:
    
        monitor-exit(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e7, code lost:
    
        r6.A04.A00(r8, r2, r7);
        r8 = r6.A03;
        r8.A00 = android.opengl.GLES30.glFenceSync(37143, 0);
        X.AbstractC180237zD.A02("after gl fence", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0105, code lost:
    
        if (r8.A00 == 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        r1 = new java.lang.RuntimeException("gl fence creation failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0107, code lost:
    
        android.opengl.GLES20.glFlush();
        r6.A06.add(r7);
        r4.notifyAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00de, code lost:
    
        r7 = (X.C179427xs) r1.remove(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011e, code lost:
    
        r1 = th;
     */
    @Override // X.InterfaceC72007XEv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void AQh(long r14) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9P2.AQh(long):void");
    }

    @Override // X.InterfaceC72007XEv
    public final void EaP(Surface surface, VN4 vn4, int i) {
        C70124W5f c70124W5f;
        if (!this.A0K.CU6()) {
            C176507t8 c176507t8 = new C176507t8(surface, false);
            c176507t8.A09 = 0;
            WDI wdi = this.A0I;
            c176507t8.A06 = (wdi.A0B + wdi.A05) % 360;
            C176517t9 c176517t9 = new C176517t9(this.A0H, c176507t8);
            if ((wdi.A09 == 7 || ((c70124W5f = wdi.A0G) != null && c70124W5f.A01)) && this.A0L.A12()) {
                c176517t9.A00 = 7;
                c176517t9.A01 = 7;
            }
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            c176517t9.A04 = -1L;
            c176517t9.A03 = -1L;
            c176517t9.A07 = timeUnit;
            c176517t9.A0A = this.A0C;
            int i2 = 1;
            if (this.A0W) {
                i2 = 2;
            }
            c176517t9.A02 = i2;
            this.A0O.put(0, c176517t9);
            this.A0G.BQq().A8h(c176517t9, 0);
        }
    }

    @Override // X.InterfaceC72007XEv
    public final void cancel() {
        this.A0Z = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9P2(Context context, EGLContext eGLContext, InterfaceC178897x1 interfaceC178897x1, C179877yd c179877yd, WDI wdi, MediaComposition mediaComposition, AK4 ak4, U7W u7w, Object obj) {
        U7W u7w2 = u7w;
        Object obj2 = obj;
        this.A0U = ak4;
        obj2 = obj == null ? A0b : obj2;
        this.A0V = obj2;
        C225389x1 c225389x1 = AK4.A01;
        Object obj3 = C178747wm.A01;
        Map map = ak4.A00;
        Object obj4 = map.get(c225389x1);
        this.A0H = (C178747wm) (obj4 != null ? obj4 : obj3);
        this.A0E = context;
        this.A0T = c179877yd;
        this.A0S = new C9P9();
        this.A0I = wdi;
        this.A0X = mediaComposition;
        u7w2 = u7w == null ? new Object() : u7w2;
        this.A0L = u7w2;
        Object obj5 = map.get(AK4.A05);
        this.A0D = AbstractC166987dD.A0H(obj5 != null ? obj5 : 60000);
        map.get(AK4.A04);
        Handler handler = (Handler) map.get(AK4.A08);
        if (handler != null) {
            this.A0R = null;
            this.A0Q = handler;
        } else {
            Object obj6 = map.get(AK4.A0C);
            if (!AbstractC166987dD.A1a(obj6 != null ? obj6 : false)) {
                HandlerThread handlerThread = new HandlerThread(AnonymousClass001.A0O("AR-Frame-Lite-Renderer-Render-Thread-", hashCode()));
                AbstractC09770fa.A00(handlerThread);
                this.A0R = handlerThread;
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                looper.getClass();
                this.A0Q = new Handler(looper);
            } else {
                this.A0R = null;
                this.A0Q = null;
            }
        }
        Object obj7 = map.get(AK4.A07);
        obj7.getClass();
        InterfaceC25204BDc interfaceC25204BDc = (InterfaceC25204BDc) obj7;
        this.A0J = interfaceC25204BDc;
        InterfaceC25205BDd AMx = interfaceC25204BDc.AMx(eGLContext, this.A0Q, new C23329AVo(this, 5), interfaceC178897x1, wdi, u7w2, obj2);
        this.A0K = AMx;
        AMx.EKd();
        InterfaceC178817wt BQp = AMx.BQp();
        this.A0G = BQp;
        BQp.Eca(new C80F() { // from class: X.9PA
            @Override // X.C80F
            public final void DRr(Long l) {
                C9P2 c9p2 = C9P2.this;
                Object obj8 = c9p2.A0M;
                synchronized (obj8) {
                    c9p2.A07 = true;
                    c9p2.A00--;
                    obj8.notifyAll();
                }
            }
        });
        this.A0F = BQp.getHandler();
        this.A0B = (InterfaceC58019Po5) map.get(AK4.A06);
        Object obj8 = r1;
        Object obj9 = map.get(AK4.A02);
        boolean z = true;
        if (AbstractC166987dD.A1a(obj9 != null ? obj9 : false)) {
            this.A0C = true;
            this.A0N = new ConcurrentHashMap();
            c179877yd.getClass();
            C178907x2 B9w = BQp.B9w();
            C178847ww B9v = BQp.B9v();
            B9v.getClass();
            this.A03 = new AZ6(interfaceC178897x1, c179877yd, B9v, B9w);
        } else {
            if (!u7w2.A09() && !AMx.CU6()) {
                z = false;
            }
            this.A0C = z;
            this.A0N = null;
            this.A03 = null;
        }
        Object obj10 = obj8;
        Object obj11 = map.get(AK4.A03);
        this.A06 = AbstractC166987dD.A1a(obj11 != null ? obj11 : obj10);
        Object obj12 = obj8;
        Object obj13 = map.get(AK4.A0A);
        this.A08 = AbstractC166987dD.A1a(obj13 != null ? obj13 : obj12);
        Object obj14 = obj8;
        Object obj15 = map.get(AK4.A09);
        this.A0W = AbstractC166987dD.A1a(obj15 != null ? obj15 : obj14);
        Object obj16 = map.get(AK4.A0B);
        this.A09 = AbstractC166987dD.A1a(obj16 != null ? obj16 : obj8);
    }

    private void A00(long j, boolean z) {
        if (this.A0N != null && this.A0G.AZ1() < 3) {
            throw new RuntimeException("enableAsyncRendering can be only enabled for devices supporting open gl es 3");
        }
        this.A0G.EGa(Long.valueOf(j), z);
    }

    @Override // X.InterfaceC72007XEv
    public final void A8L(MediaEffect mediaEffect, int i) {
        this.A0F.post(new RunnableC24579Aua(mediaEffect, this));
    }

    @Override // X.InterfaceC72007XEv
    public final void AAf(int i) {
        this.A0F.post(new RunnableC24578AuZ(this, i));
    }

    @Override // X.InterfaceC72007XEv
    public final void APs(int i, final long j) {
        if (!this.A0C) {
            AbstractC1808580n.A03("ArFrameLiteRenderer.displayFrame()");
            try {
                try {
                    synchronized (this.A0M) {
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        this.A0F.post(new Runnable() { // from class: X.9RC
                            /* JADX WARN: Code restructure failed: missing block: B:30:0x0043, code lost:
                            
                                if (r2 == null) goto L17;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: all -> 0x0065, Merged into TryCatch #2 {all -> 0x0068, blocks: (B:4:0x0014, B:5:0x001b, B:33:0x0067, B:7:0x001c, B:10:0x0024, B:12:0x0028, B:15:0x0058, B:16:0x005b, B:23:0x0038, B:24:0x003b, B:25:0x004c, B:27:0x0050, B:28:0x0045, B:29:0x003c, B:14:0x002a), top: B:3:0x0014, outer: #3 }] */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void run() {
                                /*
                                    r8 = this;
                                    X.9P2 r0 = X.C9P2.this     // Catch: java.lang.Throwable -> L6d
                                    java.util.Map r1 = r0.A0O     // Catch: java.lang.Throwable -> L6d
                                    r7 = 0
                                    java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L6d
                                    java.lang.Object r6 = r1.get(r0)     // Catch: java.lang.Throwable -> L6d
                                    X.7t9 r6 = (X.C176517t9) r6     // Catch: java.lang.Throwable -> L6d
                                    r6.getClass()     // Catch: java.lang.Throwable -> L6d
                                    long r4 = r3     // Catch: java.lang.Throwable -> L6d
                                    java.lang.String r0 = "displayFrame"
                                    X.AbstractC1808580n.A03(r0)     // Catch: java.lang.Throwable -> L68
                                    X.7t8 r3 = r6.A0G     // Catch: java.lang.Throwable -> L68
                                    monitor-enter(r3)     // Catch: java.lang.Throwable -> L68
                                    X.7zH r1 = r6.A0L     // Catch: java.lang.Throwable -> L65
                                    X.7zC r2 = r6.A05     // Catch: java.lang.Throwable -> L65
                                    if (r1 == 0) goto L3c
                                    if (r2 == 0) goto L45
                                    boolean r0 = r6.A08     // Catch: java.lang.Throwable -> L65
                                    if (r0 == 0) goto L4c
                                    r6.A08 = r7     // Catch: java.lang.Throwable -> L65
                                    r1.A05()     // Catch: java.lang.Throwable -> L37
                                    r1.A04(r4)     // Catch: java.lang.Throwable -> L37
                                    r1.A03()     // Catch: java.lang.Throwable -> L37
                                    r0 = 1
                                    r6.A0M = r0     // Catch: java.lang.Throwable -> L37
                                    goto L58
                                L37:
                                    r0 = move-exception
                                    r2.makeCurrent()     // Catch: java.lang.Throwable -> L65
                                    throw r0     // Catch: java.lang.Throwable -> L65
                                L3c:
                                    X.7wm r1 = r6.A0F     // Catch: java.lang.Throwable -> L65
                                    X.8u8 r0 = X.EnumC200658u8.A0d     // Catch: java.lang.Throwable -> L65
                                    r1.A00(r0)     // Catch: java.lang.Throwable -> L65
                                    if (r2 != 0) goto L4c
                                L45:
                                    X.7wm r1 = r6.A0F     // Catch: java.lang.Throwable -> L65
                                    X.8u8 r0 = X.EnumC200658u8.A0c     // Catch: java.lang.Throwable -> L65
                                    r1.A00(r0)     // Catch: java.lang.Throwable -> L65
                                L4c:
                                    boolean r0 = r6.A08     // Catch: java.lang.Throwable -> L65
                                    if (r0 != 0) goto L5b
                                    X.7wm r1 = r6.A0F     // Catch: java.lang.Throwable -> L65
                                    X.8u8 r0 = X.EnumC200658u8.A0b     // Catch: java.lang.Throwable -> L65
                                    r1.A00(r0)     // Catch: java.lang.Throwable -> L65
                                    goto L5b
                                L58:
                                    r2.makeCurrent()     // Catch: java.lang.Throwable -> L65
                                L5b:
                                    monitor-exit(r3)     // Catch: java.lang.Throwable -> L65
                                    X.AbstractC1808580n.A01()     // Catch: java.lang.Throwable -> L6d
                                    java.util.concurrent.CountDownLatch r0 = r2
                                    r0.countDown()
                                    return
                                L65:
                                    r0 = move-exception
                                    monitor-exit(r3)     // Catch: java.lang.Throwable -> L65
                                    throw r0     // Catch: java.lang.Throwable -> L68
                                L68:
                                    r0 = move-exception
                                    X.AbstractC1808580n.A01()     // Catch: java.lang.Throwable -> L6d
                                    throw r0     // Catch: java.lang.Throwable -> L6d
                                L6d:
                                    r1 = move-exception
                                    java.util.concurrent.CountDownLatch r0 = r2
                                    r0.countDown()
                                    throw r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C9RC.run():void");
                            }
                        });
                        countDownLatch.await(this.A0D, TimeUnit.MILLISECONDS);
                    }
                } catch (InterruptedException e) {
                    if (this.A0L.A0E()) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException(e);
                    }
                }
            } finally {
                AbstractC1808580n.A01();
            }
        }
    }

    @Override // X.InterfaceC72007XEv
    public final SurfaceTexture BI8(int i, boolean z) {
        Map map = this.A0P;
        Integer valueOf = Integer.valueOf(i);
        C0J8.A09(map.containsKey(valueOf), "init() hasn't been called yet!");
        try {
            Object obj = map.get(valueOf);
            obj.getClass();
            return ((C197768on) ((C197788op) obj).A09).A01(z);
        } catch (InterruptedException e) {
            if (!this.A0L.A0E()) {
                return null;
            }
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.Ope, java.lang.Object] */
    @Override // X.InterfaceC72007XEv
    public final synchronized void CNZ() {
        MYB AUI;
        this.A0Z = false;
        this.A0a = false;
        HashMap A07 = this.A0X.A07(EnumC1125356h.VIDEO);
        A07.getClass();
        Iterator A14 = AbstractC166997dE.A14(A07);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            C1125756l c1125756l = (C1125756l) AbstractC166987dD.A1F(((C1125956n) A1K.getValue()).A04).get(0);
            File file = c1125756l.A04;
            AbstractC1126356r.A06(file);
            boolean A01 = c1125756l.A01(false);
            if (A01) {
                try {
                    AUI = new Object().AUI(android.net.Uri.fromFile(file));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                InterfaceC58019Po5 interfaceC58019Po5 = this.A0B;
                if (interfaceC58019Po5 != null) {
                    AUI = interfaceC58019Po5.AUI(android.net.Uri.fromFile(file));
                } else {
                    AUI = AbstractC55147OdA.A02(this.A0E, android.net.Uri.fromFile(file).toString(), false);
                    AUI.getClass();
                }
            }
            int i = AUI.A05;
            int i2 = i;
            boolean z = this.A06;
            if (z && i % 16 != 0) {
                i2 = ((i / 16) * 16) + 16;
            }
            int i3 = AUI.A03;
            int i4 = i3;
            if (z && i3 % 16 != 0) {
                i4 = ((i3 / 16) * 16) + 16;
            }
            int i5 = AUI.A04;
            C197738ok c197738ok = new C197738ok(i2, i4, i2, i4, i5, AUI.A02);
            Integer num = (Integer) A1K.getKey();
            boolean z2 = true;
            EnumC197748ol enumC197748ol = EnumC197748ol.ENABLE;
            EnumC197888oz enumC197888oz = EnumC197888oz.A04;
            InterfaceC197758om interfaceC197758om = this.A0S;
            U7W u7w = this.A0L;
            C197768on c197768on = new C197768on(enumC197748ol, c197738ok, interfaceC197758om, enumC197888oz, this.A0V, "ARFrameLiteRenderer", true, true, u7w.A0H(), A01, u7w.A0U());
            if (A01) {
                z2 = false;
            }
            C197788op c197788op = new C197788op(c197768on, z2);
            c197788op.A0C.A00 = "transcoderVideoInput";
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(i);
            A1C.append("x");
            A1C.append(i3);
            A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            A1C.append("rotation:");
            A1C.append(i5);
            if (z && (i % 16 != 0 || i3 % 16 != 0)) {
                A1C.append(",multipleOf16FixEnabled:true");
                c197788op.A03 = AbstractC166987dD.A0Y(i / i2, i3 / i4);
            }
            this.A0P.put(num, c197788op);
            Map map = this.A0N;
            if (map != null) {
                map.put(num, new AZI(this.A0H));
            }
            C178757wn c178757wn = this.A0H.A00;
            String obj = A1C.toString();
            synchronized (c178757wn) {
                try {
                    c178757wn.A00.put("ARFrameLiteRenderer.inputMetadata", obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.A0F.post(new RunnableC24742AxQ(this, this.A0P, this.A0N));
    }

    @Override // X.InterfaceC72007XEv
    public final void DMH(int i) {
        C197788op c197788op = (C197788op) AbstractC166997dE.A0m(this.A0P, i);
        if (c197788op != null) {
            C197768on c197768on = (C197768on) c197788op.A09;
            synchronized (c197768on.A07) {
                c197768on.A0I = true;
                c197768on.A00 = null;
            }
        }
    }

    @Override // X.InterfaceC72007XEv
    public final void DXA() {
        if (this.A0A) {
            Iterator A15 = AbstractC166997dE.A15(this.A0O);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                this.A0G.BQq().A8h((InterfaceC179437xt) A1K.getValue(), AbstractC166987dD.A0H(A1K.getKey()));
                this.A0A = false;
            }
        }
    }

    @Override // X.InterfaceC72007XEv
    public final void DXB() {
        Iterator A15 = AbstractC166997dE.A15(this.A0O);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            this.A0G.BQq().EFO(AbstractC166987dD.A0H(A1K.getKey()), A1K.getValue());
            this.A0A = true;
        }
    }

    @Override // X.InterfaceC179117xN
    public final void E6H(InterfaceC179247xa interfaceC179247xa) {
        InterfaceC179117xN Bmn = this.A0J.Bmn();
        if (Bmn != null) {
            Bmn.E6H(interfaceC179247xa);
        }
    }

    @Override // X.InterfaceC179117xN
    public final void E6I(InterfaceC179247xa interfaceC179247xa, InterfaceC179577y7 interfaceC179577y7) {
        InterfaceC179117xN Bmn = this.A0J.Bmn();
        if (Bmn != null) {
            Bmn.E6I(interfaceC179247xa, interfaceC179577y7);
        }
    }

    @Override // X.InterfaceC72007XEv
    public final void EFF(MediaEffect mediaEffect, int i) {
        this.A0F.post(new RunnableC24580Aub(mediaEffect, this));
    }

    @Override // X.InterfaceC72007XEv
    public final Bitmap ELi(int i) {
        final ArrayList A1E;
        int i2;
        if (this.A0L.A0H()) {
            Handler handler = this.A0F;
            if (handler.getLooper() == Looper.myLooper()) {
                int i3 = this.A02;
                if (i3 <= 0) {
                    i3 = this.A0I.A0C;
                }
                int i4 = this.A01;
                if (i4 <= 0) {
                    i4 = this.A0I.A0A;
                }
                return AbstractC209679Pd.A00(i3, i4);
            }
            final Bitmap[] bitmapArr = new Bitmap[1];
            A1E = AbstractC166987dD.A1E();
            synchronized (this.A0M) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                handler.post(new Runnable() { // from class: X.Ayr
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9P2 c9p2 = C9P2.this;
                        Bitmap[] bitmapArr2 = bitmapArr;
                        ArrayList arrayList = A1E;
                        CountDownLatch countDownLatch2 = countDownLatch;
                        try {
                            try {
                                int i5 = c9p2.A02;
                                if (i5 <= 0) {
                                    i5 = c9p2.A0I.A0C;
                                }
                                int i6 = c9p2.A01;
                                if (i6 <= 0) {
                                    i6 = c9p2.A0I.A0A;
                                }
                                bitmapArr2[0] = AbstractC209679Pd.A00(i5, i6);
                            } catch (Exception e) {
                                arrayList.add(e);
                            }
                        } finally {
                            countDownLatch2.countDown();
                        }
                    }
                });
                countDownLatch.await(this.A0D, TimeUnit.MILLISECONDS);
            }
            i2 = 0;
            if (A1E.isEmpty()) {
                Bitmap bitmap = bitmapArr[0];
                if (bitmap != null) {
                    return bitmap;
                }
                throw AbstractC166987dD.A15("Bitmap is null");
            }
        } else {
            final Bitmap[] bitmapArr2 = new Bitmap[1];
            A1E = AbstractC166987dD.A1E();
            synchronized (this.A0M) {
                final CountDownLatch countDownLatch2 = new CountDownLatch(1);
                this.A0F.post(new Runnable() { // from class: X.Ays
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9P2 c9p2 = C9P2.this;
                        Bitmap[] bitmapArr3 = bitmapArr2;
                        ArrayList arrayList = A1E;
                        CountDownLatch countDownLatch3 = countDownLatch2;
                        try {
                            try {
                                C176517t9 c176517t9 = (C176517t9) AbstractC166997dE.A0m(c9p2.A0O, 0);
                                C0J8.A03(c176517t9, "glSurfaceOutput is null");
                                c176517t9.Cmh();
                                WDI wdi = c9p2.A0I;
                                bitmapArr3[0] = AbstractC209679Pd.A00(wdi.A0C, wdi.A0A);
                            } catch (Exception e) {
                                arrayList.add(e);
                            }
                        } finally {
                            countDownLatch3.countDown();
                        }
                    }
                });
                countDownLatch2.await(this.A0D, TimeUnit.MILLISECONDS);
            }
            i2 = 0;
            if (A1E.isEmpty()) {
                Bitmap bitmap2 = bitmapArr2[0];
                if (bitmap2 != null) {
                    return bitmap2;
                }
                throw AbstractC166987dD.A15("Bitmap is null");
            }
        }
        throw ((Throwable) A1E.get(i2));
    }

    @Override // X.InterfaceC72007XEv
    public final void FAM(int i, final Bitmap bitmap) {
        U7W u7w = this.A0L;
        BI8(i, false);
        Object A0m = AbstractC166997dE.A0m(this.A0P, i);
        A0m.getClass();
        final C197768on c197768on = (C197768on) ((C197788op) A0m).A09;
        if (u7w.A0H()) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                this.A0F.post(new Runnable() { // from class: X.AxP
                    @Override // java.lang.Runnable
                    public final void run() {
                        C197768on c197768on2 = c197768on;
                        Bitmap bitmap2 = bitmap;
                        CountDownLatch countDownLatch2 = countDownLatch;
                        try {
                            AnonymousClass810 anonymousClass810 = c197768on2.A02;
                            if (anonymousClass810 != null) {
                                GLES20.glBindTexture(3553, anonymousClass810.A00);
                                GLUtils.texImage2D(3553, 0, bitmap2, 0);
                                GLES20.glFlush();
                            }
                        } finally {
                            countDownLatch2.countDown();
                        }
                    }
                });
                if (u7w.A09()) {
                    long j = 0;
                    do {
                        long j2 = this.A0D;
                        countDownLatch.await(j2, TimeUnit.MILLISECONDS);
                        j += j2;
                        if (countDownLatch.getCount() <= 0 || this.A0Z) {
                            return;
                        }
                    } while (j < 10000);
                    return;
                }
                countDownLatch.await(this.A0D, TimeUnit.MILLISECONDS);
                return;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        AnonymousClass810 anonymousClass810 = c197768on.A02;
        if (anonymousClass810 != null) {
            GLES20.glBindTexture(3553, anonymousClass810.A00);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            GLES20.glFlush();
        }
    }

    @Override // X.InterfaceC72007XEv
    public final void FB9(C68685VaL c68685VaL, int i) {
        Object A0m = AbstractC166997dE.A0m(this.A0P, i);
        A0m.getClass();
        ((C197788op) A0m).B8Z().EVi(c68685VaL);
    }

    public final void finalize() {
        HandlerThread handlerThread = this.A0R;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                handlerThread.join(1000L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                if (this.A0L.A0E()) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override // X.InterfaceC72007XEv
    public final void flush() {
        if (this.A0N != null) {
            try {
                Object obj = this.A0M;
                synchronized (obj) {
                    int i = this.A00;
                    while (i > 0) {
                        obj.wait(this.A0D);
                        int i2 = this.A00;
                        if (i2 < i) {
                            i = i2;
                        } else {
                            throw AbstractC166987dD.A18(AnonymousClass001.A02(i, i2, "waiting for finishing render queue took too long :( ", " "));
                        }
                    }
                }
            } catch (InterruptedException e) {
                if (this.A0L.A0E()) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override // X.InterfaceC72007XEv
    public final void release() {
        Map map = this.A0N;
        if (map != null) {
            Iterator A16 = AbstractC166997dE.A16(map);
            while (A16.hasNext()) {
                AZI azi = (AZI) A16.next();
                synchronized (azi.A05) {
                    C179427xs c179427xs = azi.A01;
                    if (c179427xs != null) {
                        azi.A02.A00(c179427xs);
                        azi.A01 = null;
                    }
                    Iterator it = azi.A06.iterator();
                    while (it.hasNext()) {
                        azi.A02.A00((C179427xs) it.next());
                    }
                    ABU abu = azi.A02;
                    synchronized (abu) {
                        try {
                            int i = abu.A00;
                            LinkedList linkedList = abu.A03;
                            C0J8.A08(AbstractC167007dF.A1P(i, linkedList.size()), AnonymousClass001.A02(i, linkedList.size(), "not all buffers were returned, we have a memory leak :(", " "));
                            Iterator it2 = linkedList.iterator();
                            while (it2.hasNext()) {
                                it2.next();
                            }
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }
                    azi.A04.detach();
                }
            }
        }
        if (this.A0L.A0N()) {
            Iterator A15 = AbstractC166997dE.A15(this.A0O);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                this.A0G.BQq().EFO(AbstractC166987dD.A0H(A1K.getKey()), A1K.getValue());
                this.A0A = true;
            }
        }
        this.A0J.CiT();
        this.A0K.destroy();
        this.A0a = true;
    }

    @Override // X.InterfaceC72007XEv
    public final void EZt(InterfaceC25162BBi interfaceC25162BBi) {
        this.A04 = interfaceC25162BBi;
    }
}
