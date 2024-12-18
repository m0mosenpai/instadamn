package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider;
import com.instagram.model.mediatype.ProductType;
import com.instagram.video.player.common.LiveVideoDebugStatsView;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4Qt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95334Qt implements InterfaceC95344Qu, C4QY {
    public static VideoPerformanceProvider A0s;
    public static final InterfaceC08100bW A0t = new C1QF("IgSecureUriParser").A00;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public android.net.Uri A07;
    public ViewGroup A08;
    public C4RP A09;
    public C4SM A0A;
    public C95544Ro A0B;
    public C95224Qi A0C;
    public C4TR A0D;
    public C98704bq A0E;
    public C98704bq A0F;
    public C98704bq A0G;
    public C4AO A0H;
    public C4AN A0I;
    public ProductType A0J;
    public C2CR A0K;
    public C4SN A0L;
    public C4QV A0M;
    public C4QP A0N;
    public VgL A0O;
    public C66354UBs A0P;
    public Integer A0Q;
    public Integer A0R;
    public Runnable A0S;
    public String A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public Context A0c;
    public C70780Wgt A0d;
    public C4AV A0e;
    public boolean A0f;
    public final Handler A0g;
    public final HeroPlayerSetting A0h;
    public final UserSession A0i;
    public final C4R0 A0j;
    public final C4R5 A0k;
    public final C95354Qv A0l;
    public final C41711wL A0m;
    public final List A0n;
    public final boolean A0o;
    public final boolean A0p;
    public volatile long A0q;
    public volatile C126145nB A0r;

    @Override // X.C4QY
    public final C4AK CFc() {
        return null;
    }

    @Override // X.C4QY
    public final Integer CFp() {
        return null;
    }

    @Override // X.C4QY
    public final Integer CFx() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r1, 36315168260230224L) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if (X.C41711wL.A06(r1, r7, r6) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r1, 36320236319809693L) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r1, 36320236319940767L) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r1, 36320236319875230L) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
    
        if (r2.A07 != X.C4AK.PROGRESSIVE) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0119, code lost:
    
        if (r16 != false) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, X.4Sk] */
    @Override // X.InterfaceC95344Qu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E5Q(android.view.ViewGroup r52, java.lang.Integer r53) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95334Qt.E5Q(android.view.ViewGroup, java.lang.Integer):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36315168260230224L) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        if (X.C41711wL.A06(r3, r6, r5) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36320236319809693L) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36320236319940767L) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36320236319875230L) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e7, code lost:
    
        if (r4.A07 != X.C4AK.PROGRESSIVE) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010d, code lost:
    
        if (r14 != false) goto L55;
     */
    @Override // X.InterfaceC95344Qu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4ST F8u(X.C75363a3 r50, java.lang.String r51, int r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95334Qt.F8u(X.3a3, java.lang.String, int, boolean):X.4ST");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f6, code lost:
    
        if (new X.C11L(X.C18U.A04(r2, r34, 36890534962332544L)).A08(r37) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010b, code lost:
    
        if (r1 != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024e  */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.4AO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [X.5fT, X.XLD] */
    /* JADX WARN: Type inference failed for: r24v0, types: [X.4RO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Object, X.4RF] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, X.4Rk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C95334Qt(android.content.Context r32, X.C4RK r33, com.instagram.common.session.UserSession r34, X.C4AV r35, X.C41711wL r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95334Qt.<init>(android.content.Context, X.4RK, com.instagram.common.session.UserSession, X.4AV, X.1wL, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.4AO, java.lang.Object] */
    private void A00() {
        C4AN c4an = this.A0I;
        if (c4an != null && c4an.A03()) {
            this.A0O = null;
        }
        this.A0I = null;
        this.A0H = new Object();
        this.A07 = null;
        this.A05 = -1;
        this.A04 = -1;
        this.A08 = null;
        this.A0R = null;
        this.A0N = new C4QP();
        this.A0E = null;
        this.A0F = null;
        this.A0G = null;
        C4R0 c4r0 = this.A0j;
        c4r0.A02 = null;
        c4r0.A01 = null;
        c4r0.A00 = -1;
        this.A03 = 0;
        this.A02 = -1;
        this.A01 = -1;
        this.A0J = null;
    }

    public static void A02(C95334Qt c95334Qt) {
        if (c95334Qt.A0r != null && Build.VERSION.SDK_INT >= 29) {
            c95334Qt.A0r.A02();
            c95334Qt.A0r = null;
        }
    }

    public static void A03(C95334Qt c95334Qt) {
        ViewGroup viewGroup = c95334Qt.A08;
        if (viewGroup != null) {
            C4RP c4rp = c95334Qt.A09;
            if (c4rp.A04 != null && c95334Qt.A0Z && !c95334Qt.A0a) {
                int width = viewGroup.getWidth();
                int height = c95334Qt.A08.getHeight();
                View view = c4rp.A04;
                double d = c95334Qt.A05 / c95334Qt.A04;
                C14360o3.A0B(view, 2);
                int i = height;
                if (width > 0 && height > 0 && d > 0.0d) {
                    int i2 = width;
                    double d2 = width;
                    double d3 = height;
                    if (d > (d2 * 1.0d) / d3) {
                        i2 = (int) Math.ceil(d3 * d);
                    } else {
                        i = (int) Math.ceil(d2 / d);
                    }
                    int[] iArr = {i2, i, height, width};
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    int i5 = iArr[2];
                    Context context = view.getContext();
                    C14360o3.A07(context);
                    boolean z = true;
                    if ((context.getApplicationInfo().flags & 4194304) == 0 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
                        z = false;
                    }
                    int i6 = (width - i3) / 2;
                    if (z) {
                        i6 = -i6;
                    }
                    float f = i6;
                    float f2 = (i5 - i4) / 2;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    C14360o3.A0A(layoutParams);
                    C14360o3.A0B(layoutParams, 0);
                    if (Math.abs(layoutParams.height - i4) > 5 || Math.abs(layoutParams.width - i3) > 5) {
                        layoutParams.width = i3;
                        layoutParams.height = i4;
                        view.setLayoutParams(layoutParams);
                    }
                    view.setTranslationX(f);
                    view.setTranslationY(f2);
                }
            }
        }
    }

    private void A04(C75363a3 c75363a3, String str) {
        C70780Wgt c70780Wgt = this.A0d;
        if (c70780Wgt != null) {
            c70780Wgt.A00(c75363a3, str, this.A0i.userId);
            return;
        }
        C4AV c4av = this.A0e;
        if (c4av == null || c75363a3.A0E == C05F.A0C) {
            return;
        }
        c4av.A00(c75363a3);
    }

    public final SurfaceControl A05() {
        if (this.A0r != null && Build.VERSION.SDK_INT >= 29) {
            return this.A0r.A01();
        }
        return null;
    }

    public final String A06() {
        String str;
        C4SS c4ss = this.A09.A08;
        if (c4ss != null && (str = c4ss.A07) != null) {
            return str;
        }
        return "";
    }

    public final void A07(float f) {
        C4RQ c4rq = this.A09.A0I;
        C4RQ.A05(c4rq, "setPlaybackSpeed", new Object[0]);
        Handler handler = c4rq.A0E;
        handler.sendMessage(handler.obtainMessage(26, Float.valueOf(f)));
    }

    public final void A08(C4Y0 c4y0, EnumC117265Sl enumC117265Sl, String str) {
        C4QV c4qv = this.A0M;
        if (c4qv != null) {
            c4qv.E1l(this, enumC117265Sl.name(), c4y0.name(), str);
        }
        C66354UBs c66354UBs = this.A0P;
        if (c66354UBs != null) {
            c66354UBs.setErrorOrWarningCause(enumC117265Sl.name(), c4y0.name(), str);
        }
    }

    public final void A09(C98704bq c98704bq, List list) {
        if (c98704bq != null) {
            C4QV c4qv = this.A0M;
            if (c4qv != null) {
                c4qv.DBs(this, c98704bq.A0D, c98704bq.A0E, c98704bq.A05, c98704bq.A04, c98704bq.A02);
            }
            C66354UBs c66354UBs = this.A0P;
            if (c66354UBs != null) {
                c66354UBs.setFormat(c98704bq);
                c66354UBs.setCustomQualities(list);
            }
            VideoPerformanceProvider videoPerformanceProvider = A0s;
            if (videoPerformanceProvider != null && this.A0V) {
                videoPerformanceProvider.calculateVideoQuality(A06(), c98704bq.A02, SystemClock.elapsedRealtime());
            }
        }
    }

    public final void A0A(String str, Object... objArr) {
        if (this.A0h.A1y) {
            C0K8.A0P("IgGrootPlayer", str, objArr);
        }
    }

    @Override // X.InterfaceC95344Qu
    public final C66354UBs ALz() {
        C66354UBs c66354UBs = this.A0P;
        if (c66354UBs == null) {
            C18C.A07(this.A0c, "Can't create a video debug dialog without context.");
            try {
                C66354UBs c66354UBs2 = new C66354UBs(this.A0c, new C68857VdD(this));
                this.A0P = c66354UBs2;
                LiveVideoDebugStatsView liveVideoDebugStatsView = c66354UBs2.A0A;
                if (liveVideoDebugStatsView.A07 == null) {
                    liveVideoDebugStatsView.A07 = null;
                }
                Timer timer = new Timer();
                liveVideoDebugStatsView.A07 = timer;
                timer.scheduleAtFixedRate(new X29(liveVideoDebugStatsView), 0L, 100L);
                Runnable runnable = new Runnable() { // from class: X.Wsy
                    @Override // java.lang.Runnable
                    public final void run() {
                        long preferredTimePeriod;
                        float f;
                        long j;
                        C95334Qt c95334Qt = C95334Qt.this;
                        C66354UBs c66354UBs3 = c95334Qt.A0P;
                        if (c66354UBs3 != null) {
                            c66354UBs3.setPlayerId(c95334Qt.Be2());
                            c66354UBs3.setVideoSource(c95334Qt.A0I);
                            c66354UBs3.A02 = (int) (c95334Qt.A0q / 1000);
                            C98704bq c98704bq = c95334Qt.A0E;
                            if (c98704bq != null) {
                                c66354UBs3.setFormat(c98704bq);
                            }
                            c66354UBs3.A01 = 0;
                            C4RP c4rp = c95334Qt.A09;
                            C4RQ c4rq = c4rp.A0I;
                            c66354UBs3.A0D = c4rq.A0J();
                            long currentPosition = c95334Qt.getCurrentPosition();
                            long A07 = (int) c4rq.A07();
                            long A04 = c4rp.A04();
                            c66354UBs3.A05 = currentPosition;
                            c66354UBs3.A04 = A07;
                            c66354UBs3.A06 = A04;
                            c66354UBs3.A09 = c95334Qt.A0O;
                            c66354UBs3.A0E = c95334Qt.FE0();
                            C4AN c4an = c95334Qt.A0I;
                            if (c4an != null && c4an.A03()) {
                                if (c4rq.A0I()) {
                                    f = ((C4RU) c4rq.A0B.get()).A00;
                                } else {
                                    f = 1.0f;
                                }
                                if (c4rq.A0I()) {
                                    j = ((C4RU) c4rq.A0B.get()).A0A;
                                } else {
                                    j = 0;
                                }
                                c66354UBs3.A00 = f;
                                c66354UBs3.A03 = (int) j;
                                C4TR c4tr = c95334Qt.A0D;
                                if (c4tr != null) {
                                    c66354UBs3.setLatencyDecision(c4tr);
                                }
                            }
                            c66354UBs3.A04();
                        }
                        C66354UBs c66354UBs4 = c95334Qt.A0P;
                        if (c66354UBs4 == null) {
                            preferredTimePeriod = -1;
                        } else {
                            preferredTimePeriod = c66354UBs4.getPreferredTimePeriod();
                        }
                        Runnable runnable2 = c95334Qt.A0S;
                        if (runnable2 != null) {
                            Handler handler = c95334Qt.A0g;
                            if (preferredTimePeriod <= 0) {
                                preferredTimePeriod = 1000;
                            }
                            handler.postDelayed(runnable2, preferredTimePeriod);
                        }
                    }
                };
                this.A0S = runnable;
                this.A0g.post(runnable);
            } catch (AssertionError | NullPointerException unused) {
            }
            return this.A0P;
        }
        return c66354UBs;
    }

    @Override // X.InterfaceC95344Qu
    public final void AP9(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (viewGroup != null && this.A0Z) {
            C66354UBs c66354UBs = this.A0P;
            if (c66354UBs != null && (viewGroup2 = (ViewGroup) c66354UBs.getParent()) != null) {
                viewGroup2.removeView(this.A0P);
            }
            this.A09.A0A(viewGroup);
        }
    }

    @Override // X.InterfaceC95344Qu
    public final ArrayList BEF() {
        ArrayList arrayList;
        List<C4CA> list = this.A0n;
        synchronized (list) {
            arrayList = new ArrayList(list.size());
            for (C4CA c4ca : list) {
                arrayList.add(new C120775dN(c4ca.A09, c4ca.A0E, c4ca.A0B));
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC95344Qu
    public final int Be0() {
        int A00;
        C95354Qv c95354Qv = this.A0l;
        synchronized (c95354Qv) {
            C95394Qz c95394Qz = c95354Qv.A00;
            A00 = (int) c95394Qz.A00(TimeUnit.MILLISECONDS);
            if (c95394Qz.A02) {
                c95394Qz.A01();
                c95394Qz.A02();
            } else {
                c95394Qz.A01();
            }
        }
        return A00;
    }

    @Override // X.InterfaceC95344Qu
    public final String Be2() {
        return String.valueOf(this.A09.A0I.A0S);
    }

    @Override // X.InterfaceC95344Qu
    public final void EE5(boolean z) {
        String str;
        ViewGroup viewGroup;
        if (this.A0K != null) {
            C5n5 A0A = this.A09.A0I.A0A();
            this.A0K.A01(this.A0I, this.A0Q, getCurrentPosition(), A0A.A00, (int) A0A.A02);
        }
        this.A0m.A06.A08.remove(this);
        this.A0c = null;
        A00();
        this.A0g.removeCallbacksAndMessages(null);
        C66354UBs c66354UBs = this.A0P;
        if (c66354UBs != null) {
            LiveVideoDebugStatsView liveVideoDebugStatsView = c66354UBs.A0A;
            Timer timer = liveVideoDebugStatsView.A07;
            if (timer != null) {
                timer.cancel();
            }
            liveVideoDebugStatsView.A07 = null;
            ViewParent parent = c66354UBs.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.removeView(c66354UBs);
            }
            this.A0P = null;
        }
        if (this.A0r != null) {
            this.A09.A0E(new Runnable() { // from class: X.AtI
                @Override // java.lang.Runnable
                public final void run() {
                    C95334Qt.A02(C95334Qt.this);
                }
            });
        } else if (!z) {
            this.A09.A04 = null;
        }
        C4RP c4rp = this.A09;
        c4rp.A08();
        C4SM c4sm = this.A0A;
        if (c4sm != null) {
            C95544Ro c95544Ro = c4sm.A00;
            if (c95544Ro != null) {
                String str2 = c95544Ro.A06;
                if (str2 == null) {
                    str2 = C95544Ro.A02(c95544Ro);
                }
                C95564Rq c95564Rq = c95544Ro.A0B;
                c95564Rq.A00(C4TA.A0E, str2);
                c95564Rq.A01(str2);
                c95544Ro.A06 = null;
                C95904Sz A00 = c95544Ro.A0A.A00(c95544Ro.A02, str2);
                if (A00 != null) {
                    long A08 = (int) c95544Ro.A09.A0I.A08();
                    if (c95544Ro.A0C.A0G) {
                        str = "reset";
                    } else {
                        str = "requested_pause";
                    }
                    A00.A01(null, null, null, null, null, str, str2, null, null, null, A08, c95544Ro.A01, SystemClock.elapsedRealtime(), false);
                    A00.A00();
                }
            }
            c4sm.A00 = null;
        }
        C4SN c4sn = this.A0L;
        if (c4sn != null) {
            AnonymousClass432 anonymousClass432 = c4sn.A00;
            C14360o3.A0B(anonymousClass432, 0);
            ((AbstractCollection) C12940lg.A01.getValue()).remove(anonymousClass432);
            this.A0L = null;
        }
        C95544Ro c95544Ro2 = this.A0B;
        C14360o3.A0B(c95544Ro2, 0);
        c4rp.A0I.A0G.A00.remove(c95544Ro2);
        c4rp.A0C(null);
        this.A0M = null;
        C6QM.A00(this);
    }

    @Override // X.InterfaceC95344Qu
    public final void EKu() {
        C4RQ c4rq = this.A09.A0I;
        C4RQ.A05(c4rq, "retry video playback", new Object[0]);
        Handler handler = c4rq.A0E;
        handler.sendMessage(handler.obtainMessage(28));
    }

    @Override // X.InterfaceC95344Qu
    @Deprecated
    public final void ESy(android.net.Uri uri, Integer num, String str, String str2, boolean z, boolean z2) {
        String str3 = str2;
        String str4 = str;
        if (str == null) {
            str4 = uri.toString();
        }
        if (str2 == null) {
            str3 = "";
        }
        C4AK c4ak = C4AK.PROGRESSIVE;
        Map map = Collections.EMPTY_MAP;
        A01(new C4AN(uri, null, C4AM.GENERAL, c4ak, str4, null, null, str3, null, "UNKNOWN", null, C4AL.A00(C41711wL.A02(num)), null, null, null, map, false, false, false, z2), null);
        this.A0Q = num;
        this.A03 = 0;
        this.A02 = -1;
        this.A01 = -1;
    }

    @Override // X.InterfaceC95344Qu
    public final void EYX(C4SM c4sm) {
        this.A0A = c4sm;
        C4SN c4sn = this.A0L;
        if (c4sn != null) {
            AnonymousClass432 anonymousClass432 = c4sn.A00;
            C14360o3.A0B(anonymousClass432, 0);
            ((AbstractCollection) C12940lg.A01.getValue()).remove(anonymousClass432);
        }
        C4SN c4sn2 = new C4SN();
        this.A0L = c4sn2;
        C4SM c4sm2 = this.A0A;
        ((AbstractC95614Rv) c4sn2).A00 = c4sm2;
        C95544Ro c95544Ro = this.A0B;
        c4sm2.A00 = c95544Ro;
        if (c95544Ro != null) {
            c95544Ro.A03 = c4sm2.A01;
        }
    }

    @Override // X.InterfaceC95344Qu
    public final void EYb(boolean z) {
        C4AN c4an;
        if (C18U.A06(C06090Tz.A05, this.A0i, 36312574101030077L) && this.A0J == ProductType.CLIPS && (c4an = this.A0I) != null && "feed_timeline".equals(c4an.A0A)) {
            return;
        }
        this.A09.A0I.A0H(z);
    }

    @Override // X.InterfaceC95344Qu
    public final void Ef7(android.net.Uri uri) {
        this.A07 = uri;
        if (uri != null && !C11T.A08()) {
            android.net.Uri A01 = C2UZ.A02.A01(uri);
            if (A01 != null) {
                this.A07 = A01;
                return;
            }
            String scheme = uri.getScheme();
            if (scheme != null && scheme.equalsIgnoreCase("file")) {
                return;
            }
            UserSession userSession = this.A0i;
            ((C62660SKu) userSession.A01(C62660SKu.class, new TW6())).A00(uri, userSession, false);
        }
    }

    @Override // X.InterfaceC95344Qu
    public final void EhH(float f) {
        this.A00 = f;
        this.A09.A0I.A0G("unknown", f);
    }

    @Override // X.InterfaceC95344Qu
    public final boolean FE0() {
        C4SS c4ss;
        C4RQ c4rq = this.A09.A0I;
        String str = c4rq.A0W;
        if (str != null && (c4ss = c4rq.A0F.A07) != null && str.equals(c4ss.A0K.A0G)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC95344Qu
    public final int getCurrentPosition() {
        long j;
        C4AN c4an = this.A0I;
        if (c4an != null) {
            C4RQ c4rq = this.A09.A0I;
            long j2 = 0;
            if (c4rq.A0I()) {
                long A06 = c4rq.A06();
                C4RV c4rv = (C4RV) c4rq.A0N.get();
                if (c4rq.A0I()) {
                    j = c4rv.A08;
                } else {
                    j = 0;
                }
                j2 = Math.max(0L, A06 - j);
            }
            int i = (int) j2;
            if (!c4an.A03()) {
                return (int) c4rq.A08();
            }
            return i;
        }
        return 0;
    }

    @Override // X.InterfaceC95344Qu
    public final void pause() {
        C4RP.A01(this.A09, null, true);
    }

    @Override // X.InterfaceC95344Qu
    public final void reset() {
        String str;
        C4AN c4an = this.A0I;
        if (c4an != null && (str = c4an.A0G) != null) {
            C4S0.A02(str, this.A09.A04);
        }
        A00();
        C4RQ c4rq = this.A09.A0I;
        C4RQ.A05(c4rq, "reset", new Object[0]);
        Handler handler = c4rq.A0E;
        handler.sendMessage(handler.obtainMessage(14));
    }

    @Override // X.InterfaceC95344Qu
    public final void seekTo(int i) {
        C4RQ c4rq = this.A09.A0I;
        boolean A0J = c4rq.A0J();
        if (A0J && this.A0f) {
            pause();
        }
        c4rq.A0C(i);
        if (A0J && this.A0f) {
            start();
        }
    }

    @Override // X.InterfaceC95344Qu
    public final void setSurface(Surface surface) {
        C66354UBs c66354UBs = this.A0P;
        if (c66354UBs != null) {
            String obj = surface.toString();
            if (obj == null) {
                obj = "null";
            }
            c66354UBs.A0C = obj;
        }
        this.A09.A09(surface);
        A02(this);
    }

    @Override // X.InterfaceC95344Qu
    public final void start() {
        String str;
        C4AN c4an = this.A0I;
        if (c4an != null && (str = c4an.A0G) != null) {
            Deque deque = C4TF.A00;
            deque.offerLast(str);
            if (deque.size() > 5) {
                deque.removeFirst();
            }
        }
        this.A09.A07();
    }

    private void A01(C4AN c4an, ProductType productType) {
        A00();
        this.A0I = c4an;
        this.A0J = productType;
        if (c4an.A03()) {
            this.A0O = new VgL();
        }
        C4AK c4ak = c4an.A07;
        String str = c4an.A0G;
        AbstractC13670mt.A06("type:%s, key:%s", c4ak, str);
        C66354UBs c66354UBs = this.A0P;
        if (c66354UBs != null) {
            c66354UBs.A03();
        }
        VideoPerformanceProvider videoPerformanceProvider = A0s;
        if (videoPerformanceProvider != null) {
            videoPerformanceProvider.resetStallTracker();
        }
        boolean z = C4S0.A04;
        C4S0.A03 = new WeakReference(this);
        C4S0.A02 = str;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.4AO, java.lang.Object] */
    @Override // X.InterfaceC95344Qu
    public final void ET0(C4QP c4qp, C75363a3 c75363a3, String str, int i) {
        int i2;
        A04(c75363a3, str);
        A01(C41711wL.A00(this.A0c, this.A07, this.A0i, c75363a3, str), c75363a3.A09);
        this.A0H = new Object();
        this.A0Q = c75363a3.A0E;
        this.A03 = i;
        this.A0N = c4qp;
        if (this.A0U) {
            this.A02 = c75363a3.A01;
            i2 = c75363a3.A00;
        } else {
            i2 = -1;
            this.A02 = -1;
        }
        this.A01 = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C95334Qt(android.content.Context r8, com.instagram.common.session.UserSession r9, java.lang.String r10) {
        /*
            r7 = this;
            r3 = r9
            X.1wL r5 = X.C41711wL.A01(r9)
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            java.lang.Class<X.4AV> r2 = X.C4AV.class
            r1 = 36
            X.Pfr r0 = new X.Pfr
            r0.<init>(r9, r1)
            java.lang.Object r4 = r9.A01(r2, r0)
            X.4AV r4 = (X.C4AV) r4
            r2 = 0
            r0 = r7
            r1 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95334Qt.<init>(android.content.Context, com.instagram.common.session.UserSession, java.lang.String):void");
    }
}
