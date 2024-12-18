package X;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7xM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179107xM implements InterfaceC179077xJ, InterfaceC179087xK, Handler.Callback, InterfaceC179117xN {
    public static final int[] A0e = {0, 1, 2, 3, 4};
    public float A00;
    public int A01;
    public Handler A02;
    public C179507y0 A03;
    public C179517y1 A04;
    public InterfaceC178407wE A05;
    public C178907x2 A06;
    public List A07;
    public boolean A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public Long A0G;
    public boolean A0H;
    public boolean A0I;
    public final ConditionVariable A0J;
    public final C179177xT A0K;
    public final C179267xc A0L;
    public final C179157xR A0M;
    public final C178747wm A0N;
    public final C179237xZ A0O;
    public final boolean A0P;
    public final Context A0Q;
    public final InterfaceC179147xQ A0R;
    public final C179257xb A0S;
    public final List A0T;
    public final AtomicInteger A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public volatile InterfaceC179467xw A0a;
    public volatile Long A0b;
    public volatile Long A0c;
    public volatile boolean A0d;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0057, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.7xZ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C179107xM(android.content.Context r8, android.os.Handler r9, android.os.Handler r10, X.InterfaceC179147xQ r11, X.C178747wm r12, X.InterfaceC178407wE r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r7 = this;
            r3 = 1
            X.C14360o3.A0B(r12, r3)
            r0 = 2
            X.C14360o3.A0B(r8, r0)
            r0 = 10
            X.C14360o3.A0B(r11, r0)
            r7.<init>()
            r7.A0N = r12
            r7.A0Q = r8
            r7.A0P = r14
            r7.A0V = r15
            r7.A0R = r11
            r0 = r18
            r7.A0X = r0
            r0 = r19
            r7.A0W = r0
            r0 = r20
            r7.A0Y = r0
            r7.A05 = r13
            r6 = 0
            if (r16 == 0) goto L30
            android.os.ConditionVariable r6 = new android.os.ConditionVariable
            r6.<init>()
        L30:
            r7.A0J = r6
            X.7xR r0 = new X.7xR
            r0.<init>(r12)
            r7.A0M = r0
            X.7xT r0 = new X.7xT
            r0.<init>()
            r7.A0K = r0
            X.7xZ r0 = new X.7xZ
            r0.<init>()
            r7.A0O = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.A0T = r0
            r5 = 1
            r4 = 0
            if (r17 == 0) goto L59
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r0 = 1
            if (r2 >= r1) goto L5a
        L59:
            r0 = 0
        L5a:
            r7.A0Z = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r4)
            r7.A0U = r0
            r7.A0H = r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.A00 = r0
            X.7xb r1 = new X.7xb
            r1.<init>(r7)
            r7.A0S = r1
            if (r6 != 0) goto L73
            r5 = 0
        L73:
            X.7xc r0 = new X.7xc
            r0.<init>(r10, r1, r12, r5)
            r7.A0L = r0
            X.7xT r0 = r7.A0K
            X.7xx r3 = new X.7xx
            r3.<init>()
            X.7xW r2 = r0.A01
            X.7xY[] r1 = r2.A01
            X.7xX r0 = r3.Bmo()
            int r0 = r0.ordinal()
            r1[r0] = r3
            X.C179207xW.A00(r2)
            if (r9 == 0) goto L9f
            android.os.Looper r1 = r9.getLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1, r7)
            r7.A02 = r0
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179107xM.<init>(android.content.Context, android.os.Handler, android.os.Handler, X.7xQ, X.7wm, X.7wE, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00df A[Catch: all -> 0x013c, TryCatch #0 {all -> 0x013c, blocks: (B:95:0x0062, B:97:0x0066, B:99:0x006a, B:5:0x0074, B:7:0x007f, B:10:0x00df, B:12:0x00e3, B:14:0x00e7, B:16:0x00f6, B:18:0x00fa, B:20:0x0100, B:22:0x0106, B:24:0x010a, B:25:0x0115, B:26:0x011d, B:28:0x0125, B:29:0x012d, B:40:0x0084, B:42:0x0088, B:44:0x0090, B:45:0x009a, B:47:0x00a2, B:59:0x00c1, B:60:0x00c8, B:53:0x00b8, B:64:0x00d1, B:68:0x00d6), top: B:94:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013b A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.RuntimeException, X.B4J] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC179467xw A01(X.C179107xM r13, X.InterfaceC179467xw r14, X.InterfaceC179037xF r15, java.lang.Integer r16, boolean r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179107xM.A01(X.7xM, X.7xw, X.7xF, java.lang.Integer, boolean, boolean, boolean):X.7xw");
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        this.A0d = true;
        C179177xT c179177xT = this.A0K;
        C179207xW c179207xW = c179177xT.A01;
        if (c179207xW.A00.compareAndSet(false, true)) {
            C179207xW.A00(c179207xW);
        }
        c179177xT.A00.A01.set(true);
    }

    @Override // X.InterfaceC179077xJ
    public final int AlT() {
        return 1;
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
        C14360o3.A0B(c178907x2, 0);
        this.A06 = c178907x2;
        c178907x2.A03(this.A0M);
        C179267xc c179267xc = this.A0L;
        if (c179267xc != null) {
            c178907x2.A03(c179267xc);
        }
        Handler handler = this.A02;
        if (handler == null || !C14360o3.A0K(handler.getLooper(), c178907x2.A00.getLooper())) {
            this.A02 = new Handler(c178907x2.A00.getLooper(), this);
        }
        List list = this.A07;
        if (list != null) {
            A05(this, new C81C(list), null);
            this.A07 = null;
        }
    }

    @Override // X.InterfaceC179117xN
    public final void E6H(InterfaceC179247xa interfaceC179247xa) {
        A05(this, interfaceC179247xa, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.RuntimeException, X.B4J] */
    @Override // X.InterfaceC179077xJ
    public final InterfaceC179467xw EGc(InterfaceC179467xw interfaceC179467xw, InterfaceC179437xt interfaceC179437xt, InterfaceC179037xF interfaceC179037xF, Long l) {
        InterfaceC179467xw interfaceC179467xw2 = interfaceC179467xw;
        C14360o3.A0B(interfaceC179467xw, 0);
        C14360o3.A0B(interfaceC179037xF, 2);
        try {
            AbstractC1808580n.A03("GlProcessorGraph.render");
            if (this.A02 != null && CLu() && this.A08) {
                interfaceC179467xw2 = A03(interfaceC179467xw, interfaceC179037xF, true);
            } else {
                interfaceC179467xw2 = A01(this, interfaceC179467xw2, interfaceC179037xF, null, true, true, true);
            }
        } finally {
            try {
                return interfaceC179467xw2;
            } finally {
            }
        }
        return interfaceC179467xw2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.RuntimeException, X.B4J] */
    @Override // X.InterfaceC179077xJ
    public final void EGd(InterfaceC179037xF interfaceC179037xF, Long l) {
        C14360o3.A0B(interfaceC179037xF, 0);
        if (interfaceC179037xF.CWg(0)) {
            try {
                AbstractC1808580n.A03("GlProcessorGraph.renderInternal");
                InterfaceC179467xw interfaceC179467xw = (InterfaceC179467xw) interfaceC179037xF.BHy(0);
                if (!this.A0P || interfaceC179037xF.B9y(0) != 0) {
                    if (this.A02 != null && CLu() && this.A08) {
                        C14360o3.A0A(interfaceC179467xw);
                        A03(interfaceC179467xw, interfaceC179037xF, false);
                    } else {
                        C14360o3.A0A(interfaceC179467xw);
                        A01(this, interfaceC179467xw, interfaceC179037xF, null, false, true, true);
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // X.InterfaceC179077xJ
    public final void FDL(int i, Object obj) {
        C14360o3.A0B(obj, 1);
        if ((i & 1) != 0) {
            C179487xy c179487xy = ((C177307uQ) obj).A00;
            c179487xy.A00 = this;
            c179487xy.A03.A01(c179487xy.A04, c179487xy.A05, this);
        }
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        this.A0d = false;
        Long l = this.A0G;
        if (l != null) {
            GLES30.glDeleteSync(l.longValue());
            this.A0G = null;
        }
        Long l2 = this.A0b;
        if (l2 != null) {
            GLES30.glDeleteSync(l2.longValue());
            this.A0b = null;
        }
        Long l3 = this.A0c;
        if (l3 != null) {
            GLES30.glDeleteSync(l3.longValue());
            this.A0c = null;
        }
        C179177xT c179177xT = this.A0K;
        c179177xT.A01.A00.set(false);
        c179177xT.A00.A01.set(false);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        InterfaceC179247xa interfaceC179247xa;
        InterfaceC179577y7 interfaceC179577y7;
        C14360o3.A0B(message, 0);
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && this.A0d) {
                    Object obj = message.obj;
                    if (obj != null) {
                        Object[] objArr = (Object[]) obj;
                        Object obj2 = objArr[0];
                        C14360o3.A0C(obj2, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.mediagraph.interfaces.MediaGraphIO");
                        Object obj3 = objArr[1];
                        C14360o3.A0C(obj3, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.interfaces.GlFrame");
                        A01(this, (InterfaceC179467xw) obj3, (InterfaceC179037xF) obj2, null, true, true, true);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                return true;
            }
            Object obj4 = message.obj;
            if (obj4 != null) {
                Object[] objArr2 = (Object[]) obj4;
                Object obj5 = objArr2[0];
                C14360o3.A0C(obj5, "null cannot be cast to non-null type com.facebook.videocodec.effects.renderers.common.RendererEvent");
                interfaceC179247xa = (InterfaceC179247xa) obj5;
                Object obj6 = objArr2[1];
                C14360o3.A0C(obj6, "null cannot be cast to non-null type com.facebook.videocodec.effects.renderers.common.RendererEventListener");
                interfaceC179577y7 = (InterfaceC179577y7) obj6;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            Object obj7 = message.obj;
            if (obj7 != null) {
                interfaceC179247xa = (InterfaceC179247xa) obj7;
                interfaceC179577y7 = null;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        A06(interfaceC179247xa, interfaceC179577y7);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException, X.B4J] */
    private final InterfaceC179467xw A00(Handler handler, InterfaceC179467xw interfaceC179467xw, InterfaceC179037xF interfaceC179037xF, Integer num, boolean z, boolean z2, boolean z3) {
        InterfaceC179467xw interfaceC179467xw2 = interfaceC179467xw;
        try {
            AbstractC1808580n.A03("GlProcessorGraph.renderSingleOutputInSeparateThread");
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.A0b = A04(this, this.A0b);
            handler.post(new RunnableC24890Azp(this, interfaceC179467xw2, interfaceC179037xF, num, countDownLatch, z2, z3));
            try {
                countDownLatch.await(10L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            }
            Long l = this.A0c;
            if (l != null) {
                GLES20.glFlush();
                long longValue = l.longValue();
                GLES30.glWaitSync(longValue, 0, -1L);
                GLES30.glDeleteSync(longValue);
            }
            this.A0c = null;
            InterfaceC179467xw interfaceC179467xw3 = this.A0a;
            if (interfaceC179467xw3 != null) {
                interfaceC179467xw2 = interfaceC179467xw3;
            }
            try {
                if (this.A0d && !z) {
                    ((C179027xE) interfaceC179037xF).A07.A01(interfaceC179467xw2, null);
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C178907x2 c178907x2 = this.A06;
                    if (c178907x2 != 0) {
                        c178907x2.A05(new RuntimeException("MediaPipeline.renderSingleOutputInSeparateThread() failed.", th));
                    }
                    return interfaceC179467xw2;
                } finally {
                    AbstractC1808580n.A01();
                    this.A0a = null;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return interfaceC179467xw2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.7oM, X.7xa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.RuntimeException, X.B4J] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.7xa, java.lang.Object, X.7oN] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.7oK, X.7xa, java.lang.Object] */
    private final InterfaceC179467xw A02(InterfaceC179467xw interfaceC179467xw) {
        int i;
        int i2;
        int i3;
        int i4;
        C81A c81a;
        InterfaceC179467xw interfaceC179467xw2 = interfaceC179467xw;
        Handler handler = this.A02;
        if (this.A0d && CLu() && (handler == null || C14360o3.A0K(Looper.myLooper(), handler.getLooper()) || !this.A08)) {
            AbstractC09790fc.A01("ProcessGlRenderer", -904925411);
            int AxI = interfaceC179467xw2.AxI();
            if (AxI != this.A0A || interfaceC179467xw2.BaI() != this.A0E) {
                this.A0A = AxI;
                int BaI = interfaceC179467xw2.BaI();
                this.A0E = BaI;
                if ((AxI + BaI) % 180 != 0) {
                    i = this.A0D;
                    i2 = this.A0F;
                } else {
                    i = this.A0F;
                    i2 = this.A0D;
                }
                C179177xT c179177xT = this.A0K;
                float f = this.A09;
                ?? obj = new Object();
                obj.A02 = i;
                obj.A01 = i2;
                obj.A00 = f;
                c179177xT.E6I(obj, null);
                if (this.A0E % 180 != 0) {
                    i3 = this.A0B;
                    i4 = this.A0C;
                } else {
                    i3 = this.A0C;
                    i4 = this.A0B;
                }
                ?? obj2 = new Object();
                obj2.A01 = i3;
                obj2.A00 = i4;
                c179177xT.E6I(obj2, null);
                int i5 = this.A0E / 90;
                int i6 = -this.A0A;
                ?? obj3 = new Object();
                obj3.A00 = i5;
                obj3.A01 = i6;
                c179177xT.E6I(obj3, null);
            }
            this.A0K.E6I(C9PW.A00, null);
            C179157xR c179157xR = this.A0M;
            synchronized (c179157xR) {
                c179157xR.A02 = true;
                List list = c179157xR.A06.A00;
                C14360o3.A07(list);
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    Object obj4 = list.get(i7);
                    C201598vo c201598vo = (C201598vo) obj4;
                    long C8d = interfaceC179467xw2.C8d() / 1000;
                    C81A c81a2 = c201598vo.A03;
                    if (c81a2 != null && c81a2.isEnabled() && c201598vo.A05.CTl(C8d)) {
                        C178907x2 c178907x2 = c179157xR.A01;
                        if (c178907x2 != 0) {
                            C179407xq CGV = interfaceC179467xw2.CGV();
                            if (CGV != null && CGV.A00()) {
                                C179427xs A00 = C179157xR.A00(c179157xR);
                                float f2 = CGV.A01;
                                float f3 = c179157xR.A00;
                                A00.A03(Math.round(f2 * f3), Math.round(CGV.A00 * f3), interfaceC179467xw2.AxI());
                            }
                            try {
                                C201598vo c201598vo2 = (C201598vo) obj4;
                                InterfaceC180227zC A01 = c178907x2.A01();
                                C14360o3.A07(C179157xR.A00(c179157xR).A0A);
                                C179427xs A002 = C179157xR.A00(c179157xR);
                                synchronized (A002) {
                                    AnonymousClass810 texture = interfaceC179467xw2.getTexture();
                                    if (texture != null) {
                                        try {
                                            if (A002.Cmh() == null) {
                                                C179407xq FBd = A002.FBd(interfaceC179467xw2, A002.A01);
                                                C179407xq CGV2 = interfaceC179467xw2.CGV();
                                                if (CGV2 != null && FBd != null && CGV2.A00() && FBd.A00()) {
                                                    C201278vB c201278vB = c201598vo2.A06;
                                                    c201278vB.A02(texture, CGV2.A03, FBd.A03, null, interfaceC179467xw2.C8d());
                                                    GLES20.glViewport(0, 0, FBd.A01, FBd.A00);
                                                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                                                    GLES20.glClear(16640);
                                                    C81A c81a3 = c201598vo2.A03;
                                                    if (c81a3 != null) {
                                                        int i8 = c201598vo2.A01;
                                                        int i9 = FBd.A01;
                                                        if (i8 != i9 || c201598vo2.A00 != FBd.A00) {
                                                            c201598vo2.A01 = i9;
                                                            c201598vo2.A00 = FBd.A00;
                                                            C14360o3.A0A(c81a3);
                                                            c81a3.Dr3(c201598vo2.A01, c201598vo2.A00);
                                                        }
                                                    }
                                                    if (c201598vo2.A02 != null && (c81a = c201598vo2.A03) != null && c81a.isEnabled()) {
                                                        long j = c201278vB.A00 / 1000;
                                                        if (!c201598vo2.A04) {
                                                            c201598vo2.A08.DCH(c201278vB, j);
                                                        }
                                                        C81A c81a4 = c201598vo2.A03;
                                                        if (c81a4 instanceof C81B) {
                                                            C14360o3.A0C(c81a4, "null cannot be cast to non-null type com.facebook.videocodec.effects.common.OutputAwareGLRenderer");
                                                            ((C81B) c81a4).ETG(c201598vo2.A07);
                                                        }
                                                        C81A c81a5 = c201598vo2.A03;
                                                        C14360o3.A0A(c81a5);
                                                        if (c81a5.DCH(c201278vB, j)) {
                                                            A002.swapBuffers();
                                                            A01.makeCurrent();
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append("GL Error after renderFrame(): ");
                                                            sb.append(obj4);
                                                            AbstractC180237zD.A02(sb.toString(), new Object[0]);
                                                            interfaceC179467xw2 = C179157xR.A00(c179157xR).A0A;
                                                            c179157xR.A02 = !c179157xR.A02;
                                                        }
                                                    }
                                                }
                                            }
                                            A01.makeCurrent();
                                        } catch (Throwable th) {
                                            A01.makeCurrent();
                                            throw th;
                                            break;
                                        }
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("GL Error after skip renderFrame(): ");
                                    sb2.append(obj4);
                                    AbstractC180237zD.A02(sb2.toString(), new Object[0]);
                                }
                            } catch (Throwable th2) {
                                c178907x2.A05(new RuntimeException("GlRenderChain.doFrame() error!", th2));
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("GlRenderChain.init() must be called before doFrame() with enabled ");
                            sb3.append(obj4);
                            sb3.append(' ');
                            throw new IllegalStateException(sb3.toString());
                        }
                    }
                }
            }
            AbstractC09790fc.A00(-920525786);
            if (this.A0Z) {
                C178907x2 c178907x22 = this.A06;
                if (c178907x22 != null) {
                    if (c178907x22.A03.BZA() >= 3) {
                        AbstractC09790fc.A01("WaitForGpuCompletion", -60559716);
                        Long l = this.A0G;
                        if (l != null) {
                            GLES30.glClientWaitSync(l.longValue(), 1, 500000000L);
                            GLES30.glDeleteSync(l.longValue());
                            this.A0G = null;
                        }
                        this.A0G = Long.valueOf(GLES30.glFenceSync(37143, 0));
                        GLES20.glFlush();
                        AbstractC09790fc.A00(-1498932802);
                        return interfaceC179467xw2;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        return interfaceC179467xw2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.RuntimeException, X.B4J] */
    private final InterfaceC179467xw A03(InterfaceC179467xw interfaceC179467xw, InterfaceC179037xF interfaceC179037xF, boolean z) {
        InterfaceC179467xw interfaceC179467xw2 = interfaceC179467xw;
        if (this.A0d) {
            try {
                AbstractC1808580n.A03("GlProcessorGraph.renderInSeparateThread");
                Handler handler = this.A02;
                if (handler != null) {
                    if (this.A0U.get() < this.A01) {
                        handler.removeMessages(3);
                        handler.sendMessage(handler.obtainMessage(3, new Object[]{interfaceC179037xF, interfaceC179467xw2}));
                        if (this.A0d && !z) {
                            ((C179027xE) interfaceC179037xF).A07.A01(interfaceC179467xw2, null);
                        }
                    } else if (!z && this.A0V && this.A0M.A02()) {
                        int i = 0;
                        List B9z = interfaceC179037xF.B9z(0);
                        int size = B9z.size();
                        boolean[] zArr = new boolean[5];
                        int i2 = 0;
                        for (int i3 = 0; i3 < 5; i3++) {
                            int i4 = A0e[i3];
                            int i5 = 0;
                            while (true) {
                                if (i5 < size) {
                                    InterfaceC179437xt interfaceC179437xt = (InterfaceC179437xt) B9z.get(i5);
                                    zArr[i3] = false;
                                    int BaJ = interfaceC179437xt.BaJ();
                                    if (i4 != BaJ) {
                                        if (i4 == 0) {
                                            if (BaJ != 5) {
                                                continue;
                                                i5++;
                                            }
                                        } else {
                                            if (i4 == 5 && BaJ == 0) {
                                            }
                                            i5++;
                                        }
                                    }
                                    if (interfaceC179437xt.CTm(interfaceC179467xw2)) {
                                        zArr[i3] = true;
                                        i2++;
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        }
                        int i6 = 0;
                        do {
                            if (zArr[i6]) {
                                int i7 = A0e[i6];
                                InterfaceC179467xw interfaceC179467xw3 = null;
                                boolean z2 = false;
                                if (i == 0) {
                                    z2 = true;
                                }
                                boolean z3 = false;
                                if (i == i2 - 1) {
                                    z3 = true;
                                }
                                for (int i8 = 0; i8 < size; i8++) {
                                    InterfaceC179437xt interfaceC179437xt2 = (InterfaceC179437xt) B9z.get(i8);
                                    int BaJ2 = interfaceC179437xt2.BaJ();
                                    if (i7 != BaJ2) {
                                        if (i7 == 0) {
                                            if (BaJ2 != 5) {
                                            }
                                        } else if (i7 == 5 && BaJ2 == 0) {
                                        }
                                    }
                                    if (interfaceC179437xt2.CTm(interfaceC179467xw2)) {
                                        if (interfaceC179467xw3 == null) {
                                            interfaceC179467xw3 = A00(handler, interfaceC179467xw2, interfaceC179037xF, Integer.valueOf(i7), true, z2, z3);
                                        }
                                        ((C179027xE) interfaceC179037xF).A07.A01(interfaceC179467xw3, interfaceC179437xt2);
                                    }
                                }
                                i++;
                            }
                            i6++;
                        } while (i6 < 5);
                    } else {
                        interfaceC179467xw2 = A00(handler, interfaceC179467xw2, interfaceC179037xF, null, z, true, true);
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return interfaceC179467xw2;
    }

    public static final Long A04(C179107xM c179107xM, Long l) {
        if (l != null) {
            GLES20.glFlush();
            GLES30.glDeleteSync(l.longValue());
        }
        C178907x2 c178907x2 = c179107xM.A06;
        if (c178907x2 != null) {
            if (c178907x2.A03.BZA() >= 3) {
                Long valueOf = Long.valueOf(GLES30.glFenceSync(37143, 0));
                GLES20.glFlush();
                return valueOf;
            }
            return null;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A07(List list) {
        InterfaceC180227zC interfaceC180227zC;
        if (this.A06 == null) {
            this.A07 = list;
            return;
        }
        List list2 = this.A0T;
        ArrayList arrayList = new ArrayList(list2);
        ArrayList arrayList2 = new ArrayList();
        list2.clear();
        ArrayList arrayList3 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C81A c81a = (C81A) list.get(i);
            list2.add(c81a);
            if (!arrayList.remove(c81a)) {
                arrayList2.add(c81a);
            }
            C201598vo AL9 = this.A0R.AL9(i);
            C81A c81a2 = AL9.A03;
            if (c81a2 != c81a) {
                if (c81a2 != null) {
                    c81a2.DrA();
                }
                AL9.A03 = c81a;
                AL9.A04 = c81a instanceof AnonymousClass819;
                if (c81a != null && (interfaceC180227zC = AL9.A02) != null) {
                    C14360o3.A0A(interfaceC180227zC);
                    c81a.Dr7(interfaceC180227zC.BiH());
                }
            }
            arrayList3.add(AL9);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C81A c81a3 = (C81A) arrayList.get(i2);
            if (c81a3 instanceof InterfaceC179577y7) {
                ((InterfaceC179577y7) c81a3).Ecb(null);
            }
            if (c81a3 instanceof AnonymousClass818) {
                ((AnonymousClass818) c81a3).A0G(null);
            }
        }
        C179177xT c179177xT = this.A0K;
        InterfaceC178407wE interfaceC178407wE = this.A05;
        int size3 = arrayList2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C81A c81a4 = (C81A) arrayList2.get(i3);
            if (c81a4 instanceof InterfaceC179577y7) {
                ((InterfaceC179577y7) c81a4).Ecb(c179177xT);
            }
            if (c81a4 instanceof AnonymousClass818) {
                ((AnonymousClass818) c81a4).A0G(interfaceC178407wE);
            }
        }
        C179157xR c179157xR = this.A0M;
        synchronized (c179157xR) {
            C178907x2 c178907x2 = c179157xR.A01;
            if (c178907x2 != null) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList(arrayList3);
                C1814082s c1814082s = c179157xR.A06;
                List list3 = c1814082s.A00;
                C14360o3.A07(list3);
                int size4 = list3.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    C201598vo c201598vo = (C201598vo) list3.get(i4);
                    if (arrayList5.remove(c201598vo)) {
                        arrayList3.set(arrayList3.indexOf(c201598vo), c201598vo);
                    } else {
                        arrayList4.add(c201598vo);
                    }
                }
                int size5 = arrayList4.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    C201598vo c201598vo2 = (C201598vo) arrayList4.get(i5);
                    if (c201598vo2 instanceof InterfaceC179087xK) {
                        c178907x2.A04(c201598vo2);
                    }
                }
                int size6 = arrayList5.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    C201598vo c201598vo3 = (C201598vo) arrayList5.get(i6);
                    if (c201598vo3 instanceof InterfaceC179087xK) {
                        c178907x2.A03(c201598vo3);
                    }
                }
                c1814082s.A00();
                synchronized (c1814082s) {
                    try {
                        if (!arrayList3.isEmpty()) {
                            int size7 = arrayList3.size();
                            ArrayList arrayList6 = new ArrayList(c1814082s.A00.size() + size7);
                            arrayList6.addAll(c1814082s.A00);
                            boolean z = false;
                            for (int i7 = 0; i7 < size7; i7++) {
                                Object obj = arrayList3.get(i7);
                                if (!c1814082s.A00.contains(obj)) {
                                    arrayList6.add(obj);
                                    z = true;
                                }
                            }
                            if (z) {
                                c1814082s.A00 = Collections.unmodifiableList(arrayList6);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ int AwF() {
        return 0;
    }

    @Override // X.InterfaceC179077xJ
    public final boolean CLu() {
        List list = this.A0M.A06.A00;
        C14360o3.A07(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C81A c81a = ((C201598vo) list.get(i)).A03;
            if (c81a != null && c81a.isEnabled()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ boolean Cbr() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.7oK, X.7xa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.7oL, X.7xa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.7oM, X.7xa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.7xa, java.lang.Object, X.7oN] */
    @Override // X.InterfaceC179077xJ
    public final void FBm(int i, int i2, int i3, boolean z, int i4, int i5) {
        float f;
        Integer num;
        if (i == 0) {
            float f2 = this.A00;
            this.A0C = Math.round(i2 * f2);
            this.A0B = Math.round(i3 * f2);
            if (this.A0X) {
                this.A0F = i2;
                this.A0D = i3;
            } else {
                this.A0F = i4;
                i2 = i4;
                this.A0D = i5;
            }
            if (this.A0Y) {
                f = i2 * 0.0024074074f;
            } else {
                f = this.A0Q.getResources().getDisplayMetrics().density;
            }
            this.A09 = f;
            this.A0A = 0;
            this.A0E = 0;
            C179267xc c179267xc = this.A0L;
            if (c179267xc != null) {
                int i6 = this.A0C;
                int i7 = this.A0B;
                C179287xe c179287xe = c179267xc.A04;
                if (i6 > 0 && i7 > 0) {
                    int max = Math.max(i6, i7);
                    int i8 = (i6 * 600) / max;
                    c179287xe.A02 = i8;
                    int i9 = (i7 * 600) / max;
                    c179287xe.A01 = i9;
                    c179287xe.A02 = i8 - (i8 % 2);
                    c179287xe.A01 = i9 - (i9 % 2);
                }
                if (c179287xe.A0G) {
                    c179287xe.A08.post(c179287xe.A0B);
                    if (c179287xe.A06) {
                        ConditionVariable conditionVariable = c179287xe.A07;
                        conditionVariable.block();
                        conditionVariable.close();
                    }
                }
            }
            C179177xT c179177xT = this.A0K;
            c179177xT.E6I(new C173667oJ(this.A0I), null);
            int i10 = this.A0C;
            int i11 = this.A0B;
            ?? obj = new Object();
            obj.A01 = i10;
            obj.A00 = i11;
            c179177xT.E6I(obj, null);
            if (z) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            ?? obj2 = new Object();
            obj2.A00 = num;
            c179177xT.E6I(obj2, null);
            int i12 = this.A0E / 90;
            int i13 = this.A0A;
            ?? obj3 = new Object();
            obj3.A00 = i12;
            obj3.A01 = i13;
            c179177xT.E6I(obj3, null);
            int i14 = this.A0F;
            int i15 = this.A0D;
            float f3 = this.A09;
            ?? obj4 = new Object();
            obj4.A02 = i14;
            obj4.A01 = i15;
            obj4.A00 = f3;
            c179177xT.E6I(obj4, null);
        }
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
        List list = this.A0T;
        if (!list.isEmpty()) {
            this.A07 = new ArrayList(list);
            A07(C16930sl.A00);
        }
        C179177xT c179177xT = this.A0K;
        Arrays.fill(c179177xT.A01.A02, false);
        c179177xT.A00.A00.A00();
        c179177xT.A02.clear();
    }

    public static final void A05(C179107xM c179107xM, InterfaceC179247xa interfaceC179247xa, InterfaceC179577y7 interfaceC179577y7) {
        Message obtainMessage;
        if (interfaceC179247xa.AOo()) {
            if ((c179107xM.A0W || c179107xM.A08) && c179107xM.A02 == null) {
                return;
            }
            Handler handler = c179107xM.A02;
            if (handler != null) {
                if (interfaceC179577y7 != null) {
                    obtainMessage = handler.obtainMessage(2, new Object[]{interfaceC179247xa, interfaceC179577y7});
                } else {
                    obtainMessage = handler.obtainMessage(1, interfaceC179247xa);
                }
                handler.sendMessage(obtainMessage);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        c179107xM.A06(interfaceC179247xa, interfaceC179577y7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if (r1.A0H != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        r1 = r1.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r1.A0D = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008a, code lost:
    
        if (r0 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A06(X.InterfaceC179247xa r8, X.InterfaceC179577y7 r9) {
        /*
            r7 = this;
            X.7xX r3 = r8.CBM()
            if (r3 == 0) goto L95
            int r1 = r3.ordinal()
            r0 = 33
            if (r1 == r0) goto L8d
            r0 = 39
            if (r1 == r0) goto L6f
            r0 = 38
            if (r1 != r0) goto L95
            X.7xc r0 = r7.A0L
            if (r0 == 0) goto L27
            X.7xe r1 = r0.A04
            boolean r0 = r1.A0H
            if (r0 == 0) goto L27
        L20:
            X.7t8 r1 = r1.A04
            if (r1 == 0) goto L27
            r0 = 1
            r1.A0D = r0
        L27:
            X.7xX r0 = X.EnumC179217xX.A0Y
            if (r3 != r0) goto Lb8
            X.7y0 r2 = r7.A03
            if (r2 == 0) goto Lb8
            java.util.List r1 = r7.A0T
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            X.7xy r6 = r2.A00
            X.7wE r5 = r6.A06
            if (r5 == 0) goto Lb8
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r1.iterator()
        L44:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r2 = r3.next()
            X.81A r2 = (X.C81A) r2
            boolean r0 = r2 instanceof X.AnonymousClass818
            if (r0 == 0) goto L44
            boolean r0 = r2 instanceof X.C201608vp
            if (r0 != 0) goto L44
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L44
            X.8u7 r1 = new X.8u7
            r1.<init>()
            X.818 r2 = (X.AnonymousClass818) r2
            java.util.HashMap r0 = r2.A0E()
            r1.A00 = r0
            r4.add(r1)
            goto L44
        L6f:
            X.8sM r8 = (X.C199708sM) r8
            boolean r0 = r8.A00
            r7.A0I = r0
            X.7xT r2 = r7.A0K
            X.7oJ r1 = new X.7oJ
            r1.<init>(r0)
            r0 = 0
            r2.E6I(r1, r0)
            X.7xc r1 = r7.A0L
            if (r1 == 0) goto L27
            boolean r0 = r7.A0I
            X.7xe r1 = r1.A04
            r1.A0H = r0
            if (r0 != 0) goto L27
            goto L20
        L8d:
            X.81C r8 = (X.C81C) r8
            java.util.List r0 = r8.A00
            r7.A07(r0)
            goto L27
        L95:
            X.7xX r0 = X.EnumC179217xX.A0Y
            if (r3 != r0) goto L9f
            java.util.concurrent.atomic.AtomicInteger r1 = r7.A0U
            r0 = 0
            r1.set(r0)
        L9f:
            X.7xT r0 = r7.A0K
            r0.E6I(r8, r9)
            goto L27
        La5:
            X.7w3 r1 = r6.A07
            java.lang.String r0 = "Lite-Controller-Thread"
            android.os.Handler r1 = r1.BAu(r0)
            X.C14360o3.A07(r1)
            X.7vG r0 = new X.7vG
            r0.<init>()
            r1.post(r0)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179107xM.A06(X.7xa, X.7y7):void");
    }

    @Override // X.InterfaceC179117xN
    public final void E6I(InterfaceC179247xa interfaceC179247xa, InterfaceC179577y7 interfaceC179577y7) {
        A05(this, interfaceC179247xa, interfaceC179577y7);
    }
}
