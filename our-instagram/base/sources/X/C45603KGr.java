package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.KGr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45603KGr extends AbstractC61132qb {
    public final UserSession A00;
    public final LJ4 A01;
    public final C45999KXn A02;
    public final Double A03;
    public final Double A04;
    public final List A05;

    public C45603KGr(UserSession userSession, LJ4 lj4, C45999KXn c45999KXn, Double d, Double d2, List list) {
        AbstractC25229BEm.A1I(userSession, 1, c45999KXn);
        this.A00 = userSession;
        this.A05 = list;
        this.A03 = d;
        this.A04 = d2;
        this.A01 = lj4;
        this.A02 = c45999KXn;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        List list = this.A05;
        if (list == null) {
            list = C16930sl.A00;
        }
        return new C45993KXh(userSession, AbstractC92954Eo.A00(userSession), this.A01, this.A02, this.A03, this.A04, list);
    }
}
