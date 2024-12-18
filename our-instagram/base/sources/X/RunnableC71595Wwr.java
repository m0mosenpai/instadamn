package X;

import android.util.ArrayMap;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Wwr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71595Wwr implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ WDD A02;
    public final /* synthetic */ String A03 = "";

    public RunnableC71595Wwr(WDD wdd, int i, long j) {
        this.A02 = wdd;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayMap arrayMap;
        int valueOf;
        Number number;
        WDD wdd = this.A02;
        int i = this.A00;
        long j = this.A01;
        if (wdd.A04) {
            Map map = wdd.A01;
            Integer valueOf2 = Integer.valueOf(i);
            if (map.get(valueOf2) == null) {
                map.put(valueOf2, new ArrayMap());
            }
            int i2 = 0;
            if (i != -1) {
                Map map2 = wdd.A02;
                if (!map2.containsKey(valueOf2)) {
                    wdd.A00.markerStart(1906462, i, j, TimeUnit.MILLISECONDS);
                    RunnableC71440Wu2 runnableC71440Wu2 = new RunnableC71440Wu2(wdd, i);
                    if (wdd.A04) {
                        C14270nr.A00().A01(new V62(runnableC71440Wu2), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                    }
                    map2.put(valueOf2, new HashSet());
                    if ("".length() != 0 && (arrayMap = (ArrayMap) map.get(valueOf2)) != null) {
                        valueOf = 1;
                        arrayMap.put("", valueOf);
                    }
                    return;
                }
            }
            if ("".length() == 0 || (arrayMap = (ArrayMap) map.get(valueOf2)) == null) {
                return;
            }
            ArrayMap arrayMap2 = (ArrayMap) map.get(valueOf2);
            if (arrayMap2 != null && (number = (Number) arrayMap2.get("")) != null) {
                i2 = number.intValue();
            }
            valueOf = Integer.valueOf(i2 + 1);
            arrayMap.put("", valueOf);
        }
    }
}
