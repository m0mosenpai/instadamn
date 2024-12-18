package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.0Ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03090Ck extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03090Ck(C211211o c211211o) {
        super(0);
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(c211211o) { // from class: X.14W
            public final C211211o A00;

            @Override // X.AbstractC211911v
            public final String A06() {
                return "QuietModeInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                AbstractC12990ll A08 = ((AnonymousClass122) this.A00.A00()).A08();
                if (A08 instanceof UserSession) {
                    C24231Gs.A00().A01((C50622Uh) A08.A01(C50622Uh.class, new C57511Pfl(A08, 24)));
                }
            }

            {
                this.A00 = c211211o;
            }
        };
    }
}
