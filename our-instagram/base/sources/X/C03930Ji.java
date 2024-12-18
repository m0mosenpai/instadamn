package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.0Ji, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03930Ji extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03930Ji(C211211o c211211o) {
        super(0);
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final boolean A07 = C20150ym.A07(AbstractC20100yh.A00(36328057456245840L));
        final C211211o c211211o = this.A00;
        final boolean A072 = C20150ym.A07(AbstractC20100yh.A00(36328057457228893L));
        final boolean A073 = C20150ym.A07(AbstractC20100yh.A00(36328057457163356L));
        return new AbstractC211911v(c211211o, A07, A072, A073) { // from class: X.123
            public final C211211o A00;
            public final boolean A01;
            public final boolean A02;
            public final boolean A03;

            @Override // X.AbstractC211911v
            public final String A06() {
                return "MainFeedRequestBuilder";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                if (this.A03) {
                    AbstractC12990ll A08 = ((AnonymousClass122) this.A00.A00()).A08();
                    if (A08 instanceof UserSession) {
                        if (this.A01 && !C08750cd.A04.A02()) {
                            return;
                        }
                        C1CH.A00((UserSession) A08).A06(this.A02);
                    }
                }
            }

            {
                this.A03 = A07;
                this.A00 = c211211o;
                this.A01 = A072;
                this.A02 = A073;
            }
        };
    }
}
