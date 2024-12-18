package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.99O, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C99O {
    public static C99O A04;
    public long A00;
    public final List A03 = new ArrayList();
    public String A01 = "unknown";
    public String A02 = "unknown";

    public final void A00(String str, List list, int i, boolean z) {
        List list2;
        boolean equals;
        List<C99M> list3 = this.A03;
        synchronized (list3) {
            for (C99M c99m : list3) {
                String str2 = this.A01;
                String str3 = this.A02;
                long j = this.A00;
                C99K c99k = c99m.A00;
                QuickPerformanceLogger quickPerformanceLogger = c99k.A04;
                if (quickPerformanceLogger.isMarkerOn(729361873)) {
                    synchronized (c99k) {
                        quickPerformanceLogger.markerAnnotate(729361873, "resolver_type", i);
                        quickPerformanceLogger.markerAnnotate(729361873, "time_ns_elapsed_since_last_update", j);
                        quickPerformanceLogger.markerAnnotate(729361873, "used_dialer", z);
                        quickPerformanceLogger.markerAnnotate(729361873, "dialer_resolver_type", str2);
                        quickPerformanceLogger.markerAnnotate(729361873, "last_dialer_refresh_resolver_type", str3);
                        quickPerformanceLogger.markerAnnotate(729361873, "is_background", C218914p.A08());
                        if (list != null) {
                            quickPerformanceLogger.markerAnnotate(729361873, "resolved_ips", list.toString());
                            quickPerformanceLogger.markerAnnotate(729361873, "resolved_ips_count", list.size());
                            if (list.equals(c99k.A01)) {
                                equals = false;
                                quickPerformanceLogger.markerAnnotate(729361873, "result_changed_from_last", false);
                            } else {
                                quickPerformanceLogger.markerAnnotate(729361873, "result_changed_from_last", true);
                                List A0Z = AbstractC001800i.A0Z(list);
                                List list4 = c99k.A01;
                                if (list4 != null) {
                                    list2 = AbstractC001800i.A0Z(list4);
                                } else {
                                    list2 = null;
                                }
                                equals = A0Z.equals(list2);
                            }
                            quickPerformanceLogger.markerAnnotate(729361873, "order_changed_from_last", equals);
                            quickPerformanceLogger.markerEnd(729361873, (short) 2);
                            c99k.A01 = list;
                        } else {
                            quickPerformanceLogger.markerAnnotate(729361873, "error_msg", str);
                            quickPerformanceLogger.markerEnd(729361873, (short) 3);
                        }
                    }
                }
                this.A01 = "unknown";
            }
        }
    }
}
