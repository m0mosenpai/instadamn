package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fwu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36120Fwu implements InterfaceC42271xH {
    public final /* synthetic */ C105824pt A00;
    public final /* synthetic */ C145386gx A01;

    public C36120Fwu(C105824pt c105824pt, C145386gx c145386gx) {
        this.A00 = c105824pt;
        this.A01 = c145386gx;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        C56011Oti c56011Oti = (C56011Oti) obj;
        C14360o3.A0B(c56011Oti, 0);
        String str = this.A00.A0X;
        str.getClass();
        return str.equals(c56011Oti.A01);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        InterfaceC53742dD interfaceC53742dD;
        int A03 = C0f9.A03(2140861621);
        C56011Oti c56011Oti = (C56011Oti) obj;
        int A0N = AbstractC167017dG.A0N(c56011Oti, -711254728);
        if (c56011Oti.A00 == C05F.A00) {
            C145386gx c145386gx = this.A01;
            UserSession userSession = c145386gx.A01;
            InterfaceC08430c6 interfaceC08430c6 = null;
            if (userSession == null) {
                AbstractC31171DnF.A0y();
                throw C00O.createAndThrow();
            }
            AbstractC25651Mw.A00(userSession).A02(this, C56011Oti.class);
            c145386gx.A04.CqT();
            Fragment fragment = (Fragment) c145386gx.A05.get();
            if (fragment != null) {
                interfaceC08430c6 = fragment.mParentFragment;
            }
            if (!(interfaceC08430c6 instanceof InterfaceC53742dD) || (interfaceC53742dD = (InterfaceC53742dD) interfaceC08430c6) == null) {
                InterfaceC53722dB A00 = AbstractC54852fj.A00();
                C14360o3.A0C(A00, AbstractC111324zv.A00(128));
                interfaceC53742dD = (InterfaceC53742dD) A00;
            }
            interfaceC53742dD.EfJ(C1QO.A0C);
        }
        C0f9.A0A(-2336813, A0N);
        C0f9.A0A(2087497089, A03);
    }
}
