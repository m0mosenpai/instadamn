package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Aq4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24299Aq4 implements Runnable {
    public final /* synthetic */ C25481Mc A00;

    public RunnableC24299Aq4(C25481Mc c25481Mc) {
        this.A00 = c25481Mc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25481Mc c25481Mc = this.A00;
        C23131As A01 = c25481Mc.A01.A01();
        if (A01 == null) {
            c25481Mc.A03();
            return;
        }
        Iterator A14 = AbstractC166997dE.A14(c25481Mc.A02());
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            String str = (String) A1K.getKey();
            C1UV c1uv = (C1UV) A1K.getValue();
            if (!AbstractC25501Me.A01(c1uv, c25481Mc, str)) {
                C1B0 c1b0 = (C1B0) ((C1UW) c1uv).A00;
                if (!c1b0.A04) {
                    String str2 = "__invalid__";
                    String str3 = c1uv.A01.A00;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    if (!"__unknown__".equals(str2) && !str2.equals(A01.A01) && !str2.equals(A01.A00)) {
                        if (c1b0.A03) {
                            long j = c1uv.A00;
                            if (j >= 0 && System.currentTimeMillis() - j < 1209600000) {
                            }
                        }
                        c25481Mc.A04(str);
                    }
                }
            }
        }
    }
}
