package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class Y2I {
    public YPH A00;
    public C73346Y9b A01;
    public C73347Y9c A02;
    public InterfaceC199678sJ A03;
    public YOk A04;
    public C174867qM A05;
    public A52 A06;
    public C72684XlB A07;
    public Integer A08;
    public Integer A09;
    public HashMap A0A;
    public C72669Xkk A0B;
    public AnonymousClass818 A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Handler A0G;
    public final YNV A0H;
    public final C178597wX A0I;
    public final C73348Y9d A0J;
    public final Y1e A0K;
    public final InterfaceC178407wE A0L;
    public final InterfaceC179187xU A0M;
    public final XiF A0N;
    public final Context A0Q;
    public final C72798XnL A0R;
    public final C179877yd A0S;
    public final ArrayList A0T;
    public final Map A0U;
    public final Object A0P = AbstractC58318PtA.A0b();
    public volatile boolean A0W = false;
    public volatile WeakReference A0V = AbstractC25225BEi.A16(null);
    public final Object A0O = AbstractC58318PtA.A0b();

    public final synchronized void A08(List list) {
        ArrayList arrayList = this.A0T;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C200598u2 c200598u2 = (C200598u2) it.next();
            if (!list.contains(c200598u2)) {
                InterfaceC179187xU interfaceC179187xU = c200598u2.A02;
                if (interfaceC179187xU != null) {
                    interfaceC179187xU.F9X((InterfaceC179577y7) c200598u2.A05);
                }
                C81A c81a = c200598u2.A05;
                if (c81a instanceof InterfaceC179577y7) {
                    ((InterfaceC179577y7) c81a).Ecb(null);
                }
            }
        }
        arrayList.clear();
        this.A0C = null;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C200598u2 c200598u22 = (C200598u2) it2.next();
            InterfaceC179187xU interfaceC179187xU2 = this.A0M;
            C81A c81a2 = c200598u22.A05;
            if (c81a2 instanceof InterfaceC179577y7) {
                c200598u22.A02 = interfaceC179187xU2;
                ((InterfaceC179577y7) c81a2).Ecb(interfaceC179187xU2);
            }
            if (c81a2 instanceof AnonymousClass818) {
                this.A0C = (AnonymousClass818) c81a2;
            }
        }
        arrayList.addAll(list);
        C73348Y9d.A00(this.A0J, AbstractC166987dD.A1F(arrayList), 15);
    }

    public static void A00(Y2I y2i) {
        InterfaceC174767qC interfaceC174767qC;
        A52 a52;
        C22986ABl c22986ABl;
        Y1e y1e = y2i.A0K;
        boolean A03 = y1e.A03(EnumC179217xX.A0N);
        boolean A032 = y1e.A03(EnumC179217xX.A0O);
        boolean A033 = y1e.A03(EnumC179217xX.A0C);
        if (y2i.A0E != A03) {
            y2i.A0E = A03;
            A52 a522 = y2i.A06;
            if (a522 != null && (c22986ABl = a522.A00.A03) != null) {
                c22986ABl.A06 = A03;
                c22986ABl.A00();
            }
        }
        if (y2i.A0D != A033) {
            y2i.A0D = A033;
            HashMap hashMap = y2i.A0A;
            if (hashMap != null && (a52 = y2i.A06) != null) {
                C1813282k c1813282k = a52.A00;
                InterfaceC174767qC interfaceC174767qC2 = c1813282k.A02;
                if (interfaceC174767qC2 != null) {
                    interfaceC174767qC2.ARY(hashMap, A033);
                }
                InterfaceC174857qL interfaceC174857qL = c1813282k.A04;
                if (interfaceC174857qL != null) {
                    interfaceC174857qL.ARX(A033);
                }
            }
        }
        if (y2i.A0F != A032) {
            y2i.A0F = A032;
            A52 a523 = y2i.A06;
            if (a523 != null && (interfaceC174767qC = a523.A00.A02) != null) {
                interfaceC174767qC.EUn(A032);
            }
        }
    }

    public final void A01() {
        boolean z;
        Integer num = C05F.A0C;
        synchronized (this.A0O) {
            if (this.A09 != num) {
                this.A09 = num;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            C73348Y9d c73348Y9d = this.A0J;
            synchronized (c73348Y9d.A05) {
                Handler handler = c73348Y9d.A00;
                handler.removeMessages(3);
                handler.removeMessages(4);
                C73348Y9d.A01(c73348Y9d, new Object[0], 14);
            }
            this.A03 = null;
            this.A00 = null;
            this.A0B = null;
            InterfaceC178407wE interfaceC178407wE = this.A0L;
            if (interfaceC178407wE != null) {
                interfaceC178407wE.destroy();
            }
        }
    }

    public final void A02() {
        A07(C05F.A01);
        C73348Y9d c73348Y9d = this.A0J;
        Handler handler = c73348Y9d.A00;
        handler.removeMessages(3);
        handler.removeMessages(4);
        C73348Y9d.A01(c73348Y9d, new Object[0], 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r8.EGy() == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.7oK, X.7xa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.7oL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.7oM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.Y9b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.InterfaceC199678sJ r8, X.YOk r9) {
        /*
            r7 = this;
            X.8sJ r0 = r7.A03
            if (r0 == r8) goto L4e
            r7.A03 = r8
            X.Y9d r5 = r7.A0J
            r0 = 7
            X.C73348Y9d.A00(r5, r8, r0)
            r6 = r7
            monitor-enter(r6)
            X.8sJ r0 = r7.A03     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L4d
            boolean r0 = r0.EGx()     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L29
            X.Y9b r1 = r7.A01     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L23
            X.Y9b r1 = new X.Y9b     // Catch: java.lang.Throwable -> L4a
            r1.<init>()     // Catch: java.lang.Throwable -> L4a
            r7.A01 = r1     // Catch: java.lang.Throwable -> L4a
        L23:
            r0 = 19
            X.C73348Y9d.A00(r5, r1, r0)     // Catch: java.lang.Throwable -> L4a
            goto L4d
        L29:
            X.Y9c r4 = r7.A02     // Catch: java.lang.Throwable -> L4a
            if (r4 != 0) goto L34
            X.Y9c r4 = new X.Y9c     // Catch: java.lang.Throwable -> L4a
            r4.<init>()     // Catch: java.lang.Throwable -> L4a
            r7.A02 = r4     // Catch: java.lang.Throwable -> L4a
        L34:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L4a
            r1 = 1
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L4a
            long r2 = r3.convert(r1, r0)     // Catch: java.lang.Throwable -> L4a
            r0 = 30
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L4a
            r4.A02 = r0     // Catch: java.lang.Throwable -> L4a
            X.Y9c r1 = r7.A02     // Catch: java.lang.Throwable -> L4a
            goto L23
        L4a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L4d:
            monitor-exit(r6)
        L4e:
            r7.A04 = r9
            if (r8 == 0) goto L59
            boolean r0 = r8.EGy()
            r1 = 1
            if (r0 != 0) goto L5a
        L59:
            r1 = 0
        L5a:
            X.7oJ r0 = new X.7oJ
            r0.<init>(r1)
            r7.A05(r0)
            if (r8 == 0) goto L95
            int r2 = r8.Bfz()
            int r1 = r8.Bfo()
            X.7oK r0 = new X.7oK
            r0.<init>()
            r0.A01 = r2
            r0.A00 = r1
            r7.A05(r0)
            if (r9 != 0) goto L9b
            r1 = 0
            X.7oM r0 = new X.7oM
            r0.<init>()
            r0.A00 = r1
            r0.A01 = r1
        L84:
            r7.A05(r0)
            if (r9 != 0) goto L96
            java.lang.Integer r1 = X.C05F.A01
            X.7oL r0 = new X.7oL
            r0.<init>()
            r0.A00 = r1
        L92:
            r7.A05(r0)
        L95:
            return
        L96:
            X.7oL r0 = r9.BHz()
            goto L92
        L9b:
            X.7oM r0 = r9.BI4()
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y2I.A03(X.8sJ, X.YOk):void");
    }

    public final void A04(InterfaceC185788Ly interfaceC185788Ly) {
        if (interfaceC185788Ly instanceof InterfaceC179577y7) {
            ((InterfaceC179577y7) interfaceC185788Ly).Ecb(this.A0M);
        }
        C73348Y9d c73348Y9d = this.A0J;
        ArrayList A17 = AbstractC25225BEi.A17(1);
        A17.add(interfaceC185788Ly);
        C73348Y9d.A00(c73348Y9d, A17, 8);
    }

    public final void A05(InterfaceC179247xa interfaceC179247xa) {
        this.A0K.A01(this.A0J, interfaceC179247xa);
    }

    public final void A06(InterfaceC179247xa interfaceC179247xa, InterfaceC179577y7 interfaceC179577y7) {
        Y1e y1e = this.A0K;
        C73348Y9d c73348Y9d = this.A0J;
        C72748XmP c72748XmP = null;
        Map map = y1e.A00;
        synchronized (map) {
            EnumC179217xX CBM = interfaceC179247xa.CBM();
            WeakReference A00 = Y1e.A00(y1e, interfaceC179577y7, CBM);
            if (A00 == null) {
                C0K8.A0D("RendererEventHelper", "Received an event for a renderer that wasn't registered");
                return;
            }
            InterfaceC179577y7 interfaceC179577y72 = (InterfaceC179577y7) A00.get();
            if (interfaceC179577y72 != null) {
                c72748XmP = c73348Y9d.A02();
                c72748XmP.A00 = interfaceC179247xa;
                c72748XmP.A01 = interfaceC179577y72;
            } else {
                ((C1814082s) map.get(CBM)).A02(A00);
            }
            if (c72748XmP != null) {
                c73348Y9d.A03(c72748XmP);
            }
        }
    }

    public final void A07(Integer num) {
        synchronized (this.A0O) {
            this.A09 = num;
        }
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, X.Xkn] */
    public Y2I(Context context, Handler handler, HandlerThread handlerThread, YNV ynv, C178597wX c178597wX, InterfaceC178897x1 interfaceC178897x1, InterfaceC178407wE interfaceC178407wE, XiF xiF, int i) {
        InterfaceC178407wE interfaceC178407wE2 = interfaceC178407wE;
        InterfaceC178897x1 interfaceC178897x12 = interfaceC178897x1;
        this.A0G = handler;
        Y1e y1e = new Y1e();
        this.A0K = y1e;
        this.A0M = new YCK(this);
        this.A0I = c178597wX;
        this.A0Q = context;
        this.A0N = xiF;
        this.A0U = AbstractC166987dD.A1G();
        C179877yd c179877yd = new C179877yd(context.getResources());
        this.A0S = c179877yd;
        boolean z = true;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            z = false;
        }
        C0J8.A08(z, AnonymousClass001.A0O("Invalid value passed as device rotation, must be a Surface rotation enum value. Value = ", i));
        interfaceC178407wE2 = interfaceC178407wE == null ? new C201438vY() : interfaceC178407wE2;
        this.A0L = interfaceC178407wE2;
        this.A0B = new C72669Xkk(this);
        C72798XnL c72798XnL = new C72798XnL();
        this.A0R = c72798XnL;
        InterfaceC178337w7 interfaceC178337w7 = c178597wX.A00;
        c72798XnL.A04 = interfaceC178337w7.CUZ(79);
        if (c72798XnL.A04) {
            if (c72798XnL.A00 == null) {
                c72798XnL.A00 = new C73300Xzr();
            }
            if (c72798XnL.A02 == null) {
                c72798XnL.A02 = new Object();
            }
            if (c72798XnL.A01 == null) {
                Y0A y0a = new Y0A();
                c72798XnL.A01 = y0a;
                y0a.A03 = new C72671Xkm(c72798XnL);
            }
        } else {
            c72798XnL.A00 = null;
            c72798XnL.A02 = null;
            Y0A y0a2 = c72798XnL.A01;
            if (y0a2 != null) {
                Y0A.A00(y0a2);
                c72798XnL.A01 = null;
            }
        }
        C72669Xkk c72669Xkk = this.A0B;
        Y2B y2b = new Y2B(c178597wX, c72798XnL, c179877yd, new C201608vp());
        if (interfaceC178897x1 == null) {
            interfaceC178897x12 = C178917x3.A00(interfaceC178337w7.CUZ(78) ? 3 : 2);
        }
        this.A0J = new C73348Y9d(handlerThread, c72669Xkk, c178597wX, c72798XnL, y2b, y1e, interfaceC178897x12, interfaceC178407wE2, new C201608vp(), Collections.emptyList(), i);
        C0J8.A03(ynv, "Must provide exception callback");
        this.A0H = ynv;
        this.A0T = AbstractC166987dD.A1E();
        A07(C05F.A00);
    }
}
