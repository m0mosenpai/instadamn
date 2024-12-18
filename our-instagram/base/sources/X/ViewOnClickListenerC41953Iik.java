package X;

import android.view.View;

/* renamed from: X.Iik, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41953Iik implements View.OnClickListener {
    public final /* synthetic */ C99134ca A00;
    public final /* synthetic */ C41047IFq A01;
    public final /* synthetic */ InterfaceC65002wy A02;

    public ViewOnClickListenerC41953Iik(C99134ca c99134ca, C41047IFq c41047IFq, InterfaceC65002wy interfaceC65002wy) {
        this.A02 = interfaceC65002wy;
        this.A00 = c99134ca;
        this.A01 = c41047IFq;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-907561513);
        InterfaceC65002wy interfaceC65002wy = this.A02;
        C99134ca c99134ca = this.A00;
        Integer num = this.A01.A01;
        if (num != null) {
            interfaceC65002wy.APi(c99134ca, num.intValue());
            C0f9.A0C(1813637171, A05);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0C(486147480, A05);
            throw A0g;
        }
    }
}
