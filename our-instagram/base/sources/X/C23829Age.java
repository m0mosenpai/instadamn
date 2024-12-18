package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Age, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23829Age implements InterfaceC25207BDf {
    public final /* synthetic */ C26086BgF A00;
    public final /* synthetic */ C185948Mo A01;
    public final /* synthetic */ ACA A02;
    public final /* synthetic */ C211689Zc A03;
    public final /* synthetic */ A8X A04;

    @Override // X.InterfaceC25207BDf
    public final void onStart() {
    }

    public C23829Age(C26086BgF c26086BgF, C185948Mo c185948Mo, ACA aca, C211689Zc c211689Zc, A8X a8x) {
        this.A01 = c185948Mo;
        this.A02 = aca;
        this.A03 = c211689Zc;
        this.A04 = a8x;
        this.A00 = c26086BgF;
    }

    @Override // X.InterfaceC25207BDf
    public final void DFi(Exception exc) {
        C185948Mo.A0B(this.A01, 2131961880);
        AbstractC12120kG.A07(C185948Mo.__redex_internal_original_name, "sendVideoToMsys saveTask failed.", exc);
    }

    @Override // X.InterfaceC25207BDf
    public final void DqC(String str) {
        ACA aca = this.A02;
        DirectShareTarget directShareTarget = aca.A00;
        directShareTarget.getClass();
        InterfaceC83713oG interfaceC83713oG = directShareTarget.A09;
        interfaceC83713oG.getClass();
        boolean z = interfaceC83713oG instanceof InterfaceC2056098k;
        C185948Mo c185948Mo = this.A01;
        if (z) {
            Activity activity = c185948Mo.A0W;
            UserSession userSession = c185948Mo.A0c;
            C211689Zc c211689Zc = this.A03;
            AKC akc = A49.A02;
            AKC.A01(activity, userSession, directShareTarget, c211689Zc, "VideoViewController_sendVideoToMsys", str);
            return;
        }
        C8MV c8mv = c185948Mo.A0g;
        C211689Zc c211689Zc2 = this.A03;
        A8X a8x = this.A04;
        C26086BgF c26086BgF = this.A00;
        C14360o3.A0B(str, 1);
        C36961nt.A00().EOg(c26086BgF, c8mv.A02, new C23796Ag7(c185948Mo, c8mv, aca), aca, c211689Zc2, a8x, null, str);
    }

    @Override // X.InterfaceC25207BDf
    public final void onFinish() {
        C185948Mo c185948Mo = this.A01;
        if (C6PX.A01(c185948Mo.A0c)) {
            c185948Mo.onResume();
        }
    }
}
