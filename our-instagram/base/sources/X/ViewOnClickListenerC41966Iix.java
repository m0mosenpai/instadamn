package X;

import android.view.View;

/* renamed from: X.Iix, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41966Iix implements View.OnClickListener {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C38525Gwl A01;
    public final /* synthetic */ C75113Zb A02;
    public final /* synthetic */ String A03;

    public ViewOnClickListenerC41966Iix(C38321qM c38321qM, C38525Gwl c38525Gwl, C75113Zb c75113Zb, String str) {
        this.A01 = c38525Gwl;
        this.A00 = c38321qM;
        this.A02 = c75113Zb;
        this.A03 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1244920840);
        C38525Gwl c38525Gwl = this.A01;
        InterfaceC692739n interfaceC692739n = c38525Gwl.A02;
        if (interfaceC692739n != null) {
            C38321qM c38321qM = this.A00;
            String id = c38321qM.getId();
            if (id == null) {
                id = "";
            }
            String CAR = c38321qM.CAR();
            C75113Zb c75113Zb = this.A02;
            int position = c75113Zb.getPosition();
            String str = this.A03;
            interfaceC692739n.Dth(c38321qM.B5n(), c38321qM, id, CAR, str, null, null, c75113Zb.A1U, -1, position, true, AbstractC167007dF.A1X(c75113Zb.A0m, EnumC75193Zm.A05), false);
            c75113Zb.A1G = str;
            C693539v.A05(c38321qM, c38525Gwl, c75113Zb);
            C0f9.A0C(-1641191853, A05);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0C(-1732578323, A05);
        throw A0g;
    }
}
