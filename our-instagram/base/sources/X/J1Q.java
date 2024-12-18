package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class J1Q implements InterfaceC147206jw {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C38X A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC147206jw
    public final void DZe() {
    }

    @Override // X.InterfaceC147206jw
    public final void DZf() {
    }

    public J1Q(C38321qM c38321qM, C38X c38x, String str) {
        this.A01 = c38x;
        this.A02 = str;
        this.A00 = c38321qM;
    }

    @Override // X.InterfaceC147206jw
    public final void onClick() {
        C38X c38x = this.A01;
        UserSession userSession = c38x.A02;
        FragmentActivity fragmentActivity = c38x.A01;
        InterfaceC60442pS interfaceC60442pS = c38x.A03;
        String moduleName = interfaceC60442pS.getModuleName();
        String str = this.A02;
        String A00 = AbstractC111324zv.A00(5193);
        C35265Fh0.A05(fragmentActivity, userSession, moduleName, str, A00, false);
        C38321qM c38321qM = this.A00;
        if (c38321qM != null) {
            AbstractC151386rg.A00(interfaceC60442pS, userSession, c38321qM, A00, AbstractC37303Gc4.A0T(userSession, c38321qM), AbstractC14490oL.A0A(fragmentActivity));
        }
    }
}
