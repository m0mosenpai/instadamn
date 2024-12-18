package X;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.gputimer.GPUTimerImpl;
import com.facebook.proxygen.LigerSamplePolicy;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class Y7X {
    public int A01;
    public int A02;
    public RectF A03;
    public C72171XRf A04;
    public YPm A05;
    public C72844Xor A06;
    public Y68 A07;
    public InterfaceC201628vr A08;
    public InterfaceC185788Ly A09;
    public GPUTimerImpl A0A;
    public boolean A0D;
    public int A0H;
    public long A0I;

    @Deprecated
    public boolean A0J;
    public final C178597wX A0K;
    public final C72798XnL A0L;
    public final Y2B A0M;
    public final C72837XoW A0N;
    public final C72535Xfo A0O;
    public final C72830XoM A0P;
    public final C73348Y9d A0Q;
    public final C73348Y9d A0R;
    public final C72828XoI A0S;
    public final C72673Xkq A0V;
    public final Y1e A0W;
    public final InterfaceC197808or A0X;
    public final InterfaceC197958p6 A0Y;
    public final InterfaceC197978p8 A0Z;
    public final InterfaceC178407wE A0a;
    public final C201608vp A0c;
    public final ArrayList A0d;
    public final ArrayList A0e;
    public final ArrayList A0g;
    public final Map A0h;
    public final float[] A0l;
    public boolean A0G = false;
    public boolean A0B = true;
    public boolean A0F = true;
    public boolean A0C = false;
    public final C201528vh A0j = new C201528vh();
    public final Map A0k = AbstractC166987dD.A1G();
    public final C201278vB A0b = new C201278vB();
    public final C72672Xkp A0T = new C72672Xkp(this);
    public boolean A0E = true;
    public float A00 = 1.0f;
    public final ArrayList A0f = AbstractC166987dD.A1E();
    public final C72831XoN A0U = new C72831XoN(this);
    public final java.util.Set A0i = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void A05(Y7X y7x) {
        y7x.A0F = true;
        C72844Xor c72844Xor = y7x.A06;
        if (c72844Xor.A01()) {
            synchronized (c72844Xor) {
                C0J8.A09(AbstractC167007dF.A1X(c72844Xor.A00, C05F.A00), "Resuming from a non paused state");
                c72844Xor.A00 = C05F.A01;
            }
            Iterator it = y7x.A0f.iterator();
            while (it.hasNext()) {
                ((InterfaceC185788Ly) it.next()).CNg(y7x.A0Y, y7x.A0Z);
            }
            InterfaceC178407wE interfaceC178407wE = y7x.A0a;
            interfaceC178407wE.AkA().Ea9(y7x.A0P.A00.BZA());
            y7x.A0L.A05 = true;
            interfaceC178407wE.CkX(y7x.hashCode(), "media_pipeline_resume", "RenderThreadManager", null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r3.A00 == X.C05F.A0C) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01() {
        /*
            r4 = this;
            X.Xor r3 = r4.A06
            monitor-enter(r3)
            java.lang.Integer r1 = r3.A00     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r0 = X.C05F.A0N     // Catch: java.lang.Throwable -> L37
            if (r1 == r0) goto L10
            java.lang.Integer r2 = r3.A00     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r1 = X.C05F.A0C     // Catch: java.lang.Throwable -> L37
            r0 = 0
            if (r2 != r1) goto L11
        L10:
            r0 = 1
        L11:
            monitor-exit(r3)
            if (r0 != 0) goto L36
            X.XoM r3 = r4.A0P
            r0 = 1
            X.7x1 r2 = r3.A00
            r2.EhY(r0)
            java.lang.Object r1 = r3.A01
            monitor-enter(r1)
            r3.A03 = r0     // Catch: java.lang.Throwable -> L33
            r1.notifyAll()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            X.7wE r0 = r4.A0a
            X.7wL r1 = r0.AkA()
            int r0 = r2.BZA()
            r1.Ea9(r0)
            return
        L33:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            throw r0
        L36:
            return
        L37:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y7X.A01():void");
    }

    @Deprecated
    private void A02() {
        Y2B y2b = this.A0M;
        boolean z = true;
        if (!y2b.A08.A00.CUZ(83)) {
            Iterator A12 = AbstractC43593JPy.A12(y2b.A0C);
            while (true) {
                if (A12.hasNext()) {
                    if (((C200598u2) A12.next()).A05.Ejv()) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        this.A0J = z;
    }

    public static void A03(Surface surface, Y7X y7x, InterfaceC185788Ly interfaceC185788Ly) {
        Y68 y68;
        if (y7x.A0f.contains(interfaceC185788Ly)) {
            C72844Xor c72844Xor = y7x.A06;
            boolean A00 = c72844Xor.A00();
            if (!A00) {
                y7x.A01();
            }
            InterfaceC178897x1 interfaceC178897x1 = y7x.A0P.A00;
            interfaceC185788Ly.CNx(surface, interfaceC178897x1);
            interfaceC185788Ly.Cmi();
            if (c72844Xor.A00() && (y68 = y7x.A07) != null && y68.A08) {
                y68.A06.B8Y();
            }
            if (!A00) {
                synchronized (c72844Xor) {
                    C0J8.A09(AbstractC25229BEm.A1a(c72844Xor.A00, C05F.A00), "Initialized from paused state");
                    c72844Xor.A00 = C05F.A0N;
                }
                Y2B y2b = y7x.A0M;
                y2b.A00 = true;
                Iterator A12 = AbstractC43593JPy.A12(y2b.A0C);
                while (A12.hasNext()) {
                    C200598u2 c200598u2 = (C200598u2) A12.next();
                    c200598u2.A05.Dr7(y2b.A0B);
                    c200598u2.A03 = true;
                }
                C201608vp c201608vp = y7x.A0c;
                C179877yd c179877yd = y2b.A0B;
                c201608vp.A00 = c179877yd;
                InterfaceC201628vr interfaceC201628vr = y7x.A08;
                if (interfaceC201628vr != null) {
                    interfaceC201628vr.Dr7(c179877yd);
                }
                Iterator A16 = AbstractC166997dE.A16(y7x.A0h);
                while (A16.hasNext()) {
                    ((Y68) A16.next()).A05(y7x.A0Q, y7x.A0X);
                    A06(y7x);
                }
                Y68 y682 = y7x.A07;
                if (y682 != null) {
                    A07(y7x, y682.A06.BIB(), y7x.A07.A06.BI0());
                }
                AbstractC180237zD.A02("RenderManager::completeInitialization", new Object[0]);
                if (y7x.A0K.A00.CUZ(96)) {
                    C72171XRf c72171XRf = new C72171XRf();
                    c72171XRf.CNx(c72171XRf.A00(), interfaceC178897x1);
                    y7x.A04 = c72171XRf;
                }
            }
            InterfaceC185788Ly interfaceC185788Ly2 = y7x.A09;
            if (interfaceC185788Ly2 != null && interfaceC185788Ly2 != interfaceC185788Ly) {
                ArrayList A17 = AbstractC25225BEi.A17(1);
                A17.add(interfaceC185788Ly2);
                y7x.A0L(A17);
                y7x.A09 = null;
            }
            C72171XRf c72171XRf2 = y7x.A04;
            if (c72171XRf2 != null) {
                c72171XRf2.Cmi();
            }
            AbstractC180237zD.A02("RenderManager::handleOutputSurfaceCreated", new Object[0]);
        }
    }

    public static void A04(Y7X y7x) {
        long j;
        InterfaceC178407wE interfaceC178407wE = y7x.A0a;
        InterfaceC178477wL AkA = interfaceC178407wE.AkA();
        C72830XoM c72830XoM = y7x.A0P;
        AkA.Ea9(c72830XoM.A00.BZA());
        long hashCode = y7x.hashCode();
        C72798XnL c72798XnL = y7x.A0L;
        HashMap A1G = AbstractC166987dD.A1G();
        C73300Xzr c73300Xzr = c72798XnL.A00;
        if (c73300Xzr != null) {
            C0K8.A0O("AnomalyDetector", "Number of black screens: %d", Long.valueOf(c73300Xzr.A02));
            j = c73300Xzr.A02;
        } else {
            j = 0;
        }
        if (j > 0) {
            A1G.put("number_of_black_screen", String.valueOf(j));
        }
        Xkn xkn = c72798XnL.A02;
        if (xkn != null) {
            long j2 = xkn.A00;
            if (j2 > 0) {
                A1G.put("aspect_ratio_mismatch_frame_count", String.valueOf(j2));
            }
        }
        Y0A y0a = c72798XnL.A01;
        if (y0a != null) {
            C0K8.A0O("AnomalyDetector", "Number of freezes: %d", Long.valueOf(y0a.A01));
            long j3 = y0a.A01;
            if (j3 > 0) {
                A1G.put("number_of_freezes", String.valueOf(j3));
            }
        }
        interfaceC178407wE.CkX(hashCode, "media_pipeline_pause", "RenderThreadManager", A1G);
        c72798XnL.A05 = false;
        Y0A y0a2 = c72798XnL.A01;
        if (y0a2 != null) {
            Y0A.A00(y0a2);
        }
        C72844Xor c72844Xor = y7x.A06;
        synchronized (c72844Xor) {
            c72844Xor.A00 = C05F.A00;
        }
        y7x.A05.stop();
        Y68 y68 = y7x.A07;
        if (y68 != null) {
            InterfaceC199678sJ interfaceC199678sJ = y68.A06;
            if (interfaceC199678sJ != null) {
                interfaceC199678sJ.release();
            }
            y68.A07 = null;
            y68.A0D.A00();
            y68.A08 = false;
        }
        y7x.A0c.DrA();
        y7x.A0M.A02();
        InterfaceC201628vr interfaceC201628vr = y7x.A08;
        if (interfaceC201628vr != null) {
            interfaceC201628vr.DrA();
        }
        y7x.A0N.A00();
        Iterator it = y7x.A0f.iterator();
        while (it.hasNext()) {
            InterfaceC185788Ly interfaceC185788Ly = (InterfaceC185788Ly) it.next();
            interfaceC185788Ly.release();
            synchronized (y7x) {
                y7x.A0i.remove(interfaceC185788Ly);
            }
        }
        C72171XRf c72171XRf = y7x.A04;
        if (c72171XRf != null) {
            c72171XRf.release();
            y7x.A04 = null;
        }
        c72830XoM.A00();
        y7x.A0I = 0L;
    }

    public static void A06(Y7X y7x) {
        Iterator A16 = AbstractC166997dE.A16(y7x.A0h);
        while (A16.hasNext()) {
            if (((Y68) A16.next()).A05 != EnumC197748ol.DISABLE) {
                C72837XoW c72837XoW = y7x.A0N;
                C179877yd c179877yd = y7x.A0M.A0B;
                InterfaceC178897x1 interfaceC178897x1 = y7x.A0P.A00;
                Iterator it = c72837XoW.A02.iterator();
                while (it.hasNext()) {
                    ((InterfaceC73611YPy) it.next()).CNr(interfaceC178897x1, c179877yd);
                }
                return;
            }
        }
        y7x.A0N.A00();
    }

    public static void A07(Y7X y7x, int i, int i2) {
        if (y7x.A07 != null) {
            y7x.A0M.A03(i, i2);
            InterfaceC201628vr interfaceC201628vr = y7x.A08;
            if (interfaceC201628vr != null) {
                interfaceC201628vr.Dr3(i, i2);
            }
        }
        A08(y7x, y7x.A07);
    }

    public static void A08(Y7X y7x, Y68 y68) {
        Y68 y682 = y7x.A07;
        if (y68 == y682 && y682 != null) {
            Y2B y2b = y7x.A0M;
            RectF rectF = y682.A03;
            y2b.A07.set(rectF);
            Iterator A12 = AbstractC43593JPy.A12(y2b.A0C);
            while (A12.hasNext()) {
                ((C200598u2) A12.next()).A05.Dr8(rectF);
            }
        }
    }

    public static void A09(Y7X y7x, AbstractC223559ty abstractC223559ty, String str, Map map) {
        if (!y7x.A0D) {
            y7x.A0a.CkW(abstractC223559ty, AbstractC111324zv.A00(2707), "RenderThreadManager", "medium", str, map, y7x.hashCode());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004c, code lost:
    
        if (r13 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0C(X.Y68 r24, X.InterfaceC185788Ly r25, X.C200688uB r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y7X.A0C(X.Y68, X.8Ly, X.8uB, boolean):void");
    }

    private void A0E(String str) {
        ArrayList arrayList = this.A0S.A02;
        HashMap A0g = AbstractC72046XLm.A0g(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC185788Ly interfaceC185788Ly = (InterfaceC185788Ly) it.next();
            A0g.put(interfaceC185788Ly.BOj(), AnonymousClass001.A0P("x", interfaceC185788Ly.getWidth(), interfaceC185788Ly.getHeight()));
        }
        InterfaceC178407wE interfaceC178407wE = this.A0a;
        interfaceC178407wE.AkA().ESf(A0g);
        interfaceC178407wE.CkX(hashCode(), str, "RenderThreadManager", null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:13|(2:15|(4:17|(2:20|18)|21|22))|23|(2:24|(2:26|(1:139)(2:30|31))(1:141))|32|(13:36|37|38|(1:40)(1:122)|41|42|(5:44|(4:46|(2:49|50)|51|52)|60|51|52)(4:b7|54|55|56)|98|(1:100)|101|102|33|34)|125|126|(8:128|(2:131|129)|132|97|98|(0)|101|102)|(1:104)|98|(0)|101|102) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0139, code lost:
    
        r0 = "<null>";
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x013c, code lost:
    
        r0 = "<null>";
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00fe, code lost:
    
        r4 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011b, code lost:
    
        r0 = r0.BOj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0126, code lost:
    
        r0 = r5.BOj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0143, code lost:
    
        A09(r18, new X.AbstractC223559ty("RenderManager::renderTextureToOutputs exceeded retryable errors", r4, 30000), "RenderThreadManager::renderTextureToOutputs", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0150, code lost:
    
        if ((r4 instanceof java.lang.RuntimeException) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0154, code lost:
    
        throw ((java.lang.RuntimeException) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015a, code lost:
    
        throw new java.lang.RuntimeException(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015b, code lost:
    
        if (r17 != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015d, code lost:
    
        r4 = r18.A0k;
        r3 = X.AbstractC166997dE.A16(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0169, code lost:
    
        r12.A0D.A01((X.C200688uB) r3.next());
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011b A[Catch: all -> 0x018f, TryCatch #7 {all -> 0x018f, blocks: (B:34:0x007c, B:36:0x0082, B:38:0x0088, B:40:0x009c, B:56:0x00d6, B:76:0x0105, B:78:0x011b, B:79:0x011f, B:81:0x0126, B:82:0x012a, B:85:0x0143, B:87:0x0152, B:88:0x0154, B:89:0x0155, B:90:0x015a, B:126:0x00db), top: B:33:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0126 A[Catch: all -> 0x018f, TryCatch #7 {all -> 0x018f, blocks: (B:34:0x007c, B:36:0x0082, B:38:0x0088, B:40:0x009c, B:56:0x00d6, B:76:0x0105, B:78:0x011b, B:79:0x011f, B:81:0x0126, B:82:0x012a, B:85:0x0143, B:87:0x0152, B:88:0x0154, B:89:0x0155, B:90:0x015a, B:126:0x00db), top: B:33:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0143 A[Catch: all -> 0x018f, TryCatch #7 {all -> 0x018f, blocks: (B:34:0x007c, B:36:0x0082, B:38:0x0088, B:40:0x009c, B:56:0x00d6, B:76:0x0105, B:78:0x011b, B:79:0x011f, B:81:0x0126, B:82:0x012a, B:85:0x0143, B:87:0x0152, B:88:0x0154, B:89:0x0155, B:90:0x015a, B:126:0x00db), top: B:33:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:? -> B:51:0x00d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0F(X.C72828XoI r19) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y7X.A0F(X.XoI):boolean");
    }

    public final InterfaceC178897x1 A0H() {
        C72830XoM c72830XoM = this.A0P;
        Object obj = c72830XoM.A01;
        synchronized (obj) {
            while (!c72830XoM.A03) {
                try {
                    obj.wait(2500L);
                } catch (InterruptedException unused) {
                    throw AbstractC166987dD.A18("Difficulties waiting for the context to be set up");
                }
            }
        }
        return c72830XoM.A00;
    }

    public final void A0I(YPm yPm) {
        C72669Xkk c72669Xkk;
        C72669Xkk c72669Xkk2;
        InterfaceC199678sJ interfaceC199678sJ;
        Y0A y0a;
        C72798XnL c72798XnL = this.A0L;
        if (c72798XnL.A04 && c72798XnL.A05 && (y0a = c72798XnL.A01) != null) {
            y0a.A00 = SystemClock.uptimeMillis();
        }
        this.A0W.A01(this.A0R, C9PW.A00);
        this.A0E = true;
        if (yPm == null) {
            yPm = this.A05;
        }
        Y68 CFD = yPm.CFD();
        if (this.A06.A00() && CFD != null && CFD.A06 != null && this.A0F) {
            Y68 y68 = this.A07;
            if (y68 != null && (interfaceC199678sJ = y68.A06) != null && interfaceC199678sJ.EGy()) {
                CFD.A06(y68);
            }
            Y68 y682 = this.A07;
            if (y682 != null && yPm == y682.A04) {
                this.A0a.ECU(System.nanoTime());
                GPUTimerImpl gPUTimerImpl = this.A0A;
                if (gPUTimerImpl != null) {
                    gPUTimerImpl.beginFrame();
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            while (true) {
                ArrayList arrayList = this.A0e;
                if (i2 >= arrayList.size()) {
                    break;
                }
                C72828XoI c72828XoI = (C72828XoI) arrayList.get(i2);
                if (this.A0h.get(c72828XoI.A00) == CFD) {
                    if (c72828XoI.A00()) {
                        CFD.A04();
                    }
                    z |= A0F(c72828XoI);
                }
                i2++;
            }
            int i3 = 0;
            while (true) {
                ArrayList arrayList2 = this.A0d;
                if (i >= arrayList2.size()) {
                    break;
                }
                C72828XoI c72828XoI2 = (C72828XoI) arrayList2.get(i3);
                if (i != 0 && System.currentTimeMillis() - currentTimeMillis >= Long.MAX_VALUE) {
                    i3++;
                } else {
                    if (c72828XoI2.A00()) {
                        CFD.A04();
                    }
                    z |= A0F(c72828XoI2);
                    arrayList2.remove(i3);
                    arrayList2.add(c72828XoI2);
                }
                i++;
            }
            Y68 y683 = this.A07;
            if (y683 != null && yPm == y683.A04) {
                this.A0a.ECT(System.nanoTime(), z);
                GPUTimerImpl gPUTimerImpl2 = this.A0A;
                if (gPUTimerImpl2 != null) {
                    gPUTimerImpl2.endFrame();
                }
            }
            if (this.A0I == 0 && (c72669Xkk2 = (C72669Xkk) this.A0Q.A06.get()) != null) {
                c72669Xkk2.A00.A0G.post(new YGC(c72669Xkk2));
            }
            if (this.A0I == 10 && (c72669Xkk = (C72669Xkk) this.A0Q.A06.get()) != null) {
                Y2I y2i = c72669Xkk.A00;
                if (y2i.A07 != null) {
                    y2i.A0G.post(new YGD(c72669Xkk));
                }
            }
            this.A0I++;
            if (c72798XnL.A04 && c72798XnL.A05) {
                if (c72798XnL.A03) {
                    c72798XnL.A03 = false;
                    Y0A y0a2 = c72798XnL.A01;
                    if (y0a2 != null) {
                        synchronized (y0a2) {
                            Handler handler = y0a2.A02;
                            if (handler == null) {
                                y0a2.A02 = C175907s4.A01("FreezeDetector");
                            } else {
                                handler.removeCallbacksAndMessages(null);
                            }
                            y0a2.A02.postDelayed(y0a2.A04, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                            y0a2.A00 = 0L;
                            y0a2.A01 = 0L;
                        }
                    }
                } else {
                    C73300Xzr c73300Xzr = c72798XnL.A00;
                    if (c73300Xzr != null) {
                        C73300Xzr.A00(c73300Xzr);
                    }
                }
            }
        }
        yPm.DII();
    }

    public final void A0J(C72748XmP c72748XmP) {
        InterfaceC179247xa interfaceC179247xa = c72748XmP.A00;
        if (interfaceC179247xa != null) {
            boolean z = interfaceC179247xa.CBM().A01;
            InterfaceC179577y7 interfaceC179577y7 = c72748XmP.A01;
            if (interfaceC179577y7 != null) {
                interfaceC179577y7.DfO(interfaceC179247xa);
                if (c72748XmP.A00.CBM() == EnumC179217xX.A0Y) {
                    A02();
                }
            } else if (c72748XmP.A02 != null) {
                for (int i = 0; i < c72748XmP.A02.size(); i++) {
                    InterfaceC179577y7 interfaceC179577y72 = (InterfaceC179577y7) ((Reference) c72748XmP.A02.get(i)).get();
                    if (interfaceC179577y72 != null) {
                        interfaceC179577y72.DfO(c72748XmP.A00);
                    }
                }
            }
            if (!z) {
                AbstractC177837vH.A01(this.A0a, "RenderThreadManager", this.A0M.A01(), hashCode());
            }
            C72673Xkq c72673Xkq = this.A0V;
            c72748XmP.A00 = null;
            c72748XmP.A02 = null;
            c72748XmP.A01 = null;
            synchronized (c72673Xkq) {
                c72673Xkq.A00.add(c72748XmP);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [X.8Ly, X.8Lx, X.XRf, java.lang.Object] */
    public final void A0K(List list) {
        boolean A1X;
        if (this.A0K.A00.CUZ(102)) {
            C72844Xor c72844Xor = this.A06;
            synchronized (c72844Xor) {
                A1X = AbstractC167007dF.A1X(c72844Xor.A00, C05F.A01);
            }
            if (A1X) {
                A01();
                synchronized (c72844Xor) {
                    C0J8.A09(AbstractC25229BEm.A1a(c72844Xor.A00, C05F.A00), "Waiting for output from paused state");
                    c72844Xor.A00 = C05F.A0C;
                }
                ?? abstractC185778Lx = new AbstractC185778Lx();
                abstractC185778Lx.A01 = 1;
                abstractC185778Lx.A00 = 1;
                this.A09 = abstractC185778Lx;
                ArrayList A17 = AbstractC25225BEi.A17(1);
                A17.add(abstractC185778Lx);
                A0K(A17);
            }
        }
        A0B(this, list);
        C72828XoI c72828XoI = this.A0S;
        C0J8.A08(AbstractC167007dF.A1W(list), "Passed null outputs to renderpass add");
        for (Object obj : list) {
            ArrayList arrayList = c72828XoI.A02;
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
        }
        Collections.sort(c72828XoI.A02, new C50585MUv(c72828XoI, 0));
        A0E("media_pipeline_add_output");
    }

    public final void A0L(List list) {
        A0E("media_pipeline_remove_output");
        A0A(this, list);
        C72828XoI c72828XoI = this.A0S;
        C0J8.A08(AbstractC167007dF.A1W(list), "Passed null outputs to renderpass remove");
        c72828XoI.A02.removeAll(list);
        for (Object obj : list) {
            if (obj != null) {
                this.A0i.remove(obj);
            }
        }
    }

    public final void A0M(List list) {
        ArrayList arrayList = this.A0S.A01;
        A0D(null, arrayList);
        Y2B y2b = this.A0M;
        y2b.A04(list);
        y2b.A05(arrayList);
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        for (InterfaceC73611YPy interfaceC73611YPy : this.A0N.A02) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C200598u2 c200598u2 = (C200598u2) it.next();
                EnumC200638u6 B7w = interfaceC73611YPy.B7w();
                C200608u3 c200608u3 = c200598u2.A04;
                if (c200608u3 != null && C200608u3.A04.contains(B7w)) {
                    A1E.add(c200608u3);
                }
            }
            interfaceC73611YPy.EcA(A1E);
        }
        InterfaceC178407wE interfaceC178407wE = this.A0a;
        A0D(interfaceC178407wE, arrayList);
        A02();
        AbstractC177837vH.A01(interfaceC178407wE, "RenderThreadManager", y2b.A01(), hashCode());
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, X.YPm] */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.Xfo, java.lang.Object] */
    public Y7X(C178597wX c178597wX, C72798XnL c72798XnL, Y2B y2b, C73348Y9d c73348Y9d, C73348Y9d c73348Y9d2, Y1e y1e, InterfaceC197808or interfaceC197808or, InterfaceC197958p6 interfaceC197958p6, InterfaceC197978p8 interfaceC197978p8, InterfaceC178897x1 interfaceC178897x1, InterfaceC178407wE interfaceC178407wE, C201608vp c201608vp, List list, int i) {
        float[] fArr = new float[16];
        this.A0l = fArr;
        this.A0M = y2b;
        this.A0Y = interfaceC197958p6;
        this.A0X = interfaceC197808or;
        this.A0Z = interfaceC197978p8;
        this.A0Q = c73348Y9d;
        this.A0K = c178597wX;
        this.A0W = y1e;
        this.A0R = c73348Y9d2;
        this.A0P = new C72830XoM(interfaceC178897x1, c178597wX.A00.CUZ(78) ? 3 : 2);
        this.A0c = c201608vp;
        this.A0V = new C72673Xkq();
        this.A06 = new C72844Xor();
        this.A01 = i;
        Matrix.setIdentityM(fArr, 0);
        this.A0a = interfaceC178407wE;
        this.A0L = c72798XnL;
        this.A0A = null;
        this.A0H = 0;
        this.A05 = new Object();
        C72828XoI c72828XoI = new C72828XoI();
        this.A0S = c72828XoI;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0e = A1E;
        A1E.add(c72828XoI);
        this.A0d = AbstractC166987dD.A1E();
        this.A0N = new C72837XoW(c178597wX, list);
        this.A0O = new Object();
        this.A0h = AbstractC166987dD.A1G();
        this.A0D = false;
        this.A0g = AbstractC166987dD.A1E();
        this.A0I = 0L;
        c72798XnL.A05 = true;
        interfaceC178407wE.CkX(hashCode(), "media_pipeline_start", "RenderThreadManager", null);
    }

    public static void A0A(Y7X y7x, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC185788Ly interfaceC185788Ly = (InterfaceC185788Ly) it.next();
            if (interfaceC185788Ly != null) {
                ArrayList arrayList = y7x.A0f;
                if (arrayList.contains(interfaceC185788Ly)) {
                    interfaceC185788Ly.destroy();
                    if (interfaceC185788Ly instanceof InterfaceC197928p3) {
                        y7x.A0g.add(((InterfaceC197928p3) interfaceC185788Ly).Bmm());
                    }
                    arrayList.remove(interfaceC185788Ly);
                }
            }
        }
    }

    public static void A0B(Y7X y7x, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC185788Ly interfaceC185788Ly = (InterfaceC185788Ly) it.next();
            C0J8.A08(AbstractC167007dF.A1W(interfaceC185788Ly), "videoOutput cannot be null.");
            ArrayList arrayList = y7x.A0f;
            if (!arrayList.contains(interfaceC185788Ly)) {
                if (!y7x.A06.A01()) {
                    interfaceC185788Ly.CNg(y7x.A0Y, y7x.A0Z);
                }
                arrayList.add(interfaceC185788Ly);
                if (interfaceC185788Ly instanceof InterfaceC197928p3) {
                    y7x.A0g.add(((InterfaceC197928p3) interfaceC185788Ly).Bml());
                }
            }
        }
    }

    public static void A0D(InterfaceC178407wE interfaceC178407wE, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C81A c81a = ((C200598u2) it.next()).A05;
            if (c81a instanceof AnonymousClass818) {
                ((AnonymousClass818) c81a).A0G(interfaceC178407wE);
            }
        }
    }

    private boolean A0G(InterfaceC185788Ly interfaceC185788Ly) {
        if (interfaceC185788Ly.AFZ() && interfaceC185788Ly.getWidth() > 0 && interfaceC185788Ly.getHeight() > 0 && !this.A0i.contains(interfaceC185788Ly)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        if (r0 != null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.C200688uB A00(X.C72828XoI r20, X.Y68 r21, X.InterfaceC185788Ly r22, X.C200688uB r23, X.C201278vB r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y7X.A00(X.XoI, X.Y68, X.8Ly, X.8uB, X.8vB, boolean, boolean):X.8uB");
    }
}
