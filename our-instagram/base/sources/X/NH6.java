package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NH6 extends AbstractC64162vb {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public NH6(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        super(C1BX.A03.A01(new C681034y(userSession, "ig_threads_in_stories_unit")));
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C41181vS c41181vS = (C41181vS) obj;
        C14360o3.A0B(c41181vS, 0);
        UserSession userSession = this.A02;
        AbstractC54889OPk.A01(this.A01, userSession, c41181vS, false);
        C105794pq c105794pq = c41181vS.A0D;
        String A00 = AbstractC111324zv.A00(43);
        C18C.A07(c105794pq, A00);
        boolean z = true;
        if (c105794pq != null) {
            String C96 = c105794pq.A00.C96();
            if (C96 == null) {
                C96 = "";
            }
            if (C96.length() != 0) {
                z = false;
            }
        }
        InterfaceC19630xq A0g = AbstractC31174DnI.A0g(C1AT.A01(userSession), C1AV.A3N, this);
        if (!z && !A0g.getBoolean("has_seen_threads_in_stories_toast", false)) {
            C18C.A07(c105794pq, A00);
            if (c105794pq != null) {
                String C962 = c105794pq.A00.C96();
                if (C962 == null) {
                    C962 = "";
                }
                C9GR.A03(this.A00, C962, null, 1);
                AbstractC31177DnL.A1N(A0g, "has_seen_threads_in_stories_toast", true);
            }
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C41181vS c41181vS = (C41181vS) obj;
        C14360o3.A0B(c41181vS, 0);
        AbstractC54889OPk.A01(this.A01, this.A02, c41181vS, true);
    }
}
