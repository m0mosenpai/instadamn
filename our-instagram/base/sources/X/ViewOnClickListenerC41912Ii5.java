package X;

import android.view.View;

/* renamed from: X.Ii5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41912Ii5 implements View.OnClickListener {
    public final /* synthetic */ InterfaceC1816483t A00;
    public final /* synthetic */ InterfaceC144586fe A01;

    public ViewOnClickListenerC41912Ii5(InterfaceC1816483t interfaceC1816483t, InterfaceC144586fe interfaceC144586fe) {
        this.A01 = interfaceC144586fe;
        this.A00 = interfaceC1816483t;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1631544788);
        InterfaceC144586fe interfaceC144586fe = this.A01;
        InterfaceC1816483t interfaceC1816483t = this.A00;
        interfaceC144586fe.D1g(interfaceC1816483t.BAt(), interfaceC1816483t.getName());
        C0f9.A0C(1840308160, A05);
    }
}
