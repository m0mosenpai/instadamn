package X;

import android.view.View;

/* renamed from: X.IiP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41932IiP implements View.OnClickListener {
    public final /* synthetic */ C4dV A00;
    public final /* synthetic */ C119835bh A01;
    public final /* synthetic */ C38525Gwl A02;

    public ViewOnClickListenerC41932IiP(C4dV c4dV, C119835bh c119835bh, C38525Gwl c38525Gwl) {
        this.A02 = c38525Gwl;
        this.A00 = c4dV;
        this.A01 = c119835bh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(443348905);
        InterfaceC692739n interfaceC692739n = this.A02.A02;
        if (interfaceC692739n != null) {
            interfaceC692739n.F97(this.A00, this.A01);
            C0f9.A0C(-1150218153, A05);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0C(1333789338, A05);
            throw A0g;
        }
    }
}
