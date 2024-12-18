package X;

import android.util.Pair;
import com.facebook.proxygen.HTTPRequestError;
import com.facebook.proxygen.RequestStats;
import com.facebook.proxygen.RequestStatsObserver;
import com.facebook.proxygen.TraceEvent;
import com.facebook.proxygen.TraceEventType;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Sc1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63079Sc1 {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r9 == X.C05F.A00) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.apache.http.client.methods.HttpUriRequest A00(X.C1QW r10, java.util.ArrayList r11) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63079Sc1.A00(X.1QW, java.util.ArrayList):org.apache.http.client.methods.HttpUriRequest");
    }

    public static void A01(HTTPRequestError hTTPRequestError, RequestStatsObserver requestStatsObserver, C1QW c1qw) {
        Map map = c1qw.A0A;
        if (map.get("ta_enabled") != null) {
            map.get("request_name");
            RequestStats requestStats = requestStatsObserver.getRequestStats();
            if (requestStats == null) {
                C21A.A00();
                return;
            }
            TraceEvent[] traceEventArr = requestStats.mEvents;
            int length = traceEventArr.length;
            for (int i = 0; i < length && !TraceEventType.TotalRequest.equals(traceEventArr[i].mName); i++) {
            }
            map.get("enqueue_time");
            HashMap A1G = AbstractC166987dD.A1G();
            String str = null;
            for (C23781El c23781El : c1qw.A01) {
                String str2 = c23781El.A00;
                if (str2.equals("Range")) {
                    str = c23781El.A01;
                } else if (C21A.A05.containsValue(str2)) {
                    A1G.put(c23781El.A00, c23781El.A01);
                }
            }
            Pair pair = new Pair(str, A1G);
            Object obj = pair.first;
            Map map2 = (Map) pair.second;
            Map flowTimeData = requestStats.getFlowTimeData();
            if (obj == null) {
                flowTimeData.get(TraceFieldType.RangeRequest);
            }
            flowTimeData.get("uri");
            if (hTTPRequestError == null) {
                flowTimeData.get(TraceFieldType.Error);
            }
            A02(TraceFieldType.RequestSendTime, flowTimeData);
            A02(TraceFieldType.TTFB, flowTimeData);
            A02(TraceFieldType.TTLB, flowTimeData);
            String A1A = AbstractC166987dD.A1A(TraceFieldType.LocalPort, flowTimeData);
            if (A1A != null) {
                try {
                    Integer.parseInt(A1A);
                } catch (NumberFormatException unused) {
                }
            }
            String A1A2 = AbstractC166987dD.A1A(MSV.A00(1549), flowTimeData);
            if (A1A2 != null) {
                try {
                    Integer.parseInt(A1A2);
                } catch (NumberFormatException unused2) {
                }
            }
            String A1A3 = AbstractC166987dD.A1A(TraceFieldType.ReqBodySize, flowTimeData);
            if (A1A3 != null) {
                try {
                    Integer.parseInt(A1A3);
                } catch (NumberFormatException unused3) {
                }
            }
            String A1A4 = AbstractC166987dD.A1A(MSV.A00(1553), flowTimeData);
            if (A1A4 != null) {
                try {
                    Integer.parseInt(A1A4);
                } catch (NumberFormatException unused4) {
                }
            }
            String A1A5 = AbstractC166987dD.A1A(MSV.A00(1552), flowTimeData);
            if (A1A5 != null) {
                try {
                    Integer.parseInt(A1A5);
                } catch (NumberFormatException unused5) {
                }
            }
            flowTimeData.get(TraceFieldType.NewSession);
            A02(TraceFieldType.ServerRtx, flowTimeData);
            A02(TraceFieldType.ServerUpstreamLatency, flowTimeData);
            A02(TraceFieldType.FirstBodyByteFlushed, flowTimeData);
            A02(TraceFieldType.LastBodyByteFlushed, flowTimeData);
            String A1A6 = AbstractC166987dD.A1A(TraceFieldType.StatusCode, flowTimeData);
            if (A1A6 != null) {
                try {
                    Integer.parseInt(A1A6);
                } catch (NumberFormatException unused6) {
                }
            }
            C21A.A01(new C74823Xv(null, map2));
        }
    }

    public static void A02(String str, Map map) {
        String A1A = AbstractC166987dD.A1A(str, map);
        if (A1A != null) {
            try {
                Long.parseLong(A1A);
            } catch (NumberFormatException unused) {
            }
        }
    }
}
