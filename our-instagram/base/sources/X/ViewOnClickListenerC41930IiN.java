package X;

import android.view.View;

/* renamed from: X.IiN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41930IiN implements View.OnClickListener {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C38525Gwl A01;
    public final /* synthetic */ C75113Zb A02;

    public ViewOnClickListenerC41930IiN(C38321qM c38321qM, C38525Gwl c38525Gwl, C75113Zb c75113Zb) {
        this.A01 = c38525Gwl;
        this.A00 = c38321qM;
        this.A02 = c75113Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(461148497);
        InterfaceC692739n interfaceC692739n = this.A01.A02;
        if (interfaceC692739n != null) {
            interfaceC692739n.Dm3(this.A00, this.A02, null, false, false);
            C0f9.A0C(-33039269, A05);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0C(1722217534, A05);
            throw A0g;
        }
    }
}
