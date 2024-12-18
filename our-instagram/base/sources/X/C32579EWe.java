package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.EWe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32579EWe extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C31845DzD(this.A00, this.A01, this.A02, this.A03, this.A04, this.A05);
    }

    public /* synthetic */ C32579EWe(UserSession userSession, String str, List list, boolean z, boolean z2) {
        List A0J = AbstractC009903n.A0J(EnumC33380EpD.values());
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
        this.A04 = z;
        this.A05 = z2;
        this.A02 = list;
        this.A03 = A0J;
    }
}
