package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.0CG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0CG extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CG(C211211o c211211o) {
        super(0);
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(c211211o) { // from class: X.13W
            public final C211211o A00;

            @Override // X.AbstractC211911v
            public final String A06() {
                return "SignalManagerEarlyInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                AbstractC12990ll A08 = ((AnonymousClass122) this.A00.A00()).A08();
                if (A08 instanceof UserSession) {
                    C25361Lq.A00((UserSession) A08);
                }
            }

            {
                this.A00 = c211211o;
            }
        };
    }
}
