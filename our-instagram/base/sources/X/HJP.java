package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HJP extends AbstractRunnableC14200nk {
    public final /* synthetic */ InterfaceC1116050z A00;
    public final /* synthetic */ AnonymousClass505 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HJP(InterfaceC1116050z interfaceC1116050z, AnonymousClass505 anonymousClass505) {
        super(1036460894, 3, false, false);
        this.A01 = anonymousClass505;
        this.A00 = interfaceC1116050z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String A00;
        InterfaceC25601Mq c128235qs;
        C1ON c1on;
        InterfaceC23761Ei A0B;
        C1EN c1en = C1EN.A0G;
        String A002 = C1EP.A00();
        AnonymousClass505 anonymousClass505 = this.A01;
        UserSession userSession = anonymousClass505.A01;
        C1EU c1eu = new C1EU(null, null, c1en, C1ER.A00(userSession, c1en, null, null, false), null, A002, null, null, null, AbstractC167017dG.A0j(), null, AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), C1EU.A0G.incrementAndGet(), false, false);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36314085927160214L)) {
            A00 = AnonymousClass001.A0O("pando-parser-", AbstractC25225BEi.A07(c06090Tz, userSession, 36595560903936181L));
        } else {
            A00 = MSV.A00(1254);
        }
        if (C18U.A06(c06090Tz, userSession, 36314085927291287L)) {
            C23711Eb c23711Eb = new C23711Eb(userSession, 1957781489, 1, false);
            c23711Eb.A05();
            c23711Eb.A0B("feed/timeline/");
            if (C18U.A06(c06090Tz, userSession, 36314085927160214L)) {
                int A07 = AbstractC25225BEi.A07(c06090Tz, userSession, 36595560903936181L);
                A0B = new C42218In4(anonymousClass505.A02, J75.A00, A07);
            } else {
                A0B = AbstractC37303Gc4.A0B(userSession, C23741Eg.class, true, false);
            }
            c23711Eb.A01 = A0B;
            c23711Eb.A04 = AnonymousClass001.A0g("streaming-", A00, ": feed/timeline/");
            Context context = anonymousClass505.A00;
            AbstractC23771Ej.A02(AbstractC166987dD.A0O(context), c23711Eb, userSession, c1eu, new C1CM(AbstractC166987dD.A0O(context)));
            C24531Hw A0N = c23711Eb.A0N();
            A0N.A02(new C48264LXn(this.A00, 1));
            c1on = A0N;
        } else {
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("feed/timeline/");
            if (C18U.A06(c06090Tz, userSession, 36314085927160214L)) {
                int A072 = AbstractC25225BEi.A07(c06090Tz, userSession, 36595560903936181L);
                J74 j74 = J74.A00;
                JHF createApiFrameworkParser = anonymousClass505.A02.createApiFrameworkParser(false);
                C14360o3.A07(createApiFrameworkParser);
                c128235qs = new C42350IpC(createApiFrameworkParser, j74, A072);
            } else {
                c128235qs = new C128235qs(new C07510aQ(userSession), C1EY.A01, -20);
            }
            A0c.A0Q(c128235qs);
            A0c.A03 = AnonymousClass001.A0R(A00, ": feed/timeline/");
            Context context2 = anonymousClass505.A00;
            AbstractC23771Ej.A02(AbstractC166987dD.A0O(context2), A0c, userSession, c1eu, new C1CM(AbstractC166987dD.A0O(context2)));
            C1ON A0N2 = A0c.A0N();
            C39030HGg.A00(A0N2, this.A00, 11);
            c1on = A0N2;
        }
        C1GJ.A03(c1on);
    }
}
