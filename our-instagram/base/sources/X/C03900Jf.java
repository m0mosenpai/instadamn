package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.0Jf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03900Jf extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03900Jf(C211211o c211211o) {
        super(0);
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(c211211o) { // from class: X.124
            public final C211211o A00;

            @Override // X.AbstractC211911v
            public final String A06() {
                return "EagerReelRequestBuilder";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                UserSession userSession;
                AbstractC12990ll A08 = ((AnonymousClass122) this.A00.A00()).A08();
                if ((A08 instanceof UserSession) && (userSession = (UserSession) A08) != null && C20150ym.A07(AbstractC20100yh.A00(36328057457949797L))) {
                    C1LB.A00(userSession).A05(userSession, false);
                }
            }

            {
                this.A00 = c211211o;
            }
        };
    }
}
