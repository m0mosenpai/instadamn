package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.F2r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34089F2r {
    public static final C189478aR A00(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(userSession, 0);
        String A0p = AbstractC166997dE.A0p(fragmentActivity, 2131959112);
        C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
        c189458aP.A06 = fragmentActivity.getString(2131954754);
        c189458aP.A05 = new ViewOnClickListenerC35680FpF(interfaceC16820sZ, 21);
        C189468aQ A00 = c189458aP.A00();
        C189458aP c189458aP2 = new C189458aP(null, null, "", 0, 0);
        c189458aP2.A06 = fragmentActivity.getString(2131961124);
        c189458aP2.A05 = new ViewOnClickListenerC35680FpF(interfaceC16820sZ2, 22);
        C189468aQ A002 = c189458aP2.A00();
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A17 = true;
        A0y.A0d = A0p;
        A0y.A06(A00);
        A0y.A07(A002);
        A0y.A0k = false;
        return A0y.A00();
    }
}
