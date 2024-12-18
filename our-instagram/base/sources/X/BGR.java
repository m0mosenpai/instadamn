package X;

import androidx.compose.ui.Modifier;
import com.instagram.compose.ui.pulltorefresh.PullRefreshNestedScrollConnection;

/* loaded from: classes5.dex */
public abstract class BGR {
    public static final Modifier A00(Modifier modifier, C25246BFf c25246BFf) {
        AbstractC167017dG.A1N(modifier, c25246BFf);
        InterfaceC16660sJ interfaceC16660sJ = C5XU.A00;
        C1130158n c1130158n = Modifier.A00;
        BGK bgk = new BGK(c25246BFf, 47);
        PYX pyx = new PYX(c25246BFf, null, 6);
        C14360o3.A0B(c1130158n, 0);
        Modifier A0V = AbstractC25229BEm.A0V(c1130158n, new PullRefreshNestedScrollConnection(bgk, pyx), null);
        C118685Yk c118685Yk = new C118685Yk(interfaceC16660sJ);
        Modifier Eq3 = c1130158n.Eq3(c118685Yk).Eq3(A0V).Eq3(c118685Yk.A00);
        C118685Yk c118685Yk2 = new C118685Yk(interfaceC16660sJ);
        return modifier.Eq3(c118685Yk2).Eq3(Eq3).Eq3(c118685Yk2.A00);
    }
}
