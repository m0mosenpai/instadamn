package X;

import android.os.Handler;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41461vv {
    public final Handler A00;
    public final QuickPerformanceLogger A01;
    public final C41391vo A02;
    public final Integer A03;
    public final Map A04;
    public volatile boolean A05;

    public C41461vv(Handler handler, QuickPerformanceLogger quickPerformanceLogger, C41391vo c41391vo, Integer num) {
        C14360o3.A0B(quickPerformanceLogger, 2);
        this.A03 = num;
        this.A00 = handler;
        this.A04 = new HashMap();
        this.A01 = quickPerformanceLogger;
        this.A02 = c41391vo;
    }

    public final void A02(final C4AN c4an, final InterfaceC92004Ag interfaceC92004Ag, final String str, final long j) {
        C14360o3.A0B(c4an, 0);
        Runnable runnable = new Runnable() { // from class: X.4Ah
            @Override // java.lang.Runnable
            public final void run() {
                String str2;
                int hashCode;
                C41461vv c41461vv = this;
                C4AN c4an2 = c4an;
                String str3 = str;
                InterfaceC92004Ag interfaceC92004Ag2 = interfaceC92004Ag;
                long j2 = j;
                if (C41461vv.A01(c41461vv) && (str2 = c4an2.A0G) != null && (hashCode = str2.hashCode()) != -1) {
                    Map map = c41461vv.A04;
                    Integer valueOf = Integer.valueOf(hashCode);
                    if (map.containsKey(valueOf)) {
                        Object obj = map.get(valueOf);
                        C14360o3.A0A(obj);
                        if (!((java.util.Set) obj).contains(interfaceC92004Ag2)) {
                            c41461vv.A01.markerPoint(C4BG.A00(c41461vv.A03), hashCode, interfaceC92004Ag2.name(), str3, j2, TimeUnit.NANOSECONDS);
                            java.util.Set set = (java.util.Set) map.get(valueOf);
                            if (set != null) {
                                set.add(interfaceC92004Ag2);
                            }
                        }
                    }
                }
            }
        };
        if (!this.A05) {
            this.A00.post(runnable);
        }
    }

    public static final void A00(C41461vv c41461vv, int i, long j, short s) {
        if (!c41461vv.A05 && i != -1) {
            Map map = c41461vv.A04;
            Integer valueOf = Integer.valueOf(i);
            if (map.containsKey(valueOf)) {
                c41461vv.A01.markerEnd(C4BG.A00(c41461vv.A03), i, s, j, TimeUnit.NANOSECONDS);
                map.remove(valueOf);
            }
        }
    }

    public static final boolean A01(C41461vv c41461vv) {
        if (c41461vv.A05) {
            return false;
        }
        return true;
    }
}
