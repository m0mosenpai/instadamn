package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Ez5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33964Ez5 {
    public static final Object A00(C6FQ c6fq) {
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC12990ll A0J = AbstractC31175DnJ.A0J(c6fq);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("IS_SIGN_UP_FLOW", false);
        C140966Yy A0P = AbstractC31173DnH.A0P(A04, A0J);
        AbstractC31172DnG.A1A();
        C32269EJe c32269EJe = new C32269EJe();
        c32269EJe.setArguments(A0b);
        return AbstractC31180DnO.A0X(c32269EJe, A0P);
    }
}
