package X;

import com.facebook.analytics.appstatelogger.foregroundstate.EntityAppState$ForegroundInit;
import com.facebook.errorreporting.lacrima.common.asl.aslnative.AppStateLoggerNative;

/* renamed from: X.0AI, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0AI {
    public static AnonymousClass020 A00;
    public static final Object A02 = new Object();
    public static final Object A01 = new EntityAppState$ForegroundInit();

    public static void A00(Object obj) {
        synchronized (A02) {
            AnonymousClass020 anonymousClass020 = A00;
            if (anonymousClass020 == null) {
                C0K8.A0D("lacrima", "GlobalAppState.setAppStateCallback wasn't called?");
                return;
            }
            C005801x c005801x = anonymousClass020.A00;
            C0LW c0lw = c005801x.A0C;
            if (!c0lw.A0D && !c0lw.A0E) {
                if (c005801x.A0H != null && AppStateLoggerNative.sAppStateLoggerNativeInited && AppStateLoggerNative.isShuttingDownNative()) {
                    return;
                }
                synchronized (c005801x.A0P) {
                    Object obj2 = A01;
                    if (obj == obj2) {
                        if (c005801x.A05) {
                            return;
                        }
                    } else if (c005801x.A0Q) {
                        c005801x.A0A.A03(C05F.A15, obj2);
                    }
                    C0AG c0ag = c005801x.A0A;
                    Integer num = C05F.A01;
                    c0ag.A03(num, obj);
                    C07960bG c07960bG = c005801x.A0F;
                    if (c07960bG != null) {
                        c07960bG.A04(num, obj);
                    }
                    c005801x.A03(null, C05F.A00, null, false);
                    C04480Lp c04480Lp = c005801x.A0G;
                    if (c04480Lp == null || obj == obj2) {
                        return;
                    }
                    c04480Lp.A01(3);
                }
            }
        }
    }

    public static void A01(Object obj) {
        synchronized (A02) {
            AnonymousClass020 anonymousClass020 = A00;
            if (anonymousClass020 == null) {
                C0K8.A0D("lacrima", "GlobalAppState.setAppStateCallback wasn't called?");
                return;
            }
            C005801x c005801x = anonymousClass020.A00;
            C0LW c0lw = c005801x.A0C;
            if (!c0lw.A0D && !c0lw.A0E) {
                if (c005801x.A0H != null && AppStateLoggerNative.sAppStateLoggerNativeInited && AppStateLoggerNative.isShuttingDownNative()) {
                    return;
                }
                synchronized (c005801x.A0P) {
                    if (!c005801x.A05) {
                        c005801x.A04 = false;
                    }
                    C0AG c0ag = c005801x.A0A;
                    Integer num = C05F.A15;
                    c0ag.A03(num, obj);
                    C07960bG c07960bG = c005801x.A0F;
                    if (c07960bG != null) {
                        c07960bG.A04(num, obj);
                    }
                    c005801x.A03(null, C05F.A00, null, false);
                }
            }
        }
    }
}
