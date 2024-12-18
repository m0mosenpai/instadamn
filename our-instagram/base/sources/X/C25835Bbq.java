package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.summary.BioSummaryRepository;

/* renamed from: X.Bbq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25835Bbq extends AbstractC52922bZ {
    public String A00;
    public final UserSession A01;
    public final BioSummaryRepository A02;
    public final C05A A03;
    public final C0UO A04;

    public C25835Bbq(UserSession userSession, BioSummaryRepository bioSummaryRepository) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = bioSummaryRepository;
        C008002u A1H = AbstractC25225BEi.A1H(new C26065Bft());
        this.A03 = A1H;
        this.A04 = AbstractC208910l.A02(A1H);
    }
}
