package X;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.Timeline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes12.dex */
public final class Y8T implements YNE, YRE {
    public static final Y8T $redex_init_class = null;
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public C72841Xoc A04;
    public Y1V A05;
    public Y1V A06;
    public Y1L A07;
    public Y1N A08;
    public C73290Xzd A09;
    public Y4C A0A;
    public YMO A0B;
    public Object A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public Y1h A0G;
    public Y1V A0H;
    public C73309Y1m A0I;
    public C72903Xqg A0J;
    public Y1R A0K;
    public boolean A0L;
    public boolean A0M;
    public final Looper A0N;
    public final Y1L A0O;
    public final YNE A0P;
    public final C72843Xop A0Q;
    public final C62960SZd A0R;
    public final YM5 A0S;
    public final C73311Y1r A0T;
    public final Y3V A0U;
    public final YMA A0V;
    public final Y8B A0W;
    public final YRD A0X;
    public final C72743XmJ A0Y;
    public final List A0Z;
    public final CopyOnWriteArraySet A0a;
    public final long A0b;
    public final Context A0c;
    public final YQ7 A0d;
    public final Y0r A0e;
    public final SD0 A0f;
    public final Y8E A0g;
    public final C73333Y8o A0h;
    public final C72663Xke A0i;
    public final C72664Xkf A0j;
    public final YQE A0k;
    public final Xf2 A0l;
    public final YMU A0m;
    public final YRF[] A0n;

    static {
        C63102Sd5.A00("media3.exoplayer");
    }

    private C72856XpC A00(YNI yni) {
        Y4C y4c = this.A0A;
        Timeline timeline = y4c.A06;
        if (AbstractC167007dF.A1N(timeline.A02())) {
            Y8B y8b = this.A0W;
            return new C72856XpC(y8b.A0C, timeline, this.A0d, y8b, yni);
        }
        timeline.A09(this.A0Q, y4c.A09.A04);
        throw C00O.createAndThrow();
    }

    public static void A02(Y8T y8t) {
        IllegalStateException illegalStateException;
        Y0r y0r = y8t.A0e;
        synchronized (y0r) {
            boolean z = false;
            while (!y0r.A00) {
                try {
                    y0r.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                AbstractC58318PtA.A18();
            }
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = y8t.A0N;
        if (currentThread != looper.getThread()) {
            Object[] objArr = {currentThread.getName(), looper.getThread().getName()};
            String format = String.format(Locale.US, AbstractC111324zv.A00(3709), objArr);
            if (!y8t.A0M) {
                if (y8t.A0L) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                AbstractC63374Sil.A06("ExoPlayerImpl", format, illegalStateException);
                y8t.A0L = true;
                return;
            }
            throw AbstractC166987dD.A14(format);
        }
    }

    public static void A03(Y8T y8t, final int i, final int i2) {
        C73309Y1m c73309Y1m = y8t.A0I;
        if (i != c73309Y1m.A01 || i2 != c73309Y1m.A00) {
            y8t.A0I = new C73309Y1m(i, i2);
            C73311Y1r c73311Y1r = y8t.A0T;
            c73311Y1r.A02(new YNF() { // from class: X.Y8Z
                @Override // X.YNF
                public final void CP5(Object obj) {
                    int i3 = i;
                    int i4 = i2;
                    Y8T y8t2 = Y8T.$redex_init_class;
                    ((YQ5) obj).DrK(i3, i4);
                }
            }, 24);
            c73311Y1r.A01();
            A06(y8t, new C73309Y1m(i, i2), 2, 14);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x027b, code lost:
    
        r0 = new X.Y1L(r4.A00());
        r14.A07 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x028a, code lost:
    
        if (r0.equals(r2) != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x028c, code lost:
    
        X.C73311Y1r.A00(r14.A0T, r14, 11, 13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0295, code lost:
    
        r14.A0T.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x029e, code lost:
    
        if (r3.A0F == r15.A0F) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02a0, code lost:
    
        r1 = r14.A0a.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02aa, code lost:
    
        if (r1.hasNext() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ac, code lost:
    
        A01(((X.Y8E) ((X.YM9) r1.next())).A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01cb, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ab, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0210, code lost:
    
        r1 = r4.Aub();
        r0 = r4.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0131, code lost:
    
        if (r10 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0058, code lost:
    
        if (r3.A0C.equals(r15.A0C) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
    
        if (r10 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0137, code lost:
    
        if (r3.A00 != r15.A00) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0139, code lost:
    
        X.C73311Y1r.A00(r14.A0T, r15, 0, 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0143, code lost:
    
        if (r3.A02 == r15.A02) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0145, code lost:
    
        X.C73311Y1r.A00(r14.A0T, r15, 1, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0154, code lost:
    
        if (r3.A07() == r15.A07()) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0156, code lost:
    
        X.C73311Y1r.A00(r14.A0T, r15, 2, 7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0165, code lost:
    
        if (r3.A05.equals(r15.A05) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0167, code lost:
    
        X.C73311Y1r.A00(r14.A0T, r15, 3, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016f, code lost:
    
        r2 = r14.A07;
        r4 = r14.A0P;
        r1 = r14.A0O;
        r4 = (X.Y8T) r4;
        A02(r4);
        r9 = X.MSY.A1S(-1, -1);
        r5 = X.AbstractC72048XLo.A04(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x018a, code lost:
    
        if (X.AbstractC167007dF.A1N(r5.A02()) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018c, code lost:
    
        r5 = X.AbstractC72048XLo.A04(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0198, code lost:
    
        if (X.AbstractC167007dF.A1N(r5.A02()) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019a, code lost:
    
        r0 = r4.Aub();
        A02(r4);
        A02(r4);
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a9, code lost:
    
        if (r5.A03(r0) != (-1)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ac, code lost:
    
        r5 = X.AbstractC72048XLo.A04(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b8, code lost:
    
        if (X.AbstractC167007dF.A1N(r5.A02()) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ba, code lost:
    
        r0 = r4.Aub();
        A02(r4);
        A02(r4);
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c9, code lost:
    
        if (r5.A04(r0, false) != (-1)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01cc, code lost:
    
        r5 = X.AbstractC72048XLo.A04(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d8, code lost:
    
        if (X.AbstractC167007dF.A1N(r5.A02()) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01da, code lost:
    
        r5 = X.AbstractC72048XLo.A04(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e6, code lost:
    
        if (X.AbstractC167007dF.A1N(r5.A02()) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e8, code lost:
    
        r6 = X.AbstractC167007dF.A1N(X.AbstractC72048XLo.A04(r4).A02());
        r4 = new X.C72845Xow();
        r0 = X.Y1L.A01;
        r5 = r1.A00;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0204, code lost:
    
        if (r1 >= r5.A00.size()) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0206, code lost:
    
        r4.A01(r5.A00(r1));
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0248, code lost:
    
        r1 = !r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x024b, code lost:
    
        if (r1 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x024d, code lost:
    
        r4.A01(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0250, code lost:
    
        if (r8 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0252, code lost:
    
        if (r9 != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0254, code lost:
    
        r4.A01(6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0258, code lost:
    
        if (r6 != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x025a, code lost:
    
        if (r9 != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x025c, code lost:
    
        r4.A01(7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0260, code lost:
    
        if (r7 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0262, code lost:
    
        if (r9 != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0264, code lost:
    
        r4.A01(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0269, code lost:
    
        if (r6 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x026b, code lost:
    
        if (r7 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x026d, code lost:
    
        if (r9 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x026f, code lost:
    
        r4.A01(9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0276, code lost:
    
        if (r1 == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0278, code lost:
    
        r4.A01(10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(X.Y8T r14, X.Y4C r15, int r16) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y8T.A04(X.Y8T, X.Y4C, int):void");
    }

    public static void A06(Y8T y8t, Object obj, int i, int i2) {
        for (YRF yrf : y8t.A0n) {
            if (i == -1 || ((AbstractC73334Y8p) yrf).A05 == i) {
                C72856XpC A00 = y8t.A00(yrf);
                boolean z = !A00.A05;
                WDn.A02(z);
                A00.A00 = i2;
                WDn.A02(z);
                A00.A02 = obj;
                A00.A00();
            }
        }
    }

    public static void A01(Y8T y8t) {
        A02(y8t);
        int i = y8t.A0A.A01;
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new IllegalStateException();
                }
            } else {
                A02(y8t);
                A02(y8t);
                A02(y8t);
            }
        }
    }

    public static void A05(Y8T y8t, Object obj) {
        ArrayList A1E = AbstractC166987dD.A1E();
        boolean z = false;
        for (YRF yrf : y8t.A0n) {
            if (((AbstractC73334Y8p) yrf).A05 == 2) {
                C72856XpC A00 = y8t.A00(yrf);
                boolean z2 = !A00.A05;
                WDn.A02(z2);
                A00.A00 = 1;
                WDn.A02(z2);
                A00.A02 = obj;
                A00.A00();
                A1E.add(A00);
            }
        }
        Object obj2 = y8t.A0C;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = A1E.iterator();
                while (it.hasNext()) {
                    C72856XpC c72856XpC = (C72856XpC) it.next();
                    long j = y8t.A0b;
                    synchronized (c72856XpC) {
                        WDn.A02(c72856XpC.A05);
                        WDn.A02(AbstractC25229BEm.A1a(c72856XpC.A01.getThread(), Thread.currentThread()));
                        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
                        while (!c72856XpC.A04) {
                            if (j > 0) {
                                c72856XpC.wait(j);
                                j = elapsedRealtime - SystemClock.elapsedRealtime();
                            } else {
                                throw new TimeoutException(AbstractC111324zv.A00(3675));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                AbstractC58318PtA.A18();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = y8t.A0C;
            Surface surface = y8t.A03;
            if (obj3 == surface) {
                surface.release();
                y8t.A03 = null;
            }
        }
        y8t.A0C = obj;
        if (z) {
            XQ6 xq6 = new XQ6(new YK6(), 2, 1003);
            Y4C y4c = y8t.A0A;
            Y4C A06 = y4c.A06(y4c.A09);
            A06.A0G = A06.A0I;
            A06.A0J = 0L;
            Y4C A05 = A06.A02(1).A05(xq6);
            y8t.A02++;
            Y8Y y8y = (Y8Y) y8t.A0W.A0G;
            Y3Q.A00(y8y.A00.obtainMessage(6), Y8Y.A00(), y8y);
            A04(y8t, A05, 0);
        }
    }

    @Override // X.YNE
    public final int Aub() {
        A02(this);
        Y4C y4c = this.A0A;
        Timeline timeline = y4c.A06;
        if (AbstractC167007dF.A1N(timeline.A02())) {
            int i = this.A01;
            if (i == -1) {
                return 0;
            }
            return i;
        }
        timeline.A09(this.A0Q, y4c.A09.A04);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0220, code lost:
    
        if (r14.A06.A01.isEmpty() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0354, code lost:
    
        if (r3 == false) goto L51;
     */
    /* JADX WARN: Type inference failed for: r22v0, types: [X.Y8o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.Xoc, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Y8T(android.content.Context r49, android.os.Looper r50, X.Y1h r51, X.YQ7 r52, X.YMB r53, X.Y1R r54, X.C2n2 r55, X.InterfaceC216113n r56, X.InterfaceC216113n r57, X.InterfaceC216113n r58, X.InterfaceC216113n r59, X.InterfaceC216113n r60) {
        /*
            Method dump skipped, instructions count: 965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y8T.<init>(android.content.Context, android.os.Looper, X.Y1h, X.YQ7, X.YMB, X.Y1R, X.2n2, X.13n, X.13n, X.13n, X.13n, X.13n):void");
    }

    public Y8T() {
        this.A0R = new C62960SZd();
    }
}
