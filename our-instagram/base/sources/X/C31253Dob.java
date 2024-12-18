package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dob, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31253Dob implements InterfaceC37216GaR {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final java.util.Set A02;
    public final UserSession A03;
    public final C63702ur A04;

    @Override // X.InterfaceC37216GaR
    public Integer AvK(String str) {
        return null;
    }

    @Override // X.InterfaceC37216GaR
    public void DAw(C47P c47p, String str, int i) {
        C14360o3.A0B(c47p, 0);
        C1GJ.A03(FY5.A01(this.A03, AbstractC31173DnH.A0p(c47p), c47p.CEI(), c47p.getAlgorithm()));
        if (str == null) {
            str = "fullscreen";
        }
        C6PG A00 = A00(this, c47p, str, i);
        String CEI = c47p.CEI();
        if (CEI != null) {
            A00.A07 = CEI;
        }
        A00.A0B = c47p.ByJ();
        A00.A0C = c47p.C9e();
        this.A04.A07(new C6PH(A00));
    }

    @Override // X.InterfaceC37216GaR
    public void DHq(C47P c47p, String str, int i) {
        C14360o3.A0B(c47p, 0);
        if (str == null) {
            str = "fullscreen";
        }
        C6PG A00 = A00(this, c47p, str, i);
        String CEI = c47p.CEI();
        if (CEI != null) {
            A00.A07 = CEI;
        }
        A00.A0B = c47p.ByJ();
        A00.A0C = c47p.C9e();
        C63702ur c63702ur = this.A04;
        A00.A0A = C63702ur.A00(c47p.CDj());
        c63702ur.A08(new C6PH(A00));
    }

    @Override // X.InterfaceC37216GaR
    public void Ddq(C34644FOb c34644FOb, String str, int i) {
    }

    @Override // X.InterfaceC37216GaR
    public void Dhu(C47P c47p, String str, int i) {
        C14360o3.A0B(c47p, 0);
        if (this.A02.add(AbstractC31173DnH.A0p(c47p))) {
            if (str == null) {
                str = "fullscreen";
            }
            C6PG c6pg = new C6PG(str, c47p.getId(), this.A01.getModuleName());
            c6pg.A00 = i;
            String CEI = c47p.CEI();
            if (CEI != null) {
                c6pg.A07 = CEI;
            }
            c6pg.A04 = c47p.getAlgorithm();
            c6pg.A0B = c47p.ByJ();
            c6pg.A0C = c47p.C9e();
            this.A04.A09(new C6PH(c6pg));
        }
    }

    @Override // X.InterfaceC37216GaR
    public void Dxe(C47P c47p, String str, int i) {
        C14360o3.A0B(c47p, 0);
        A01(c47p, str, i);
        UserSession userSession = this.A03;
        C31368DqX.A02(AbstractC31173DnH.A0P(this.A00, userSession), userSession, AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(userSession, AbstractC31173DnH.A0p(c47p), AbstractC111324zv.A00(2959), this.A01.getModuleName()));
    }

    public final void A01(C47P c47p, String str, int i) {
        if (str == null) {
            str = "fullscreen";
        }
        C6PG A00 = A00(this, c47p, str, i);
        String CEI = c47p.CEI();
        if (CEI != null) {
            A00.A07 = CEI;
        }
        A00.A0B = c47p.ByJ();
        A00.A0C = c47p.C9e();
        this.A04.A0B(new C6PH(A00));
    }

    public C31253Dob(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1R(userSession, interfaceC11380iw);
        this.A00 = fragmentActivity;
        this.A03 = userSession;
        this.A01 = interfaceC11380iw;
        this.A02 = AbstractC166987dD.A1H();
        this.A04 = new C63702ur(interfaceC11380iw, userSession);
    }

    public static C6PG A00(C31253Dob c31253Dob, C47P c47p, String str, int i) {
        C6PG c6pg = new C6PG(str, c47p.getId(), c31253Dob.A01.getModuleName());
        c6pg.A00 = i;
        c6pg.A04 = c47p.getAlgorithm();
        return c6pg;
    }
}
