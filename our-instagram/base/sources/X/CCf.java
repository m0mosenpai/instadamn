package X;

import android.content.Context;

/* loaded from: classes5.dex */
public abstract class CCf {
    public static final void A00(Context context, C28484Chc c28484Chc, String str, InterfaceC16820sZ interfaceC16820sZ) {
        boolean A1U = AbstractC167007dF.A1U(c28484Chc);
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A0A(2131952801);
        c193328hC.A09(2131952800);
        c193328hC.A0J(new DialogInterfaceOnClickListenerC35451Fk8(c28484Chc, interfaceC16820sZ, str, A1U ? 1 : 0), 2131952799);
        c193328hC.A0D(new DialogInterfaceOnClickListenerC28563Civ(str, c28484Chc, A1U ? 1 : 0));
        c193328hC.A0s(A1U);
        AbstractC166987dD.A1W(c193328hC);
    }
}
