package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PH1 implements InterfaceC57997Pnh {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C81J A01;

    public PH1(View view, C81J c81j) {
        this.A01 = c81j;
        this.A00 = view;
    }

    @Override // X.InterfaceC57997Pnh
    public final void Dd6(C54845OMq c54845OMq) {
        C14360o3.A0B(c54845OMq, 0);
        C81J c81j = this.A01;
        UserSession userSession = c81j.A0S;
        C14360o3.A07(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        c54845OMq.A0B.ETj(AbstractC25225BEi.A07(c06090Tz, userSession, 36597695505894295L));
        UserSession userSession2 = c81j.A0S;
        C14360o3.A07(userSession2);
        c54845OMq.A0B.EgW(C18U.A06(c06090Tz, userSession2, 36316220528922785L));
        C37101o8 A00 = AbstractC195888lY.A00();
        C14360o3.A07(c81j.A0S);
        InterfaceC58127Ppq interfaceC58127Ppq = A00.A01;
        if (interfaceC58127Ppq != null) {
            AbstractC55198Oe5 Bpt = interfaceC58127Ppq.Bpt();
            c54845OMq.A09 = Bpt;
            c54845OMq.A0B.EU7(Bpt);
        }
        C37101o8 A002 = AbstractC195888lY.A00();
        C14360o3.A07(c81j.A0S);
        InterfaceC58079Pp4 interfaceC58079Pp4 = A002.A02;
        if (interfaceC58079Pp4 != null) {
            InterfaceC58137Pq2 Bpu = interfaceC58079Pp4.Bpu();
            c54845OMq.A0A = Bpu;
            c54845OMq.A0B.Eaf(Bpu);
        }
        C37101o8 A003 = AbstractC195888lY.A00();
        C14360o3.A07(c81j.A0S);
        InterfaceC58078Pp3 interfaceC58078Pp3 = A003.A00;
        if (interfaceC58078Pp3 != null) {
            InterfaceC58164PqU Bps = interfaceC58078Pp3.Bps();
            c54845OMq.A08 = Bps;
            c54845OMq.A0B.ES8(Bps);
        }
        C19700xy c19700xy = C17280tP.A4E;
        if (c19700xy.A00().A0f()) {
            InterfaceC58187Pqt interfaceC58187Pqt = AbstractC195888lY.A00().A03;
            if (interfaceC58187Pqt != null) {
                UserSession userSession3 = c81j.A0S;
                C14360o3.A07(userSession3);
                InterfaceC57802PkU Csa = interfaceC58187Pqt.Csa(this.A00, userSession3, R.id.sup_camera_capture_debug_stub);
                c54845OMq.A07 = Csa;
                InterfaceC58276PsU interfaceC58276PsU = c54845OMq.A0B;
                interfaceC58276PsU.F9t();
                interfaceC58276PsU.Eem(Csa);
                C17280tP A004 = c19700xy.A00();
                c54845OMq.A0B.ARp(AbstractC167017dG.A1b(A004, A004.A1t, C17280tP.A4G, 227));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
