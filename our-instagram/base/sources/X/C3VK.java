package X;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.blescan.BleScanOperation;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.3VK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VK {
    public C62710SMy A00;
    public O1K A01;
    public C103734lr A02;
    public C64478TFo A03;
    public C103724lq A04;
    public C103744ls A05;
    public C103774lw A06;
    public C108454uW A07;
    public C103754lu A08;
    public ScheduledExecutorService A09;
    public ScheduledExecutorService A0A;
    public final Context A0B;
    public final UserSession A0F;
    public final C3VM A0G;
    public final InterfaceC08830cm A0D = new InterfaceC08830cm() { // from class: X.3VN
        @Override // X.InterfaceC08830cm
        public final Object get() {
            C3VK c3vk = C3VK.this;
            C103724lq A02 = c3vk.A02();
            C58465Pvq A05 = c3vk.A05();
            return new C140296Wh(C03250Di.A00, A02, c3vk.A04(), A05, c3vk.A09());
        }
    };
    public final InterfaceC08830cm A0E = new InterfaceC08830cm() { // from class: X.3VO
        @Override // X.InterfaceC08830cm
        public final Object get() {
            C108454uW A07 = C3VK.this.A07();
            Context context = A07.A01;
            C108434uU c108434uU = A07.A04;
            return new QFS(context, A07.A02, A07.A03, A07, c108434uU, A07.A05, A07.A00);
        }
    };
    public final InterfaceC08830cm A0C = new InterfaceC08830cm() { // from class: X.3VP
        @Override // X.InterfaceC08830cm
        public final Object get() {
            return C3VK.this.A01();
        }
    };

    public final synchronized C103724lq A02() {
        C103724lq c103724lq;
        c103724lq = this.A04;
        if (c103724lq == null) {
            Context context = this.A0B;
            c103724lq = new C103724lq(context, (LocationManager) context.getSystemService("location"));
            this.A04 = c103724lq;
        }
        return c103724lq;
    }

    public final synchronized C103744ls A03() {
        C103744ls c103744ls;
        if (Build.VERSION.SDK_INT >= 29) {
            c103744ls = this.A05;
            if (c103744ls == null) {
                Context context = this.A0B;
                synchronized (C103744ls.class) {
                    c103744ls = C103744ls.A04;
                    if (c103744ls == null) {
                        c103744ls = new C103744ls(context);
                        C103744ls.A04 = c103744ls;
                    }
                }
                this.A05 = c103744ls;
            }
        } else {
            c103744ls = null;
        }
        return c103744ls;
    }

    public final synchronized C103774lw A04() {
        C103774lw c103774lw;
        c103774lw = this.A06;
        if (c103774lw == null) {
            C103724lq A02 = A02();
            LocationManager locationManager = (LocationManager) this.A0B.getSystemService("location");
            C103734lr c103734lr = this.A02;
            if (c103734lr == null) {
                c103734lr = new C103734lr(C03250Di.A00, RealtimeSinceBootClock.A00);
                this.A02 = c103734lr;
            }
            C3VM c3vm = this.A0G;
            c103774lw = new C103774lw(locationManager, A02, c103734lr, C006802i.A0p, A08(), c3vm);
            this.A06 = c103774lw;
        }
        return c103774lw;
    }

    public final C140286Wg A06() {
        O1K o1k;
        synchronized (this) {
            o1k = this.A01;
            if (o1k == null) {
                Context context = this.A0B;
                final C103754lu A08 = A08();
                o1k = new O1K(C1CZ.A00(context, new InterfaceC08830cm() { // from class: X.TVa
                    @Override // X.InterfaceC08830cm
                    public final Object get() {
                        return C103754lu.this;
                    }
                }));
                this.A01 = o1k;
            }
        }
        return new C140286Wg(o1k, A07(), A09(), this.A0D, this.A0E, this.A0C);
    }

    public final synchronized C108454uW A07() {
        C108454uW c108454uW;
        c108454uW = this.A07;
        if (c108454uW == null) {
            Context context = this.A0B;
            C03250Di c03250Di = C03250Di.A00;
            RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
            c108454uW = new C108454uW(context, c03250Di, realtimeSinceBootClock, A03(), new C108434uU(context), new C108444uV(c03250Di, realtimeSinceBootClock), A09());
            this.A07 = c108454uW;
        }
        return c108454uW;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, X.4lu] */
    public final synchronized C103754lu A08() {
        C103754lu c103754lu;
        C103744ls A03 = A03();
        C103754lu c103754lu2 = this.A08;
        c103754lu = c103754lu2;
        if (c103754lu2 == null) {
            UserSession userSession = this.A0F;
            final ?? obj = new Object();
            obj.A01 = AbstractC12220kQ.A01(new InterfaceC11380iw() { // from class: X.4lv
                public static final String __redex_internal_original_name = "GeoApiAnalyticsLoggerImpl$1";

                @Override // X.InterfaceC11380iw
                public final String getModuleName() {
                    return "mGeoApi";
                }
            }, userSession);
            obj.A00 = A03;
            this.A08 = obj;
            c103754lu = obj;
        }
        return c103754lu;
    }

    public final synchronized ScheduledExecutorService A09() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.A09;
        if (scheduledExecutorService == null) {
            scheduledExecutorService = new C1W3(new Handler(C1CG.A00()));
            this.A09 = scheduledExecutorService;
        }
        return scheduledExecutorService;
    }

    public final synchronized ScheduledExecutorService A0A() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.A0A;
        if (scheduledExecutorService == null) {
            scheduledExecutorService = new C1W3(new Handler(Looper.getMainLooper()));
            this.A0A = scheduledExecutorService;
        }
        return scheduledExecutorService;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [X.Rtg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.Rpa, java.lang.Object] */
    public final C58465Pvq A05() {
        C0XI c0xi;
        C61554Rpa c61554Rpa;
        C100004eN c100004eN;
        C103724lq A02 = A02();
        C03250Di c03250Di = C03250Di.A00;
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        ScheduledExecutorService A09 = A09();
        ScheduledExecutorService A0A = A0A();
        Context context = this.A0B;
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        C103774lw A04 = A04();
        synchronized (C41341vj.class) {
            C41341vj c41341vj = C41341vj.A06;
            if (c41341vj != null) {
                c0xi = (C0XI) c41341vj.A01.A03;
            } else {
                c0xi = null;
            }
        }
        if (c0xi != null) {
            C0V3 c0v3 = (C0V3) ((AbstractC02970Bv) c0xi.A00.get(C0VK.class));
            ?? obj = new Object();
            obj.A00 = c0v3;
            c61554Rpa = obj;
        } else {
            c61554Rpa = null;
        }
        ?? obj2 = new Object();
        C103744ls A03 = A03();
        C103754lu A08 = A08();
        C3VM c3vm = this.A0G;
        if (Build.VERSION.SDK_INT >= 29) {
            c100004eN = C100004eN.A00(context);
        } else {
            c100004eN = null;
        }
        return new C58465Pvq(locationManager, c03250Di, realtimeSinceBootClock, A02, c100004eN, A03, obj2, A04, C006802i.A0p, c61554Rpa, A08, c3vm, A0A, A09);
    }

    public C3VK(Context context, UserSession userSession) {
        this.A0B = context;
        this.A0F = userSession;
        this.A0G = new C3VM(userSession);
    }

    public static C3VK A00(Context context, final UserSession userSession) {
        final Context applicationContext = context.getApplicationContext();
        return (C3VK) userSession.A01(C3VK.class, new InterfaceC16820sZ() { // from class: X.3VL
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C3VK(applicationContext, userSession);
            }
        });
    }

    public final BleScanOperation A01() {
        C62710SMy c62710SMy;
        C64478TFo c64478TFo;
        ScheduledExecutorService A09 = A09();
        Context context = this.A0B;
        synchronized (this) {
            c62710SMy = this.A00;
            if (c62710SMy == null) {
                C03250Di c03250Di = C03250Di.A00;
                RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
                if (Build.VERSION.SDK_INT >= 29) {
                    c64478TFo = this.A03;
                    if (c64478TFo == null) {
                        c64478TFo = new C64478TFo();
                        this.A03 = c64478TFo;
                    }
                } else {
                    c64478TFo = null;
                }
                c62710SMy = new C62710SMy(c03250Di, realtimeSinceBootClock, c64478TFo);
                this.A00 = c62710SMy;
            }
        }
        return new BleScanOperation(context, c62710SMy, A09);
    }
}
