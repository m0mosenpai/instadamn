package X;

import com.facebook.react.bridge.ReactMarker;

/* renamed from: X.SJo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62631SJo {
    public final String A00(InterfaceC65351Tif interfaceC65351Tif) {
        boolean containsKey;
        if (this instanceof R3D) {
            String str = ((R3D) this).A00;
            interfaceC65351Tif.loadScriptFromFile(str, "Ig4aBundle.js.hbc", false);
            return str;
        }
        R3E r3e = (R3E) this;
        synchronized (r3e) {
            if (r3e.A00 != null) {
                ReactMarker.logMarker(RhX.A1p);
                C03220Df c03220Df = r3e.A00;
                C0EA c0ea = C03220Df.A06;
                String str2 = c03220Df.A03;
                synchronized (c0ea) {
                    containsKey = c0ea.A00.containsKey(str2);
                }
                if (containsKey) {
                    ReactMarker.logMarker(RhX.A1n);
                }
                if (r3e.A00.A03()) {
                    ReactMarker.logMarker(RhX.A1q);
                }
                ReactMarker.logMarker(RhX.A1o);
                r3e.A00 = null;
            }
        }
        return r3e.A01.A00(interfaceC65351Tif);
    }
}
