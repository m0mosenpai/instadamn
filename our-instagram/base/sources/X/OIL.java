package X;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes9.dex */
public final class OIL {
    public final InterfaceC57921PmR A00;
    public final Context A01;
    public final InterfaceC57920PmQ A02;

    public final void A00(C38321qM c38321qM, boolean z) {
        if (this.A02.BXj() == 100) {
            Context context = this.A01;
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            A0I.A0A(2131963581);
            Resources resources = context.getResources();
            int i = 2131963578;
            if (z) {
                i = 2131963577;
            }
            A0I.A0r(AbstractC43594JPz.A0t(resources, 100, i));
            int i2 = 2131963580;
            if (z) {
                i2 = 2131963579;
            }
            DialogInterfaceOnClickListenerC55321Ogj.A01(A0I, c38321qM, this, 1, i2);
            A0I.A06();
            AbstractC166987dD.A1W(A0I);
            return;
        }
        this.A00.D6v(c38321qM);
    }

    public OIL(Context context, InterfaceC57920PmQ interfaceC57920PmQ, InterfaceC57921PmR interfaceC57921PmR) {
        this.A02 = interfaceC57920PmQ;
        this.A00 = interfaceC57921PmR;
        this.A01 = context;
    }
}
