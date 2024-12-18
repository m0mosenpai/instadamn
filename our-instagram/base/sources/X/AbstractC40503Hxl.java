package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.intf.DiscoveryChainingConfig;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import java.util.List;

/* renamed from: X.Hxl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40503Hxl {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String string;
        String str;
        int i;
        boolean z;
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 1);
        Object obj = list.get(2);
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Number");
        int A0H = AbstractC166987dD.A0H(obj);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        if (list.size() > 3) {
            string = AbstractC31173DnH.A0s(list, 3);
        } else {
            string = A04.getString(2131966136);
        }
        if (list.size() <= 4) {
            str = "";
        } else {
            str = AbstractC31173DnH.A0s(list, 4);
        }
        if (list.size() > 5) {
            Object obj2 = list.get(5);
            C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.Number");
            i = AbstractC166987dD.A0H(obj2);
        } else {
            i = 0;
        }
        String str2 = (String) AbstractC001900j.A0R(A0e, new String[]{"_"}, 0).get(0);
        if (A0s == null) {
            A0s = "";
        }
        C14360o3.A0B(str2, 1);
        EnumC39592He2 enumC39592He2 = EnumC39592He2.A07;
        int A00 = AbstractC37302Gc3.A00();
        if (A00 != 0) {
            if (A00 == 3) {
                z = true;
            } else {
                throw AbstractC166987dD.A12("All channel-related arguments must be provided");
            }
        } else {
            z = false;
        }
        DiscoveryChainingItem discoveryChainingItem = new DiscoveryChainingItem(enumC39592He2, null, null, null, str2, A0s, null, null, null, null, null, null, null, null, null, null, null, null, null, A0H, z);
        if (string == null) {
            string = AbstractC166997dE.A0p(A04, 2131966136);
        }
        DiscoveryChainingConfig discoveryChainingConfig = new DiscoveryChainingConfig(null, discoveryChainingItem, null, null, Integer.valueOf(i), string, "nudge_chaining", "", "", null, null, null, null, null, str, null, C16910sj.A00, true, true, false, false, false, false, true, true, false, false, false);
        C140966Yy A002 = AbstractC40628Hzm.A00(A04, A0W);
        A002.A0B(null, AbstractC40602HzM.A00(discoveryChainingConfig));
        A002.A04();
        return null;
    }
}
