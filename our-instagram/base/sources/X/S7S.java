package X;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class S7S {
    public static final S7S A00;

    static {
        Map unmodifiableMap = Collections.unmodifiableMap(AbstractC166987dD.A1G());
        if (unmodifiableMap != null) {
            A00 = new RP6(null, unmodifiableMap);
            return;
        }
        throw AbstractC166987dD.A15("Null splitInstallErrorCodeByModule");
    }
}
