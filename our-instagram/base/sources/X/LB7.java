package X;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class LB7 {
    public static final C0eB A00(C6FQ c6fq, C6FW c6fw) {
        boolean z = false;
        Object A03 = c6fw.A03(0);
        AbstractC25225BEi.A1S(A03);
        String str = (String) A03;
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 1);
        if (c6fq.A03 != null) {
            if (str.length() == 0) {
                C6FX A0s = AbstractC25225BEi.A0s();
                A0s.A03(1, 0);
                AbstractC25227BEk.A1M(c6fq, A0s, A0I);
            } else {
                UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
                FragmentActivity A04 = C6BQ.A04(c6fq);
                FragmentActivity A042 = C6BQ.A04(c6fq);
                if (Build.VERSION.SDK_INT >= 33) {
                    z = true;
                }
                boolean A07 = AbstractC23451Ch.A07(A04, "android.permission.WRITE_EXTERNAL_STORAGE");
                if (!z && !A07) {
                    AbstractC43592JPx.A1C(A04, new C48291LYp(2, new MHW(c6fq, A0I, 37), new MEC(A0I, c6fq, userSession, A042, str, 1)), "android.permission.WRITE_EXTERNAL_STORAGE");
                    return C0eB.A00;
                }
                A01(A042, c6fq, A0I, userSession, str);
                return null;
            }
        }
        return null;
    }

    public static final void A01(Context context, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, UserSession userSession, String str) {
        C121275eQ A04 = AbstractC50633MWu.A04(context, userSession, new OUQ(str, "image url", false, false, false), -1L, true);
        A04.A00 = new HJ2(0, context, c6fq, interfaceC103384lE);
        C1GJ.A04(A04, 15);
    }
}
