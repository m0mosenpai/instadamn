package X;

import android.view.View;

/* renamed from: X.Oj4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55394Oj4 implements View.OnClickListener {
    public final /* synthetic */ InterfaceC55362gb A00;
    public final /* synthetic */ C4NJ A01;
    public final /* synthetic */ C81403kA A02;

    public ViewOnClickListenerC55394Oj4(InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, C81403kA c81403kA) {
        this.A02 = c81403kA;
        this.A00 = interfaceC55362gb;
        this.A01 = c4nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(167545135);
        this.A02.itemView.setVisibility(8);
        InterfaceC55362gb interfaceC55362gb = this.A00;
        if (interfaceC55362gb != null) {
            interfaceC55362gb.Dcp(this.A01);
        }
        C0f9.A0C(1401035318, A05);
    }
}
