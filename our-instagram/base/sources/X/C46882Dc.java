package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* renamed from: X.2Dc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46882Dc {
    public final QuickPerformanceLogger A00;
    public final InterfaceC09390do A01;
    public final Object A02 = new Object();
    public final java.util.Set A03 = new LinkedHashSet();

    public final void A01() {
        synchronized (this.A02) {
            java.util.Set<C9BQ> set = this.A03;
            for (C9BQ c9bq : set) {
                if (c9bq != null) {
                    this.A00.markerAnnotate(c9bq.A01, c9bq.A02, TraceFieldType.FailureReason, "sqlite_db_failure");
                }
                this.A00.markerEnd(c9bq.A01, c9bq.A02, (short) 3);
            }
            set.clear();
        }
    }

    public static final C9BQ A00(C46882Dc c46882Dc, Integer num) {
        QuickPerformanceLogger quickPerformanceLogger;
        int i;
        String str;
        C9BQ c9bq = new C9BQ(num, 78266157, AbstractC50712Us.A01.A03(), 1);
        synchronized (c46882Dc.A02) {
            quickPerformanceLogger = c46882Dc.A00;
            i = c9bq.A02;
            quickPerformanceLogger.markerStart(78266157, i);
            c46882Dc.A03.add(c9bq);
        }
        if (num.intValue() != 0) {
            str = "THREAD_VIEW";
        } else {
            str = "INBOX";
        }
        quickPerformanceLogger.markerAnnotate(78266157, i, "request_surface", str);
        String str2 = (String) c46882Dc.A01.getValue();
        C14360o3.A0B(str2, 3);
        quickPerformanceLogger.markerAnnotate(78266157, i, "account_type", str2);
        C1KX c1kx = C226218q.A01(AbstractC12960li.A00).A05;
        if (c1kx != null) {
            String obj = c1kx.A0O.toString();
            C14360o3.A0B(obj, 3);
            quickPerformanceLogger.markerAnnotate(78266157, i, "app_startup_type", obj);
        }
        return c9bq;
    }

    public final void A02(C9BQ c9bq, short s) {
        if (c9bq != null) {
            synchronized (this.A02) {
                this.A03.remove(c9bq);
                this.A00.markerEnd(c9bq.A01, c9bq.A02, s);
            }
        }
    }

    public final void A03(Integer num) {
        String str;
        synchronized (this.A02) {
            for (C9BQ c9bq : this.A03) {
                QuickPerformanceLogger quickPerformanceLogger = this.A00;
                int i = c9bq.A01;
                int i2 = c9bq.A02;
                switch (num.intValue()) {
                    case 0:
                        str = "cache_warmup_start";
                        break;
                    case 1:
                        str = "cache_warmup_end";
                        break;
                    default:
                        str = "thread_data_loaded";
                        break;
                }
                quickPerformanceLogger.markerPoint(i, i2, str);
            }
        }
    }

    public C46882Dc(QuickPerformanceLogger quickPerformanceLogger, UserSession userSession) {
        this.A00 = quickPerformanceLogger;
        this.A01 = AbstractC09440dt.A01(new C9E1(userSession, 23));
    }
}
