package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class S4B {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP c102884kP;
        List list = c6fw.A00;
        if (list.size() == 2 && (c102884kP = (C102884kP) AbstractC166987dD.A16(list)) != null) {
            Fragment A01 = C6BQ.A01(c6fq);
            Context requireContext = A01.requireContext();
            InterfaceC103384lE A0B = c102884kP.A0B(41);
            InterfaceC103384lE A09 = c102884kP.A09();
            String A0H = c102884kP.A0H();
            if (A0H != null && !A0H.equals(AbstractC43591JPw.A00(474))) {
                C62908SWp c62908SWp = new C62908SWp(requireContext, A01, new C62557SGi(c6fq, A09, A0B), c6fq);
                Context context = c62908SWp.A02;
                if (AbstractC93174Ft.A03(context)) {
                    C62908SWp.A00(c62908SWp);
                } else {
                    AbstractC93174Ft.A01((Activity) context, new C44325JiI(c62908SWp, 9));
                    return null;
                }
            } else {
                C62918SWz c62918SWz = new C62918SWz(requireContext, A01, new C62558SGj(c6fq, A09, A0B), c6fq);
                AbstractC12990ll A0J = AbstractC31175DnJ.A0J(c6fq);
                Context context2 = c62918SWz.A03;
                if (AbstractC23451Ch.A07(context2, "android.permission.CAMERA")) {
                    C62918SWz.A00(c62918SWz);
                    return null;
                }
                AbstractC43592JPx.A1C((Activity) context2, new C48291LYp(8, c62918SWz, A0J), "android.permission.CAMERA");
                return null;
            }
        }
        return null;
    }
}
