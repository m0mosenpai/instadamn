package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.DisplayMetrics;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2r7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61442r7 extends C1I7 implements InterfaceC61452r8, C1NJ, InterfaceC61462r9 {
    public C0k4 A00;
    public Boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final Handler A0B;
    public final Handler A0C;
    public final MessageQueue A0D;
    public final InterfaceC41501vz A0E;
    public final UserSession A0F;
    public final InterfaceC61352qx A0G;
    public final C1IP A0H;
    public final C226418s A0I;
    public final Runnable A0J;
    public final Runnable A0K;
    public final String A0L;
    public final WeakReference A0M;
    public final boolean A0N;
    public volatile Integer A0O;
    public volatile Integer A0P;
    public volatile boolean A0Q;
    public static final C226618u A0S = AbstractC226518t.A00("feed_failed");
    public static final C226618u A0V = AbstractC226518t.A00("story_failed");
    public static final C226618u A0R = AbstractC226518t.A00("feed_story_failed");
    public static final C226618u A0T = AbstractC226518t.A00("media_loading_failed");
    public static final C226618u A0U = AbstractC226518t.A00("media_timeout");
    public static final C226618u A0W = AbstractC226518t.A00("unknown");

    public final synchronized void A03() {
        if (this.A0N && this.A0O == C05F.A00) {
            C1IR c1ir = this.A0H.A02;
            C1IV c1iv = c1ir.A02;
            c1iv.A05("FIRST_MEDIA_FROM_NETWORK_CONTENT_LOAD_SKIPPED", null);
            SubspanMutableStateFlow A00 = c1iv.A00();
            C1IT c1it = C1IT.A06;
            A00.Egh(c1it);
            C1IW c1iw = c1ir.A01;
            c1iw.A05("NETWORK_FEED_UI_RENDER_SKIPPED", null);
            c1iw.A00().Egh(c1it);
            this.A0O = C05F.A0Y;
        }
    }

    public final synchronized void A04(EnumC92424Bx enumC92424Bx, String str, String str2, boolean z) {
        this.A0B.removeCallbacks(this.A0K);
        if (z) {
            boolean z2 = this.A02;
            this.A02 = false;
            if (z2) {
                if (C18U.A06(C06090Tz.A05, this.A0F, 36324007302672156L)) {
                    C1IP c1ip = this.A0H;
                    C1IR c1ir = c1ip.A02;
                    C1IW c1iw = c1ir.A01;
                    C1IX c1ix = c1ip.A01;
                    C1IZ c1iz = c1ix.A00;
                    C14360o3.A0B(c1iz, 0);
                    c1iw.A04(new SubspanMutableStateFlow(c1iz.A00()));
                    C1IV c1iv = c1ir.A02;
                    C1IY c1iy = c1ix.A01;
                    C14360o3.A0B(c1iy, 0);
                    c1iv.A04(new SubspanMutableStateFlow(c1iy.A00()));
                    c1ir.A03.A04(new SubspanMutableStateFlow(c1ix.A00()));
                    c1ir.A02();
                }
            }
            this.A0I.A0A = true;
            C1IV c1iv2 = this.A0H.A02.A02;
            c1iv2.A05("FIRST_MEDIA_FROM_NETWORK_CONTENT_LOAD_END", null);
            c1iv2.A00().Egh(C1IT.A08);
            if (str != null) {
                C226418s.A06(this.A00, "first_media_network_content_image_load_source", str);
            }
            if (enumC92424Bx != null) {
                C226418s.A06(this.A00, "first_media_network_content_video_cache_type", enumC92424Bx.name());
            }
            if (this.A0O == C05F.A0C) {
                this.A0O = C05F.A0j;
            } else if (this.A0O == C05F.A1F) {
                this.A0O = C05F.A1I;
            } else {
                this.A03 = true;
            }
        } else {
            C1IP c1ip2 = this.A0H;
            if (str2 == null) {
                str2 = "unknown";
            }
            c1ip2.A02.A02.A06(str2, null);
        }
        A01(this);
    }

    @Override // X.InterfaceC61452r8
    public final void AJO(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        C14360o3.A0B(lightweightQuickPerformanceLogger, 0);
        if (this.A08) {
            this.A00.A01(lightweightQuickPerformanceLogger);
        }
    }

    @Override // X.C1NJ
    public final synchronized void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        A02(this, "FIRST_MEDIA_LOAD_END");
    }

    @Override // X.C1NJ
    public final synchronized void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        A02(this, "FIRST_MEDIA_LOAD_FAILED");
        if (!this.A06) {
            this.A0B.removeCallbacks(this.A0K);
            this.A0O = C05F.A0u;
            this.A0H.A02.A02.A06("image_error", null);
            A01(this);
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public /* synthetic */ C61442r7(Context context, MessageQueue messageQueue, UserSession userSession, InterfaceC61352qx interfaceC61352qx, C61472rA c61472rA, C226418s c226418s, String str) {
        C0k4 c0k4 = new C0k4();
        C14360o3.A0B(c226418s, 3);
        C14360o3.A0B(str, 4);
        C14360o3.A0B(interfaceC61352qx, 5);
        this.A0A = context;
        this.A0F = userSession;
        this.A0I = c226418s;
        this.A0L = str;
        this.A0G = interfaceC61352qx;
        this.A0D = messageQueue;
        this.A00 = c0k4;
        this.A0B = new Handler();
        this.A0C = new Handler(Looper.getMainLooper());
        this.A0N = C18U.A06(C06090Tz.A05, userSession, 36324007302803230L);
        this.A0K = new Runnable() { // from class: X.2rB
            @Override // java.lang.Runnable
            public final void run() {
                C61442r7 c61442r7 = C61442r7.this;
                if (c61442r7.A0O != C05F.A01 && c61442r7.A0O != C05F.A0j && c61442r7.A0O != C05F.A00) {
                    c61442r7.A0O = C05F.A15;
                    C1IP c1ip = c61442r7.A0H;
                    ((C1IQ) c1ip).A01.A03("FIRST_MEDIA_LOAD_FAILED", PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
                    c1ip.A02.A02.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, null);
                    C61442r7.A01(c61442r7);
                }
            }
        };
        this.A0J = new Runnable() { // from class: X.2rC
            @Override // java.lang.Runnable
            public final void run() {
                String str2;
                C61442r7 c61442r7 = C61442r7.this;
                C226618u c226618u = C61442r7.A0V;
                if (!c61442r7.A05) {
                    if (c61442r7.A0O != C05F.A1F && c61442r7.A0O != C05F.A1I) {
                        str2 = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
                    } else {
                        str2 = "replaced";
                    }
                    C1IY c1iy = c61442r7.A0H.A01.A01;
                    c1iy.A01.A03("FIRST_MEDIA_FROM_CACHE_CONTENT_LOAD_FAILED", str2);
                    c1iy.A00().Egh(C1IT.A03);
                }
                if (C18U.A06(C06090Tz.A05, c61442r7.A0F, 2342160604129727869L) && c61442r7.A0O == C05F.A02) {
                    c61442r7.A01 = false;
                    C61442r7.A01(c61442r7);
                }
            }
        };
        this.A0E = new InterfaceC42271xH() { // from class: X.2rD
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C42661xu c42661xu = (C42661xu) obj;
                C14360o3.A0B(c42661xu, 0);
                if ("feed_timeline".equals(c42661xu.A02) && !"feed_timeline".equals(c42661xu.A01)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                InterfaceC61452r8 interfaceC61452r8;
                int A03 = C0f9.A03(1270209062);
                C42661xu c42661xu = (C42661xu) obj;
                int A032 = C0f9.A03(-793007990);
                C14360o3.A0B(c42661xu, 0);
                C61442r7 c61442r7 = C61442r7.this;
                C226618u c226618u = C61442r7.A0V;
                if (!c61442r7.A07) {
                    String str2 = c42661xu.A01;
                    long j = c42661xu.A00;
                    C226418s c226418s2 = c61442r7.A0I;
                    C0k4 c0k42 = c61442r7.A00;
                    C14360o3.A0B(c0k42, 4);
                    C1KX c1kx = c226418s2.A05;
                    if (c1kx == null || (interfaceC61452r8 = c1kx.A02) == null || interfaceC61452r8 == c61442r7) {
                        c0k42.markerPoint(25100289, "NAVIGATED_AWAY");
                    }
                    c0k42.markerPoint(15335435, "NAVIGATED_AWAY", str2, j, TimeUnit.MILLISECONDS);
                    c61442r7.A07 = true;
                }
                C41451vu.A01.A03(this, C42661xu.class);
                C0f9.A0A(-585699416, A032);
                C0f9.A0A(1184905014, A03);
            }
        };
        this.A0M = new WeakReference(c61472rA);
        this.A0H = (C1IP) c226418s.A0G.getValue();
        Integer num = C05F.A00;
        this.A0O = num;
        this.A0P = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5.A0F, 36317594918917521L) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r5.A0P == X.C05F.A1F) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C226618u A00() {
        /*
            r5 = this;
            java.lang.Integer r0 = r5.A0O
            java.lang.Integer r4 = X.C05F.A1I
            if (r0 != r4) goto Lf
            java.lang.Integer r1 = r5.A0P
            java.lang.Integer r0 = X.C05F.A1F
            if (r1 != r0) goto Lf
        Lc:
            X.18u r0 = X.C226618u.A03
            return r0
        Lf:
            java.lang.Integer r1 = r5.A0O
            java.lang.Integer r0 = X.C05F.A02
            if (r1 != r0) goto L38
            java.lang.Boolean r1 = r5.A01
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L31
            com.instagram.common.session.UserSession r3 = r5.A0F
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317594918917521(0x8106a9003d1591, double:3.030731493715647E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L38
        L31:
            java.lang.Integer r1 = r5.A0P
            java.lang.Integer r0 = X.C05F.A1F
            if (r1 != r0) goto L38
            goto Lc
        L38:
            java.lang.Integer r0 = r5.A0O
            java.lang.Integer r1 = X.C05F.A0Y
            if (r0 != r1) goto L43
            java.lang.Integer r0 = r5.A0P
            if (r0 != r1) goto L43
            goto Lc
        L43:
            boolean r0 = r5.A0N
            if (r0 == 0) goto L50
            java.lang.Integer r0 = r5.A0O
            if (r0 != r4) goto L50
            java.lang.Integer r0 = r5.A0P
            if (r0 != r1) goto L50
            goto Lc
        L50:
            java.lang.Integer r1 = r5.A0O
            java.lang.Integer r0 = X.C05F.A0u
            if (r1 != r0) goto L59
            X.18u r0 = X.C61442r7.A0T
            return r0
        L59:
            java.lang.Integer r0 = r5.A0O
            java.lang.Integer r2 = X.C05F.A0N
            if (r0 == r2) goto L66
            java.lang.Integer r0 = r5.A0P
            if (r0 != r2) goto L66
            X.18u r0 = X.C61442r7.A0V
            return r0
        L66:
            java.lang.Integer r1 = r5.A0O
            java.lang.Integer r0 = X.C05F.A15
            if (r1 != r0) goto L6f
            X.18u r0 = X.C61442r7.A0U
            return r0
        L6f:
            java.lang.Integer r0 = r5.A0O
            if (r0 != r2) goto L7a
            java.lang.Integer r0 = r5.A0P
            if (r0 == r2) goto L7a
            X.18u r0 = X.C61442r7.A0S
            return r0
        L7a:
            java.lang.Integer r0 = r5.A0O
            if (r0 != r2) goto L85
            java.lang.Integer r0 = r5.A0P
            if (r0 != r2) goto L85
            X.18u r0 = X.C61442r7.A0R
            return r0
        L85:
            X.18u r0 = X.C61442r7.A0W
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61442r7.A00():X.18u");
    }

    public static final void A01(C61442r7 c61442r7) {
        boolean z;
        if (c61442r7.A0O != C05F.A02 ? c61442r7.A0O == C05F.A0N || c61442r7.A0O == C05F.A1I || c61442r7.A0O == C05F.A0u || c61442r7.A0O == C05F.A15 || c61442r7.A0O == C05F.A0Y : c61442r7.A01 != null) {
            if (c61442r7.A0P != C05F.A00 && c61442r7.A0P != C05F.A0C && c61442r7.A0P != C05F.A01) {
                z = true;
                CallerContext callerContext = C2NX.A08;
                C2NX.A02(AbstractC49072Na.A00(c61442r7.A0A, c61442r7.A0F), !c61442r7.A00().A01);
                if (c61442r7.A09 && z) {
                    c61442r7.A0I.A0M(c61442r7.A00, c61442r7.A00(), null);
                    UserSession userSession = c61442r7.A0F;
                    C2FQ A00 = C2FO.A00(userSession);
                    if (A00 != null) {
                        A00.A04("main_feed_request_end");
                    }
                    IGFOAMessagingReadyLogger A002 = C47272Eu.A00(userSession);
                    if (A002 != null) {
                        A002.onLogMainFeedRequestEnd();
                    }
                    C61472rA c61472rA = (C61472rA) c61442r7.A0M.get();
                    if (c61472rA != null) {
                        if (!C18U.A06(C06090Tz.A05, c61472rA.A00, 36324007301295885L)) {
                            c61472rA.A02.invoke(c61472rA.A01, EnumC73363Qm.A05, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (c61442r7.A09) {
        }
    }

    public static final void A02(C61442r7 c61442r7, String str) {
        c61442r7.A0I.A0N(c61442r7.A00, c61442r7, str);
    }

    public final void A05(boolean z, String str) {
        if (z) {
            this.A0P = C05F.A0C;
            C24571Ia c24571Ia = this.A0H.A04;
            C24581Ib c24581Ib = c24571Ia.A01;
            c24581Ib.A01.A02("STORIES_REQUEST_SUCCEEDED");
            c24581Ib.A00().Egh(C1IT.A08);
            C24591Ic c24591Ic = c24571Ia.A02;
            c24591Ic.A01.A02("NETWORK_STORIES_TRAY_UI_RENDER_START");
            c24591Ic.A00().Egh(C1IT.A07);
            this.A0D.addIdleHandler(new MessageQueue.IdleHandler() { // from class: X.3lb
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
                
                    if (r7 == null) goto L15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
                
                    r4.A02("NETWORK_STORIES_TRAY_UI_RENDER_STRICT_END");
                    r6.A00().Egh(r3);
                    r5.A0P = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
                
                    if (((X.C1IT) r7.A00().A02.getValue()).A00 >= 2) goto L15;
                 */
                @Override // android.os.MessageQueue.IdleHandler
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean queueIdle() {
                    /*
                        r10 = this;
                        X.2r7 r5 = X.C61442r7.this
                        X.1IP r0 = r5.A0H
                        X.1Ia r7 = r0.A04
                        X.1Ic r6 = r7.A02
                        X.1IN r4 = r6.A01
                        java.lang.String r0 = "NETWORK_STORIES_TRAY_UI_RENDER_END"
                        r4.A02(r0)
                        com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r0 = r6.A00()
                        X.1IT r3 = X.C1IT.A08
                        r0.Egh(r3)
                        java.lang.Integer r2 = X.C05F.A1F
                        r5.A0P = r2
                        com.instagram.common.session.UserSession r9 = r5.A0F
                        X.0Tz r8 = X.C06090Tz.A05
                        r0 = 36327280066312665(0x810f78000239d9, double:3.0368564199272944E-306)
                        boolean r0 = X.C18U.A06(r8, r9, r0)
                        if (r0 == 0) goto L2d
                        r5.A0P = r2
                    L2d:
                        r0 = 36327280066247128(0x810f78000139d8, double:3.0368564198858485E-306)
                        boolean r0 = X.C18U.A06(r8, r9, r0)
                        if (r0 == 0) goto L68
                        java.util.List r1 = r7.A01()
                        boolean r0 = r1.isEmpty()
                        r0 = r0 ^ 1
                        if (r0 == 0) goto L6d
                        java.util.Iterator r8 = r1.iterator()
                    L48:
                        boolean r0 = r8.hasNext()
                        if (r0 == 0) goto L68
                        java.lang.Object r7 = r8.next()
                        r0 = r7
                        X.1IQ r0 = (X.C1IQ) r0
                        com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r0 = r0.A00()
                        X.05A r0 = r0.A02
                        java.lang.Object r0 = r0.getValue()
                        X.1IT r0 = (X.C1IT) r0
                        int r1 = r0.A00
                        r0 = 2
                        if (r1 >= r0) goto L48
                        if (r7 != 0) goto L7f
                    L68:
                        X.C61442r7.A01(r5)
                        r0 = 0
                        return r0
                    L6d:
                        com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r0 = r7.A00()
                        X.05A r0 = r0.A02
                        java.lang.Object r0 = r0.getValue()
                        X.1IT r0 = (X.C1IT) r0
                        int r1 = r0.A00
                        r0 = 2
                        if (r1 < r0) goto L7f
                        goto L68
                    L7f:
                        java.lang.String r0 = "NETWORK_STORIES_TRAY_UI_RENDER_STRICT_END"
                        r4.A02(r0)
                        com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r0 = r6.A00()
                        r0.Egh(r3)
                        r5.A0P = r2
                        goto L68
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C82153lb.queueIdle():boolean");
                }
            });
            return;
        }
        this.A0P = C05F.A0N;
        C24571Ia c24571Ia2 = this.A0H.A04;
        C24581Ib c24581Ib2 = c24571Ia2.A01;
        c24581Ib2.A01.A02("STORIES_REQUEST_FAILED");
        c24581Ib2.A00().Egh(C1IT.A03);
        C24591Ic c24591Ic2 = c24571Ia2.A02;
        c24591Ic2.A01.A02("NETWORK_STORIES_TRAY_UI_RENDER_SKIPPED");
        c24591Ic2.A00().Egh(C1IT.A06);
        if (str != null) {
            C226418s.A06(this.A00, "stories_request_error", str);
        }
        A01(this);
    }

    @Override // X.InterfaceC61452r8
    public final void Cxa(boolean z) {
        this.A08 = z;
        if (!z) {
            this.A00.A01(C1IN.A00(this.A0I.A0D()));
        } else {
            this.A00 = new C0k4();
            this.A09 = false;
        }
        C41451vu.A01.A02(this.A0E, C42661xu.class);
        this.A0G.EDY(this);
    }

    @Override // X.InterfaceC61452r8
    public final void D9y() {
        C41451vu.A01.A03(this.A0E, C42661xu.class);
        this.A0G.F9f(this);
        if (this.A08) {
            this.A00.A00();
            this.A09 = true;
        }
    }

    @Override // X.InterfaceC61462r9
    public final void E6p(float f, float f2) {
        if (f2 >= 1.0f && !this.A04) {
            A02(this, "FEED_PULL_TO_REFRESH");
            this.A04 = true;
        }
    }

    @Override // X.InterfaceC61452r8
    public final String getDestination() {
        return this.A0L;
    }

    @Override // X.C1I7, X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(305418996);
        if (i > 0) {
            A02(this, "FEED_SCROLL_DOWN");
            DisplayMetrics displayMetrics = this.A0A.getResources().getDisplayMetrics();
            C14360o3.A07(displayMetrics);
            RectF rectF = AbstractC13880nE.A01;
            C226418s.A06(this.A00, "feed_scroll_down_distance", String.valueOf(i5 / displayMetrics.density));
            this.A0G.F9f(this);
        }
        C0f9.A0A(15423450, A03);
    }
}
