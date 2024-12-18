package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.P4a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56439P4a implements InterfaceC58153PqI {
    public final /* synthetic */ C52563NNj A00;
    public final /* synthetic */ OUJ A01;
    public final /* synthetic */ String A02;

    public C56439P4a(C52563NNj c52563NNj, OUJ ouj, String str) {
        this.A00 = c52563NNj;
        this.A02 = str;
        this.A01 = ouj;
    }

    @Override // X.InterfaceC58153PqI
    public final void DVA() {
        C52563NNj c52563NNj = this.A00;
        ((C50992Mfz) c52563NNj.A0A.getValue()).A01(((NOV) c52563NNj.A0B.getValue()).A07, false);
    }

    @Override // X.InterfaceC58153PqI
    public final void Dar() {
        C52563NNj c52563NNj = this.A00;
        C50992Mfz c50992Mfz = (C50992Mfz) c52563NNj.A0A.getValue();
        InterfaceC09390do interfaceC09390do = c52563NNj.A0B;
        c50992Mfz.A00(((NOV) interfaceC09390do.getValue()).A07, false);
        C55046OZv.A00.A01(AbstractC31172DnG.A04(c52563NNj), c52563NNj.requireArguments(), c52563NNj, ((NOV) interfaceC09390do.getValue()).A04, c52563NNj, this.A01, this.A02);
    }

    @Override // X.InterfaceC58153PqI
    public final void onDismiss() {
        C52563NNj c52563NNj = this.A00;
        UserSession userSession = ((NOV) c52563NNj.A0B.getValue()).A04;
        Activity A04 = AbstractC31172DnG.A04(c52563NNj);
        AbstractC167017dG.A1N(userSession, A04);
        C55772hI.A00(userSession).A09(A04, null);
        A04.finish();
    }

    @Override // X.InterfaceC58153PqI
    public final void onShow() {
        C52563NNj c52563NNj = this.A00;
        ((C50992Mfz) c52563NNj.A0A.getValue()).A02(((NOV) c52563NNj.A0B.getValue()).A07, false);
    }
}
