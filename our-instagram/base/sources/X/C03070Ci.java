package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.0Ci, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03070Ci extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03070Ci(C211211o c211211o) {
        super(0);
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(c211211o) { // from class: X.13d
            public final C211211o A00;

            @Override // X.AbstractC211911v
            public final String A06() {
                return "ReelsCacheInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                AbstractC12990ll A08 = ((AnonymousClass122) this.A00.A00()).A08();
                if (A08 instanceof UserSession) {
                    UserSession userSession = (UserSession) A08;
                    if (C18U.A06(C06090Tz.A06, AbstractC26331Po.A00(userSession).A00, 36331012392961137L)) {
                        C37327GcV.A00(userSession, EnumC37328GcW.A04);
                    }
                }
            }

            {
                this.A00 = c211211o;
            }
        };
    }
}
