package X;

import android.location.Location;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5rZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC128665rZ {
    public long A00;
    public InterfaceC65486Tl6 A01;
    public C58516Pwk A02;
    public C103804lz A03;
    public String A04;
    public ExecutorService A05;
    public ScheduledFuture A06;
    public final C0JO A07;
    public final C103724lq A08;
    public final C100004eN A09;
    public final C103744ls A0A;
    public final C103774lw A0B;
    public final LightweightQuickPerformanceLogger A0C;
    public final C103754lu A0D;
    public final ScheduledExecutorService A0E;
    public final AtomicBoolean A0F = new AtomicBoolean();
    public final C0JM A0G;
    public final C61554Rpa A0H;
    public final C3VM A0I;
    public final C61786Rtg A0J;

    public static final void A01(AbstractC128665rZ abstractC128665rZ) {
        abstractC128665rZ.A02 = null;
        abstractC128665rZ.A01 = null;
        abstractC128665rZ.A04 = null;
        abstractC128665rZ.A03 = null;
        abstractC128665rZ.A00 = abstractC128665rZ.A07.now();
        C103744ls c103744ls = abstractC128665rZ.A0A;
        if (c103744ls != null) {
            c103744ls.A01(abstractC128665rZ);
        }
    }

    public abstract void A05();

    public final synchronized void A06() {
        if (this.A0F.getAndSet(false)) {
            ScheduledFuture scheduledFuture = this.A06;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.A06 = null;
            }
            A05();
            this.A0D.A01(null, "FbLocationManager", "stopLocations", this.A04, null, null, false);
            A02(this, "");
            A01(this);
            C103744ls c103744ls = this.A0A;
            if (c103744ls != null) {
                c103744ls.A01(this);
            }
        }
    }

    public static final void A02(AbstractC128665rZ abstractC128665rZ, String str) {
        String A0D;
        Integer num;
        C61554Rpa c61554Rpa = abstractC128665rZ.A0H;
        if (c61554Rpa != null) {
            long now = abstractC128665rZ.A07.now() - abstractC128665rZ.A00;
            String str2 = abstractC128665rZ.A04;
            if (str.length() == 0) {
                A0D = "";
            } else {
                A0D = AnonymousClass001.A0D(str, '-');
            }
            String A0R = AnonymousClass001.A0R(str2, A0D);
            if (AbstractC002300n.A0h(A0R, "com.facebook.", false)) {
                A0R = A0R.substring(13);
                C14360o3.A07(A0R);
            }
            C58516Pwk c58516Pwk = abstractC128665rZ.A02;
            if (c58516Pwk == null || (num = c58516Pwk.A05) == null) {
                num = C05F.A00;
            }
            int intValue = num.intValue();
            C0V3 c0v3 = c61554Rpa.A00;
            synchronized (c0v3) {
                if (intValue != 2) {
                    if (intValue != 1) {
                        C0VK c0vk = c0v3.A00;
                        C005001p c005001p = c0vk.A05;
                        C0C4 c0c4 = (C0C4) c005001p.get(A0R);
                        if (c0c4 == null) {
                            c0c4 = new C0C4();
                            c005001p.put(A0R, c0c4);
                        }
                        c0c4.A00 += now;
                        c0vk.A00 += now;
                    } else {
                        C0VK c0vk2 = c0v3.A00;
                        C005001p c005001p2 = c0vk2.A05;
                        C0C4 c0c42 = (C0C4) c005001p2.get(A0R);
                        if (c0c42 == null) {
                            c0c42 = new C0C4();
                            c005001p2.put(A0R, c0c42);
                        }
                        c0c42.A02 += now;
                        c0vk2.A02 += now;
                    }
                } else {
                    C0VK c0vk3 = c0v3.A00;
                    C005001p c005001p3 = c0vk3.A05;
                    C0C4 c0c43 = (C0C4) c005001p3.get(A0R);
                    if (c0c43 == null) {
                        c0c43 = new C0C4();
                        c005001p3.put(A0R, c0c43);
                    }
                    c0c43.A01 += now;
                    c0vk3.A01 += now;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x014b A[Catch: all -> 0x02a5, TryCatch #3 {, blocks: (B:6:0x0016, B:8:0x001a, B:9:0x0020, B:10:0x002b, B:12:0x0030, B:14:0x009c, B:15:0x00a2, B:17:0x00a6, B:18:0x00b8, B:20:0x00bc, B:22:0x00c0, B:24:0x00c8, B:26:0x00d3, B:29:0x014b, B:33:0x00cb, B:34:0x00eb, B:36:0x00f5, B:38:0x012b, B:40:0x0155, B:41:0x0158, B:43:0x015c, B:45:0x0160, B:46:0x0173, B:81:0x026c, B:82:0x0278, B:134:0x02a4, B:133:0x029d, B:135:0x008c, B:136:0x0093), top: B:5:0x0016, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0217 A[Catch: PyU -> 0x021f, all -> 0x029b, TryCatch #2 {PyU -> 0x021f, blocks: (B:61:0x01e0, B:63:0x01e8, B:65:0x01ee, B:70:0x01f6, B:72:0x01fa, B:74:0x0200, B:95:0x020e, B:67:0x0217, B:68:0x021e, B:96:0x0214, B:97:0x01ec), top: B:60:0x01e0, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026c A[Catch: all -> 0x02a5, TRY_ENTER, TryCatch #3 {, blocks: (B:6:0x0016, B:8:0x001a, B:9:0x0020, B:10:0x002b, B:12:0x0030, B:14:0x009c, B:15:0x00a2, B:17:0x00a6, B:18:0x00b8, B:20:0x00bc, B:22:0x00c0, B:24:0x00c8, B:26:0x00d3, B:29:0x014b, B:33:0x00cb, B:34:0x00eb, B:36:0x00f5, B:38:0x012b, B:40:0x0155, B:41:0x0158, B:43:0x015c, B:45:0x0160, B:46:0x0173, B:81:0x026c, B:82:0x0278, B:134:0x02a4, B:133:0x029d, B:135:0x008c, B:136:0x0093), top: B:5:0x0016, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A07(X.InterfaceC65486Tl6 r24, X.C58516Pwk r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC128665rZ.A07(X.Tl6, X.Pwk, java.lang.String):void");
    }

    public final void A08(String str, Float f) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        if (f != null && (lightweightQuickPerformanceLogger = this.A0C) != null) {
            lightweightQuickPerformanceLogger.markerAnnotate(794437326, str, f.floatValue());
        }
    }

    public final void A09(String str, Long l) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        if (l != null && (lightweightQuickPerformanceLogger = this.A0C) != null) {
            lightweightQuickPerformanceLogger.markerAnnotate(794437326, str, l.longValue());
        }
    }

    public final void A0A(String str, String str2) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        if (str2 != null && (lightweightQuickPerformanceLogger = this.A0C) != null) {
            lightweightQuickPerformanceLogger.markerAnnotate(794437326, str, str2);
        }
    }

    public final void A0B(String str, boolean z) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A0C;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerAnnotate(794437326, str, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
    
        if (A03(r23, r9) == false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A0C(X.C103804lz r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC128665rZ.A0C(X.4lz):boolean");
    }

    public AbstractC128665rZ(C0JM c0jm, C0JO c0jo, C103724lq c103724lq, C100004eN c100004eN, C103744ls c103744ls, C61786Rtg c61786Rtg, C103774lw c103774lw, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, C61554Rpa c61554Rpa, C103754lu c103754lu, C3VM c3vm, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.A08 = c103724lq;
        this.A0G = c0jm;
        this.A07 = c0jo;
        this.A0E = scheduledExecutorService;
        this.A05 = executorService;
        this.A0B = c103774lw;
        this.A0H = c61554Rpa;
        this.A0J = c61786Rtg;
        this.A0A = c103744ls;
        this.A0D = c103754lu;
        this.A0I = c3vm;
        this.A09 = c100004eN;
        this.A0C = lightweightQuickPerformanceLogger;
    }

    public static final C103804lz A00(Location location) {
        if (!location.hasAccuracy()) {
            location.setAccuracy(3333.0f);
        }
        if (AbstractC103794ly.A00(location)) {
            return new C103804lz(new Location(location), null);
        }
        return null;
    }

    private final boolean A03(C103804lz c103804lz, C103804lz c103804lz2) {
        long j;
        Long A03 = c103804lz.A03();
        Long A032 = c103804lz2.A03();
        if (A03 == null || A032 == null) {
            return false;
        }
        long longValue = A03.longValue();
        long longValue2 = A032.longValue();
        if (longValue > longValue2) {
            return false;
        }
        long j2 = longValue2 - longValue;
        C58516Pwk c58516Pwk = this.A02;
        if (c58516Pwk != null) {
            j = c58516Pwk.A02;
        } else {
            j = 0;
        }
        if (j2 < j) {
            return false;
        }
        return true;
    }

    public final long A04(C103804lz c103804lz) {
        long j;
        if (c103804lz.A03() == null) {
            return Long.MIN_VALUE;
        }
        long now = this.A0G.now();
        Long A03 = c103804lz.A03();
        if (A03 != null) {
            j = A03.longValue();
        } else {
            j = 0;
        }
        return now - j;
    }
}
