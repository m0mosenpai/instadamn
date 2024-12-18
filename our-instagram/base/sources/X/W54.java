package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W54 {
    public long A00;
    public Long A01;
    public final XC1 A02;
    public final C68920VeK A03;
    public final Map A04;

    public W54(XC1 xc1, C68920VeK c68920VeK, Map map) {
        C14360o3.A0B(xc1, 2);
        this.A03 = c68920VeK;
        this.A04 = new HashMap();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                this.A04.put(key, value);
            }
        }
        this.A02 = xc1;
    }

    public final void A01() {
        this.A00 = this.A02.now();
        A00(this, null, "media_upload_start", null, -1L);
        C68920VeK c68920VeK = this.A03;
        if (c68920VeK != null) {
            UserFlowLogger userFlowLogger = c68920VeK.A01;
            long generateNewFlowId = userFlowLogger.generateNewFlowId(c68920VeK.A00);
            this.A01 = Long.valueOf(generateNewFlowId);
            Map map = this.A04;
            String str = (String) map.get("source_type");
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = (String) map.get("waterfall_id");
            if (str3 == null) {
                str3 = "";
            }
            String str4 = (String) map.get("asset_id");
            if (str4 != null) {
                str2 = str4;
            }
            userFlowLogger.flowStart(generateNewFlowId, str, false);
            userFlowLogger.flowAnnotateWithCrucialData(generateNewFlowId, "waterfall_id", str3);
            userFlowLogger.flowAnnotate(generateNewFlowId, "asset_id", str2);
        }
    }

    public final void A02(Exception exc) {
        A00(this, exc, "media_upload_failure", null, this.A02.now() - this.A00);
        Long l = this.A01;
        if (l != null) {
            long longValue = l.longValue();
            C68920VeK c68920VeK = this.A03;
            if (c68920VeK != null) {
                String stackTraceString = android.util.Log.getStackTraceString(exc);
                C14360o3.A0A(stackTraceString);
                C14360o3.A0B(stackTraceString, 2);
                UserFlowLogger userFlowLogger = c68920VeK.A01;
                userFlowLogger.flowAnnotate(longValue, TraceFieldType.Error, stackTraceString);
                String valueOf = String.valueOf(exc);
                C14360o3.A0B(valueOf, 1);
                userFlowLogger.flowEndFail(longValue, valueOf, null);
            }
        }
    }

    public static final void A00(W54 w54, Exception exc, String str, Map map, long j) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(w54.A04);
        if (exc != null) {
            hashMap.put("error", exc.toString());
            String stackTraceString = android.util.Log.getStackTraceString(exc);
            C14360o3.A0A(stackTraceString);
            hashMap.put(TraceFieldType.Error, stackTraceString);
        }
        if (j >= 0) {
            String valueOf = String.valueOf(j);
            hashMap.put("elapsed_time", valueOf);
            hashMap.put("dt", valueOf);
        }
        if (map != null) {
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    hashMap.put(key, value);
                }
            }
        }
        Object obj = hashMap.get("orig_video_codec");
        if (obj != null) {
            hashMap.put("source_video_codec", obj);
        }
        w54.A02.logEvent(str, hashMap);
    }
}
