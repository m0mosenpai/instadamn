package X;

import android.view.View;

/* renamed from: X.IiO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41931IiO implements View.OnClickListener {
    public final /* synthetic */ C42521Is0 A00;
    public final /* synthetic */ C42662IuJ A01;
    public final /* synthetic */ C38525Gwl A02;

    public ViewOnClickListenerC41931IiO(C42521Is0 c42521Is0, C42662IuJ c42662IuJ, C38525Gwl c38525Gwl) {
        this.A02 = c38525Gwl;
        this.A00 = c42521Is0;
        this.A01 = c42662IuJ;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1218327404);
        InterfaceC692739n interfaceC692739n = this.A02.A02;
        if (interfaceC692739n != null) {
            interfaceC692739n.F96(this.A00, this.A01);
            C0f9.A0C(1831687054, A05);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0C(456450342, A05);
            throw A0g;
        }
    }
}
