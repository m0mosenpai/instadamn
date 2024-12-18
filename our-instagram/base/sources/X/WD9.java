package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class WD9 {
    public C69349Vlv A00;
    public List A01;
    public boolean A02;
    public final Context A03;
    public final UserSession A04;
    public final C7YN A05;
    public final C68750VbT A06;
    public final C33629Etf A07;
    public final Fragment A08;
    public final C25671My A09;
    public final InterfaceC41501vz A0A;
    public final InterfaceC37153GYq A0B;
    public final C2DS A0C;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.Etf] */
    public WD9(Fragment fragment, UserSession userSession, C7YN c7yn) {
        C14360o3.A0B(c7yn, 3);
        this.A04 = userSession;
        this.A08 = fragment;
        this.A05 = c7yn;
        C67858Uzp c67858Uzp = new C67858Uzp();
        ?? obj = new Object();
        obj.A00 = fragment;
        obj.A01 = c67858Uzp;
        this.A07 = obj;
        this.A03 = fragment.requireContext();
        this.A0C = AbstractC28761aE.A00(userSession);
        this.A09 = AbstractC25651Mw.A00(userSession);
        this.A0B = new WjG(this);
        this.A06 = new C68750VbT(this);
        this.A0A = new C70723Wfo(this, 10);
    }

    public final void A02(List list) {
        String C7I;
        C2DS c2ds = this.A0C;
        C2DU c2du = (C2DU) c2ds;
        if (!c2du.A0H.A0F) {
            this.A01 = list;
            this.A09.A01(this.A0A, C2Im.class);
            this.A07.A01();
            c2ds.CoR(false, "StartCall");
            return;
        }
        this.A01 = null;
        this.A09.A02(this.A0A, C2Im.class);
        C81663kb A03 = C2DU.A03(c2du, new DirectThreadKey(null, new ArrayList(list)));
        if (A03 != null && (C7I = A03.C7I()) != null) {
            this.A07.A00();
            this.A05.En8(C7I);
        } else {
            this.A02 = true;
            this.A07.A01();
            F20.A00(this.A04, this.A0B, list, false);
        }
    }

    public static final void A00(WD9 wd9) {
        C69349Vlv c69349Vlv = wd9.A00;
        if (c69349Vlv != null) {
            AbstractC25651Mw.A00(c69349Vlv.A02).A02(c69349Vlv.A01, C2Io.class);
            c69349Vlv.A00.removeCallbacksAndMessages(null);
        }
        wd9.A00 = null;
    }

    public static final void A01(WD9 wd9, String str) {
        FragmentActivity activity = wd9.A08.getActivity();
        if (activity != null && !activity.isFinishing()) {
            C193328hC c193328hC = new C193328hC(wd9.A03);
            c193328hC.A0A(2131976812);
            c193328hC.A0r(str);
            c193328hC.A07();
            AbstractC166987dD.A1W(c193328hC);
        }
    }
}
