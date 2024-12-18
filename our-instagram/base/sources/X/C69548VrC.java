package X;

import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VrC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69548VrC {
    public final UserFlowLogger A00;
    public final Map A01;

    public C69548VrC(UserFlowLogger userFlowLogger) {
        C14360o3.A0B(userFlowLogger, 1);
        this.A00 = userFlowLogger;
        this.A01 = new LinkedHashMap();
    }

    public final void A00(String str, String str2) {
        Number number = (Number) this.A01.get(str);
        if (number != null) {
            this.A00.flowMarkPoint(number.longValue(), str2);
        }
    }
}
