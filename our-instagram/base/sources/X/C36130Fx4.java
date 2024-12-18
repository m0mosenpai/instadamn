package X;

import android.os.Bundle;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;

/* renamed from: X.Fx4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36130Fx4 implements InterfaceC41501vz {
    public final /* synthetic */ C32271EJg A00;

    public C36130Fx4(C32271EJg c32271EJg) {
        this.A00 = c32271EJg;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = C0f9.A03(568315871);
        C36050Fvm c36050Fvm = (C36050Fvm) obj;
        int A032 = C0f9.A03(867191998);
        C32271EJg c32271EJg = this.A00;
        Bundle bundle = c32271EJg.mArguments;
        if (bundle != null && bundle.getString(PaymentDetailChangeTypes$Companion.PHONE_NUMBER) != null && AbstractC31178DnM.A0d(c32271EJg, PaymentDetailChangeTypes$Companion.PHONE_NUMBER).equals(c36050Fvm.A02)) {
            c32271EJg.A07.getClass();
            AbstractC25651Mw.A00(c32271EJg.A07).E4s(new C3HS(c32271EJg.requireContext(), AbstractC03270Dk.A02(c32271EJg.A07), AbstractC31178DnM.A0d(c32271EJg, PaymentDetailChangeTypes$Companion.PHONE_NUMBER)));
            C53U c53u = (C53U) c32271EJg.getTargetFragment();
            if (c53u == null || !c53u.CK6()) {
                AbstractC25226BEj.A1Q(c32271EJg);
            }
            i = -1180807015;
        } else {
            i = 867291248;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-1126752921, A03);
    }
}
