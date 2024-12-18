package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.MfW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50963MfW extends AbstractC52922bZ {
    public final C2GT A00;
    public final C2GT A01;
    public final C2GT A02;
    public final C2GT A03;
    public final C2GT A04;
    public final C2GT A05;
    public final LeadGenEntryPoint A06;
    public final UserSession A07;
    public final P4X A08;
    public final Long A09;
    public final String A0A;
    public final String A0B;
    public final InterfaceC24731Iq A0C;
    public final InterfaceC19390xP A0D;
    public final C05A A0E;
    public final C05A A0F;
    public final boolean A0G;
    public final User A0H;
    public final List A0I;
    public final C05A A0J;
    public final C05A A0K;
    public final C05A A0L;
    public final C05A A0M;

    public C50963MfW(C152406tQ c152406tQ, UserSession userSession, P4X p4x) {
        this.A07 = userSession;
        this.A08 = p4x;
        Object A00 = c152406tQ.A00("args_form_data");
        if (A00 != null) {
            List list = (List) A00;
            this.A0I = list;
            Object A002 = c152406tQ.A00("args_is_creation_flow");
            if (A002 != null) {
                this.A0G = AbstractC166987dD.A1a(A002);
                Object A003 = c152406tQ.A00("args_entry_point");
                if (A003 != null) {
                    String str = (String) A003;
                    this.A0A = str;
                    User A0Y = AbstractC166997dE.A0Y(userSession);
                    this.A0H = A0Y;
                    this.A09 = AbstractC37302Gc3.A0W(A0Y.A03.getFbidV2());
                    String Bb3 = A0Y.A03.Bb3();
                    this.A0B = Bb3 == null ? A0Y.getUsername() : Bb3;
                    this.A06 = EnumC53251Ngp.valueOf(AbstractC166997dE.A10(Locale.ROOT, str)).A01;
                    Integer num = C05F.A00;
                    C24721Ip A0q = MSX.A0q();
                    this.A0C = A0q;
                    this.A0D = AbstractC07080Za.A03(A0q);
                    C16930sl c16930sl = C16930sl.A00;
                    C008002u A004 = C10E.A00(c16930sl);
                    this.A0J = A004;
                    AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
                    this.A00 = AbstractC58232lf.A00(anonymousClass191, A004);
                    C008002u A005 = C10E.A00(c16930sl);
                    this.A0K = A005;
                    this.A01 = AbstractC58232lf.A00(anonymousClass191, A005);
                    C008002u A006 = C10E.A00(null);
                    this.A0M = A006;
                    this.A03 = AbstractC58232lf.A00(anonymousClass191, A006);
                    C008002u A007 = C10E.A00(null);
                    this.A0L = A007;
                    this.A02 = AbstractC58232lf.A00(anonymousClass191, A007);
                    C008002u A0y = MSZ.A0y();
                    this.A0E = A0y;
                    this.A04 = AbstractC58232lf.A00(anonymousClass191, A0y);
                    C008002u A008 = C10E.A00(null);
                    this.A0F = A008;
                    this.A05 = AbstractC58232lf.A00(anonymousClass191, A008);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AbstractC50523MSb.A1P(A1E, it);
                    }
                    this.A0J.Egh(A1E);
                    C05A c05a = this.A0K;
                    List list2 = this.A0I;
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        AbstractC50523MSb.A1O(A1E2, it2);
                    }
                    c05a.Egh(A1E2);
                    this.A0M.Egh(new C51633MrQ(C55205OeH.A01(""), this.A0H.Bhu(), null, num, this.A0H.getUsername(), c16930sl, AbstractC31177DnL.A03(this.A0H.A03.B7S()), A1E.size(), true));
                    this.A0L.Egh(new C51761Mtk((C5QE) null, (Integer) 2131964955, 1));
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
