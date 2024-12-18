package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Mfd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50970Mfd extends AbstractC52922bZ {
    public boolean A00;
    public final C2GT A01;
    public final UserSession A02;
    public final InterfaceC06180Ui A03;
    public final InterfaceC15070pN A04;
    public final C05A A05;

    public C50970Mfd(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A05 = A0o;
        this.A01 = AbstractC31172DnG.A0E(A0o);
        AnonymousClass057 A0t = MSY.A0t();
        this.A03 = A0t;
        this.A04 = A0t;
    }

    public final void A00(String str) {
        String str2 = str;
        ArrayList A1E = AbstractC166987dD.A1E();
        C56121Ovg.A00(A1E, 2131954154, false);
        EnumC53261Ngz enumC53261Ngz = EnumC53261Ngz.A0B;
        ViewOnClickListenerC55467OkM viewOnClickListenerC55467OkM = new ViewOnClickListenerC55467OkM(this, 44);
        if (str == null) {
            str2 = "";
        }
        A1E.add(new C56110OvV(viewOnClickListenerC55467OkM, enumC53261Ngz, str2, false, false));
        A1E.add(new Ov7(C05F.A03, "feed"));
        C56121Ovg.A00(A1E, 2131954191, true);
        A1E.add(new C56110OvV(null, EnumC53261Ngz.A0G, "", this.A00, false));
        A1E.add(new Ov7(C05F.A1I, "feed"));
        if (this.A00) {
            A1E.add(new Ov7(C05F.A02, "feed"));
        }
        this.A05.Egh(A1E);
    }
}
