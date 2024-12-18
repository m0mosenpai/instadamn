package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.21A, reason: invalid class name */
/* loaded from: classes.dex */
public final class C21A {
    public static C21A A04 = new C21A();
    public static final Map A05;
    public List A01 = new ArrayList();
    public final List A02 = new ArrayList();
    public int A00 = 0;
    public final AtomicBoolean A03 = new AtomicBoolean(false);

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("drawee_request_id", "drawee_request_id");
        hashMap.put("videoId", "video_id");
        hashMap.put(TraceFieldType.Bitrate, "video_bitrate");
        hashMap.put("streamType", "video_stream_type");
        hashMap.put("startMs", "video_start_ms");
        hashMap.put("durationMs", "video_duration_ms");
        hashMap.put("bufferDurationMs", "bufferDurationMs");
        hashMap.put("isPrefetch", "video_is_prefetch");
        hashMap.put("rlrInKbps", "rlr_in_kbps");
        hashMap.put("videoRequestType", "video_request_type");
        A05 = Collections.unmodifiableMap(hashMap);
    }

    public static synchronized void A00() {
        synchronized (C21A.class) {
            A04.A00++;
        }
    }

    public static synchronized void A01(C74823Xv c74823Xv) {
        synchronized (C21A.class) {
            C21A c21a = A04;
            c21a.A01.add(c74823Xv);
            if (c21a.A03.get()) {
                Iterator it = c21a.A02.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw new NullPointerException("requestResponseInfoAdded");
                }
            }
        }
    }

    public static boolean A02() {
        return A04.A03.get();
    }
}
