package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;

/* renamed from: X.Mg3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50996Mg3 extends AbstractC52922bZ {
    public final UserSession A00;
    public final O87 A01;
    public final String A02;
    public final C05A A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50996Mg3(UserSession userSession, O87 o87, LeadGenProfileContentInfo leadGenProfileContentInfo, String str) {
        this();
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = o87;
        this.A02 = str;
        this.A03.Egh(leadGenProfileContentInfo);
    }

    public C50996Mg3() {
        this.A03 = AbstractC25227BEk.A0z();
    }
}
