package X;

import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.AMg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23128AMg {
    public int A02;
    public int A03;
    public Surface A06;
    public Surface A07;
    public C178927x4 A08;
    public AbstractC180277zH A09;
    public AbstractC180277zH A0A;
    public AbstractC180277zH A0B;
    public C179877yd A0C;
    public EnumC185018Iq A0D;
    public C8J3 A0E;
    public AKR A0F;
    public C55172Odb A0G;
    public String A0H;
    public boolean A0I;
    public final Handler A0K;
    public final C22820A4p A0L;
    public final InterfaceC178337w7 A0N;
    public final C8J4 A0P;
    public final Object A0Q;
    public final String A0R;
    public final boolean A0W;
    public final float[] A0X;
    public volatile boolean A0Y;
    public final AtomicInteger A0V = new AtomicInteger(0);
    public final List A0T = AbstractC166987dD.A1E();
    public final C201278vB A0O = new C201278vB();
    public long A05 = -1;
    public long A04 = -1;
    public final List A0S = AbstractC166987dD.A1E();
    public float A01 = -1.0f;
    public float A00 = -1.0f;
    public final AtomicBoolean A0U = new AtomicBoolean(false);
    public final C22821A4q A0M = new C22821A4q(this);
    public final long A0J = (long) (33.0d * 1000000.0d);

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0134, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013d, code lost:
    
        if (r2 <= 3000000000L) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0140, code lost:
    
        if (r4 >= 3) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C23128AMg r22, float r23, float r24) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23128AMg.A02(X.AMg, float, float):void");
    }

    public static void A00(EnumC185018Iq enumC185018Iq, C8J3 c8j3, C23128AMg c23128AMg, String str, float f, float f2) {
        String A00;
        if (c23128AMg.A08 != null && c23128AMg.A0C != null) {
            AtomicInteger atomicInteger = c23128AMg.A0V;
            if (atomicInteger.get() != 3) {
                A00 = AnonymousClass001.A0O(AbstractC111324zv.A00(1827), atomicInteger.get());
            } else {
                if (c23128AMg.A09 != null || c23128AMg.A0G != null) {
                    C0K8.A0C("BoomerangFramesHandlerImpl", "GL resources have not yet been released");
                    c23128AMg.A0K.post(new RunnableC24270Apb(c23128AMg));
                }
                c23128AMg.A0E = c8j3;
                c23128AMg.A0H = str;
                c23128AMg.A0D = enumC185018Iq;
                c23128AMg.A01 = f;
                c23128AMg.A00 = f2;
                atomicInteger.set(4);
                c23128AMg.A0K.post(new RunnableC24271Apc(c23128AMg));
                return;
            }
        } else {
            A00 = MSV.A00(864);
        }
        C0K8.A0C("BoomerangFramesHandlerImpl", A00);
        A04(c23128AMg, false);
    }

    public static void A01(C23128AMg c23128AMg) {
        Surface surface;
        if (c23128AMg.A08 != null) {
            C55172Odb c55172Odb = new C55172Odb();
            c23128AMg.A0G = c55172Odb;
            c55172Odb.A06 = c23128AMg.A0N;
            c55172Odb.A04 = new C23386AYk(c23128AMg);
            if (c55172Odb.A05(c23128AMg.A03, c23128AMg.A02, (int) (r7 * r6 * (1.0E9d / c23128AMg.A0J) * 4.0d * 0.07d), 0) && (surface = c23128AMg.A0G.A03) != null && surface.isValid()) {
                try {
                    AbstractC180277zH AMi = c23128AMg.A08.AMi(surface);
                    c23128AMg.A09 = AMi;
                    AMi.A05();
                    c23128AMg.A0G.A04(c23128AMg.A0H);
                    AtomicInteger atomicInteger = c23128AMg.A0V;
                    if (atomicInteger.get() == 4) {
                        A02(c23128AMg, c23128AMg.A01, c23128AMg.A00);
                        return;
                    } else {
                        atomicInteger.set(1);
                        return;
                    }
                } catch (Exception unused) {
                    A03(c23128AMg, false);
                    return;
                }
            }
            A03(c23128AMg, false);
        }
    }

    public static void A03(C23128AMg c23128AMg, final boolean z) {
        C8J3 c8j3 = c23128AMg.A0E;
        if (c8j3 != null) {
            c8j3.Dc2(1.0f);
            c23128AMg.A0E = null;
        }
        final C8J4 c8j4 = c23128AMg.A0P;
        String str = c23128AMg.A0R;
        if (!z) {
            C177247uK c177247uK = ((AbstractC184988In) c8j4.A00).A05;
            c177247uK.getClass();
            InterfaceC178717wj interfaceC178717wj = ((C179697yJ) C177247uK.A00(c177247uK)).A00;
            if (interfaceC178717wj != null) {
                interfaceC178717wj.AP1();
            }
        }
        if (C184978Im.A03(c8j4.A00, str)) {
            C176567tE.A00(new Runnable() { // from class: X.AvI
                @Override // java.lang.Runnable
                public final void run() {
                    C8J4 c8j42 = C8J4.this;
                    c8j42.A00.A0E(z);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0071, code lost:
    
        if (r21 != false) goto L20;
     */
    /* JADX WARN: Type inference failed for: r12v2, types: [X.A9w, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(X.C23128AMg r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23128AMg.A04(X.AMg, boolean):void");
    }

    public static void A05(C23128AMg c23128AMg, boolean z) {
        if (c23128AMg.A09 != null && c23128AMg.A0G != null) {
            c23128AMg.A0V.set(3);
            C55172Odb c55172Odb = c23128AMg.A0G;
            if (c55172Odb != null) {
                HandlerC50751MbG handlerC50751MbG = c55172Odb.A05;
                if (handlerC50751MbG == null) {
                    C0K8.A0C(MSV.A00(145), AbstractC111324zv.A00(2755));
                } else {
                    handlerC50751MbG.sendEmptyMessage(3);
                }
            }
            c23128AMg.A0K.post(new RunnableC24270Apb(c23128AMg));
            if (!z) {
                File A11 = AbstractC166987dD.A11(c23128AMg.A0H);
                if (A11.exists()) {
                    A11.deleteOnExit();
                    return;
                }
                return;
            }
            return;
        }
        C0K8.A0C("incorrect boomerang state", "Boomerang tried to finish after rendering resources were released");
        A03(c23128AMg, false);
    }

    public C23128AMg(EnumC185018Iq enumC185018Iq, C22820A4p c22820A4p, InterfaceC178337w7 interfaceC178337w7, C8J4 c8j4, Object obj, String str, String str2, boolean z) {
        float[] fArr = new float[16];
        this.A0X = fArr;
        this.A0R = str;
        this.A0H = str2;
        this.A0P = c8j4;
        this.A0D = enumC185018Iq;
        this.A0Q = obj;
        this.A0N = interfaceC178337w7;
        Matrix.setIdentityM(fArr, 0);
        AbstractC197988p9.A01(fArr);
        this.A0L = c22820A4p;
        this.A0W = z;
        HandlerThread handlerThread = new HandlerThread("BoomerangRenderThread");
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        this.A0K = new Handler(looper);
        for (C8Is c8Is : EnumC185018Iq.A08.A01) {
            ((C185028Ir) c8Is).A00 = 1.2f;
        }
    }
}
