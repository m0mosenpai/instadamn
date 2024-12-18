package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.29b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C459329b implements InterfaceC459429c {
    @Override // X.InterfaceC459429c
    public final void E1g(C4ST c4st, boolean z) {
        if (C41321vh.A04 != null) {
            C41531w2 c41531w2 = C41321vh.A04.A02;
            C14360o3.A0B(c4st, 0);
            if (!c41531w2.A03.get()) {
                QuickPerformanceLogger quickPerformanceLogger = c41531w2.A00;
                long currentMonotonicTimestampNanos = quickPerformanceLogger.currentMonotonicTimestampNanos();
                String str = c4st.A0A;
                int hashCode = str.hashCode();
                int A00 = C4BG.A00(c41531w2.A02);
                if (!quickPerformanceLogger.isMarkerOn(A00, hashCode)) {
                    LinkedHashMap A06 = AbstractC06930Yk.A06(new C09530e4("VIDEO_ID", str), new C09530e4("CONTAINER_MODULE", c4st.A08), new C09530e4("SUB_ORIGIN", c4st.A09), new C09530e4("IS_PLAYER_USED", Boolean.valueOf(z)));
                    quickPerformanceLogger.markerStart(A00, hashCode, currentMonotonicTimestampNanos, TimeUnit.NANOSECONDS);
                    C4BJ.A00(quickPerformanceLogger, A06, A00, hashCode);
                    quickPerformanceLogger.markerEnd(A00, hashCode, (short) 2);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("VideoQPL never initialized");
    }

    @Override // X.InterfaceC459429c
    public final void E1h(C4SS c4ss) {
        int hashCode;
        if (C41321vh.A04 != null) {
            C41511w0 c41511w0 = C41321vh.A04.A03;
            C14360o3.A0B(c4ss, 0);
            if (!c41511w0.A02) {
                QuickPerformanceLogger quickPerformanceLogger = c41511w0.A00;
                long currentMonotonicTimestampNanos = quickPerformanceLogger.currentMonotonicTimestampNanos();
                C4AN c4an = c4ss.A0K;
                String str = c4an.A0G;
                if (str == null) {
                    hashCode = -1;
                } else {
                    hashCode = str.hashCode();
                }
                int A00 = C4BG.A00(C41511w0.A03);
                if (!quickPerformanceLogger.isMarkerOn(A00, hashCode)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("VIDEO_ID", str);
                    hashMap.put("CONTAINER_MODULE", c4an.A0A);
                    hashMap.put("VIDEO_CODEC", c4an.A0F);
                    hashMap.put("FORMAT_TYPE", c4an.A07.name());
                    quickPerformanceLogger.markerStart(A00, hashCode, currentMonotonicTimestampNanos, TimeUnit.NANOSECONDS);
                    C4BJ.A00(quickPerformanceLogger, hashMap, A00, hashCode);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("VideoQPL never initialized");
    }

    @Override // X.InterfaceC459429c
    public final void E1i(C4SS c4ss) {
        int hashCode;
        if (C41321vh.A04 != null) {
            C41511w0 c41511w0 = C41321vh.A04.A03;
            C14360o3.A0B(c4ss, 0);
            if (!c41511w0.A02) {
                QuickPerformanceLogger quickPerformanceLogger = c41511w0.A00;
                long currentMonotonicTimestampNanos = quickPerformanceLogger.currentMonotonicTimestampNanos();
                String str = c4ss.A0K.A0G;
                if (str == null) {
                    hashCode = -1;
                } else {
                    hashCode = str.hashCode();
                }
                int A00 = C4BG.A00(C41511w0.A03);
                if (quickPerformanceLogger.isMarkerOn(A00, hashCode)) {
                    quickPerformanceLogger.markerEnd(A00, hashCode, (short) 2, currentMonotonicTimestampNanos, TimeUnit.NANOSECONDS);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("VideoQPL never initialized");
    }
}
