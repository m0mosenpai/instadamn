package X;

import android.content.Context;
import android.media.AudioManager;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.5P4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5P4 extends C4VP implements C4VR {
    public static final C5P4 $redex_init_class = null;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = 0;
    public int A05;
    public long A06;
    public long A07;
    public Surface A08;
    public C116465Pb A09;
    public C4W6 A0A;
    public C4W6 A0B;
    public C5PK A0C;
    public C5PH A0D;
    public Object A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public C4W6 A0M;
    public C4WN A0N;
    public C4TT A0O;
    public C4UX A0P;
    public C4WP A0Q;
    public C96784Wn A0R;
    public C4U9 A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public final Looper A0Y;
    public final C5PV A0Z;
    public final C5P5 A0a;
    public final C5PL A0b;
    public final C4WN A0c;
    public final C5PX A0d;
    public final C4WJ A0e;
    public final C4WI A0f;
    public final InterfaceC96774Wm A0g;
    public final C5PE A0h;
    public final List A0i;
    public final CopyOnWriteArraySet A0j;
    public final boolean A0k;
    public final long A0l;
    public final Context A0m;
    public final C5PT A0n;
    public final C5PA A0o;
    public final C5PJ A0p;
    public final C4VQ A0q;
    public final InterfaceC97014Xm A0r;
    public final C4YF A0s;
    public final C4W8 A0t;
    public final C4XM A0u;
    public final C4VC A0v;
    public final C2B5 A0w;
    public final C2A7 A0x;
    public final C4UP A0y;
    public final boolean A0z;
    public final boolean A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;
    public final boolean A14;
    public final boolean A15;
    public final boolean A16;
    public final InterfaceC96054To[] A17;

    private Pair A03(Timeline timeline, int i, long j) {
        long j2;
        int i2 = i;
        if (timeline.A02() == 0) {
            this.A01 = i;
            if (j == -9223372036854775807L) {
                j2 = 0;
            } else {
                j2 = j;
            }
            this.A07 = j2;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.A06 = j;
            return null;
        }
        if (i == -1 || i >= timeline.A02()) {
            i2 = timeline.A07(false);
            j = Util.A08(timeline.A0E(super.A00, i2, 0L).A02);
        }
        return timeline.A09(this.A0e, super.A00, i2, Util.A07(j));
    }

    private void A0B(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.A0i.remove(i2);
        }
        C5PG c5pg = (C5PG) this.A0D;
        int[] iArr = c5pg.A02;
        int length = iArr.length;
        int[] iArr2 = new int[length - i];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 >= 0 && i5 < i) {
                i3++;
            } else {
                int i6 = i4 - i3;
                if (i5 >= 0) {
                    i5 -= i;
                }
                iArr2[i6] = i5;
            }
        }
        this.A0D = new C5PG(new Random(c5pg.A00.nextLong()), iArr2);
    }

    private void A0C(C4Y3 c4y3, boolean z) {
        C5PK A06;
        boolean z2;
        if (z) {
            List list = this.A0i;
            int size = list.size();
            int Aub = Aub();
            A0A();
            Timeline timeline = this.A0C.A06;
            int size2 = list.size();
            this.A03++;
            A0B(size);
            C4YI c4yi = new C4YI(this.A0D, list);
            C5PK A062 = A06(A04(timeline, c4yi), this.A0C, c4yi, false);
            int i = A062.A00;
            if (i != 1 && i != 4 && 0 < size && size == size2 && Aub >= A062.A06.A02()) {
                A062 = A062.A01(4);
            }
            C5PL c5pl = this.A0b;
            C5PH c5ph = this.A0D;
            C96764Wl c96764Wl = (C96764Wl) c5pl.A0n;
            C96834Wt A00 = C96764Wl.A00();
            A00.A00 = c96764Wl.A00.obtainMessage(20, 0, size, c5ph);
            A00.A01 = c96764Wl;
            A00.A01();
            A06 = A062.A03(null);
        } else {
            C5PK c5pk = this.A0C;
            A06 = c5pk.A06(c5pk.A08);
            A06.A0H = A06.A0I;
            A06.A0J = 0L;
        }
        C5PK A01 = A06.A01(1);
        if (c4y3 != null) {
            A01 = A01.A03(c4y3);
        }
        this.A03++;
        C96764Wl c96764Wl2 = (C96764Wl) this.A0b.A0n;
        C96834Wt A002 = C96764Wl.A00();
        A002.A00 = c96764Wl2.A00.obtainMessage(6);
        A002.A01 = c96764Wl2;
        A002.A01();
        if (A01.A06.A02() == 0 && this.A0C.A06.A02() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        A0G(this, A01, 3, 1, 7, -1, A01(A01), false, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
    
        if (r13 == 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0F(X.C5P4 r12, int r13, int r14, boolean r15) {
        /*
            r9 = r14
            r4 = 1
            if (r15 == 0) goto L18
            r0 = -1
            if (r13 == r0) goto L18
            r2 = 1
            r3 = 1
            if (r13 != r4) goto Lc
        Lb:
            r3 = 0
        Lc:
            r6 = r12
            X.5PK r5 = r12.A0C
            boolean r0 = r5.A0F
            if (r0 != r2) goto L1a
            int r0 = r5.A01
            if (r0 != r3) goto L1a
            return
        L18:
            r2 = 0
            goto Lb
        L1a:
            int r0 = r12.A03
            int r0 = r0 + 1
            r12.A03 = r0
            boolean r1 = r12.A0k
            if (r1 == 0) goto L2a
            int r0 = r12.A04
            int r0 = r0 + 1
            r12.A04 = r0
        L2a:
            X.5PK r7 = r5.A02(r3, r2)
            X.5PL r0 = r12.A0b
            if (r1 == 0) goto L50
            X.4Wm r1 = r0.A0n
            r0 = 28
            X.4Wt r0 = r1.Ctm(r0, r2, r3)
            r0.A01()
            if (r2 != 0) goto L5a
            r12.A0G = r2
            r9 = 6
        L42:
            r8 = 3
            r14 = 0
            r10 = 4
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = -1
            r15 = r14
            A0G(r6, r7, r8, r9, r10, r11, r12, r14, r15)
            return
        L50:
            X.4Wm r0 = r0.A0n
            X.4Wt r0 = r0.Ctm(r4, r2, r3)
            r0.A01()
            goto L42
        L5a:
            r12.A0C = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5P4.A0F(X.5P4, int, int, boolean):void");
    }

    @Override // X.C4VQ
    public final void E52(long j) {
    }

    @Override // X.C4VQ
    public final void E5P() {
        A0A();
        A0A();
        boolean z = this.A0C.A0F;
        int i = 2;
        int FAH = this.A0Z.FAH(z, 2);
        int i2 = 1;
        if (z && FAH != 1) {
            i2 = 2;
        }
        A0F(this, FAH, i2, z);
        C5PK c5pk = this.A0C;
        if (c5pk.A00 == 1) {
            C5PK A03 = c5pk.A03(null);
            if (A03.A06.A02() == 0) {
                i = 4;
            }
            C5PK A01 = A03.A01(i);
            this.A03++;
            C96764Wl c96764Wl = (C96764Wl) this.A0b.A0n;
            C96834Wt A00 = C96764Wl.A00();
            A00.A00 = c96764Wl.A00.obtainMessage(0);
            A00.A01 = c96764Wl;
            A00.A01();
            A0G(this, A01, 4, 1, 4, -1, -9223372036854775807L, false, false);
        }
    }

    @Override // X.C4VR
    public final void EZc(String str) {
        this.A0b.A0n.Ctn(null, 29).A01();
    }

    @Override // X.C4VQ
    public final void Eaz(C4TU c4tu) {
        A0A();
        C5PK c5pk = this.A0C;
        if (!c5pk.A05.equals(c4tu)) {
            if (this.A10) {
                this.A0b.A0n.Ctn(c4tu, 4).A01();
                return;
            }
            C5PK A04 = c5pk.A04(c4tu);
            this.A03++;
            this.A0b.A0n.Ctn(c4tu, 4).A01();
            A0G(this, A04, 3, 1, 4, -1, -9223372036854775807L, false, false);
        }
    }

    @Override // X.C4VQ
    public final void stop(boolean z) {
        A0A();
        C5PV c5pv = this.A0Z;
        A0A();
        c5pv.FAH(this.A0C.A0F, 1);
        A0C(null, true);
        C4WP c4wp = C4WP.A01;
        this.A0Q = new C4WP(ImmutableList.of());
    }

    static {
        C460829s.A00("goog.exo.exoplayer");
    }

    private int A00() {
        C5PK c5pk = this.A0C;
        Timeline timeline = c5pk.A06;
        if (timeline.A02() == 0) {
            return this.A01;
        }
        return timeline.A0B(this.A0e, c5pk.A08.A04).A00;
    }

    private long A01(C5PK c5pk) {
        Timeline timeline = c5pk.A06;
        if (timeline.A02() == 0) {
            return Util.A07(this.A07);
        }
        C4WX c4wx = c5pk.A08;
        int i = c4wx.A00;
        long j = c5pk.A0I;
        if (i != -1) {
            return j;
        }
        Object obj = c4wx.A04;
        C4WJ c4wj = this.A0e;
        timeline.A0B(c4wj, obj);
        return j + c4wj.A02;
    }

    public static long A02(C5PK c5pk) {
        C96604Vv c96604Vv = new C96604Vv();
        C4WJ c4wj = new C4WJ();
        Timeline timeline = c5pk.A06;
        timeline.A0B(c4wj, c5pk.A08.A04);
        long j = c5pk.A03;
        if (j == -9223372036854775807L) {
            return timeline.A0E(c96604Vv, c4wj.A00, 0L).A02;
        }
        return c4wj.A02 + j;
    }

    private Pair A04(Timeline timeline, Timeline timeline2) {
        int i;
        long A0L = A0L();
        if (timeline.A02() == 0) {
            i = A00();
        } else {
            i = -1;
            if (timeline2.A02() == 0) {
                A0L = -9223372036854775807L;
            } else {
                int Aub = Aub();
                C96604Vv c96604Vv = super.A00;
                C4WJ c4wj = this.A0e;
                Pair A09 = timeline.A09(c4wj, c96604Vv, Aub, Util.A07(A0L));
                Object obj = A09.first;
                if (timeline2.A06(obj) != -1) {
                    return A09;
                }
                Object A07 = C5PL.A07(c4wj, c96604Vv, timeline, timeline2, obj, this.A0J, false);
                if (A07 != null) {
                    timeline2.A0B(c4wj, A07);
                    int i2 = c4wj.A00;
                    return A03(timeline2, i2, Util.A08(timeline2.A0E(c96604Vv, i2, 0L).A02));
                }
                return A03(timeline2, -1, -9223372036854775807L);
            }
        }
        return A03(timeline2, i, A0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r26.A0D(r4, r1, false).A00 != r26.A0B(r4, r11.A04).A00) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0045, code lost:
    
        if (r24 != null) goto L5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [X.4WY] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.C5PK A06(android.util.Pair r24, X.C5PK r25, com.google.android.exoplayer2.Timeline r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5P4.A06(android.util.Pair, X.5PK, com.google.android.exoplayer2.Timeline, boolean):X.5PK");
    }

    private ArrayList A08(List list, int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C116485Pd c116485Pd = new C116485Pd((C4XW) list.get(i2), this.A16);
            arrayList.add(c116485Pd);
            this.A0i.add(i2 + i, new C116515Pg(c116485Pd.A02.A01, c116485Pd.A03));
        }
        this.A0D = this.A0D.AI9(i, arrayList.size());
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r3.A03(r2, r1) == (-1)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r3.A04(r2, r1, r4.BxA()) == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        if (r8.A0E(r4.A00, r4.Aub(), 0).A01() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r8.A0E(r4.A00, r4.Aub(), 0).A0G == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A09() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5P4.A09():void");
    }

    private void A0A() {
        IllegalStateException illegalStateException;
        this.A0y.A00();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.A0Y;
        if (currentThread != looper.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", currentThread.getName(), looper.getThread().getName());
            boolean z = this.A12;
            if (z) {
                StackTraceElement[] stackTrace = currentThread.getStackTrace();
                ArrayList arrayList = new ArrayList();
                for (int i = 2; i < Math.min(stackTrace.length, 7); i++) {
                    arrayList.add(stackTrace[i].getMethodName());
                }
                format = AnonymousClass001.A0g(format, "\nCalling Method Stack Trace: ", AbstractC93184Fu.A00("<-", arrayList));
            }
            if (!this.A0H) {
                if (this.A0U) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                AbstractC46512Bo.A06("ExoPlayerImpl", format, illegalStateException);
                if (!z) {
                    this.A0U = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException(format);
        }
    }

    public static void A0E(C5P4 c5p4, int i, int i2) {
        C96784Wn c96784Wn = c5p4.A0R;
        if (i != c96784Wn.A01 || i2 != c96784Wn.A00) {
            c5p4.A0R = new C96784Wn(i, i2);
            C5PE c5pe = c5p4.A0h;
            c5pe.A02(new InterfaceC116555Pk() { // from class: X.YDV
                @Override // X.InterfaceC116555Pk
                public final void CP5(Object obj) {
                    C5P4 c5p42 = C5P4.$redex_init_class;
                }
            }, 24);
            c5pe.A01();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02b9, code lost:
    
        if (r6 == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0098, code lost:
    
        if (r0.A0C.equals(r35.A0C) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013f, code lost:
    
        if (r18 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02b1, code lost:
    
        if (r7 == 0) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x037b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0277 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.5ku] */
    /* JADX WARN: Type inference failed for: r4v36, types: [X.5ku] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0G(X.C5P4 r34, final X.C5PK r35, final int r36, int r37, final int r38, int r39, long r40, boolean r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5P4.A0G(X.5P4, X.5PK, int, int, int, int, long, boolean, boolean):void");
    }

    public static void A0H(C5P4 c5p4, Object obj) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        InterfaceC96054To[] interfaceC96054ToArr = c5p4.A17;
        int length = interfaceC96054ToArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                break;
            }
            InterfaceC96054To interfaceC96054To = interfaceC96054ToArr[i];
            if (((AbstractC96044Tn) interfaceC96054To).A0B == 2) {
                C96814Wq A07 = c5p4.A07(interfaceC96054To);
                A07.A01(1);
                A07.A02(obj);
                A07.A00();
                arrayList.add(A07);
            }
            i++;
        }
        Object obj2 = c5p4.A0E;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C96814Wq c96814Wq = (C96814Wq) it.next();
                    long j = c5p4.A0l;
                    synchronized (c96814Wq) {
                        C4B8.A04(c96814Wq.A07);
                        boolean z2 = false;
                        if (c96814Wq.A03.getThread() != Thread.currentThread()) {
                            z2 = true;
                        }
                        C4B8.A04(z2);
                        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
                        while (!c96814Wq.A06) {
                            if (j > 0) {
                                c96814Wq.wait(j);
                                j = elapsedRealtime - SystemClock.elapsedRealtime();
                            } else {
                                throw new TimeoutException("Message delivery timed out.");
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = c5p4.A0E;
            Surface surface = c5p4.A08;
            if (obj3 == surface) {
                surface.release();
                c5p4.A08 = null;
            }
        } else {
            z = false;
        }
        c5p4.A0E = obj;
        if (z) {
            c5p4.A0C(C4Y3.A01(new YK8(3), 1003), false);
        }
    }

    public static void A0I(C5P4 c5p4, Object obj, int i, int i2) {
        for (InterfaceC96054To interfaceC96054To : c5p4.A17) {
            if (((AbstractC96044Tn) interfaceC96054To).A0B == i) {
                C96814Wq A07 = c5p4.A07(interfaceC96054To);
                A07.A01(i2);
                A07.A02(obj);
                A07.A00();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.5PP, java.lang.Object] */
    @Override // X.C4VP
    public final void A0K(int i, int i2, boolean z, long j) {
        long j2;
        A0A();
        int i3 = 1;
        boolean z2 = false;
        if (i >= 0) {
            z2 = true;
        }
        C4B8.A03(z2);
        Timeline timeline = this.A0C.A06;
        if (timeline.A02() != 0 && i >= timeline.A02()) {
            return;
        }
        this.A03++;
        if (CaX()) {
            AbstractC46512Bo.A04("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            C5PK c5pk = this.A0C;
            ?? obj = new Object();
            obj.A03 = c5pk;
            obj.A00(1);
            C5P4 c5p4 = ((C5PI) this.A0p).A00;
            ((C96764Wl) c5p4.A0g).A00.post(new RunnableC116625Pr(c5p4, obj));
            return;
        }
        A0A();
        if (this.A0C.A00 != 1) {
            i3 = 2;
        }
        if (this.A0z) {
            A0A();
            i3 = this.A0C.A00;
        }
        int Aub = Aub();
        C5PK A01 = this.A0C.A01(i3);
        if (this.A14) {
            timeline = A01.A06;
        }
        C5PK A06 = A06(A03(timeline, i, j), A01, timeline, false);
        this.A0b.A0n.Ctn(new C116595Po(timeline, i, Util.A07(j)), 3).A01();
        if (this.A13) {
            try {
                j2 = A01(A06);
            } catch (Exception e) {
                AbstractC46512Bo.A06("ExoPlayerImpl", "Encountered error in periodUid whilst retrieving current position", e);
                j2 = -9223372036854775807L;
            }
        } else {
            j2 = A01(A06);
        }
        A0G(this, A06, 3, 1, 1, Aub, j2, true, true);
    }

    @Override // X.C4VQ
    public final void A94(C4W9 c4w9) {
        C5PE c5pe = this.A0h;
        c4w9.getClass();
        synchronized (c5pe.A06) {
            if (!c5pe.A01) {
                c5pe.A09.add(new C5PS(c4w9));
            }
        }
    }

    @Override // X.C4VR
    public final void A9N(C4XW c4xw) {
        A0A();
        List singletonList = Collections.singletonList(c4xw);
        A0A();
        List list = this.A0i;
        int size = list.size();
        A0A();
        boolean z = false;
        if (size >= 0) {
            z = true;
        }
        C4B8.A03(z);
        int min = Math.min(size, list.size());
        A0A();
        Timeline timeline = this.A0C.A06;
        this.A03++;
        ArrayList A08 = A08(singletonList, min);
        C4YI c4yi = new C4YI(this.A0D, list);
        C5PK A06 = A06(A04(timeline, c4yi), this.A0C, c4yi, false);
        C5PL c5pl = this.A0b;
        C5PH c5ph = this.A0D;
        InterfaceC96774Wm interfaceC96774Wm = c5pl.A0n;
        C116535Pi c116535Pi = new C116535Pi(c5ph, A08, -1, -9223372036854775807L);
        C96764Wl c96764Wl = (C96764Wl) interfaceC96774Wm;
        C96834Wt A00 = C96764Wl.A00();
        A00.A00 = c96764Wl.A00.obtainMessage(18, min, 0, c116535Pi);
        A00.A01 = c96764Wl;
        A00.A01();
        A0G(this, A06, 3, 1, 4, -1, -9223372036854775807L, false, false);
    }

    @Override // X.C4VQ
    public final SparseArray Ab1() {
        C4YN c4yn = this.A0b.A0f.A05;
        SparseArray sparseArray = new SparseArray();
        if (c4yn != null) {
            for (InterfaceC97394Yz interfaceC97394Yz : c4yn.A0B) {
                if (interfaceC97394Yz instanceof C4YV) {
                    C4YV c4yv = (C4YV) interfaceC97394Yz;
                    sparseArray.put(c4yv.A0F, Long.valueOf(c4yv.A0I.A05()));
                }
            }
        }
        return sparseArray;
    }

    @Override // X.C4VQ
    public final long Aig() {
        long j = this.A0C.A0H;
        UUID uuid = C4YL.A03;
        return Util.A08(j);
    }

    @Override // X.C4VQ
    public final long Aih() {
        long j = this.A0C.A0J;
        UUID uuid = C4YL.A03;
        return Util.A08(j);
    }

    @Override // X.C4VQ
    public final long Au9() {
        if (!this.A11) {
            return Auh();
        }
        C5PK c5pk = this.A0C;
        if (c5pk.A06.A02() == 0) {
            return this.A06;
        }
        long j = c5pk.A0I;
        UUID uuid = C4YL.A03;
        return Util.A08(j);
    }

    @Override // X.C4VR
    public final HandlerThread BJ6() {
        return this.A0b.A0a;
    }

    @Override // X.C4VQ
    public final boolean BJb() {
        return this.A0C.A0D;
    }

    @Override // X.C4VQ
    public final long BmC() {
        return this.A0b.A0o.Beg() / 1000;
    }

    @Override // X.C4VQ
    public final Integer Bzh() {
        return this.A0C.A0B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (r4 >= r8.A02) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011c, code lost:
    
        if (r5 >= r9.A02) goto L40;
     */
    @Override // X.C4VR
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E5T(X.C4XW r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5P4.E5T(X.4XW, boolean, boolean):void");
    }

    @Override // X.C4VQ
    public final void EEv() {
        C5PE c5pe = this.A0h;
        C5PE.A00(c5pe);
        c5pe.A09.clear();
    }

    @Override // X.C4VQ
    public final void EMj(long j) {
        long j2;
        if (!this.A11) {
            A0J(Aub(), j);
            return;
        }
        A0A();
        Timeline timeline = this.A0C.A06;
        this.A03++;
        this.A06 = j;
        A0A();
        C5PK c5pk = this.A0C;
        int i = 2;
        if (c5pk.A00 == 1) {
            i = 1;
        }
        if (this.A0z) {
            A0A();
            c5pk = this.A0C;
            i = c5pk.A00;
        }
        C5PK A06 = A06(A03(timeline, 0, j), c5pk.A01(i), timeline, true);
        this.A0b.A0n.Ctn(new C116615Pq(A06.A08, Util.A07(j)), 26).A01();
        if (this.A13) {
            try {
                j2 = A01(A06);
            } catch (Exception e) {
                AbstractC46512Bo.A06("ExoPlayerImpl", "Encountered error in periodUid whilst retrieving current position", e);
                j2 = -9223372036854775807L;
            }
        } else {
            j2 = A01(A06);
        }
        A0G(this, A06, 3, 1, 1, 0, j2, true, true);
    }

    @Override // X.C4VQ
    public final void EcR(long j) {
        this.A0b.A0o.A02(j * 1000);
    }

    @Override // X.C4VQ
    public final void release() {
        String str;
        boolean z;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = Util.A02;
        synchronized (C460829s.class) {
            str = C460829s.A00;
        }
        AnonymousClass001.A18("Release ", hexString, " [", "ExoPlayerLib/2.8.1", "] [", str2, "] [", str, "]");
        AbstractC46512Bo.A02();
        A0A();
        this.A0d.release();
        this.A0r.Eeo(false);
        this.A0s.Eeo(false);
        this.A0Z.release();
        C5PL c5pl = this.A0b;
        synchronized (c5pl) {
            if (!c5pl.A0S && c5pl.A0b.getThread().isAlive()) {
                ((C96764Wl) c5pl.A0n).A00.sendEmptyMessage(7);
                long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
                boolean z2 = false;
                for (long j = 500; !c5pl.A0S && j > 0; j = elapsedRealtime - SystemClock.elapsedRealtime()) {
                    try {
                        c5pl.wait(j);
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                z = c5pl.A0S;
            } else {
                z = true;
            }
        }
        if (!z) {
            C5PE c5pe = this.A0h;
            c5pe.A02(new InterfaceC116555Pk() { // from class: X.YDW
                @Override // X.InterfaceC116555Pk
                public final void CP5(Object obj) {
                    C5P4 c5p4 = C5P4.$redex_init_class;
                    ((C4W9) obj).DZG(C4Y3.A01(new YK8(1), 1003));
                }
            }, 10);
            c5pe.A01();
        }
        C5PE c5pe2 = this.A0h;
        C5PE.A00(c5pe2);
        synchronized (c5pe2.A06) {
            c5pe2.A01 = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = c5pe2.A09;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C5PS c5ps = (C5PS) it.next();
            c5ps.A02 = true;
            if (c5ps.A01) {
                c5ps.A01 = false;
                c5ps.A00.A00();
            }
        }
        copyOnWriteArraySet.clear();
        ((C96764Wl) this.A0g).A00.removeCallbacksAndMessages(null);
        this.A0w.EFK(this.A0t);
        C5PK A01 = this.A0C.A01(1);
        this.A0C = A01;
        C5PK A06 = A01.A06(A01.A08);
        this.A0C = A06;
        A06.A0H = A06.A0I;
        this.A0C.A0J = 0L;
        this.A0v.A02();
        Surface surface = this.A08;
        if (surface != null) {
            surface.release();
            this.A08 = null;
        }
        this.A0Q = C4WP.A01;
        this.A0W = true;
    }

    public static C4W6 A05(C5P4 c5p4) {
        c5p4.A0A();
        Timeline timeline = c5p4.A0C.A06;
        if (timeline.A02() == 0) {
            return c5p4.A0B;
        }
        C4W2 c4w2 = timeline.A0E(((C4VP) c5p4).A00, c5p4.Aub(), 0L).A09;
        C4W7 c4w7 = new C4W7(c5p4.A0B);
        c4w7.A00(c4w2.A05);
        return new C4W6(c4w7);
    }

    private C96814Wq A07(InterfaceC96064Tp interfaceC96064Tp) {
        int A00 = A00();
        C5PL c5pl = this.A0b;
        Timeline timeline = this.A0C.A06;
        if (A00 == -1) {
            A00 = 0;
        }
        return new C96814Wq(c5pl.A0b, c5pl, interfaceC96064Tp, timeline, this.A0x, A00);
    }

    public static void A0D(C5P4 c5p4) {
        c5p4.A0A();
        int i = c5p4.A0C.A00;
        boolean z = true;
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new IllegalStateException();
                }
            } else {
                c5p4.A0A();
                boolean z2 = c5p4.A0C.A0G;
                InterfaceC97014Xm interfaceC97014Xm = c5p4.A0r;
                c5p4.A0A();
                if (!c5p4.A0C.A0F || z2) {
                    z = false;
                }
                interfaceC97014Xm.Eeo(z);
                C4YF c4yf = c5p4.A0s;
                c5p4.A0A();
                c4yf.Eeo(c5p4.A0C.A0F);
                return;
            }
        }
        c5p4.A0r.Eeo(false);
        c5p4.A0s.Eeo(false);
    }

    public final long A0L() {
        A0A();
        if (CaX()) {
            C5PK c5pk = this.A0C;
            Timeline timeline = c5pk.A06;
            Object obj = c5pk.A08.A04;
            C4WJ c4wj = this.A0e;
            timeline.A0B(c4wj, obj);
            C5PK c5pk2 = this.A0C;
            long j = c5pk2.A03;
            if (j == -9223372036854775807L) {
                return Util.A08(c5pk2.A06.A0E(super.A00, Aub(), 0L).A02);
            }
            return Util.A08(c4wj.A02) + Util.A08(j);
        }
        return Auh();
    }

    @Override // X.C4VQ
    public final void AE7(long j) {
        A0J(Aub(), j);
    }

    @Override // X.C4VR
    public final C96814Wq AMX(InterfaceC96064Tp interfaceC96064Tp) {
        A0A();
        return A07(interfaceC96064Tp);
    }

    @Override // X.C4VQ
    public final long Aij() {
        long j;
        A0A();
        if (CaX()) {
            C5PK c5pk = this.A0C;
            if (c5pk.A07.equals(c5pk.A08)) {
                j = this.A0C.A0H;
            } else {
                return Azf();
            }
        } else {
            A0A();
            C5PK c5pk2 = this.A0C;
            Timeline timeline = c5pk2.A06;
            if (timeline.A02() == 0) {
                return this.A07;
            }
            if (c5pk2.A07.A03 != c5pk2.A08.A03) {
                j = timeline.A0E(super.A00, Aub(), 0L).A03;
            } else {
                long j2 = c5pk2.A0H;
                C5PK c5pk3 = this.A0C;
                C4WX c4wx = c5pk3.A07;
                if (c4wx.A00 != -1) {
                    c5pk3.A06.A0B(this.A0e, c4wx.A04);
                    c5pk3 = this.A0C;
                    c4wx = c5pk3.A07;
                    j2 = 0;
                }
                Timeline timeline2 = c5pk3.A06;
                Object obj = c4wx.A04;
                C4WJ c4wj = this.A0e;
                timeline2.A0B(c4wj, obj);
                return Util.A08(j2 + c4wj.A02);
            }
        }
        return Util.A08(j);
    }

    @Override // X.C4VQ
    public final int Aub() {
        A0A();
        int A00 = A00();
        if (A00 == -1) {
            return 0;
        }
        return A00;
    }

    @Override // X.C4VQ
    public final long Auh() {
        A0A();
        return Util.A08(A01(this.A0C));
    }

    @Override // X.C4VQ
    public final Timeline Aux() {
        A0A();
        return this.A0C.A06;
    }

    @Override // X.C4VR
    public final C4WU Av0() {
        A0A();
        return this.A0C.A09;
    }

    @Override // X.C4VR
    public final C97324Yr Av1() {
        A0A();
        return new C97324Yr(this.A0C.A0A.A04);
    }

    @Override // X.C4VQ
    public final int Av8() {
        return Aub();
    }

    @Override // X.C4VQ
    public final long Azf() {
        long j;
        A0A();
        if (CaX()) {
            C5PK c5pk = this.A0C;
            C4WX c4wx = c5pk.A08;
            Timeline timeline = c5pk.A06;
            Object obj = c4wx.A04;
            C4WJ c4wj = this.A0e;
            timeline.A0B(c4wj, obj);
            j = c4wj.A01(c4wx.A00, c4wx.A01);
        } else {
            A0A();
            Timeline timeline2 = this.A0C.A06;
            if (timeline2.A02() == 0) {
                return -9223372036854775807L;
            }
            j = timeline2.A0E(super.A00, Aub(), 0L).A03;
        }
        return Util.A08(j);
    }

    @Override // X.C4VQ
    public final boolean Bdn() {
        A0A();
        return this.A0C.A0F;
    }

    @Override // X.C4VQ
    public final int Bdy() {
        A0A();
        return this.A0C.A00;
    }

    @Override // X.C4VQ
    public final int Bmw() {
        A0A();
        return this.A0J;
    }

    @Override // X.C4VQ
    public final boolean BxA() {
        A0A();
        return false;
    }

    @Override // X.C4VQ
    public final boolean CaX() {
        A0A();
        if (this.A0C.A08.A00 == -1) {
            return false;
        }
        return true;
    }

    @Override // X.C4VR
    @Deprecated
    public final void EKu() {
        A0A();
        E5P();
    }

    @Override // X.C4VQ
    public final void Eax(boolean z) {
        A0A();
        C5PV c5pv = this.A0Z;
        A0A();
        int FAH = c5pv.FAH(z, this.A0C.A00);
        int i = 1;
        if (z && FAH != 1) {
            i = 2;
        }
        A0F(this, FAH, i, z);
    }

    @Override // X.C4VQ
    public final void Ece(int i) {
        A0A();
        if (this.A0J != i) {
            this.A0J = i;
            this.A0b.A0n.Ctm(11, i, 0).A01();
            C5PE c5pe = this.A0h;
            c5pe.A02(new InterfaceC116555Pk() { // from class: X.5Q0
                @Override // X.InterfaceC116555Pk
                public final void CP5(Object obj) {
                    C5P4 c5p4 = C5P4.$redex_init_class;
                }
            }, 8);
            A09();
            c5pe.A01();
        }
    }

    @Override // X.C4VR
    public final void EdL(C4TT c4tt) {
        A0A();
        if (c4tt == null) {
            c4tt = C4TT.A03;
        }
        if (!this.A0O.equals(c4tt)) {
            this.A0O = c4tt;
            this.A0b.A0n.Ctn(c4tt, 5).A01();
        }
    }

    @Override // X.C4VR
    public final void Egp(List list) {
        A0A();
        A0I(this, list, 2, 13);
    }

    @Override // X.C4VR
    public final void EVC(boolean z) {
        A0A();
    }

    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Object, X.5PA] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.5PT] */
    public C5P4(final Context context, Looper looper, C4VN c4vn, C5P1 c5p1, C4TT c4tt, C4UX c4ux, C2A7 c2a7, C2n2 c2n2, InterfaceC216113n interfaceC216113n, InterfaceC216113n interfaceC216113n2, InterfaceC216113n interfaceC216113n3, InterfaceC216113n interfaceC216113n4, InterfaceC216113n interfaceC216113n5, String str, int i, boolean z) {
        C4WZ A00;
        C5PV t4c;
        C5PX t4d;
        int i2;
        InterfaceC97014Xm c4Xk;
        C4YF c4yk;
        boolean z2;
        int generateAudioSessionId;
        C4UP c4up = new C4UP();
        this.A0y = c4up;
        try {
            AnonymousClass001.A15("Init ", Integer.toHexString(System.identityHashCode(this)), " [", "ExoPlayerLib/2.8.1", "] [", Util.A02, "]");
            AbstractC46512Bo.A02();
            Context applicationContext = context.getApplicationContext();
            this.A0m = applicationContext;
            C4W8 c4w8 = (C4W8) c2n2.apply(c2a7);
            this.A0t = c4w8;
            this.A0P = c4ux;
            this.A0L = 1;
            this.A0K = i;
            this.A0l = 2000L;
            final C5P5 c5p5 = new C5P5(this);
            this.A0a = c5p5;
            ?? obj = new Object();
            this.A0o = obj;
            final Handler handler = new Handler(looper);
            InterfaceC96054To[] AN1 = ((C4VJ) interfaceC216113n4.get()).AN1(handler, c5p5, null, c5p5, c5p5, c5p5);
            this.A17 = AN1;
            int length = AN1.length;
            C4B8.A04(length > 0);
            C4VC c4vc = (C4VC) interfaceC216113n5.get();
            this.A0v = c4vc;
            this.A0u = (C4XM) interfaceC216113n3.get();
            C2B5 c2b5 = (C2B5) interfaceC216113n.get();
            this.A0w = c2b5;
            this.A16 = z;
            this.A0O = c4tt;
            this.A0Y = looper;
            this.A0x = c2a7;
            this.A0q = this;
            this.A0h = new C5PE(looper, c2a7, new C5PD() { // from class: X.5PC
            });
            this.A0j = new CopyOnWriteArraySet();
            this.A0i = new ArrayList();
            this.A0D = new C5PG(new Random(), new int[0]);
            C4WI c4wi = new C4WI(C4WG.A01, null, new C4WD[length], new C4WE[length]);
            this.A0f = c4wi;
            this.A0e = new C4WJ();
            C4WM c4wm = new C4WM();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            int i3 = 0;
            do {
                c4wm.A01(iArr[i3]);
                i3++;
            } while (i3 < 21);
            c4wm.A01(29);
            C4WN c4wn = C4WN.A01;
            C4WN c4wn2 = new C4WN(c4wm.A00());
            this.A0c = c4wn2;
            C4WM c4wm2 = new C4WM();
            c4wm2.A02(c4wn2.A00);
            c4wm2.A01(4);
            c4wm2.A01(10);
            this.A0N = new C4WN(c4wm2.A00());
            List list = C96764Wl.A01;
            this.A0g = new C96764Wl(new Handler(looper, null));
            C5PI c5pi = new C5PI(this);
            this.A0p = c5pi;
            this.A0C = C5PK.A00(c4wi);
            if (C2C5.A02(C2C1.A0H)) {
                if (Util.A00 < 31) {
                    A00 = new C4WZ(str);
                } else {
                    C4WZ c4wz = C4WZ.A03;
                    A00 = new C4WZ(LogSessionId.LOG_SESSION_ID_NONE, str);
                }
            } else if (Util.A00 < 31) {
                A00 = new C4WZ(str);
            } else {
                A00 = AbstractC72583XhM.A00(applicationContext, str);
            }
            this.A0b = new C5PL(looper, c4vn, c5pi, c5p1, (InterfaceC96374Uv) interfaceC216113n2.get(), this.A0O, c4w8, A00, c4vc, c4wi, c2b5, c2a7, AN1, this.A0J);
            this.A00 = 1.0f;
            this.A0J = 0;
            C4W6 c4w6 = C4W6.A0V;
            this.A0A = c4w6;
            this.A0M = c4w6;
            this.A0B = c4w6;
            this.A01 = -1;
            boolean A02 = C2C5.A02(C2C1.A0B);
            if (!A02) {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager == null) {
                    generateAudioSessionId = -1;
                } else {
                    generateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.A0I = generateAudioSessionId;
            }
            this.A0Q = C4WP.A01;
            this.A0H = true;
            A94(c4w8);
            c2b5.A8V(new Handler(looper), c4w8);
            this.A0j.add(c5p5);
            this.A0n = new Object(context, handler, c5p5) { // from class: X.5PT
                public final Context A00;
                public final C5PU A01;

                {
                    this.A00 = context.getApplicationContext();
                    this.A01 = new C5PU(handler, c5p5, this);
                }
            };
            if (!C2C5.A02(C2C1.A0K)) {
                t4c = new T4C(context, handler, c5p5);
            } else {
                t4c = C5PV.A00;
            }
            this.A0Z = t4c;
            if (!C2C5.A02(C2C1.A0r)) {
                t4d = new T4D(context, handler, c5p5);
            } else {
                t4d = C5PX.A00;
            }
            this.A0d = t4d;
            int i4 = this.A0P.A01;
            if (i4 != 13) {
                switch (i4) {
                    case 2:
                        i2 = 0;
                        break;
                    case 3:
                        i2 = 8;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        i2 = 5;
                        break;
                    case 6:
                        i2 = 2;
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            } else {
                i2 = 1;
            }
            t4d.Ef0(i2);
            if (!C2C5.A02(C2C1.A0u)) {
                c4Xk = new C4Xk(context);
            } else {
                c4Xk = InterfaceC97014Xm.A00;
            }
            this.A0r = c4Xk;
            c4Xk.setEnabled(false);
            if (!C2C5.A02(C2C1.A0v)) {
                c4yk = new C4YK(context);
            } else {
                c4yk = C4YF.A00;
            }
            this.A0s = c4yk;
            c4yk.setEnabled(false);
            C5PX c5px = this.A0d;
            this.A09 = new C116465Pb(c5px.BU2(), c5px.BQA());
            this.A0S = C4U9.A04;
            this.A0R = C96784Wn.A02;
            C4UX c4ux2 = this.A0P;
            C4VA c4va = (C4VA) c4vc;
            synchronized (c4va.A03) {
                z2 = c4va.A00.equals(c4ux2) ? false : true;
                c4va.A00 = c4ux2;
            }
            if (z2) {
                C4VA.A01(c4va);
            }
            this.A12 = C2C5.A02(C2C1.A0t);
            this.A14 = C2C5.A02(C2C1.A0p);
            this.A13 = C2C5.A02(C2C1.A0o);
            this.A11 = C2C5.A02(C2C1.A0I);
            this.A0T = C2C5.A02(C2C1.A1G);
            this.A0V = C2C5.A02(C2C1.A11);
            this.A0X = C2C5.A02(C2C1.A1K);
            this.A0k = C2C5.A02(C2C1.A08);
            this.A10 = C2C5.A02(C2C1.A0G);
            this.A0z = C2C5.A02(C2C1.A0C);
            this.A15 = C2C5.A02(C2C1.A1E);
            if (!A02) {
                A0I(this, Integer.valueOf(this.A0I), 1, 10);
                A0I(this, Integer.valueOf(this.A0I), 2, 10);
            }
            A0I(this, this.A0P, 1, 3);
            A0I(this, Integer.valueOf(this.A0L), 2, 4);
            A0I(this, Integer.valueOf(this.A0K), 2, 5);
            A0I(this, false, 1, 9);
            A0I(this, obj, 2, 7);
            A0I(this, obj, 6, 8);
            c4up.A02();
        } catch (Throwable th) {
            this.A0y.A02();
            throw th;
        }
    }
}
