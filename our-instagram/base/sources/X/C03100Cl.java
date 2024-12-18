package X;

/* renamed from: X.0Cl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03100Cl extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03100Cl(C211211o c211211o) {
        super(0);
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(c211211o) { // from class: X.13X
            public final C211211o A00;
            public final boolean A01 = true;

            {
                this.A00 = c211211o;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "QplXplatDelayedInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                if (this.A01) {
                    ((C12H) this.A00.A00()).A08();
                }
            }
        };
    }
}
