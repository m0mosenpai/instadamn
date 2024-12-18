package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ey0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33898Ey0 {
    public static Object A00(C6FQ c6fq) {
        C62862tP A06 = C6BQ.A06(c6fq);
        AbstractC10360h2 A05 = C6BQ.A05(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        InterfaceC11380iw A08 = C6BQ.A08(c6fq);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        Fragment fragment = A06.A02;
        Fragment fragment2 = null;
        if (fragment != null) {
            fragment2 = fragment;
        }
        boolean A1X = AbstractC31177DnL.A1X(A0K);
        U7K u7k = U7H.A04;
        AbstractC31174DnI.A1N(new EV5(A04.getApplicationContext(), fragment2, A04, A05, A08, A0K, EnumC33353Eom.A05, AbstractC166987dD.A1E(), A1X));
        return null;
    }
}
