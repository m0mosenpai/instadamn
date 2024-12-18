package X;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.Map;

/* renamed from: X.DwA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31705DwA {
    public static final Handler A00 = AbstractC167007dF.A0J();

    public static C1GL A00(Fragment fragment, C1GL c1gl, String str, String str2) {
        if (!str.equals("long-live")) {
            if (fragment != null && !fragment.isAdded()) {
                C0w9.A03("bloks_stale_async_action", AnonymousClass001.A0g("Async action tried to schedule app ID ", str2, " but host is already detached."));
                return null;
            }
            return c1gl;
        }
        return new G08();
    }

    public static Object A01(C6FQ c6fq, C6FW c6fw) {
        String str;
        String str2 = (String) c6fw.A01();
        List list = c6fw.A00;
        Map map = (Map) list.get(1);
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 2);
        InterfaceC103384lE A0t2 = AbstractC25228BEl.A0t(list, 3);
        String str3 = "current-screen";
        if (list.size() <= 4) {
            str = "current-screen";
        } else {
            str = AbstractC31173DnH.A0s(list, 4);
        }
        C6BQ.A09(c6fq);
        if (str != null) {
            str3 = str;
        }
        C1GL A002 = A00(C6BQ.A02(c6fq), C6BQ.A0C(c6fq), str3, str2);
        if (A002 != null) {
            AbstractC192798gL A04 = C192108fB.A04(C6BQ.A0B(c6fq), str2, C6BQ.A0H(map));
            A04.A00(new C32389EOq(c6fq, A0t, A0t2, str2, 0));
            A002.schedule(A04);
        }
        return null;
    }
}
