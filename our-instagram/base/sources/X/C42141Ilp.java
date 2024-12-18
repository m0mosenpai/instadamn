package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;

/* renamed from: X.Ilp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42141Ilp implements InterfaceC43433JGx {
    public CheckoutLaunchParams A00;
    public C41579IaS A01;

    @Override // X.InterfaceC43433JGx
    public final void AJD(Context context, InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkS(true);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A00();
        AbstractC31176DnK.A1C(new ViewOnClickListenerC42034Ik3(32, this, context), A0B, interfaceC56362iU);
        interfaceC56362iU.ESp(null, R.layout.blank_nav_bar, AbstractC53242c7.A0G(context, R.attr.actionBarStartSpacing), 0);
    }

    @Override // X.InterfaceC43433JGx
    public final void onDestroy() {
    }
}
