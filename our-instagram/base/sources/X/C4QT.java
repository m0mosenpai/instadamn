package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.endtoend.EndToEnd;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4QT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4QT extends C4QU implements C4QW, C4QY, C4QZ, InterfaceC95144Qa, InterfaceC95154Qb {
    public double A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A07;
    public int A09;
    public int A0A;
    public int A0B;
    public PowerManager.WakeLock A0C;
    public ViewGroup A0D;
    public C95744Si A0E;
    public C116845Qn A0F;
    public C4SM A0G;
    public C116815Qk A0H;
    public InterfaceC74623Ww A0J;
    public C95334Qt A0K;
    public C66354UBs A0L;
    public C3Q0 A0M;
    public C30G A0N;
    public C4SE A0O;
    public AbstractC97724aA A0P;
    public String A0Q;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0W;
    public boolean A0Y;
    public boolean A0a;
    public int A0d;
    public C95224Qi A0e;
    public C95654Rz A0f;
    public boolean A0g;
    public final int A0i;
    public final long A0j;
    public final Context A0k;
    public final HandlerC25861Nt A0l;
    public final UserSession A0m;
    public final InterfaceC95284Qo A0n;
    public final C95264Qm A0o;
    public final C30P A0p;
    public final C95644Ry A0q;
    public final C95634Rx A0r;
    public final C95604Ru A0s;
    public final C95294Qp A0t;
    public final C123175hs A0v;
    public final Runnable A0w;
    public final String A0z;
    public final boolean A12;
    public final boolean A13;
    public final boolean A14;
    public final boolean A15;
    public final boolean A16;
    public final boolean A17;
    public final boolean A18;
    public final boolean A19;
    public final boolean A1A;
    public final int A1B;
    public final C95624Rw A1C;
    public final C121595fA A1D;
    public final boolean A1E;
    public final boolean A1F;
    public final boolean A1G;
    public final boolean A1H;
    public final boolean A1I;
    public final boolean A1J;
    public final int[] A1K;
    public static final EnumSet A1M = EnumSet.of(C3Q0.PLAYING, C3Q0.PAUSED, C3Q0.STOPPING);
    public static final List A1N = Arrays.asList("explore_event_viewer", "feed_contextual_chain", "explore_video_chaining");
    public static final InterfaceC08100bW A1L = new C1QF("IgSecureUriParser").A00;
    public final HandlerC95174Qd A0u = new HandlerC95174Qd(this);
    public EnumC95184Qe A0I = EnumC95184Qe.A03;
    public boolean A0X = true;
    public boolean A0V = true;
    public boolean A0Z = false;
    public int A06 = 100;
    public int A08 = 0;
    public boolean A0c = false;
    public boolean A0h = false;
    public final AtomicBoolean A11 = new AtomicBoolean(false);
    public boolean A0b = false;
    public final HashSet A10 = new HashSet();
    public AtomicBoolean A0R = new AtomicBoolean(false);
    public final Runnable A0x = new Runnable() { // from class: X.4Qf
        @Override // java.lang.Runnable
        public final void run() {
            C4QT c4qt = C4QT.this;
            EnumSet enumSet = C4QT.A1M;
            PowerManager.WakeLock wakeLock = c4qt.A0C;
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC09820fg.A01(wakeLock);
            }
        }
    };
    public final Runnable A0y = new Runnable() { // from class: X.4Qg
        @Override // java.lang.Runnable
        public final void run() {
            C4QT c4qt = C4QT.this;
            EnumSet enumSet = C4QT.A1M;
            PowerManager.WakeLock wakeLock = c4qt.A0C;
            if (wakeLock != null && !wakeLock.isHeld()) {
                double d = c4qt.A00;
                if (d > 0.0d) {
                    long j = (long) (d * 1000.0d);
                    wakeLock.acquire(j);
                    C0BX.A01(wakeLock, j);
                    return;
                }
                AbstractC09820fg.A00(wakeLock);
            }
        }
    };

    public static C4SG A00(C4S7 c4s7, C4QT c4qt) {
        return A02(c4s7, c4qt, null, c4qt.A0B, c4qt.A07, c4qt.A03, c4qt.getCurrentPositionMs(), c4s7.A00);
    }

    public static C4SG A01(C4S7 c4s7, C4QT c4qt, int i) {
        return A02(c4s7, c4qt, null, c4qt.A0B, c4qt.A07, c4qt.A03, i, c4s7.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7.A0m, 36316224820416683L) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0N(final X.AbstractC97724aA r8, final java.lang.Object r9) {
        /*
            r7 = this;
            r6 = 0
            r7.A0T = r6
            X.4Qt r4 = r7.A0K
            r5 = 1
            if (r4 == 0) goto L3e
            boolean r0 = r9 instanceof android.graphics.SurfaceTexture
            if (r0 != 0) goto L1f
            boolean r0 = r9 instanceof android.view.Surface
            if (r0 == 0) goto L2f
            com.instagram.common.session.UserSession r3 = r7.A0m
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316224820416683(0x81056a000110ab, double:3.029865037906773E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L2f
        L1f:
            X.5jC r0 = new X.5jC
            r0.<init>()
            X.5wp r1 = new X.5wp
            r1.<init>(r4, r0)
            X.4RP r0 = r4.A09
            r0.A0E(r1)
            return r6
        L2f:
            X.4SE r0 = r7.A0O
            if (r0 == 0) goto L39
            X.4QP r0 = r0.A03
            boolean r0 = r0.A03
            if (r0 != 0) goto L43
        L39:
            r1 = 0
            X.4RP r0 = r4.A09
            r0.A04 = r1
        L3e:
            X.30G r0 = r7.A0N
            r0.onSurfaceTextureDestroyed()
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4QT.A0N(X.4aA, java.lang.Object):boolean");
    }

    @Override // X.C4QY
    public final C4AK CFc() {
        return null;
    }

    @Override // X.InterfaceC95144Qa
    public final void Cxu(int i, int i2) {
        if (this.A0O != null && this.A0M == C3Q0.PLAYING) {
            int i3 = 25;
            if (i2 > i) {
                i3 = 24;
            }
            Integer valueOf = Integer.valueOf(i3);
            C95634Rx c95634Rx = this.A0r;
            int intValue = valueOf.intValue();
            c95634Rx.A03(i2, intValue);
            C95264Qm c95264Qm = this.A0o;
            C4S7 c4s7 = this.A0O.A0B;
            Object obj = c4s7.A03;
            boolean z = false;
            if (Float.compare(i2, 0.0f) != 0) {
                z = true;
            }
            c95264Qm.EIX(A02(c4s7, this, null, this.A0B, this.A07, this.A03, getCurrentPositionMs(), z), obj, intValue, false);
        }
    }

    @Override // X.C4QW
    public final void EhI(float f, int i) {
        float min = Math.min(Math.max(f, 0.0f), 1.0f);
        this.A0K.getClass();
        this.A0r.A02(min, i);
        this.A0K.EhH(min);
        this.A02 = min;
        C4SE c4se = this.A0O;
        if (c4se != null && this.A0M == C3Q0.PLAYING) {
            C95264Qm c95264Qm = this.A0o;
            C4S7 c4s7 = c4se.A0B;
            Object obj = c4s7.A03;
            boolean z = false;
            if (Float.compare(min, 0.0f) != 0) {
                z = true;
            }
            c95264Qm.EIX(A02(c4s7, this, null, this.A0B, this.A07, this.A03, getCurrentPositionMs(), z), obj, i, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c2, code lost:
    
        if (r20.A08().equals(X.C05F.A04) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00dd, code lost:
    
        if (r20.A08().equals(X.C05F.A01) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e7, code lost:
    
        if (r12 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0228, code lost:
    
        if (X.C18U.A06(r2, r19, 36312097358545826L) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a7, code lost:
    
        if (r20.A08().equals(X.C05F.A01) != false) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, X.4Qi] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.4Qm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, X.4Ru] */
    /* JADX WARN: Type inference failed for: r0v86, types: [X.4Ry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, X.4Rz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4QT(android.content.Context r18, com.instagram.common.session.UserSession r19, X.C30P r20, X.C30G r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4QT.<init>(android.content.Context, com.instagram.common.session.UserSession, X.30P, X.30G, java.lang.String):void");
    }

    public static C4SG A02(C4S7 c4s7, C4QT c4qt, String str, int i, int i2, int i3, int i4, boolean z) {
        Float f;
        Float f2;
        boolean z2;
        boolean z3;
        int i5;
        String str2;
        String str3;
        if (c4qt.A0P != null) {
            f = Float.valueOf(r0.A02().getWidth());
            f2 = Float.valueOf(c4qt.A0P.A02().getHeight());
        } else {
            f = null;
            f2 = null;
        }
        int i6 = c4qt.A0t.A01.A00;
        Integer valueOf = Integer.valueOf(i6);
        if (c4qt.A13) {
            if (i6 >= c4qt.A1B) {
                c4qt.A0S = true;
                c4qt.A05 = i4;
                c4qt.A0d = 0;
            } else {
                c4qt.A0S = false;
            }
        }
        C4SE c4se = c4qt.A0O;
        if (c4se != null) {
            z2 = !c4se.A03.A02;
        } else {
            z2 = true;
        }
        int i7 = c4s7.A01;
        int Azm = c4qt.Azm();
        C4SE c4se2 = c4qt.A0O;
        if (c4se2 != null) {
            z3 = c4se2.A05;
        } else {
            z3 = false;
        }
        if (c4se2 == null) {
            i5 = -1;
        } else {
            i5 = c4se2.A01;
        }
        int i8 = c4qt.A08;
        c4qt.A0K.getClass();
        String Be2 = c4qt.A0K.Be2();
        c4qt.A0K.getClass();
        C4SS c4ss = c4qt.A0K.A09.A08;
        if (c4ss != null) {
            str2 = c4ss.A07;
        } else {
            str2 = null;
        }
        float f3 = c4qt.A02;
        boolean z4 = c4qt.A0b;
        String str4 = c4qt.A0Q;
        int i9 = c4qt.A0k.getResources().getConfiguration().orientation;
        if (i9 != 1) {
            if (i9 != 2) {
                str3 = null;
            } else {
                str3 = "landscape";
            }
        } else {
            str3 = "portrait";
        }
        return new C4SG(null, f, f2, valueOf, Be2, str2, str4, str3, c4s7.A04, str, f3, i7, i4, i3, -1, -1, Azm, i, i2, -1, -1, i5, i8, z, z3, z4, z2);
    }

    private void A03() {
        if (this.A0X) {
            HandlerC25861Nt handlerC25861Nt = this.A0l;
            Runnable runnable = this.A0x;
            handlerC25861Nt.removeCallbacks(runnable);
            handlerC25861Nt.A02(runnable, 1827799077, 120000L);
            handlerC25861Nt.A01(1827799077, this.A0y);
        }
    }

    private void A04() {
        C4SE c4se = this.A0O;
        C95334Qt c95334Qt = this.A0K;
        if (c4se != null && c95334Qt != null) {
            this.A0o.EIf(c4se.A0B.A03, c95334Qt.Be0());
        }
    }

    private void A05() {
        C4SE c4se = this.A0O;
        if (c4se != null) {
            try {
                if (c4se.A08 > 0) {
                    C75363a3 c75363a3 = c4se.A0A;
                    if (!this.A0Z && (c75363a3 == null || !c75363a3.A0T)) {
                        this.A0K.getClass();
                        this.A0K.seekTo(this.A0O.A08);
                    }
                }
                C4SE c4se2 = this.A0O;
                if (c4se2.A08 > 0) {
                    C4SE c4se3 = new C4SE(c4se2, getCurrentPositionMs());
                    this.A0O = c4se3;
                    c4se2 = c4se3;
                }
                if (c4se2.A0E) {
                    if (!this.A14 || !this.A0R.get()) {
                        A0K(this.A0O.A0D, false, true);
                    }
                }
            } catch (IllegalStateException e) {
                this.A0N.onVideoPlayerError(this.A0O.A0B, e.toString());
            }
        }
    }

    private void A06() {
        AnonymousClass195 anonymousClass195;
        View A02;
        ViewGroup A00;
        AbstractC97724aA abstractC97724aA = this.A0P;
        if (abstractC97724aA != null && (A00 = AbstractC124845kp.A00((A02 = abstractC97724aA.A02()))) != null) {
            A00.removeView(A02);
        }
        C123175hs c123175hs = this.A0v;
        if (c123175hs != null && (anonymousClass195 = c123175hs.A01) != null) {
            anonymousClass195.AGH(null);
            c123175hs.A01 = null;
            C123175hs.A05--;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.4SM, java.lang.Object] */
    private void A08(C4SJ c4sj) {
        if (this.A0G == null && this.A0K != null) {
            ?? obj = new Object();
            obj.A01 = c4sj;
            this.A0G = obj;
            C95624Rw c95624Rw = this.A1C;
            C14360o3.A0B(c95624Rw, 0);
            ((AbstractC95614Rv) c95624Rw).A00 = obj;
            C4SM c4sm = this.A0G;
            C95604Ru c95604Ru = this.A0s;
            C14360o3.A0B(c95604Ru, 0);
            c95604Ru.A00 = c4sm;
            C4SM c4sm2 = this.A0G;
            C95644Ry c95644Ry = this.A0q;
            C14360o3.A0B(c95644Ry, 0);
            c95644Ry.A00 = c4sm2;
            C4SM c4sm3 = this.A0G;
            C95634Rx c95634Rx = this.A0r;
            C14360o3.A0B(c95634Rx, 0);
            ((AbstractC95614Rv) c95634Rx).A00 = c4sm3;
            C4SM c4sm4 = this.A0G;
            C95654Rz c95654Rz = this.A0f;
            C14360o3.A0B(c95654Rz, 0);
            c95654Rz.A00 = c4sm4;
            C4SK c4sk = this.A0G.A01;
            if (c4sk != null) {
                ((C4SJ) c4sk).A01 = new WeakReference(this);
            }
            this.A0K.EYX(this.A0G);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c2, code lost:
    
        if (r6.A03.A03 == false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A09(X.InterfaceC74623Ww r18, X.C4QT r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4QT.A09(X.3Ww, X.4QT, int, boolean):void");
    }

    private void A0A(C4SG c4sg, Object obj, String str, String str2) {
        String A00;
        C95264Qm c95264Qm = this.A0o;
        C95744Si c95744Si = this.A0E;
        if (c95744Si == null) {
            A00 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            c95744Si.A00.drainTo(arrayList);
            A00 = C95744Si.A00(arrayList);
        }
        c95264Qm.EIh(c4sg, obj, str, str2, A00, null);
    }

    private void A0B(C95304Qq c95304Qq, Boolean bool) {
        C4S7 c4s7;
        if (this.A0O != null && CFA() != null) {
            if (!this.A1I && this.A1H && !CdZ()) {
                return;
            }
            if (this.A13) {
                if (c95304Qq.A00 >= this.A1B) {
                    this.A0S = true;
                    this.A05 = getCurrentPositionMs();
                    this.A0d = 0;
                } else {
                    this.A0S = false;
                }
            }
            C95624Rw c95624Rw = this.A1C;
            boolean booleanValue = bool.booleanValue();
            c95624Rw.A02(c95304Qq, booleanValue);
            if (booleanValue || (c4s7 = this.A0O.A0B) == null || !this.A1H || !CdZ()) {
                return;
            }
            this.A0o.EIt(A00(c4s7, this), c4s7.A03, c95304Qq.A00);
        }
    }

    public static void A0C(C3Q0 c3q0, C4QT c4qt) {
        boolean z;
        boolean z2;
        C3Q0 c3q02 = c4qt.A0M;
        C3Q0 c3q03 = C3Q0.IDLE;
        if (c3q02 == c3q03 && ((c3q0 == C3Q0.PLAYING || c3q0 == C3Q0.PREPARED) && c4qt.A14)) {
            return;
        }
        c4qt.A0M = c3q0;
        C121595fA c121595fA = c4qt.A1D;
        if (c121595fA != null) {
            c121595fA.A00 = c3q0;
            C37911pU c37911pU = c121595fA.A01;
            synchronized (c37911pU) {
                java.util.Set<Reference> set = c37911pU.A02;
                for (Reference reference : set) {
                    C121595fA c121595fA2 = (C121595fA) reference.get();
                    if (c121595fA2 != null) {
                        C3Q0 c3q04 = c121595fA2.A00;
                        if (C37911pU.A00(c3q03) <= C37911pU.A00(c3q04)) {
                            c3q03 = c3q04;
                        }
                    } else {
                        set.remove(reference);
                    }
                }
                if (C37911pU.A00(c3q03) > c37911pU.A00) {
                    C14080nY c14080nY = c37911pU.A01;
                    synchronized (c14080nY.A01) {
                        try {
                            z2 = c14080nY.A00;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!z2) {
                        c14080nY.A02();
                    }
                } else {
                    C14080nY c14080nY2 = c37911pU.A01;
                    synchronized (c14080nY2.A01) {
                        try {
                            z = c14080nY2.A00;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (z) {
                        c14080nY2.A01();
                    }
                }
            }
        }
        Iterator it = c4qt.A10.iterator();
        if (!it.hasNext()) {
            return;
        }
        it.next();
        throw new NullPointerException("onStateChanged");
    }

    public static void A0E(final C4QT c4qt) {
        C4SE c4se;
        final C75363a3 c75363a3;
        if (c4qt.A0O != null && C42831yB.A00().A02) {
            final Runnable runnable = new Runnable() { // from class: X.J3m
                @Override // java.lang.Runnable
                public final void run() {
                    C4QT.A0I(C4QT.this);
                }
            };
            long elapsedRealtime = SystemClock.elapsedRealtime() - c4qt.A0O.A04.A00;
            if (c4qt.A0Q != null && C42831yB.A00().A02 && (c4se = c4qt.A0O) != null && (c75363a3 = c4se.A0A) != null && elapsedRealtime > 0) {
                long A01 = C42831yB.A00().A01(c75363a3) - elapsedRealtime;
                if (A01 > 0) {
                    c4qt.A0u.postDelayed(new Runnable() { // from class: X.WvR
                        @Override // java.lang.Runnable
                        public final void run() {
                            C75363a3 c75363a32 = C75363a3.this;
                            Runnable runnable2 = runnable;
                            EnumSet enumSet = C4QT.A1M;
                            if (C42831yB.A00().A01(c75363a32) > 0) {
                                runnable2.run();
                            }
                        }
                    }, A01);
                    return;
                }
            }
            runnable.run();
            return;
        }
        A0I(c4qt);
    }

    public static void A0F(C4QT c4qt) {
        if ((c4qt.A1G || c4qt.A1I) && A0L(c4qt)) {
            View CFf = c4qt.CFf();
            C95294Qp c95294Qp = c4qt.A0t;
            c95294Qp.A00 = CFf;
            c95294Qp.A02(c4qt);
            if (c4qt.A0U || c4qt.A15) {
                c4qt.A0B(c95294Qp.A01, Boolean.valueOf(c4qt.A1J));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0G(X.C4QT r5) {
        /*
            X.4aA r0 = r5.A0P
            r3 = 0
            if (r0 == 0) goto L77
            android.view.View r2 = r0.A02()
            if (r2 == 0) goto L78
            android.view.ViewParent r4 = r2.getParent()
            android.view.View r4 = (android.view.View) r4
        L11:
            X.4Qt r0 = r5.A0K
            if (r0 == 0) goto L19
            android.view.SurfaceControl r3 = r0.A05()
        L19:
            boolean r0 = r5.A0T
            if (r0 != 0) goto L76
            boolean r0 = r5.A0a
            if (r0 == 0) goto L76
            X.4SE r0 = r5.A0O
            if (r0 == 0) goto L76
            if (r4 == 0) goto L76
            X.4QP r0 = r0.A03
            boolean r0 = r0.A03
            if (r0 == 0) goto L76
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L76
            boolean r0 = r2 instanceof android.view.SurfaceView
            if (r0 == 0) goto L76
            android.view.SurfaceView r2 = (android.view.SurfaceView) r2
            android.view.SurfaceHolder r0 = r2.getHolder()
            android.view.Surface r0 = r0.getSurface()
            if (r0 == 0) goto L76
            android.view.SurfaceHolder r0 = r2.getHolder()
            android.view.Surface r0 = r0.getSurface()
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L76
            if (r3 == 0) goto L76
            android.view.SurfaceControl r1 = r2.getSurfaceControl()
            android.view.SurfaceControl$Transaction r0 = new android.view.SurfaceControl$Transaction
            r0.<init>()
            android.view.SurfaceControl$Transaction r2 = r0.reparent(r3, r1)
            int r1 = r4.getWidth()
            int r0 = r4.getHeight()
            android.view.SurfaceControl$Transaction r0 = r2.setBufferSize(r3, r1, r0)
            r1 = 1
            android.view.SurfaceControl$Transaction r0 = r0.setVisibility(r3, r1)
            r0.apply()
            r5.A0T = r1
        L76:
            return
        L77:
            r2 = r3
        L78:
            r4 = r3
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4QT.A0G(X.4QT):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0H(C4QT c4qt) {
        SurfaceHolderCallbackC98844c4 surfaceHolderCallbackC98844c4;
        A6H a6h;
        ViewGroup viewGroup;
        AbstractC97724aA abstractC97724aA = c4qt.A0P;
        if ((abstractC97724aA instanceof SurfaceHolderCallbackC98844c4) && (a6h = (surfaceHolderCallbackC98844c4 = (SurfaceHolderCallbackC98844c4) abstractC97724aA).A00) != null) {
            ViewParent parent = surfaceHolderCallbackC98844c4.A02.getParent();
            C14360o3.A07(parent);
            if (!C14360o3.A0K(a6h.A00, true)) {
                ViewParent parent2 = parent.getParent();
                Object obj = null;
                if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                    C12500ku c12500ku = new C12500ku(viewGroup);
                    while (true) {
                        if (!c12500ku.hasNext()) {
                            break;
                        }
                        Object next = c12500ku.next();
                        if (next instanceof IgImageView) {
                            obj = next;
                            break;
                        }
                    }
                    View view = (View) obj;
                    if (view != null && (parent instanceof View)) {
                        viewGroup.removeView(view);
                        viewGroup.addView(view, viewGroup.indexOfChild((View) parent));
                        a6h.A00 = true;
                    }
                }
            }
        }
        if (!c4qt.A0V) {
            c4qt.A0K.getClass();
            c4qt.A0V = true;
            c4qt.A0u.removeMessages(1);
            C4SE c4se = c4qt.A0O;
            if (c4se != null && c4qt.A0K != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - c4se.A09;
                c4qt.A0N.onVideoViewPrepared(c4se.A0B);
                C4R0 c4r0 = c4qt.A0K.A0j;
                c4qt.A0o.EIo(c4qt.A0O.A0B.A03, c4r0.A02, c4r0.A01, c4r0.A00, elapsedRealtime);
            }
        }
        C4SE c4se2 = c4qt.A0O;
        if (c4se2 != null) {
            c4qt.A0N.onSurfaceTextureUpdated(c4se2.A0B);
        }
    }

    public static void A0I(C4QT c4qt) {
        C4SE c4se;
        C30G c30g;
        boolean z = c4qt.A14;
        boolean z2 = !z;
        if (c4qt.A0M == C3Q0.PREPARING && c4qt.A0O != null) {
            A0C(C3Q0.PREPARED, c4qt);
            if (!z) {
                c4qt.A05();
                c30g = c4qt.A0N;
                c4se = c4qt.A0O;
                c30g.onVideoPrepared(c4se.A0B, z2);
            }
        } else if (!z) {
            return;
        }
        c4se = c4qt.A0O;
        if (c4se == null) {
            return;
        }
        c30g = c4qt.A0N;
        c30g.onVideoPrepared(c4se.A0B, z2);
    }

    public static void A0J(C4QT c4qt, int i) {
        View view;
        if (c4qt.A13) {
            for (int i2 : c4qt.A1K) {
                if (i2 > c4qt.A0d && i2 <= i) {
                    c4qt.A0d = i2;
                    C95294Qp c95294Qp = c4qt.A0t;
                    String CFA = c4qt.CFA();
                    C95314Qr c95314Qr = c95294Qp.A05;
                    int i3 = c95294Qp.A01.A00;
                    if (CFA != null && c95314Qr.A04) {
                        c95314Qr.A00 = i2;
                        String str = (String) AbstractC001900j.A0R(CFA, new String[]{"_"}, 0).get(0);
                        int[] iArr = c95314Qr.A05;
                        int i4 = 0;
                        do {
                            int i5 = iArr[i4];
                            if (i5 == c95314Qr.A00) {
                                if (50 <= i3) {
                                    int i6 = i5 / 1000;
                                    WeakReference weakReference = c95314Qr.A02;
                                    if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                        view.setContentDescription(AnonymousClass001.A05(i6, "Played ", "s ", str));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i4++;
                        } while (i4 < 2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r1 == X.C3Q0.PAUSED) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0K(java.lang.String r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A0R
            r3 = 1
            r0.set(r3)
            android.content.Context r0 = r6.A0k
            boolean r0 = X.AbstractC56862jK.A00(r0)
            if (r0 == 0) goto L17
            java.lang.String r0 = "autoplay"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L17
        L16:
            return
        L17:
            X.4SE r4 = r6.A0O
            if (r4 == 0) goto L28
            if (r9 != 0) goto L28
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.4SF r2 = new X.4SF
            r2.<init>(r7, r0)
            r4.A04 = r2
        L28:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A11
            r4 = 0
            r0.set(r4)
            X.4Qt r0 = r6.A0K
            r0.getClass()
            X.4SE r0 = r6.A0O
            if (r0 == 0) goto Lcc
            X.4QP r1 = r0.A03
            boolean r0 = r1.A01
            if (r0 == 0) goto Lcc
            boolean r1 = r1.A00
        L3f:
            X.4Qt r0 = r6.A0K
            r0.EYb(r1)
            X.4Qt r0 = r6.A0K
            r0.start()
            com.instagram.common.session.UserSession r5 = r6.A0m
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36310950600769925(0x81009e00040185, double:3.0265296001645856E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto Lca
            r0 = 36310950600835462(0x81009e00050186, double:3.0265296002060315E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto Lca
            X.3Q0 r1 = r6.A0M
            X.3Q0 r0 = X.C3Q0.PREPARED
            if (r1 != r0) goto Lca
            int r0 = r6.A08
            if (r0 <= 0) goto Lca
        L6d:
            X.3Q0 r1 = r6.A0M
            X.3Q0 r0 = X.C3Q0.PREPARED
            if (r1 == r0) goto La9
            X.3Q0 r0 = X.C3Q0.PAUSED
            if (r1 != r0) goto L99
        L77:
            if (r8 != 0) goto L91
            boolean r0 = r6.A18
            if (r0 == 0) goto L81
            boolean r0 = r6.A1F
            if (r0 == 0) goto L91
        L81:
            int r2 = r6.getCurrentPositionMs()
            r6.A03 = r2
        L87:
            boolean r0 = r6.A0S
            if (r0 == 0) goto L91
            int r0 = r6.A05
            int r2 = r2 - r0
            A0J(r6, r2)
        L91:
            X.4SE r0 = r6.A0O
            if (r0 == 0) goto L99
            if (r3 != 0) goto L99
            r0.A01 = r4
        L99:
            boolean r0 = r6.A14
            if (r0 != 0) goto L16
            X.3Q0 r0 = X.C3Q0.PLAYING
            A0C(r0, r6)
            X.4Qd r1 = r6.A0u
            r0 = 2
            r1.sendEmptyMessage(r0)
            return
        La9:
            X.4SE r1 = r6.A0O
            if (r1 == 0) goto L77
            boolean r0 = r6.A18
            if (r0 == 0) goto Lb5
            boolean r0 = r6.A1F
            if (r0 == 0) goto L91
        Lb5:
            int r1 = r1.A08
            if (r3 == 0) goto Lc8
            int r2 = r6.A03
        Lbb:
            r6.A03 = r2
            boolean r0 = r6.A13
            if (r0 == 0) goto L91
            if (r1 != r2) goto L87
            r6.A05 = r2
            r6.A0d = r4
            goto L91
        Lc8:
            r2 = r1
            goto Lbb
        Lca:
            r3 = 0
            goto L6d
        Lcc:
            boolean r1 = r6.A0g
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4QT.A0K(java.lang.String, boolean, boolean):void");
    }

    public static boolean A0L(C4QT c4qt) {
        if (c4qt.A0O == null || c4qt.CFA() == null) {
            return false;
        }
        if (c4qt.A1H && !c4qt.CdZ() && !EndToEnd.isRunningEndToEndTest() && !c4qt.A1I) {
            return false;
        }
        return true;
    }

    public static boolean A0M(C4QT c4qt) {
        C4SE c4se = c4qt.A0O;
        if (c4se == null) {
            return false;
        }
        C4S8 c4s8 = c4se.A0B.A02;
        if (c4s8.A00 != EnumC92424Bx.CACHED && !c4s8.A03) {
            return false;
        }
        return true;
    }

    @Override // X.C4QW
    public final C9C1 AuC() {
        C95334Qt c95334Qt = this.A0K;
        if (c95334Qt != null) {
            C4RQ c4rq = c95334Qt.A09.A0I;
            if (c4rq.A0I()) {
                return ((C4RU) c4rq.A0B.get()).A0K;
            }
            return null;
        }
        return null;
    }

    @Override // X.C4QW
    public final int Azm() {
        this.A0K.getClass();
        return (int) this.A0K.A09.A0I.A09();
    }

    @Override // X.InterfaceC95154Qb
    public final Object Be1() {
        C4S7 c4s7;
        C4SE c4se = this.A0O;
        if (c4se != null && (c4s7 = c4se.A0B) != null) {
            return c4s7.A03;
        }
        return null;
    }

    @Override // X.C4QX, X.InterfaceC95164Qc
    public final String CFA() {
        C75363a3 c75363a3;
        C4SE c4se = this.A0O;
        if (c4se != null && (c75363a3 = c4se.A0A) != null) {
            return c75363a3.A0G;
        }
        return null;
    }

    @Override // X.C4QZ
    public final String CFS() {
        return this.A0Q;
    }

    @Override // X.InterfaceC95164Qc
    public final View CFf() {
        AbstractC97724aA abstractC97724aA = this.A0P;
        if (abstractC97724aA != null) {
            return abstractC97724aA.A02();
        }
        C95334Qt c95334Qt = this.A0K;
        if (c95334Qt != null) {
            return c95334Qt.A09.A04;
        }
        return null;
    }

    @Override // X.C4QY
    public final Integer CFp() {
        int i;
        AbstractC97724aA abstractC97724aA = this.A0P;
        if (abstractC97724aA != null) {
            i = abstractC97724aA.A02().getHeight();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // X.C4QY
    public final Integer CFx() {
        int i;
        AbstractC97724aA abstractC97724aA = this.A0P;
        if (abstractC97724aA != null) {
            i = abstractC97724aA.A02().getWidth();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // X.C4QW
    public final boolean CKi() {
        C4SE c4se;
        C75363a3 c75363a3;
        C4BR A00;
        List list;
        if (this.A0K != null && (c4se = this.A0O) != null && (c75363a3 = c4se.A0A) != null && (A00 = c75363a3.A00(this.A0k)) != null && (list = A00.A00) != null) {
            for (Object obj : list) {
                if ((((C4BB) obj).A02.A0E & 2) != 0) {
                    if (obj != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC95164Qc
    public final boolean CdZ() {
        C75363a3 c75363a3;
        C4S7 c4s7;
        C4SE c4se = this.A0O;
        if (c4se != null && (c75363a3 = c4se.A0A) != null && (c4s7 = c4se.A0B) != null && c4s7.A03 != null) {
            if (c75363a3.A0T) {
                return true;
            }
            return c4s7.A05;
        }
        return false;
    }

    @Override // X.InterfaceC95164Qc
    public final boolean CfM() {
        AbstractC97724aA abstractC97724aA = this.A0P;
        if (abstractC97724aA == null || !(abstractC97724aA instanceof C4a9)) {
            C95334Qt c95334Qt = this.A0K;
            if (c95334Qt != null && (c95334Qt.A09.A04 instanceof TextureView)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.C4QZ
    public final void E0L() {
        A0B(this.A0t.A01, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7.A0m, 36328005915655205L) == false) goto L6;
     */
    @Override // X.C4QW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E3d(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r6 = "fragment_paused"
            boolean r0 = r8.equals(r6)
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L1a
            com.instagram.common.session.UserSession r3 = r7.A0m
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328005915655205(0x81102100003c25, double:3.0373154499742774E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r3 = 1
            if (r0 != 0) goto L1b
        L1a:
            r3 = 0
        L1b:
            boolean r0 = r6.equals(r8)
            if (r0 == 0) goto L3c
            r7.A07()
            boolean r0 = r7.A0X
            if (r0 == 0) goto L3a
            X.1Nt r2 = r7.A0l
            java.lang.Runnable r0 = r7.A0y
            r2.removeCallbacks(r0)
            java.lang.Runnable r1 = r7.A0x
            r2.removeCallbacks(r1)
            r0 = 1827799077(0x6cf20025, float:2.3404858E27)
            r2.A01(r0, r1)
        L3a:
            r7.A0h = r5
        L3c:
            X.3Q0 r1 = r7.A0M
            X.3Q0 r0 = X.C3Q0.PLAYING
            if (r1 == r0) goto L48
            X.3Q0 r0 = X.C3Q0.PREPARING
            if (r1 != r0) goto L8c
            if (r3 == 0) goto L8c
        L48:
            X.4Qt r0 = r7.A0K
            r0.getClass()
            X.4Qt r0 = r7.A0K
            r0.pause()
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0R
            r0.set(r4)
            r7.A04()
            X.3Q0 r0 = X.C3Q0.PAUSED
            A0C(r0, r7)
            X.4SE r0 = r7.A0O
            if (r0 == 0) goto L8c
            X.4S7 r0 = r0.A0B
            X.4SG r3 = A00(r0, r7)
            X.4SE r2 = r7.A0O
            X.4S7 r0 = r2.A0B
            java.lang.Object r1 = r0.A03
            java.lang.String r0 = r2.A0D
            r7.A0A(r3, r1, r0, r8)
            X.4Qm r1 = r7.A0o
            X.4SE r0 = r7.A0O
            X.4S7 r0 = r0.A0B
            java.lang.Object r0 = r0.A03
            r1.EIg(r0)
            java.lang.Runnable r1 = r7.A0w
            if (r1 == 0) goto L8c
            boolean r0 = r7.A12
            if (r0 == 0) goto L8c
            X.1Nt r0 = r7.A0l
            r0.removeCallbacks(r1)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4QT.E3d(java.lang.String):void");
    }

    @Override // X.C4QW
    public final void E4T(String str, boolean z) {
        UserSession userSession = this.A0m;
        C14360o3.A0B(userSession, 0);
        C4SD c4sd = (C4SD) userSession.A01(C4SD.class, new C57517Pfr(userSession, 37));
        WeakReference weakReference = c4sd.A00;
        if (weakReference.get() != this) {
            weakReference.clear();
            c4sd.A00 = new WeakReference(this);
        }
        if (this.A0O == null) {
            C116815Qk c116815Qk = this.A0H;
            if (c116815Qk != null) {
                c116815Qk.A00.EmW("VideoPlayerImpl", "play_with_null_video");
                C116815Qk.A00(c116815Qk, "VideoPlayerImpl", "play_with_null_video");
                return;
            } else {
                C0w9.A03("VideoPlayerImpl", "play_with_null_video");
                return;
            }
        }
        boolean z2 = true;
        if (this.A14 && this.A0R.get()) {
            return;
        }
        if (this.A0h) {
            A03();
            this.A0h = false;
        }
        if (!AbstractC56862jK.A00(this.A0k) || !"start".equals(str)) {
            z2 = false;
        }
        String str2 = "resume";
        if (!"resume".equals(str) && !z2) {
            str2 = "autoplay";
        }
        A0K(str2, z, false);
        C4SE c4se = this.A0O;
        this.A0o.EIj(A01(c4se.A0B, this, c4se.A08), this.A0O.A0B.A03, str);
    }

    @Override // X.C4QW
    public final void EMg(int i, boolean z) {
        boolean z2;
        C4SE c4se;
        boolean z3;
        String str;
        String str2;
        C3Q0 c3q0 = this.A0M;
        C3Q0 c3q02 = C3Q0.PLAYING;
        boolean z4 = false;
        if (c3q0 == c3q02) {
            z4 = true;
        }
        if (this.A0K != null) {
            if (z && this.A0O != null) {
                boolean z5 = this.A1E;
                if (z5 && z4) {
                    E3d("seek");
                }
                C4S7 c4s7 = this.A0O.A0B;
                C4SG A02 = A02(c4s7, this, "seek_user_scrub_or_fast_forward_or_backward", this.A0B, this.A07, this.A03, getCurrentPositionMs(), c4s7.A00);
                if (this.A0M == c3q02) {
                    if (!z5) {
                        C4SE c4se2 = this.A0O;
                        A0A(A02, c4se2.A0B.A03, c4se2.A0D, "seek");
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.A0o.EIk(A02, this.A0O.A0B.A03, i);
            } else {
                z2 = false;
            }
            this.A0K.seekTo(i);
            if (!this.A18 || this.A1F) {
                this.A03 = i;
                this.A05 = i;
                this.A0d = 0;
            }
            if (z4 && this.A1E) {
                E4T("resume", true);
            }
            if (z && (c4se = this.A0O) != null && (this.A0M == c3q02 || z2)) {
                c4se.A01 = 0;
                if (!this.A1E) {
                    this.A0s.A02("resume");
                    C95264Qm c95264Qm = this.A0o;
                    C4S7 c4s72 = this.A0O.A0B;
                    Object obj = c4s72.A03;
                    boolean A0M = A0M(this);
                    boolean z6 = c4s72.A02.A03;
                    C4SG A01 = A01(c4s72, this, i);
                    if (!this.A16 && ((str = this.A0Q) == null || (str2 = this.A0z) == null || !CdZ() || !str.equals(str2))) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    c95264Qm.EIm(A01, obj, "resume", 0L, A0M, z6, z3);
                    A0F(this);
                }
            }
            int Azm = Azm();
            C4SE c4se3 = this.A0O;
            if (c4se3 != null && Azm != 0) {
                c4se3.A00 = i / Azm;
            }
        }
    }

    @Override // X.C4QW
    public final boolean EPc() {
        if (this.A0K != null && CKi()) {
            C4RQ c4rq = this.A0K.A09.A0I;
            C4RQ.A05(c4rq, "selectAudioRole %b", 2);
            Handler handler = c4rq.A0E;
            handler.sendMessage(handler.obtainMessage(46, 2));
            return true;
        }
        return false;
    }

    @Override // X.C4QW
    public final void EQ0(boolean z) {
        C95334Qt c95334Qt = this.A0K;
        if (c95334Qt != null) {
            C4RQ c4rq = c95334Qt.A09.A0I;
            Boolean valueOf = Boolean.valueOf(z);
            C4RQ.A05(c4rq, "selectAudioLangRole %b", valueOf);
            Handler handler = c4rq.A0E;
            handler.sendMessage(handler.obtainMessage(44, valueOf));
        }
    }

    @Override // X.C4QW
    public final void ERX(boolean z) {
        C95334Qt c95334Qt = this.A0K;
        if (c95334Qt != null) {
            c95334Qt.A0U = z;
        }
    }

    @Override // X.C4QW
    public final void EYb(boolean z) {
        this.A0K.getClass();
        this.A0g = z;
        this.A0K.EYb(z);
    }

    @Override // X.C4QW
    public final void EbH(String str) {
        C95334Qt c95334Qt = this.A0K;
        if (c95334Qt != null) {
            C4RQ c4rq = c95334Qt.A09.A0I;
            C4RQ.A05(c4rq, "selectPreferredAudioLang %s", str);
            Handler handler = c4rq.A0E;
            handler.sendMessage(handler.obtainMessage(45, str));
        }
    }

    @Override // X.C4QW
    public final void Ed6(EnumC95184Qe enumC95184Qe) {
        this.A0I = enumC95184Qe;
        AbstractC97724aA abstractC97724aA = this.A0P;
        if (abstractC97724aA != null && (abstractC97724aA instanceof C4a9)) {
            ((C4a9) abstractC97724aA).A02.setScaleType(enumC95184Qe);
        }
    }

    @Override // X.C4QW
    public final void Ef8(boolean z, String str) {
        C95334Qt c95334Qt = this.A0K;
        if (c95334Qt != null) {
            C4RQ c4rq = c95334Qt.A09.A0I;
            C459529d A00 = c4rq.A06.A00();
            long j = c4rq.A0S;
            C2QC.A03("id [%d]: setSubtitleLanguage: %s:%s", Long.valueOf(j), str, Boolean.valueOf(z));
            C95794Sn A002 = A00.A0c.A00(j);
            if (A002 != null) {
                C95794Sn.A07(A002.A0G.obtainMessage(33, new C95814Sp(str, Collections.emptyList(), z)), A002);
            }
        }
    }

    @Override // X.C4QW, X.InterfaceC95164Qc
    public final int getCurrentPositionMs() {
        C95334Qt c95334Qt;
        int currentPosition;
        C3Q0 c3q0 = this.A0M;
        if (c3q0 == C3Q0.IDLE || c3q0 == C3Q0.PREPARING || this.A0U || (c95334Qt = this.A0K) == null || (currentPosition = c95334Qt.getCurrentPosition()) > 86400000) {
            return 0;
        }
        return currentPosition;
    }

    @Override // X.C4QW
    public final boolean isPlaying() {
        this.A0K.getClass();
        return this.A0K.A09.A0I.A0J();
    }

    private void A07() {
        if (A0L(this)) {
            View CFf = CFf();
            C95294Qp c95294Qp = this.A0t;
            c95294Qp.A00 = CFf;
            c95294Qp.A07.remove(this);
            C95294Qp.A0D.removeCallbacks(c95294Qp.A06);
            C95304Qq c95304Qq = new C95304Qq(-2);
            c95294Qp.A01 = c95304Qq;
            A0B(c95304Qq, Boolean.valueOf(this.A1J));
        }
    }

    public static void A0D(C4SE c4se, C4QT c4qt) {
        boolean z;
        C95334Qt c95334Qt;
        int i;
        ViewGroup viewGroup;
        C95334Qt c95334Qt2;
        Integer num;
        String str;
        C11T.A00();
        C95334Qt c95334Qt3 = c4qt.A0K;
        if (c95334Qt3 != null) {
            float f = c4se.A07;
            c95334Qt3.EhH(f);
            c4qt.A02 = f;
        }
        C75363a3 c75363a3 = c4se.A0A;
        if (c75363a3 != null && c75363a3.A07()) {
            z = true;
            C92104Aq A00 = C92104Aq.A00();
            if (A00 != null) {
                A00.A01();
            }
        } else {
            z = false;
        }
        String str2 = c4se.A0C;
        if (str2 != null && new File(str2).exists() && !z) {
            android.net.Uri fromFile = android.net.Uri.fromFile(new File(str2));
            C4SE c4se2 = c4qt.A0O;
            if (c4se2 != null && (c95334Qt2 = c4qt.A0K) != null) {
                C75363a3 c75363a32 = c4se2.A0A;
                ViewGroup viewGroup2 = null;
                if (c75363a32 != null) {
                    num = c75363a32.A0E;
                    str = c75363a32.A0G;
                } else {
                    num = null;
                    str = null;
                }
                c95334Qt2.ESy(fromFile, num, str, c4qt.A0Q, true, false);
                C95334Qt c95334Qt4 = c4qt.A0K;
                if (!c4qt.A0a) {
                    viewGroup2 = c4qt.A0D;
                }
                c95334Qt4.E5Q(viewGroup2, Integer.valueOf(c4qt.A0A));
            }
        } else if (c75363a3 != null) {
            C4SE c4se3 = c4qt.A0O;
            if (c4se3 != null && (c95334Qt = c4qt.A0K) != null) {
                String str3 = c4qt.A0Q;
                if (!c4qt.A0Z && !c75363a3.A0T) {
                    i = 0;
                } else {
                    i = c4se3.A08;
                }
                c95334Qt.ET0(c4se3.A03, c75363a3, str3, i);
                C95334Qt c95334Qt5 = c4qt.A0K;
                if (c4qt.A0a) {
                    viewGroup = null;
                } else {
                    viewGroup = c4qt.A0D;
                }
                c95334Qt5.E5Q(viewGroup, Integer.valueOf(c4qt.A0A));
            }
            c4qt.A0u.sendEmptyMessageDelayed(1, 200L);
        } else {
            C116815Qk c116815Qk = c4qt.A0H;
            if (c116815Qk != null) {
                c116815Qk.A00.EmN("VIDEO_PLAYER_FAILED_TO_START", "Failed to start video player because of invalid video source");
                C116815Qk.A00(c116815Qk, "VIDEO_PLAYER_FAILED_TO_START", "Failed to start video player because of invalid video source");
            } else {
                C0w9.A03("VIDEO_PLAYER_FAILED_TO_START", "Failed to start video player because of invalid video source");
            }
        }
        c4qt.A0N.onPrepare(c4se.A0B);
        if (c4qt.A14) {
            c4qt.A05();
            if (c4qt.A17) {
                A0E(c4qt);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0295, code lost:
    
        if (r1.startsWith("feed_") == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02b6, code lost:
    
        if (r0 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02cf, code lost:
    
        if (X.C18U.A06(r4, r15, 2342165869758851783L) == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02d5, code lost:
    
        if (r1 != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0136, code lost:
    
        if (r4 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0073, code lost:
    
        if (r4 != null) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ef  */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.4SI, java.lang.Object] */
    @Override // X.C4QW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E5v(X.C4SC r27) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4QT.E5v(X.4SC):void");
    }

    @Override // X.C4QW
    public final void EE4(String str) {
        C75363a3 c75363a3;
        C11T.A00();
        A06();
        Eol(str, true);
        C4SE c4se = this.A0O;
        if (c4se != null && (c75363a3 = c4se.A0A) != null) {
            C14120nc.A00().ATO(new C123595iY(this, c75363a3.A0G));
        }
        C95334Qt c95334Qt = this.A0K;
        if (c95334Qt != null) {
            c95334Qt.EE5(true);
            this.A0K.A0M = null;
        }
        this.A0J = null;
        this.A0D = null;
        this.A0K = null;
        this.A0P = null;
        this.A0O = null;
        this.A08 = 0;
        this.A0b = false;
        this.A0o.A00 = null;
        this.A0G = null;
        this.A10.clear();
        this.A0R.set(false);
        Runnable runnable = this.A0w;
        if (runnable != null && this.A12) {
            this.A0l.removeCallbacks(runnable);
        }
        HandlerC25861Nt handlerC25861Nt = this.A0l;
        Thread thread = handlerC25861Nt.getLooper().getThread();
        C14360o3.A0B(thread, 0);
        if (AbstractC95574Rr.A00) {
            InterfaceC09390do interfaceC09390do = AbstractC95574Rr.A01;
            if (interfaceC09390do.getValue() == thread) {
                interfaceC09390do.getValue();
                return;
            }
        }
        handlerC25861Nt.A01(1827799077, new Runnable() { // from class: X.Wsz
            @Override // java.lang.Runnable
            public final void run() {
                ((HandlerThread) C4QT.this.A0l.getLooper().getThread()).quit();
            }
        });
    }

    @Override // X.C4QW
    public final void Eol(String str, boolean z) {
        ViewGroup viewGroup;
        C3Q0 c3q0;
        C75363a3 c75363a3;
        C11T.A00();
        C123175hs c123175hs = this.A0v;
        if (c123175hs != null && C3Q1.A03()) {
            c123175hs.A00 = null;
            A0C(C3Q0.IDLE, this);
            return;
        }
        if (this.A0X) {
            HandlerC25861Nt handlerC25861Nt = this.A0l;
            handlerC25861Nt.removeCallbacks(this.A0y);
            Runnable runnable = this.A0x;
            handlerC25861Nt.removeCallbacks(runnable);
            handlerC25861Nt.A01(1827799077, runnable);
        }
        this.A0h = false;
        this.A0u.removeCallbacksAndMessages(null);
        C3Q0 c3q02 = this.A0M;
        C4SE c4se = this.A0O;
        C3Q0 c3q03 = C3Q0.IDLE;
        if (c3q02 != c3q03 && c3q02 != (c3q0 = C3Q0.STOPPING) && c4se != null) {
            boolean z2 = false;
            if (c3q02 == C3Q0.PLAYING) {
                z2 = true;
            }
            A0C(c3q0, this);
            if (!this.A0W && !this.A0Y) {
                A06();
            }
            A04();
            if (z2) {
                C4SG A00 = A00(this.A0O.A0B, this);
                C4SE c4se2 = this.A0O;
                A0A(A00, c4se2.A0B.A03, c4se2.A0D, str);
            }
            this.A0N.onStopVideo(str, z);
            C95334Qt c95334Qt = this.A0K;
            if (c95334Qt != null) {
                c95334Qt.AP9(this.A0D);
            }
            int currentPositionMs = getCurrentPositionMs();
            this.A0o.EIg(this.A0O.A0B.A03);
            if (!"fragment_paused".equals(str) || this.A1I) {
                A07();
            }
            if (this.A0M != c3q03) {
                C95334Qt c95334Qt2 = this.A0K;
                if (c95334Qt2 != null) {
                    c95334Qt2.reset();
                    this.A0R.set(false);
                }
                A0C(c3q03, this);
                this.A0V = true;
            }
            this.A0N.onStopped(this.A0O.A0B, currentPositionMs);
            C4SE c4se3 = this.A0O;
            if (c4se3 != null && (c75363a3 = c4se3.A0A) != null) {
                C14120nc.A00().ATO(new C123595iY(this, c75363a3.A0G));
            }
            this.A0O = null;
        } else {
            A04();
        }
        C66354UBs c66354UBs = this.A0L;
        if (c66354UBs != null && (viewGroup = (ViewGroup) c66354UBs.getParent()) != null) {
            viewGroup.removeView(this.A0L);
        }
        Runnable runnable2 = this.A0w;
        if (runnable2 != null && this.A12) {
            this.A0l.removeCallbacks(runnable2);
        }
        this.A0b = false;
    }
}
