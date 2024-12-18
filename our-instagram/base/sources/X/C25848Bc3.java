package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository;

/* renamed from: X.Bc3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25848Bc3 extends AbstractC52922bZ {
    public final CreatorAIFanNuxRepository A00;
    public final String A01;
    public final C05A A02;
    public final C0UO A03;
    public final C7Uo A04;

    public final void A00() {
        long j;
        String str = this.A01;
        C7Uo c7Uo = this.A04;
        String A0R = AnonymousClass001.A0R("last_time_ms_seen_creator_ai_nux/", str);
        InterfaceC19630xq interfaceC19630xq = c7Uo.A01;
        long j2 = interfaceC19630xq.getLong(A0R, 0L);
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        if (j2 == 0) {
            j = AwakeTimeSinceBootClock.INSTANCE.now();
        } else {
            j = -1;
        }
        ARD.E7G(A0R, j);
        ARD.apply();
        CreatorAIFanNuxRepository creatorAIFanNuxRepository = this.A00;
        if (creatorAIFanNuxRepository.A00 != 1) {
            creatorAIFanNuxRepository.A00 = 2;
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, false, "did_accept");
            C0CA.A00(A0T, "BETA_02_24", "terms_type");
            A0b.A00.A02().A0E(A0T, "data");
            D53.A03(AbstractC28916CpQ.A00(A0b, A0b2), creatorAIFanNuxRepository, ((C4A7) creatorAIFanNuxRepository).A01, 12);
        }
    }

    public C25848Bc3(CreatorAIFanNuxRepository creatorAIFanNuxRepository, C7Uo c7Uo, String str) {
        AbstractC167017dG.A1Q(creatorAIFanNuxRepository, str);
        this.A00 = creatorAIFanNuxRepository;
        this.A04 = c7Uo;
        this.A01 = str;
        C008002u A1H = AbstractC25225BEi.A1H(new MUG());
        this.A02 = A1H;
        this.A03 = A1H;
    }
}
