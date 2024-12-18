package X;

import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WVE implements XC1 {
    public final XC1 A00;

    @Override // X.XC1
    public final long now() {
        return this.A00.now();
    }

    public WVE(XC1 xc1) {
        this.A00 = xc1;
    }

    @Override // X.XC1
    public final void logEvent(String str, Map map) {
        LinkedHashMap A03 = AbstractC06930Yk.A03(map);
        A03.put("process_id", String.valueOf(Process.myPid()));
        this.A00.logEvent(str, A03);
    }
}
