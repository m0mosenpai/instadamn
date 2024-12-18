package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GIr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36768GIr implements GZW {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C17C A03;
    public final /* synthetic */ C35199Ffr A04;
    public final /* synthetic */ C28261Yl A05;
    public final /* synthetic */ InterfaceC37187GZy A06;
    public final /* synthetic */ InterfaceC37219GaU A07;

    public C36768GIr(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, C17C c17c, C35199Ffr c35199Ffr, C28261Yl c28261Yl, InterfaceC37187GZy interfaceC37187GZy, InterfaceC37219GaU interfaceC37219GaU) {
        this.A05 = c28261Yl;
        this.A02 = userSession;
        this.A00 = fragment;
        this.A01 = fragmentActivity;
        this.A03 = c17c;
        this.A07 = interfaceC37219GaU;
        this.A04 = c35199Ffr;
        this.A06 = interfaceC37187GZy;
    }

    @Override // X.GZW
    public final void D6u(int i, boolean z) {
        C28261Yl c28261Yl = this.A05;
        UserSession userSession = this.A02;
        c28261Yl.A01(this.A00, this.A01, userSession, this.A03, this.A04, this.A06, this.A07, i);
    }

    @Override // X.GZW
    public final void onCancel() {
        InterfaceC37219GaU interfaceC37219GaU = this.A07;
        if (interfaceC37219GaU != null) {
            interfaceC37219GaU.onCancel();
        }
        UserSession userSession = this.A02;
        User user = (User) this.A03;
        C35263Fgx.A05(userSession, this.A04, user.getId(), !user.CYY());
    }
}
