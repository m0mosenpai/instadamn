package X;

import android.content.Context;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ABA {
    public final InterfaceC19630xq A00;

    public final Integer A00(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC19630xq interfaceC19630xq = this.A00;
        if (!interfaceC19630xq.contains(str)) {
            return null;
        }
        return Integer.valueOf(interfaceC19630xq.getInt(str, 0));
    }

    public ABA(Context context) {
        Map map = C1FE.A09;
        this.A00 = new C1FF(context, "AuthHeaderPrefs").A00();
    }
}
