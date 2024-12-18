package X;

import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class OXy {
    public static final void A01(View view, boolean z) {
        C14360o3.A0B(view, 0);
        if (z) {
            view.setAlpha(1.0f);
            AbstractC56932jR.A01(view);
        } else {
            view.setAlpha(0.5f);
            AbstractC010103p.A0B(view, new UEF(0));
        }
    }

    public static final ImageView A00(InterfaceC56362iU interfaceC56362iU, Integer num, InterfaceC16820sZ interfaceC16820sZ, int i) {
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A06 = AbstractC65916TwN.A01(num);
        A0B.A05 = AbstractC65916TwN.A00(num);
        A0B.A0G = ViewOnClickListenerC55455Ok9.A00(interfaceC16820sZ, 42);
        A0B.A02 = i;
        View AA9 = interfaceC56362iU.AA9(new C3LY(A0B));
        C14360o3.A0C(AA9, "null cannot be cast to non-null type android.widget.ImageView");
        return (ImageView) AA9;
    }

    public static final void A02(Fragment fragment, Fragment fragment2, UserSession userSession, OU0 ou0) {
        AbstractC167017dG.A1Q(userSession, ou0);
        C140966Yy A0C = AbstractC31175DnJ.A0C(fragment, userSession);
        A0C.A0D(fragment2);
        A0C.A0A(ou0.A00, ou0.A01, ou0.A02, ou0.A03);
        A0C.A04();
    }
}
