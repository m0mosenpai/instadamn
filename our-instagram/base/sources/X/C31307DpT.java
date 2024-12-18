package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.DpT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31307DpT implements InterfaceC50487MQp {
    public final /* synthetic */ C31311DpX A00;

    @Override // X.InterfaceC50487MQp
    public final void Dja() {
    }

    public C31307DpT(C31311DpX c31311DpX) {
        this.A00 = c31311DpX;
    }

    @Override // X.InterfaceC50487MQp
    public final void DAq() {
        C31311DpX c31311DpX = this.A00;
        C31311DpX.A00(c31311DpX);
        C31310DpW c31310DpW = c31311DpX.A08;
        C2EC c2ec = c31311DpX.A02;
        c2ec.getClass();
        C31310DpW.A00(c31310DpW, c2ec, "dismiss");
    }

    @Override // X.InterfaceC50487MQp
    public final void Dar() {
        C31311DpX c31311DpX = this.A00;
        C31311DpX.A00(c31311DpX);
        C31310DpW c31310DpW = c31311DpX.A08;
        C2EC c2ec = c31311DpX.A02;
        c2ec.getClass();
        C31310DpW.A00(c31310DpW, c2ec, "learn_more_clicked");
        boolean CbK = c31311DpX.A02.CbK();
        C163947Vi c163947Vi = c31311DpX.A05;
        DirectThreadKey BKb = c31311DpX.A02.BKb();
        if (CbK) {
            c163947Vi.A01(EnumC33322EoH.RECIPIENT, BKb);
        } else {
            c163947Vi.A00(c31311DpX.A03, EnumC33322EoH.RECIPIENT, BKb);
        }
    }
}
