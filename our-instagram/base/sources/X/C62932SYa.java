package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.SYa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62932SYa {
    public static final C62932SYa $redex_init_class = null;
    public final long A00;
    public final android.net.Uri A01;
    public final Map A02;

    static {
        C63102Sd5.A00("media3.datasource");
    }

    public C62932SYa(android.net.Uri uri, Map map, long j) {
        WDn.A01(MSY.A1R((j > 0L ? 1 : (j == 0L ? 0 : -1))));
        WDn.A01(MSY.A1R((j > 0L ? 1 : (j == 0L ? 0 : -1))));
        this.A01 = uri;
        this.A02 = Collections.unmodifiableMap(AbstractC58318PtA.A10(map));
        this.A00 = j;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DataSpec[");
        A1C.append("GET");
        A1C.append(" ");
        A1C.append(this.A01);
        A1C.append(", ");
        A1C.append(this.A00);
        A1C.append(", ");
        A1C.append(-1L);
        A1C.append(", ");
        A1C.append((String) null);
        A1C.append(", ");
        A1C.append(6);
        return AbstractC58319PtB.A0w(A1C);
    }
}
