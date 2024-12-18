package X;

import androidx.activity.ComponentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class CND {
    public static boolean A00;

    public static final void A00(ComponentActivity componentActivity, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5) {
        boolean A1U = AbstractC167007dF.A1U(interfaceC16820sZ);
        C26864BtQ c26864BtQ = new C26864BtQ();
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0T = c26864BtQ;
        AbstractC25225BEi.A1Q(A0y, A1U);
        A0y.A0U = new C29385CxI(interfaceC16820sZ2, 7);
        A0y.A06 = componentActivity.getColor(AbstractC53242c7.A02(componentActivity));
        C189478aR A002 = A0y.A00();
        c26864BtQ.A00 = (C47Z) interfaceC16820sZ4.invoke();
        c26864BtQ.A01 = (String) interfaceC16820sZ5.invoke();
        c26864BtQ.A02 = new D8J(15, A002, interfaceC16820sZ);
        interfaceC16820sZ3.invoke();
        A002.A02(componentActivity, c26864BtQ);
    }
}
