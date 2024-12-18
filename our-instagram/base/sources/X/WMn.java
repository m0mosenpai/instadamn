package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WMn implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C75113Zb A03;
    public final /* synthetic */ C189478aR A04;
    public final /* synthetic */ WFV A05;
    public final /* synthetic */ String A06;

    public WMn(C38321qM c38321qM, C75113Zb c75113Zb, C189478aR c189478aR, WFV wfv, String str, int i, int i2) {
        this.A05 = wfv;
        this.A04 = c189478aR;
        this.A02 = c38321qM;
        this.A03 = c75113Zb;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-586280519);
        WFV wfv = this.A05;
        C189478aR c189478aR = this.A04;
        WFV.A01(this.A02, this.A03, c189478aR, wfv, this.A06, this.A00, this.A01, true);
        C0f9.A0C(-337986151, A05);
    }
}
