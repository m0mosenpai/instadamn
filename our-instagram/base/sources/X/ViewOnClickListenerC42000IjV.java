package X;

import android.view.View;

/* renamed from: X.IjV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42000IjV implements View.OnClickListener {
    public final /* synthetic */ C51761Mtk A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C41551w4 A02;
    public final /* synthetic */ InterfaceC144586fe A03;
    public final /* synthetic */ C6e7 A04;
    public final /* synthetic */ Integer A05;

    public ViewOnClickListenerC42000IjV(C51761Mtk c51761Mtk, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC144586fe interfaceC144586fe, C6e7 c6e7, Integer num) {
        this.A03 = interfaceC144586fe;
        this.A02 = c41551w4;
        this.A01 = c41181vS;
        this.A04 = c6e7;
        this.A00 = c51761Mtk;
        this.A05 = num;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(963731486);
        InterfaceC144586fe interfaceC144586fe = this.A03;
        C41551w4 c41551w4 = this.A02;
        C41181vS c41181vS = this.A01;
        View A01 = this.A04.A1U.A01();
        C14360o3.A07(A01);
        Object obj = this.A00.A00;
        Integer num = C05F.A0N;
        interfaceC144586fe.DlY(A01, c41181vS, c41551w4, AbstractC167007dF.A1X(obj, num), AbstractC167007dF.A1X(this.A05, num));
        C0f9.A0C(-882645716, A05);
    }
}
