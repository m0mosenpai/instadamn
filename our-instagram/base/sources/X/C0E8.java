package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.0E8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0E8 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E8(C211211o c211211o) {
        super(0);
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final C211211o c211211o = this.A00;
        final boolean A07 = C20150ym.A07(AbstractC20100yh.A00(36322980803980071L));
        return new AbstractC211911v(c211211o, A07) { // from class: X.12F
            public final C211211o A00;
            public final boolean A01;

            @Override // X.AbstractC211911v
            public final String A06() {
                return "NotificationBadgingInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                if (this.A01) {
                    AbstractC12990ll A08 = ((AnonymousClass122) this.A00.A00()).A08();
                    if ((A08 instanceof UserSession) && C08750cd.A04.A02()) {
                        AbstractC54332en.A00((UserSession) A08).A03();
                    }
                }
            }

            {
                this.A00 = c211211o;
                this.A01 = A07;
            }
        };
    }
}
