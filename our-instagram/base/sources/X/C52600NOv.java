package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* renamed from: X.NOv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52600NOv extends AbstractC50903MeY {
    public final PromoteData A00;
    public final UserSession A01;
    public final String A02;

    public C52600NOv(P4U p4u, PromoteData promoteData) {
        super(new O3T(p4u));
        this.A00 = promoteData;
        UserSession userSession = promoteData.A0y;
        C14360o3.A06(userSession);
        this.A01 = userSession;
        this.A02 = AbstractC167007dF.A0h(LeadGenEntryPoint.A06.A00);
        String str = promoteData.A1N;
        super.A00 = str == null ? "" : str;
    }
}
