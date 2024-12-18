package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: X.2MP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2MP {
    public final Executor A03;
    public final C09970fz A04;
    public final Map A02 = new HashMap();
    public final Queue A05 = new ConcurrentLinkedQueue();
    public File A00 = null;
    public boolean A01 = false;

    public static synchronized File A00(C2MP c2mp) {
        File file;
        synchronized (c2mp) {
            file = c2mp.A00;
            if (file == null) {
                file = new File(c2mp.A04.A01, "usage_log");
                c2mp.A00 = file;
            }
        }
        return file;
    }

    public static synchronized void A02(C2MP c2mp) {
        synchronized (c2mp) {
            if (A00(c2mp).exists() && !c2mp.A01) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(A00(c2mp))));
                    try {
                        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                            String[] split = readLine.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 2);
                            if (split.length == 2) {
                                String str = split[0];
                                String[] split2 = split[1].split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                                if (split2.length > 0) {
                                    for (String str2 : split2) {
                                        String[] split3 = str2.split(":");
                                        if (split3.length == 2) {
                                            c2mp.A03(str, split3[0], split3[1], false);
                                        }
                                    }
                                }
                            }
                        }
                        c2mp.A01 = true;
                        bufferedReader.close();
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0K8.A0G("LoggingMetadataStore", "Unable to read usage log", e);
                }
            }
        }
    }

    private synchronized void A03(String str, String str2, String str3, boolean z) {
        Map map = this.A02;
        if (!map.containsKey(str)) {
            map.put(str, new HashMap());
        }
        Map map2 = (Map) map.get(str);
        if (map2 != null && (z || !map2.containsKey(str2))) {
            map2.put(str2, str3);
        }
    }

    public static void A01(C2MP c2mp) {
        XM8 xm8;
        while (true) {
            Queue queue = c2mp.A05;
            if (!queue.isEmpty() && (xm8 = (XM8) queue.poll()) != null) {
                c2mp.A03(xm8.A00, xm8.A01, xm8.A02, true);
            } else {
                return;
            }
        }
    }

    public final void A05(String str, String str2, String str3) {
        XM8 xm8 = new XM8(str, str2, str3);
        Queue queue = this.A05;
        if (!queue.offer(xm8)) {
            C0K8.A0D("LoggingMetadataStore", "unable to add item to the queue, flushing");
            A01(this);
            queue.offer(xm8);
        }
    }

    public C2MP(C09970fz c09970fz, Executor executor) {
        this.A03 = executor;
        this.A04 = c09970fz;
    }

    public final String A04(String str, String str2) {
        A02(this);
        A01(this);
        Map map = this.A02;
        if (map.containsKey(str)) {
            Map map2 = (Map) map.get(str);
            if (map2.containsKey(str2)) {
                return (String) map2.get(str2);
            }
            return null;
        }
        return null;
    }
}
