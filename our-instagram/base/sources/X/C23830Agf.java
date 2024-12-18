package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Agf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23830Agf implements InterfaceC25207BDf {
    public final /* synthetic */ C26086BgF A00;
    public final /* synthetic */ C187198Rm A01;
    public final /* synthetic */ ACA A02;
    public final /* synthetic */ C211689Zc A03;
    public final /* synthetic */ A8X A04;
    public final /* synthetic */ boolean A05;

    @Override // X.InterfaceC25207BDf
    public final void DFi(Exception exc) {
    }

    @Override // X.InterfaceC25207BDf
    public final void onFinish() {
    }

    @Override // X.InterfaceC25207BDf
    public final void onStart() {
    }

    public C23830Agf(C26086BgF c26086BgF, C187198Rm c187198Rm, ACA aca, C211689Zc c211689Zc, A8X a8x, boolean z) {
        this.A01 = c187198Rm;
        this.A02 = aca;
        this.A05 = z;
        this.A03 = c211689Zc;
        this.A04 = a8x;
        this.A00 = c26086BgF;
    }

    @Override // X.InterfaceC25207BDf
    public final void DqC(String str) {
        ACA aca = this.A02;
        DirectShareTarget directShareTarget = aca.A00;
        directShareTarget.getClass();
        InterfaceC83713oG interfaceC83713oG = directShareTarget.A09;
        interfaceC83713oG.getClass();
        if ((interfaceC83713oG instanceof InterfaceC2056098k) && !this.A05) {
            C187198Rm c187198Rm = this.A01;
            Activity activity = c187198Rm.A0A;
            UserSession userSession = c187198Rm.A0G;
            C211689Zc c211689Zc = this.A03;
            c211689Zc.getClass();
            AKC akc = A49.A02;
            AKC.A01(activity, userSession, directShareTarget, c211689Zc, "MultiMediaEditController_sendMessageMsys", str);
            return;
        }
        if (this.A05) {
            return;
        }
        InterfaceC36951ns A00 = C36961nt.A00();
        C187198Rm c187198Rm2 = this.A01;
        A00.EOg(this.A00, c187198Rm2.A0G, c187198Rm2.A0X, aca, this.A03, this.A04, null, str);
    }
}
