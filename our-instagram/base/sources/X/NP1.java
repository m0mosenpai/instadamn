package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class NP1 extends AbstractC51031Mge {
    public final LeadGenEntryPoint A00;
    public final UserSession A01;
    public final P4X A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final User A08;
    public final String A09;
    public final List A0A;

    public NP1(C152406tQ c152406tQ, UserSession userSession, P4X p4x) {
        this.A01 = userSession;
        this.A02 = p4x;
        this.A09 = AbstractC50522MSa.A0h(c152406tQ, "args_welcome_message");
        Object A00 = c152406tQ.A00("args_form_data");
        if (A00 != null) {
            List list = (List) A00;
            this.A0A = list;
            Object A002 = c152406tQ.A00("args_is_creation_flow");
            if (A002 != null) {
                this.A06 = AbstractC166987dD.A1a(A002);
                Object A003 = c152406tQ.A00("args_entry_point");
                if (A003 != null) {
                    this.A04 = (String) A003;
                    User A01 = C17060sy.A01.A01(this.A01);
                    this.A08 = A01;
                    this.A03 = AbstractC37302Gc3.A0W(A01.A03.getFbidV2());
                    this.A07 = true;
                    String Bb3 = A01.A03.Bb3();
                    this.A05 = Bb3 == null ? A01.getUsername() : Bb3;
                    this.A00 = EnumC53251Ngp.valueOf(AbstractC166997dE.A10(Locale.ROOT, this.A04)).A01;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AbstractC50523MSb.A1P(A1E, it);
                    }
                    this.A0C.Egh(A1E);
                    C05A c05a = this.A0D;
                    List list2 = this.A0A;
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        AbstractC50523MSb.A1O(A1E2, it2);
                    }
                    c05a.Egh(A1E2);
                    String username = this.A08.getUsername();
                    this.A0G.Egh(new C51633MrQ(C55205OeH.A01(this.A09), this.A08.Bhu(), null, C05F.A00, username, C16930sl.A00, AbstractC31177DnL.A03(this.A08.A03.B7S()), A1E.size(), true));
                    this.A0E.Egh(new C51761Mtk((C5QE) null, (Integer) 2131964955, 1));
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
