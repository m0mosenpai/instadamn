package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class L6M {
    public final /* synthetic */ C48259LXi A00;

    public L6M(C48259LXi c48259LXi) {
        this.A00 = c48259LXi;
    }

    public final void A00(String str, String str2, String str3) {
        DirectThreadKey A02;
        C48259LXi c48259LXi = this.A00;
        if (!c48259LXi.A0I) {
            MRL mrl = c48259LXi.A0E;
            if (mrl != null) {
                C3o9 c3o9 = c48259LXi.A0U;
                boolean z = false;
                if (c3o9 instanceof MsysThreadId) {
                    z = c48259LXi.A0X;
                } else if ((c3o9 instanceof DirectThreadKey) && (A02 = JRE.A02(c3o9)) != null && A02.A00 != null) {
                    C2DS A00 = AbstractC28761aE.A00(c48259LXi.A0P);
                    String str4 = A02.A00;
                    C14360o3.A0B(str4, 0);
                    C81663kb A0N = ((C2DU) A00).A0N(str4);
                    if (A0N != null && A0N.CVQ()) {
                        z = true;
                    }
                }
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put(AbstractC111324zv.A00(2620), Boolean.valueOf(c48259LXi.A0a));
                A1G.put("is_vm", Boolean.valueOf(c48259LXi.A0Y));
                A1G.put(AbstractC111324zv.A00(2621), Boolean.valueOf(c48259LXi.A0b));
                HashMap A1G2 = AbstractC166987dD.A1G();
                A1G2.put("ephemeral_lifetime_ms", c48259LXi.A0S.A0C);
                mrl.CJp(c48259LXi.A0T, c3o9, str, str2, str3, A1G, A1G2, z);
            }
            C48259LXi.A03(c48259LXi);
        }
    }
}
