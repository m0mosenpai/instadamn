package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hxp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40507Hxp {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.HDN, androidx.fragment.app.Fragment, X.53Z] */
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        EnumC39532Hcz enumC39532Hcz;
        List list = c6fw.A00;
        if (list.size() == 2) {
            InterfaceC103384lE A00 = C1344465q.A00(list.get(0));
            C102884kP c102884kP = (C102884kP) list.get(1);
            if (A00 != null && c102884kP != null) {
                Context requireContext = C6BQ.A01(c6fq).requireContext();
                AbstractC10360h2 A05 = C6BQ.A05(c6fq);
                List A0O = c102884kP.A0O(35);
                String A0G = c102884kP.A0G();
                boolean A0U = c102884kP.A0U(false);
                if (!A0O.isEmpty()) {
                    FragmentActivity A04 = C6BQ.A04(c6fq);
                    ArrayList A0q = AbstractC25230BEn.A0q(A0O);
                    Iterator it = A0O.iterator();
                    while (it.hasNext()) {
                        String A1B = AbstractC166987dD.A1B(it);
                        if (!A1B.equals("feed_media")) {
                            if (A1B.equals("camera_roll")) {
                                enumC39532Hcz = EnumC39532Hcz.GALLERY;
                            }
                        } else {
                            enumC39532Hcz = EnumC39532Hcz.POSTS;
                        }
                        A0q.add(enumC39532Hcz);
                    }
                    IJU iju = new IJU(requireContext, A04, A05, c6fq, A00, A0U);
                    ?? c53z = new C53Z();
                    c53z.A00 = iju;
                    c53z.A02 = A0q;
                    c53z.A01 = A0G;
                    C140966Yy A0r = AbstractC25225BEi.A0r(A04, C6BQ.A0B(c6fq));
                    A0r.A0E = true;
                    A0r.A0E(c53z);
                    A0r.A04();
                }
            }
        }
        return null;
    }
}
