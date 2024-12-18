package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.IjL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41990IjL implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C3G2 A02;
    public final /* synthetic */ C55909Os0 A03;
    public final /* synthetic */ InterfaceC1118853a A04;

    public ViewOnClickListenerC41990IjL(Context context, C41181vS c41181vS, C3G2 c3g2, C55909Os0 c55909Os0, InterfaceC1118853a interfaceC1118853a) {
        this.A00 = context;
        this.A03 = c55909Os0;
        this.A01 = c41181vS;
        this.A04 = interfaceC1118853a;
        this.A02 = c3g2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(798133033);
        Context context = this.A00;
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131974957);
        A0I.A09(2131974953);
        C55909Os0 c55909Os0 = this.A03;
        C41181vS c41181vS = this.A01;
        InterfaceC1118853a interfaceC1118853a = this.A04;
        A0I.A0M(new DialogInterfaceOnClickListenerC41813IfT(1, context, interfaceC1118853a, c41181vS, c55909Os0, this.A02), 2131957640);
        A0I.A0D(DialogInterfaceOnClickListenerC41836Ifq.A00(interfaceC1118853a, 23));
        AbstractC31178DnM.A1R(A0I, false);
        C0f9.A0C(1462537757, A05);
    }
}
