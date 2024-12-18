package X;

import android.view.View;

/* renamed from: X.Ihv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41902Ihv implements View.OnClickListener {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C38525Gwl A01;

    public ViewOnClickListenerC41902Ihv(C38321qM c38321qM, C38525Gwl c38525Gwl) {
        this.A01 = c38525Gwl;
        this.A00 = c38321qM;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-389837202);
        InterfaceC692739n interfaceC692739n = this.A01.A02;
        if (interfaceC692739n != null) {
            interfaceC692739n.DB5(this.A00);
            C0f9.A0C(-396038284, A05);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0C(-665511989, A05);
            throw A0g;
        }
    }
}
