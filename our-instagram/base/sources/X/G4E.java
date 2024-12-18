package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* loaded from: classes6.dex */
public final class G4E implements InterfaceC165347aN {
    public final UserSession A00;
    public final InterfaceC164877Za A01;
    public final InterfaceC09390do A02;
    public final Context A03;
    public final InterfaceC164927Zh A04;
    public final InterfaceC165187a7 A05;

    public G4E(Context context, UserSession userSession, InterfaceC164877Za interfaceC164877Za, InterfaceC164927Zh interfaceC164927Zh, InterfaceC165187a7 interfaceC165187a7, InterfaceC08830cm interfaceC08830cm) {
        AbstractC25233BEq.A0x(3, interfaceC08830cm, interfaceC164877Za, interfaceC164927Zh);
        C14360o3.A0B(interfaceC165187a7, 6);
        this.A03 = context;
        this.A00 = userSession;
        this.A01 = interfaceC164877Za;
        this.A04 = interfaceC164927Zh;
        this.A05 = interfaceC165187a7;
        this.A02 = C1XM.A00(new MHH(interfaceC08830cm, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC165347aN
    public final void EkI(C2EY c2ey, MessageIdentifier messageIdentifier, String str, long j, boolean z) {
        int i;
        List A1E;
        GXV gxv;
        if (this.A05.Cog() && z) {
            Context context = this.A03;
            if (context instanceof Activity) {
                i = ((int) (((Activity) context).getWindow().getDecorView().getHeight() * 0.65f)) - C30D.A00;
            } else {
                i = -2;
            }
            UserSession userSession = this.A00;
            InterfaceC09390do interfaceC09390do = this.A02;
            int i2 = AbstractC31174DnI.A0V((C7U0) interfaceC09390do.getValue()).A08;
            String A15 = AbstractC31172DnG.A15(((C7U0) interfaceC09390do.getValue()).C7r().B90());
            String C7q = ((C7U0) interfaceC09390do.getValue()).C7r().C7q();
            int AdZ = ((C7U0) interfaceC09390do.getValue()).C7r().AdZ();
            C81543kP Bj4 = ((C7U0) interfaceC09390do.getValue()).C7r().Bj4();
            if (Bj4 == null || (A1E = Bj4.A09) == null) {
                A1E = AbstractC166987dD.A1E();
            }
            KDS A00 = AbstractC46899Kog.A00(userSession, A15, C7q, A1E, i, 0, i2, AdZ, true, false);
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            A0y.A0T = new C49615Lw8(A00, 5);
            C189478aR A002 = A0y.A00();
            A00.A01 = new C36438G5n(this, A002, c2ey, messageIdentifier, str, j);
            C3DN c3dn = null;
            if ((context instanceof GXV) && (gxv = (GXV) context) != null) {
                c3dn = gxv.Ahc();
            }
            C189478aR.A00(context, context, A00, A002, c3dn);
        }
    }

    @Override // X.InterfaceC165347aN
    public final void F81(MessageIdentifier messageIdentifier, boolean z) {
        if (this.A05.Cog() && z) {
            ((C7U0) this.A02.getValue()).BT6().DtY(messageIdentifier);
            if (C18U.A06(C06090Tz.A05, this.A00, 36320232024907926L)) {
                this.A04.EMK(messageIdentifier.A01);
            }
        }
    }
}
