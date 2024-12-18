package X;

import android.view.View;

/* renamed from: X.IhK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41882IhK implements View.OnClickListener {
    public final /* synthetic */ C38525Gwl A00;

    public ViewOnClickListenerC41882IhK(C38525Gwl c38525Gwl) {
        this.A00 = c38525Gwl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IllegalStateException A14;
        int i;
        int A05 = C0f9.A05(-652656511);
        C38525Gwl c38525Gwl = this.A00;
        C75113Zb c75113Zb = c38525Gwl.A03;
        if (c75113Zb != null) {
            InterfaceC692739n interfaceC692739n = c38525Gwl.A02;
            if (interfaceC692739n != null) {
                c75113Zb.A1G = null;
                c75113Zb.A1F = null;
                C38321qM c38321qM = c38525Gwl.A01;
                if (c38321qM != null) {
                    interfaceC692739n.Dm3(c38321qM, c75113Zb, null, false, false);
                }
                C0f9.A0C(865515584, A05);
                return;
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -1962894716;
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 1080061472;
        }
        C0f9.A0C(i, A05);
        throw A14;
    }
}
