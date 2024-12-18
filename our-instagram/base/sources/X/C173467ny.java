package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.7ny, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173467ny {
    public boolean A00;
    public final C05A A01;
    public final C0UO A02;
    public final UserSession A03;

    public static final void A00(final C173467ny c173467ny) {
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "LinkedBarcelonaProfileQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C173477nz.class, false, null, 0, null, "xcxp_fetch_linked_threads_profile", new ArrayList());
        pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0L);
        pandoGraphQLRequest.setFreshCacheAgeMs(0L);
        AbstractC40691uc.A01(c173467ny.A03).ATW(new InterfaceC48212Jk() { // from class: X.7o2
            @Override // X.InterfaceC48212Jk
            public final void invoke(Throwable th) {
                C173467ny.this.A00 = false;
            }
        }, new InterfaceC48192Ji() { // from class: X.7o1
            @Override // X.InterfaceC48192Ji
            public final void invoke(AnonymousClass436 anonymousClass436) {
                C173467ny c173467ny2 = C173467ny.this;
                C05A c05a = c173467ny2.A01;
                do {
                } while (!c05a.AIi(c05a.getValue(), anonymousClass436.Bos()));
                c173467ny2.A00 = true;
            }
        }, pandoGraphQLRequest, new ExecutorC14110nb(752149842));
    }

    public final void A01() {
        if (this.A01.getValue() == null) {
            A00(this);
        }
    }

    public C173467ny(UserSession userSession) {
        this.A03 = userSession;
        C008002u A00 = C10E.A00(null);
        this.A01 = A00;
        this.A02 = A00;
    }
}
