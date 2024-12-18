package com.instagram.barcelona.search.data;

import X.AbstractC166177bl;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C14360o3;
import X.C4A7;
import X.C4A8;
import X.C51746MtV;
import X.C92674Dc;
import X.C92694De;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes9.dex */
public final class SearchTopicsRepository extends C4A7 {
    public final Map A00;
    public final C92694De A01;
    public final UserSession A02;
    public final C05A A03;
    public final C0UO A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTopicsRepository(UserSession userSession) {
        super("barcelona_trending_topics_repository", C4A8.A00(1926455034));
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AbstractC166177bl.A00(C92674Dc.A00);
        C008002u A1H = AbstractC25225BEi.A1H(new C51746MtV());
        this.A03 = A1H;
        this.A04 = A1H;
        this.A00 = AbstractC166987dD.A1I();
    }
}
