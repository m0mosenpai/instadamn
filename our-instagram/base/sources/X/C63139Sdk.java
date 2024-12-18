package X;

import com.facebook.react.bridge.WritableNativeMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Sdk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63139Sdk {
    public static final Map A02;
    public int A00 = -1;
    public final Q59 A01;

    static {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(23, "select");
        AbstractC58319PtB.A1H("select", A1G, 66);
        AbstractC58319PtB.A1H("select", A1G, 62);
        A1G.put(85, "playPause");
        A1G.put(89, "rewind");
        A1G.put(90, "fastForward");
        A1G.put(86, "stop");
        A1G.put(87, "next");
        A1G.put(88, "previous");
        A1G.put(19, "up");
        A1G.put(22, "right");
        A1G.put(20, "down");
        A1G.put(21, "left");
        A1G.put(165, "info");
        A1G.put(82, "menu");
        A02 = A1G;
    }

    public C63139Sdk(Q59 q59) {
        this.A01 = q59;
    }

    public static void A00(C63139Sdk c63139Sdk, String str, int i, int i2) {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        A0c.putString("eventType", str);
        A0c.putInt("eventKeyAction", i2);
        if (i != -1) {
            A0c.putInt("tag", i);
        }
        Q59 q59 = c63139Sdk.A01;
        if (q59.A05 != null) {
            q59.getCurrentReactContext().A0E("onHWKeyEvent", A0c);
        }
    }
}
