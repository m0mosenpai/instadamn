package X;

/* renamed from: X.0Cp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03140Cp extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03140Cp(C211211o c211211o) {
        super(0);
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(c211211o) { // from class: X.14S
            public boolean A00;
            public final C211211o A01;

            @Override // X.AbstractC211911v
            public final String A06() {
                return "PushBlockingTestExecutor";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                C211211o c211211o2 = this.A01;
                if (C18U.A06(C06090Tz.A05, ((AnonymousClass122) c211211o2.A00()).A08(), 36313231228602195L) && !this.A00) {
                    this.A00 = true;
                    C25621Ms c25621Ms = new C25621Ms(((AnonymousClass122) c211211o2.A00()).A08(), -2);
                    c25621Ms.A0B("app_reliability/push_blocking/");
                    c25621Ms.A09(C05F.A0N);
                    c25621Ms.A0P(null, HAA.class, C41347IRs.class, false);
                    C1ON A0N = c25621Ms.A0N();
                    A0N.A00 = new C39000HFc();
                    C1GJ.A03(A0N);
                }
            }

            {
                this.A01 = c211211o;
            }
        };
    }
}
