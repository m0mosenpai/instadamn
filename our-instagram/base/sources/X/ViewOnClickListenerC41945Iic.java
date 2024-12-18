package X;

import android.view.View;

/* renamed from: X.Iic, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41945Iic implements View.OnClickListener {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C141596ac A01;
    public final /* synthetic */ InterfaceC144586fe A02;

    public ViewOnClickListenerC41945Iic(C38321qM c38321qM, C141596ac c141596ac, InterfaceC144586fe interfaceC144586fe) {
        this.A01 = c141596ac;
        this.A02 = interfaceC144586fe;
        this.A00 = c38321qM;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1008207444);
        C141596ac c141596ac = this.A01;
        if (!c141596ac.A0a) {
            c141596ac.A0a = true;
            this.A02.Cvd(this.A00);
        }
        C0f9.A0C(154548896, A05);
    }
}
