package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository;

/* renamed from: X.7Uk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163727Uk extends AbstractC52922bZ {
    public String A00;
    public java.util.Set A01;
    public final UserSession A02;
    public final CreatorAIFanNuxRepository A03;
    public final C150866ql A04;
    public final C7Uo A05;
    public final C05A A06;
    public final C0UO A07;

    public C163727Uk(UserSession userSession, CreatorAIFanNuxRepository creatorAIFanNuxRepository, C150866ql c150866ql, C7Uo c7Uo) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(creatorAIFanNuxRepository, 2);
        this.A02 = userSession;
        this.A03 = creatorAIFanNuxRepository;
        this.A05 = c7Uo;
        this.A04 = c150866ql;
        C008002u c008002u = new C008002u(new C7MT(null, C7MS.A02, false, null, false));
        this.A06 = c008002u;
        this.A07 = c008002u;
        this.A01 = C16910sj.A00;
    }

    public final void A00() {
        Object value;
        C7MT c7mt;
        C7MS c7ms;
        this.A01 = AnonymousClass090.A01(((C7MT) this.A07.getValue()).A01, this.A01);
        C05A c05a = this.A06;
        do {
            value = c05a.getValue();
            c7mt = (C7MT) value;
            c7ms = C7MS.A02;
        } while (!c05a.AIi(value, C7MT.A00(c7mt.A00, c7ms, c7mt.A02, c7mt.A03, c7mt.A04)));
    }
}
