package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.0IW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0IW extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IW(C211211o c211211o) {
        super(0);
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(c211211o) { // from class: X.14n
            public final C211211o A00;

            @Override // X.AbstractC211911v
            public final String A06() {
                return "IgLinkifyInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                AbstractC12990ll A08 = ((AnonymousClass122) this.A00.A00()).A08();
                if ((A08 instanceof UserSession) && C18U.A06(C06090Tz.A05, A08, 36326266454292259L)) {
                    InterfaceC14020nS A00 = C14120nc.A00();
                    C14360o3.A07(A00);
                    A00.ATO(new AbstractRunnableC14200nk() { // from class: X.2ZN
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC90043zk.A00.set(AbstractC90053zl.A00);
                        }
                    });
                }
            }

            {
                this.A00 = c211211o;
            }
        };
    }
}
