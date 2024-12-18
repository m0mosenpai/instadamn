package X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.forker.Process;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.util.startup.tracking.TaskLifeDetectingService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.18s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C226418s implements InterfaceC12870lZ {
    public int A00;
    public C9BW A01;
    public LightweightQuickPerformanceLogger A02;
    public C0k4 A03;
    public C1KX A04;
    public C1KX A05;
    public C1KW A06;
    public Long A07;
    public boolean A09;
    public boolean A0A;
    public C9BW A0B;
    public InterfaceC19630xq A0C;
    public AnonymousClass523 A0D;
    public Boolean A0E;
    public final C227018y A0F;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final C19L A0J;
    public volatile boolean A0L;
    public volatile boolean A0M;
    public static final C226218q A0V = new Object();
    public static final C226618u A0T = AbstractC226518t.A00("no_surface_attached");
    public static final C226618u A0R = AbstractC226518t.A00("different_surface_attached");
    public static final C226618u A0S = AbstractC226518t.A00("navigated_away");
    public static final C226618u A0N = AbstractC226518t.A00("backgrounded");
    public static final C226618u A0Q = AbstractC226518t.A00("killed_by_task_removal");
    public static final C226618u A0O = AbstractC226518t.A00("killed_by_back_button");
    public static final C226618u A0P = AbstractC226518t.A00("app_start_marker_dropped");
    public static final C226618u A0U = AbstractC226518t.A00("startup_tracking_timeout");
    public final InterfaceC09390do A0K = AbstractC09440dt.A01(C226718v.A00);
    public final InterfaceC09390do A0G = AbstractC09440dt.A01(new C9EK(this, 8));
    public String A08 = "unknown";

    public static final void A05(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, long j) {
        C14360o3.A0B(lightweightQuickPerformanceLogger, 2);
        lightweightQuickPerformanceLogger.markerAnnotate(15335435, str, j);
    }

    public static final void A06(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(lightweightQuickPerformanceLogger, 2);
        lightweightQuickPerformanceLogger.markerAnnotate(15335435, str, str2);
    }

    public static final void A07(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, boolean z) {
        C14360o3.A0B(lightweightQuickPerformanceLogger, 2);
        lightweightQuickPerformanceLogger.markerAnnotate(15335435, str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if ((r12 instanceof com.instagram.common.session.UserSession) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J(android.content.Context r10, android.content.Intent r11, X.AbstractC12990ll r12) {
        /*
            r9 = this;
            r4 = r12
            if (r12 == 0) goto L8
            boolean r0 = r12 instanceof com.instagram.common.session.UserSession
            r3 = 1
            if (r0 != 0) goto L9
        L8:
            r3 = 0
        L9:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36324007302410008(0x810c7e00142f18, double:3.0347867108568916E-306)
            boolean r0 = X.C18U.A06(r2, r12, r0)
            if (r0 != 0) goto L18
            if (r3 == 0) goto L2c
        L18:
            boolean r0 = X.C218914p.A08()
            if (r0 == 0) goto L2c
            X.1CA r6 = X.C1CA.A05
            r7 = -1
            r5 = r9
            r3 = r10
            A02(r3, r4, r5, r6, r7)
            java.lang.Integer r0 = X.C05F.A00
            r9.A0L(r11, r0)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226418s.A0J(android.content.Context, android.content.Intent, X.0ll):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if ((r11 instanceof com.instagram.common.session.UserSession) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(android.content.Context r10, X.AbstractC12990ll r11) {
        /*
            r9 = this;
            r4 = r11
            if (r11 == 0) goto L8
            boolean r0 = r11 instanceof com.instagram.common.session.UserSession
            r3 = 1
            if (r0 != 0) goto L9
        L8:
            r3 = 0
        L9:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36324007302475545(0x810c7e00152f19, double:3.0347867108983375E-306)
            boolean r0 = X.C18U.A06(r2, r11, r0)
            if (r0 != 0) goto L18
            if (r3 == 0) goto L27
        L18:
            boolean r0 = X.C218914p.A08()
            if (r0 == 0) goto L27
            X.1CA r6 = X.C1CA.A06
            r7 = -1
            r5 = r9
            r3 = r10
            A02(r3, r4, r5, r6, r7)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226418s.A0K(android.content.Context, X.0ll):void");
    }

    public final void A0L(Intent intent, Integer num) {
        boolean z;
        C14360o3.A0B(num, 0);
        int intValue = num.intValue();
        switch (intValue) {
            case 2:
            case 3:
            case 7:
            case 8:
            case 9:
            case 14:
            case Process.SIGTERM /* 15 */:
                z = true;
                break;
            case 4:
            case 5:
            case 6:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            default:
                z = false;
                this.A0B = new C9BW(intent, num);
                break;
        }
        switch (intValue) {
            case 0:
            case 1:
            case 5:
            case 6:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                if (this.A01.A00 == C05F.A09) {
                    this.A01 = new C9BW(intent, num);
                    break;
                }
                break;
        }
        C1KX c1kx = this.A05;
        if (c1kx != null) {
            if (num != C05F.A00 || c1kx.A01.A00 == C05F.A09) {
                if (c1kx.A0O == C1CA.A03) {
                    if (c1kx.A01.A00 != C05F.A09) {
                        return;
                    }
                } else if (z) {
                    return;
                }
                c1kx.A01 = new C9BW(intent, num);
                C1CC.A02 = AbstractC53272cB.A01(num);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003d A[Catch: all -> 0x0083, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:7:0x0013, B:9:0x0017, B:13:0x001f, B:15:0x0026, B:17:0x002c, B:21:0x0071, B:23:0x0078, B:24:0x007e, B:26:0x0039, B:28:0x003d, B:29:0x0045, B:31:0x004e, B:33:0x0052, B:36:0x005b, B:38:0x0063), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063 A[Catch: all -> 0x0083, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:7:0x0013, B:9:0x0017, B:13:0x001f, B:15:0x0026, B:17:0x002c, B:21:0x0071, B:23:0x0078, B:24:0x007e, B:26:0x0039, B:28:0x003d, B:29:0x0045, B:31:0x004e, B:33:0x0052, B:36:0x005b, B:38:0x0063), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A0M(com.facebook.quicklog.LightweightQuickPerformanceLogger r8, X.C226618u r9, java.lang.Long r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            r4 = 0
            X.C14360o3.A0B(r9, r4)     // Catch: java.lang.Throwable -> L83
            r0 = 1
            X.C14360o3.A0B(r8, r0)     // Catch: java.lang.Throwable -> L83
            X.1KX r3 = r7.A05     // Catch: java.lang.Throwable -> L83
            if (r3 == 0) goto L81
            X.18y r5 = r7.A0F     // Catch: java.lang.Throwable -> L83
            boolean r0 = r5.A00     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L1e
            boolean r0 = r7.A0L     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L1c
            boolean r0 = r7.A0M     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L1c
            goto L1e
        L1c:
            r6 = 0
            goto L1f
        L1e:
            r6 = 1
        L1f:
            boolean r0 = r3.A0E     // Catch: java.lang.Throwable -> L83
            r2 = 15335435(0xea000b, float:2.1489522E-38)
            if (r0 != 0) goto L39
            X.1CA r1 = r3.A0O     // Catch: java.lang.Throwable -> L83
            X.1CA r0 = X.C1CA.A03     // Catch: java.lang.Throwable -> L83
            if (r1 != r0) goto L39
            X.9BW r0 = r3.A01     // Catch: java.lang.Throwable -> L83
            java.lang.Object r1 = r0.A00     // Catch: java.lang.Throwable -> L83
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L83
            java.lang.Integer r0 = X.C05F.A1F     // Catch: java.lang.Throwable -> L83
            if (r1 == r0) goto L39
            if (r6 == 0) goto L39
            goto L71
        L39:
            boolean r0 = r7.A0A     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L45
            java.lang.String r1 = r7.A08     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = "feed_timeline"
            X.C14360o3.A0K(r1, r0)     // Catch: java.lang.Throwable -> L83
        L45:
            r7.A0A = r4     // Catch: java.lang.Throwable -> L83
            r7.A04(r8, r9, r3, r10)     // Catch: java.lang.Throwable -> L83
            boolean r0 = r5.A02     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L5b
            java.lang.String r0 = r3.A08     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L5b
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r7.A02     // Catch: java.lang.Throwable -> L83
            boolean r0 = r8.equals(r0)     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L5b
            goto L81
        L5b:
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r7.A02     // Catch: java.lang.Throwable -> L83
            boolean r0 = r0.isMarkerOn(r2, r4)     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L7e
            java.lang.String r0 = "missed_marker_end"
            X.18u r2 = X.AbstractC226518t.A00(r0)     // Catch: java.lang.Throwable -> L83
            com.facebook.quicklog.LightweightQuickPerformanceLogger r1 = r7.A02     // Catch: java.lang.Throwable -> L83
            r0 = 0
            r7.A04(r1, r2, r3, r0)     // Catch: java.lang.Throwable -> L83
            goto L7e
        L71:
            r8.markerDrop(r2)     // Catch: java.lang.Throwable -> L83
            boolean r0 = r3.A0G     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L7e
            r0 = 25100289(0x17f0001, float:4.6836106E-38)
            r8.markerDrop(r0)     // Catch: java.lang.Throwable -> L83
        L7e:
            r7.A08(r9, r3)     // Catch: java.lang.Throwable -> L83
        L81:
            monitor-exit(r7)
            return
        L83:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226418s.A0M(com.facebook.quicklog.LightweightQuickPerformanceLogger, X.18u, java.lang.Long):void");
    }

    public final void A0N(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, InterfaceC61452r8 interfaceC61452r8, String str) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(lightweightQuickPerformanceLogger, 2);
        C1KX c1kx = this.A05;
        if (c1kx != null) {
            InterfaceC61452r8 interfaceC61452r82 = c1kx.A02;
            if (interfaceC61452r82 == null || interfaceC61452r82 == interfaceC61452r8) {
                if (c1kx.A0G) {
                    lightweightQuickPerformanceLogger.markerPoint(25100289, str);
                }
            } else {
                return;
            }
        }
        lightweightQuickPerformanceLogger.markerPoint(15335435, str);
    }

    public final void A0O(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, InterfaceC61452r8 interfaceC61452r8, String str, String str2) {
        InterfaceC61452r8 interfaceC61452r82;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(lightweightQuickPerformanceLogger, 3);
        C1KX c1kx = this.A05;
        if (c1kx == null || (interfaceC61452r82 = c1kx.A02) == null || interfaceC61452r82 == interfaceC61452r8) {
            lightweightQuickPerformanceLogger.markerPoint(25100289, str, str2);
        }
        lightweightQuickPerformanceLogger.markerPoint(15335435, str, str2);
    }

    public final void A0P(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(lightweightQuickPerformanceLogger, 1);
        C1KX c1kx = this.A05;
        if (c1kx != null && c1kx.A0G) {
            lightweightQuickPerformanceLogger.markerPoint(25100289, str);
        }
        lightweightQuickPerformanceLogger.markerPoint(15335435, str);
    }

    public final void A0Q(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, long j) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(lightweightQuickPerformanceLogger, 2);
        C1KX c1kx = this.A05;
        if (c1kx != null && c1kx.A0G) {
            lightweightQuickPerformanceLogger.markerPoint(25100289, str);
        }
        lightweightQuickPerformanceLogger.markerPoint(15335435, str, j, TimeUnit.MILLISECONDS);
    }

    public final void A0R(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, String str2) {
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(lightweightQuickPerformanceLogger, 2);
        C1KX c1kx = this.A05;
        if (c1kx != null && c1kx.A0G) {
            lightweightQuickPerformanceLogger.markerPoint(25100289, str, str2);
        }
        lightweightQuickPerformanceLogger.markerPoint(15335435, str, str2);
    }

    public final void A0S(InterfaceC61452r8 interfaceC61452r8) {
        C14360o3.A0B(interfaceC61452r8, 0);
        A0A(this, interfaceC61452r8, false);
    }

    public final void A0T(InterfaceC61452r8 interfaceC61452r8) {
        C14360o3.A0B(interfaceC61452r8, 0);
        if (this.A0F.A02) {
            A0A(this, interfaceC61452r8, false);
        }
    }

    public static final C226418s A00() {
        return C226218q.A01(AbstractC12960li.A00);
    }

    private final void A01() {
        List<InterfaceC61452r8> list;
        C1KX c1kx;
        C1KX c1kx2;
        if (C14360o3.A0K(this.A08, "feed_timeline") && (c1kx2 = this.A05) != null && c1kx2.A0J) {
            c1kx2.A00--;
        }
        C1KX c1kx3 = this.A05;
        if (c1kx3 != null) {
            int i = c1kx3.A00;
            if (i > 0) {
                c1kx3.A00 = i - 1;
                return;
            } else {
                c1kx3.A08 = this.A08;
                list = c1kx3.A0D;
            }
        } else {
            list = C16930sl.A00;
        }
        for (InterfaceC61452r8 interfaceC61452r8 : list) {
            if (!C14360o3.A0K(interfaceC61452r8.getDestination(), this.A08)) {
                interfaceC61452r8.D9y();
            } else {
                C1KX c1kx4 = this.A05;
                if (c1kx4 != null) {
                    c1kx4.A02 = interfaceC61452r8;
                }
            }
        }
        C1KX c1kx5 = this.A05;
        if (c1kx5 != null) {
            c1kx5.A0D.clear();
            InterfaceC61452r8 interfaceC61452r82 = c1kx5.A02;
            if (interfaceC61452r82 != null) {
                A0R(C1IN.A00(A0D()), "confirmed_surface", interfaceC61452r82.getDestination());
                interfaceC61452r82.AJO(C1IN.A00(A0D()));
                if (!this.A02.isMarkerOn(15335435, true) || (c1kx = this.A05) == null) {
                }
                A08(AbstractC226518t.A00("marker_terminated_by_confirm"), c1kx);
                return;
            }
        }
        A06(this.A02, "confirm_failed", "no_trackable");
        A0M(this.A02, A0T, null);
        if (!this.A02.isMarkerOn(15335435, true)) {
        }
    }

    public static final void A02(Context context, AbstractC12990ll abstractC12990ll, final C226418s c226418s, C1CA c1ca, long j) {
        boolean z;
        String valueOf;
        C1KX c1kx;
        if (c226418s.A06 == null) {
            Context applicationContext = context.getApplicationContext();
            C14360o3.A07(applicationContext);
            c226418s.A06 = new C1KW(applicationContext);
        }
        c226418s.A07 = Long.valueOf(System.currentTimeMillis());
        if (c226418s.A05 == null) {
            c226418s.A0C = C226218q.A00(context);
            C06090Tz c06090Tz = C06090Tz.A06;
            if (C18U.A06(c06090Tz, abstractC12990ll, 36324007302999841L) && c226418s.A0D == null) {
                Context applicationContext2 = context.getApplicationContext();
                C14360o3.A07(applicationContext2);
                AnonymousClass523 anonymousClass523 = new AnonymousClass523(applicationContext2, c226418s.A0J);
                c226418s.A0D = anonymousClass523;
                C1CC.A03 = anonymousClass523;
            }
            long currentTimeMillis = System.currentTimeMillis();
            C9BW c9bw = c226418s.A0B;
            Context applicationContext3 = context.getApplicationContext();
            C14360o3.A07(applicationContext3);
            final C1KX c1kx2 = new C1KX(applicationContext3, c9bw, c226418s, c1ca, currentTimeMillis);
            c226418s.A05 = c1kx2;
            C1CA c1ca2 = C1CA.A03;
            if (c1ca != c1ca2 && c226418s.A0F.A03) {
                ((C1IQ) C226218q.A01(AbstractC12960li.A00).A0G.getValue()).A03();
            }
            C06090Tz c06090Tz2 = C06090Tz.A05;
            if (!C18U.A06(c06090Tz2, abstractC12990ll, 36324007301164811L)) {
                Object systemService = context.getSystemService("activity");
                C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                ActivityManager activityManager = (ActivityManager) systemService;
                C1KX c1kx3 = c226418s.A05;
                if (c1kx3 != null) {
                    c1kx3.A04 = Boolean.valueOf(activityManager.isBackgroundRestricted());
                }
            }
            long j2 = j;
            if (j == -1) {
                C1IN.A00(c226418s.A0D()).markerStart(15335435);
                j2 = AwakeTimeSinceBootClock.INSTANCE.now();
            } else {
                if (c1ca == c1ca2) {
                    C17320tT A00 = C226218q.A00(context);
                    int i = A00.getInt("all_cold_start_count_since_upgrade", 0) + 1;
                    InterfaceC19610xo ARD = A00.ARD();
                    ARD.E7D("all_cold_start_count_since_upgrade", i);
                    ARD.apply();
                    C1CC.A04 = i;
                    C1IN.A00(c226418s.A0D()).markerStart(25100289);
                    C1IN.A00(c226418s.A0D()).markerStart(25100291);
                    C1IN.A00(c226418s.A0D()).markerStart(883765885);
                    C1KX c1kx4 = c226418s.A05;
                    if (c1kx4 != null) {
                        c1kx4.A0G = true;
                        c1kx4.A0F = true;
                    }
                }
                C1IN.A00(c226418s.A0D()).A0e(15335435, j2);
            }
            C1CC.A04(c1ca, j2);
            if (c226418s.A0F.A02) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: X.1Kn
                    @Override // java.lang.Runnable
                    public final void run() {
                        C226418s c226418s2 = c226418s;
                        if (c226418s2.A05 == c1kx2) {
                            c226418s2.A0M(c226418s2.A02, C226418s.A0U, null);
                        }
                    }
                }, TimeUnit.SECONDS.toMillis(30L));
            }
            MarkerEditor withMarker = C1IN.A00(c226418s.A0D()).withMarker(15335435);
            withMarker.setSurviveUserSwitch(true);
            withMarker.markerEditingCompleted();
            if (C18U.A06(c06090Tz2, abstractC12990ll, 36324007302213397L)) {
                z = false;
            } else {
                C1KX c1kx5 = c226418s.A04;
                z = false;
                if (c1kx5 != null && c1kx5.A0O == c1ca2 && !c1kx5.A0E) {
                    z = true;
                }
            }
            C1IN A0D = c226418s.A0D();
            if (z) {
                valueOf = C1CA.A04.toString();
            } else {
                C1KX c1kx6 = c226418s.A05;
                C1CA c1ca3 = null;
                if (c1kx6 != null) {
                    c1ca3 = c1kx6.A0O;
                }
                valueOf = String.valueOf(c1ca3);
            }
            A0D.A01(15335435, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, valueOf);
            C1IN.A00(c226418s.A0D()).markerAnnotate(15335435, "user_has_cutover_thread", C18U.A06(c06090Tz, abstractC12990ll, 36318861937089219L));
            InterfaceC19630xq interfaceC19630xq = c226418s.A0C;
            if (interfaceC19630xq != null) {
                long j3 = interfaceC19630xq.getLong("all_start_latest_background_time", -1L);
                if (j3 > 0) {
                    C1IN.A00(c226418s.A0D()).markerAnnotate(15335435, "seconds_since_backgrounded", (int) ((currentTimeMillis - j3) / 1000));
                }
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.E7G("all_start_latest_background_time", -1L);
                ARD2.apply();
            }
            if (c1ca != c1ca2 && (c1kx = c226418s.A05) != null) {
                c1kx.A0I = true;
            }
            boolean z2 = C11P.A00;
            C11P.A00(new C1KC() { // from class: X.1Kp
                {
                    super("endAppStartLoggerWhenTimeOut");
                }

                @Override // X.C1KC
                public final boolean onQueueIdle() {
                    String str;
                    InterfaceC61452r8 interfaceC61452r8;
                    C226418s c226418s2 = C226418s.this;
                    C1KX c1kx7 = c226418s2.A05;
                    if (c1kx7 != null) {
                        if (c1kx7.A02 == null) {
                            c226418s2.A0M(c226418s2.A02, C226418s.A0T, null);
                        } else {
                            if (!C14360o3.A0K(c226418s2.A08, AppStateModule.APP_STATE_BACKGROUND)) {
                                C1KX c1kx8 = c226418s2.A05;
                                if (c1kx8 != null && (interfaceC61452r8 = c1kx8.A02) != null) {
                                    str = interfaceC61452r8.getDestination();
                                } else {
                                    str = null;
                                }
                                if (!AbstractC002300n.A0g(str, c226418s2.A08, false)) {
                                    c226418s2.A0M(c226418s2.A02, C226418s.A0R, null);
                                    return false;
                                }
                                return true;
                            }
                            return true;
                        }
                    }
                    return false;
                }
            });
            C218914p.A03(EnumC220415e.A02, c226418s);
        }
    }

    public static final void A03(Context context, AbstractC12990ll abstractC12990ll, boolean z) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (z == C18U.A06(c06090Tz, abstractC12990ll, 36317521900868942L)) {
            try {
                TaskLifeDetectingService.A02 = C18U.A06(c06090Tz, abstractC12990ll, 36324007301426959L);
                TaskLifeDetectingService.A01 = C18U.A06(c06090Tz, abstractC12990ll, 36317521901000016L);
                C12260kU.A01(context, new Intent(context, (Class<?>) TaskLifeDetectingService.class));
            } catch (IllegalStateException e) {
                C0w9.A07("AppStartupTracker", e);
            }
        }
    }

    private final void A04(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, C226618u c226618u, C1KX c1kx, Long l) {
        short s;
        boolean z;
        String str;
        C09530e4 A02;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        boolean z2 = c226618u.A01;
        if (z2) {
            lightweightQuickPerformanceLogger.markerAnnotate(15335435, TraceFieldType.FailureReason, c226618u.toString());
        }
        lightweightQuickPerformanceLogger.markerAnnotate(15335435, "is_successful", !z2);
        C1KX c1kx2 = this.A05;
        if (c1kx2 != null) {
            Boolean bool = c1kx2.A04;
            if (bool != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "is_background_restricted", bool.booleanValue());
            }
            lightweightQuickPerformanceLogger.markerAnnotate(15335435, "logger_version", "4");
            lightweightQuickPerformanceLogger.markerAnnotate(15335435, "trigger", AbstractC53272cB.A01((Integer) c1kx2.A01.A00));
            Intent intent = (Intent) c1kx2.A01.A01;
            if (intent != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "trigger_intent_action", intent.getAction());
                java.util.Set<String> categories = intent.getCategories();
                if (categories == null || (strArr3 = (String[]) categories.toArray(new String[0])) == null) {
                    strArr3 = new String[0];
                }
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "trigger_intent_category", strArr3);
            }
            lightweightQuickPerformanceLogger.markerAnnotate(15335435, "fg_start_count", this.A00);
            Intent A00 = C08750cd.A00();
            if (A00 != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "peeker_intent_action", A00.getAction());
                java.util.Set<String> categories2 = A00.getCategories();
                if (categories2 == null || (strArr2 = (String[]) categories2.toArray(new String[0])) == null) {
                    strArr2 = new String[0];
                }
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "peeker_intent_category", strArr2);
                z = true;
            } else {
                z = false;
            }
            lightweightQuickPerformanceLogger.markerAnnotate(15335435, "has_intent_peerker", z);
            C08770cf.A01.A02(lightweightQuickPerformanceLogger, 15335435);
            lightweightQuickPerformanceLogger.markerAnnotate(15335435, "current_module", this.A08);
            lightweightQuickPerformanceLogger.markerAnnotate(15335435, "first_user_trigger", AbstractC53272cB.A01((Integer) this.A01.A00));
            Intent intent2 = (Intent) this.A01.A01;
            if (intent2 != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "first_intent_action", intent2.getAction());
                java.util.Set<String> categories3 = intent2.getCategories();
                if (categories3 == null || (strArr = (String[]) categories3.toArray(new String[0])) == null) {
                    strArr = new String[0];
                }
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "first_intent_category", strArr);
            }
            if (c1kx2.A0G) {
                lightweightQuickPerformanceLogger.markerAnnotate(25100289, "trigger", AbstractC53272cB.A01((Integer) c1kx2.A01.A00));
            }
            Integer num = c1kx2.A07;
            if (num != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "visible_items_count", num.intValue());
            }
            Integer num2 = c1kx2.A06;
            if (num2 != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "thread_type_value", num2.intValue());
            }
            String str2 = c1kx2.A0B;
            if (str2 != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "thread_type_str", str2);
            }
            String str3 = c1kx2.A0A;
            if (str3 != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "open_thread_id", str3);
            }
            String str4 = c1kx2.A09;
            if (str4 != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "occamadillo_thread_id", str4);
            }
            String str5 = c1kx2.A0C;
            if (str5 != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, TraceFieldType.TransportType, str5);
            }
            Boolean bool2 = c1kx2.A03;
            if (bool2 != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "first_user_is_background", bool2.booleanValue());
            }
            Integer num3 = c1kx2.A05;
            if (num3 != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "count_since_cold_start", num3.intValue());
            }
            lightweightQuickPerformanceLogger.markerAnnotate(15335435, "has_peek_cold_start_intent_available", false);
            lightweightQuickPerformanceLogger.markerAnnotate(15335435, "user_logged_in", c1kx2.A0I);
            lightweightQuickPerformanceLogger.markerAnnotate(15335435, "build_type", "prod");
            InterfaceC61452r8 interfaceC61452r8 = c1kx2.A02;
            if (interfaceC61452r8 != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "destination", interfaceC61452r8.getDestination());
            }
            Context context = c1kx2.A0M;
            long j = C226218q.A00(context).getLong("last_app_start_timestamp", -1L);
            if (j > 0) {
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "duration_since_last_startup", c1kx2.A0K - j);
                String string = C226218q.A00(context).getString("last_app_start_trigger", "unknown");
                if (string == null) {
                    string = "unknown";
                }
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "last_app_start_trigger", string);
                String str6 = "COLD";
                String string2 = C226218q.A00(context).getString("last_app_start_type", "COLD");
                if (string2 != null) {
                    str6 = string2;
                }
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "last_app_start_type", str6);
                C1IN A0D = A0D();
                String str7 = "empty";
                String string3 = C226218q.A00(context).getString("last_app_start_intent", "empty");
                if (string3 != null) {
                    str7 = string3;
                }
                A0D.A01(15335435, "last_app_start_intent", str7);
                if (c1kx2.A0O == C1CA.A03 && (A02 = C226218q.A02(context)) != null) {
                    String str8 = (String) A02.A00;
                    long longValue = ((Number) A02.A01).longValue();
                    A0D().A01(15335435, "last_app_exit_reason", str8);
                    C1IN.A00(A0D()).markerAnnotate(15335435, "last_app_process_alive_duration", longValue - j);
                }
            }
            if (c1kx2.A0O == C1CA.A03 && (this.A0M || this.A0L)) {
                if (this.A0L) {
                    str = "on_install";
                } else {
                    str = "on_upgrade";
                }
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "first_run", str);
            }
            long j2 = -1;
            if (C1CC.A00 != -1) {
                j2 = System.currentTimeMillis() - C1CC.A00;
            }
            lightweightQuickPerformanceLogger.markerAnnotate(15335435, "time_since_upgrade_ms", j2);
            lightweightQuickPerformanceLogger.markerAnnotate(15335435, "foreground_cold_start_count_since_upgrade", C1CC.A05);
            lightweightQuickPerformanceLogger.markerAnnotate(15335435, "all_cold_start_count_since_upgrade", C1CC.A04);
            lightweightQuickPerformanceLogger.markerAnnotate(15335435, "foreground_timespent_since_upgrade_ms", C1CC.A06);
            C1KX c1kx3 = this.A05;
            if (c1kx3 != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "attach_sequence", (String[]) c1kx3.A0P.toArray(new String[0]));
            }
            if (C1AD.A06(C06090Tz.A05, 18314324665712373L)) {
                lightweightQuickPerformanceLogger.markerAnnotate(15335435, "signal_strength", AbstractC15820qc.A00());
            }
        }
        C226618u c226618u2 = A0N;
        if (c226618u != c226618u2 && c226618u != A0O && c226618u != A0Q && c226618u != A0T && c226618u != A0P) {
            if (c226618u != A0R && !c226618u.equals(A0S) && !c226618u.A00) {
                s = 3;
                if (!z2) {
                    s = 2;
                }
            } else {
                s = 4;
            }
        } else {
            s = 630;
        }
        if (l != null) {
            lightweightQuickPerformanceLogger.markerEnd(15335435, s, l.longValue(), TimeUnit.MILLISECONDS);
        } else {
            lightweightQuickPerformanceLogger.markerEnd(15335435, s);
        }
        this.A00++;
        if (c1kx.A0G) {
            if (c226618u != c226618u2 && A0C(c1kx)) {
                short s2 = 2;
                if (z2) {
                    s2 = 3;
                }
                lightweightQuickPerformanceLogger.markerEnd(25100289, s2);
                return;
            }
            lightweightQuickPerformanceLogger.markerDrop(25100289);
        }
    }

    public static final void A09(C226418s c226418s, int i) {
        String str;
        Integer num;
        C1KX c1kx = c226418s.A05;
        if (c1kx != null && c1kx.A0F) {
            C1IN A0D = c226418s.A0D();
            C1KX c1kx2 = c226418s.A05;
            if (c1kx2 != null && (num = (Integer) c1kx2.A01.A00) != null) {
                str = AbstractC53272cB.A00(num);
            } else {
                str = null;
            }
            A0D.A01(i, "trigger", str);
            Boolean bool = c1kx.A04;
            if (bool != null) {
                C1IN.A00(c226418s.A0D()).markerAnnotate(i, "is_background_restricted", bool.booleanValue());
            }
            C08770cf.A01.A02(C1IN.A00(c226418s.A0D()), i);
            C1IN A0D2 = c226418s.A0D();
            short s = 2;
            if (c1kx.A0E) {
                s = 3;
            }
            C1IN.A00(A0D2).markerEnd(i, s);
        }
    }

    public static final void A0A(C226418s c226418s, InterfaceC61452r8 interfaceC61452r8, boolean z) {
        C1KX c1kx = c226418s.A05;
        if (c1kx != null) {
            boolean z2 = c226418s.A0F.A02;
            List list = c1kx.A0P;
            String destination = interfaceC61452r8.getDestination();
            list.add(destination);
            if (z2) {
                boolean z3 = c1kx.A0J;
                if (z3 && !z && !C14360o3.A0K(destination, "feed_timeline")) {
                    return;
                }
                Object obj = c1kx.A02;
                if (obj == null) {
                    Iterator it = c1kx.A0D.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (C14360o3.A0K(((InterfaceC61452r8) obj).getDestination(), destination)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                }
                String str = c1kx.A08;
                if (obj == null && str == null) {
                    interfaceC61452r8.Cxa(true);
                    c1kx.A0D.add(interfaceC61452r8);
                    if (z3 && !C14360o3.A0K(destination, "feed_timeline")) {
                        c226418s.A01();
                    }
                }
            } else if (c1kx.A02 != interfaceC61452r8) {
                C1IN A0D = c226418s.A0D();
                C14360o3.A0B(destination, 1);
                C1IN.A00(A0D).markerTag(15335435, destination);
                InterfaceC61452r8 interfaceC61452r82 = c1kx.A02;
                if (interfaceC61452r82 != null) {
                    interfaceC61452r82.D9y();
                }
                interfaceC61452r8.Cxa(z2);
                c1kx.A02 = interfaceC61452r8;
            }
            C14360o3.A0B(destination, 0);
            C1CC.A01 = destination;
        }
    }

    public static final void A0B(C226418s c226418s, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        if (c226418s.A05 != null) {
            interfaceC16820sZ.invoke();
        } else {
            interfaceC16820sZ2.invoke();
        }
    }

    public static final boolean A0C(C1KX c1kx) {
        String str;
        boolean A09 = AbstractC14490oL.A09(c1kx.A0M);
        String str2 = null;
        InterfaceC61452r8 interfaceC61452r8 = c1kx.A02;
        if (A09) {
            if (interfaceC61452r8 != null) {
                str = interfaceC61452r8.getDestination();
            } else {
                str = null;
            }
            if (!C14360o3.A0K(str, "ig_text_feed_timeline")) {
                InterfaceC61452r8 interfaceC61452r82 = c1kx.A02;
                if (interfaceC61452r82 != null) {
                    str2 = interfaceC61452r82.getDestination();
                }
                if (!C14360o3.A0K(str2, "ig_text_post_permalink")) {
                    return false;
                }
            }
            return true;
        }
        if (interfaceC61452r8 != null) {
            str2 = interfaceC61452r8.getDestination();
        }
        return C14360o3.A0K(str2, "feed_timeline");
    }

    public final C1IN A0D() {
        return (C1IN) this.A0K.getValue();
    }

    public final void A0E() {
        A0B(this, new J6y(this.A0G.getValue()), new C9EK(this, 10));
    }

    public final void A0F() {
        A0B(this, new C3YK(this.A0G.getValue()), new C9EK(this, 11));
    }

    public final void A0G() {
        String str;
        C1KX c1kx = this.A05;
        if (c1kx != null && (str = c1kx.A08) != null) {
            if (!C14360o3.A0K(this.A08, str)) {
                A06(this.A02, "missed_nav_chain_end", this.A08);
            }
        } else {
            if (!this.A0F.A02) {
                return;
            }
            A01();
        }
    }

    public final void A0H() {
        A0B(this, new C1P4(this.A0G.getValue()), new C9EK(this, 13));
    }

    public final void A0I() {
        A0B(this, new C81193jo(this.A0G.getValue()), new C9EK(this, 14));
    }

    public final boolean A0V() {
        C1KX c1kx = this.A05;
        if (c1kx == null || c1kx.A0O != C1CA.A03) {
            return false;
        }
        return true;
    }

    public final boolean A0W() {
        C1KX c1kx = this.A05;
        if (c1kx == null || c1kx.A0O != C1CA.A05) {
            return false;
        }
        return true;
    }

    public final boolean A0X() {
        C1KX c1kx = this.A05;
        if (c1kx == null || c1kx.A0O != C1CA.A06) {
            return false;
        }
        return true;
    }

    public final boolean A0Y(Intent intent) {
        String str;
        if (intent == null) {
            intent = C08750cd.A00();
        }
        Boolean bool = this.A0E;
        if (bool == null && intent != null) {
            android.net.Uri data = intent.getData();
            if (data != null) {
                str = data.getHost();
            } else {
                str = null;
            }
            bool = Boolean.valueOf(C14360o3.A0K(str, "direct_v2"));
            this.A0E = bool;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.18y, java.lang.Object] */
    public C226418s() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0I = AbstractC09440dt.A00(enumC09460dv, C226818w.A00);
        this.A0H = AbstractC09440dt.A00(enumC09460dv, C226918x.A00);
        this.A0F = new Object();
        Integer num = C05F.A09;
        this.A01 = new C9BW((Intent) null, num);
        this.A0B = new C9BW((Intent) null, num);
        C0k4 c0k4 = new C0k4();
        this.A03 = c0k4;
        this.A02 = c0k4;
        this.A0J = AnonymousClass194.A02(C12L.A00.CPG(1204032792, 3).A00(1));
        C19P.A01.add(new Object());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
    
        if (r8 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A08(X.C226618u r12, X.C1KX r13) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226418s.A08(X.18u, X.1KX):void");
    }

    public final void A0U(boolean z, long j) {
        A07(this.A02, "is_user_in_eligible_cohort", z);
        if (j > -1) {
            A05(this.A02, "since_exited_from_reels_tab_in_sec", j / 1000);
        }
        A0P(this.A02, "REELS_TAB_REDIRECTED");
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        InterfaceC19610xo ARD;
        int A03 = C0f9.A03(-1147452035);
        C1CC.A03();
        if (this.A05 != null) {
            boolean z = C218914p.A05;
            AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
            A0Q(this.A02, "APP_BACKGROUNDED", awakeTimeSinceBootClock.now() - LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            A0M(this.A02, A0N, Long.valueOf(awakeTimeSinceBootClock.now() - LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT));
        }
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19630xq interfaceC19630xq = this.A0C;
        if (interfaceC19630xq != null && (ARD = interfaceC19630xq.ARD()) != null) {
            ARD.E7G("all_start_latest_background_time", currentTimeMillis);
            ARD.apply();
        }
        C0f9.A0A(-1916504259, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-1665433757, C0f9.A03(-1776320653));
    }
}
