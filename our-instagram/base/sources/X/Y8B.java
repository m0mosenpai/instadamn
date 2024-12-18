package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class Y8B implements Handler.Callback, YM8, YMD, YME, YMS {
    public long A01;
    public C72903Xqg A03;
    public C72505XfK A04;
    public Y4C A05;
    public Y1R A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final HandlerThread A0B;
    public final Looper A0C;
    public final C72843Xop A0D;
    public final C62960SZd A0E;
    public final YQ7 A0F;
    public final YM5 A0G;
    public final C72702Xla A0H;
    public final YMA A0I;
    public final YMB A0J;
    public final YQ8 A0K;
    public final C72836XoV A0L;
    public final C72839XoY A0M;
    public final C73316Y4i A0N;
    public final Xf2 A0O;
    public final C72743XmJ A0P;
    public final YMU A0Q;
    public final ArrayList A0R;
    public final java.util.Set A0S;
    public final YRF[] A0T;
    public final YMG[] A0U;
    public int A00 = 0;
    public boolean A0A = false;
    public Timeline A02 = Timeline.A00;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XfK, java.lang.Object] */
    public Y8B(Looper looper, YQ7 yq7, C72903Xqg c72903Xqg, YMA yma, YMB ymb, YQ8 yq8, Y1R y1r, YRD yrd, C73316Y4i c73316Y4i, Xf2 xf2, C72743XmJ c72743XmJ, YMU ymu, YRF[] yrfArr) {
        this.A0I = yma;
        this.A0T = yrfArr;
        this.A0O = xf2;
        this.A0P = c72743XmJ;
        this.A0K = yq8;
        this.A0Q = ymu;
        this.A06 = y1r;
        this.A0J = ymb;
        this.A0F = yq7;
        this.A0N = c73316Y4i;
        this.A03 = c72903Xqg;
        Y4C A00 = Y4C.A00(c72743XmJ);
        this.A05 = A00;
        ?? obj = new Object();
        obj.A01 = A00;
        this.A04 = obj;
        int length = yrfArr.length;
        this.A0U = new YMG[length];
        XQQ xqq = (XQQ) xf2;
        for (int i = 0; i < length; i++) {
            AbstractC73334Y8p abstractC73334Y8p = (AbstractC73334Y8p) yrfArr[i];
            abstractC73334Y8p.A00 = i;
            abstractC73334Y8p.A04 = c73316Y4i;
            abstractC73334Y8p.A02 = yq7;
            YMG[] ymgArr = this.A0U;
            ymgArr[i] = abstractC73334Y8p;
            if (xqq != null) {
                AbstractC73334Y8p abstractC73334Y8p2 = (AbstractC73334Y8p) ymgArr[i];
                synchronized (abstractC73334Y8p2.A07) {
                    abstractC73334Y8p2.A03 = xqq;
                }
            }
        }
        this.A0H = new C72702Xla(yq7, this);
        this.A0R = AbstractC166987dD.A1E();
        this.A0S = Collections.newSetFromMap(new IdentityHashMap());
        this.A0E = new C62960SZd();
        this.A0D = new C72843Xop();
        xf2.A00 = this;
        xf2.A01 = ymu;
        this.A07 = true;
        List list = Y8Y.A01;
        Y8Y y8y = new Y8Y(new Handler(looper, null));
        this.A0L = new C72836XoV(y8y, c72903Xqg, new YMC() { // from class: X.Y8n
        }, yrd);
        this.A0M = new C72839XoY(y8y, this, yrd, c73316Y4i);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        AbstractC09770fa.A00(handlerThread);
        this.A0B = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.A0C = looper2;
        this.A0G = new Y8Y(new Handler(looper2, this));
    }

    public static void A08(C72856XpC c72856XpC) {
        synchronized (c72856XpC) {
        }
        try {
            c72856XpC.A07.CK0(c72856XpC.A00, c72856XpC.A02);
        } finally {
            c72856XpC.A01(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r4.A08 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A09(boolean r5, boolean r6) {
        /*
            r4 = this;
            r2 = 0
            r3 = 1
            if (r5 != 0) goto L9
            boolean r1 = r4.A08
            r0 = 0
            if (r1 != 0) goto La
        L9:
            r0 = 1
        La:
            r4.A0A(r0, r3, r2)
            X.XfK r0 = r4.A04
            r0.A00(r6)
            X.YQ8 r2 = r4.A0K
            X.Y4i r1 = r4.A0N
            X.Y8m r2 = (X.C73331Y8m) r2
            java.util.HashMap r0 = r2.A02
            java.lang.Object r0 = r0.remove(r1)
            if (r0 == 0) goto L23
            X.C73331Y8m.A00(r2)
        L23:
            r4.A02(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y8B.A09(boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r44.equals(r43.A05.A09) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.Y4C A00(X.C72851Xp7 r44, long r45) {
        /*
            r43 = this;
            r34 = 0
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = r43
            boolean r0 = r4.A07
            r8 = r44
            if (r0 != 0) goto L22
            X.Y4C r0 = r4.A05
            long r1 = r0.A0I
            int r0 = (r34 > r1 ? 1 : (r34 == r1 ? 0 : -1))
            if (r0 != 0) goto L22
            X.Y4C r0 = r4.A05
            X.Xp7 r0 = r0.A09
            boolean r1 = r8.equals(r0)
            r0 = 0
            if (r1 != 0) goto L23
        L22:
            r0 = 1
        L23:
            r4.A07 = r0
            X.Y4C r1 = r4.A05
            X.Y1Q r7 = r1.A0A
            X.XmJ r6 = r1.A0B
            java.util.List r5 = r1.A0C
            X.XoY r0 = r4.A0M
            boolean r0 = r0.A02
            if (r0 == 0) goto L50
            X.Y1Q r7 = X.Y1Q.A02
            X.XmJ r6 = r4.A0P
            X.YMR[] r3 = r6.A02
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            r0.<init>()
            int r2 = r3.length
            r1 = 0
        L40:
            if (r1 >= r2) goto L5c
            r0 = r3[r1]
            if (r0 == 0) goto L4d
            java.lang.String r0 = "formats"
            java.lang.NullPointerException r0 = X.AbstractC166987dD.A15(r0)
            throw r0
        L4d:
            int r1 = r1 + 1
            goto L40
        L50:
            X.Xp7 r0 = r1.A09
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L60
            X.Y1Q r7 = X.Y1Q.A02
            X.XmJ r6 = r4.A0P
        L5c:
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.of()
        L60:
            X.Y4C r0 = r4.A05
            androidx.media3.common.Timeline r15 = r0.A06
            int r14 = r0.A01
            X.XQ6 r13 = r0.A07
            boolean r12 = r0.A0D
            X.Xp7 r11 = r0.A08
            boolean r10 = r0.A0E
            int r9 = r0.A00
            int r4 = r0.A02
            X.Y1o r3 = r0.A05
            long r1 = r0.A0G
            long r38 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = r0.A0F
            X.Y4C r16 = new X.Y4C
            r30 = r45
            r32 = r1
            r36 = r34
            r40 = r12
            r41 = r10
            r42 = r0
            r27 = r4
            r26 = r9
            r25 = r14
            r24 = r5
            r23 = r6
            r22 = r7
            r21 = r11
            r20 = r8
            r19 = r13
            r18 = r15
            r17 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r36, r38, r40, r41, r42)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y8B.A00(X.Xp7, long):X.Y4C");
    }

    private void A01() {
        C72851Xp7 c72851Xp7 = this.A05.A09;
        if (!r0.A08.equals(c72851Xp7)) {
            this.A05 = this.A05.A06(c72851Xp7);
        }
        Y4C y4c = this.A05;
        y4c.A0G = y4c.A0I;
        this.A05.A0J = 0L;
    }

    private void A02(int i) {
        Y4C y4c = this.A05;
        if (y4c.A01 != i) {
            this.A05 = y4c.A02(i);
        }
    }

    private void A03(Y1o y1o) {
        ((Y8Y) this.A0G).A00.removeMessages(16);
        C72789Xn9 c72789Xn9 = this.A0H.A01;
        if (c72789Xn9.A03) {
            c72789Xn9.A01 += Util.A03(SystemClock.elapsedRealtime() - c72789Xn9.A00);
            if (c72789Xn9.A03) {
                c72789Xn9.A00 = SystemClock.elapsedRealtime();
            }
        }
        c72789Xn9.A02 = y1o;
    }

    private void A04(Y1o y1o, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.A04.A00(1);
            }
            Y4C y4c = this.A05;
            Timeline timeline = y4c.A06;
            C72851Xp7 c72851Xp7 = y4c.A09;
            long j = y4c.A04;
            long j2 = y4c.A03;
            int i = y4c.A01;
            XQ6 xq6 = y4c.A07;
            boolean z3 = y4c.A0D;
            this.A05 = new Y4C(y1o, timeline, xq6, c72851Xp7, y4c.A08, y4c.A0A, y4c.A0B, y4c.A0C, i, y4c.A00, y4c.A02, j, j2, y4c.A0G, y4c.A0J, y4c.A0I, y4c.A0H, z3, y4c.A0E, y4c.A0F);
        }
        for (YRF yrf : this.A0T) {
            if (yrf != null && (yrf instanceof XQN)) {
                XQN xqn = (XQN) yrf;
                if (xqn instanceof XQM) {
                    xqn = (XQM) xqn;
                }
                xqn.A01 = 1.0f;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dc, code lost:
    
        if ((-9223372036854775807L) != r3.A04) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (0 != r11.A05.A0I) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(androidx.media3.common.Timeline r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y8B.A07(androidx.media3.common.Timeline, boolean):void");
    }

    private void A0A(boolean z, boolean z2, boolean z3) {
        ((Y8Y) this.A0G).A00.removeMessages(2);
        XQ6 xq6 = null;
        C72789Xn9 c72789Xn9 = this.A0H.A01;
        if (c72789Xn9.A03) {
            c72789Xn9.A01 += Util.A03(SystemClock.elapsedRealtime() - c72789Xn9.A00);
            if (c72789Xn9.A03) {
                c72789Xn9.A00 = SystemClock.elapsedRealtime();
            }
            c72789Xn9.A03 = false;
        }
        this.A01 = 1000000000000L;
        YRF[] yrfArr = this.A0T;
        for (int i = 0; i < yrfArr.length; i++) {
        }
        if (z) {
            for (YRF yrf : yrfArr) {
                if (this.A0S.remove(yrf)) {
                    try {
                        AbstractC73334Y8p abstractC73334Y8p = (AbstractC73334Y8p) yrf;
                        WDn.A02(AbstractC167007dF.A1N(0));
                        abstractC73334Y8p.A06.A00();
                        abstractC73334Y8p.A01();
                    } catch (RuntimeException e) {
                        AbstractC63374Sil.A05("ExoPlayerImplInternal", "Reset failed.", e);
                    }
                }
            }
        }
        Y4C y4c = this.A05;
        C72851Xp7 c72851Xp7 = y4c.A09;
        long j = y4c.A0I;
        Y4C y4c2 = this.A05;
        C72851Xp7 c72851Xp72 = y4c2.A09;
        C72843Xop c72843Xop = this.A0D;
        Timeline timeline = y4c2.A06;
        if (!AbstractC167007dF.A1N(timeline.A02())) {
            timeline.A09(c72843Xop, c72851Xp72.A04);
            throw C00O.createAndThrow();
        }
        long j2 = y4c2.A04;
        C72836XoV c72836XoV = this.A0L;
        Timeline timeline2 = this.A05.A06;
        if (z2 && (timeline2 instanceof XQH)) {
            XQH xqh = (XQH) timeline2;
            YMO ymo = this.A0M.A01;
            Timeline[] timelineArr = xqh.A05;
            int length = timelineArr.length;
            Timeline[] timelineArr2 = new Timeline[length];
            for (int i2 = 0; i2 < length; i2++) {
                timelineArr2[i2] = new XQP(timelineArr[i2], xqh);
            }
            timeline2 = new XQH(ymo, timelineArr2, xqh.A06);
        }
        Y4C y4c3 = this.A05;
        int i3 = y4c3.A01;
        if (!z3) {
            xq6 = y4c3.A07;
        }
        this.A05 = new Y4C(y4c3.A05, timeline2, xq6, c72851Xp7, c72851Xp7, y4c3.A0A, y4c3.A0B, y4c3.A0C, i3, y4c3.A00, y4c3.A02, j2, j, j, 0L, j, 0L, false, y4c3.A0E, false);
        if (z2) {
            c72836XoV.A00();
            C72839XoY c72839XoY = this.A0M;
            HashMap hashMap = c72839XoY.A06;
            Iterator A0k = AbstractC167007dF.A0k(hashMap);
            if (A0k.hasNext()) {
                A0k.next();
                try {
                    throw AbstractC166987dD.A15("mediaSource");
                } catch (RuntimeException e2) {
                    AbstractC63374Sil.A05(AbstractC111324zv.A00(3674), AbstractC111324zv.A00(3623), e2);
                    throw AbstractC166987dD.A15("mediaSource");
                }
            }
            hashMap.clear();
            c72839XoY.A0A.clear();
            c72839XoY.A02 = false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:231:0x0166
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0499  */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.XfK, java.lang.Object] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r20) {
        /*
            Method dump skipped, instructions count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y8B.handleMessage(android.os.Message):boolean");
    }

    private void A05(Timeline timeline, Timeline timeline2) {
        if (AbstractC167007dF.A1N(timeline.A02()) && AbstractC167007dF.A1N(timeline2.A02())) {
            return;
        }
        ArrayList arrayList = this.A0R;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            arrayList.get(size);
            throw AbstractC166987dD.A15("resolvedPeriodUid");
        }
        Collections.sort(arrayList);
    }

    private void A06(Timeline timeline, C72851Xp7 c72851Xp7) {
        if (AbstractC167007dF.A1N(timeline.A02())) {
            Y1o y1o = this.A05.A05;
            if (!this.A0H.A01.A02.equals(y1o)) {
                A03(y1o);
                A04(this.A05.A05, false, false);
                return;
            }
            return;
        }
        timeline.A09(this.A0D, c72851Xp7.A04);
        throw C00O.createAndThrow();
    }
}
