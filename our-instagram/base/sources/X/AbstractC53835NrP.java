package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.NrP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53835NrP {
    public static final Object A00(C6FQ c6fq) {
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC12990ll A0J = AbstractC31175DnJ.A0J(c6fq);
        C140966Yy A0r = AbstractC25225BEi.A0r(A04, A0J);
        C14360o3.A0B(A0J, 0);
        N5U n5u = new N5U();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("Tracking.ENABLED", true);
        AbstractC03240Dh.A00(A0b, A0J);
        n5u.setArguments(A0b);
        A0r.A0B(null, n5u);
        A0r.A04();
        return null;
    }
}
