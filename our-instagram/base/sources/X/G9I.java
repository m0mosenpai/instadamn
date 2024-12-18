package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G9I implements C33I {
    public final /* synthetic */ C159737El A00;

    @Override // X.C33I
    public final boolean Dtk(C5SW c5sw) {
        return false;
    }

    @Override // X.C33I
    public final void Dto(C5SW c5sw) {
    }

    @Override // X.C33I
    public final void Dtq(C5SW c5sw) {
    }

    public G9I(C159737El c159737El) {
        this.A00 = c159737El;
    }

    @Override // X.C33I
    public final void Dtt(C5SW c5sw) {
        C159737El c159737El = this.A00;
        UserSession userSession = c159737El.A1Z;
        C2056398n A00 = AbstractC2056298m.A00(userSession);
        AbstractC167007dF.A1L(A00, A00.A0J, C2056398n.A0d, 27, true);
        if (c159737El.A0W != null) {
            C142846ck A002 = AbstractC147806l5.A00(userSession);
            int AdZ = c159737El.A0W.AdZ();
            String C7I = c159737El.A0W.C7I();
            String C7q = c159737El.A0W.C7q();
            C25531Mh A0I = AbstractC31172DnG.A0I(A002);
            if (AbstractC25226BEj.A1Z(A0I)) {
                AbstractC31175DnJ.A1B(A0I, A002);
                AbstractC31174DnI.A1K(A0I, "live_creation_option_rendered");
                A0I.A0o("go_live_tooltip");
                AbstractC31177DnL.A1H(A0I, A002, AbstractC31179DnN.A0a(A0I, "thread_view", C7I, C7q, AdZ));
            }
        }
    }
}
