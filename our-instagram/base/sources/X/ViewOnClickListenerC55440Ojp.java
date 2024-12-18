package X;

import android.content.DialogInterface;
import android.view.View;

/* renamed from: X.Ojp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55440Ojp implements View.OnClickListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ InterfaceC57975PnL A02;
    public final /* synthetic */ InterfaceC57976PnM A03;
    public final /* synthetic */ InterfaceC145276gm A04;
    public final /* synthetic */ InterfaceC146916jT A05;
    public final /* synthetic */ InterfaceC57977PnN A06;
    public final /* synthetic */ InterfaceC57980PnQ A07;
    public final /* synthetic */ C55908Orz A08;
    public final /* synthetic */ C145326gr A09;
    public final /* synthetic */ C145256gk A0A;
    public final /* synthetic */ C145246gj A0B;
    public final /* synthetic */ C09530e4 A0C;

    public ViewOnClickListenerC55440Ojp(DialogInterface.OnDismissListener onDismissListener, InterfaceC11380iw interfaceC11380iw, InterfaceC57975PnL interfaceC57975PnL, InterfaceC57976PnM interfaceC57976PnM, InterfaceC145276gm interfaceC145276gm, InterfaceC146916jT interfaceC146916jT, InterfaceC57977PnN interfaceC57977PnN, InterfaceC57980PnQ interfaceC57980PnQ, C55908Orz c55908Orz, C145326gr c145326gr, C145256gk c145256gk, C145246gj c145246gj, C09530e4 c09530e4) {
        this.A08 = c55908Orz;
        this.A0C = c09530e4;
        this.A00 = onDismissListener;
        this.A04 = interfaceC145276gm;
        this.A07 = interfaceC57980PnQ;
        this.A09 = c145326gr;
        this.A0B = c145246gj;
        this.A0A = c145256gk;
        this.A05 = interfaceC146916jT;
        this.A06 = interfaceC57977PnN;
        this.A02 = interfaceC57975PnL;
        this.A03 = interfaceC57976PnM;
        this.A01 = interfaceC11380iw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-302782444);
        C55908Orz c55908Orz = this.A08;
        EnumC53247Ngl enumC53247Ngl = (EnumC53247Ngl) this.A0C.A00;
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        InterfaceC145276gm interfaceC145276gm = this.A04;
        InterfaceC57980PnQ interfaceC57980PnQ = this.A07;
        C145326gr c145326gr = this.A09;
        C145246gj c145246gj = this.A0B;
        C145256gk c145256gk = this.A0A;
        InterfaceC146916jT interfaceC146916jT = this.A05;
        InterfaceC57977PnN interfaceC57977PnN = this.A06;
        C55908Orz.A01(onDismissListener, this.A01, this.A02, this.A03, interfaceC145276gm, interfaceC146916jT, interfaceC57977PnN, interfaceC57980PnQ, enumC53247Ngl, c55908Orz, c145326gr, c145256gk, c145246gj);
        C0f9.A0C(-364112068, A05);
    }
}
