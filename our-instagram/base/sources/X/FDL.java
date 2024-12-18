package X;

import com.google.gson.Gson;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FDL {
    public static C1ON A00(AbstractC12990ll abstractC12990ll, String str, String str2, String str3, List list) {
        C25621Ms A0M = AbstractC31173DnH.A0M(abstractC12990ll);
        A0M.A0B("two_factor/check_trusted_notification_status/");
        A0M.A9s(AbstractC50532MSl.A01(247, 8, 59), str);
        A0M.A9s(AbstractC50532MSl.A01(0, 9, 53), str2);
        A0M.A0H(AbstractC50532MSl.A01(226, 21, 62), str3);
        if (list != null && !list.isEmpty()) {
            A0M.A9s("trusted_notification_polling_nonces", new Gson().A0B(list));
        }
        return AbstractC31172DnG.A0S(A0M, EDL.class, FYU.class);
    }
}
