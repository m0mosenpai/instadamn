package X;

import android.content.Context;
import android.os.Build;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* renamed from: X.03g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C009203g implements C0LR {
    public static final C009203g A01 = new C009203g();
    public final Random A00 = new Random();

    public final synchronized void A00(Context context, String str, String str2, int i, boolean z) {
        C19340xJ c19340xJ;
        try {
            C0L9 A00 = C0L9.A00();
            synchronized (A00) {
                c19340xJ = A00.A01;
            }
            if (c19340xJ == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("BBType", str2);
                hashMap.put("PreviousSessionId", str);
                C0PC.A00().DEh("BBAPINull", null, hashMap);
            } else if (C09170dP.A0A()) {
                if (z || this.A00.nextInt(10000) < 0) {
                    int i2 = Build.VERSION.SDK_INT;
                    int i3 = 0;
                    if (i2 >= 30) {
                        i3 = 2;
                    }
                    String[] strArr = new String[i3 + 2];
                    strArr[0] = "is_fad_v2";
                    strArr[1] = Boolean.toString(z);
                    if (i2 >= 30) {
                        strArr[2] = "exit_info_reason";
                        strArr[3] = Integer.toString(i);
                    }
                    ArrayList A002 = C06320Uy.A00(context, str, str2, strArr);
                    if (!A002.isEmpty()) {
                        HashMap hashMap2 = new HashMap();
                        StringBuilder sb = new StringBuilder();
                        Iterator it = A002.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                } else {
                                    sb.append((CharSequence) InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                                }
                            }
                        }
                        hashMap2.put("black_box_trace", sb.toString());
                        C0L9 A003 = C0L9.A00();
                        synchronized (A003) {
                            A003.A02 = hashMap2;
                        }
                    }
                }
            } else {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("BBType", str2);
                hashMap3.put("PreviousSessionId", str);
                C0PC.A00().DEh("BBNoSO", null, hashMap3);
            }
        } catch (IllegalStateException | UnsatisfiedLinkError e) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("BBType", str2);
            hashMap4.put("PreviousSessionId", str);
            C0PC.A00().DEh("BBCollectErr", e, hashMap4);
            C0K8.A0H("lacrima", "Black box collection failed", e);
        }
    }

    @Override // X.C0LR
    public final synchronized void E4h(C024209q c024209q, C0M6 c0m6) {
        Map map;
        C0L9 A00 = C0L9.A00();
        synchronized (A00) {
            map = A00.A02;
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c024209q.A05((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A02;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }
}
